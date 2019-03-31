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
public class User implements Serializable {

    private static final long serialVersionUID = 1554012131295L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 用户名
    * isNullAble:1
    */
    private String userName;

    /**
    * 密码
    * isNullAble:1
    */
    private String password;

    /**
    * 真实姓名
    * isNullAble:1
    */
    private String trueName;

    /**
    * 性别
    * isNullAble:1
    */
    private String sex;

    /**
    * 年龄
    * isNullAble:1
    */
    private Integer age;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime createDatetime;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime updateDatetime;

    /**
    * 手机号
    * isNullAble:1
    */
    private String userTel;

    /**
    * 
    * isNullAble:1
    */
    private Integer provinceId;

    /**
    * 
    * isNullAble:1
    */
    private Integer cityId;

    /**
    * 
    * isNullAble:1
    */
    private Integer districtId;

    /**
    * 
    * isNullAble:1
    */
    private String userAddress;

    /**
    * 验证码
    * isNullAble:1
    */
    private String loginCode;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setUserName(String userName){this.userName = userName;}

    public String getUserName(){return this.userName;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}

    public void setTrueName(String trueName){this.trueName = trueName;}

    public String getTrueName(){return this.trueName;}

    public void setSex(String sex){this.sex = sex;}

    public String getSex(){return this.sex;}

    public void setAge(Integer age){this.age = age;}

    public Integer getAge(){return this.age;}

    public void setCreateDatetime(java.time.LocalDateTime createDatetime){this.createDatetime = createDatetime;}

