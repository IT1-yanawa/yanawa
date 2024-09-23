package com.app.yanawa.repository.freewrite;

<<<<<<< HEAD

import com.app.yanawa.domain.freewrite.FreewriteVO;
import com.app.yanawa.mapper.freewrite.FreewriteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class FreewriteDAO {
    private final FreewriteMapper freewriteMapper;

    public void save(FreewriteVO freewriteVO) {freewriteMapper.insert(freewriteVO);}

=======
public class FreewriteDAO {
>>>>>>> a71cca4e631d4857e8c42a9c3d6e093fd9495d9b
}
