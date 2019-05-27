package com.shopping.service;

import com.shopping.entity.ShoppingRecord;
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
* ShoppingCarServiceImplement Tester. 
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
public class ShoppingCarServiceImplementTest { 
    @Autowired
    private ShoppingCarServiceImplement shoppingCarServiceImplement;
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getShoppingCar(int userId, int productId) 
* 
*/ 
@Test
public void testGetShoppingCar() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: addShoppingCar(ShoppingCar shoppingCar) 
* 
*/ 
@Test
public void testAddShoppingCar() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: deleteShoppingCar(int userId, int productId) 
* 
*/ 
@Test
public void testDeleteShoppingCar() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: updateShoppingCar(ShoppingCar shoppingCar) 
* 
*/ 
@Test
public void testUpdateShoppingCar() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getShoppingCars(int userId) 
* 
*/ 
@Test
public void testGetShoppingCars() throws Exception { 
//TODO: Test goes here... 
} 


} 
