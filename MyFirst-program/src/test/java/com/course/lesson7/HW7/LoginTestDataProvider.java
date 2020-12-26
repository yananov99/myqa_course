package com.course.lesson7.HW7;

/* Используя TestNg DataProvider который содержит 3 разных юзернейма и пароля
(не используйте реальные имена и пароли), зполнить форму http://the-internet.herokuapp.com/login,
 и нажать кнопку Login с помощью локатора XPATH
 */

import org.testng.annotations.DataProvider;

public class LoginTestDataProvider {

        @DataProvider(name = "data-provider-first")
        public Object [][] dataProviderMethod (){
            return new Object[][]{{ "User1", "123456"}, {"User2", "654321"}, {"User3", "25525"}};
        }




    }


