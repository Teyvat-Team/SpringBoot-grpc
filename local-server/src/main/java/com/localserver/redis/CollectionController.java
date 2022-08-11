package com.localserver.redis;

import com.localserver.result.Actor;
import com.localserver.result.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.redisson.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;


@Api(tags = "分布式集合")
@RestController
@RequestMapping("/collection")
public class CollectionController {

    @Autowired
    RedissonClient redissonClient;
    // localhost:8082/collection/string?key=uuid
    @ApiOperation("获取字符串类型的值")
    @RequestMapping(value="/string",method = RequestMethod.GET)
    public AjaxResult getString(@RequestParam String key) {
        RBucket<String> stringdata = redissonClient.getBucket(key);
        System.out.println("获取到新存入的数据：" + stringdata.get());
        return AjaxResult.success(stringdata.get());
    }

    // localhost:8082/collection/string?key=uuid&value=tuidhihids89
    @ApiOperation("写入字符串类型的值")
    @RequestMapping(value="/string",method = RequestMethod.PUT)
    @ResponseBody
    public  AjaxResult setString(@RequestParam String key, @RequestParam String value) {
        // 获取字符串格式的数据
        RBucket<String> stringdata = redissonClient.getBucket(key);
        stringdata.set(value);
        return AjaxResult.success();
    }


    @ApiOperation("读取hashmap的值")
    @RequestMapping(value="/getmap",method = RequestMethod.GET)
    @ResponseBody
    public  AjaxResult getMap(@RequestParam String key) {
        RMap<String, String> map = redissonClient.getMap(key);
        return AjaxResult.success(map);
    }

    @ApiOperation("向hashmap添加值")
    @RequestMapping(value="/putmap",method = RequestMethod.POST)
    @ResponseBody
    public  AjaxResult putMap(@RequestParam String key, @RequestParam String field, @RequestParam String value) {
        RMap<String, String> map = redissonClient.getMap(key);
        map.put(field, value);
        return AjaxResult.success(map);
    }

    @ApiOperation("向hashmap删除值")
    @RequestMapping(value="/delmap",method = RequestMethod.DELETE)
    @ResponseBody
    public  AjaxResult delMap(@RequestParam String key, @RequestParam String field) {
        RMap<String, String> map = redissonClient.getMap(key);
        map.remove(field);
        return AjaxResult.success(map);
    }


    @ApiOperation("读取list的值")
    @RequestMapping(value="/getList",method = RequestMethod.GET)
    @ResponseBody
    public AjaxResult getList(@RequestParam String key) {
        RList<String> rList = redissonClient.getList(key);
        return AjaxResult.success(rList);
    }

    @ApiOperation("给list添加元素")
    @RequestMapping(value="/addList",method = RequestMethod.GET)
    @ResponseBody
    public AjaxResult addList(@RequestParam String key, @RequestParam String[] value) {
        RList<String> rList = redissonClient.getList(key);
        Collections.addAll(rList, value);
        return AjaxResult.success(rList);
    }

    @ApiOperation("移除list指定值的元素")
    @RequestMapping(value="/removeList",method = RequestMethod.GET)
    @ResponseBody
    public  AjaxResult removeList(@RequestParam String key, @RequestParam String value) {
        RList<String> rList = redissonClient.getList(key);
        rList.remove(value);
        return AjaxResult.success(rList);
    }

    @ApiOperation("读取set的值")
    @RequestMapping(value="/getSet",method = RequestMethod.GET)
    @ResponseBody
    public  AjaxResult getSet(@RequestParam String key) {
        RSet<String> rSet = redissonClient.getSet(key);
        return AjaxResult.success(rSet);
    }

    @ApiOperation("给set添加元素")
    @RequestMapping(value="/putSet",method = RequestMethod.GET)
    @ResponseBody
    public  AjaxResult putSet(@RequestParam String key, @RequestParam String[] value) {
        RSet<String> rSet = redissonClient.getSet(key);
        Collections.addAll(rSet, value);
        return AjaxResult.success(rSet);
    }

    @ApiOperation("给set删除元素")
    @RequestMapping(value="/delSet",method = RequestMethod.GET)
    @ResponseBody
    public  AjaxResult delSet(@RequestParam String key, @RequestParam String value) {
        RSet<String> rSet = redissonClient.getSet(key);
        rSet.remove(value);
        return AjaxResult.success(rSet);
    }

