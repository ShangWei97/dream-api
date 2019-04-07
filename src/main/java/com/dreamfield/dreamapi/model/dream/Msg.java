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
public class Msg implements Serializable {

    private static final long serialVersionUID = 1554609858238L;


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
    private Integer msgUserId;

    /**
    * 
    * isNullAble:1
    */
    private String msgUserName;

    /**
    * 
    * isNullAble:1
    */
    private String msgUserGender;

    /**
    * 
    * isNullAble:1
    */
    private String msgContent;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime msgTime;

    /**
    * 
    * isNullAble:1
    */
    private String msgUserImgUrl;

    /**
    * 
    * isNullAble:1
    */
    private Integer bookId;

    /**
    * 
    * isNullAble:1
    */
    private Integer parentId;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setMsgUserId(Integer msgUserId){this.msgUserId = msgUserId;}

    public Integer getMsgUserId(){return this.msgUserId;}

    public void setMsgUserName(String msgUserName){this.msgUserName = msgUserName;}

    public String getMsgUserName(){return this.msgUserName;}

    public void setMsgUserGender(String msgUserGender){this.msgUserGender = msgUserGender;}

    public String getMsgUserGender(){return this.msgUserGender;}

    public void setMsgContent(String msgContent){this.msgContent = msgContent;}

    public String getMsgContent(){return this.msgContent;}

    public void setMsgTime(java.time.LocalDateTime msgTime){this.msgTime = msgTime;}

    public java.time.LocalDateTime getMsgTime(){return this.msgTime;}

    public void setMsgUserImgUrl(String msgUserImgUrl){this.msgUserImgUrl = msgUserImgUrl;}

    public String getMsgUserImgUrl(){return this.msgUserImgUrl;}

    public void setBookId(Integer bookId){this.bookId = bookId;}

    public Integer getBookId(){return this.bookId;}

    public void setParentId(Integer parentId){this.parentId = parentId;}

