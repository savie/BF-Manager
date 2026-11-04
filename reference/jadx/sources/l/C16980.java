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

/* JADX INFO: renamed from: l.ܺܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: KA2K */
/* JADX INFO: loaded from: classes4.dex */
public final class C16980 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f55506;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static volatile int f55507;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String f55509;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f55510;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C14742 f55508 = new C14742();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C6540 f55511 = new C6540();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m40046() {
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
        f55510 = property == null ? false : property.equalsIgnoreCase("true");
        f55506 = new String[]{"1.6", "1.7"};
        f55509 = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m40039() {
        LinkedHashSet linkedHashSetM40044;
        try {
            try {
                try {
                    try {
                        if (m40046()) {
                            linkedHashSetM40044 = null;
                        } else {
                            linkedHashSetM40044 = m40044();
                            m40045(linkedHashSetM40044);
                        }
                        StaticLoggerBinder.getSingleton();
                        f55507 = 3;
                        m40040(linkedHashSetM40044);
                        m40043();
                    } catch (NoSuchMethodError e) {
                        String message = e.getMessage();
                        if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                            f55507 = 2;
                            C18472.m43051("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                            C18472.m43051("Your binding is version 1.5.5 or earlier.");
                            C18472.m43051("Upgrade your binding to version 1.6.x.");
                        }
                        throw e;
                    }
                } catch (NoClassDefFoundError e2) {
                    String message2 = e2.getMessage();
                    if (message2 == null || (!message2.contains("org/slf4j/impl/StaticLoggerBinder") && !message2.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                        f55507 = 2;
                        System.err.println("Failed to instantiate SLF4J LoggerFactory");
                        System.err.println("Reported exception:");
                        throw e2;
                    }
                    f55507 = 4;
                    C18472.m43051("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                    C18472.m43051("Defaulting to no-operation (NOP) logger implementation");
                    C18472.m43051("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                    m40043();
                }
            } catch (Exception e3) {
                f55507 = 2;
                System.err.println("Failed to instantiate SLF4J LoggerFactory");
                System.err.println("Reported exception:");
                throw new IllegalStateException("Unexpected initialization failure", e3);
            }
        } catch (Throwable th) {
            m40043();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m40043() {
        C14742 c14742 = f55508;
        synchronized (c14742) {
            c14742.m35431();
            for (C4302 c4302 : c14742.m35429()) {
                c4302.m13705(m40038(c4302.getName()));
            }
        }
        LinkedBlockingQueue linkedBlockingQueueM35430 = f55508.m35430();
        int size = linkedBlockingQueueM35430.size();
        ArrayList<C3556> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueM35430.drainTo(arrayList, 128) != 0) {
            for (C3556 c3556 : arrayList) {
                if (c3556 != null) {
                    C4302 c4302M11587 = c3556.m11587();
                    String name = c4302M11587.getName();
                    if (c4302M11587.m13714()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!c4302M11587.m13715()) {
                        if (c4302M11587.m13719()) {
                            c4302M11587.m13704(c3556);
                        } else {
                            C18472.m43051(name);
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (!c3556.m11587().m13719()) {
                        if (!c3556.m11587().m13715()) {
                            C18472.m43051("The following set of substitute loggers may have been accessed");
                            C18472.m43051("during the initialization phase. Logging calls during this");
                            C18472.m43051("phase were not honored. However, subsequent logging calls to these");
                            C18472.m43051("loggers will work as normally expected.");
                            C18472.m43051("See also http://www.slf4j.org/codes.html#substituteLogger");
                        }
                    } else {
                        C18472.m43051("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        C18472.m43051("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        C18472.m43051("See also http://www.slf4j.org/codes.html#replay");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        f55508.m35428();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final void m40042() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f55506) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C18472.m43051("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f55506).toString());
            C18472.m43051("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable unused2) {
            System.err.println("Unexpected problem occured during version sanity check");
            System.err.println("Reported exception:");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static LinkedHashSet m40044() {
        Enumeration<URL> resources;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C16980.class.getClassLoader();
            String str = f55509;
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
    public static void m40040(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        C18472.m43051("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m40045(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            C18472.m43051("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                C18472.m43051("Found binding in [" + ((URL) it.next()) + "]");
            }
            C18472.m43051("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 m40038(String str) {
        return m40041().mo18415(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 m40037(Class cls) {
        Class clsM43050;
        InterfaceC25186 interfaceC25186M40038 = m40038(cls.getName());
        if (f55510 && (clsM43050 = C18472.m43050()) != null && !clsM43050.isAssignableFrom(cls)) {
            C18472.m43051("Detected logger name mismatch. Given name: \"" + interfaceC25186M40038.getName() + "\"; computed name: \"" + clsM43050.getName() + "\".");
            C18472.m43051("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return interfaceC25186M40038;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC11759 m40041() {
        if (f55507 == 0) {
            synchronized (C16980.class) {
                if (f55507 == 0) {
                    f55507 = 1;
                    m40039();
                    if (f55507 == 3) {
                        m40042();
                    }
                }
            }
        }
        int i = f55507;
        if (i == 1) {
            return f55508;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return f55511;
        }
        throw new IllegalStateException("Unreachable code");
    }
}
