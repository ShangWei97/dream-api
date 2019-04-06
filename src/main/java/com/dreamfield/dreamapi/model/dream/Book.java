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
public class Book implements Serializable {

    private static final long serialVersionUID = 1554545975962L;


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
    private String bookImgUrl;

    /**
    * 
    * isNullAble:1
    */
    private String bookName;

    /**
    * 
    * isNullAble:1
    */
    private String bookAuthor;

    /**
    * 
    * isNullAble:1
    */
    private java.math.BigDecimal bookPrice;

    /**
    * 
    * isNullAble:1
    */
    private java.math.BigDecimal bookPriceNow;

    /**
    * 
    * isNullAble:1
    */
    private String bookNewType;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime bookTime;

    /**
    * 
    * isNullAble:1
    */
    private String bookType;

    /**
    * 
    * isNullAble:1
    */
    private String bookSBNNum;

    /**
    * 
    * isNullAble:1
    */
    private Integer newUserId;

    /**
    * 默认为1，默认为没有卖出去
    * isNullAble:0,defaultVal:1
    */
    private Integer valid;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

    public void setBookImgUrl(String bookImgUrl){this.bookImgUrl = bookImgUrl;}

    public String getBookImgUrl(){return this.bookImgUrl;}

    public void setBookName(String bookName){this.bookName = bookName;}

    public String getBookName(){return this.bookName;}

    public void setBookAuthor(String bookAuthor){this.bookAuthor = bookAuthor;}

    public String getBookAuthor(){return this.bookAuthor;}

    public void setBookPrice(java.math.BigDecimal bookPrice){this.bookPrice = bookPrice;}

    public java.math.BigDecimal getBookPrice(){return this.bookPrice;}

    public void setBookPriceNow(java.math.BigDecimal bookPriceNow){this.bookPriceNow = bookPriceNow;}

    public java.math.BigDecimal getBookPriceNow(){return this.bookPriceNow;}

    public void setBookNewType(String bookNewType){this.bookNewType = bookNewType;}

    public String getBookNewType(){return this.bookNewType;}

    public void setBookTime(java.time.LocalDateTime bookTime){this.bookTime = bookTime;}

    public java.time.LocalDateTime getBookTime(){return this.bookTime;}

    public void setBookType(String bookType){this.bookType = bookType;}

    public String getBookType(){return this.bookType;}

    public void setBookSBNNum(String bookSBNNum){this.bookSBNNum = bookSBNNum;}

    public String getBookSBNNum(){return this.bookSBNNum;}

    public void setNewUserId(Integer newUserId){this.newUserId = newUserId;}

    public Integer getNewUserId(){return this.newUserId;}

    public void setValid(Integer valid){this.valid = valid;}

    public Integer getValid(){return this.valid;}
    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                "userId='" + userId + '\'' +
                "bookImgUrl='" + bookImgUrl + '\'' +
                "bookName='" + bookName + '\'' +
                "bookAuthor='" + bookAuthor + '\'' +
                "bookPrice='" + bookPrice + '\'' +
                "bookPriceNow='" + bookPriceNow + '\'' +
                "bookNewType='" + bookNewType + '\'' +
                "bookTime='" + bookTime + '\'' +
                "bookType='" + bookType + '\'' +
                "bookSBNNum='" + bookSBNNum + '\'' +
                "newUserId='" + newUserId + '\'' +
                "valid='" + valid + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Book set;

        private ConditionBuilder where;

        public UpdateBuilder set(Book set){
            this.set = set;
            return this;
        }

