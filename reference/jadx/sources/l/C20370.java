package l;

import com.umeng.analytics.pro.am;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩶᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes4.dex */
public final class C20370 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static String f66029;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f66031 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 f66036;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final SecureRandom f66033 = new SecureRandom();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f66030 = Pattern.compile("[0-9A-Z]+");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ConcurrentMapC13783 f66035 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean f66034 = true;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C0219 f66032 = new C0219();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m46015() {
        f66036 = null;
        f66029 = null;
        f66034 = true;
        f66035.clear();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m46022() {
        f66035.clear();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m46024() {
        return C16737.f53615.getBoolean("enable_recycle_bin", true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m46020() {
        AbstractC20745 abstractC20745M46690 = f66036;
        if (abstractC20745M46690 == null) {
            abstractC20745M46690 = C11904.m29695().m46690(".recycle");
            if (!abstractC20745M46690.mo33975()) {
                AbstractC20745 abstractC20745M46691 = C11904.m29695().m46690("recycle");
                if (abstractC20745M46691.mo33974()) {
                    abstractC20745M46691.mo24646(abstractC20745M46690);
                }
            }
            String strM15306 = abstractC20745M46690.mo36912() ? C5553.m15306(abstractC20745M46690.mo33986()) : null;
            if (strM15306 == null) {
                abstractC20745M46690 = C11904.f39934.m46690(".recycle.bin");
                strM15306 = C5553.m15306(abstractC20745M46690.mo33986());
                C13638.requireNonNull(strM15306);
            }
            if (abstractC20745M46690.mo33975()) {
                AbstractC20745 abstractC20745M46692 = abstractC20745M46690.m46690(".i");
                if (!abstractC20745M46692.mo33975()) {
                    AbstractC20745 abstractC20745M46693 = abstractC20745M46690.m46690(am.aC);
                    if (abstractC20745M46693.mo33974()) {
                        abstractC20745M46693.mo24646(abstractC20745M46692);
                    }
                }
            }
            f66036 = abstractC20745M46690;
            f66029 = strM15306;
        }
        if (f66034 && abstractC20745M46690.mo33975()) {
            try {
                abstractC20745M46690.m46690(".nomedia").m46704(new byte[0], 0, 0);
                abstractC20745M46690.m46690("README.txt").m46735("This directory stores files in the Recycle Bin. Please do not delete any files manually. If you need to delete files, you can enter the Recycle Bin from the side bar on the main interface and then delete them!\n\n此目录为回收站目录，请不要手动删除任何文件，如需删除可从主界面侧拉栏进入回收站再删除！\n");
            } catch (Exception unused) {
            }
            f66034 = false;
        }
        return abstractC20745M46690;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m46014() {
        if (f66029 == null) {
            m46020();
        }
        return f66029;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static List m46013() {
        int i = 0;
        List<C16137> list = (List) C9030.stream(m46020().m46690(".i").mo33983(true)).filter(new C18959(i)).map(new C8376()).filter(new C19665(i)).collect(C1890.toList());
        if (f66035.size() - list.size() > 50) {
            ConcurrentMapC13783 concurrentMapC13783 = new ConcurrentMapC13783(list.size());
            for (C16137 c16137 : list) {
                concurrentMapC13783.put(c16137.f52146, c16137);
            }
            f66035 = concurrentMapC13783;
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21075 m46018(final long j, boolean z, InterfaceC5614 interfaceC5614, InterfaceC7670 interfaceC7670) {
        ?? arrayList;
        InterfaceC5614 interfaceC5614M29777 = C11965.m29777(interfaceC5614);
        if (interfaceC5614M29777.mo2357()) {
            return new C21075(0, 0, true);
        }
        List<C16137> list = (List) C9030.stream(m46013()).filter(new Predicate() { // from class: l.ۤ᩵ۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C16137) obj).m38208() < j;
            }
        }).collect(C1890.toList());
        if (!z) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            AbstractC20745 abstractC20745M46020 = m46020();
            AbstractC20745 abstractC20745M46690 = abstractC20745M46020.m46690(".i");
            arrayList = new ArrayList();
            for (AbstractC20745 abstractC20745 : abstractC20745M46020.mo33983(true)) {
                String name = abstractC20745.getName();
                if (abstractC20745.mo33974() && !name.startsWith(".") && f66030.matcher(name).matches() && !abstractC20745M46690.m46690(name).mo33975()) {
                    arrayList.add(abstractC20745);
                }
            }
        }
        int size = arrayList.size() + list.size();
        if (interfaceC7670 != null) {
            interfaceC7670.mo20263(size);
        }
        int i = 0;
        for (C16137 c16137 : list) {
            if (interfaceC5614M29777.mo2357()) {
                return new C21075(size, i, true);
            }
            if (interfaceC7670 != null) {
                interfaceC7670.mo20264(c16137.m38201());
            }
            if (!c16137.delete()) {
                i++;
                m46019(Collections.singleton(c16137.m38204()));
            }
        }
        if (interfaceC5614M29777.mo2357()) {
            return new C21075(size, i, true);
        }
        for (AbstractC20745 abstractC20746 : arrayList) {
            if (interfaceC5614M29777.mo2357()) {
                return new C21075(size, i, true);
            }
            if (interfaceC7670 != null) {
                interfaceC7670.mo20264(abstractC20746.getName());
            }
            f66032.getClass();
            abstractC20746.mo24647();
            if (abstractC20746.mo33975()) {
                i++;
            }
        }
        return new C21075(size, i, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46019(Set set) {
        AbstractC20745 abstractC20745M46020 = m46020();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC20745 abstractC20745M46690 = abstractC20745M46020.m46690(".i/" + str);
            C16137 c16137M38197 = C16137.m38197(abstractC20745M46690);
            if (c16137M38197 == null) {
                abstractC20745M46690.mo24647();
                abstractC20745M46020.m46690(str).mo24647();
                f66035.remove(str);
            } else if (!c16137M38197.m38203().mo33975()) {
                c16137M38197.delete();
                abstractC20745M46020.m46690(str).mo24647();
            } else {
                long jM46691 = c16137M38197.m38203().m46691(new C9082());
                if (c16137M38197.f52142 != jM46691) {
                    C16137 c16137M38205 = c16137M38197.m38205(jM46691);
                    f66035.put(str, c16137M38205);
                    c16137M38205.m38206();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16137 m46017(String str) {
        return C16137.m38197(m46020().m46690(".i/" + str));
    }
}
