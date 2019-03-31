package com.dreamfield.dreamapi.model.dream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author shangwei
*/
public class District implements Serializable {

    private static final long serialVersionUID = 1554012147538L;


    /**
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:1
    */
    private String name;

    /**
    * 
    * isNullAble:1
    */
    private Integer parentId;

    /**
    * 
    * isNullAble:1
    */
    private String initial;

    /**
    * 
    * isNullAble:1
    */
    private String initials;

    /**
    * 
    * isNullAble:1
    */
    private String pinyin;

    /**
    * 
    * isNullAble:1
    */
    private String extra;

    /**
    * 
    * isNullAble:1
    */
    private String suffix;

    /**
    * 
    * isNullAble:1
    */
    private String code;

    /**
    * 
    * isNullAble:1
    */
    private String areaCode;

    /**
    * 
    * isNullAble:1
    */
    private Integer order;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setParentId(Integer parentId){this.parentId = parentId;}

    public Integer getParentId(){return this.parentId;}

    public void setInitial(String initial){this.initial = initial;}

    public String getInitial(){return this.initial;}

    public void setInitials(String initials){this.initials = initials;}

    public String getInitials(){return this.initials;}

    public void setPinyin(String pinyin){this.pinyin = pinyin;}

    public String getPinyin(){return this.pinyin;}

    public void setExtra(String extra){this.extra = extra;}

    public String getExtra(){return this.extra;}

    public void setSuffix(String suffix){this.suffix = suffix;}

    public String getSuffix(){return this.suffix;}

    public void setCode(String code){this.code = code;}

    public String getCode(){return this.code;}

    public void setAreaCode(String areaCode){this.areaCode = areaCode;}

    public String getAreaCode(){return this.areaCode;}

    public void setOrder(Integer order){this.order = order;}

