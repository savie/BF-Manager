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
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۛ᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAIG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6727 extends AbstractC25373 {

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final String f22382 = InterfaceC21643.class.getName();

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC21643 f22388;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C23881 f22390;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile boolean f22391;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f22394;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final ObjectName f22402;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public RunnableC3743 f22409;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f22410;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public volatile int f22389 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f22408 = true;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public volatile C18257 f22385 = C21798.f69502;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f22400 = true;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f22411 = false;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f22387 = false;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public volatile C18257 f22392 = C21798.f69506;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f22412 = 3;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public volatile C18257 f22396 = C21798.f69508;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public volatile C18257 f22401 = C21798.f69509;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public volatile C18257 f22395 = C21798.f69505;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f22383 = new Object();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Object f22398 = new Object();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f22404 = new AtomicLong();

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f22403 = new AtomicLong();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f22405 = new AtomicLong();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f22386 = new AtomicLong();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f22393 = new AtomicLong();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AtomicLong f22384 = new AtomicLong();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12692 f22399 = new C12692();

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C12692 f22406 = new C12692();

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C12692 f22407 = new C12692();

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f22397 = new AtomicReference(C18257.ZERO);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14486();

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo14492();

    public AbstractC6727(C21622 c21622, String str) {
        if (c21622.m49437()) {
            this.f22402 = m18769(c21622, str);
        } else {
            this.f22402 = null;
        }
        Exception exc = new Exception();
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        this.f22394 = stringWriter.toString();
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            this.f22410 = null;
        } else {
            this.f22410 = new WeakReference(contextClassLoader);
        }
    }

    static {
        C18257.ofSeconds(2147483647L);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m18778() {
        return this.f22408;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21643 m18779() {
        return this.f22388;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m18776() {
        return this.f22400;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m18781() {
        return this.f22389;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C18257 m18780() {
        return this.f22385;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C18257 m18770() {
        return this.f22396;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m18783() {
        return this.f22412;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C18257 m18771() {
        return this.f22401;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m18784() {
        return this.f22411;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m18782() {
        return this.f22387;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ObjectName m18769(C21622 c21622, String str) {
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

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m18777() {
        if (this.f22402 != null) {
            try {
                ManagementFactory.getPlatformMBeanServer().unregisterMBean(this.f22402);
            } catch (MBeanRegistrationException | InstanceNotFoundException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18775(C21622 c21622) {
        this.f22400 = true;
        this.f22385 = C16576.m39246(c21622.m49438(), C21798.f69502);
        this.f22408 = true;
        this.f22411 = c21622.m49428();
        this.f22387 = c21622.m49442();
        this.f22412 = 3;
        this.f22396 = C16576.m39246(c21622.m49427(), C21798.f69508);
        this.f22392 = C16576.m39246(c21622.m49429(), C21798.f69506);
        m18774(this.f22392);
        this.f22401 = C16576.m39246(c21622.m49441(), C21798.f69509);
        String strM49443 = c21622.m49443();
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        String str = f22382;
        ClassLoader classLoader = InterfaceC21643.class.getClassLoader();
        try {
            try {
                try {
                    this.f22388 = (InterfaceC21643) Class.forName(strM49443, true, contextClassLoader).getConstructor(null).newInstance(null);
                } catch (ClassCastException | ClassNotFoundException unused) {
                    this.f22388 = (InterfaceC21643) Class.forName(strM49443, true, classLoader).getConstructor(null).newInstance(null);
                }
                this.f22395 = C16576.m39246(c21622.m49434(), C21798.f69505);
            } catch (ClassCastException unused2) {
                throw new IllegalArgumentException("Class " + strM49443 + " from class loaders [" + contextClassLoader + ", " + classLoader + "] do not implement " + str);
            } catch (ClassNotFoundException e) {
                e = e;
                throw new IllegalArgumentException(ExternalValue$$ExternalSyntheticOutline0.m("Unable to create ", str, " instance of type ", strM49443), e);
            }
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new IllegalArgumentException(ExternalValue$$ExternalSyntheticOutline0.m("Unable to create ", str, " instance of type ", strM49443), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new IllegalArgumentException(ExternalValue$$ExternalSyntheticOutline0.m("Unable to create ", str, " instance of type ", strM49443), e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new IllegalArgumentException(ExternalValue$$ExternalSyntheticOutline0.m("Unable to create ", str, " instance of type ", strM49443), e);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new IllegalArgumentException(ExternalValue$$ExternalSyntheticOutline0.m("Unable to create ", str, " instance of type ", strM49443), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18772(int i) {
        this.f22389 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18774(C18257 c18257) {
        synchronized (this.f22398) {
            boolean zM39247 = C16576.m39247(c18257);
            RunnableC3743 runnableC3743 = this.f22409;
            if (runnableC3743 == null) {
                if (zM39247) {
                    RunnableC3743 runnableC3744 = new RunnableC3743(this);
                    this.f22409 = runnableC3744;
                    C10454.m26878(runnableC3744, c18257, c18257);
                }
            } else if (zM39247) {
                synchronized (C10454.class) {
                    C10454.m26879(this.f22409, this.f22395, true);
                    this.f22390 = null;
                    RunnableC3743 runnableC3745 = new RunnableC3743(this);
                    this.f22409 = runnableC3745;
                    C10454.m26878(runnableC3745, c18257, c18257);
                }
            } else {
                C10454.m26879(runnableC3743, this.f22395, false);
            }
        }
    }

    @Override // l.AbstractC25373
    /* JADX INFO: renamed from: ۙ */
    public void mo14489(StringBuilder sb) {
        sb.append("maxTotal=");
        sb.append(this.f22389);
        sb.append(", blockWhenExhausted=");
        sb.append(this.f22408);
        sb.append(", maxWaitDuration=");
        sb.append(this.f22385);
        sb.append(", lifo=");
        sb.append(this.f22400);
        sb.append(", fairness=");
        sb.append(false);
        sb.append(", testOnCreate=");
        sb.append(false);
        sb.append(", testOnBorrow=");
        sb.append(this.f22411);
        sb.append(", testOnReturn=");
        sb.append(false);
        sb.append(", testWhileIdle=");
        sb.append(this.f22387);
        sb.append(", durationBetweenEvictionRuns=");
        sb.append(this.f22392);
        sb.append(", numTestsPerEvictionRun=");
        sb.append(this.f22412);
        sb.append(", minEvictableIdleTimeDuration=");
        sb.append(this.f22396);
        sb.append(", softMinEvictableIdleTimeDuration=");
        sb.append(this.f22401);
        sb.append(", evictionPolicy=");
        sb.append(this.f22388);
        sb.append(", closeLock=");
        sb.append(this.f22383);
        sb.append(", closed=");
        sb.append(this.f22391);
        sb.append(", evictionLock=");
        sb.append(this.f22398);
        sb.append(", evictor=");
        sb.append(this.f22409);
        sb.append(", evictionIterator=");
        sb.append(this.f22390);
        sb.append(", factoryClassLoader=");
        sb.append(this.f22410);
        sb.append(", oname=");
        sb.append(this.f22402);
        sb.append(", creationStackTrace=");
        sb.append(this.f22394);
        sb.append(", borrowedCount=");
        sb.append(this.f22404);
        sb.append(", returnedCount=");
        sb.append(this.f22403);
        sb.append(", createdCount=");
        sb.append(this.f22405);
        sb.append(", destroyedCount=");
        sb.append(this.f22386);
        sb.append(", destroyedByEvictorCount=");
        sb.append(this.f22393);
        sb.append(", destroyedByBorrowValidationCount=");
        sb.append(this.f22384);
        sb.append(", activeTimes=");
        sb.append(this.f22399);
        sb.append(", idleTimes=");
        sb.append(this.f22406);
        sb.append(", waitTimes=");
        sb.append(this.f22407);
        sb.append(", maxBorrowWaitDuration=");
        sb.append(this.f22397);
        sb.append(", swallowedExceptionListener=");
        sb.append((Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18773(InterfaceC17913 interfaceC17913, C18257 c18257) {
        this.f22404.incrementAndGet();
        this.f22406.m31489(interfaceC17913.mo14212());
        this.f22407.m31489(c18257);
        while (true) {
            AtomicReference atomicReference = this.f22397;
            C18257 c18258 = (C18257) atomicReference.get();
            if (c18258.compareTo(c18257) >= 0) {
                return;
            }
            while (!atomicReference.compareAndSet(c18258, c18257)) {
                if (atomicReference.get() != c18258) {
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18785(C18257 c18257) {
        this.f22403.incrementAndGet();
        this.f22399.m31489(c18257);
    }
}
