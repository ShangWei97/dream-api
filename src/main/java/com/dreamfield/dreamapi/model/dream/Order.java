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
public class Order implements Serializable {

    private static final long serialVersionUID = 1555055767073L;


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
    private java.time.LocalDateTime createTime;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime updateTime;

    /**
    * 
    * isNullAble:1
    */
    private String status;

    /**
    * 
    * isNullAble:0
    */
    private Integer sellerId;

    /**
    * 
    * isNullAble:0
    */
    private Integer buyerId;

    /**
    * 
    * isNullAble:1
    */
    private Integer bookId;

    /**
    * 
    * isNullAble:1
    */
    private java.math.BigDecimal price;

    /**
    * 
    * isNullAble:1
    */
    private Integer statusId;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setUpdateTime(java.time.LocalDateTime updateTime){this.updateTime = updateTime;}

    public java.time.LocalDateTime getUpdateTime(){return this.updateTime;}

    public void setStatus(String status){this.status = status;}

    public String getStatus(){return this.status;}

    public void setSellerId(Integer sellerId){this.sellerId = sellerId;}

    public Integer getSellerId(){return this.sellerId;}

    public void setBuyerId(Integer buyerId){this.buyerId = buyerId;}

    public Integer getBuyerId(){return this.buyerId;}

    public void setBookId(Integer bookId){this.bookId = bookId;}

    public Integer getBookId(){return this.bookId;}

    public void setPrice(java.math.BigDecimal price){this.price = price;}

    public java.math.BigDecimal getPrice(){return this.price;}

    public void setStatusId(Integer statusId){this.statusId = statusId;}

    public Integer getStatusId(){return this.statusId;}
    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                "createTime='" + createTime + '\'' +
                "updateTime='" + updateTime + '\'' +
                "status='" + status + '\'' +
                "sellerId='" + sellerId + '\'' +
                "buyerId='" + buyerId + '\'' +
                "bookId='" + bookId + '\'' +
                "price='" + price + '\'' +
                "statusId='" + statusId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Order set;

        private ConditionBuilder where;

        public UpdateBuilder set(Order set){
            this.set = set;
            return this;
        }