        public Book getSet(){
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

    public static class QueryBuilder extends Book{
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

        private List<String> bookImgUrlList;

        public List<String> getBookImgUrlList(){return this.bookImgUrlList;}


        private List<String> fuzzyBookImgUrl;

        public List<String> getFuzzyBookImgUrl(){return this.fuzzyBookImgUrl;}

        private List<String> rightFuzzyBookImgUrl;

        public List<String> getRightFuzzyBookImgUrl(){return this.rightFuzzyBookImgUrl;}
        private List<String> bookNameList;

        public List<String> getBookNameList(){return this.bookNameList;}


        private List<String> fuzzyBookName;

        public List<String> getFuzzyBookName(){return this.fuzzyBookName;}

        private List<String> rightFuzzyBookName;

        public List<String> getRightFuzzyBookName(){return this.rightFuzzyBookName;}
        private List<String> bookAuthorList;

        public List<String> getBookAuthorList(){return this.bookAuthorList;}


        private List<String> fuzzyBookAuthor;

        public List<String> getFuzzyBookAuthor(){return this.fuzzyBookAuthor;}

        private List<String> rightFuzzyBookAuthor;

        public List<String> getRightFuzzyBookAuthor(){return this.rightFuzzyBookAuthor;}
        private List<java.math.BigDecimal> bookPriceList;

        public List<java.math.BigDecimal> getBookPriceList(){return this.bookPriceList;}

        private java.math.BigDecimal bookPriceSt;

        private java.math.BigDecimal bookPriceEd;

        public java.math.BigDecimal getBookPriceSt(){return this.bookPriceSt;}

        public java.math.BigDecimal getBookPriceEd(){return this.bookPriceEd;}

        private List<java.math.BigDecimal> bookPriceNowList;

        public List<java.math.BigDecimal> getBookPriceNowList(){return this.bookPriceNowList;}

        private java.math.BigDecimal bookPriceNowSt;

        private java.math.BigDecimal bookPriceNowEd;

        public java.math.BigDecimal getBookPriceNowSt(){return this.bookPriceNowSt;}

        public java.math.BigDecimal getBookPriceNowEd(){return this.bookPriceNowEd;}

        private List<String> bookNewTypeList;

        public List<String> getBookNewTypeList(){return this.bookNewTypeList;}


        private List<String> fuzzyBookNewType;

        public List<String> getFuzzyBookNewType(){return this.fuzzyBookNewType;}

        private List<String> rightFuzzyBookNewType;

        public List<String> getRightFuzzyBookNewType(){return this.rightFuzzyBookNewType;}
        private List<java.time.LocalDateTime> bookTimeList;

        public List<java.time.LocalDateTime> getBookTimeList(){return this.bookTimeList;}

        private java.time.LocalDateTime bookTimeSt;

        private java.time.LocalDateTime bookTimeEd;

        public java.time.LocalDateTime getBookTimeSt(){return this.bookTimeSt;}

        public java.time.LocalDateTime getBookTimeEd(){return this.bookTimeEd;}

        private List<String> bookTypeList;

        public List<String> getBookTypeList(){return this.bookTypeList;}


        private List<String> fuzzyBookType;

        public List<String> getFuzzyBookType(){return this.fuzzyBookType;}

        private List<String> rightFuzzyBookType;

        public List<String> getRightFuzzyBookType(){return this.rightFuzzyBookType;}
        private List<String> bookSBNNumList;

        public List<String> getBookSBNNumList(){return this.bookSBNNumList;}


        private List<String> fuzzyBookSBNNum;

        public List<String> getFuzzyBookSBNNum(){return this.fuzzyBookSBNNum;}

        private List<String> rightFuzzyBookSBNNum;

        public List<String> getRightFuzzyBookSBNNum(){return this.rightFuzzyBookSBNNum;}
        private List<Integer> newUserIdList;

        public List<Integer> getNewUserIdList(){return this.newUserIdList;}

        private Integer newUserIdSt;

        private Integer newUserIdEd;

        public Integer getNewUserIdSt(){return this.newUserIdSt;}

        public Integer getNewUserIdEd(){return this.newUserIdEd;}

        private List<Integer> validList;

        public List<Integer> getValidList(){return this.validList;}

        private Integer validSt;

        private Integer validEd;

        public Integer getValidSt(){return this.validSt;}

        public Integer getValidEd(){return this.validEd;}

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

        public QueryBuilder fuzzyBookImgUrl (List<String> fuzzyBookImgUrl){
            this.fuzzyBookImgUrl = fuzzyBookImgUrl;
            return this;
        }

        public QueryBuilder fuzzyBookImgUrl (String ... fuzzyBookImgUrl){
            this.fuzzyBookImgUrl = solveNullList(fuzzyBookImgUrl);
            return this;
        }

        public QueryBuilder rightFuzzyBookImgUrl (List<String> rightFuzzyBookImgUrl){
            this.rightFuzzyBookImgUrl = rightFuzzyBookImgUrl;
            return this;
        }

        public QueryBuilder rightFuzzyBookImgUrl (String ... rightFuzzyBookImgUrl){
            this.rightFuzzyBookImgUrl = solveNullList(rightFuzzyBookImgUrl);
            return this;
        }

        public QueryBuilder bookImgUrl(String bookImgUrl){
            setBookImgUrl(bookImgUrl);
            return this;
        }

        public QueryBuilder bookImgUrlList(String ... bookImgUrl){
            this.bookImgUrlList = solveNullList(bookImgUrl);
            return this;
        }

        public QueryBuilder bookImgUrlList(List<String> bookImgUrl){
            this.bookImgUrlList = bookImgUrl;
            return this;
        }

        public QueryBuilder fetchBookImgUrl(){
            setFetchFields("fetchFields","bookImgUrl");
            return this;
        }

        public QueryBuilder excludeBookImgUrl(){
            setFetchFields("excludeFields","bookImgUrl");
            return this;
        }

        public QueryBuilder fuzzyBookName (List<String> fuzzyBookName){
            this.fuzzyBookName = fuzzyBookName;
            return this;
        }

        public QueryBuilder fuzzyBookName (String ... fuzzyBookName){
            this.fuzzyBookName = solveNullList(fuzzyBookName);
            return this;
        }

        public QueryBuilder rightFuzzyBookName (List<String> rightFuzzyBookName){
            this.rightFuzzyBookName = rightFuzzyBookName;
            return this;
        }

        public QueryBuilder rightFuzzyBookName (String ... rightFuzzyBookName){
            this.rightFuzzyBookName = solveNullList(rightFuzzyBookName);
            return this;
        }

        public QueryBuilder bookName(String bookName){
            setBookName(bookName);
            return this;
        }

        public QueryBuilder bookNameList(String ... bookName){
            this.bookNameList = solveNullList(bookName);
            return this;
        }

        public QueryBuilder bookNameList(List<String> bookName){
            this.bookNameList = bookName;
            return this;
        }

        public QueryBuilder fetchBookName(){
            setFetchFields("fetchFields","bookName");
            return this;
        }

        public QueryBuilder excludeBookName(){
            setFetchFields("excludeFields","bookName");
            return this;
        }

        public QueryBuilder fuzzyBookAuthor (List<String> fuzzyBookAuthor){
            this.fuzzyBookAuthor = fuzzyBookAuthor;
            return this;
        }

        public QueryBuilder fuzzyBookAuthor (String ... fuzzyBookAuthor){
            this.fuzzyBookAuthor = solveNullList(fuzzyBookAuthor);
            return this;
        }

        public QueryBuilder rightFuzzyBookAuthor (List<String> rightFuzzyBookAuthor){
            this.rightFuzzyBookAuthor = rightFuzzyBookAuthor;
            return this;
        }

        public QueryBuilder rightFuzzyBookAuthor (String ... rightFuzzyBookAuthor){
            this.rightFuzzyBookAuthor = solveNullList(rightFuzzyBookAuthor);
            return this;
        }

        public QueryBuilder bookAuthor(String bookAuthor){
            setBookAuthor(bookAuthor);
            return this;
        }

        public QueryBuilder bookAuthorList(String ... bookAuthor){
            this.bookAuthorList = solveNullList(bookAuthor);
            return this;
        }

        public QueryBuilder bookAuthorList(List<String> bookAuthor){
            this.bookAuthorList = bookAuthor;
            return this;
        }

        public QueryBuilder fetchBookAuthor(){
            setFetchFields("fetchFields","bookAuthor");
            return this;
        }

        public QueryBuilder excludeBookAuthor(){
            setFetchFields("excludeFields","bookAuthor");
            return this;
        }

        public QueryBuilder bookPriceBetWeen(java.math.BigDecimal bookPriceSt,java.math.BigDecimal bookPriceEd){
            this.bookPriceSt = bookPriceSt;
            this.bookPriceEd = bookPriceEd;
            return this;
        }

        public QueryBuilder bookPriceGreaterEqThan(java.math.BigDecimal bookPriceSt){
            this.bookPriceSt = bookPriceSt;
            return this;
        }
        public QueryBuilder bookPriceLessEqThan(java.math.BigDecimal bookPriceEd){
            this.bookPriceEd = bookPriceEd;
            return this;
        }


        public QueryBuilder bookPrice(java.math.BigDecimal bookPrice){
            setBookPrice(bookPrice);
            return this;
        }

        public QueryBuilder bookPriceList(java.math.BigDecimal ... bookPrice){
            this.bookPriceList = solveNullList(bookPrice);
            return this;
        }

        public QueryBuilder bookPriceList(List<java.math.BigDecimal> bookPrice){
            this.bookPriceList = bookPrice;
            return this;
        }

        public QueryBuilder fetchBookPrice(){
            setFetchFields("fetchFields","bookPrice");
            return this;
        }

        public QueryBuilder excludeBookPrice(){
            setFetchFields("excludeFields","bookPrice");
            return this;
        }

        public QueryBuilder bookPriceNowBetWeen(java.math.BigDecimal bookPriceNowSt,java.math.BigDecimal bookPriceNowEd){
            this.bookPriceNowSt = bookPriceNowSt;
            this.bookPriceNowEd = bookPriceNowEd;
            return this;
        }

        public QueryBuilder bookPriceNowGreaterEqThan(java.math.BigDecimal bookPriceNowSt){
            this.bookPriceNowSt = bookPriceNowSt;
            return this;
        }
        public QueryBuilder bookPriceNowLessEqThan(java.math.BigDecimal bookPriceNowEd){
            this.bookPriceNowEd = bookPriceNowEd;
            return this;
        }


        public QueryBuilder bookPriceNow(java.math.BigDecimal bookPriceNow){
            setBookPriceNow(bookPriceNow);
            return this;
        }

        public QueryBuilder bookPriceNowList(java.math.BigDecimal ... bookPriceNow){
            this.bookPriceNowList = solveNullList(bookPriceNow);
            return this;
        }

        public QueryBuilder bookPriceNowList(List<java.math.BigDecimal> bookPriceNow){
            this.bookPriceNowList = bookPriceNow;
            return this;
        }

        public QueryBuilder fetchBookPriceNow(){
            setFetchFields("fetchFields","bookPriceNow");
            return this;
        }

        public QueryBuilder excludeBookPriceNow(){
            setFetchFields("excludeFields","bookPriceNow");
            return this;
        }

        public QueryBuilder fuzzyBookNewType (List<String> fuzzyBookNewType){
            this.fuzzyBookNewType = fuzzyBookNewType;
            return this;
        }

        public QueryBuilder fuzzyBookNewType (String ... fuzzyBookNewType){
            this.fuzzyBookNewType = solveNullList(fuzzyBookNewType);
            return this;
        }

        public QueryBuilder rightFuzzyBookNewType (List<String> rightFuzzyBookNewType){
            this.rightFuzzyBookNewType = rightFuzzyBookNewType;
            return this;
        }

        public QueryBuilder rightFuzzyBookNewType (String ... rightFuzzyBookNewType){
            this.rightFuzzyBookNewType = solveNullList(rightFuzzyBookNewType);
            return this;
        }

        public QueryBuilder bookNewType(String bookNewType){
            setBookNewType(bookNewType);
            return this;
        }

        public QueryBuilder bookNewTypeList(String ... bookNewType){
            this.bookNewTypeList = solveNullList(bookNewType);
            return this;
        }

        public QueryBuilder bookNewTypeList(List<String> bookNewType){
            this.bookNewTypeList = bookNewType;
            return this;
        }

        public QueryBuilder fetchBookNewType(){
            setFetchFields("fetchFields","bookNewType");
            return this;
        }

        public QueryBuilder excludeBookNewType(){
            setFetchFields("excludeFields","bookNewType");
            return this;
        }

        public QueryBuilder bookTimeBetWeen(java.time.LocalDateTime bookTimeSt,java.time.LocalDateTime bookTimeEd){
            this.bookTimeSt = bookTimeSt;
            this.bookTimeEd = bookTimeEd;
            return this;
        }

        public QueryBuilder bookTimeGreaterEqThan(java.time.LocalDateTime bookTimeSt){
            this.bookTimeSt = bookTimeSt;
            return this;
        }
        public QueryBuilder bookTimeLessEqThan(java.time.LocalDateTime bookTimeEd){
            this.bookTimeEd = bookTimeEd;
            return this;
        }


        public QueryBuilder bookTime(java.time.LocalDateTime bookTime){
            setBookTime(bookTime);
            return this;
        }

        public QueryBuilder bookTimeList(java.time.LocalDateTime ... bookTime){
            this.bookTimeList = solveNullList(bookTime);
            return this;
        }

        public QueryBuilder bookTimeList(List<java.time.LocalDateTime> bookTime){
            this.bookTimeList = bookTime;
            return this;
        }

        public QueryBuilder fetchBookTime(){
            setFetchFields("fetchFields","bookTime");
            return this;
        }

        public QueryBuilder excludeBookTime(){
            setFetchFields("excludeFields","bookTime");
            return this;
        }

        public QueryBuilder fuzzyBookType (List<String> fuzzyBookType){
            this.fuzzyBookType = fuzzyBookType;
            return this;
        }

        public QueryBuilder fuzzyBookType (String ... fuzzyBookType){
            this.fuzzyBookType = solveNullList(fuzzyBookType);
            return this;
        }

        public QueryBuilder rightFuzzyBookType (List<String> rightFuzzyBookType){
            this.rightFuzzyBookType = rightFuzzyBookType;
            return this;
        }

        public QueryBuilder rightFuzzyBookType (String ... rightFuzzyBookType){
            this.rightFuzzyBookType = solveNullList(rightFuzzyBookType);
            return this;
        }

        public QueryBuilder bookType(String bookType){
            setBookType(bookType);
            return this;
        }

        public QueryBuilder bookTypeList(String ... bookType){
            this.bookTypeList = solveNullList(bookType);
            return this;
        }

        public QueryBuilder bookTypeList(List<String> bookType){
            this.bookTypeList = bookType;
            return this;
        }

        public QueryBuilder fetchBookType(){
            setFetchFields("fetchFields","bookType");
            return this;
        }

        public QueryBuilder excludeBookType(){
            setFetchFields("excludeFields","bookType");
            return this;
        }

        public QueryBuilder fuzzyBookSBNNum (List<String> fuzzyBookSBNNum){
            this.fuzzyBookSBNNum = fuzzyBookSBNNum;
            return this;
        }

        public QueryBuilder fuzzyBookSBNNum (String ... fuzzyBookSBNNum){
            this.fuzzyBookSBNNum = solveNullList(fuzzyBookSBNNum);
            return this;
        }

        public QueryBuilder rightFuzzyBookSBNNum (List<String> rightFuzzyBookSBNNum){
            this.rightFuzzyBookSBNNum = rightFuzzyBookSBNNum;
            return this;
        }

        public QueryBuilder rightFuzzyBookSBNNum (String ... rightFuzzyBookSBNNum){
            this.rightFuzzyBookSBNNum = solveNullList(rightFuzzyBookSBNNum);
            return this;
        }

        public QueryBuilder bookSBNNum(String bookSBNNum){
            setBookSBNNum(bookSBNNum);
            return this;
        }

        public QueryBuilder bookSBNNumList(String ... bookSBNNum){
            this.bookSBNNumList = solveNullList(bookSBNNum);
            return this;
        }

        public QueryBuilder bookSBNNumList(List<String> bookSBNNum){
            this.bookSBNNumList = bookSBNNum;
            return this;
        }

        public QueryBuilder fetchBookSBNNum(){
            setFetchFields("fetchFields","bookSBNNum");
            return this;
        }

        public QueryBuilder excludeBookSBNNum(){
            setFetchFields("excludeFields","bookSBNNum");
            return this;
        }

        public QueryBuilder newUserIdBetWeen(Integer newUserIdSt,Integer newUserIdEd){
            this.newUserIdSt = newUserIdSt;
            this.newUserIdEd = newUserIdEd;
            return this;
        }

        public QueryBuilder newUserIdGreaterEqThan(Integer newUserIdSt){
            this.newUserIdSt = newUserIdSt;
            return this;
        }
        public QueryBuilder newUserIdLessEqThan(Integer newUserIdEd){
            this.newUserIdEd = newUserIdEd;
            return this;
        }


        public QueryBuilder newUserId(Integer newUserId){
            setNewUserId(newUserId);
            return this;
        }

        public QueryBuilder newUserIdList(Integer ... newUserId){
            this.newUserIdList = solveNullList(newUserId);
            return this;
        }

        public QueryBuilder newUserIdList(List<Integer> newUserId){
            this.newUserIdList = newUserId;
            return this;
        }

        public QueryBuilder fetchNewUserId(){
            setFetchFields("fetchFields","newUserId");
            return this;
        }

        public QueryBuilder excludeNewUserId(){
            setFetchFields("excludeFields","newUserId");
            return this;
        }

        public QueryBuilder validBetWeen(Integer validSt,Integer validEd){
            this.validSt = validSt;
            this.validEd = validEd;
            return this;
        }

        public QueryBuilder validGreaterEqThan(Integer validSt){
            this.validSt = validSt;
            return this;
        }
        public QueryBuilder validLessEqThan(Integer validEd){
            this.validEd = validEd;
            return this;
        }


        public QueryBuilder valid(Integer valid){
            setValid(valid);
            return this;
        }

        public QueryBuilder validList(Integer ... valid){
            this.validList = solveNullList(valid);
            return this;
        }

        public QueryBuilder validList(List<Integer> valid){
            this.validList = valid;
            return this;
        }

        public QueryBuilder fetchValid(){
            setFetchFields("fetchFields","valid");
            return this;
        }

        public QueryBuilder excludeValid(){
            setFetchFields("excludeFields","valid");
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

        public Book build(){return this;}
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

        private List<String> bookImgUrlList;

        public List<String> getBookImgUrlList(){return this.bookImgUrlList;}


        private List<String> fuzzyBookImgUrl;

        public List<String> getFuzzyBookImgUrl(){return this.fuzzyBookImgUrl;}

        private List<String> rightFuzzyBookImgUrl;

        public List<String> getRightFuzzyBookImgUrl(){return this.rightFuzzyBookImgUrl;}
        private List<String> bookNameList;

        public List<String> getBookNameList(){return this.bookNameList;}


        private List<String> fuzzyBookName;

        public List<String> getFuzzyBookName(){return this.fuzzyBookName;}

        private List<String> rightFuzzyBookName;

        public List<String> getRightFuzzyBookName(){return this.rightFuzzyBookName;}
        private List<String> bookAuthorList;

        public List<String> getBookAuthorList(){return this.bookAuthorList;}


        private List<String> fuzzyBookAuthor;

        public List<String> getFuzzyBookAuthor(){return this.fuzzyBookAuthor;}

        private List<String> rightFuzzyBookAuthor;

        public List<String> getRightFuzzyBookAuthor(){return this.rightFuzzyBookAuthor;}
        private List<java.math.BigDecimal> bookPriceList;

        public List<java.math.BigDecimal> getBookPriceList(){return this.bookPriceList;}

        private java.math.BigDecimal bookPriceSt;

        private java.math.BigDecimal bookPriceEd;

        public java.math.BigDecimal getBookPriceSt(){return this.bookPriceSt;}

        public java.math.BigDecimal getBookPriceEd(){return this.bookPriceEd;}

        private List<java.math.BigDecimal> bookPriceNowList;

        public List<java.math.BigDecimal> getBookPriceNowList(){return this.bookPriceNowList;}

        private java.math.BigDecimal bookPriceNowSt;

        private java.math.BigDecimal bookPriceNowEd;

        public java.math.BigDecimal getBookPriceNowSt(){return this.bookPriceNowSt;}

        public java.math.BigDecimal getBookPriceNowEd(){return this.bookPriceNowEd;}

        private List<String> bookNewTypeList;

        public List<String> getBookNewTypeList(){return this.bookNewTypeList;}


        private List<String> fuzzyBookNewType;

        public List<String> getFuzzyBookNewType(){return this.fuzzyBookNewType;}

        private List<String> rightFuzzyBookNewType;

        public List<String> getRightFuzzyBookNewType(){return this.rightFuzzyBookNewType;}
        private List<java.time.LocalDateTime> bookTimeList;

        public List<java.time.LocalDateTime> getBookTimeList(){return this.bookTimeList;}

        private java.time.LocalDateTime bookTimeSt;

        private java.time.LocalDateTime bookTimeEd;

        public java.time.LocalDateTime getBookTimeSt(){return this.bookTimeSt;}

        public java.time.LocalDateTime getBookTimeEd(){return this.bookTimeEd;}

        private List<String> bookTypeList;

        public List<String> getBookTypeList(){return this.bookTypeList;}


        private List<String> fuzzyBookType;

        public List<String> getFuzzyBookType(){return this.fuzzyBookType;}

        private List<String> rightFuzzyBookType;

        public List<String> getRightFuzzyBookType(){return this.rightFuzzyBookType;}
        private List<String> bookSBNNumList;

        public List<String> getBookSBNNumList(){return this.bookSBNNumList;}


        private List<String> fuzzyBookSBNNum;

        public List<String> getFuzzyBookSBNNum(){return this.fuzzyBookSBNNum;}

        private List<String> rightFuzzyBookSBNNum;

        public List<String> getRightFuzzyBookSBNNum(){return this.rightFuzzyBookSBNNum;}
        private List<Integer> newUserIdList;

        public List<Integer> getNewUserIdList(){return this.newUserIdList;}

        private Integer newUserIdSt;

        private Integer newUserIdEd;

        public Integer getNewUserIdSt(){return this.newUserIdSt;}

        public Integer getNewUserIdEd(){return this.newUserIdEd;}

        private List<Integer> validList;

        public List<Integer> getValidList(){return this.validList;}

        private Integer validSt;

        private Integer validEd;

        public Integer getValidSt(){return this.validSt;}

        public Integer getValidEd(){return this.validEd;}


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

        public ConditionBuilder fuzzyBookImgUrl (List<String> fuzzyBookImgUrl){
            this.fuzzyBookImgUrl = fuzzyBookImgUrl;
            return this;
        }

        public ConditionBuilder fuzzyBookImgUrl (String ... fuzzyBookImgUrl){
            this.fuzzyBookImgUrl = solveNullList(fuzzyBookImgUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyBookImgUrl (List<String> rightFuzzyBookImgUrl){
            this.rightFuzzyBookImgUrl = rightFuzzyBookImgUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyBookImgUrl (String ... rightFuzzyBookImgUrl){
            this.rightFuzzyBookImgUrl = solveNullList(rightFuzzyBookImgUrl);
            return this;
        }

        public ConditionBuilder bookImgUrlList(String ... bookImgUrl){
            this.bookImgUrlList = solveNullList(bookImgUrl);
            return this;
        }

        public ConditionBuilder bookImgUrlList(List<String> bookImgUrl){
            this.bookImgUrlList = bookImgUrl;
            return this;
        }

        public ConditionBuilder fuzzyBookName (List<String> fuzzyBookName){
            this.fuzzyBookName = fuzzyBookName;
            return this;
        }

        public ConditionBuilder fuzzyBookName (String ... fuzzyBookName){
            this.fuzzyBookName = solveNullList(fuzzyBookName);
            return this;
        }

        public ConditionBuilder rightFuzzyBookName (List<String> rightFuzzyBookName){
            this.rightFuzzyBookName = rightFuzzyBookName;
            return this;
        }

        public ConditionBuilder rightFuzzyBookName (String ... rightFuzzyBookName){
            this.rightFuzzyBookName = solveNullList(rightFuzzyBookName);
            return this;
        }

        public ConditionBuilder bookNameList(String ... bookName){
            this.bookNameList = solveNullList(bookName);
            return this;
        }

        public ConditionBuilder bookNameList(List<String> bookName){
            this.bookNameList = bookName;
            return this;
        }

        public ConditionBuilder fuzzyBookAuthor (List<String> fuzzyBookAuthor){
            this.fuzzyBookAuthor = fuzzyBookAuthor;
            return this;
        }

        public ConditionBuilder fuzzyBookAuthor (String ... fuzzyBookAuthor){
            this.fuzzyBookAuthor = solveNullList(fuzzyBookAuthor);
            return this;
        }

        public ConditionBuilder rightFuzzyBookAuthor (List<String> rightFuzzyBookAuthor){
            this.rightFuzzyBookAuthor = rightFuzzyBookAuthor;
            return this;
        }

        public ConditionBuilder rightFuzzyBookAuthor (String ... rightFuzzyBookAuthor){
            this.rightFuzzyBookAuthor = solveNullList(rightFuzzyBookAuthor);
            return this;
        }

        public ConditionBuilder bookAuthorList(String ... bookAuthor){
            this.bookAuthorList = solveNullList(bookAuthor);
            return this;
        }

        public ConditionBuilder bookAuthorList(List<String> bookAuthor){
            this.bookAuthorList = bookAuthor;
            return this;
        }

        public ConditionBuilder bookPriceBetWeen(java.math.BigDecimal bookPriceSt,java.math.BigDecimal bookPriceEd){
            this.bookPriceSt = bookPriceSt;
            this.bookPriceEd = bookPriceEd;
            return this;
        }

        public ConditionBuilder bookPriceGreaterEqThan(java.math.BigDecimal bookPriceSt){
            this.bookPriceSt = bookPriceSt;
            return this;
        }
        public ConditionBuilder bookPriceLessEqThan(java.math.BigDecimal bookPriceEd){
            this.bookPriceEd = bookPriceEd;
            return this;
        }


        public ConditionBuilder bookPriceList(java.math.BigDecimal ... bookPrice){
            this.bookPriceList = solveNullList(bookPrice);
            return this;
        }

        public ConditionBuilder bookPriceList(List<java.math.BigDecimal> bookPrice){
            this.bookPriceList = bookPrice;
            return this;
        }

        public ConditionBuilder bookPriceNowBetWeen(java.math.BigDecimal bookPriceNowSt,java.math.BigDecimal bookPriceNowEd){
            this.bookPriceNowSt = bookPriceNowSt;
            this.bookPriceNowEd = bookPriceNowEd;
            return this;
        }

        public ConditionBuilder bookPriceNowGreaterEqThan(java.math.BigDecimal bookPriceNowSt){
            this.bookPriceNowSt = bookPriceNowSt;
            return this;
        }
        public ConditionBuilder bookPriceNowLessEqThan(java.math.BigDecimal bookPriceNowEd){
            this.bookPriceNowEd = bookPriceNowEd;
            return this;
        }


        public ConditionBuilder bookPriceNowList(java.math.BigDecimal ... bookPriceNow){
            this.bookPriceNowList = solveNullList(bookPriceNow);
            return this;
        }

        public ConditionBuilder bookPriceNowList(List<java.math.BigDecimal> bookPriceNow){
            this.bookPriceNowList = bookPriceNow;
            return this;
        }

        public ConditionBuilder fuzzyBookNewType (List<String> fuzzyBookNewType){
            this.fuzzyBookNewType = fuzzyBookNewType;
            return this;
        }

        public ConditionBuilder fuzzyBookNewType (String ... fuzzyBookNewType){
            this.fuzzyBookNewType = solveNullList(fuzzyBookNewType);
            return this;
        }

        public ConditionBuilder rightFuzzyBookNewType (List<String> rightFuzzyBookNewType){
            this.rightFuzzyBookNewType = rightFuzzyBookNewType;
            return this;
        }

        public ConditionBuilder rightFuzzyBookNewType (String ... rightFuzzyBookNewType){
            this.rightFuzzyBookNewType = solveNullList(rightFuzzyBookNewType);
            return this;
        }

        public ConditionBuilder bookNewTypeList(String ... bookNewType){
            this.bookNewTypeList = solveNullList(bookNewType);
            return this;
        }

        public ConditionBuilder bookNewTypeList(List<String> bookNewType){
            this.bookNewTypeList = bookNewType;
            return this;
        }

        public ConditionBuilder bookTimeBetWeen(java.time.LocalDateTime bookTimeSt,java.time.LocalDateTime bookTimeEd){
            this.bookTimeSt = bookTimeSt;
            this.bookTimeEd = bookTimeEd;
            return this;
        }

        public ConditionBuilder bookTimeGreaterEqThan(java.time.LocalDateTime bookTimeSt){
            this.bookTimeSt = bookTimeSt;
            return this;
        }
        public ConditionBuilder bookTimeLessEqThan(java.time.LocalDateTime bookTimeEd){
            this.bookTimeEd = bookTimeEd;
            return this;
        }


        public ConditionBuilder bookTimeList(java.time.LocalDateTime ... bookTime){
            this.bookTimeList = solveNullList(bookTime);
            return this;
        }

        public ConditionBuilder bookTimeList(List<java.time.LocalDateTime> bookTime){
            this.bookTimeList = bookTime;
            return this;
        }

        public ConditionBuilder fuzzyBookType (List<String> fuzzyBookType){
            this.fuzzyBookType = fuzzyBookType;
            return this;
        }

        public ConditionBuilder fuzzyBookType (String ... fuzzyBookType){
            this.fuzzyBookType = solveNullList(fuzzyBookType);
            return this;
        }

        public ConditionBuilder rightFuzzyBookType (List<String> rightFuzzyBookType){
            this.rightFuzzyBookType = rightFuzzyBookType;
            return this;
        }

        public ConditionBuilder rightFuzzyBookType (String ... rightFuzzyBookType){
            this.rightFuzzyBookType = solveNullList(rightFuzzyBookType);
            return this;
        }

        public ConditionBuilder bookTypeList(String ... bookType){
            this.bookTypeList = solveNullList(bookType);
            return this;
        }

        public ConditionBuilder bookTypeList(List<String> bookType){
            this.bookTypeList = bookType;
            return this;
        }

        public ConditionBuilder fuzzyBookSBNNum (List<String> fuzzyBookSBNNum){
            this.fuzzyBookSBNNum = fuzzyBookSBNNum;
            return this;
        }

        public ConditionBuilder fuzzyBookSBNNum (String ... fuzzyBookSBNNum){
            this.fuzzyBookSBNNum = solveNullList(fuzzyBookSBNNum);
            return this;
        }

        public ConditionBuilder rightFuzzyBookSBNNum (List<String> rightFuzzyBookSBNNum){
            this.rightFuzzyBookSBNNum = rightFuzzyBookSBNNum;
            return this;
        }

        public ConditionBuilder rightFuzzyBookSBNNum (String ... rightFuzzyBookSBNNum){
            this.rightFuzzyBookSBNNum = solveNullList(rightFuzzyBookSBNNum);
            return this;
        }

        public ConditionBuilder bookSBNNumList(String ... bookSBNNum){
            this.bookSBNNumList = solveNullList(bookSBNNum);
            return this;
        }

        public ConditionBuilder bookSBNNumList(List<String> bookSBNNum){
            this.bookSBNNumList = bookSBNNum;
            return this;
        }

        public ConditionBuilder newUserIdBetWeen(Integer newUserIdSt,Integer newUserIdEd){
            this.newUserIdSt = newUserIdSt;
            this.newUserIdEd = newUserIdEd;
            return this;
        }

        public ConditionBuilder newUserIdGreaterEqThan(Integer newUserIdSt){
            this.newUserIdSt = newUserIdSt;
            return this;
        }
        public ConditionBuilder newUserIdLessEqThan(Integer newUserIdEd){
            this.newUserIdEd = newUserIdEd;
            return this;
        }


        public ConditionBuilder newUserIdList(Integer ... newUserId){
            this.newUserIdList = solveNullList(newUserId);
            return this;
        }

        public ConditionBuilder newUserIdList(List<Integer> newUserId){
            this.newUserIdList = newUserId;
            return this;
        }

        public ConditionBuilder validBetWeen(Integer validSt,Integer validEd){
            this.validSt = validSt;
            this.validEd = validEd;
            return this;
        }

        public ConditionBuilder validGreaterEqThan(Integer validSt){
            this.validSt = validSt;
            return this;
        }
        public ConditionBuilder validLessEqThan(Integer validEd){
            this.validEd = validEd;
            return this;
        }


        public ConditionBuilder validList(Integer ... valid){
            this.validList = solveNullList(valid);
            return this;
        }

        public ConditionBuilder validList(List<Integer> valid){
            this.validList = valid;
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

        private Book obj;

        public Builder(){
            this.obj = new Book();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder bookImgUrl(String bookImgUrl){
            this.obj.setBookImgUrl(bookImgUrl);
            return this;
        }
        public Builder bookName(String bookName){
            this.obj.setBookName(bookName);
            return this;
        }
        public Builder bookAuthor(String bookAuthor){
            this.obj.setBookAuthor(bookAuthor);
            return this;
        }
        public Builder bookPrice(java.math.BigDecimal bookPrice){
            this.obj.setBookPrice(bookPrice);
            return this;
        }
        public Builder bookPriceNow(java.math.BigDecimal bookPriceNow){
            this.obj.setBookPriceNow(bookPriceNow);
            return this;
        }
        public Builder bookNewType(String bookNewType){
            this.obj.setBookNewType(bookNewType);
            return this;
        }
        public Builder bookTime(java.time.LocalDateTime bookTime){
            this.obj.setBookTime(bookTime);
            return this;
        }
        public Builder bookType(String bookType){
            this.obj.setBookType(bookType);
            return this;
        }
        public Builder bookSBNNum(String bookSBNNum){
            this.obj.setBookSBNNum(bookSBNNum);
            return this;
        }
        public Builder newUserId(Integer newUserId){
            this.obj.setNewUserId(newUserId);
            return this;
        }
        public Builder valid(Integer valid){
            this.obj.setValid(valid);
            return this;
        }
        public Book build(){return obj;}
    }

}
