package l;

import android.content.res.AssetManager;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.۬ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12859 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static volatile C5097 f42770;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f42771 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f42773 = new ThreadLocal();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f42772 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static synchronized void m31867() {
        try {
            final AssetManager assetManagerM39286 = C16737.m39286();
            C15432 c15432M46724 = C11904.f39938.m46690("syntax/online").m46724();
            C5097 c5097M31873 = null;
            if (c15432M46724.mo33974()) {
                final C15432 c15432M46725 = c15432M46724.m46690("init/styles.mtsx").m46724();
                final C15432 c15432M46726 = c15432M46724.m46690("init/builtins.mtsx").m46724();
                C15432 c15432M46727 = c15432M46724.m46690("VERSION").m46724();
                int i = -1;
                try {
                    if (c15432M46727.mo33975()) {
                        i = c15432M46727.m46713().readInt();
                    }
                } catch (Exception unused) {
                }
                if (i > 14) {
                    final List list = (List) C9030.stream(c15432M46724.mo33983(true)).filter(new C15951(0)).collect(C1890.toList());
                    try {
                        if (!c15432M46725.mo33971() || !c15432M46726.mo33971() || list.isEmpty()) {
                            throw new IOException("Incomplete online syntax package");
                        }
                        c5097M31873 = m31873(new InterfaceC0863() { // from class: l.֡۬ۚ
                            @Override // l.InterfaceC0863
                            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                            public final void mo2218(C22031 c22031) throws IOException {
                                C12859.m31885(c15432M46725, c15432M46726, list, assetManagerM39286, c22031);
                            }
                        });
                    } catch (Throwable th) {
                        try {
                            AbstractC20745 abstractC20745M46706 = c15432M46724.m46706("online_bad");
                            abstractC20745M46706.mo24647();
                            c15432M46724.mo24646(abstractC20745M46706);
                            abstractC20745M46706.m46690("_error.log").m46735(C17874.m41461(th));
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            if (c5097M31873 == null) {
                try {
                    c5097M31873 = m31873(new InterfaceC0863() { // from class: l.ܽ۬ۚ
                        @Override // l.InterfaceC0863
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo2218(C22031 c22031) throws IOException {
                            C12859.m31880(assetManagerM39286, c22031);
                        }
                    });
                } catch (Exception e) {
                    if (!(e instanceof RuntimeException)) {
                        throw new RuntimeException(e);
                    }
                    throw ((RuntimeException) e);
                }
            }
            m31884(c5097M31873);
            for (Map.Entry entry : c5097M31873.f17764.entrySet()) {
                if (!((C20889) entry.getValue()).m46966()) {
                    String str = (String) entry.getKey();
                    if (str.lastIndexOf(46) == 0) {
                        C21512.m48162(str);
                    }
                }
            }
            C21512.m48169(false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m31886(AbstractC20745 abstractC20745) {
        String strM46730 = abstractC20745.m46730();
        C20889 c20889M17712 = C6508.m17712(strM46730, abstractC20745.mo33986());
        String strM46958 = c20889M17712.m46958();
        String lowerCase = strM46958.toLowerCase(Locale.ROOT);
        C15432 c15432M31877 = m31877(C11904.f39938.m46690("syntax/custom"), strM46958);
        C5097 c5097M31872 = m31872();
        C22031 c22031 = new C22031(c5097M31872);
        ((HashMap) c22031.f71400).putAll(c5097M31872.f17765);
        ((HashMap) c22031.f71400).put(lowerCase, c20889M17712);
        C5097 c5097 = new C5097(c22031);
        m31887(c15432M31877, strM46730, c20889M17712);
        c20889M17712.m46956(new CallableC11012(strM46730));
        m31884(c5097);
        C21512.m48169(true);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m31897(C20889 c20889) {
        String strM46958 = c20889.m46958();
        String lowerCase = strM46958.toLowerCase(Locale.ROOT);
        C15432 c15432M31877 = m31877(C11904.f39938.m46690("syntax/custom"), strM46958);
        try {
            C11018 c11018 = new C11018();
            c11018.mo24508(65535);
            c11018.m27782((CharSequence) lowerCase);
            m31888(c15432M31877, c11018);
            C5097 c5097M31872 = m31872();
            C22031 c22031 = new C22031(c5097M31872);
            ((HashMap) c22031.f71400).putAll(c5097M31872.f17765);
            ((HashMap) c22031.f71400).remove(lowerCase);
            try {
                m31884(new C5097(c22031));
                C21512.m48169(true);
            } catch (Error | RuntimeException e) {
                try {
                    m31887(c15432M31877, c20889.m46970(), c20889);
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                }
                throw e;
            }
        } catch (IOException unused) {
            return false;
        }
        return true;
    }

    static {
        m31867();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13565 m31875(C20889 c20889) {
        C22031 c22031 = (C22031) f42773.get();
        C5097 c5097M31872 = c22031 == null ? m31872() : new C5097(c22031);
        C13638.requireNonNull(c20889);
        return new C13565(c5097M31872, c20889);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31892(int i) {
        return m31872().f17761 == i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m31899(C20889 c20889) {
        C5097 c5097M31872 = m31872();
        for (Map.Entry entry : c5097M31872.f17767.entrySet()) {
            if (entry.getValue() == c20889) {
                return "INTERNAL:" + ((String) entry.getKey());
            }
        }
        String strM46958 = c20889.m46958();
        if (strM46958 == null || C5097.m14198(c5097M31872, strM46958.toLowerCase(Locale.ROOT)) != c20889) {
            return null;
        }
        return strM46958;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15432 m31877(AbstractC20745 abstractC20745, String str) {
        return abstractC20745.m46690(str.toLowerCase(Locale.ROOT) + ".cache").m46724();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31891(String[] strArr, int i) {
        String str = strArr[1];
        AbstractC20745 abstractC20745M46728 = C11904.f39939.m46728();
        try {
            C5079 c5079M39297 = C16737.m39297();
            C6490 c6490 = new C6490();
            c6490.m17686(str);
            C18485 c18485Execute = c5079M39297.m14157(c6490.m17678()).execute();
            try {
                if (!c18485Execute.m42863()) {
                    throw new IOException("Code-" + c18485Execute.m42858() + ": " + c18485Execute.m42868());
                }
                AbstractC19191 abstractC19191M42860 = c18485Execute.m42860();
                if (abstractC19191M42860 == null) {
                    throw new IOException("Response body is null");
                }
                abstractC20745M46728.m46694(abstractC19191M42860.m44051());
                C2455 c2455 = new C2455(abstractC20745M46728);
                try {
                    for (C12107 c12107 : c2455.m7466()) {
                        C5553.m15307(c12107.getName(), c12107.isDirectory());
                    }
                    AbstractC20745 abstractC20745M46690 = C11904.f39938.m46690("syntax/online");
                    abstractC20745M46690.mo24647();
                    abstractC20745M46690.m46739();
                    for (C12107 c12108 : c2455.m7466()) {
                        if (!c12108.isDirectory()) {
                            AbstractC20745 abstractC20745M46691 = abstractC20745M46690.m46690(C5553.m15307(c12108.getName(), false));
                            abstractC20745M46691.mo46720();
                            abstractC20745M46691.m46694(c2455.m7471(c12108));
                        }
                    }
                    c2455.close();
                    C11018 c11018 = new C11018(4);
                    c11018.writeInt(i);
                    C11904.f39938.m46690("syntax/online/VERSION").m46697(c11018);
                    m31867();
                    c18485Execute.close();
                    abstractC20745M46728.mo24647();
                } catch (Throwable th) {
                    try {
                        c2455.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c18485Execute.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception unused) {
            abstractC20745M46728.mo24647();
        } catch (Throwable th5) {
            abstractC20745M46728.mo24647();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31885(C15432 c15432, C15432 c15433, List list, AssetManager assetManager, C22031 c22031) throws IOException {
        InputStream inputStreamMo33970 = c15432.mo33970();
        try {
            m31903(inputStreamMo33970);
            C3249 c3249 = c22031.f71397;
            C15682 c15682M38585 = c22031.f71397.f12084.m38585(C16387.f52729);
            C13638.requireNonNull(c15682M38585);
            c3249.f12082 = c15682M38585;
            inputStreamMo33970.close();
            InputStream inputStreamMo33971 = c15433.mo33970();
            try {
                m31881(inputStreamMo33971);
                inputStreamMo33971.close();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final AbstractC20745 abstractC20745 = (AbstractC20745) it.next();
                    C13638.requireNonNull(abstractC20745);
                    InterfaceC4391 interfaceC4391 = new InterfaceC4391() { // from class: l.ܿ۬ۚ
                        @Override // l.InterfaceC4391
                        public final InputStream getInputStream() {
                            return abstractC20745.mo33970();
                        }
                    };
                    String strM46718 = abstractC20745.m46718();
                    C22031 c22031M31898 = m31898();
                    m31883(interfaceC4391, "builtIn", strM46718, c22031M31898.f71401, c22031M31898.f71398, true);
                }
                ((HashMap) c22031.f71401).remove("Text".toLowerCase(Locale.ROOT));
                if (((HashMap) c22031.f71401).isEmpty()) {
                    throw new IOException("Online syntax package has no eligible root languages");
                }
                m31879(assetManager);
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                setNewSetFromMap.addAll(((HashMap) c22031.f71401).values());
                setNewSetFromMap.addAll(((HashMap) c22031.f71398).values());
                m31882("online", setNewSetFromMap);
                m31882("online internal", ((HashMap) c22031.f71399).values());
            } catch (Throwable th) {
                try {
                    inputStreamMo33971.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                inputStreamMo33970.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31880(final AssetManager assetManager, C22031 c22031) throws IOException {
        InputStream inputStreamOpen = assetManager.open("syntax/init/styles.mtsx");
        try {
            m31903(inputStreamOpen);
            C3249 c3249 = c22031.f71397;
            C15682 c15682M38585 = c22031.f71397.f12084.m38585(C16387.f52729);
            C13638.requireNonNull(c15682M38585);
            c3249.f12082 = c15682M38585;
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            InputStream inputStreamOpen2 = assetManager.open("syntax/init/builtins.mtsx");
            try {
                m31881(inputStreamOpen2);
                if (inputStreamOpen2 != null) {
                    inputStreamOpen2.close();
                }
                String[] list = assetManager.list("syntax");
                C13638.requireNonNull(list);
                for (String str : list) {
                    if (str.endsWith(".mtsx") && str.indexOf(47) == -1) {
                        String strM46498 = C20630.m46498(5, 0, str);
                        final String strConcat = "syntax/".concat(str);
                        InterfaceC4391 interfaceC4391 = new InterfaceC4391() { // from class: l.۫۬ۚ
                            @Override // l.InterfaceC4391
                            public final InputStream getInputStream() {
                                return assetManager.open(strConcat);
                            }
                        };
                        C22031 c22031M31898 = m31898();
                        m31883(interfaceC4391, "builtIn", strM46498, c22031M31898.f71401, c22031M31898.f71398, false);
                    }
                }
                ((HashMap) c22031.f71401).remove("Text".toLowerCase(Locale.ROOT));
                m31879(assetManager);
            } catch (Throwable th) {
                if (inputStreamOpen2 != null) {
                    try {
                        inputStreamOpen2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5097 m31873(InterfaceC0863 interfaceC0863) {
        C22031 c22031 = new C22031(0);
        ThreadLocal threadLocal = f42773;
        C22031 c22032 = (C22031) threadLocal.get();
        threadLocal.set(c22031);
        try {
            interfaceC0863.mo2218(c22031);
            ((HashMap) c22031.f71400).putAll(C6508.m17715());
            C5097 c5097 = new C5097(c22031);
        } finally {
            if (c22032 == null) {
                threadLocal.remove();
            } else {
                threadLocal.set(c22032);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31884(C5097 c5097) {
        C5097 c5098 = f42770;
        c5097.f17761 = c5098 != null ? 1 + c5098.f17761 : 1;
        f42770 = c5097;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5097 m31872() {
        C5097 c5097 = f42770;
        C13638.requireNonNull(c5097, "Language registry is not initialized");
        return c5097;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C3249 m31900() {
        C22031 c22031 = (C22031) f42773.get();
        return c22031 != null ? c22031.f71397 : m31872().f17769;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C22031 m31898() {
        C22031 c22031 = (C22031) f42773.get();
        C13638.requireNonNull(c22031, "Language registry is not loading");
        return c22031;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31879(final AssetManager assetManager) throws IOException {
        ((HashMap) m31898().f71399).clear();
        String[] list = assetManager.list("syntax/internal");
        C13638.requireNonNull(list);
        for (String str : list) {
            if (str.endsWith(".mtsx")) {
                String strM46498 = C20630.m46498(5, 0, str);
                final String strConcat = "syntax/internal/".concat(str);
                m31883(new InterfaceC4391() { // from class: l.᩻۬ۚ
                    @Override // l.InterfaceC4391
                    public final InputStream getInputStream() {
                        return assetManager.open(strConcat);
                    }
                }, UMModuleRegister.INNER, strM46498, m31898().f71399, null, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31882(String str, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C20889 c20889 = (C20889) it.next();
            if (!C1900.m6195(c20889).m6196()) {
                StringBuilder sbM30914 = C12441.m30914("Syntax does not support early window completion: ", str, "/");
                sbM30914.append(c20889.m46958());
                throw new IllegalArgumentException(sbM30914.toString());
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m31903(InputStream inputStream) {
        C3249 c3249 = m31898().f71397;
        C16387 c16387 = c3249.f12084;
        String strM22100 = C8439.m22100("init/styles.mtsx", C20010.m45297(inputStream, StandardCharsets.UTF_8));
        C3249.m9731(c3249, strM22100);
        C15432 c15432M46724 = C11904.f39938.m46690("syntax/styles.cache").m46724();
        if (c15432M46724.mo33975()) {
            try {
                C17367 c17367M46713 = c15432M46724.m46713();
                if (c17367M46713.m40462() == 4104 && c17367M46713.readInt() == strM22100.hashCode() && strM22100.equals(c17367M46713.m40442())) {
                    int iM40462 = c17367M46713.m40462();
                    for (int i = 0; i < iM40462; i++) {
                        c16387.m38587(c17367M46713.m40442(), C15682.m37366(c17367M46713));
                    }
                    return;
                }
            } catch (Exception unused) {
            }
        }
        c16387.m38586();
        C22199 c22199 = new C22199(new C4943(new C22343(new C14325(strM22100, new RunnableC19683()))));
        c22199.m43803(new C11448("init/styles.mtsx"));
        for (C21637 c21637 : c22199.m49280().m51372(C21637.class)) {
            c16387.m38587(C20889.m46949(c21637.m51373(46, 0)), C20889.m46945(c21637));
        }
        C11018 c11018 = new C11018();
        c11018.mo24508(o.a.h);
        c11018.writeInt(strM22100.hashCode());
        c11018.m27782((CharSequence) strM22100);
        c11018.mo24508(c16387.m38588());
        InterfaceC6269 it = c16387.m38589().iterator();
        while (it.hasNext()) {
            InterfaceC14551 interfaceC14551 = (InterfaceC14551) it.next();
            c11018.m27782((CharSequence) C16387.m38584(interfaceC14551.mo17726()));
            ((C15682) interfaceC14551.getValue()).m37373(c11018);
        }
        try {
            c15432M46724.m46697(c11018);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31881(InputStream inputStream) {
        C3249 c3249 = m31898().f71397;
        HashMap map = c3249.f12083;
        String strM22100 = C8439.m22100("init/builtins.mtsx", C20010.m45297(inputStream, StandardCharsets.UTF_8));
        C3249.m9727(c3249, strM22100);
        C15432 c15432M46724 = C11904.f39938.m46690("syntax/builtins.cache").m46724();
        if (c15432M46724.mo33975()) {
            try {
                C17367 c17367M46713 = c15432M46724.m46713();
                if (c17367M46713.m40462() == 4104 && c17367M46713.readInt() == strM22100.hashCode() && strM22100.equals(c17367M46713.m40442())) {
                    int iM40462 = c17367M46713.m40462();
                    for (int i = 0; i < iM40462; i++) {
                        map.put(c17367M46713.m40442(), AbstractC6839.m18440((AbstractC6839) null, c17367M46713));
                    }
                    return;
                }
            } catch (Exception unused) {
            }
        }
        map.clear();
        C22199 c22199 = new C22199(new C4943(new C22343(new C14325(strM22100, new RunnableC19683()))));
        c22199.m43803(new C11448("init/builtins.mtsx"));
        for (C6820 c6820 : c22199.m49289().m51372(C6820.class)) {
            String text = ((C23049) c6820.m51374(C23049.class, 0)).m51373(50, 0).getText();
            List listM51372 = ((C23755) c6820.m51374(C23755.class, 0)).m51372(C19855.class);
            if (!listM51372.isEmpty()) {
                if (listM51372.size() != 1) {
                    C21594 c21594 = new C21594(null);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listM51372.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C20889.m46944(c21594, (C19855) it.next(), false));
                    }
                    c21594.m48308(arrayList);
                    map.put(text, c21594);
                } else {
                    map.put(text, C20889.m46944(null, (C19855) listM51372.get(0), false));
                }
            }
        }
        C11018 c11018 = new C11018();
        c11018.mo24508(o.a.h);
        c11018.writeInt(strM22100.hashCode());
        c11018.m27782((CharSequence) strM22100);
        c11018.mo24508(map.size());
        for (Map.Entry entry : map.entrySet()) {
            c11018.m27782((CharSequence) entry.getKey());
            ((AbstractC6839) entry.getValue()).mo18446(c11018);
        }
        try {
            c15432M46724.m46697(c11018);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31883(final InterfaceC4391 interfaceC4391, String str, String str2, Map map, Map map2, boolean z) throws IOException {
        InputStream inputStream = interfaceC4391.getInputStream();
        try {
            Charset charset = StandardCharsets.UTF_8;
            String strM45297 = C20010.m45297(inputStream, charset);
            if (inputStream != null) {
                inputStream.close();
            }
            try {
                C8439.m22093(strM45297);
                String strM37076 = C15489.m37076(str2, ".mtsx");
                String strM22100 = C8439.m22100(strM37076, strM45297);
                int iM31871 = m31871(m31900(), strM22100);
                C15432 c15432M46724 = C11904.f39938.m46690(C0242.m1617("syntax/", str, "-", str2, ".cache")).m46724();
                if (c15432M46724.mo33975()) {
                    try {
                        C17367 c17367M46713 = c15432M46724.m46713();
                        if (c17367M46713.m40462() == 4104 && c17367M46713.readInt() == iM31871 && strM45297.equals(c17367M46713.m40442())) {
                            C20889 c20889 = (C20889) AbstractC6839.m18440((AbstractC6839) null, c17367M46713);
                            if (z) {
                                final byte[] bytes = strM45297.getBytes(charset);
                                c20889.m46956(new Callable() { // from class: l.֫۬ۚ
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return new String(bytes, StandardCharsets.UTF_8);
                                    }
                                });
                            } else {
                                c20889.m46956(new Callable() { // from class: l.᩶۬ۚ
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() throws IOException {
                                        InputStream inputStream2 = interfaceC4391.getInputStream();
                                        try {
                                            String strM45298 = C20010.m45297(inputStream2, StandardCharsets.UTF_8);
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            return strM45298;
                                        } catch (Throwable th) {
                                            if (inputStream2 != null) {
                                                try {
                                                    inputStream2.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                });
                            }
                            c20889.m46964(iM31871);
                            m31890(c20889, map, map2);
                            return;
                        }
                    } catch (Exception unused) {
                    }
                }
                C11448 c11448 = new C11448(strM37076);
                C22343 c22343 = new C22343(new C14325(strM22100, new RunnableC19683()));
                c22343.m43803(c11448);
                C22199 c22199 = new C22199(new C4943(c22343));
                c22199.m43803(c11448);
                C20889 c208810 = new C20889(c22199.m49291());
                c208810.m46963();
                if (z) {
                    final byte[] bytes2 = strM45297.getBytes(StandardCharsets.UTF_8);
                    c208810.m46956(new Callable() { // from class: l.֫۬ۚ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return new String(bytes2, StandardCharsets.UTF_8);
                        }
                    });
                } else {
                    c208810.m46956(new Callable() { // from class: l.᩶۬ۚ
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws IOException {
                            InputStream inputStream2 = interfaceC4391.getInputStream();
                            try {
                                String strM45298 = C20010.m45297(inputStream2, StandardCharsets.UTF_8);
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                return strM45298;
                            } catch (Throwable th) {
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        }
                    });
                }
                c208810.m46964(iM31871);
                m31890(c208810, map, map2);
                C11018 c11018 = new C11018();
                c11018.mo24508(o.a.h);
                c11018.writeInt(iM31871);
                c11018.m27782((CharSequence) strM45297);
                c208810.mo18446(c11018);
                c15432M46724.m46697(c11018);
            } catch (IOException | C22737 unused2) {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31890(C20889 c20889, Map map, Map map2) {
        if (map != null && C9735.putIfAbsent(map, c20889.m46958().toLowerCase(Locale.ROOT), c20889) != null) {
            throw new IllegalArgumentException("Duplicate syntax name: " + c20889.m46958());
        }
        if (map2 == null || "Text".equalsIgnoreCase(c20889.m46958())) {
            return;
        }
        Iterator it = c20889.m46965().iterator();
        while (it.hasNext()) {
            map2.put(((String) it.next()).toLowerCase(Locale.ROOT), c20889);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31870(String str) {
        return str.length() + (str.hashCode() * 31);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31871(C3249 c3249, String str) {
        return str.length() + (str.hashCode() * 31) + (C3249.m9725(c3249) * 31);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31889(C20889 c20889, String str) {
        c20889.m46964(m31871(c20889.m46951(), str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31887(AbstractC20745 abstractC20745, String str, C20889 c20889) {
        int iM31871 = m31871(c20889.m46951(), C8439.m22100(abstractC20745.mo33986(), str));
        C11018 c11018 = new C11018();
        c11018.mo24508(o.a.h);
        c11018.writeInt(iM31871);
        c11018.m27782((CharSequence) str);
        c20889.mo18446(c11018);
        m31888(abstractC20745, c11018);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31888(AbstractC20745 abstractC20745, C11018 c11018) {
        abstractC20745.mo46720();
        AbstractC20745 abstractC20745M46733 = abstractC20745.m46733(".syntax_cache");
        try {
            abstractC20745M46733.m46697(c11018);
            abstractC20745M46733.m46702(abstractC20745, false, true, null);
        } finally {
            abstractC20745M46733.mo24647();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C9601 m31902(AbstractC20745 abstractC20745) {
        if (abstractC20745.mo33975()) {
            try {
                C17367 c17367M46713 = abstractC20745.m46713();
                int iM40462 = c17367M46713.m40462();
                if (iM40462 == 65535) {
                    String strM40442 = c17367M46713.m40442();
                    if (c17367M46713.available() == 0) {
                        String lowerCase = strM40442.toLowerCase(Locale.ROOT);
                        if (!abstractC20745.getName().equals(m31877(abstractC20745.m46711(), lowerCase).getName())) {
                            throw new IOException("Custom language tombstone is in the wrong slot");
                        }
                        return C9601.m24464(lowerCase);
                    }
                    throw new IOException("Trailing bytes in custom language tombstone");
                }
                int i = c17367M46713.readInt();
                String strM40443 = c17367M46713.m40442();
                boolean z = iM40462 == 4102 && i == strM40443.hashCode();
                try {
                    int iM31871 = m31871(m31900(), C8439.m22100(abstractC20745.mo33986(), strM40443));
                    if (!z && iM40462 == 4104 && i == iM31871) {
                        try {
                            C20889 c20889 = (C20889) AbstractC6839.m18440((AbstractC6839) null, c17367M46713);
                            if (c17367M46713.available() != 0) {
                                throw new IOException("Trailing bytes in custom language cache");
                            }
                            c20889.mo18445(new C4016());
                            c20889.m46963();
                            C1900.m6195(c20889);
                            c20889.m46956(new CallableC11012(strM40443));
                            c20889.m46964(iM31871);
                            return C9601.m24465(c20889);
                        } catch (Exception unused) {
                        }
                    }
                    try {
                        C20889 c20889M17712 = C6508.m17712(strM40443, abstractC20745.mo33986());
                        try {
                            m31887(abstractC20745, strM40443, c20889M17712);
                        } catch (IOException unused2) {
                        }
                        c20889M17712.m46956(new CallableC11012(strM40443));
                        return C9601.m24465(c20889M17712);
                    } catch (Exception e) {
                        if (z) {
                            return C9601.m24465(m31878(c17367M46713, strM40443, i, e));
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    if (z) {
                        return C9601.m24465(m31878(c17367M46713, strM40443, i, e2));
                    }
                    throw e2;
                }
            } catch (Exception unused3) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20889 m31878(C17367 c17367, String str, int i, Exception exc) throws Exception {
        try {
            C20889 c20889 = (C20889) AbstractC6839.m18440((AbstractC6839) null, c17367);
            c20889.m46956(new CallableC11012(str));
            c20889.m46967();
            c20889.m46964(i);
            return c20889;
        } catch (Exception e) {
            exc.addSuppressed(e);
            throw exc;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C20889 m31894(String str) {
        C20889 c20889;
        if (str.startsWith("TEMPORARY:")) {
            String strSubstring = str.substring(10);
            try {
                C17367 c17367M46713 = C11904.f39939.m46690(strSubstring + ".mtsx.bin").m46713();
                if (c17367M46713.m40462() != 4104) {
                    c20889 = null;
                } else {
                    C20889 c208810 = new C20889(c17367M46713);
                    if (c17367M46713.available() != 0) {
                        throw new IOException("Trailing bytes in temporary language cache");
                    }
                    c208810.mo18445(new C4016());
                    c208810.m46963();
                    c20889 = c208810;
                }
                if (c20889 != null) {
                    return c20889;
                }
            } catch (Exception unused) {
            }
            str = "Text";
        }
        if (!str.startsWith("INTERNAL:")) {
            return C5097.m14198(m31872(), str.toLowerCase(Locale.ROOT));
        }
        return (C20889) m31872().f17767.get(str.substring(9).toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C20889 m31869(String str) {
        int iLastIndexOf;
        C5097 c5097M31872 = m31872();
        int iLastIndexOf2 = str.lastIndexOf(".");
        if (iLastIndexOf2 == -1) {
            return null;
        }
        String strSubstring = str.substring(iLastIndexOf2);
        Locale locale = Locale.ROOT;
        String lowerCase = strSubstring.toLowerCase(locale);
        if (lowerCase.length() == 1) {
            return null;
        }
        C20889 c20889M14192 = C5097.m14192(c5097M31872, lowerCase);
        if (c20889M14192 == null && lowerCase.equals(".bak") && (iLastIndexOf = str.lastIndexOf(46, iLastIndexOf2 - 1)) != -1) {
            String lowerCase2 = str.substring(iLastIndexOf, iLastIndexOf2).toLowerCase(locale);
            if (lowerCase2.length() > 1) {
                return C5097.m14192(c5097M31872, lowerCase2);
            }
        }
        return c20889M14192;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C15682 m31893() {
        return m31872().f17769.f12082;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static List m31904() {
        return m31872().f17763;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static ArrayList m31868() {
        return new ArrayList(m31872().f17766);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static List m31895() {
        return (List) C9030.stream(m31872().f17768.values()).sorted(C7618.comparing(new C6072(0))).collect(C1890.toList());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC6839 m31874(AbstractC6839 abstractC6839, String str) {
        C13638.requireNonNull(abstractC6839, "Built-in parent is null");
        AbstractC6839 abstractC68310 = (AbstractC6839) abstractC6839.mo18442().m46951().f12083.get(str);
        if (abstractC68310 != null) {
            return abstractC68310.mo18441(abstractC6839);
        }
        throw new RuntimeException(C0252.m1693("Built-in matcher not found: ", str));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5366 m31901(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        switch (str) {
            case "#BUILT_IN_PYTHON_FORMATTER#":
                return InterfaceC5366.f18532;
            case "#BUILT_IN_SMALI_FORMATTER#":
                return InterfaceC5366.f18527;
            case "#BUILT_IN_LUA_FORMATTER#":
                return InterfaceC5366.f18534;
            case "#BUILT_IN_JS_FORMATTER#":
                return InterfaceC5366.f18526;
            case "#BUILT_IN_MTSX_FORMATTER#":
                return InterfaceC5366.f18525;
            case "#BUILT_IN_JSON_FORMATTER#":
                return InterfaceC5366.f18529;
            case "#BUILT_IN_XML_FORMATTER#":
                return InterfaceC5366.f18535;
            case "#BUILT_IN_TS_FORMATTER#":
                return InterfaceC5366.f18530;
            case "#BUILT_IN_JAVA_FORMATTER#":
                return InterfaceC5366.f18531;
            case "#BUILT_IN_HTML_FORMATTER#":
                return InterfaceC5366.f18533;
            case "#BUILT_IN_CSS_FORMATTER#":
                return InterfaceC5366.f18528;
            default:
                System.err.println("Unknown built-in code formatter: ".concat(str));
                return null;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13128 m31896(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        switch (str) {
            case "#BUILT_IN_JS_SHRINKER#":
                return InterfaceC13128.f43718;
            case "#BUILT_IN_CSS_SHRINKER#":
                return InterfaceC13128.f43717;
            case "#BUILT_IN_HTML_SHRINKER#":
                return InterfaceC13128.f43719;
            case "#BUILT_IN_JSON_SHRINKER#":
                return InterfaceC13128.f43716;
            default:
                System.err.println("Unknown built-in code shrinker: ".concat(str));
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14690 m31876(int i, String str) {
        C2274 c2274 = new C2274(str, i);
        ConcurrentMapC13783 concurrentMapC13783 = f42772;
        C14690 c14690 = (C14690) concurrentMapC13783.get(c2274);
        if (c14690 != null) {
            return c14690;
        }
        C14690 c14690M35218 = C14690.m35218(i, str);
        C14690 c14691 = (C14690) concurrentMapC13783.putIfAbsent(c2274, c14690M35218);
        return c14691 != null ? c14691 : c14690M35218;
    }
}
