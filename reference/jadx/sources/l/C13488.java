package l;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.impl.StaticLoggerBinder;

/* JADX INFO: renamed from: l.ܰ֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: KA2K */
/* JADX INFO: loaded from: classes3.dex */
public final class C13488 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f44577;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String f44578;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static volatile int f44579;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f44580;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C22660 f44581 = new C22660();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C13012 f44576 = new C13012();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m32996() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f44580 = property == null ? false : property.equalsIgnoreCase("true");
        f44577 = new String[]{"1.6", "1.7"};
        f44578 = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m32999() {
        LinkedHashSet linkedHashSetM33003;
        try {
            try {
                try {
                    try {
                        if (m32996()) {
                            linkedHashSetM33003 = null;
                        } else {
                            linkedHashSetM33003 = m33003();
                            m33004(linkedHashSetM33003);
                        }
                        StaticLoggerBinder.getSingleton();
                        f44579 = 3;
                        m33000(linkedHashSetM33003);
                        m33001();
                    } catch (NoSuchMethodError e) {
                        String message = e.getMessage();
                        if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                            f44579 = 2;
                            C21248.m47725("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                            C21248.m47725("Your binding is version 1.5.5 or earlier.");
                            C21248.m47725("Upgrade your binding to version 1.6.x.");
                        }
                        throw e;
                    }
                } catch (NoClassDefFoundError e2) {
                    String message2 = e2.getMessage();
                    if (message2 == null || (!message2.contains("org/slf4j/impl/StaticLoggerBinder") && !message2.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                        f44579 = 2;
                        System.err.println("Failed to instantiate SLF4J LoggerFactory");
                        System.err.println("Reported exception:");
                        throw e2;
                    }
                    f44579 = 4;
                    C21248.m47725("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                    C21248.m47725("Defaulting to no-operation (NOP) logger implementation");
                    C21248.m47725("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                    m33001();
                }
            } catch (Exception e3) {
                f44579 = 2;
                System.err.println("Failed to instantiate SLF4J LoggerFactory");
                System.err.println("Reported exception:");
                throw new IllegalStateException("Unexpected initialization failure", e3);
            }
        } catch (Throwable th) {
            m33001();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m33001() {
        C22660 c22660 = f44581;
        synchronized (c22660) {
            c22660.m50194();
            for (C6431 c6431 : c22660.m50196()) {
                c6431.m17611(m32998(c6431.getName()));
            }
        }
        LinkedBlockingQueue linkedBlockingQueueM50197 = f44581.m50197();
        int size = linkedBlockingQueueM50197.size();
        ArrayList<C21954> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueM50197.drainTo(arrayList, 128) != 0) {
            for (C21954 c21954 : arrayList) {
                if (c21954 != null) {
                    C6431 c6431M48783 = c21954.m48783();
                    String name = c6431M48783.getName();
                    if (c6431M48783.m17609()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!c6431M48783.m17614()) {
                        if (c6431M48783.m17613()) {
                            c6431M48783.m17612(c21954);
                        } else {
                            C21248.m47725(name);
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (!c21954.m48783().m17613()) {
                        if (!c21954.m48783().m17614()) {
                            C21248.m47725("The following set of substitute loggers may have been accessed");
                            C21248.m47725("during the initialization phase. Logging calls during this");
                            C21248.m47725("phase were not honored. However, subsequent logging calls to these");
                            C21248.m47725("loggers will work as normally expected.");
                            C21248.m47725("See also http://www.slf4j.org/codes.html#substituteLogger");
                        }
                    } else {
                        C21248.m47725("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        C21248.m47725("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        C21248.m47725("See also http://www.slf4j.org/codes.html#replay");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        f44581.m50195();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final void m33005() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f44577) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C21248.m47725("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f44577).toString());
            C21248.m47725("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable unused2) {
            System.err.println("Unexpected problem occured during version sanity check");
            System.err.println("Reported exception:");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static LinkedHashSet m33003() {
        Enumeration<URL> resources;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C13488.class.getClassLoader();
            String str = f44578;
            if (classLoader == null) {
                resources = ClassLoader.getSystemResources(str);
            } else {
                resources = classLoader.getResources(str);
            }
            while (resources.hasMoreElements()) {
                linkedHashSet.add(resources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException unused) {
            System.err.println("Error getting resources from path");
            System.err.println("Reported exception:");
            return linkedHashSet;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33000(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        C21248.m47725("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m33004(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            C21248.m47725("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                C21248.m47725("Found binding in [" + ((URL) it.next()) + "]");
            }
            C21248.m47725("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 m32998(String str) {
        return m33002().mo10387(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 m32997(Class cls) {
        Class clsM47724;
        InterfaceC4314 interfaceC4314M32998 = m32998(cls.getName());
        if (f44580 && (clsM47724 = C21248.m47724()) != null && !clsM47724.isAssignableFrom(cls)) {
            C21248.m47725("Detected logger name mismatch. Given name: \"" + interfaceC4314M32998.getName() + "\"; computed name: \"" + clsM47724.getName() + "\".");
            C21248.m47725("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return interfaceC4314M32998;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3524 m33002() {
        if (f44579 == 0) {
            synchronized (C13488.class) {
                if (f44579 == 0) {
                    f44579 = 1;
                    m32999();
                    if (f44579 == 3) {
                        m33005();
                    }
                }
            }
        }
        int i = f44579;
        if (i == 1) {
            return f44581;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return f44576;
        }
        throw new IllegalStateException("Unreachable code");
    }
}