    public Integer getParentId(){return this.parentId;}
    @Override
    public String toString() {
        return "Msg{" +
                "id='" + id + '\'' +
                "msgUserId='" + msgUserId + '\'' +
                "msgUserName='" + msgUserName + '\'' +
                "msgUserGender='" + msgUserGender + '\'' +
                "msgContent='" + msgContent + '\'' +
                "msgTime='" + msgTime + '\'' +
                "msgUserImgUrl='" + msgUserImgUrl + '\'' +
                "bookId='" + bookId + '\'' +
                "parentId='" + parentId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Msg set;

        private ConditionBuilder where;

        public UpdateBuilder set(Msg set){
            this.set = set;
            return this;
        }

        public Msg getSet(){
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

    public static class QueryBuilder extends Msg{
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

        private List<Integer> msgUserIdList;

        public List<Integer> getMsgUserIdList(){return this.msgUserIdList;}

        private Integer msgUserIdSt;

        private Integer msgUserIdEd;

        public Integer getMsgUserIdSt(){return this.msgUserIdSt;}

        public Integer getMsgUserIdEd(){return this.msgUserIdEd;}

        private List<String> msgUserNameList;

        public List<String> getMsgUserNameList(){return this.msgUserNameList;}


        private List<String> fuzzyMsgUserName;

        public List<String> getFuzzyMsgUserName(){return this.fuzzyMsgUserName;}

        private List<String> rightFuzzyMsgUserName;

        public List<String> getRightFuzzyMsgUserName(){return this.rightFuzzyMsgUserName;}
        private List<String> msgUserGenderList;

        public List<String> getMsgUserGenderList(){return this.msgUserGenderList;}


        private List<String> fuzzyMsgUserGender;

        public List<String> getFuzzyMsgUserGender(){return this.fuzzyMsgUserGender;}

        private List<String> rightFuzzyMsgUserGender;

        public List<String> getRightFuzzyMsgUserGender(){return this.rightFuzzyMsgUserGender;}
        private List<String> msgContentList;

        public List<String> getMsgContentList(){return this.msgContentList;}


        private List<String> fuzzyMsgContent;

        public List<String> getFuzzyMsgContent(){return this.fuzzyMsgContent;}

        private List<String> rightFuzzyMsgContent;

        public List<String> getRightFuzzyMsgContent(){return this.rightFuzzyMsgContent;}
        private List<java.time.LocalDateTime> msgTimeList;

        public List<java.time.LocalDateTime> getMsgTimeList(){return this.msgTimeList;}

        private java.time.LocalDateTime msgTimeSt;

        private java.time.LocalDateTime msgTimeEd;

        public java.time.LocalDateTime getMsgTimeSt(){return this.msgTimeSt;}

        public java.time.LocalDateTime getMsgTimeEd(){return this.msgTimeEd;}

        private List<String> msgUserImgUrlList;

        public List<String> getMsgUserImgUrlList(){return this.msgUserImgUrlList;}


        private List<String> fuzzyMsgUserImgUrl;

        public List<String> getFuzzyMsgUserImgUrl(){return this.fuzzyMsgUserImgUrl;}

        private List<String> rightFuzzyMsgUserImgUrl;

        public List<String> getRightFuzzyMsgUserImgUrl(){return this.rightFuzzyMsgUserImgUrl;}
        private List<Integer> bookIdList;

        public List<Integer> getBookIdList(){return this.bookIdList;}

        private Integer bookIdSt;

        private Integer bookIdEd;

        public Integer getBookIdSt(){return this.bookIdSt;}

        public Integer getBookIdEd(){return this.bookIdEd;}

        private List<Integer> parentIdList;

        public List<Integer> getParentIdList(){return this.parentIdList;}

        private Integer parentIdSt;

        private Integer parentIdEd;

        public Integer getParentIdSt(){return this.parentIdSt;}

        public Integer getParentIdEd(){return this.parentIdEd;}

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

        public QueryBuilder msgUserIdBetWeen(Integer msgUserIdSt,Integer msgUserIdEd){
            this.msgUserIdSt = msgUserIdSt;
            this.msgUserIdEd = msgUserIdEd;
            return this;
        }

        public QueryBuilder msgUserIdGreaterEqThan(Integer msgUserIdSt){
            this.msgUserIdSt = msgUserIdSt;
            return this;
        }
        public QueryBuilder msgUserIdLessEqThan(Integer msgUserIdEd){
            this.msgUserIdEd = msgUserIdEd;
            return this;
        }


        public QueryBuilder msgUserId(Integer msgUserId){
            setMsgUserId(msgUserId);
            return this;
        }

        public QueryBuilder msgUserIdList(Integer ... msgUserId){
            this.msgUserIdList = solveNullList(msgUserId);
            return this;
        }

        public QueryBuilder msgUserIdList(List<Integer> msgUserId){
            this.msgUserIdList = msgUserId;
            return this;
        }

        public QueryBuilder fetchMsgUserId(){
            setFetchFields("fetchFields","msgUserId");
            return this;
        }

        public QueryBuilder excludeMsgUserId(){
            setFetchFields("excludeFields","msgUserId");
            return this;
        }

        public QueryBuilder fuzzyMsgUserName (List<String> fuzzyMsgUserName){
            this.fuzzyMsgUserName = fuzzyMsgUserName;
            return this;
        }

        public QueryBuilder fuzzyMsgUserName (String ... fuzzyMsgUserName){
            this.fuzzyMsgUserName = solveNullList(fuzzyMsgUserName);
            return this;
        }

        public QueryBuilder rightFuzzyMsgUserName (List<String> rightFuzzyMsgUserName){
            this.rightFuzzyMsgUserName = rightFuzzyMsgUserName;
            return this;
        }

        public QueryBuilder rightFuzzyMsgUserName (String ... rightFuzzyMsgUserName){
            this.rightFuzzyMsgUserName = solveNullList(rightFuzzyMsgUserName);
            return this;
        }

        public QueryBuilder msgUserName(String msgUserName){
            setMsgUserName(msgUserName);
            return this;
        }

        public QueryBuilder msgUserNameList(String ... msgUserName){
            this.msgUserNameList = solveNullList(msgUserName);
            return this;
        }

        public QueryBuilder msgUserNameList(List<String> msgUserName){
            this.msgUserNameList = msgUserName;
            return this;
        }

        public QueryBuilder fetchMsgUserName(){
            setFetchFields("fetchFields","msgUserName");
            return this;
        }

        public QueryBuilder excludeMsgUserName(){
            setFetchFields("excludeFields","msgUserName");
            return this;
        }

        public QueryBuilder fuzzyMsgUserGender (List<String> fuzzyMsgUserGender){
            this.fuzzyMsgUserGender = fuzzyMsgUserGender;
            return this;
        }

        public QueryBuilder fuzzyMsgUserGender (String ... fuzzyMsgUserGender){
            this.fuzzyMsgUserGender = solveNullList(fuzzyMsgUserGender);
            return this;
        }

        public QueryBuilder rightFuzzyMsgUserGender (List<String> rightFuzzyMsgUserGender){
            this.rightFuzzyMsgUserGender = rightFuzzyMsgUserGender;
            return this;
        }

        public QueryBuilder rightFuzzyMsgUserGender (String ... rightFuzzyMsgUserGender){
            this.rightFuzzyMsgUserGender = solveNullList(rightFuzzyMsgUserGender);
            return this;
        }

        public QueryBuilder msgUserGender(String msgUserGender){
            setMsgUserGender(msgUserGender);
            return this;
        }

        public QueryBuilder msgUserGenderList(String ... msgUserGender){
            this.msgUserGenderList = solveNullList(msgUserGender);
            return this;
        }

        public QueryBuilder msgUserGenderList(List<String> msgUserGender){
            this.msgUserGenderList = msgUserGender;
            return this;
        }

        public QueryBuilder fetchMsgUserGender(){
            setFetchFields("fetchFields","msgUserGender");
            return this;
        }

        public QueryBuilder excludeMsgUserGender(){
            setFetchFields("excludeFields","msgUserGender");
            return this;
        }

        public QueryBuilder fuzzyMsgContent (List<String> fuzzyMsgContent){
            this.fuzzyMsgContent = fuzzyMsgContent;
            return this;
        }

        public QueryBuilder fuzzyMsgContent (String ... fuzzyMsgContent){
            this.fuzzyMsgContent = solveNullList(fuzzyMsgContent);
            return this;
        }

        public QueryBuilder rightFuzzyMsgContent (List<String> rightFuzzyMsgContent){
            this.rightFuzzyMsgContent = rightFuzzyMsgContent;
            return this;
        }

        public QueryBuilder rightFuzzyMsgContent (String ... rightFuzzyMsgContent){
            this.rightFuzzyMsgContent = solveNullList(rightFuzzyMsgContent);
            return this;
        }

        public QueryBuilder msgContent(String msgContent){
            setMsgContent(msgContent);
            return this;
        }

        public QueryBuilder msgContentList(String ... msgContent){
            this.msgContentList = solveNullList(msgContent);
            return this;
        }

        public QueryBuilder msgContentList(List<String> msgContent){
            this.msgContentList = msgContent;
            return this;
        }

        public QueryBuilder fetchMsgContent(){
            setFetchFields("fetchFields","msgContent");
            return this;
        }

        public QueryBuilder excludeMsgContent(){
            setFetchFields("excludeFields","msgContent");
            return this;
        }

        public QueryBuilder msgTimeBetWeen(java.time.LocalDateTime msgTimeSt,java.time.LocalDateTime msgTimeEd){
            this.msgTimeSt = msgTimeSt;
            this.msgTimeEd = msgTimeEd;
            return this;
        }

        public QueryBuilder msgTimeGreaterEqThan(java.time.LocalDateTime msgTimeSt){
            this.msgTimeSt = msgTimeSt;
            return this;
        }
        public QueryBuilder msgTimeLessEqThan(java.time.LocalDateTime msgTimeEd){
            this.msgTimeEd = msgTimeEd;
            return this;
        }


        public QueryBuilder msgTime(java.time.LocalDateTime msgTime){
            setMsgTime(msgTime);
            return this;
        }

        public QueryBuilder msgTimeList(java.time.LocalDateTime ... msgTime){
            this.msgTimeList = solveNullList(msgTime);
            return this;
        }

        public QueryBuilder msgTimeList(List<java.time.LocalDateTime> msgTime){
            this.msgTimeList = msgTime;
            return this;
        }

        public QueryBuilder fetchMsgTime(){
            setFetchFields("fetchFields","msgTime");
            return this;
        }

        public QueryBuilder excludeMsgTime(){
            setFetchFields("excludeFields","msgTime");
            return this;
        }

        public QueryBuilder fuzzyMsgUserImgUrl (List<String> fuzzyMsgUserImgUrl){
            this.fuzzyMsgUserImgUrl = fuzzyMsgUserImgUrl;
            return this;
        }

        public QueryBuilder fuzzyMsgUserImgUrl (String ... fuzzyMsgUserImgUrl){
            this.fuzzyMsgUserImgUrl = solveNullList(fuzzyMsgUserImgUrl);
            return this;
        }

        public QueryBuilder rightFuzzyMsgUserImgUrl (List<String> rightFuzzyMsgUserImgUrl){
            this.rightFuzzyMsgUserImgUrl = rightFuzzyMsgUserImgUrl;
            return this;
        }

        public QueryBuilder rightFuzzyMsgUserImgUrl (String ... rightFuzzyMsgUserImgUrl){
            this.rightFuzzyMsgUserImgUrl = solveNullList(rightFuzzyMsgUserImgUrl);
            return this;
        }

        public QueryBuilder msgUserImgUrl(String msgUserImgUrl){
            setMsgUserImgUrl(msgUserImgUrl);
            return this;
        }

        public QueryBuilder msgUserImgUrlList(String ... msgUserImgUrl){
            this.msgUserImgUrlList = solveNullList(msgUserImgUrl);
            return this;
        }

        public QueryBuilder msgUserImgUrlList(List<String> msgUserImgUrl){
            this.msgUserImgUrlList = msgUserImgUrl;
            return this;
        }

        public QueryBuilder fetchMsgUserImgUrl(){
            setFetchFields("fetchFields","msgUserImgUrl");
            return this;
        }

        public QueryBuilder excludeMsgUserImgUrl(){
            setFetchFields("excludeFields","msgUserImgUrl");
            return this;
        }

        public QueryBuilder bookIdBetWeen(Integer bookIdSt,Integer bookIdEd){
            this.bookIdSt = bookIdSt;
            this.bookIdEd = bookIdEd;
            return this;
        }

        public QueryBuilder bookIdGreaterEqThan(Integer bookIdSt){
            this.bookIdSt = bookIdSt;
            return this;
        }
        public QueryBuilder bookIdLessEqThan(Integer bookIdEd){
            this.bookIdEd = bookIdEd;
            return this;
        }


        public QueryBuilder bookId(Integer bookId){
            setBookId(bookId);
            return this;
        }

        public QueryBuilder bookIdList(Integer ... bookId){
            this.bookIdList = solveNullList(bookId);
            return this;
        }

        public QueryBuilder bookIdList(List<Integer> bookId){
            this.bookIdList = bookId;
            return this;
        }

        public QueryBuilder fetchBookId(){
            setFetchFields("fetchFields","bookId");
            return this;
        }

        public QueryBuilder excludeBookId(){
            setFetchFields("excludeFields","bookId");
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

        public Msg build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> msgUserIdList;

        public List<Integer> getMsgUserIdList(){return this.msgUserIdList;}

        private Integer msgUserIdSt;

        private Integer msgUserIdEd;

        public Integer getMsgUserIdSt(){return this.msgUserIdSt;}

        public Integer getMsgUserIdEd(){return this.msgUserIdEd;}

        private List<String> msgUserNameList;

        public List<String> getMsgUserNameList(){return this.msgUserNameList;}


        private List<String> fuzzyMsgUserName;

        public List<String> getFuzzyMsgUserName(){return this.fuzzyMsgUserName;}

        private List<String> rightFuzzyMsgUserName;

        public List<String> getRightFuzzyMsgUserName(){return this.rightFuzzyMsgUserName;}
        private List<String> msgUserGenderList;

        public List<String> getMsgUserGenderList(){return this.msgUserGenderList;}


        private List<String> fuzzyMsgUserGender;

        public List<String> getFuzzyMsgUserGender(){return this.fuzzyMsgUserGender;}

        private List<String> rightFuzzyMsgUserGender;

        public List<String> getRightFuzzyMsgUserGender(){return this.rightFuzzyMsgUserGender;}
        private List<String> msgContentList;

        public List<String> getMsgContentList(){return this.msgContentList;}


        private List<String> fuzzyMsgContent;

        public List<String> getFuzzyMsgContent(){return this.fuzzyMsgContent;}

        private List<String> rightFuzzyMsgContent;

        public List<String> getRightFuzzyMsgContent(){return this.rightFuzzyMsgContent;}
        private List<java.time.LocalDateTime> msgTimeList;

        public List<java.time.LocalDateTime> getMsgTimeList(){return this.msgTimeList;}

        private java.time.LocalDateTime msgTimeSt;

        private java.time.LocalDateTime msgTimeEd;

        public java.time.LocalDateTime getMsgTimeSt(){return this.msgTimeSt;}

        public java.time.LocalDateTime getMsgTimeEd(){return this.msgTimeEd;}

        private List<String> msgUserImgUrlList;

        public List<String> getMsgUserImgUrlList(){return this.msgUserImgUrlList;}


        private List<String> fuzzyMsgUserImgUrl;

        public List<String> getFuzzyMsgUserImgUrl(){return this.fuzzyMsgUserImgUrl;}

        private List<String> rightFuzzyMsgUserImgUrl;

        public List<String> getRightFuzzyMsgUserImgUrl(){return this.rightFuzzyMsgUserImgUrl;}
        private List<Integer> bookIdList;

        public List<Integer> getBookIdList(){return this.bookIdList;}

        private Integer bookIdSt;

        private Integer bookIdEd;

        public Integer getBookIdSt(){return this.bookIdSt;}

        public Integer getBookIdEd(){return this.bookIdEd;}

        private List<Integer> parentIdList;

        public List<Integer> getParentIdList(){return this.parentIdList;}

        private Integer parentIdSt;

        private Integer parentIdEd;

        public Integer getParentIdSt(){return this.parentIdSt;}

        public Integer getParentIdEd(){return this.parentIdEd;}


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

        public ConditionBuilder msgUserIdBetWeen(Integer msgUserIdSt,Integer msgUserIdEd){
            this.msgUserIdSt = msgUserIdSt;
            this.msgUserIdEd = msgUserIdEd;
            return this;
        }

        public ConditionBuilder msgUserIdGreaterEqThan(Integer msgUserIdSt){
            this.msgUserIdSt = msgUserIdSt;
            return this;
        }
        public ConditionBuilder msgUserIdLessEqThan(Integer msgUserIdEd){
            this.msgUserIdEd = msgUserIdEd;
            return this;
        }


        public ConditionBuilder msgUserIdList(Integer ... msgUserId){
            this.msgUserIdList = solveNullList(msgUserId);
            return this;
        }

        public ConditionBuilder msgUserIdList(List<Integer> msgUserId){
            this.msgUserIdList = msgUserId;
            return this;
        }

        public ConditionBuilder fuzzyMsgUserName (List<String> fuzzyMsgUserName){
            this.fuzzyMsgUserName = fuzzyMsgUserName;
            return this;
        }

        public ConditionBuilder fuzzyMsgUserName (String ... fuzzyMsgUserName){
            this.fuzzyMsgUserName = solveNullList(fuzzyMsgUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyMsgUserName (List<String> rightFuzzyMsgUserName){
            this.rightFuzzyMsgUserName = rightFuzzyMsgUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyMsgUserName (String ... rightFuzzyMsgUserName){
            this.rightFuzzyMsgUserName = solveNullList(rightFuzzyMsgUserName);
            return this;
        }

        public ConditionBuilder msgUserNameList(String ... msgUserName){
            this.msgUserNameList = solveNullList(msgUserName);
            return this;
        }

        public ConditionBuilder msgUserNameList(List<String> msgUserName){
            this.msgUserNameList = msgUserName;
            return this;
        }

        public ConditionBuilder fuzzyMsgUserGender (List<String> fuzzyMsgUserGender){
            this.fuzzyMsgUserGender = fuzzyMsgUserGender;
            return this;
        }

        public ConditionBuilder fuzzyMsgUserGender (String ... fuzzyMsgUserGender){
            this.fuzzyMsgUserGender = solveNullList(fuzzyMsgUserGender);
            return this;
        }

        public ConditionBuilder rightFuzzyMsgUserGender (List<String> rightFuzzyMsgUserGender){
            this.rightFuzzyMsgUserGender = rightFuzzyMsgUserGender;
            return this;
        }

        public ConditionBuilder rightFuzzyMsgUserGender (String ... rightFuzzyMsgUserGender){
            this.rightFuzzyMsgUserGender = solveNullList(rightFuzzyMsgUserGender);
            return this;
        }

        public ConditionBuilder msgUserGenderList(String ... msgUserGender){
            this.msgUserGenderList = solveNullList(msgUserGender);
            return this;
        }

        public ConditionBuilder msgUserGenderList(List<String> msgUserGender){
            this.msgUserGenderList = msgUserGender;
            return this;
        }

        public ConditionBuilder fuzzyMsgContent (List<String> fuzzyMsgContent){
            this.fuzzyMsgContent = fuzzyMsgContent;
            return this;
        }

        public ConditionBuilder fuzzyMsgContent (String ... fuzzyMsgContent){
            this.fuzzyMsgContent = solveNullList(fuzzyMsgContent);
            return this;
        }

        public ConditionBuilder rightFuzzyMsgContent (List<String> rightFuzzyMsgContent){
            this.rightFuzzyMsgContent = rightFuzzyMsgContent;
            return this;
        }

        public ConditionBuilder rightFuzzyMsgContent (String ... rightFuzzyMsgContent){
            this.rightFuzzyMsgContent = solveNullList(rightFuzzyMsgContent);
            return this;
        }

        public ConditionBuilder msgContentList(String ... msgContent){
            this.msgContentList = solveNullList(msgContent);
            return this;
        }

        public ConditionBuilder msgContentList(List<String> msgContent){
            this.msgContentList = msgContent;
            return this;
        }

        public ConditionBuilder msgTimeBetWeen(java.time.LocalDateTime msgTimeSt,java.time.LocalDateTime msgTimeEd){
            this.msgTimeSt = msgTimeSt;
            this.msgTimeEd = msgTimeEd;
            return this;
        }

        public ConditionBuilder msgTimeGreaterEqThan(java.time.LocalDateTime msgTimeSt){
            this.msgTimeSt = msgTimeSt;
            return this;
        }
        public ConditionBuilder msgTimeLessEqThan(java.time.LocalDateTime msgTimeEd){
            this.msgTimeEd = msgTimeEd;
            return this;
        }


        public ConditionBuilder msgTimeList(java.time.LocalDateTime ... msgTime){
            this.msgTimeList = solveNullList(msgTime);
            return this;
        }

        public ConditionBuilder msgTimeList(List<java.time.LocalDateTime> msgTime){
            this.msgTimeList = msgTime;
            return this;
        }

        public ConditionBuilder fuzzyMsgUserImgUrl (List<String> fuzzyMsgUserImgUrl){
            this.fuzzyMsgUserImgUrl = fuzzyMsgUserImgUrl;
            return this;
        }

        public ConditionBuilder fuzzyMsgUserImgUrl (String ... fuzzyMsgUserImgUrl){
            this.fuzzyMsgUserImgUrl = solveNullList(fuzzyMsgUserImgUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyMsgUserImgUrl (List<String> rightFuzzyMsgUserImgUrl){
            this.rightFuzzyMsgUserImgUrl = rightFuzzyMsgUserImgUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyMsgUserImgUrl (String ... rightFuzzyMsgUserImgUrl){
            this.rightFuzzyMsgUserImgUrl = solveNullList(rightFuzzyMsgUserImgUrl);
            return this;
        }

        public ConditionBuilder msgUserImgUrlList(String ... msgUserImgUrl){
            this.msgUserImgUrlList = solveNullList(msgUserImgUrl);
            return this;
        }

        public ConditionBuilder msgUserImgUrlList(List<String> msgUserImgUrl){
            this.msgUserImgUrlList = msgUserImgUrl;
            return this;
        }

        public ConditionBuilder bookIdBetWeen(Integer bookIdSt,Integer bookIdEd){
            this.bookIdSt = bookIdSt;
            this.bookIdEd = bookIdEd;
            return this;
        }

        public ConditionBuilder bookIdGreaterEqThan(Integer bookIdSt){
            this.bookIdSt = bookIdSt;
            return this;
        }
        public ConditionBuilder bookIdLessEqThan(Integer bookIdEd){
            this.bookIdEd = bookIdEd;
            return this;
        }


        public ConditionBuilder bookIdList(Integer ... bookId){
            this.bookIdList = solveNullList(bookId);
            return this;
        }

        public ConditionBuilder bookIdList(List<Integer> bookId){
            this.bookIdList = bookId;
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

        private Msg obj;

        public Builder(){
            this.obj = new Msg();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder msgUserId(Integer msgUserId){
            this.obj.setMsgUserId(msgUserId);
            return this;
        }
        public Builder msgUserName(String msgUserName){
            this.obj.setMsgUserName(msgUserName);
            return this;
        }
        public Builder msgUserGender(String msgUserGender){
            this.obj.setMsgUserGender(msgUserGender);
            return this;
        }
        public Builder msgContent(String msgContent){
            this.obj.setMsgContent(msgContent);
            return this;
        }
        public Builder msgTime(java.time.LocalDateTime msgTime){
            this.obj.setMsgTime(msgTime);
            return this;
        }
        public Builder msgUserImgUrl(String msgUserImgUrl){
            this.obj.setMsgUserImgUrl(msgUserImgUrl);
            return this;
        }
        public Builder bookId(Integer bookId){
            this.obj.setBookId(bookId);
            return this;
        }
        public Builder parentId(Integer parentId){
            this.obj.setParentId(parentId);
            return this;
        }
        public Msg build(){return obj;}
    }

}
