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

/* JADX INFO: renamed from: l.ۡۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9341 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f30354 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static volatile C19038 f30357;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f30356 = new ThreadLocal();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f30355 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m24607(AbstractC22044 abstractC22044) {
        String strM49871 = abstractC22044.m49871();
        C16800 c16800M23111 = C8596.m23111(strM49871, abstractC22044.mo4294());
        String strM39683 = c16800M23111.m39683();
        String lowerCase = strM39683.toLowerCase(Locale.ROOT);
        C1161 c1161M24591 = m24591(C6382.f21568.m49876("syntax/custom"), strM39683);
        C19038 c19038M24596 = m24596();
        C10087 c10087 = new C10087(c19038M24596);
        ((HashMap) c10087.f32330).putAll(c19038M24596.f61668);
        ((HashMap) c10087.f32330).put(lowerCase, c16800M23111);
        C19038 c19038 = new C19038(c10087);
        m24608(c1161M24591, strM49871, c16800M23111);
        c16800M23111.m39680(new CallableC2915(1, strM49871));
        m24605(c19038);
        C8969.m23961(true);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m24615(C16800 c16800) {
        String strM39683 = c16800.m39683();
        String lowerCase = strM39683.toLowerCase(Locale.ROOT);
        C1161 c1161M24591 = m24591(C6382.f21568.m49876("syntax/custom"), strM39683);
        try {
            C6178 c6178 = new C6178();
            c6178.mo17812(65535);
            c6178.m17786((CharSequence) lowerCase);
            m24609(c1161M24591, c6178);
            C19038 c19038M24596 = m24596();
            C10087 c10087 = new C10087(c19038M24596);
            ((HashMap) c10087.f32330).putAll(c19038M24596.f61668);
            ((HashMap) c10087.f32330).remove(lowerCase);
            try {
                m24605(new C19038(c10087));
                C8969.m23961(true);
            } catch (Error | RuntimeException e) {
                try {
                    m24608(c1161M24591, c16800.m39695(), c16800);
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

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static synchronized void m24616() {
        try {
            final AssetManager assetManagerM49086 = C21576.m49086();
            C1161 c1161M49861 = C6382.f21568.m49876("syntax/online").m49861();
            C19038 c19038M24597 = null;
            if (c1161M49861.mo4281()) {
                final C1161 c1161M49862 = c1161M49861.m49876("init/styles.mtsx").m49861();
                final C1161 c1161M49863 = c1161M49861.m49876("init/builtins.mtsx").m49861();
                C1161 c1161M49864 = c1161M49861.m49876("VERSION").m49861();
                int i = -1;
                try {
                    if (c1161M49864.mo2934()) {
                        i = c1161M49864.m49835().readInt();
                    }
                } catch (Exception unused) {
                }
                if (i > 14) {
                    final List list = (List) C1170.stream(c1161M49861.mo4299(true)).filter(new C17546(0)).collect(C2025.toList());
                    try {
                        if (!c1161M49862.mo4304() || !c1161M49863.mo4304() || list.isEmpty()) {
                            throw new IOException("Incomplete online syntax package");
                        }
                        c19038M24597 = m24597(new InterfaceC1139() { // from class: l.᩹ۧᩴ
                            @Override // l.InterfaceC1139
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo4215(C10087 c10087) throws IOException {
                                C9341.m24602(c1161M49862, c1161M49863, list, assetManagerM49086, c10087);
                            }
                        });
                    } catch (Throwable th) {
                        try {
                            AbstractC22044 abstractC22044M49868 = c1161M49861.m49868("online_bad");
                            abstractC22044M49868.mo4296();
                            c1161M49861.mo4301(abstractC22044M49868);
                            abstractC22044M49868.m49876("_error.log").m49879(C17370.m40799(th));
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            if (c19038M24597 == null) {
                try {
                    c19038M24597 = m24597(new InterfaceC1139() { // from class: l.ۗۧᩴ
                        @Override // l.InterfaceC1139
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo4215(C10087 c10087) throws IOException {
                            C9341.m24599(assetManagerM49086, c10087);
                        }
                    });
                } catch (Exception e) {
                    if (!(e instanceof RuntimeException)) {
                        throw new RuntimeException(e);
                    }
                    throw ((RuntimeException) e);
                }
            }
            m24605(c19038M24597);
            for (Map.Entry entry : c19038M24597.f61663.entrySet()) {
                if (!((C16800) entry.getValue()).m39686()) {
                    String str = (String) entry.getKey();
                    if (str.lastIndexOf(46) == 0) {
                        C8969.m23954(str);
                    }
                }
            }
            C8969.m23961(false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static {
        m24616();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18292 m24594(C16800 c16800) {
        C10087 c10087 = (C10087) f30356.get();
        C19038 c19038M24596 = c10087 == null ? m24596() : new C19038(c10087);
        C17359.requireNonNull(c16800);
        return new C18292(c19038M24596, c16800);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24611(int i) {
        return m24596().f61666 == i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m24620(C16800 c16800) {
        C19038 c19038M24596 = m24596();
        for (Map.Entry entry : c19038M24596.f61664.entrySet()) {
            if (entry.getValue() == c16800) {
                return "INTERNAL:" + ((String) entry.getKey());
            }
        }
        String strM39683 = c16800.m39683();
        if (strM39683 == null || C19038.m44133(c19038M24596, strM39683.toLowerCase(Locale.ROOT)) != c16800) {
            return null;
        }
        return strM39683;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1161 m24591(AbstractC22044 abstractC22044, String str) {
        return abstractC22044.m49876(str.toLowerCase(Locale.ROOT) + ".cache").m49861();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24610(String[] strArr, int i) {
        String str = strArr[1];
        AbstractC22044 abstractC22044M49877 = C6382.f21565.m49877();
        try {
            C24363 c24363M49093 = C21576.m49093();
            C0496 c0496 = new C0496();
            c0496.m2397(str);
            C9444 c9444Execute = c24363M49093.m54450(c0496.m2389()).execute();
            try {
                if (!c9444Execute.m24819()) {
                    throw new IOException("Code-" + c9444Execute.m24820() + ": " + c9444Execute.m24825());
                }
                AbstractC8699 abstractC8699M24818 = c9444Execute.m24818();
                if (abstractC8699M24818 == null) {
                    throw new IOException("Response body is null");
                }
                abstractC22044M49877.m49840(abstractC8699M24818.m23391());
                C22941 c22941 = new C22941(abstractC22044M49877);
                try {
                    for (C8002 c8002 : c22941.m51742()) {
                        C14584.m35187(c8002.getName(), c8002.isDirectory());
                    }
                    AbstractC22044 abstractC22044M49876 = C6382.f21568.m49876("syntax/online");
                    abstractC22044M49876.mo4296();
                    abstractC22044M49876.m49853();
                    for (C8002 c8003 : c22941.m51742()) {
                        if (!c8003.isDirectory()) {
                            AbstractC22044 abstractC22044M49878 = abstractC22044M49876.m49876(C14584.m35187(c8003.getName(), false));
                            abstractC22044M49878.mo49834();
                            abstractC22044M49878.m49840(c22941.m51727(c8003));
                        }
                    }
                    c22941.close();
                    C6178 c6178 = new C6178(4);
                    c6178.writeInt(i);
                    C6382.f21568.m49876("syntax/online/VERSION").m49844(c6178);
                    m24616();
                    c9444Execute.close();
                    abstractC22044M49877.mo4296();
                } catch (Throwable th) {
                    try {
                        c22941.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c9444Execute.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception unused) {
            abstractC22044M49877.mo4296();
        } catch (Throwable th5) {
            abstractC22044M49877.mo4296();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24602(C1161 c1161, C1161 c1162, List list, AssetManager assetManager, C10087 c10087) throws IOException {
        InputStream inputStreamMo4290 = c1161.mo4290();
        try {
            m24624(inputStreamMo4290);
            C14562 c14562 = c10087.f32333;
            C11974 c11974M41879 = c10087.f32333.f45882.m41879(C17941.f58776);
            C17359.requireNonNull(c11974M41879);
            c14562.f45884 = c11974M41879;
            inputStreamMo4290.close();
            InputStream inputStreamMo4291 = c1162.mo4290();
            try {
                m24600(inputStreamMo4291);
                inputStreamMo4291.close();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final AbstractC22044 abstractC22044 = (AbstractC22044) it.next();
                    C17359.requireNonNull(abstractC22044);
                    InterfaceC21276 interfaceC21276 = new InterfaceC21276() { // from class: l.ۨۧᩴ
                        @Override // l.InterfaceC21276
                        public final InputStream getInputStream() {
                            return abstractC22044.mo4290();
                        }
                    };
                    String strM49874 = abstractC22044.m49874();
                    C10087 c10087M24612 = m24612();
                    m24606(interfaceC21276, "builtIn", strM49874, c10087M24612.f32332, c10087M24612.f32329, true);
                }
                ((HashMap) c10087.f32332).remove("Text".toLowerCase(Locale.ROOT));
                if (((HashMap) c10087.f32332).isEmpty()) {
                    throw new IOException("Online syntax package has no eligible root languages");
                }
                m24598(assetManager);
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                setNewSetFromMap.addAll(((HashMap) c10087.f32332).values());
                setNewSetFromMap.addAll(((HashMap) c10087.f32329).values());
                m24601("online", setNewSetFromMap);
                m24601("online internal", ((HashMap) c10087.f32331).values());
            } catch (Throwable th) {
                try {
                    inputStreamMo4291.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                inputStreamMo4290.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24599(final AssetManager assetManager, C10087 c10087) throws IOException {
        InputStream inputStreamOpen = assetManager.open("syntax/init/styles.mtsx");
        try {
            m24624(inputStreamOpen);
            C14562 c14562 = c10087.f32333;
            C11974 c11974M41879 = c10087.f32333.f45882.m41879(C17941.f58776);
            C17359.requireNonNull(c11974M41879);
            c14562.f45884 = c11974M41879;
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            InputStream inputStreamOpen2 = assetManager.open("syntax/init/builtins.mtsx");
            try {
                m24600(inputStreamOpen2);
                if (inputStreamOpen2 != null) {
                    inputStreamOpen2.close();
                }
                String[] list = assetManager.list("syntax");
                C17359.requireNonNull(list);
                for (String str : list) {
                    if (str.endsWith(".mtsx") && str.indexOf(47) == -1) {
                        String strM5124 = C1402.m5124(5, 0, str);
                        final String strConcat = "syntax/".concat(str);
                        InterfaceC21276 interfaceC21276 = new InterfaceC21276() { // from class: l.᩵ۧᩴ
                            @Override // l.InterfaceC21276
                            public final InputStream getInputStream() {
                                return assetManager.open(strConcat);
                            }
                        };
                        C10087 c10087M24612 = m24612();
                        m24606(interfaceC21276, "builtIn", strM5124, c10087M24612.f32332, c10087M24612.f32329, false);
                    }
                }
                ((HashMap) c10087.f32332).remove("Text".toLowerCase(Locale.ROOT));
                m24598(assetManager);
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
    public static C19038 m24597(InterfaceC1139 interfaceC1139) {
        C10087 c10087 = new C10087(0);
        ThreadLocal threadLocal = f30356;
        C10087 c10088 = (C10087) threadLocal.get();
        threadLocal.set(c10087);
        try {
            interfaceC1139.mo4215(c10087);
            ((HashMap) c10087.f32330).putAll(C8596.m23114());
            C19038 c19038 = new C19038(c10087);
        } finally {
            if (c10088 == null) {
                threadLocal.remove();
            } else {
                threadLocal.set(c10088);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24605(C19038 c19038) {
        C19038 c19039 = f30357;
        c19038.f61666 = c19039 != null ? 1 + c19039.f61666 : 1;
        f30357 = c19038;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19038 m24596() {
        C19038 c19038 = f30357;
        C17359.requireNonNull(c19038, "Language registry is not initialized");
        return c19038;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C14562 m24623() {
        C10087 c10087 = (C10087) f30356.get();
        return c10087 != null ? c10087.f32333 : m24596().f61667;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C10087 m24612() {
        C10087 c10087 = (C10087) f30356.get();
        C17359.requireNonNull(c10087, "Language registry is not loading");
        return c10087;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24598(final AssetManager assetManager) throws IOException {
        ((HashMap) m24612().f32331).clear();
        String[] list = assetManager.list("syntax/internal");
        C17359.requireNonNull(list);
        for (String str : list) {
            if (str.endsWith(".mtsx")) {
                String strM5124 = C1402.m5124(5, 0, str);
                final String strConcat = "syntax/internal/".concat(str);
                m24606(new InterfaceC21276() { // from class: l.᩺ۧᩴ
                    @Override // l.InterfaceC21276
                    public final InputStream getInputStream() {
                        return assetManager.open(strConcat);
                    }
                }, UMModuleRegister.INNER, strM5124, m24612().f32331, null, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24601(String str, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C16800 c16800 = (C16800) it.next();
            if (!C20661.m47275(c16800).m47283()) {
                StringBuilder sbM51387 = C22783.m51387("Syntax does not support early window completion: ", str, "/");
                sbM51387.append(c16800.m39683());
                throw new IllegalArgumentException(sbM51387.toString());
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m24624(InputStream inputStream) {
        C14562 c14562 = m24612().f32333;
        C17941 c17941 = c14562.f45882;
        String strM15710 = C5219.m15710("init/styles.mtsx", C5125.m15490(inputStream, StandardCharsets.UTF_8));
        C14562.m35122(c14562, strM15710);
        C1161 c1161M49861 = C6382.f21568.m49876("syntax/styles.cache").m49861();
        if (c1161M49861.mo2934()) {
            try {
                C20348 c20348M49835 = c1161M49861.m49835();
                if (c20348M49835.m46749() == 4104 && c20348M49835.readInt() == strM15710.hashCode() && strM15710.equals(c20348M49835.m46756())) {
                    int iM46749 = c20348M49835.m46749();
                    for (int i = 0; i < iM46749; i++) {
                        c17941.m41882(c20348M49835.m46756(), C11974.m30033(c20348M49835));
                    }
                    return;
                }
            } catch (Exception unused) {
            }
        }
        c17941.m41880();
        C10246 c10246 = new C10246(new C3523(new C10093(new C16947(strM15710, new RunnableC10858(1)))));
        c10246.m24868(new C0393("init/styles.mtsx"));
        for (C5269 c5269 : c10246.m26409().m21803(C5269.class)) {
            c17941.m41882(C16800.m39672(c5269.m21804(46, 0)), C16800.m39669(c5269));
        }
        C6178 c6178 = new C6178();
        c6178.mo17812(o.a.h);
        c6178.writeInt(strM15710.hashCode());
        c6178.m17786((CharSequence) strM15710);
        c6178.mo17812(c17941.m41883());
        InterfaceC15224 it = c17941.m41884().iterator();
        while (it.hasNext()) {
            InterfaceC5903 interfaceC5903 = (InterfaceC5903) it.next();
            c6178.m17786((CharSequence) C17941.m41878(interfaceC5903.mo3870()));
            ((C11974) interfaceC5903.getValue()).m30039(c6178);
        }
        try {
            c1161M49861.m49844(c6178);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24600(InputStream inputStream) {
        C14562 c14562 = m24612().f32333;
        HashMap map = c14562.f45878;
        String strM15710 = C5219.m15710("init/builtins.mtsx", C5125.m15490(inputStream, StandardCharsets.UTF_8));
        C14562.m35118(c14562, strM15710);
        C1161 c1161M49861 = C6382.f21568.m49876("syntax/builtins.cache").m49861();
        if (c1161M49861.mo2934()) {
            try {
                C20348 c20348M49835 = c1161M49861.m49835();
                if (c20348M49835.m46749() == 4104 && c20348M49835.readInt() == strM15710.hashCode() && strM15710.equals(c20348M49835.m46756())) {
                    int iM46749 = c20348M49835.m46749();
                    for (int i = 0; i < iM46749; i++) {
                        map.put(c20348M49835.m46756(), AbstractC2805.m9274((AbstractC2805) null, c20348M49835));
                    }
                    return;
                }
            } catch (Exception unused) {
            }
        }
        map.clear();
        C10246 c10246 = new C10246(new C3523(new C10093(new C16947(strM15710, new RunnableC10858(1)))));
        c10246.m24868(new C0393("init/builtins.mtsx"));
        for (C8602 c8602 : c10246.m26396().m21803(C8602.class)) {
            String text = ((C7111) c8602.m21805(C7111.class, 0)).m21804(50, 0).getText();
            List listM21803 = ((C12726) c8602.m21805(C12726.class, 0)).m21803(C25165.class);
            if (!listM21803.isEmpty()) {
                if (listM21803.size() != 1) {
                    C22022 c22022 = new C22022(null);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listM21803.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C16800.m39668(c22022, (C25165) it.next(), false));
                    }
                    c22022.m49806(arrayList);
                    map.put(text, c22022);
                } else {
                    map.put(text, C16800.m39668(null, (C25165) listM21803.get(0), false));
                }
            }
        }
        C6178 c6178 = new C6178();
        c6178.mo17812(o.a.h);
        c6178.writeInt(strM15710.hashCode());
        c6178.m17786((CharSequence) strM15710);
        c6178.mo17812(map.size());
        for (Map.Entry entry : map.entrySet()) {
            c6178.m17786((CharSequence) entry.getKey());
            ((AbstractC2805) entry.getValue()).mo9279(c6178);
        }
        try {
            c1161M49861.m49844(c6178);
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v4, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24606(final InterfaceC21276 interfaceC21276, String str, String str2, Map map, Map map2, boolean z) throws IOException {
        InputStream inputStream = interfaceC21276.getInputStream();
        try {
            Charset charset = StandardCharsets.UTF_8;
            String strM15490 = C5125.m15490(inputStream, charset);
            if (inputStream != null) {
                inputStream.close();
            }
            try {
                C5219.m15703(strM15490);
                String strM34972 = C14483.m34972(str2, ".mtsx");
                String strM15710 = C5219.m15710(strM34972, strM15490);
                int iM24590 = m24590(m24623(), strM15710);
                C1161 c1161M49861 = C6382.f21568.m49876(C3188.m10404("syntax/", str, "-", str2, ".cache")).m49861();
                if (c1161M49861.mo2934()) {
                    try {
                        C20348 c20348M49835 = c1161M49861.m49835();
                        if (c20348M49835.m46749() == 4104 && c20348M49835.readInt() == iM24590 && strM15490.equals(c20348M49835.m46756())) {
                            C16800 c16800 = (C16800) AbstractC2805.m9274((AbstractC2805) null, c20348M49835);
                            if (z) {
                                c16800.m39680(new CallableC14101(1, strM15490.getBytes(charset)));
                            } else {
                                c16800.m39680(new Callable() { // from class: l.ܶۧᩴ
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() throws IOException {
                                        InputStream inputStream2 = interfaceC21276.getInputStream();
                                        try {
                                            String strM15491 = C5125.m15490(inputStream2, StandardCharsets.UTF_8);
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            return strM15491;
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
                            c16800.m39692(iM24590);
                            m24604(c16800, map, map2);
                            return;
                        }
                    } catch (Exception unused) {
                    }
                }
                C0393 c0393 = new C0393(strM34972);
                C10093 c10093 = new C10093(new C16947(strM15710, new RunnableC10858(1)));
                c10093.m24868(c0393);
                C10246 c10246 = new C10246(new C3523(c10093));
                c10246.m24868(c0393);
                C16800 c16801 = new C16800(c10246.m26390());
                c16801.m39691();
                if (z) {
                    c16801.m39680(new CallableC14101(1, strM15490.getBytes(StandardCharsets.UTF_8)));
                } else {
                    c16801.m39680(new Callable() { // from class: l.ܶۧᩴ
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws IOException {
                            InputStream inputStream2 = interfaceC21276.getInputStream();
                            try {
                                String strM15491 = C5125.m15490(inputStream2, StandardCharsets.UTF_8);
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                return strM15491;
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
                c16801.m39692(iM24590);
                m24604(c16801, map, map2);
                C6178 c6178 = new C6178();
                c6178.mo17812(o.a.h);
                c6178.writeInt(iM24590);
                c6178.m17786((CharSequence) strM15490);
                c16801.mo9279(c6178);
                c1161M49861.m49844(c6178);
            } catch (IOException | C7105 unused2) {
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
    public static void m24604(C16800 c16800, Map map, Map map2) {
        if (map != null && C11392.putIfAbsent(map, c16800.m39683().toLowerCase(Locale.ROOT), c16800) != null) {
            throw new IllegalArgumentException("Duplicate syntax name: " + c16800.m39683());
        }
        if (map2 == null || "Text".equalsIgnoreCase(c16800.m39683())) {
            return;
        }
        Iterator it = c16800.m39687().iterator();
        while (it.hasNext()) {
            map2.put(((String) it.next()).toLowerCase(Locale.ROOT), c16800);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24589(String str) {
        return str.length() + (str.hashCode() * 31);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24590(C14562 c14562, String str) {
        return str.length() + (str.hashCode() * 31) + (C14562.m35123(c14562) * 31);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24603(C16800 c16800, String str) {
        c16800.m39692(m24590(c16800.m39684(), str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24608(AbstractC22044 abstractC22044, String str, C16800 c16800) {
        int iM24590 = m24590(c16800.m39684(), C5219.m15710(abstractC22044.mo4294(), str));
        C6178 c6178 = new C6178();
        c6178.mo17812(o.a.h);
        c6178.writeInt(iM24590);
        c6178.m17786((CharSequence) str);
        c16800.mo9279(c6178);
        m24609(abstractC22044, c6178);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24609(AbstractC22044 abstractC22044, C6178 c6178) {
        abstractC22044.mo49834();
        AbstractC22044 abstractC22044M49862 = abstractC22044.m49862(".syntax_cache");
        try {
            abstractC22044M49862.m49844(c6178);
            abstractC22044M49862.m49848(abstractC22044, false, true, null);
        } finally {
            abstractC22044M49862.mo4296();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C4122 m24622(AbstractC22044 abstractC22044) {
        if (abstractC22044.mo2934()) {
            try {
                C20348 c20348M49835 = abstractC22044.m49835();
                int iM46749 = c20348M49835.m46749();
                if (iM46749 == 65535) {
                    String strM46756 = c20348M49835.m46756();
                    if (c20348M49835.available() == 0) {
                        String lowerCase = strM46756.toLowerCase(Locale.ROOT);
                        if (!abstractC22044.getName().equals(m24591(abstractC22044.m49856(), lowerCase).getName())) {
                            throw new IOException("Custom language tombstone is in the wrong slot");
                        }
                        return C4122.m13217(lowerCase);
                    }
                    throw new IOException("Trailing bytes in custom language tombstone");
                }
                int i = c20348M49835.readInt();
                String strM46757 = c20348M49835.m46756();
                boolean z = iM46749 == 4102 && i == strM46757.hashCode();
                try {
                    int iM24590 = m24590(m24623(), C5219.m15710(abstractC22044.mo4294(), strM46757));
                    if (!z && iM46749 == 4104 && i == iM24590) {
                        try {
                            C16800 c16800 = (C16800) AbstractC2805.m9274((AbstractC2805) null, c20348M49835);
                            if (c20348M49835.available() != 0) {
                                throw new IOException("Trailing bytes in custom language cache");
                            }
                            c16800.mo9280(new C9516());
                            c16800.m39691();
                            C20661.m47275(c16800);
                            c16800.m39680(new CallableC2915(1, strM46757));
                            c16800.m39692(iM24590);
                            return C4122.m13218(c16800);
                        } catch (Exception unused) {
                        }
                    }
                    try {
                        C16800 c16800M23111 = C8596.m23111(strM46757, abstractC22044.mo4294());
                        try {
                            m24608(abstractC22044, strM46757, c16800M23111);
                        } catch (IOException unused2) {
                        }
                        c16800M23111.m39680(new CallableC2915(1, strM46757));
                        return C4122.m13218(c16800M23111);
                    } catch (Exception e) {
                        if (z) {
                            return C4122.m13218(m24593(c20348M49835, strM46757, i, e));
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    if (z) {
                        return C4122.m13218(m24593(c20348M49835, strM46757, i, e2));
                    }
                    throw e2;
                }
            } catch (Exception unused3) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16800 m24593(C20348 c20348, String str, int i, Exception exc) throws Exception {
        try {
            C16800 c16800 = (C16800) AbstractC2805.m9274((AbstractC2805) null, c20348);
            c16800.m39680(new CallableC2915(1, str));
            c16800.m39694();
            c16800.m39692(i);
            return c16800;
        } catch (Exception e) {
            exc.addSuppressed(e);
            throw exc;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C16800 m24619(String str) {
        C16800 c16800;
        if (str.startsWith("TEMPORARY:")) {
            String strSubstring = str.substring(10);
            try {
                C20348 c20348M49835 = C6382.f21565.m49876(strSubstring + ".mtsx.bin").m49835();
                if (c20348M49835.m46749() != 4104) {
                    c16800 = null;
                } else {
                    C16800 c16801 = new C16800(c20348M49835);
                    if (c20348M49835.available() != 0) {
                        throw new IOException("Trailing bytes in temporary language cache");
                    }
                    c16801.mo9280(new C9516());
                    c16801.m39691();
                    c16800 = c16801;
                }
                if (c16800 != null) {
                    return c16800;
                }
            } catch (Exception unused) {
            }
            str = "Text";
        }
        if (!str.startsWith("INTERNAL:")) {
            return C19038.m44133(m24596(), str.toLowerCase(Locale.ROOT));
        }
        return (C16800) m24596().f61664.get(str.substring(9).toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C16800 m24626(String str) {
        int iLastIndexOf;
        C19038 c19038M24596 = m24596();
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
        C16800 c16800M44125 = C19038.m44125(c19038M24596, lowerCase);
        if (c16800M44125 == null && lowerCase.equals(".bak") && (iLastIndexOf = str.lastIndexOf(46, iLastIndexOf2 - 1)) != -1) {
            String lowerCase2 = str.substring(iLastIndexOf, iLastIndexOf2).toLowerCase(locale);
            if (lowerCase2.length() > 1) {
                return C19038.m44125(c19038M24596, lowerCase2);
            }
        }
        return c16800M44125;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C11974 m24618() {
        return m24596().f61667.f45884;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static List m24617() {
        return m24596().f61662;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static ArrayList m24625() {
        return new ArrayList(m24596().f61665);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static List m24613() {
        return (List) C1170.stream(m24596().f61669.values()).sorted(C2661.comparing(new C6360(0))).collect(C2025.toList());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC2805 m24592(AbstractC2805 abstractC2805, String str) {
        C17359.requireNonNull(abstractC2805, "Built-in parent is null");
        AbstractC2805 abstractC2806 = (AbstractC2805) abstractC2805.mo9276().m39684().f45878.get(str);
        if (abstractC2806 != null) {
            return abstractC2806.mo9275(abstractC2805);
        }
        throw new RuntimeException(C25272.m56409("Built-in matcher not found: ", str));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC0855 m24621(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        switch (str) {
            case "#BUILT_IN_PYTHON_FORMATTER#":
                return InterfaceC0855.f3218;
            case "#BUILT_IN_SMALI_FORMATTER#":
                return InterfaceC0855.f3216;
            case "#BUILT_IN_LUA_FORMATTER#":
                return InterfaceC0855.f3222;
            case "#BUILT_IN_JS_FORMATTER#":
                return InterfaceC0855.f3225;
            case "#BUILT_IN_MTSX_FORMATTER#":
                return InterfaceC0855.f3221;
            case "#BUILT_IN_JSON_FORMATTER#":
                return InterfaceC0855.f3223;
            case "#BUILT_IN_XML_FORMATTER#":
                return InterfaceC0855.f3226;
            case "#BUILT_IN_TS_FORMATTER#":
                return InterfaceC0855.f3220;
            case "#BUILT_IN_JAVA_FORMATTER#":
                return InterfaceC0855.f3219;
            case "#BUILT_IN_HTML_FORMATTER#":
                return InterfaceC0855.f3224;
            case "#BUILT_IN_CSS_FORMATTER#":
                return InterfaceC0855.f3217;
            default:
                System.err.println("Unknown built-in code formatter: ".concat(str));
                return null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC8313 m24614(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        switch (str) {
            case "#BUILT_IN_JS_SHRINKER#":
                return InterfaceC8313.f27282;
            case "#BUILT_IN_CSS_SHRINKER#":
                return InterfaceC8313.f27281;
            case "#BUILT_IN_HTML_SHRINKER#":
                return InterfaceC8313.f27283;
            case "#BUILT_IN_JSON_SHRINKER#":
                return InterfaceC8313.f27284;
            default:
                System.err.println("Unknown built-in code shrinker: ".concat(str));
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18415 m24595(int i, String str) {
        C7851 c7851 = new C7851(str, i);
        ConcurrentMapC17249 concurrentMapC17249 = f30355;
        C18415 c18415 = (C18415) concurrentMapC17249.get(c7851);
        if (c18415 != null) {
            return c18415;
        }
        C18415 c18415M42924 = C18415.m42924(i, str);
        C18415 c18416 = (C18415) concurrentMapC17249.putIfAbsent(c7851, c18415M42924);
        return c18416 != null ? c18416 : c18415M42924;
    }
}
