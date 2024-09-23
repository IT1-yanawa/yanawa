package com.app.yanawa.mapper.freewrite;

import com.app.yanawa.domain.freewrite.FreewriteVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FreewriteMapper {
    public void insert(FreewriteVO freewriteVO);

}
