package com.app.yanawa.service.freewrite;

import com.app.yanawa.domain.freewrite.FreewriteVO;
import com.app.yanawa.repository.freewrite.FreewriteDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FreewriteServiceImpl implements FreewriteService {
    private final FreewriteDAO freewriteDAO;
    @Override
    public void write(FreewriteVO freewriteVO) {freewriteDAO.save(freewriteVO);}
}
