package si.planet9.mysql.log;

import com.mysql.jdbc.log.Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4j implements Log {

	private static final Logger log = LoggerFactory.getLogger(Slf4j.class);
	
	public Slf4j(String name) {}

	public boolean isDebugEnabled() {
		return log.isDebugEnabled();
	}

	public boolean isErrorEnabled() {
		return log.isErrorEnabled();
	}

	public boolean isFatalEnabled() {
		return log.isErrorEnabled();
	}

	public boolean isInfoEnabled() {
		return log.isInfoEnabled();
	}

	public boolean isTraceEnabled() {
		return log.isTraceEnabled();
	}

	public boolean isWarnEnabled() {
		return log.isWarnEnabled();
	}

	public void logDebug(Object msg) {
		log.debug(msg.toString());
	}

	public void logDebug(Object msg, Throwable e) {
		log.debug(msg.toString(), e);
	}

	public void logError(Object msg) {
		log.error(msg.toString());
	}

	public void logError(Object msg, Throwable e) {
		log.error(msg.toString(), e);
	}

	public void logFatal(Object msg) {
		log.error(msg.toString());		
	}

	public void logFatal(Object msg, Throwable e) {
		log.error(msg.toString(), e);
	}

	public void logInfo(Object msg) {
		log.info(msg.toString());
	}

	public void logInfo(Object msg, Throwable e) {
		log.info(msg.toString(), e);
	}

	public void logTrace(Object msg) {
		log.trace(msg.toString());
	}

	public void logTrace(Object msg, Throwable e) {
		log.trace(msg.toString(), e);
	}

	public void logWarn(Object msg) {
		log.warn(msg.toString());
	}

	public void logWarn(Object msg, Throwable e) {
		log.warn(msg.toString(), e);
	}
}
