package l;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۚ۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6DL */
/* JADX INFO: loaded from: classes2.dex */
public final class C5492 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19104 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f19105 = Pattern.compile("\\r\\n|[\\n\\r\\u000B\\f\\u0085\\u2028\\u2029]");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m16321(InterfaceC3145 interfaceC3145, AbstractC12531 abstractC12531) {
        if (abstractC12531.m31135(EnumC17315.ERROR)) {
            List listMo17861 = abstractC12531.mo17861(C11457.f36007);
            if (listMo17861.isEmpty()) {
                return;
            }
            C1170.stream(listMo17861).distinct().sorted().forEach(new C21103(1, interfaceC3145));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16316(InterfaceC3145 interfaceC3145, String str, Throwable th) {
        String strM13224 = th == null ? "" : C4123.m13224(th);
        if (!strM13224.isEmpty()) {
            str = C20196.m46451(str, ": ", strM13224);
        }
        m16317(interfaceC3145.mo10282(), EnumC8365.BLOCK_CONDENSED, "ERROR: " + str.replace("*/", "* /"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16318(InterfaceC3145 interfaceC3145, AbstractC12531 abstractC12531) {
        C19990 c19990 = (C19990) abstractC12531.mo17862((InterfaceC2157) C11457.f36016);
        if (c19990 != null) {
            C4937.forEach(c19990.m45971(abstractC12531.mo8527().m5681().m17705()), new C22815(1, interfaceC3145));
        }
        m16319(interfaceC3145, abstractC12531, abstractC12531);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16319(InterfaceC3145 interfaceC3145, AbstractC12531 abstractC12531, AbstractC16678 abstractC16678) {
        if (abstractC16678 != null && abstractC12531.m31135(EnumC17315.USER_ONLY)) {
            boolean z = abstractC16678 instanceof InterfaceC20451;
            Iterator it = abstractC16678.mo17861(C11457.f36032).iterator();
            if (it.hasNext()) {
                C12949 c12949 = (C12949) it.next();
                if (z) {
                    interfaceC3145.mo10282();
                } else {
                    interfaceC3145.mo10270(' ');
                }
                c12949.getClass();
                m16317(interfaceC3145, (EnumC8365) null, (String) null);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16317(InterfaceC3145 interfaceC3145, EnumC8365 enumC8365, String str) {
        m16315(interfaceC3145, "", enumC8365.m22503());
        m16315(interfaceC3145, enumC8365.m22504(), str);
        m16315(interfaceC3145, "", enumC8365.m22502());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16315(InterfaceC3145 interfaceC3145, String str, String str2) {
        String[] strArrSplit = f19105.split(str2);
        int length = strArrSplit.length;
        if (length == 0) {
            return;
        }
        interfaceC3145.add(strArrSplit[0]);
        for (int i = 1; i < length; i++) {
            interfaceC3145.mo10283(str);
            interfaceC3145.add(strArrSplit[i]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16320(InterfaceC3145 interfaceC3145, C24927 c24927) {
        C21548 c21548;
        EnumC17315 enumC17315 = EnumC17315.INFO;
        if (c24927.m31135(enumC17315) && (c21548 = (C21548) c24927.mo17862(C25278.f81640)) != null) {
            String strM48986 = c21548.m48986();
            if (c24927.m55556().m55571().m4971().contains(strM48986)) {
                return;
            }
            String str = "compiled from: " + strM48986;
            interfaceC3145.mo10282();
            m16317(interfaceC3145, EnumC8365.BLOCK_CONDENSED, enumC17315.name() + ": " + str);
        }
    }
}
