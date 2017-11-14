package bean;

import java.util.List;

/**
 * description: $todo$
 * autour: BlueAmer
 * date: $date$ $time$
 * update: $date$
 * version: $version$
 */

public class DatarightBean {
    /**
     * code : 200
     * datas : {"class_list":[{"gc_id":"4","gc_name":"女装"},{"gc_id":"5","gc_name":"男装"},{"gc_id":"6","gc_name":"内衣"},{"gc_id":"7","gc_name":"运动"},{"gc_id":"8","gc_name":"女鞋"},{"gc_id":"9","gc_name":"男鞋"},{"gc_id":"10","gc_name":"配饰"},{"gc_id":"11","gc_name":"童装"}]}
     */

    private String code;
    private DatasBean datas;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
             * gc_id : 4
             * gc_name : 女装
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
