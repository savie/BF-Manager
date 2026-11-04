package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8GS */
/* JADX INFO: loaded from: classes3.dex */
public final class C6972 extends C1752 {
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m19275(String str) {
        return EnumC1006.m3886(str) != EnumC1006.UNSUPPORTED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19273(String str, List list) {
        if (str != null) {
            list.add(C1752.m6179(str));
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m19276(String str) {
        return C1752.m6179(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m19277(String str) {
        return new C22504().m50743(0, str.length(), 0, str) < 1.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19272(String str, String str2, ArrayList arrayList) {
        C23424 c23424;
        if ("style".equals(str)) {
            C23996 c23996 = new C23996();
            C8463.m22753((AbstractC14472) c23996, str2, true);
            c23424 = c23996.f45543;
        } else {
            if (!str2.startsWith("url(") || !C8463.m22774(str)) {
                return;
            }
            C23424 c23425 = new C23424();
            C8463.m22757(c23425, str, str2);
            c23424 = c23425;
        }
        if (c23424 == null) {
            return;
        }
        AbstractC0303 abstractC0303 = c23424.f75824;
        if (abstractC0303 instanceof C0875) {
            m19273(((C0875) abstractC0303).f3262, arrayList);
        }
        AbstractC0303 abstractC0304 = c23424.f75835;
        if (abstractC0304 instanceof C0875) {
            m19273(((C0875) abstractC0304).f3262, arrayList);
        }
        m19273(c23424.f75841, arrayList);
        m19273(c23424.f75839, arrayList);
        m19273(c23424.f75844, arrayList);
        m19273(c23424.f75825, arrayList);
        m19273(c23424.f75843, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19274(C1752 c1752) {
        C3286 c3286M6193 = c1752.m6193();
        if (c3286M6193.f39383.size() >= 50) {
            return true;
        }
        int iM8036 = 0;
        for (C18202 c18202 : c3286M6193.f39383) {
            if (c18202 instanceof C9077) {
                C2366 c2366 = ((C9077) c18202).f29506;
                if (c2366 != null) {
                    iM8036 += c2366.m8036();
                }
            } else {
                iM8036++;
            }
            if (iM8036 >= 500) {
                return true;
            }
        }
        return false;
    }
}
