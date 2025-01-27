package com.kathy.weblog.web.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.kathy.weblog.common.domain.dos.TagDO;
import com.kathy.weblog.common.utils.Response;
import com.kathy.weblog.web.model.vo.tag.FindTagArticlePageListReqVO;

import java.util.List;

public interface TagService {
    /**
     * 获取标签列表
     * @return
     */
    Response findTagList();

    /**
     * 获取标签下文章分页列表
     * @param findTagArticlePageListReqVO
     * @return
     */
    Response findTagPageList(FindTagArticlePageListReqVO findTagArticlePageListReqVO);

}