    public java.time.LocalDateTime getCreateDatetime(){return this.createDatetime;}

    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime){this.updateDatetime = updateDatetime;}

    public java.time.LocalDateTime getUpdateDatetime(){return this.updateDatetime;}

    public void setUserTel(String userTel){this.userTel = userTel;}

    public String getUserTel(){return this.userTel;}

    public void setProvinceId(Integer provinceId){this.provinceId = provinceId;}

    public Integer getProvinceId(){return this.provinceId;}

    public void setCityId(Integer cityId){this.cityId = cityId;}

    public Integer getCityId(){return this.cityId;}

    public void setDistrictId(Integer districtId){this.districtId = districtId;}

    public Integer getDistrictId(){return this.districtId;}

    public void setUserAddress(String userAddress){this.userAddress = userAddress;}

    public String getUserAddress(){return this.userAddress;}

    public void setLoginCode(String loginCode){this.loginCode = loginCode;}

    public String getLoginCode(){return this.loginCode;}
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                "userName='" + userName + '\'' +
                "password='" + password + '\'' +
                "trueName='" + trueName + '\'' +
                "sex='" + sex + '\'' +
                "age='" + age + '\'' +
                "createDatetime='" + createDatetime + '\'' +
                "updateDatetime='" + updateDatetime + '\'' +
                "userTel='" + userTel + '\'' +
                "provinceId='" + provinceId + '\'' +
                "cityId='" + cityId + '\'' +
                "districtId='" + districtId + '\'' +
                "userAddress='" + userAddress + '\'' +
                "loginCode='" + loginCode + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private User set;

        private ConditionBuilder where;

        public UpdateBuilder set(User set){
            this.set = set;
            return this;
        }

        public User getSet(){
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

    public static class QueryBuilder extends User{
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

        private List<String> userNameList;

        public List<String> getUserNameList(){return this.userNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> trueNameList;

        public List<String> getTrueNameList(){return this.trueNameList;}


        private List<String> fuzzyTrueName;

        public List<String> getFuzzyTrueName(){return this.fuzzyTrueName;}

        private List<String> rightFuzzyTrueName;

        public List<String> getRightFuzzyTrueName(){return this.rightFuzzyTrueName;}
        private List<String> sexList;

        public List<String> getSexList(){return this.sexList;}


        private List<String> fuzzySex;

        public List<String> getFuzzySex(){return this.fuzzySex;}

        private List<String> rightFuzzySex;

        public List<String> getRightFuzzySex(){return this.rightFuzzySex;}
        private List<Integer> ageList;

        public List<Integer> getAgeList(){return this.ageList;}

        private Integer ageSt;

        private Integer ageEd;

        public Integer getAgeSt(){return this.ageSt;}

        public Integer getAgeEd(){return this.ageEd;}

        private List<java.time.LocalDateTime> createDatetimeList;

        public List<java.time.LocalDateTime> getCreateDatetimeList(){return this.createDatetimeList;}

        private java.time.LocalDateTime createDatetimeSt;

        private java.time.LocalDateTime createDatetimeEd;

        public java.time.LocalDateTime getCreateDatetimeSt(){return this.createDatetimeSt;}

        public java.time.LocalDateTime getCreateDatetimeEd(){return this.createDatetimeEd;}

        private List<java.time.LocalDateTime> updateDatetimeList;

        public List<java.time.LocalDateTime> getUpdateDatetimeList(){return this.updateDatetimeList;}

        private java.time.LocalDateTime updateDatetimeSt;

        private java.time.LocalDateTime updateDatetimeEd;

        public java.time.LocalDateTime getUpdateDatetimeSt(){return this.updateDatetimeSt;}

        public java.time.LocalDateTime getUpdateDatetimeEd(){return this.updateDatetimeEd;}

        private List<String> userTelList;

        public List<String> getUserTelList(){return this.userTelList;}


        private List<String> fuzzyUserTel;

        public List<String> getFuzzyUserTel(){return this.fuzzyUserTel;}

        private List<String> rightFuzzyUserTel;

        public List<String> getRightFuzzyUserTel(){return this.rightFuzzyUserTel;}
        private List<Integer> provinceIdList;

        public List<Integer> getProvinceIdList(){return this.provinceIdList;}

        private Integer provinceIdSt;

        private Integer provinceIdEd;

        public Integer getProvinceIdSt(){return this.provinceIdSt;}

        public Integer getProvinceIdEd(){return this.provinceIdEd;}

        private List<Integer> cityIdList;

        public List<Integer> getCityIdList(){return this.cityIdList;}

        private Integer cityIdSt;

        private Integer cityIdEd;

        public Integer getCityIdSt(){return this.cityIdSt;}

        public Integer getCityIdEd(){return this.cityIdEd;}

        private List<Integer> districtIdList;

        public List<Integer> getDistrictIdList(){return this.districtIdList;}

        private Integer districtIdSt;

        private Integer districtIdEd;

        public Integer getDistrictIdSt(){return this.districtIdSt;}

        public Integer getDistrictIdEd(){return this.districtIdEd;}

        private List<String> userAddressList;

        public List<String> getUserAddressList(){return this.userAddressList;}


        private List<String> fuzzyUserAddress;

        public List<String> getFuzzyUserAddress(){return this.fuzzyUserAddress;}

        private List<String> rightFuzzyUserAddress;

        public List<String> getRightFuzzyUserAddress(){return this.rightFuzzyUserAddress;}
        private List<String> loginCodeList;

        public List<String> getLoginCodeList(){return this.loginCodeList;}


        private List<String> fuzzyLoginCode;

        public List<String> getFuzzyLoginCode(){return this.fuzzyLoginCode;}

        private List<String> rightFuzzyLoginCode;

        public List<String> getRightFuzzyLoginCode(){return this.rightFuzzyLoginCode;}
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

        public QueryBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public QueryBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public QueryBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public QueryBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public QueryBuilder userName(String userName){
            setUserName(userName);
            return this;
        }

        public QueryBuilder userNameList(String ... userName){
            this.userNameList = solveNullList(userName);
            return this;
        }

        public QueryBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public QueryBuilder fetchUserName(){
            setFetchFields("fetchFields","userName");
            return this;
        }

        public QueryBuilder excludeUserName(){
            setFetchFields("excludeFields","userName");
            return this;
        }

        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
            return this;
        }

        public QueryBuilder fuzzyTrueName (List<String> fuzzyTrueName){
            this.fuzzyTrueName = fuzzyTrueName;
            return this;
        }

        public QueryBuilder fuzzyTrueName (String ... fuzzyTrueName){
            this.fuzzyTrueName = solveNullList(fuzzyTrueName);
            return this;
        }

        public QueryBuilder rightFuzzyTrueName (List<String> rightFuzzyTrueName){
            this.rightFuzzyTrueName = rightFuzzyTrueName;
            return this;
        }

        public QueryBuilder rightFuzzyTrueName (String ... rightFuzzyTrueName){
            this.rightFuzzyTrueName = solveNullList(rightFuzzyTrueName);
            return this;
        }

        public QueryBuilder trueName(String trueName){
            setTrueName(trueName);
            return this;
        }

        public QueryBuilder trueNameList(String ... trueName){
            this.trueNameList = solveNullList(trueName);
            return this;
        }

        public QueryBuilder trueNameList(List<String> trueName){
            this.trueNameList = trueName;
            return this;
        }

        public QueryBuilder fetchTrueName(){
            setFetchFields("fetchFields","trueName");
            return this;
        }

        public QueryBuilder excludeTrueName(){
            setFetchFields("excludeFields","trueName");
            return this;
        }

        public QueryBuilder fuzzySex (List<String> fuzzySex){
            this.fuzzySex = fuzzySex;
            return this;
        }

        public QueryBuilder fuzzySex (String ... fuzzySex){
            this.fuzzySex = solveNullList(fuzzySex);
            return this;
        }

        public QueryBuilder rightFuzzySex (List<String> rightFuzzySex){
            this.rightFuzzySex = rightFuzzySex;
            return this;
        }

        public QueryBuilder rightFuzzySex (String ... rightFuzzySex){
            this.rightFuzzySex = solveNullList(rightFuzzySex);
            return this;
        }

        public QueryBuilder sex(String sex){
            setSex(sex);
            return this;
        }

        public QueryBuilder sexList(String ... sex){
            this.sexList = solveNullList(sex);
            return this;
        }

        public QueryBuilder sexList(List<String> sex){
            this.sexList = sex;
            return this;
        }

        public QueryBuilder fetchSex(){
            setFetchFields("fetchFields","sex");
            return this;
        }

        public QueryBuilder excludeSex(){
            setFetchFields("excludeFields","sex");
            return this;
        }

        public QueryBuilder ageBetWeen(Integer ageSt,Integer ageEd){
            this.ageSt = ageSt;
            this.ageEd = ageEd;
            return this;
        }

        public QueryBuilder ageGreaterEqThan(Integer ageSt){
            this.ageSt = ageSt;
            return this;
        }
        public QueryBuilder ageLessEqThan(Integer ageEd){
            this.ageEd = ageEd;
            return this;
        }


        public QueryBuilder age(Integer age){
            setAge(age);
            return this;
        }

        public QueryBuilder ageList(Integer ... age){
            this.ageList = solveNullList(age);
            return this;
        }

        public QueryBuilder ageList(List<Integer> age){
            this.ageList = age;
            return this;
        }

        public QueryBuilder fetchAge(){
            setFetchFields("fetchFields","age");
            return this;
        }

        public QueryBuilder excludeAge(){
            setFetchFields("excludeFields","age");
            return this;
        }

        public QueryBuilder createDatetimeBetWeen(java.time.LocalDateTime createDatetimeSt,java.time.LocalDateTime createDatetimeEd){
            this.createDatetimeSt = createDatetimeSt;
            this.createDatetimeEd = createDatetimeEd;
            return this;
        }

        public QueryBuilder createDatetimeGreaterEqThan(java.time.LocalDateTime createDatetimeSt){
            this.createDatetimeSt = createDatetimeSt;
            return this;
        }
        public QueryBuilder createDatetimeLessEqThan(java.time.LocalDateTime createDatetimeEd){
            this.createDatetimeEd = createDatetimeEd;
            return this;
        }


        public QueryBuilder createDatetime(java.time.LocalDateTime createDatetime){
            setCreateDatetime(createDatetime);
            return this;
        }

        public QueryBuilder createDatetimeList(java.time.LocalDateTime ... createDatetime){
            this.createDatetimeList = solveNullList(createDatetime);
            return this;
        }

        public QueryBuilder createDatetimeList(List<java.time.LocalDateTime> createDatetime){
            this.createDatetimeList = createDatetime;
            return this;
        }

        public QueryBuilder fetchCreateDatetime(){
            setFetchFields("fetchFields","createDatetime");
            return this;
        }

        public QueryBuilder excludeCreateDatetime(){
            setFetchFields("excludeFields","createDatetime");
            return this;
        }

        public QueryBuilder updateDatetimeBetWeen(java.time.LocalDateTime updateDatetimeSt,java.time.LocalDateTime updateDatetimeEd){
            this.updateDatetimeSt = updateDatetimeSt;
            this.updateDatetimeEd = updateDatetimeEd;
            return this;
        }

        public QueryBuilder updateDatetimeGreaterEqThan(java.time.LocalDateTime updateDatetimeSt){
            this.updateDatetimeSt = updateDatetimeSt;
            return this;
        }
        public QueryBuilder updateDatetimeLessEqThan(java.time.LocalDateTime updateDatetimeEd){
            this.updateDatetimeEd = updateDatetimeEd;
            return this;
        }


        public QueryBuilder updateDatetime(java.time.LocalDateTime updateDatetime){
            setUpdateDatetime(updateDatetime);
            return this;
        }

        public QueryBuilder updateDatetimeList(java.time.LocalDateTime ... updateDatetime){
            this.updateDatetimeList = solveNullList(updateDatetime);
            return this;
        }

        public QueryBuilder updateDatetimeList(List<java.time.LocalDateTime> updateDatetime){
            this.updateDatetimeList = updateDatetime;
            return this;
        }

        public QueryBuilder fetchUpdateDatetime(){
            setFetchFields("fetchFields","updateDatetime");
            return this;
        }

        public QueryBuilder excludeUpdateDatetime(){
            setFetchFields("excludeFields","updateDatetime");
            return this;
        }

        public QueryBuilder fuzzyUserTel (List<String> fuzzyUserTel){
            this.fuzzyUserTel = fuzzyUserTel;
            return this;
        }

        public QueryBuilder fuzzyUserTel (String ... fuzzyUserTel){
            this.fuzzyUserTel = solveNullList(fuzzyUserTel);
            return this;
        }

        public QueryBuilder rightFuzzyUserTel (List<String> rightFuzzyUserTel){
            this.rightFuzzyUserTel = rightFuzzyUserTel;
            return this;
        }

        public QueryBuilder rightFuzzyUserTel (String ... rightFuzzyUserTel){
            this.rightFuzzyUserTel = solveNullList(rightFuzzyUserTel);
            return this;
        }

        public QueryBuilder userTel(String userTel){
            setUserTel(userTel);
            return this;
        }

        public QueryBuilder userTelList(String ... userTel){
            this.userTelList = solveNullList(userTel);
            return this;
        }

        public QueryBuilder userTelList(List<String> userTel){
            this.userTelList = userTel;
            return this;
        }

        public QueryBuilder fetchUserTel(){
            setFetchFields("fetchFields","userTel");
            return this;
        }

        public QueryBuilder excludeUserTel(){
            setFetchFields("excludeFields","userTel");
            return this;
        }

        public QueryBuilder provinceIdBetWeen(Integer provinceIdSt,Integer provinceIdEd){
            this.provinceIdSt = provinceIdSt;
            this.provinceIdEd = provinceIdEd;
            return this;
        }

        public QueryBuilder provinceIdGreaterEqThan(Integer provinceIdSt){
            this.provinceIdSt = provinceIdSt;
            return this;
        }
        public QueryBuilder provinceIdLessEqThan(Integer provinceIdEd){
            this.provinceIdEd = provinceIdEd;
            return this;
        }


        public QueryBuilder provinceId(Integer provinceId){
            setProvinceId(provinceId);
            return this;
        }

        public QueryBuilder provinceIdList(Integer ... provinceId){
            this.provinceIdList = solveNullList(provinceId);
            return this;
        }

        public QueryBuilder provinceIdList(List<Integer> provinceId){
            this.provinceIdList = provinceId;
            return this;
        }

        public QueryBuilder fetchProvinceId(){
            setFetchFields("fetchFields","provinceId");
            return this;
        }

        public QueryBuilder excludeProvinceId(){
            setFetchFields("excludeFields","provinceId");
            return this;
        }

        public QueryBuilder cityIdBetWeen(Integer cityIdSt,Integer cityIdEd){
            this.cityIdSt = cityIdSt;
            this.cityIdEd = cityIdEd;
            return this;
        }

        public QueryBuilder cityIdGreaterEqThan(Integer cityIdSt){
            this.cityIdSt = cityIdSt;
            return this;
        }
        public QueryBuilder cityIdLessEqThan(Integer cityIdEd){
            this.cityIdEd = cityIdEd;
            return this;
        }


        public QueryBuilder cityId(Integer cityId){
            setCityId(cityId);
            return this;
        }

        public QueryBuilder cityIdList(Integer ... cityId){
            this.cityIdList = solveNullList(cityId);
            return this;
        }

        public QueryBuilder cityIdList(List<Integer> cityId){
            this.cityIdList = cityId;
            return this;
        }

        public QueryBuilder fetchCityId(){
            setFetchFields("fetchFields","cityId");
            return this;
        }

        public QueryBuilder excludeCityId(){
            setFetchFields("excludeFields","cityId");
            return this;
        }

        public QueryBuilder districtIdBetWeen(Integer districtIdSt,Integer districtIdEd){
            this.districtIdSt = districtIdSt;
            this.districtIdEd = districtIdEd;
            return this;
        }

        public QueryBuilder districtIdGreaterEqThan(Integer districtIdSt){
            this.districtIdSt = districtIdSt;
            return this;
        }
        public QueryBuilder districtIdLessEqThan(Integer districtIdEd){
            this.districtIdEd = districtIdEd;
            return this;
        }


        public QueryBuilder districtId(Integer districtId){
            setDistrictId(districtId);
            return this;
        }

        public QueryBuilder districtIdList(Integer ... districtId){
            this.districtIdList = solveNullList(districtId);
            return this;
        }

        public QueryBuilder districtIdList(List<Integer> districtId){
            this.districtIdList = districtId;
            return this;
        }

        public QueryBuilder fetchDistrictId(){
            setFetchFields("fetchFields","districtId");
            return this;
        }

        public QueryBuilder excludeDistrictId(){
            setFetchFields("excludeFields","districtId");
            return this;
        }

        public QueryBuilder fuzzyUserAddress (List<String> fuzzyUserAddress){
            this.fuzzyUserAddress = fuzzyUserAddress;
            return this;
        }

        public QueryBuilder fuzzyUserAddress (String ... fuzzyUserAddress){
            this.fuzzyUserAddress = solveNullList(fuzzyUserAddress);
            return this;
        }

        public QueryBuilder rightFuzzyUserAddress (List<String> rightFuzzyUserAddress){
            this.rightFuzzyUserAddress = rightFuzzyUserAddress;
            return this;
        }

        public QueryBuilder rightFuzzyUserAddress (String ... rightFuzzyUserAddress){
            this.rightFuzzyUserAddress = solveNullList(rightFuzzyUserAddress);
            return this;
        }

        public QueryBuilder userAddress(String userAddress){
            setUserAddress(userAddress);
            return this;
        }

        public QueryBuilder userAddressList(String ... userAddress){
            this.userAddressList = solveNullList(userAddress);
            return this;
        }

        public QueryBuilder userAddressList(List<String> userAddress){
            this.userAddressList = userAddress;
            return this;
        }

        public QueryBuilder fetchUserAddress(){
            setFetchFields("fetchFields","userAddress");
            return this;
        }

        public QueryBuilder excludeUserAddress(){
            setFetchFields("excludeFields","userAddress");
            return this;
        }

        public QueryBuilder fuzzyLoginCode (List<String> fuzzyLoginCode){
            this.fuzzyLoginCode = fuzzyLoginCode;
            return this;
        }

        public QueryBuilder fuzzyLoginCode (String ... fuzzyLoginCode){
            this.fuzzyLoginCode = solveNullList(fuzzyLoginCode);
            return this;
        }

        public QueryBuilder rightFuzzyLoginCode (List<String> rightFuzzyLoginCode){
            this.rightFuzzyLoginCode = rightFuzzyLoginCode;
            return this;
        }

        public QueryBuilder rightFuzzyLoginCode (String ... rightFuzzyLoginCode){
            this.rightFuzzyLoginCode = solveNullList(rightFuzzyLoginCode);
            return this;
        }

        public QueryBuilder loginCode(String loginCode){
            setLoginCode(loginCode);
            return this;
        }

        public QueryBuilder loginCodeList(String ... loginCode){
            this.loginCodeList = solveNullList(loginCode);
            return this;
        }

        public QueryBuilder loginCodeList(List<String> loginCode){
            this.loginCodeList = loginCode;
            return this;
        }

        public QueryBuilder fetchLoginCode(){
            setFetchFields("fetchFields","loginCode");
            return this;
        }

        public QueryBuilder excludeLoginCode(){
            setFetchFields("excludeFields","loginCode");
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

        public User build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> userNameList;

        public List<String> getUserNameList(){return this.userNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> trueNameList;

        public List<String> getTrueNameList(){return this.trueNameList;}


        private List<String> fuzzyTrueName;

        public List<String> getFuzzyTrueName(){return this.fuzzyTrueName;}

        private List<String> rightFuzzyTrueName;

        public List<String> getRightFuzzyTrueName(){return this.rightFuzzyTrueName;}
        private List<String> sexList;

        public List<String> getSexList(){return this.sexList;}


        private List<String> fuzzySex;

        public List<String> getFuzzySex(){return this.fuzzySex;}

        private List<String> rightFuzzySex;

        public List<String> getRightFuzzySex(){return this.rightFuzzySex;}
        private List<Integer> ageList;

        public List<Integer> getAgeList(){return this.ageList;}

        private Integer ageSt;

        private Integer ageEd;

        public Integer getAgeSt(){return this.ageSt;}

        public Integer getAgeEd(){return this.ageEd;}

        private List<java.time.LocalDateTime> createDatetimeList;

        public List<java.time.LocalDateTime> getCreateDatetimeList(){return this.createDatetimeList;}

        private java.time.LocalDateTime createDatetimeSt;

        private java.time.LocalDateTime createDatetimeEd;

        public java.time.LocalDateTime getCreateDatetimeSt(){return this.createDatetimeSt;}

        public java.time.LocalDateTime getCreateDatetimeEd(){return this.createDatetimeEd;}

        private List<java.time.LocalDateTime> updateDatetimeList;

        public List<java.time.LocalDateTime> getUpdateDatetimeList(){return this.updateDatetimeList;}

        private java.time.LocalDateTime updateDatetimeSt;

        private java.time.LocalDateTime updateDatetimeEd;

        public java.time.LocalDateTime getUpdateDatetimeSt(){return this.updateDatetimeSt;}

        public java.time.LocalDateTime getUpdateDatetimeEd(){return this.updateDatetimeEd;}

        private List<String> userTelList;

        public List<String> getUserTelList(){return this.userTelList;}


        private List<String> fuzzyUserTel;

        public List<String> getFuzzyUserTel(){return this.fuzzyUserTel;}

        private List<String> rightFuzzyUserTel;

        public List<String> getRightFuzzyUserTel(){return this.rightFuzzyUserTel;}
        private List<Integer> provinceIdList;

        public List<Integer> getProvinceIdList(){return this.provinceIdList;}

        private Integer provinceIdSt;

        private Integer provinceIdEd;

        public Integer getProvinceIdSt(){return this.provinceIdSt;}

        public Integer getProvinceIdEd(){return this.provinceIdEd;}

        private List<Integer> cityIdList;

        public List<Integer> getCityIdList(){return this.cityIdList;}

        private Integer cityIdSt;

        private Integer cityIdEd;

        public Integer getCityIdSt(){return this.cityIdSt;}

        public Integer getCityIdEd(){return this.cityIdEd;}

        private List<Integer> districtIdList;

        public List<Integer> getDistrictIdList(){return this.districtIdList;}

        private Integer districtIdSt;

        private Integer districtIdEd;

        public Integer getDistrictIdSt(){return this.districtIdSt;}

        public Integer getDistrictIdEd(){return this.districtIdEd;}

        private List<String> userAddressList;

        public List<String> getUserAddressList(){return this.userAddressList;}


        private List<String> fuzzyUserAddress;

        public List<String> getFuzzyUserAddress(){return this.fuzzyUserAddress;}

        private List<String> rightFuzzyUserAddress;

        public List<String> getRightFuzzyUserAddress(){return this.rightFuzzyUserAddress;}
        private List<String> loginCodeList;

        public List<String> getLoginCodeList(){return this.loginCodeList;}


        private List<String> fuzzyLoginCode;

        public List<String> getFuzzyLoginCode(){return this.fuzzyLoginCode;}

        private List<String> rightFuzzyLoginCode;

        public List<String> getRightFuzzyLoginCode(){return this.rightFuzzyLoginCode;}

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

        public ConditionBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public ConditionBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public ConditionBuilder userNameList(String ... userName){
            this.userNameList = solveNullList(userName);
            return this;
        }

        public ConditionBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public ConditionBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public ConditionBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public ConditionBuilder fuzzyTrueName (List<String> fuzzyTrueName){
            this.fuzzyTrueName = fuzzyTrueName;
            return this;
        }

        public ConditionBuilder fuzzyTrueName (String ... fuzzyTrueName){
            this.fuzzyTrueName = solveNullList(fuzzyTrueName);
            return this;
        }

        public ConditionBuilder rightFuzzyTrueName (List<String> rightFuzzyTrueName){
            this.rightFuzzyTrueName = rightFuzzyTrueName;
            return this;
        }

        public ConditionBuilder rightFuzzyTrueName (String ... rightFuzzyTrueName){
            this.rightFuzzyTrueName = solveNullList(rightFuzzyTrueName);
            return this;
        }

        public ConditionBuilder trueNameList(String ... trueName){
            this.trueNameList = solveNullList(trueName);
            return this;
        }

        public ConditionBuilder trueNameList(List<String> trueName){
            this.trueNameList = trueName;
            return this;
        }

        public ConditionBuilder fuzzySex (List<String> fuzzySex){
            this.fuzzySex = fuzzySex;
            return this;
        }

        public ConditionBuilder fuzzySex (String ... fuzzySex){
            this.fuzzySex = solveNullList(fuzzySex);
            return this;
        }

        public ConditionBuilder rightFuzzySex (List<String> rightFuzzySex){
            this.rightFuzzySex = rightFuzzySex;
            return this;
        }

        public ConditionBuilder rightFuzzySex (String ... rightFuzzySex){
            this.rightFuzzySex = solveNullList(rightFuzzySex);
            return this;
        }

        public ConditionBuilder sexList(String ... sex){
            this.sexList = solveNullList(sex);
            return this;
        }

        public ConditionBuilder sexList(List<String> sex){
            this.sexList = sex;
            return this;
        }

        public ConditionBuilder ageBetWeen(Integer ageSt,Integer ageEd){
            this.ageSt = ageSt;
            this.ageEd = ageEd;
            return this;
        }

        public ConditionBuilder ageGreaterEqThan(Integer ageSt){
            this.ageSt = ageSt;
            return this;
        }
        public ConditionBuilder ageLessEqThan(Integer ageEd){
            this.ageEd = ageEd;
            return this;
        }


        public ConditionBuilder ageList(Integer ... age){
            this.ageList = solveNullList(age);
            return this;
        }

        public ConditionBuilder ageList(List<Integer> age){
            this.ageList = age;
            return this;
        }

        public ConditionBuilder createDatetimeBetWeen(java.time.LocalDateTime createDatetimeSt,java.time.LocalDateTime createDatetimeEd){
            this.createDatetimeSt = createDatetimeSt;
            this.createDatetimeEd = createDatetimeEd;
            return this;
        }

        public ConditionBuilder createDatetimeGreaterEqThan(java.time.LocalDateTime createDatetimeSt){
            this.createDatetimeSt = createDatetimeSt;
            return this;
        }
        public ConditionBuilder createDatetimeLessEqThan(java.time.LocalDateTime createDatetimeEd){
            this.createDatetimeEd = createDatetimeEd;
            return this;
        }


        public ConditionBuilder createDatetimeList(java.time.LocalDateTime ... createDatetime){
            this.createDatetimeList = solveNullList(createDatetime);
            return this;
        }

        public ConditionBuilder createDatetimeList(List<java.time.LocalDateTime> createDatetime){
            this.createDatetimeList = createDatetime;
            return this;
        }

        public ConditionBuilder updateDatetimeBetWeen(java.time.LocalDateTime updateDatetimeSt,java.time.LocalDateTime updateDatetimeEd){
            this.updateDatetimeSt = updateDatetimeSt;
            this.updateDatetimeEd = updateDatetimeEd;
            return this;
        }

        public ConditionBuilder updateDatetimeGreaterEqThan(java.time.LocalDateTime updateDatetimeSt){
            this.updateDatetimeSt = updateDatetimeSt;
            return this;
        }
        public ConditionBuilder updateDatetimeLessEqThan(java.time.LocalDateTime updateDatetimeEd){
            this.updateDatetimeEd = updateDatetimeEd;
            return this;
        }


        public ConditionBuilder updateDatetimeList(java.time.LocalDateTime ... updateDatetime){
            this.updateDatetimeList = solveNullList(updateDatetime);
            return this;
        }

        public ConditionBuilder updateDatetimeList(List<java.time.LocalDateTime> updateDatetime){
            this.updateDatetimeList = updateDatetime;
            return this;
        }

        public ConditionBuilder fuzzyUserTel (List<String> fuzzyUserTel){
            this.fuzzyUserTel = fuzzyUserTel;
            return this;
        }

        public ConditionBuilder fuzzyUserTel (String ... fuzzyUserTel){
            this.fuzzyUserTel = solveNullList(fuzzyUserTel);
            return this;
        }

        public ConditionBuilder rightFuzzyUserTel (List<String> rightFuzzyUserTel){
            this.rightFuzzyUserTel = rightFuzzyUserTel;
            return this;
        }

        public ConditionBuilder rightFuzzyUserTel (String ... rightFuzzyUserTel){
            this.rightFuzzyUserTel = solveNullList(rightFuzzyUserTel);
            return this;
        }

        public ConditionBuilder userTelList(String ... userTel){
            this.userTelList = solveNullList(userTel);
            return this;
        }

        public ConditionBuilder userTelList(List<String> userTel){
            this.userTelList = userTel;
            return this;
        }

        public ConditionBuilder provinceIdBetWeen(Integer provinceIdSt,Integer provinceIdEd){
            this.provinceIdSt = provinceIdSt;
            this.provinceIdEd = provinceIdEd;
            return this;
        }

        public ConditionBuilder provinceIdGreaterEqThan(Integer provinceIdSt){
            this.provinceIdSt = provinceIdSt;
            return this;
        }
        public ConditionBuilder provinceIdLessEqThan(Integer provinceIdEd){
            this.provinceIdEd = provinceIdEd;
            return this;
        }


        public ConditionBuilder provinceIdList(Integer ... provinceId){
            this.provinceIdList = solveNullList(provinceId);
            return this;
        }

        public ConditionBuilder provinceIdList(List<Integer> provinceId){
            this.provinceIdList = provinceId;
            return this;
        }

        public ConditionBuilder cityIdBetWeen(Integer cityIdSt,Integer cityIdEd){
            this.cityIdSt = cityIdSt;
            this.cityIdEd = cityIdEd;
            return this;
        }

        public ConditionBuilder cityIdGreaterEqThan(Integer cityIdSt){
            this.cityIdSt = cityIdSt;
            return this;
        }
        public ConditionBuilder cityIdLessEqThan(Integer cityIdEd){
            this.cityIdEd = cityIdEd;
            return this;
        }


        public ConditionBuilder cityIdList(Integer ... cityId){
            this.cityIdList = solveNullList(cityId);
            return this;
        }

        public ConditionBuilder cityIdList(List<Integer> cityId){
            this.cityIdList = cityId;
            return this;
        }

        public ConditionBuilder districtIdBetWeen(Integer districtIdSt,Integer districtIdEd){
            this.districtIdSt = districtIdSt;
            this.districtIdEd = districtIdEd;
            return this;
        }

        public ConditionBuilder districtIdGreaterEqThan(Integer districtIdSt){
            this.districtIdSt = districtIdSt;
            return this;
        }
        public ConditionBuilder districtIdLessEqThan(Integer districtIdEd){
            this.districtIdEd = districtIdEd;
            return this;
        }


        public ConditionBuilder districtIdList(Integer ... districtId){
            this.districtIdList = solveNullList(districtId);
            return this;
        }

        public ConditionBuilder districtIdList(List<Integer> districtId){
            this.districtIdList = districtId;
            return this;
        }

        public ConditionBuilder fuzzyUserAddress (List<String> fuzzyUserAddress){
            this.fuzzyUserAddress = fuzzyUserAddress;
            return this;
        }

        public ConditionBuilder fuzzyUserAddress (String ... fuzzyUserAddress){
            this.fuzzyUserAddress = solveNullList(fuzzyUserAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyUserAddress (List<String> rightFuzzyUserAddress){
            this.rightFuzzyUserAddress = rightFuzzyUserAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyUserAddress (String ... rightFuzzyUserAddress){
            this.rightFuzzyUserAddress = solveNullList(rightFuzzyUserAddress);
            return this;
        }

        public ConditionBuilder userAddressList(String ... userAddress){
            this.userAddressList = solveNullList(userAddress);
            return this;
        }

        public ConditionBuilder userAddressList(List<String> userAddress){
            this.userAddressList = userAddress;
            return this;
        }

        public ConditionBuilder fuzzyLoginCode (List<String> fuzzyLoginCode){
            this.fuzzyLoginCode = fuzzyLoginCode;
            return this;
        }

        public ConditionBuilder fuzzyLoginCode (String ... fuzzyLoginCode){
            this.fuzzyLoginCode = solveNullList(fuzzyLoginCode);
            return this;
        }

        public ConditionBuilder rightFuzzyLoginCode (List<String> rightFuzzyLoginCode){
            this.rightFuzzyLoginCode = rightFuzzyLoginCode;
            return this;
        }

        public ConditionBuilder rightFuzzyLoginCode (String ... rightFuzzyLoginCode){
            this.rightFuzzyLoginCode = solveNullList(rightFuzzyLoginCode);
            return this;
        }

        public ConditionBuilder loginCodeList(String ... loginCode){
            this.loginCodeList = solveNullList(loginCode);
            return this;
        }

        public ConditionBuilder loginCodeList(List<String> loginCode){
            this.loginCodeList = loginCode;
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

        private User obj;

        public Builder(){
            this.obj = new User();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder userName(String userName){
            this.obj.setUserName(userName);
            return this;
        }
        public Builder password(String password){
            this.obj.setPassword(password);
            return this;
        }
        public Builder trueName(String trueName){
            this.obj.setTrueName(trueName);
            return this;
        }
        public Builder sex(String sex){
            this.obj.setSex(sex);
            return this;
        }
        public Builder age(Integer age){
            this.obj.setAge(age);
            return this;
        }
        public Builder createDatetime(java.time.LocalDateTime createDatetime){
            this.obj.setCreateDatetime(createDatetime);
            return this;
        }
        public Builder updateDatetime(java.time.LocalDateTime updateDatetime){
            this.obj.setUpdateDatetime(updateDatetime);
            return this;
        }
        public Builder userTel(String userTel){
            this.obj.setUserTel(userTel);
            return this;
        }
        public Builder provinceId(Integer provinceId){
            this.obj.setProvinceId(provinceId);
            return this;
        }
        public Builder cityId(Integer cityId){
            this.obj.setCityId(cityId);
            return this;
        }
        public Builder districtId(Integer districtId){
            this.obj.setDistrictId(districtId);
            return this;
        }
        public Builder userAddress(String userAddress){
            this.obj.setUserAddress(userAddress);
            return this;
        }
        public Builder loginCode(String loginCode){
            this.obj.setLoginCode(loginCode);
            return this;
        }
        public User build(){return obj;}
    }

}
