package com.up.updao.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_goods_order", schema = "xxpaydb")
public class TGoodsOrderEntity {
    private String goodsOrderId;
    private String goodsId;
    private String goodsName;
    private long amount;
    private String userId;
    private byte status;
    private String payOrderId;
    private String channelId;
    private String channelUserId;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Id
    @Column(name = "GoodsOrderId", nullable = false, length = 30)
    public String getGoodsOrderId() {
        return goodsOrderId;
    }

    public void setGoodsOrderId(String goodsOrderId) {
        this.goodsOrderId = goodsOrderId;
    }

    @Basic
    @Column(name = "GoodsId", nullable = false, length = 30)
    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "GoodsName", nullable = false, length = 64)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "Amount", nullable = false)
    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "UserId", nullable = false, length = 30)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "Status", nullable = false)
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "PayOrderId", nullable = true, length = 30)
    public String getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId;
    }

    @Basic
    @Column(name = "ChannelId", nullable = true, length = 24)
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    @Basic
    @Column(name = "ChannelUserId", nullable = true, length = 64)
    public String getChannelUserId() {
        return channelUserId;
    }

    public void setChannelUserId(String channelUserId) {
        this.channelUserId = channelUserId;
    }

    @Basic
    @Column(name = "CreateTime", nullable = false)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "UpdateTime", nullable = false)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TGoodsOrderEntity that = (TGoodsOrderEntity) o;
        return amount == that.amount &&
                status == that.status &&
                Objects.equals(goodsOrderId, that.goodsOrderId) &&
                Objects.equals(goodsId, that.goodsId) &&
                Objects.equals(goodsName, that.goodsName) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(payOrderId, that.payOrderId) &&
                Objects.equals(channelId, that.channelId) &&
                Objects.equals(channelUserId, that.channelUserId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(goodsOrderId, goodsId, goodsName, amount, userId, status, payOrderId, channelId, channelUserId, createTime, updateTime);
    }
}
