package org.kly.basicSkills.DesignPattrens.singleton;

/**
 *   计时计数类
 *
 * @author colia
 * @date 2017-07-20
 */
class CountTimer {

    private static CountTimer countTimer;

    private CountTimer() {
    }

    /**
     * 饿汉式加载，线程不安全
     */
    static CountTimer getCountTimer() {
        if (null == countTimer) {
            countTimer = new CountTimer();
        }
        return countTimer;
    }

    /**
     * 饿汉式加载，线程不安全 （Double Check Locking 双检查锁机制）
     */
    static CountTimer getCountTimerSynchronized() {
        if (null == countTimer) {
            //TODO
            //同步代码块 (只包住可能会导致多个实例产生的代码)
            synchronized (CountTimer.class) {
                if (null == countTimer) { //二次检查
                    countTimer = new CountTimer();
                }
            }
        }
        return countTimer;
    }
}