package com.shopping.controller;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

/** 
* ShoppingRecordController Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 28, 2019</pre> 
* @version 1.0 
*/

@RunWith(SpringJUnit4ClassRunner.class)
//��������Ļع�,�����ݿ����ɾ�Ķ���ع�,���ڲ���������ѭ������
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
//���Ե�ʱ����ط�����
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml"})
public class ShoppingRecordControllerTest { 
    @Autowired
    private ShoppingRecordController shoppingRecordController;
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: shopping_record() 
* 
*/ 
@Test
public void testShopping_record() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: shopping_handle() 
* 
*/ 
@Test
public void testShopping_handle() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: addShoppingRecord(int userId, int productId, int counts) 
* 
*/ 
@Test
public void testAddShoppingRecord() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: changeShoppingRecord(int userId, int productId, String time, int orderStatus) 
* 
*/ 
@Test
public void testChangeShoppingRecord() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getShoppingRecords(int userId) 
* 
*/ 
@Test
public void testGetShoppingRecords() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getShoppingRecordsByOrderStatus(int orderStatus) 
* 
*/ 
@Test
public void testGetShoppingRecordsByOrderStatus() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getAllShoppingRecords() 
* 
*/ 
@Test
public void testGetAllShoppingRecords() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getUserProductRecord(int userId, int productId) 
* 
*/ 
@Test
public void testGetUserProductRecord() throws Exception { 
//TODO: Test goes here... 
} 


} 
