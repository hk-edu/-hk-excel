package com.hk.service.impl;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.hk.entity.UserEntity;
import com.hk.mapper.UserMapper;
import com.hk.service.ExcelService;
import com.hk.util.base.BaseApiService;
import com.hk.util.base.BaseResponse;
import com.hk.util.constants.HttpConstant;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author pengzhengfa
 */
@Slf4j
@RestController
public class ExcelServiceImpl extends BaseApiService implements ExcelService {
    
    @Autowired
    private UserMapper userMapper;
    
    @Override
    public void exportExcel(HttpServletResponse response) {
        List<UserEntity> userEntities = userMapper.selectAllUserInfo();
        Workbook workbook = ExcelExportUtil
                .exportExcel(new ExportParams("用户列表信息", "用户信息"), UserEntity.class, userEntities);
        ServletOutputStream outputStream = null;
        try {
            response.setHeader("content-disposition", "attachment;fileName=" + URLEncoder.encode("用户列表.xls", "UTF-8"));
            outputStream = response.getOutputStream();
            workbook.write(outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    @Override
    public BaseResponse importExcel(MultipartFile excelFile) {
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);
        try {
            List<UserEntity> userList = ExcelImportUtil.importExcel(excelFile.getInputStream(), UserEntity.class, params);
            for (UserEntity userInfo : userList) {
                userInfo.setId(null);
                userMapper.insertUserInfo(userInfo);
            }
            return setResultSuccess(HttpConstant.HTTP_REQUEST_SUCCESS, "excel导入成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return setResultError(HttpConstant.HTTP_REQUEST_FAIL, "excel导入失败");
    }
}