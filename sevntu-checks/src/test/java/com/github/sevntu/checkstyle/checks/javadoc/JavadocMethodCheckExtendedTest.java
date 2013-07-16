package com.github.sevntu.checkstyle.checks.javadoc;


import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

import com.github.sevntu.checkstyle.BaseCheckTestSupport;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;


public class JavadocMethodCheckExtendedTest extends BaseCheckTestSupport {
    private final DefaultConfiguration checkConfig = createCheckConfig(JavaDocMethodCheckExtended.class);
    
    private static final String msg = "eror";
    
    @Test
    public void test1() throws Exception
    {
        checkConfig.addAttribute("mAllowFinal", "true");
        
            String[] expected = {
                    "17:1 " + msg
                    

            };
    verify(checkConfig, getPath("Inputjavadoc.java"), expected);
        }
    @Test
    public void test2() throws Exception
    {
        checkConfig.addAttribute("mAllowAbstract", "true");
        
        String[] expected = {
                ""
                
        };
    }
    
    @Test
    public void test3() throws Exception
    {
        checkConfig.addAttribute("mAllowOverrideMethod", "true");
        
 String[] expected = {
         "60:9 " + msg
                
        };
       verify(checkConfig, getPath("Inputjavadoc.java"), expected);
        
    }
    
    
    
    
}