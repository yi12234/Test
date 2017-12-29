package com.test;

import java.util.List;

/**
 * @author : 繁华 .
 * @data : 2017/12/29,9:52;
 * @motto : 人生的烦恼，多在于知道的太多，而做的太少。
 * @explain :
 */
public class Bean1 {

    /**
     * data : [{"ID":"027D7AD9-412C-42DB-A045-0D77932E9D1F","RoutePlanID":"B8FC2B6B-8BD7-4CE2-9817-128200F25131","CityName":"宁津","CityCode":"0534","CityLevel":"1","CityRegionCode":"371422","IsChoice":null},{"ID":"92185E69-5E4E-4FE8-B8DC-10E935D6448B","RoutePlanID":"B8FC2B6B-8BD7-4CE2-9817-128200F25131","CityName":"齐河","CityCode":"0534","CityLevel":"1","CityRegionCode":"371425","IsChoice":null},{"ID":"D3F29061-EBE5-4BC3-80A3-3166E9337A2D","RoutePlanID":"B8FC2B6B-8BD7-4CE2-9817-128200F25131","CityName":"平原","CityCode":"0534","CityLevel":"1","CityRegionCode":"371426","IsChoice":null},{"ID":"81FB2E32-0A93-44E1-A006-FD185C76D598","RoutePlanID":"B8FC2B6B-8BD7-4CE2-9817-128200F25131","CityName":"夏津","CityCode":"0534","CityLevel":"1","CityRegionCode":"371427","IsChoice":null},{"ID":"C92697B7-8B9B-44F5-A238-B8C47704C751","RoutePlanID":"B8FC2B6B-8BD7-4CE2-9817-128200F25131","CityName":"乐陵市","CityCode":"0534","CityLevel":"1","CityRegionCode":"371427","IsChoice":null},{"ID":"2D30E2A5-0DC2-4668-9F46-AE5A8001AAF0","RoutePlanID":"B8FC2B6B-8BD7-4CE2-9817-128200F25131","CityName":"禹城","CityCode":"0534","CityLevel":"1","CityRegionCode":"371482","IsChoice":null}]
     * errcode :
     * errmsg :
     * state : 1
     */

    private String errcode;
    private String errmsg;
    private String state;
    private List<DataBean> data;

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * ID : 027D7AD9-412C-42DB-A045-0D77932E9D1F
         * RoutePlanID : B8FC2B6B-8BD7-4CE2-9817-128200F25131
         * CityName : 宁津
         * CityCode : 0534
         * CityLevel : 1
         * CityRegionCode : 371422
         * IsChoice : null
         */

        private String ID;
        private String RoutePlanID;
        private String CityName;
        private String CityCode;
        private String CityLevel;
        private String CityRegionCode;
        private Object IsChoice;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getRoutePlanID() {
            return RoutePlanID;
        }

        public void setRoutePlanID(String RoutePlanID) {
            this.RoutePlanID = RoutePlanID;
        }

        public String getCityName() {
            return CityName;
        }

        public void setCityName(String CityName) {
            this.CityName = CityName;
        }

        public String getCityCode() {
            return CityCode;
        }

        public void setCityCode(String CityCode) {
            this.CityCode = CityCode;
        }

        public String getCityLevel() {
            return CityLevel;
        }

        public void setCityLevel(String CityLevel) {
            this.CityLevel = CityLevel;
        }

        public String getCityRegionCode() {
            return CityRegionCode;
        }

        public void setCityRegionCode(String CityRegionCode) {
            this.CityRegionCode = CityRegionCode;
        }

        public Object getIsChoice() {
            return IsChoice;
        }

        public void setIsChoice(Object IsChoice) {
            this.IsChoice = IsChoice;
        }
    }
}
