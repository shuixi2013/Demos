package com.example.demo;

import android.os.Bundle;
import android.os.Environment;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import com.example.demo.testcase.AiQiYiTest;
import com.example.demo.testcase.BaseTest;
import com.example.demo.testcase.DongFangTouTiaoTest;
import com.example.demo.testcase.DuoQiShiPinTest;
import com.example.demo.testcase.HaHaShiPinTest;
import com.example.demo.testcase.HaoKanShiPinTest;
import com.example.demo.testcase.HuoNiuPinTest;
import com.example.demo.testcase.JinRiTouTiaoTest;
import com.example.demo.testcase.JuKanDianTest;
import com.example.demo.testcase.QuTouTiaoTest;
import com.example.demo.testcase.QuanMinXiaoShiPinTest;
import com.example.demo.testcase.ZhongQingKanDianTest;
import com.example.demo.testcase.log.LogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class AppTest {
  private final String TAG = getClass().getSimpleName();

  /**
   * 提供给已经root的设备使用
   */
  @Test
  public void testAllDevice() {
    Bundle a = InstrumentationRegistry.getArguments();
    LogUtil log = new LogUtil(TAG);
    int repeat = 1;
    List<BaseTest> tests = new ArrayList<>();
    try {
      repeat = Integer.parseInt(a.getString("repeat"));
      log.d("************************整体循环次数" + repeat + "************************");
    } catch (Exception e) {
      log.e("整体循环次数", e);
    }
    try {
      int aiqiyi = Integer.parseInt(a.getString("aiqiyi"));
      log.d("************************爱奇艺循环次数:" + aiqiyi + "************************");
      AiQiYiTest aiQiYiTest = new AiQiYiTest();
      tests.add(aiQiYiTest);
      aiqiyi = aiQiYiTest.start(aiqiyi); // 爱奇艺
      log.d("************************爱奇艺实际循环次数:" + aiqiyi + "************************");
    } catch (Exception e) {
      log.e("爱奇艺出错了:", e);
    }
    try {
      int haokan = Integer.parseInt(a.getString("haokan"));
      log.d("************************好看视频循环次数:" + haokan + "************************");
      HaoKanShiPinTest haoKanShiPinTest = new HaoKanShiPinTest();
      tests.add(haoKanShiPinTest);
      haokan = haoKanShiPinTest.start(haokan);
      log.d("************************好看视频实际循环次数:" + haokan + "************************");
    } catch (Exception e) {
      log.e("好看视频出错了", e);
    }
    try {
      int quanminxiaoship = Integer.parseInt(a.getString("quanminxiaoship"));
      log.d("************************全民小视频循环次数:" + quanminxiaoship + "************************");
      QuanMinXiaoShiPinTest quanMinXiaoShiPinTest = new QuanMinXiaoShiPinTest();
      tests.add(quanMinXiaoShiPinTest);
      quanminxiaoship = quanMinXiaoShiPinTest.start(quanminxiaoship);
      log.d("************************全民小视频实际循环次数:" + quanminxiaoship + "************************");
    } catch (Exception e) {
      log.e("全民小视频出错了", e);
    }
    try {
      int jinritoutiao = Integer.parseInt(a.getString("jinritoutiao"));
      log.d("************************今日头条循环次数:" + jinritoutiao + "************************");
      JinRiTouTiaoTest jinRiTouTiaoTest = new JinRiTouTiaoTest();
      tests.add(jinRiTouTiaoTest);
      jinritoutiao = jinRiTouTiaoTest.start(jinritoutiao);//今日头条
      log.d("************************今日头条实际循环次数:" + jinritoutiao + "************************");
    } catch (Exception e) {
      log.e("今日头条出错了", e);
    }
    while (repeat-- > 0) {
      try {
        int huoniushipin = Integer.parseInt(a.getString("huoniushipin"));
        log.d("************************火牛视频循环次数:" + huoniushipin + "************************");
        HuoNiuPinTest quTouTiaoTest = new HuoNiuPinTest();
        tests.add(quTouTiaoTest);
        huoniushipin = quTouTiaoTest.start(huoniushipin);
        log.d("************************火牛视频实际循环次数:" + huoniushipin + "************************");
      } catch (Exception e) {
        log.e("火牛视频出错了", e);
      }
      try {
        int duoqishipin = Integer.parseInt(a.getString("duoqishipin"));
        log.d("************************多奇视频循环次数:" + duoqishipin + "************************");
        DuoQiShiPinTest duoQiShiPinTest = new DuoQiShiPinTest();
        // tests.add(duoqishipin);
        duoqishipin = duoQiShiPinTest.start(duoqishipin);
        log.d("************************多奇视频实际循环次数:" + duoqishipin + "************************");
      } catch (Exception e) {
        log.e("haha视频出错了", e);
      }
      try {
        int hahashipin = Integer.parseInt(a.getString("hahashipin"));
        log.d("************************haha视频循环次数:" + hahashipin + "************************");
        HaHaShiPinTest haShiPinTest = new HaHaShiPinTest();
        // tests.add(haShiPinTest);
        hahashipin = haShiPinTest.start(hahashipin);
        log.d("************************haha视频实际循环次数:" + hahashipin + "************************");
      } catch (Exception e) {
        log.e("haha视频出错了", e);
      }
      try {
        int jukandian = Integer.parseInt(a.getString("jukandian"));
        log.d("************************聚看点循环次数:" + jukandian + "************************");
        JuKanDianTest juKanDianTest = new JuKanDianTest();
        tests.add(juKanDianTest);
        jukandian = juKanDianTest.start(jukandian); // 聚看点
        log.d("************************聚看点实际循环次数" + jukandian + "************************");
      } catch (Exception e) {
        log.e("聚看点出错了", e);
      }
      try {
        int zhongqingkandian = Integer.parseInt(a.getString("zhongqingkandian"));
        log.d("************************中青看点循环次数:" + zhongqingkandian + "************************");
        ZhongQingKanDianTest zhongQingKanDianTest = new ZhongQingKanDianTest();
        // tests.add(zhongQingKanDianTest);
        zhongqingkandian = zhongQingKanDianTest.start(zhongqingkandian);
        log.d("************************中青看点实际循环次数:" + zhongqingkandian + "************************");
      } catch (Exception e) {
        log.e("中青看点出错了", e);
      }
      try {
        int dongfangtoutiao = Integer.parseInt(a.getString("dongfangtoutiao"));
        log.d("************************东方头条循环次数:" + dongfangtoutiao + "************************");
        DongFangTouTiaoTest dongFangTouTiaoTest = new DongFangTouTiaoTest();
        tests.add(dongFangTouTiaoTest);
        dongfangtoutiao = dongFangTouTiaoTest.start(dongfangtoutiao); // 东方头条
        log.d("************************东方头条实际循环次数:" + dongfangtoutiao + "************************");
      } catch (Exception e) {
        log.e("东方头条出错了", e);
      }
    }

    // 阅读完成之后检测一下成果
    for (BaseTest test : tests) {
      test.doCheck();
    }

    // 运行结束,删除文件
    File directory = new File(Environment.getExternalStorageDirectory(), File.separator + "aaaaaa" + File.separator);
    File file = new File(directory, "shutdown.txt");
    if (file.exists()) {
      file.delete();
      log.d("************************运行结束,删除文件************************");
    }
  }

  /**
   * 荣耀6plus
   */
  @Test
  public void R6Test() {
    try {
      int i = 0;
      new JinRiTouTiaoTest().start(15); //10
      new AiQiYiTest().start(25); //20
      new HaoKanShiPinTest().start(35);//30
      while (i++ < 5) {
        Random random = new Random();
        // new HuoNiuPinTest().start(100);
        new JuKanDianTest().start(30 + random.nextInt(10));//200
        // new HaHaShiPinTest().start(50);
        new QuanMinXiaoShiPinTest().start(300);//30
        //new DongFangTouTiaoTest().start(50 + random.nextInt(10)); //1000
        // new DuoQiShiPinTest().start(1000);
      }
    } catch (Exception e) {
      LogUtil log = new LogUtil(TAG);

      log.e("出错了", e);
    }
  }

  /**
   * 好看视频
   */
  @Test
  public void HaoKanShiPinTest() {
    new HaoKanShiPinTest().start(50);
  }

  /**
   * 东方头条测试 高提成 每天5000+金币 使用[徒弟账号]跑用例
   */
  @Test
  public void DongFangTouTiaoTest() {
    new DongFangTouTiaoTest().start(200);
  }

  /**
   * 聚看点测试 每天2000-金币 记得[签到]奖励高
   */
  @Test
  public void JuKanDianTest() {
    new JuKanDianTest().start(200);
  }

  /**
   * 爱奇艺测试 每天500金币
   */
  @Test
  public void aiQiYiTest() {
    new AiQiYiTest().start(25);
  }

  /**
   * 今日头条测试 每天300金币
   */
  @Test
  public void JinRiTouTiaoTest() {
    new JinRiTouTiaoTest().start(25);
  }

  /**
   * 全民小视频测试
   */
  @Test
  public void quanMinXiaoShiPinTest() {
    new QuanMinXiaoShiPinTest().start(30);
  }

  /**
   * 中青看点测试
   */
  @Test
  public void zhongQingKanDianTest() {
    new ZhongQingKanDianTest().start(100);
  }

  /**
   * 哈哈视频测试
   */
  @Test
  public void hahaShiPinTest() {
    new HaHaShiPinTest().start(200);
  }

  /**
   * 哈哈视频测试
   */
  @Test
  public void huoNiuShiPinTest() {
    new HuoNiuPinTest().start(200);
  }

  /**
   * 多奇视频
   */
  @Test
  public void duoQiShiPinTest() {
    new DuoQiShiPinTest().start(2000);
  }
}
