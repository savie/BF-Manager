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

/* JADX INFO: renamed from: l.ᩴۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes5.dex */
public final class C19632 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63249 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static String f63252;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 f63253;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final SecureRandom f63251 = new SecureRandom();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f63256 = Pattern.compile("[0-9A-Z]+");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ConcurrentMapC17249 f63255 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f63250 = true;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C13921 f63254 = new C13921(1);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45273() {
        f63253 = null;
        f63252 = null;
        f63250 = true;
        f63255.clear();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m45278() {
        f63255.clear();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m45281() {
        return C21576.f68932.getBoolean("enable_recycle_bin", true);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m45282() {
        AbstractC22044 abstractC22044M49876 = f63253;
        if (abstractC22044M49876 == null) {
            abstractC22044M49876 = C6382.m18134().m49876(".recycle");
            if (!abstractC22044M49876.mo2934()) {
                AbstractC22044 abstractC22044M49877 = C6382.m18134().m49876("recycle");
                if (abstractC22044M49877.mo4281()) {
                    abstractC22044M49877.mo4301(abstractC22044M49876);
                }
            }
            String strM35186 = abstractC22044M49876.mo4295() ? C14584.m35186(abstractC22044M49876.mo4294()) : null;
            if (strM35186 == null) {
                abstractC22044M49876 = C6382.f21566.m49876(".recycle.bin");
                strM35186 = C14584.m35186(abstractC22044M49876.mo4294());
                C17359.requireNonNull(strM35186);
            }
            if (abstractC22044M49876.mo2934()) {
                AbstractC22044 abstractC22044M49878 = abstractC22044M49876.m49876(".i");
                if (!abstractC22044M49878.mo2934()) {
                    AbstractC22044 abstractC22044M49879 = abstractC22044M49876.m49876(am.aC);
                    if (abstractC22044M49879.mo4281()) {
                        abstractC22044M49879.mo4301(abstractC22044M49878);
                    }
                }
            }
            f63253 = abstractC22044M49876;
            f63252 = strM35186;
        }
        if (f63250 && abstractC22044M49876.mo2934()) {
            try {
                abstractC22044M49876.m49876(".nomedia").m49850(new byte[0], 0, 0);
                abstractC22044M49876.m49876("README.txt").m49879("This directory stores files in the Recycle Bin. Please do not delete any files manually. If you need to delete files, you can enter the Recycle Bin from the side bar on the main interface and then delete them!\n\n此目录为回收站目录，请不要手动删除任何文件，如需删除可从主界面侧拉栏进入回收站再删除！\n");
            } catch (Exception unused) {
            }
            f63250 = false;
        }
        return abstractC22044M49876;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m45284() {
        if (f63252 == null) {
            m45282();
        }
        return f63252;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static List m45280() {
        List<C22616> list = (List) C1170.stream(m45282().m49876(".i").mo4299(true)).filter(new C8618(0)).map(new C7127()).filter(new C6563(1)).collect(C2025.toList());
        if (f63255.size() - list.size() > 50) {
            ConcurrentMapC17249 concurrentMapC17249 = new ConcurrentMapC17249(list.size());
            for (C22616 c22616 : list) {
                concurrentMapC17249.put(c22616.f73081, c22616);
            }
            f63255 = concurrentMapC17249;
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10681 m45275(final long j, boolean z, InterfaceC7509 interfaceC7509, InterfaceC21870 interfaceC21870) {
        ?? arrayList;
        InterfaceC7509 interfaceC7509M41888 = C17950.m41888(interfaceC7509);
        if (interfaceC7509M41888.mo924()) {
            return new C10681(0, 0, true);
        }
        List<C22616> list = (List) C1170.stream(m45280()).filter(new Predicate() { // from class: l.ۙۛᩴ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C22616) obj).m50961() < j;
            }
        }).collect(C2025.toList());
        if (!z) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            AbstractC22044 abstractC22044M45282 = m45282();
            AbstractC22044 abstractC22044M49876 = abstractC22044M45282.m49876(".i");
            arrayList = new ArrayList();
            for (AbstractC22044 abstractC22044 : abstractC22044M45282.mo4299(true)) {
                String name = abstractC22044.getName();
                if (abstractC22044.mo4281() && !name.startsWith(".") && f63256.matcher(name).matches() && !abstractC22044M49876.m49876(name).mo2934()) {
                    arrayList.add(abstractC22044);
                }
            }
        }
        int size = arrayList.size() + list.size();
        if (interfaceC21870 != null) {
            interfaceC21870.mo16438(size);
        }
        int i = 0;
        for (C22616 c22616 : list) {
            if (interfaceC7509M41888.mo924()) {
                return new C10681(size, i, true);
            }
            if (interfaceC21870 != null) {
                interfaceC21870.mo16439(c22616.m50956());
            }
            if (!c22616.delete()) {
                i++;
                m45277(Collections.singleton(c22616.m50957()));
            }
        }
        if (interfaceC7509M41888.mo924()) {
            return new C10681(size, i, true);
        }
        for (AbstractC22044 abstractC22045 : arrayList) {
            if (interfaceC7509M41888.mo924()) {
                return new C10681(size, i, true);
            }
            if (interfaceC21870 != null) {
                interfaceC21870.mo16439(abstractC22045.getName());
            }
            f63254.getClass();
            abstractC22045.mo4296();
            if (abstractC22045.mo2934()) {
                i++;
            }
        }
        return new C10681(size, i, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45277(Set set) {
        AbstractC22044 abstractC22044M45282 = m45282();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC22044 abstractC22044M49876 = abstractC22044M45282.m49876(".i/" + str);
            C22616 c22616M50954 = C22616.m50954(abstractC22044M49876);
            if (c22616M50954 == null) {
                abstractC22044M49876.mo4296();
                abstractC22044M45282.m49876(str).mo4296();
                f63255.remove(str);
            } else if (!c22616M50954.m50964().mo2934()) {
                c22616M50954.delete();
                abstractC22044M45282.m49876(str).mo4296();
            } else {
                long jM49837 = c22616M50954.m50964().m49837(new C13838());
                if (c22616M50954.f73078 != jM49837) {
                    C22616 c22616M50965 = c22616M50954.m50965(jM49837);
                    f63255.put(str, c22616M50965);
                    c22616M50965.m50962();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22616 m45276(String str) {
        return C22616.m50954(m45282().m49876(".i/" + str));
    }
}
