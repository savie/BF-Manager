package l;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.management.ManagementFactory;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.management.InstanceAlreadyExistsException;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

/* JADX INFO: renamed from: l.ۙᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAIG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4817 extends AbstractC17622 {

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final String f16923 = InterfaceC5523.class.getName();

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f16927;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC5523 f16930;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f16932;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C14801 f16935;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile boolean f16938;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public RunnableC2099 f16940;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final ObjectName f16942;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f16939 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f16949 = true;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public volatile C21813 f16929 = C19635.f63039;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f16951 = true;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f16947 = false;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f16934 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile C21813 f16926 = C19635.f63044;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f16952 = 3;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public volatile C21813 f16933 = C19635.f63043;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public volatile C21813 f16946 = C19635.f63037;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public volatile C21813 f16937 = C19635.f63038;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f16944 = new Object();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Object f16928 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AtomicLong f16924 = new AtomicLong();

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f16950 = new AtomicLong();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f16945 = new AtomicLong();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f16941 = new AtomicLong();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AtomicLong f16953 = new AtomicLong();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f16936 = new AtomicLong();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C3510 f16943 = new C3510();

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C3510 f16931 = new C3510();

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C3510 f16948 = new C3510();

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f16925 = new AtomicReference(C21813.ZERO);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo13381();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract void mo13388();

    public AbstractC4817(C23978 c23978, String str) {
        if (c23978.m44754()) {
            this.f16942 = m13378(c23978, str);
        } else {
            this.f16942 = null;
        }
        Exception exc = new Exception();
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        this.f16932 = stringWriter.toString();
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            this.f16927 = null;
        } else {
            this.f16927 = new WeakReference(contextClassLoader);
        }
    }

    static {
        C21813.ofSeconds(2147483647L);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m13380() {
        return this.f16949;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC5523 m13397() {
        return this.f16930;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m13390() {
        return this.f16951;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m13396() {
        return this.f16939;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21813 m13392() {
        return this.f16929;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C21813 m13387() {
        return this.f16933;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m13393() {
        return this.f16952;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21813 m13395() {
        return this.f16946;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m13394() {
        return this.f16947;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m13379() {
        return this.f16934;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ObjectName m13378(C23978 c23978, String str) {
        ObjectName objectName;
        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName2 = null;
        boolean z = false;
        int i = 1;
        while (!z) {
            if (i == 1) {
                try {
                    objectName = new ObjectName("org.apache.commons.pool2:type=GenericKeyedObjectPool,name=" + str);
                } catch (MBeanRegistrationException | NotCompliantMBeanException unused) {
                } catch (MalformedObjectNameException unused2) {
                    if (!"pool".equals(str) || !"org.apache.commons.pool2:type=GenericKeyedObjectPool,name=".equals("org.apache.commons.pool2:type=GenericKeyedObjectPool,name=")) {
                        str = "pool";
                    }
                } catch (InstanceAlreadyExistsException unused3) {
                    i++;
                }
            } else {
                objectName = new ObjectName("org.apache.commons.pool2:type=GenericKeyedObjectPool,name=" + str + i);
            }
            platformMBeanServer.registerMBean(this, objectName);
            objectName2 = objectName;
            z = true;
        }
        return objectName2;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m13389() {
        if (this.f16942 != null) {
            try {
                ManagementFactory.getPlatformMBeanServer().unregisterMBean(this.f16942);
            } catch (MBeanRegistrationException | InstanceNotFoundException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13386(C23978 c23978) {
        this.f16951 = true;
        this.f16929 = C17517.m40777(c23978.m44749(), C19635.f63039);
        this.f16949 = true;
        this.f16947 = c23978.m44752();
        this.f16934 = c23978.m44751();
        this.f16952 = 3;
        this.f16933 = C17517.m40777(c23978.m44741(), C19635.f63043);
        this.f16926 = C17517.m40777(c23978.m44738(), C19635.f63044);
        m13385(this.f16926);
        this.f16946 = C17517.m40777(c23978.m44750(), C19635.f63037);
        String strM44743 = c23978.m44743();
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        String str = f16923;
        ClassLoader classLoader = InterfaceC5523.class.getClassLoader();
        try {
            try {
                try {
                    this.f16930 = (InterfaceC5523) Class.forName(strM44743, true, contextClassLoader).getConstructor(null).newInstance(null);
                } catch (ClassCastException | ClassNotFoundException unused) {
                    this.f16930 = (InterfaceC5523) Class.forName(strM44743, true, classLoader).getConstructor(null).newInstance(null);
                }
                this.f16937 = C17517.m40777(c23978.m44737(), C19635.f63038);
            } catch (ClassCastException unused2) {
                throw new IllegalArgumentException("Class " + strM44743 + " from class loaders [" + contextClassLoader + ", " + classLoader + "] do not implement " + str);
            } catch (ClassNotFoundException e) {
                e = e;
                throw new IllegalArgumentException(C7997.m21055("Unable to create ", str, " instance of type ", strM44743), e);
            }
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new IllegalArgumentException(C7997.m21055("Unable to create ", str, " instance of type ", strM44743), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new IllegalArgumentException(C7997.m21055("Unable to create ", str, " instance of type ", strM44743), e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new IllegalArgumentException(C7997.m21055("Unable to create ", str, " instance of type ", strM44743), e);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new IllegalArgumentException(C7997.m21055("Unable to create ", str, " instance of type ", strM44743), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13382(int i) {
        this.f16939 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13385(C21813 c21813) {
        synchronized (this.f16928) {
            boolean zM40778 = C17517.m40778(c21813);
            RunnableC2099 runnableC2099 = this.f16940;
            if (runnableC2099 == null) {
                if (zM40778) {
                    RunnableC2099 runnableC20910 = new RunnableC2099(this);
                    this.f16940 = runnableC20910;
                    C6934.m18591(runnableC20910, c21813, c21813);
                }
            } else if (zM40778) {
                synchronized (C6934.class) {
                    C6934.m18592(this.f16940, this.f16937, true);
                    this.f16935 = null;
                    RunnableC2099 runnableC20911 = new RunnableC2099(this);
                    this.f16940 = runnableC20911;
                    C6934.m18591(runnableC20911, c21813, c21813);
                }
            } else {
                C6934.m18592(runnableC2099, this.f16937, false);
            }
        }
    }

    @Override // l.AbstractC17622
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo13383(StringBuilder sb) {
        sb.append("maxTotal=");
        sb.append(this.f16939);
        sb.append(", blockWhenExhausted=");
        sb.append(this.f16949);
        sb.append(", maxWaitDuration=");
        sb.append(this.f16929);
        sb.append(", lifo=");
        sb.append(this.f16951);
        sb.append(", fairness=");
        sb.append(false);
        sb.append(", testOnCreate=");
        sb.append(false);
        sb.append(", testOnBorrow=");
        sb.append(this.f16947);
        sb.append(", testOnReturn=");
        sb.append(false);
        sb.append(", testWhileIdle=");
        sb.append(this.f16934);
        sb.append(", durationBetweenEvictionRuns=");
        sb.append(this.f16926);
        sb.append(", numTestsPerEvictionRun=");
        sb.append(this.f16952);
        sb.append(", minEvictableIdleTimeDuration=");
        sb.append(this.f16933);
        sb.append(", softMinEvictableIdleTimeDuration=");
        sb.append(this.f16946);
        sb.append(", evictionPolicy=");
        sb.append(this.f16930);
        sb.append(", closeLock=");
        sb.append(this.f16944);
        sb.append(", closed=");
        sb.append(this.f16938);
        sb.append(", evictionLock=");
        sb.append(this.f16928);
        sb.append(", evictor=");
        sb.append(this.f16940);
        sb.append(", evictionIterator=");
        sb.append(this.f16935);
        sb.append(", factoryClassLoader=");
        sb.append(this.f16927);
        sb.append(", oname=");
        sb.append(this.f16942);
        sb.append(", creationStackTrace=");
        sb.append(this.f16932);
        sb.append(", borrowedCount=");
        sb.append(this.f16924);
        sb.append(", returnedCount=");
        sb.append(this.f16950);
        sb.append(", createdCount=");
        sb.append(this.f16945);
        sb.append(", destroyedCount=");
        sb.append(this.f16941);
        sb.append(", destroyedByEvictorCount=");
        sb.append(this.f16953);
        sb.append(", destroyedByBorrowValidationCount=");
        sb.append(this.f16936);
        sb.append(", activeTimes=");
        sb.append(this.f16943);
        sb.append(", idleTimes=");
        sb.append(this.f16931);
        sb.append(", waitTimes=");
        sb.append(this.f16948);
        sb.append(", maxBorrowWaitDuration=");
        sb.append(this.f16925);
        sb.append(", swallowedExceptionListener=");
        sb.append((Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13384(InterfaceC11273 interfaceC11273, C21813 c21813) {
        this.f16924.incrementAndGet();
        this.f16931.m10337(interfaceC11273.mo28256());
        this.f16948.m10337(c21813);
        while (true) {
            AtomicReference atomicReference = this.f16925;
            C21813 c21814 = (C21813) atomicReference.get();
            if (c21814.compareTo(c21813) >= 0) {
                return;
            }
            while (!atomicReference.compareAndSet(c21814, c21813)) {
                if (atomicReference.get() != c21814) {
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13391(C21813 c21813) {
        this.f16950.incrementAndGet();
        this.f16943.m10337(c21813);
    }
}
