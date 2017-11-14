package bean;

import java.util.List;

/**
 * description: $todo$
 * autour: BlueAmer
 * date: $date$ $time$
 * update: $date$
 * version: $version$
 */

public class Datebeanitem {
    /**
     * code : 200
     * datas : {"class_list":[{"gc_id":"90","gc_name":"平底鞋"},{"gc_id":"91","gc_name":"高跟鞋"},{"gc_id":"92","gc_name":"单鞋"},{"gc_id":"93","gc_name":"休闲鞋"},{"gc_id":"94","gc_name":"凉鞋"},{"gc_id":"95","gc_name":"女靴"},{"gc_id":"96","gc_name":"雪地靴"},{"gc_id":"97","gc_name":"拖鞋"},{"gc_id":"98","gc_name":"裸靴"},{"gc_id":"99","gc_name":"筒靴"},{"gc_id":"100","gc_name":"帆布鞋"},{"gc_id":"101","gc_name":"雨鞋／雨靴"},{"gc_id":"102","gc_name":"妈妈鞋"},{"gc_id":"103","gc_name":"鞋配件"},{"gc_id":"104","gc_name":"特色鞋"},{"gc_id":"105","gc_name":"鱼嘴鞋"},{"gc_id":"106","gc_name":"布鞋／绣花鞋"}]}
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
             * gc_id : 90
             * gc_name : 平底鞋
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
