package com.mp.service.impl;

import com.mp.entity.Book;
import com.mp.dao.BookMapper;
import com.mp.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图书表 服务实现类
 * </p>
 *
 * @author dctang
 * @since 2020-07-05
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
