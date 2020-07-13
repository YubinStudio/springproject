package com.yubin.springbootquickstart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Base64Utils;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @program: springproject
 * @description: 上传文件
 * @author: jyb
 * @create: 2019-11-20 09:35
 **/
@RestController
@RequestMapping("/uploads")
public class UploadFileController {
    private final Logger log = LoggerFactory.getLogger(UploadFileController.class);

    /**
     * 单文件上传
     *
     * @param file
     * @return
     * @throws IOException
     */
    @PostMapping("/upload1")
    @ResponseBody
    public Map<String, String> upload1(@RequestParam("file") MultipartFile file)
            throws IOException {
        log.info("[文件类型] - [{}]", file.getContentType());
        log.info("[文件名称] - [{}]", file.getOriginalFilename());
        log.info("[文件大小] - [{}]", file.getSize());
        file.transferTo(new File("H:/myIdea/Users/" + UUID.randomUUID() + file.getOriginalFilename()));
        System.out.println(file.getOriginalFilename());
        Map<String, String> result = new HashMap<>(16);
        result.put("contentType", file.getContentType());
        result.put("fileName", file.getOriginalFilename());
        result.put("fileSize", file.getSize() + "");
        return result;
    }

    /**
     * 多文件上传
     *
     * @param files
     * @return
     * @throws IOException
     */
    @PostMapping("/upload2")
    @ResponseBody
    public List<Map<String, String>> upload2(@RequestParam("files") MultipartFile[] files)
            throws IOException {
        if (files == null || files.length == 0) {
            return null;
        }
        List<Map<String, String>> results = new ArrayList<>();
        for (MultipartFile file : files) {
            // TODO Spring Mvc 提供的写入方式
            file.transferTo(new File("H:/myIdea/Users/" + file.getOriginalFilename()));
            Map<String, String> map = new HashMap<>(16);
            map.put("contentType", file.getContentType());
            map.put("fileName", file.getOriginalFilename());
            map.put("fileSize", file.getSize() + "");
            results.add(map);
        }
        return results;
    }

    @PostMapping("/upload3")
    @ResponseBody
    public void upload2(String base64) throws IOException {
        // TODO BASE64 方式的 格式和名字需要自己控制
        // （如 png 图片编码后前缀就会是 data:image/png;base64,）
        final File tempFile = new File("H:/myIdea/Users/test.jpg");
        // TODO 防止有的传了 data:image/png;base64, 有的没传的情况
        String[] d = base64.split("base64,");
        final byte[] bytes = Base64Utils.decodeFromString(d.length > 1 ? d[1] : d[0]);
        FileCopyUtils.copy(bytes, tempFile);
    }
}
