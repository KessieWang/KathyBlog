package com.kathy.weblog.admin.service;


import com.kathy.weblog.admin.model.vo.tag.AddTagReqVO;
import com.kathy.weblog.admin.model.vo.tag.DeleteTagReqVO;
import com.kathy.weblog.admin.model.vo.tag.FindTagPageListReqVO;
import com.kathy.weblog.admin.model.vo.tag.SearchTagReqVO;
import com.kathy.weblog.common.utils.PageResponse;
import com.kathy.weblog.common.utils.Response;

public interface AdminTagService {

    /**
     * 添加标签集合
     * */
    Response addTags(AddTagReqVO addTagReqVO);

    /**
     * 查询标签分页
     * */
    PageResponse findTagPageList(FindTagPageListReqVO findTagPageListReqVO);

    /**
     * 删除标签
     * */
    Response deleteTag(DeleteTagReqVO deleteTagReqVO);

    /**
     * 根据标签关键词模糊查询
     * */
    Response searchTag(SearchTagReqVO searchTagReqVO);

    /**
     * 查询标签 Select 列表数据
     * @return
     */
    Response findTagSelectList();
}
