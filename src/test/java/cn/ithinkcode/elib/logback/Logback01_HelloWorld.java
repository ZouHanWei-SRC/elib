package cn.ithinkcode.elib.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

/**
 * 根据 Logback 的默认配置策略，当未找到默认配置文件时，Logback 会将 ConsoleAppender 添加到根记录器。
 * 
 * 配置文件读取： logback-test.xml -> logback.groovy -> logback.xml
 * 
 * @author ADMIN
 *
 */
public class Logback01_HelloWorld {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger("cn.ithinkcode.elib.logback.Logback01_HelloWorld");
		logger.debug("Hello world.");

		// print internal state
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		StatusPrinter.print(lc);
	}

}
