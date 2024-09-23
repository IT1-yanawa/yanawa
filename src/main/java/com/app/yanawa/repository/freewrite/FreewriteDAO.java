package com.app.yanawa.repository.freewrite;


import com.app.yanawa.domain.freewrite.FreewriteVO;
import com.app.yanawa.mapper.freewrite.FreewriteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class FreewriteDAO {
    private final FreewriteMapper freewriteMapper;

    public void save(FreewriteVO freewriteVO) {freewriteMapper.insert(freewriteVO);}

}
