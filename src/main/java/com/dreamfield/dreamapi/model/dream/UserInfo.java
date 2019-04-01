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
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1554040538912L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 
    * isNullAble:1
    */
    private String imgUrl;

    /**
    * 
    * isNullAble:1
    */
    private String userSignature;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

    public void setImgUrl(String imgUrl){this.imgUrl = imgUrl;}

    public String getImgUrl(){return this.imgUrl;}

    public void setUserSignature(String userSignature){this.userSignature = userSignature;}

    public String getUserSignature(){return this.userSignature;}
    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                "userId='" + userId + '\'' +
                "imgUrl='" + imgUrl + '\'' +
                "userSignature='" + userSignature + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private UserInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(UserInfo set){
            this.set = set;
            return this;
        }

        public UserInfo getSet(){
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

    public static class QueryBuilder extends UserInfo{
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

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<String> imgUrlList;

        public List<String> getImgUrlList(){return this.imgUrlList;}


        private List<String> fuzzyImgUrl;

        public List<String> getFuzzyImgUrl(){return this.fuzzyImgUrl;}

        private List<String> rightFuzzyImgUrl;

        public List<String> getRightFuzzyImgUrl(){return this.rightFuzzyImgUrl;}
        private List<String> userSignatureList;

        public List<String> getUserSignatureList(){return this.userSignatureList;}


        private List<String> fuzzyUserSignature;

        public List<String> getFuzzyUserSignature(){return this.fuzzyUserSignature;}

        private List<String> rightFuzzyUserSignature;

        public List<String> getRightFuzzyUserSignature(){return this.rightFuzzyUserSignature;}
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

        public QueryBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public QueryBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public QueryBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public QueryBuilder userId(Integer userId){
            setUserId(userId);
            return this;
        }

        public QueryBuilder userIdList(Integer ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public QueryBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public QueryBuilder fetchUserId(){
            setFetchFields("fetchFields","userId");
            return this;
        }

        public QueryBuilder excludeUserId(){
            setFetchFields("excludeFields","userId");
            return this;
        }

        public QueryBuilder fuzzyImgUrl (List<String> fuzzyImgUrl){
            this.fuzzyImgUrl = fuzzyImgUrl;
            return this;
        }

        public QueryBuilder fuzzyImgUrl (String ... fuzzyImgUrl){
            this.fuzzyImgUrl = solveNullList(fuzzyImgUrl);
            return this;
        }

        public QueryBuilder rightFuzzyImgUrl (List<String> rightFuzzyImgUrl){
            this.rightFuzzyImgUrl = rightFuzzyImgUrl;
            return this;
        }

        public QueryBuilder rightFuzzyImgUrl (String ... rightFuzzyImgUrl){
            this.rightFuzzyImgUrl = solveNullList(rightFuzzyImgUrl);
            return this;
        }

        public QueryBuilder imgUrl(String imgUrl){
            setImgUrl(imgUrl);
            return this;
        }

        public QueryBuilder imgUrlList(String ... imgUrl){
            this.imgUrlList = solveNullList(imgUrl);
            return this;
        }

        public QueryBuilder imgUrlList(List<String> imgUrl){
            this.imgUrlList = imgUrl;
            return this;
        }

        public QueryBuilder fetchImgUrl(){
            setFetchFields("fetchFields","imgUrl");
            return this;
        }

        public QueryBuilder excludeImgUrl(){
            setFetchFields("excludeFields","imgUrl");
            return this;
        }

        public QueryBuilder fuzzyUserSignature (List<String> fuzzyUserSignature){
            this.fuzzyUserSignature = fuzzyUserSignature;
            return this;
        }

        public QueryBuilder fuzzyUserSignature (String ... fuzzyUserSignature){
            this.fuzzyUserSignature = solveNullList(fuzzyUserSignature);
            return this;
        }

        public QueryBuilder rightFuzzyUserSignature (List<String> rightFuzzyUserSignature){
            this.rightFuzzyUserSignature = rightFuzzyUserSignature;
            return this;
        }

        public QueryBuilder rightFuzzyUserSignature (String ... rightFuzzyUserSignature){
            this.rightFuzzyUserSignature = solveNullList(rightFuzzyUserSignature);
            return this;
        }

        public QueryBuilder userSignature(String userSignature){
            setUserSignature(userSignature);
            return this;
        }

        public QueryBuilder userSignatureList(String ... userSignature){
            this.userSignatureList = solveNullList(userSignature);
            return this;
        }

        public QueryBuilder userSignatureList(List<String> userSignature){
            this.userSignatureList = userSignature;
            return this;
        }

        public QueryBuilder fetchUserSignature(){
            setFetchFields("fetchFields","userSignature");
            return this;
        }

        public QueryBuilder excludeUserSignature(){
            setFetchFields("excludeFields","userSignature");
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

        public UserInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<String> imgUrlList;

        public List<String> getImgUrlList(){return this.imgUrlList;}


        private List<String> fuzzyImgUrl;

        public List<String> getFuzzyImgUrl(){return this.fuzzyImgUrl;}

        private List<String> rightFuzzyImgUrl;

        public List<String> getRightFuzzyImgUrl(){return this.rightFuzzyImgUrl;}
        private List<String> userSignatureList;

        public List<String> getUserSignatureList(){return this.userSignatureList;}


        private List<String> fuzzyUserSignature;

        public List<String> getFuzzyUserSignature(){return this.fuzzyUserSignature;}

        private List<String> rightFuzzyUserSignature;

        public List<String> getRightFuzzyUserSignature(){return this.rightFuzzyUserSignature;}

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

        public ConditionBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public ConditionBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public ConditionBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public ConditionBuilder userIdList(Integer ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public ConditionBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public ConditionBuilder fuzzyImgUrl (List<String> fuzzyImgUrl){
            this.fuzzyImgUrl = fuzzyImgUrl;
            return this;
        }

        public ConditionBuilder fuzzyImgUrl (String ... fuzzyImgUrl){
            this.fuzzyImgUrl = solveNullList(fuzzyImgUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyImgUrl (List<String> rightFuzzyImgUrl){
            this.rightFuzzyImgUrl = rightFuzzyImgUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyImgUrl (String ... rightFuzzyImgUrl){
            this.rightFuzzyImgUrl = solveNullList(rightFuzzyImgUrl);
            return this;
        }

        public ConditionBuilder imgUrlList(String ... imgUrl){
            this.imgUrlList = solveNullList(imgUrl);
            return this;
        }

        public ConditionBuilder imgUrlList(List<String> imgUrl){
            this.imgUrlList = imgUrl;
            return this;
        }

        public ConditionBuilder fuzzyUserSignature (List<String> fuzzyUserSignature){
            this.fuzzyUserSignature = fuzzyUserSignature;
            return this;
        }

        public ConditionBuilder fuzzyUserSignature (String ... fuzzyUserSignature){
            this.fuzzyUserSignature = solveNullList(fuzzyUserSignature);
            return this;
        }

        public ConditionBuilder rightFuzzyUserSignature (List<String> rightFuzzyUserSignature){
            this.rightFuzzyUserSignature = rightFuzzyUserSignature;
            return this;
        }

        public ConditionBuilder rightFuzzyUserSignature (String ... rightFuzzyUserSignature){
            this.rightFuzzyUserSignature = solveNullList(rightFuzzyUserSignature);
            return this;
        }

        public ConditionBuilder userSignatureList(String ... userSignature){
            this.userSignatureList = solveNullList(userSignature);
            return this;
        }

        public ConditionBuilder userSignatureList(List<String> userSignature){
            this.userSignatureList = userSignature;
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

        private UserInfo obj;

        public Builder(){
            this.obj = new UserInfo();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder imgUrl(String imgUrl){
            this.obj.setImgUrl(imgUrl);
            return this;
        }
        public Builder userSignature(String userSignature){
            this.obj.setUserSignature(userSignature);
            return this;
        }
        public UserInfo build(){return obj;}
    }

}
