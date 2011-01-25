package si.planet9.mysql;

import com.mysql.jdbc.log.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;

public class Log4j implements Log {
	private static final Logger log = Logger.getLogger(Log4j.class);
	
	public Log4j (String name) {}

	public boolean isDebugEnabled() {
		return log.isDebugEnabled();
	}

	public boolean isErrorEnabled() {
		return log.isEnabledFor(Level.ERROR);
	}

	public boolean isFatalEnabled() {
		return log.isEnabledFor(Level.FATAL);
	}

	public boolean isInfoEnabled() {
		return log.isEnabledFor(Level.INFO);
	}

	public boolean isTraceEnabled() {
		return log.isTraceEnabled();
	}

	public boolean isWarnEnabled() {
		return log.isEnabledFor(Level.WARN);
	}

	public void logDebug(Object msg) {
		log.debug(msg);
	}

	public void logDebug(Object msg, Throwable e) {
		log.debug(msg, e);
	}

	public void logError(Object msg) {
		log.error(msg);
	}

	public void logError(Object msg, Throwable e) {
		log.error(msg, e);
	}

	public void logFatal(Object msg) {
		log.fatal(msg);		
	}

	public void logFatal(Object msg, Throwable e) {
		log.fatal(msg, e);
	}

	public void logInfo(Object msg) {
		log.info(msg);
	}

	public void logInfo(Object msg, Throwable e) {
		log.info(msg, e);
	}

	public void logTrace(Object msg) {
		log.trace(msg);
	}

	public void logTrace(Object msg, Throwable e) {
		log.trace(msg, e);
	}

	public void logWarn(Object msg) {
		log.warn(msg);
	}

	public void logWarn(Object msg, Throwable e) {
		log.warn(msg, e);
	}
}