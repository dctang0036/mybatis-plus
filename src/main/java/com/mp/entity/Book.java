package com.mp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 图书表
 * </p>
 *
 * @author dctang
 * @since 2020-07-05 ddddd
 */
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图书ID
     */
    @TableId(value = "book_id", type = IdType.AUTO)
    private Long bookId;

    /**
     * 图书名称
     */
    private String name;

    /**
     * 图书数量
     */
    private Integer number;

    /**
     * 图书描述
     */
    private String detail;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Book{" +
            "bookId=" + bookId +
            ", name=" + name +
            ", number=" + number +
            ", detail=" + detail +
        "}";
    }
}