        public Order getSet(){
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

    public static class QueryBuilder extends Order{
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

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private List<String> statusList;

        public List<String> getStatusList(){return this.statusList;}


        private List<String> fuzzyStatus;

        public List<String> getFuzzyStatus(){return this.fuzzyStatus;}

        private List<String> rightFuzzyStatus;

        public List<String> getRightFuzzyStatus(){return this.rightFuzzyStatus;}
        private List<Integer> sellerIdList;

        public List<Integer> getSellerIdList(){return this.sellerIdList;}

        private Integer sellerIdSt;

        private Integer sellerIdEd;

        public Integer getSellerIdSt(){return this.sellerIdSt;}

        public Integer getSellerIdEd(){return this.sellerIdEd;}

        private List<Integer> buyerIdList;

        public List<Integer> getBuyerIdList(){return this.buyerIdList;}

        private Integer buyerIdSt;

        private Integer buyerIdEd;

        public Integer getBuyerIdSt(){return this.buyerIdSt;}

        public Integer getBuyerIdEd(){return this.buyerIdEd;}

        private List<Integer> bookIdList;

        public List<Integer> getBookIdList(){return this.bookIdList;}

        private Integer bookIdSt;

        private Integer bookIdEd;

        public Integer getBookIdSt(){return this.bookIdSt;}

        public Integer getBookIdEd(){return this.bookIdEd;}

        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<Integer> statusIdList;

        public List<Integer> getStatusIdList(){return this.statusIdList;}

        private Integer statusIdSt;

        private Integer statusIdEd;

        public Integer getStatusIdSt(){return this.statusIdSt;}

        public Integer getStatusIdEd(){return this.statusIdEd;}

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

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(java.time.LocalDateTime updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }

        public QueryBuilder fuzzyStatus (List<String> fuzzyStatus){
            this.fuzzyStatus = fuzzyStatus;
            return this;
        }

        public QueryBuilder fuzzyStatus (String ... fuzzyStatus){
            this.fuzzyStatus = solveNullList(fuzzyStatus);
            return this;
        }

        public QueryBuilder rightFuzzyStatus (List<String> rightFuzzyStatus){
            this.rightFuzzyStatus = rightFuzzyStatus;
            return this;
        }

        public QueryBuilder rightFuzzyStatus (String ... rightFuzzyStatus){
            this.rightFuzzyStatus = solveNullList(rightFuzzyStatus);
            return this;
        }

        public QueryBuilder status(String status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(String ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public QueryBuilder statusList(List<String> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
            return this;
        }

        public QueryBuilder sellerIdBetWeen(Integer sellerIdSt,Integer sellerIdEd){
            this.sellerIdSt = sellerIdSt;
            this.sellerIdEd = sellerIdEd;
            return this;
        }

        public QueryBuilder sellerIdGreaterEqThan(Integer sellerIdSt){
            this.sellerIdSt = sellerIdSt;
            return this;
        }
        public QueryBuilder sellerIdLessEqThan(Integer sellerIdEd){
            this.sellerIdEd = sellerIdEd;
            return this;
        }


        public QueryBuilder sellerId(Integer sellerId){
            setSellerId(sellerId);
            return this;
        }

        public QueryBuilder sellerIdList(Integer ... sellerId){
            this.sellerIdList = solveNullList(sellerId);
            return this;
        }

        public QueryBuilder sellerIdList(List<Integer> sellerId){
            this.sellerIdList = sellerId;
            return this;
        }

        public QueryBuilder fetchSellerId(){
            setFetchFields("fetchFields","sellerId");
            return this;
        }

        public QueryBuilder excludeSellerId(){
            setFetchFields("excludeFields","sellerId");
            return this;
        }

        public QueryBuilder buyerIdBetWeen(Integer buyerIdSt,Integer buyerIdEd){
            this.buyerIdSt = buyerIdSt;
            this.buyerIdEd = buyerIdEd;
            return this;
        }

        public QueryBuilder buyerIdGreaterEqThan(Integer buyerIdSt){
            this.buyerIdSt = buyerIdSt;
            return this;
        }
        public QueryBuilder buyerIdLessEqThan(Integer buyerIdEd){
            this.buyerIdEd = buyerIdEd;
            return this;
        }


        public QueryBuilder buyerId(Integer buyerId){
            setBuyerId(buyerId);
            return this;
        }

        public QueryBuilder buyerIdList(Integer ... buyerId){
            this.buyerIdList = solveNullList(buyerId);
            return this;
        }

        public QueryBuilder buyerIdList(List<Integer> buyerId){
            this.buyerIdList = buyerId;
            return this;
        }

        public QueryBuilder fetchBuyerId(){
            setFetchFields("fetchFields","buyerId");
            return this;
        }

        public QueryBuilder excludeBuyerId(){
            setFetchFields("excludeFields","buyerId");
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

        public QueryBuilder priceBetWeen(java.math.BigDecimal priceSt,java.math.BigDecimal priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public QueryBuilder priceGreaterEqThan(java.math.BigDecimal priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public QueryBuilder priceLessEqThan(java.math.BigDecimal priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public QueryBuilder price(java.math.BigDecimal price){
            setPrice(price);
            return this;
        }

        public QueryBuilder priceList(java.math.BigDecimal ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public QueryBuilder priceList(List<java.math.BigDecimal> price){
            this.priceList = price;
            return this;
        }

        public QueryBuilder fetchPrice(){
            setFetchFields("fetchFields","price");
            return this;
        }

        public QueryBuilder excludePrice(){
            setFetchFields("excludeFields","price");
            return this;
        }

        public QueryBuilder statusIdBetWeen(Integer statusIdSt,Integer statusIdEd){
            this.statusIdSt = statusIdSt;
            this.statusIdEd = statusIdEd;
            return this;
        }

        public QueryBuilder statusIdGreaterEqThan(Integer statusIdSt){
            this.statusIdSt = statusIdSt;
            return this;
        }
        public QueryBuilder statusIdLessEqThan(Integer statusIdEd){
            this.statusIdEd = statusIdEd;
            return this;
        }


        public QueryBuilder statusId(Integer statusId){
            setStatusId(statusId);
            return this;
        }

        public QueryBuilder statusIdList(Integer ... statusId){
            this.statusIdList = solveNullList(statusId);
            return this;
        }

        public QueryBuilder statusIdList(List<Integer> statusId){
            this.statusIdList = statusId;
            return this;
        }

        public QueryBuilder fetchStatusId(){
            setFetchFields("fetchFields","statusId");
            return this;
        }

        public QueryBuilder excludeStatusId(){
            setFetchFields("excludeFields","statusId");
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

        public Order build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private List<String> statusList;

        public List<String> getStatusList(){return this.statusList;}


        private List<String> fuzzyStatus;

        public List<String> getFuzzyStatus(){return this.fuzzyStatus;}

        private List<String> rightFuzzyStatus;

        public List<String> getRightFuzzyStatus(){return this.rightFuzzyStatus;}
        private List<Integer> sellerIdList;

        public List<Integer> getSellerIdList(){return this.sellerIdList;}

        private Integer sellerIdSt;

        private Integer sellerIdEd;

        public Integer getSellerIdSt(){return this.sellerIdSt;}

        public Integer getSellerIdEd(){return this.sellerIdEd;}

        private List<Integer> buyerIdList;

        public List<Integer> getBuyerIdList(){return this.buyerIdList;}

        private Integer buyerIdSt;

        private Integer buyerIdEd;

        public Integer getBuyerIdSt(){return this.buyerIdSt;}

        public Integer getBuyerIdEd(){return this.buyerIdEd;}

        private List<Integer> bookIdList;

        public List<Integer> getBookIdList(){return this.bookIdList;}

        private Integer bookIdSt;

        private Integer bookIdEd;

        public Integer getBookIdSt(){return this.bookIdSt;}

        public Integer getBookIdEd(){return this.bookIdEd;}

        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<Integer> statusIdList;

        public List<Integer> getStatusIdList(){return this.statusIdList;}

        private Integer statusIdSt;

        private Integer statusIdEd;

        public Integer getStatusIdSt(){return this.statusIdSt;}

        public Integer getStatusIdEd(){return this.statusIdEd;}


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

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public ConditionBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public ConditionBuilder fuzzyStatus (List<String> fuzzyStatus){
            this.fuzzyStatus = fuzzyStatus;
            return this;
        }

        public ConditionBuilder fuzzyStatus (String ... fuzzyStatus){
            this.fuzzyStatus = solveNullList(fuzzyStatus);
            return this;
        }

        public ConditionBuilder rightFuzzyStatus (List<String> rightFuzzyStatus){
            this.rightFuzzyStatus = rightFuzzyStatus;
            return this;
        }

        public ConditionBuilder rightFuzzyStatus (String ... rightFuzzyStatus){
            this.rightFuzzyStatus = solveNullList(rightFuzzyStatus);
            return this;
        }

        public ConditionBuilder statusList(String ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public ConditionBuilder statusList(List<String> status){
            this.statusList = status;
            return this;
        }

        public ConditionBuilder sellerIdBetWeen(Integer sellerIdSt,Integer sellerIdEd){
            this.sellerIdSt = sellerIdSt;
            this.sellerIdEd = sellerIdEd;
            return this;
        }

        public ConditionBuilder sellerIdGreaterEqThan(Integer sellerIdSt){
            this.sellerIdSt = sellerIdSt;
            return this;
        }
        public ConditionBuilder sellerIdLessEqThan(Integer sellerIdEd){
            this.sellerIdEd = sellerIdEd;
            return this;
        }


        public ConditionBuilder sellerIdList(Integer ... sellerId){
            this.sellerIdList = solveNullList(sellerId);
            return this;
        }

        public ConditionBuilder sellerIdList(List<Integer> sellerId){
            this.sellerIdList = sellerId;
            return this;
        }

        public ConditionBuilder buyerIdBetWeen(Integer buyerIdSt,Integer buyerIdEd){
            this.buyerIdSt = buyerIdSt;
            this.buyerIdEd = buyerIdEd;
            return this;
        }

        public ConditionBuilder buyerIdGreaterEqThan(Integer buyerIdSt){
            this.buyerIdSt = buyerIdSt;
            return this;
        }
        public ConditionBuilder buyerIdLessEqThan(Integer buyerIdEd){
            this.buyerIdEd = buyerIdEd;
            return this;
        }


        public ConditionBuilder buyerIdList(Integer ... buyerId){
            this.buyerIdList = solveNullList(buyerId);
            return this;
        }

        public ConditionBuilder buyerIdList(List<Integer> buyerId){
            this.buyerIdList = buyerId;
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

        public ConditionBuilder priceBetWeen(java.math.BigDecimal priceSt,java.math.BigDecimal priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public ConditionBuilder priceGreaterEqThan(java.math.BigDecimal priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public ConditionBuilder priceLessEqThan(java.math.BigDecimal priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public ConditionBuilder priceList(java.math.BigDecimal ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public ConditionBuilder priceList(List<java.math.BigDecimal> price){
            this.priceList = price;
            return this;
        }

        public ConditionBuilder statusIdBetWeen(Integer statusIdSt,Integer statusIdEd){
            this.statusIdSt = statusIdSt;
            this.statusIdEd = statusIdEd;
            return this;
        }

        public ConditionBuilder statusIdGreaterEqThan(Integer statusIdSt){
            this.statusIdSt = statusIdSt;
            return this;
        }
        public ConditionBuilder statusIdLessEqThan(Integer statusIdEd){
            this.statusIdEd = statusIdEd;
            return this;
        }


        public ConditionBuilder statusIdList(Integer ... statusId){
            this.statusIdList = solveNullList(statusId);
            return this;
        }

        public ConditionBuilder statusIdList(List<Integer> statusId){
            this.statusIdList = statusId;
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

        private Order obj;

        public Builder(){
            this.obj = new Order();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder updateTime(java.time.LocalDateTime updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public Builder status(String status){
            this.obj.setStatus(status);
            return this;
        }
        public Builder sellerId(Integer sellerId){
            this.obj.setSellerId(sellerId);
            return this;
        }
        public Builder buyerId(Integer buyerId){
            this.obj.setBuyerId(buyerId);
            return this;
        }
        public Builder bookId(Integer bookId){
            this.obj.setBookId(bookId);
            return this;
        }
        public Builder price(java.math.BigDecimal price){
            this.obj.setPrice(price);
            return this;
        }
        public Builder statusId(Integer statusId){
            this.obj.setStatusId(statusId);
            return this;
        }
        public Order build(){return obj;}
    }

}
