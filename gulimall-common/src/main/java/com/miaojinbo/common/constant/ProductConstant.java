package com.miaojinbo.common.constant;

/**
 * @Auther miaojinbo
 * @Create 2022-07-30-12:34
 */
public class ProductConstant {

    public enum AttrEnum{
        ATTR_TYPE_BASE(1, "基本属性"),
        ATTR_TYPE_SALE(0, "销售属性");

        private int code;
        private String msg;

        AttrEnum(int code, String msg){
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
