package com.hk.service;

import com.hk.util.base.BaseResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

public interface ExcelService {
    
    /**
     * excel导出
     *
     * @param response
     */
    @RequestMapping("/exportExcel")
    public void exportExcel(HttpServletResponse response);
    
    /**
     * excel导入
     *
     * @param excelFile
     * @return
     */
    @PostMapping("/importExcel")
    BaseResponse importExcel(MultipartFile excelFile);
}
