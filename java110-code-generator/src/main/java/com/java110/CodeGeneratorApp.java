package com.java110;

import com.java110.code.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class CodeGeneratorApp
{
    public static void main( String[] args )
    {
        Data data = new Data();
        data.setId("floorId");
        data.setName("floor");
        data.setDesc("小区楼");
        data.setNewBusinessTypeCd("BUSINESS_TYPE_SAVE_FLOOR_INFO");
        data.setUpdateBusinessTypeCd("BUSINESS_TYPE_UPDATE_FLOOR_INFO");
        data.setDeleteBusinessTypeCd("BUSINESS_TYPE_DELETE_FLOOR_INFO");
        data.setBusinessTableName("business_floor");
        data.setTableName("f_floor");
        Map<String,String> param = new HashMap<String,String>();
        param.put("floorId","floor_id");
        param.put("bId","b_id");
        param.put("floorNum","floor_num");
        param.put("userId","user_id");
        param.put("statusCd","status_cd");
        param.put("userId","user_id");
        param.put("remark","remark");
        param.put("operate","operate");
        data.setParams(param);
        GeneratorSaveInfoListener  generatorSaveInfoListener = new GeneratorSaveInfoListener();
        generatorSaveInfoListener.generator(data);

        GeneratorAbstractBussiness generatorAbstractBussiness = new GeneratorAbstractBussiness();
        generatorAbstractBussiness.generator(data);

        GeneratorIServiceDaoListener generatorIServiceDaoListener = new GeneratorIServiceDaoListener();
        generatorIServiceDaoListener.generator(data);

        GeneratorServiceDaoImplListener generatorServiceDaoImplListener = new GeneratorServiceDaoImplListener();
        generatorServiceDaoImplListener.generator(data);

        GeneratorServiceDaoImplMapperListener generatorServiceDaoImplMapperListener = new GeneratorServiceDaoImplMapperListener();
        generatorServiceDaoImplMapperListener.generator(data);

        GeneratorUpdateInfoListener generatorUpdateInfoListener = new GeneratorUpdateInfoListener();
        generatorUpdateInfoListener.generator(data);

        GeneratorDeleteInfoListener generatorDeleteInfoListener = new GeneratorDeleteInfoListener();
        generatorDeleteInfoListener.generator(data);
    }
}