    public Integer getOrder(){return this.order;}
    @Override
    public String toString() {
        return "District{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "parentId='" + parentId + '\'' +
                "initial='" + initial + '\'' +
                "initials='" + initials + '\'' +
                "pinyin='" + pinyin + '\'' +
                "extra='" + extra + '\'' +
                "suffix='" + suffix + '\'' +
                "code='" + code + '\'' +
                "areaCode='" + areaCode + '\'' +
                "order='" + order + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private District set;

        private ConditionBuilder where;

        public UpdateBuilder set(District set){
            this.set = set;
            return this;
        }

        public District getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends District{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> parentIdList;

        public List<Integer> getParentIdList(){return this.parentIdList;}

        private Integer parentIdSt;

        private Integer parentIdEd;

        public Integer getParentIdSt(){return this.parentIdSt;}

        public Integer getParentIdEd(){return this.parentIdEd;}

        private List<String> initialList;

        public List<String> getInitialList(){return this.initialList;}


        private List<String> fuzzyInitial;

        public List<String> getFuzzyInitial(){return this.fuzzyInitial;}

        private List<String> rightFuzzyInitial;

        public List<String> getRightFuzzyInitial(){return this.rightFuzzyInitial;}
        private List<String> initialsList;

        public List<String> getInitialsList(){return this.initialsList;}


        private List<String> fuzzyInitials;

        public List<String> getFuzzyInitials(){return this.fuzzyInitials;}

        private List<String> rightFuzzyInitials;

        public List<String> getRightFuzzyInitials(){return this.rightFuzzyInitials;}
        private List<String> pinyinList;

        public List<String> getPinyinList(){return this.pinyinList;}


        private List<String> fuzzyPinyin;

        public List<String> getFuzzyPinyin(){return this.fuzzyPinyin;}

        private List<String> rightFuzzyPinyin;

        public List<String> getRightFuzzyPinyin(){return this.rightFuzzyPinyin;}
        private List<String> extraList;

        public List<String> getExtraList(){return this.extraList;}


        private List<String> fuzzyExtra;

        public List<String> getFuzzyExtra(){return this.fuzzyExtra;}

        private List<String> rightFuzzyExtra;

        public List<String> getRightFuzzyExtra(){return this.rightFuzzyExtra;}
        private List<String> suffixList;

        public List<String> getSuffixList(){return this.suffixList;}


        private List<String> fuzzySuffix;

        public List<String> getFuzzySuffix(){return this.fuzzySuffix;}

        private List<String> rightFuzzySuffix;

        public List<String> getRightFuzzySuffix(){return this.rightFuzzySuffix;}
        private List<String> codeList;

        public List<String> getCodeList(){return this.codeList;}


        private List<String> fuzzyCode;

        public List<String> getFuzzyCode(){return this.fuzzyCode;}

        private List<String> rightFuzzyCode;

        public List<String> getRightFuzzyCode(){return this.rightFuzzyCode;}
        private List<String> areaCodeList;

        public List<String> getAreaCodeList(){return this.areaCodeList;}


        private List<String> fuzzyAreaCode;

        public List<String> getFuzzyAreaCode(){return this.fuzzyAreaCode;}

        private List<String> rightFuzzyAreaCode;

        public List<String> getRightFuzzyAreaCode(){return this.rightFuzzyAreaCode;}
        private List<Integer> orderList;

        public List<Integer> getOrderList(){return this.orderList;}

        private Integer orderSt;

        private Integer orderEd;

        public Integer getOrderSt(){return this.orderSt;}

        public Integer getOrderEd(){return this.orderEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder parentIdBetWeen(Integer parentIdSt,Integer parentIdEd){
            this.parentIdSt = parentIdSt;
            this.parentIdEd = parentIdEd;
            return this;
        }

        public QueryBuilder parentIdGreaterEqThan(Integer parentIdSt){
            this.parentIdSt = parentIdSt;
            return this;
        }
        public QueryBuilder parentIdLessEqThan(Integer parentIdEd){
            this.parentIdEd = parentIdEd;
            return this;
        }


        public QueryBuilder parentId(Integer parentId){
            setParentId(parentId);
            return this;
        }

        public QueryBuilder parentIdList(Integer ... parentId){
            this.parentIdList = solveNullList(parentId);
            return this;
        }

        public QueryBuilder parentIdList(List<Integer> parentId){
            this.parentIdList = parentId;
            return this;
        }

        public QueryBuilder fetchParentId(){
            setFetchFields("fetchFields","parentId");
            return this;
        }

        public QueryBuilder excludeParentId(){
            setFetchFields("excludeFields","parentId");
            return this;
        }

        public QueryBuilder fuzzyInitial (List<String> fuzzyInitial){
            this.fuzzyInitial = fuzzyInitial;
            return this;
        }

        public QueryBuilder fuzzyInitial (String ... fuzzyInitial){
            this.fuzzyInitial = solveNullList(fuzzyInitial);
            return this;
        }

        public QueryBuilder rightFuzzyInitial (List<String> rightFuzzyInitial){
            this.rightFuzzyInitial = rightFuzzyInitial;
            return this;
        }

        public QueryBuilder rightFuzzyInitial (String ... rightFuzzyInitial){
            this.rightFuzzyInitial = solveNullList(rightFuzzyInitial);
            return this;
        }

        public QueryBuilder initial(String initial){
            setInitial(initial);
            return this;
        }

        public QueryBuilder initialList(String ... initial){
            this.initialList = solveNullList(initial);
            return this;
        }

        public QueryBuilder initialList(List<String> initial){
            this.initialList = initial;
            return this;
        }

        public QueryBuilder fetchInitial(){
            setFetchFields("fetchFields","initial");
            return this;
        }

        public QueryBuilder excludeInitial(){
            setFetchFields("excludeFields","initial");
            return this;
        }

        public QueryBuilder fuzzyInitials (List<String> fuzzyInitials){
            this.fuzzyInitials = fuzzyInitials;
            return this;
        }

        public QueryBuilder fuzzyInitials (String ... fuzzyInitials){
            this.fuzzyInitials = solveNullList(fuzzyInitials);
            return this;
        }

        public QueryBuilder rightFuzzyInitials (List<String> rightFuzzyInitials){
            this.rightFuzzyInitials = rightFuzzyInitials;
            return this;
        }

        public QueryBuilder rightFuzzyInitials (String ... rightFuzzyInitials){
            this.rightFuzzyInitials = solveNullList(rightFuzzyInitials);
            return this;
        }

        public QueryBuilder initials(String initials){
            setInitials(initials);
            return this;
        }

        public QueryBuilder initialsList(String ... initials){
            this.initialsList = solveNullList(initials);
            return this;
        }

        public QueryBuilder initialsList(List<String> initials){
            this.initialsList = initials;
            return this;
        }

        public QueryBuilder fetchInitials(){
            setFetchFields("fetchFields","initials");
            return this;
        }

        public QueryBuilder excludeInitials(){
            setFetchFields("excludeFields","initials");
            return this;
        }

        public QueryBuilder fuzzyPinyin (List<String> fuzzyPinyin){
            this.fuzzyPinyin = fuzzyPinyin;
            return this;
        }

        public QueryBuilder fuzzyPinyin (String ... fuzzyPinyin){
            this.fuzzyPinyin = solveNullList(fuzzyPinyin);
            return this;
        }

        public QueryBuilder rightFuzzyPinyin (List<String> rightFuzzyPinyin){
            this.rightFuzzyPinyin = rightFuzzyPinyin;
            return this;
        }

        public QueryBuilder rightFuzzyPinyin (String ... rightFuzzyPinyin){
            this.rightFuzzyPinyin = solveNullList(rightFuzzyPinyin);
            return this;
        }

        public QueryBuilder pinyin(String pinyin){
            setPinyin(pinyin);
            return this;
        }

        public QueryBuilder pinyinList(String ... pinyin){
            this.pinyinList = solveNullList(pinyin);
            return this;
        }

        public QueryBuilder pinyinList(List<String> pinyin){
            this.pinyinList = pinyin;
            return this;
        }

        public QueryBuilder fetchPinyin(){
            setFetchFields("fetchFields","pinyin");
            return this;
        }

        public QueryBuilder excludePinyin(){
            setFetchFields("excludeFields","pinyin");
            return this;
        }

        public QueryBuilder fuzzyExtra (List<String> fuzzyExtra){
            this.fuzzyExtra = fuzzyExtra;
            return this;
        }

        public QueryBuilder fuzzyExtra (String ... fuzzyExtra){
            this.fuzzyExtra = solveNullList(fuzzyExtra);
            return this;
        }

        public QueryBuilder rightFuzzyExtra (List<String> rightFuzzyExtra){
            this.rightFuzzyExtra = rightFuzzyExtra;
            return this;
        }

        public QueryBuilder rightFuzzyExtra (String ... rightFuzzyExtra){
            this.rightFuzzyExtra = solveNullList(rightFuzzyExtra);
            return this;
        }

        public QueryBuilder extra(String extra){
            setExtra(extra);
            return this;
        }

        public QueryBuilder extraList(String ... extra){
            this.extraList = solveNullList(extra);
            return this;
        }

        public QueryBuilder extraList(List<String> extra){
            this.extraList = extra;
            return this;
        }

        public QueryBuilder fetchExtra(){
            setFetchFields("fetchFields","extra");
            return this;
        }

        public QueryBuilder excludeExtra(){
            setFetchFields("excludeFields","extra");
            return this;
        }

        public QueryBuilder fuzzySuffix (List<String> fuzzySuffix){
            this.fuzzySuffix = fuzzySuffix;
            return this;
        }

        public QueryBuilder fuzzySuffix (String ... fuzzySuffix){
            this.fuzzySuffix = solveNullList(fuzzySuffix);
            return this;
        }

        public QueryBuilder rightFuzzySuffix (List<String> rightFuzzySuffix){
            this.rightFuzzySuffix = rightFuzzySuffix;
            return this;
        }

        public QueryBuilder rightFuzzySuffix (String ... rightFuzzySuffix){
            this.rightFuzzySuffix = solveNullList(rightFuzzySuffix);
            return this;
        }

        public QueryBuilder suffix(String suffix){
            setSuffix(suffix);
            return this;
        }

        public QueryBuilder suffixList(String ... suffix){
            this.suffixList = solveNullList(suffix);
            return this;
        }

        public QueryBuilder suffixList(List<String> suffix){
            this.suffixList = suffix;
            return this;
        }

        public QueryBuilder fetchSuffix(){
            setFetchFields("fetchFields","suffix");
            return this;
        }

        public QueryBuilder excludeSuffix(){
            setFetchFields("excludeFields","suffix");
            return this;
        }

        public QueryBuilder fuzzyCode (List<String> fuzzyCode){
            this.fuzzyCode = fuzzyCode;
            return this;
        }

        public QueryBuilder fuzzyCode (String ... fuzzyCode){
            this.fuzzyCode = solveNullList(fuzzyCode);
            return this;
        }

        public QueryBuilder rightFuzzyCode (List<String> rightFuzzyCode){
            this.rightFuzzyCode = rightFuzzyCode;
            return this;
        }

        public QueryBuilder rightFuzzyCode (String ... rightFuzzyCode){
            this.rightFuzzyCode = solveNullList(rightFuzzyCode);
            return this;
        }

        public QueryBuilder code(String code){
            setCode(code);
            return this;
        }

        public QueryBuilder codeList(String ... code){
            this.codeList = solveNullList(code);
            return this;
        }

        public QueryBuilder codeList(List<String> code){
            this.codeList = code;
            return this;
        }

        public QueryBuilder fetchCode(){
            setFetchFields("fetchFields","code");
            return this;
        }

        public QueryBuilder excludeCode(){
            setFetchFields("excludeFields","code");
            return this;
        }

        public QueryBuilder fuzzyAreaCode (List<String> fuzzyAreaCode){
            this.fuzzyAreaCode = fuzzyAreaCode;
            return this;
        }

        public QueryBuilder fuzzyAreaCode (String ... fuzzyAreaCode){
            this.fuzzyAreaCode = solveNullList(fuzzyAreaCode);
            return this;
        }

        public QueryBuilder rightFuzzyAreaCode (List<String> rightFuzzyAreaCode){
            this.rightFuzzyAreaCode = rightFuzzyAreaCode;
            return this;
        }

        public QueryBuilder rightFuzzyAreaCode (String ... rightFuzzyAreaCode){
            this.rightFuzzyAreaCode = solveNullList(rightFuzzyAreaCode);
            return this;
        }

        public QueryBuilder areaCode(String areaCode){
            setAreaCode(areaCode);
            return this;
        }

        public QueryBuilder areaCodeList(String ... areaCode){
            this.areaCodeList = solveNullList(areaCode);
            return this;
        }

        public QueryBuilder areaCodeList(List<String> areaCode){
            this.areaCodeList = areaCode;
            return this;
        }

        public QueryBuilder fetchAreaCode(){
            setFetchFields("fetchFields","areaCode");
            return this;
        }

        public QueryBuilder excludeAreaCode(){
            setFetchFields("excludeFields","areaCode");
            return this;
        }

        public QueryBuilder orderBetWeen(Integer orderSt,Integer orderEd){
            this.orderSt = orderSt;
            this.orderEd = orderEd;
            return this;
        }

        public QueryBuilder orderGreaterEqThan(Integer orderSt){
            this.orderSt = orderSt;
            return this;
        }
        public QueryBuilder orderLessEqThan(Integer orderEd){
            this.orderEd = orderEd;
            return this;
        }


        public QueryBuilder order(Integer order){
            setOrder(order);
            return this;
        }

        public QueryBuilder orderList(Integer ... order){
            this.orderList = solveNullList(order);
            return this;
        }

        public QueryBuilder orderList(List<Integer> order){
            this.orderList = order;
            return this;
        }

        public QueryBuilder fetchOrder(){
            setFetchFields("fetchFields","order");
            return this;
        }

        public QueryBuilder excludeOrder(){
            setFetchFields("excludeFields","order");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public District build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> parentIdList;

        public List<Integer> getParentIdList(){return this.parentIdList;}

        private Integer parentIdSt;

        private Integer parentIdEd;

        public Integer getParentIdSt(){return this.parentIdSt;}

        public Integer getParentIdEd(){return this.parentIdEd;}

        private List<String> initialList;

        public List<String> getInitialList(){return this.initialList;}


        private List<String> fuzzyInitial;

        public List<String> getFuzzyInitial(){return this.fuzzyInitial;}

        private List<String> rightFuzzyInitial;

        public List<String> getRightFuzzyInitial(){return this.rightFuzzyInitial;}
        private List<String> initialsList;

        public List<String> getInitialsList(){return this.initialsList;}


        private List<String> fuzzyInitials;

        public List<String> getFuzzyInitials(){return this.fuzzyInitials;}

        private List<String> rightFuzzyInitials;

        public List<String> getRightFuzzyInitials(){return this.rightFuzzyInitials;}
        private List<String> pinyinList;

        public List<String> getPinyinList(){return this.pinyinList;}


        private List<String> fuzzyPinyin;

        public List<String> getFuzzyPinyin(){return this.fuzzyPinyin;}

        private List<String> rightFuzzyPinyin;

        public List<String> getRightFuzzyPinyin(){return this.rightFuzzyPinyin;}
        private List<String> extraList;

        public List<String> getExtraList(){return this.extraList;}


        private List<String> fuzzyExtra;

        public List<String> getFuzzyExtra(){return this.fuzzyExtra;}

        private List<String> rightFuzzyExtra;

        public List<String> getRightFuzzyExtra(){return this.rightFuzzyExtra;}
        private List<String> suffixList;

        public List<String> getSuffixList(){return this.suffixList;}


        private List<String> fuzzySuffix;

        public List<String> getFuzzySuffix(){return this.fuzzySuffix;}

        private List<String> rightFuzzySuffix;

        public List<String> getRightFuzzySuffix(){return this.rightFuzzySuffix;}
        private List<String> codeList;

        public List<String> getCodeList(){return this.codeList;}


        private List<String> fuzzyCode;

        public List<String> getFuzzyCode(){return this.fuzzyCode;}

        private List<String> rightFuzzyCode;

        public List<String> getRightFuzzyCode(){return this.rightFuzzyCode;}
        private List<String> areaCodeList;

        public List<String> getAreaCodeList(){return this.areaCodeList;}


        private List<String> fuzzyAreaCode;

        public List<String> getFuzzyAreaCode(){return this.fuzzyAreaCode;}

        private List<String> rightFuzzyAreaCode;

        public List<String> getRightFuzzyAreaCode(){return this.rightFuzzyAreaCode;}
        private List<Integer> orderList;

        public List<Integer> getOrderList(){return this.orderList;}

        private Integer orderSt;

        private Integer orderEd;

        public Integer getOrderSt(){return this.orderSt;}

        public Integer getOrderEd(){return this.orderEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder parentIdBetWeen(Integer parentIdSt,Integer parentIdEd){
            this.parentIdSt = parentIdSt;
            this.parentIdEd = parentIdEd;
            return this;
        }

        public ConditionBuilder parentIdGreaterEqThan(Integer parentIdSt){
            this.parentIdSt = parentIdSt;
            return this;
        }
        public ConditionBuilder parentIdLessEqThan(Integer parentIdEd){
            this.parentIdEd = parentIdEd;
            return this;
        }


        public ConditionBuilder parentIdList(Integer ... parentId){
            this.parentIdList = solveNullList(parentId);
            return this;
        }

        public ConditionBuilder parentIdList(List<Integer> parentId){
            this.parentIdList = parentId;
            return this;
        }

        public ConditionBuilder fuzzyInitial (List<String> fuzzyInitial){
            this.fuzzyInitial = fuzzyInitial;
            return this;
        }

        public ConditionBuilder fuzzyInitial (String ... fuzzyInitial){
            this.fuzzyInitial = solveNullList(fuzzyInitial);
            return this;
        }

        public ConditionBuilder rightFuzzyInitial (List<String> rightFuzzyInitial){
            this.rightFuzzyInitial = rightFuzzyInitial;
            return this;
        }

        public ConditionBuilder rightFuzzyInitial (String ... rightFuzzyInitial){
            this.rightFuzzyInitial = solveNullList(rightFuzzyInitial);
            return this;
        }

        public ConditionBuilder initialList(String ... initial){
            this.initialList = solveNullList(initial);
            return this;
        }

        public ConditionBuilder initialList(List<String> initial){
            this.initialList = initial;
            return this;
        }

        public ConditionBuilder fuzzyInitials (List<String> fuzzyInitials){
            this.fuzzyInitials = fuzzyInitials;
            return this;
        }

        public ConditionBuilder fuzzyInitials (String ... fuzzyInitials){
            this.fuzzyInitials = solveNullList(fuzzyInitials);
            return this;
        }

        public ConditionBuilder rightFuzzyInitials (List<String> rightFuzzyInitials){
            this.rightFuzzyInitials = rightFuzzyInitials;
            return this;
        }

        public ConditionBuilder rightFuzzyInitials (String ... rightFuzzyInitials){
            this.rightFuzzyInitials = solveNullList(rightFuzzyInitials);
            return this;
        }

        public ConditionBuilder initialsList(String ... initials){
            this.initialsList = solveNullList(initials);
            return this;
        }

        public ConditionBuilder initialsList(List<String> initials){
            this.initialsList = initials;
            return this;
        }

        public ConditionBuilder fuzzyPinyin (List<String> fuzzyPinyin){
            this.fuzzyPinyin = fuzzyPinyin;
            return this;
        }

        public ConditionBuilder fuzzyPinyin (String ... fuzzyPinyin){
            this.fuzzyPinyin = solveNullList(fuzzyPinyin);
            return this;
        }

        public ConditionBuilder rightFuzzyPinyin (List<String> rightFuzzyPinyin){
            this.rightFuzzyPinyin = rightFuzzyPinyin;
            return this;
        }

        public ConditionBuilder rightFuzzyPinyin (String ... rightFuzzyPinyin){
            this.rightFuzzyPinyin = solveNullList(rightFuzzyPinyin);
            return this;
        }

        public ConditionBuilder pinyinList(String ... pinyin){
            this.pinyinList = solveNullList(pinyin);
            return this;
        }

        public ConditionBuilder pinyinList(List<String> pinyin){
            this.pinyinList = pinyin;
            return this;
        }

        public ConditionBuilder fuzzyExtra (List<String> fuzzyExtra){
            this.fuzzyExtra = fuzzyExtra;
            return this;
        }

        public ConditionBuilder fuzzyExtra (String ... fuzzyExtra){
            this.fuzzyExtra = solveNullList(fuzzyExtra);
            return this;
        }

        public ConditionBuilder rightFuzzyExtra (List<String> rightFuzzyExtra){
            this.rightFuzzyExtra = rightFuzzyExtra;
            return this;
        }

        public ConditionBuilder rightFuzzyExtra (String ... rightFuzzyExtra){
            this.rightFuzzyExtra = solveNullList(rightFuzzyExtra);
            return this;
        }

        public ConditionBuilder extraList(String ... extra){
            this.extraList = solveNullList(extra);
            return this;
        }

        public ConditionBuilder extraList(List<String> extra){
            this.extraList = extra;
            return this;
        }

        public ConditionBuilder fuzzySuffix (List<String> fuzzySuffix){
            this.fuzzySuffix = fuzzySuffix;
            return this;
        }

        public ConditionBuilder fuzzySuffix (String ... fuzzySuffix){
            this.fuzzySuffix = solveNullList(fuzzySuffix);
            return this;
        }

        public ConditionBuilder rightFuzzySuffix (List<String> rightFuzzySuffix){
            this.rightFuzzySuffix = rightFuzzySuffix;
            return this;
        }

        public ConditionBuilder rightFuzzySuffix (String ... rightFuzzySuffix){
            this.rightFuzzySuffix = solveNullList(rightFuzzySuffix);
            return this;
        }

        public ConditionBuilder suffixList(String ... suffix){
            this.suffixList = solveNullList(suffix);
            return this;
        }

        public ConditionBuilder suffixList(List<String> suffix){
            this.suffixList = suffix;
            return this;
        }

        public ConditionBuilder fuzzyCode (List<String> fuzzyCode){
            this.fuzzyCode = fuzzyCode;
            return this;
        }

        public ConditionBuilder fuzzyCode (String ... fuzzyCode){
            this.fuzzyCode = solveNullList(fuzzyCode);
            return this;
        }

        public ConditionBuilder rightFuzzyCode (List<String> rightFuzzyCode){
            this.rightFuzzyCode = rightFuzzyCode;
            return this;
        }

        public ConditionBuilder rightFuzzyCode (String ... rightFuzzyCode){
            this.rightFuzzyCode = solveNullList(rightFuzzyCode);
            return this;
        }

        public ConditionBuilder codeList(String ... code){
            this.codeList = solveNullList(code);
            return this;
        }

        public ConditionBuilder codeList(List<String> code){
            this.codeList = code;
            return this;
        }

        public ConditionBuilder fuzzyAreaCode (List<String> fuzzyAreaCode){
            this.fuzzyAreaCode = fuzzyAreaCode;
            return this;
        }

        public ConditionBuilder fuzzyAreaCode (String ... fuzzyAreaCode){
            this.fuzzyAreaCode = solveNullList(fuzzyAreaCode);
            return this;
        }

        public ConditionBuilder rightFuzzyAreaCode (List<String> rightFuzzyAreaCode){
            this.rightFuzzyAreaCode = rightFuzzyAreaCode;
            return this;
        }

        public ConditionBuilder rightFuzzyAreaCode (String ... rightFuzzyAreaCode){
            this.rightFuzzyAreaCode = solveNullList(rightFuzzyAreaCode);
            return this;
        }

        public ConditionBuilder areaCodeList(String ... areaCode){
            this.areaCodeList = solveNullList(areaCode);
            return this;
        }

        public ConditionBuilder areaCodeList(List<String> areaCode){
            this.areaCodeList = areaCode;
            return this;
        }

        public ConditionBuilder orderBetWeen(Integer orderSt,Integer orderEd){
            this.orderSt = orderSt;
            this.orderEd = orderEd;
            return this;
        }

        public ConditionBuilder orderGreaterEqThan(Integer orderSt){
            this.orderSt = orderSt;
            return this;
        }
        public ConditionBuilder orderLessEqThan(Integer orderEd){
            this.orderEd = orderEd;
            return this;
        }


        public ConditionBuilder orderList(Integer ... order){
            this.orderList = solveNullList(order);
            return this;
        }

        public ConditionBuilder orderList(List<Integer> order){
            this.orderList = order;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private District obj;

        public Builder(){
            this.obj = new District();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder parentId(Integer parentId){
            this.obj.setParentId(parentId);
            return this;
        }
        public Builder initial(String initial){
            this.obj.setInitial(initial);
            return this;
        }
        public Builder initials(String initials){
            this.obj.setInitials(initials);
            return this;
        }
        public Builder pinyin(String pinyin){
            this.obj.setPinyin(pinyin);
            return this;
        }
        public Builder extra(String extra){
            this.obj.setExtra(extra);
            return this;
        }
        public Builder suffix(String suffix){
            this.obj.setSuffix(suffix);
            return this;
        }
        public Builder code(String code){
            this.obj.setCode(code);
            return this;
        }
        public Builder areaCode(String areaCode){
            this.obj.setAreaCode(areaCode);
            return this;
        }
        public Builder order(Integer order){
            this.obj.setOrder(order);
            return this;
        }
        public District build(){return obj;}
    }

}