    @ApiOperation("读取有序set的值")
    @RequestMapping(value="/getScoredSortedSet",method = RequestMethod.GET)
    @ResponseBody
    public  AjaxResult getSortedSet(@RequestParam String key) {
        RScoredSortedSet<String> sortedSet = redissonClient.getScoredSortedSet(key);
        return AjaxResult.success(sortedSet.entryRange(1, true, 10, true));
    }

    @ApiOperation("删除有序set的值")
    @RequestMapping(value="/delScoredSortedSet",method = RequestMethod.GET)
    @ResponseBody
    public  AjaxResult delSortedSet(@RequestParam String key, @RequestParam String value) {
        RScoredSortedSet<String> sortedSet = redissonClient.getScoredSortedSet(key);
        sortedSet.remove(value);
        return AjaxResult.success(sortedSet);
    }

    @ApiOperation("添加有序set的值")
    @RequestMapping(value="/addScoredSortedSet",method = RequestMethod.GET)
    @ResponseBody
    public  AjaxResult addScoredSortedSet(@RequestParam String key,@RequestParam Double score, @RequestParam String value) {
        RScoredSortedSet<String> sortedSet = redissonClient.getScoredSortedSet(key);
        sortedSet.add(score, value);
        return AjaxResult.success(sortedSet.entryRange(1, true, 10, true));
    }

    @ApiOperation("写入对象")
    @RequestMapping(value="/addObject",method = RequestMethod.POST)
    @ResponseBody
    public  AjaxResult addObject(@RequestParam String key, @RequestBody Actor actor) {
        RBucket<Actor> obj = redissonClient.getBucket(key);
        obj.set(actor);
        return AjaxResult.success(obj.get());
    }

    @ApiOperation("读取对象")
    @RequestMapping(value="/getObject",method = RequestMethod.GET)
    @ResponseBody
    public  AjaxResult getObject(@RequestParam String key) {
        RBucket<Actor> obj = redissonClient.getBucket(key);
        return AjaxResult.success(obj.get());
    }


    @ApiOperation("读取key信息")
    @GetMapping("getKeys")
    @ResponseBody
    public  AjaxResult getKeyInfo() {
        RKeys keys = redissonClient.getKeys();
        Iterable<String> allKeys = keys.getKeys();
        allKeys.forEach(a->System.out.println(a));
        Iterable<String> foundedKeys = keys.getKeysByPattern("rank*");
        foundedKeys.forEach(a->System.out.println(a));
        long numOfDeletedKeys = keys.delete("obj1", "obj2", "obj3");
        System.out.println(numOfDeletedKeys);
        long deletedKeysAmount = keys.deleteByPattern("test?");
        System.out.println(deletedKeysAmount);
        String randomKey = keys.randomKey();
        System.out.println(randomKey);
        long keysAmount = keys.count();
        System.out.println(keysAmount);
        return AjaxResult.success();
    }

    @ApiOperation("基于集合的多值映射,一个key可以有多个值")
    @GetMapping("multimap")
    @ResponseBody
    public  AjaxResult myMultimap() {
        RSetMultimap<String, String> map = redissonClient.getSetMultimap("myMultimap");
        map.put("name", "john");
        map.put("name", "brown");
        map.put("type", "1");
        Set<String> allValues = map.get("name");
        System.out.println(allValues);

        List<String> newValues = Arrays.asList("A", "B", "C");
        Set<String> oldValues = map.replaceValues("name", newValues);
        System.out.println(oldValues);
        System.out.println(map.get("name"));

        Set<String> removedValues = map.removeAll("name");
        System.out.println(removedValues);
        System.out.println(map.get("name"));
        return AjaxResult.success();
    }

    @ApiOperation("基于列表的多值映射,一个key可以有多个值")
    @GetMapping("listMultimap")
    public  AjaxResult listMultimap() {
        RListMultimap<String, String> map = redissonClient.getListMultimap("multiListMap");
        map.put("GDP", "2021A");
        map.put("GDP", "2021B");
        map.put("GDP", "2021C");
        map.put("货物周转量", "2021-02");

        List<String> allValues = map.get("GDP");
        System.out.println(allValues);
        List<String> newValues = Arrays.asList("2019A", "2019B", "2019C");
        List<String> oldValues = map.replaceValues("GDP", newValues);
        System.out.println(oldValues);
        List<String> removedValues = map.removeAll("GDP");
        System.out.println(removedValues);
        return AjaxResult.success();
    }
}