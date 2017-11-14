package bean;

import java.util.List;

/**
 * description: $todo$
 * autour: BlueAmer
 * date: $date$ $time$
 * update: $date$
 * version: $version$
 */

public class DateGridBean {
    /**
     * code : 200
     * datas : {"class_list":[{"gc_id":"12","gc_name":"T恤"},{"gc_id":"13","gc_name":"衬衫"},{"gc_id":"14","gc_name":"针织衫"},{"gc_id":"15","gc_name":"雪纺衫"},{"gc_id":"16","gc_name":"卫衣"},{"gc_id":"17","gc_name":"马甲"},{"gc_id":"18","gc_name":"连衣裙"},{"gc_id":"19","gc_name":"半身裙"},{"gc_id":"20","gc_name":"牛仔裤"},{"gc_id":"21","gc_name":"休闲裤"},{"gc_id":"22","gc_name":"打底裤"},{"gc_id":"23","gc_name":"正装裤"},{"gc_id":"24","gc_name":"西服"},{"gc_id":"25","gc_name":"短外套"},{"gc_id":"26","gc_name":"风衣"},{"gc_id":"27","gc_name":"大衣"},{"gc_id":"28","gc_name":"皮衣皮草"},{"gc_id":"29","gc_name":"棉服"},{"gc_id":"30","gc_name":"羽绒服"},{"gc_id":"31","gc_name":"孕妇装"},{"gc_id":"32","gc_name":"大码装"},{"gc_id":"33","gc_name":"中老年装"},{"gc_id":"34","gc_name":"婚纱礼服"},{"gc_id":"1053","gc_name":"女装"}]}
     */

    private int code;
    private DatasBean datas;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DatasBean getDatas() {
        return datas;
    }

    public void setDatas(DatasBean datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        private List<ClassListBean> class_list;

        public List<ClassListBean> getClass_list() {
            return class_list;
        }

        public void setClass_list(List<ClassListBean> class_list) {
            this.class_list = class_list;
        }

        public static class ClassListBean {
            /**
             * gc_id : 12
             * gc_name : T恤
             */

            private String gc_id;
            private String gc_name;

            public String getGc_id() {
                return gc_id;
            }

            public void setGc_id(String gc_id) {
                this.gc_id = gc_id;
            }

            public String getGc_name() {
                return gc_name;
            }

            public void setGc_name(String gc_name) {
                this.gc_name = gc_name;
            }
        }
    }
}
