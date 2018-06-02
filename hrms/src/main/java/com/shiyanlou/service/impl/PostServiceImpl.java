package com.shiyanlou.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shiyanlou.dao.PostDao;
import com.shiyanlou.domain.Post;
import com.shiyanlou.service.PostService;
@Service("postService")
public class PostServiceImpl implements PostService {
	
	@Resource
	private PostDao postDao;
	
	@Override
	public List<Post> findPosts(Map<String, Object> map) {

		return postDao.findPosts(map);
	}

	@Override
	public Integer getCount(Map<String, Object> map) {
		
		return postDao.getCount(map);
	}

	@Override
	public Integer addPost(Post post) {
		
		return postDao.addPost(post);
	}

	@Override
	public Integer updatePost(Post post) {

		return postDao.updatePost(post);
	}

	@Override
	public Integer deletePost(Integer id) {

		return postDao.deletePost(id);
	}

	@Override
	public Post getPostById(Integer id) {

		return postDao.getPostById(id);
	}

}
