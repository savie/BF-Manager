package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8GS */
/* JADX INFO: loaded from: classes4.dex */
public final class C17288 extends C11644 {
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m40251(String str) {
        return EnumC20111.m45474(str) != EnumC20111.UNSUPPORTED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40248(String str, List list) {
        if (str != null) {
            list.add(C11644.m29082(str));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m40250(String str) {
        return C11644.m29082(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m40246(String str) {
        return new C3114().m9343(0, str.length(), 0, str) < 1.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40247(String str, String str2, ArrayList arrayList) {
        C3840 c3840;
        if ("style".equals(str)) {
            C8385 c8385 = new C8385();
            C12350.m30682((AbstractC8075) c8385, str2, true);
            c3840 = c8385.f28297;
        } else {
            if (!str2.startsWith("url(") || !C12350.m30707(str)) {
                return;
            }
            C3840 c3841 = new C3840();
            C12350.m30680(c3841, str, str2);
            c3840 = c3841;
        }
        if (c3840 == null) {
            return;
        }
        AbstractC10192 abstractC10192 = c3840.f14332;
        if (abstractC10192 instanceof C0622) {
            m40248(((C0622) abstractC10192).f2710, arrayList);
        }
        AbstractC10192 abstractC10193 = c3840.f14358;
        if (abstractC10193 instanceof C0622) {
            m40248(((C0622) abstractC10193).f2710, arrayList);
        }
        m40248(c3840.f14355, arrayList);
        m40248(c3840.f14331, arrayList);
        m40248(c3840.f14327, arrayList);
        m40248(c3840.f14340, arrayList);
        m40248(c3840.f14344, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m40249(C11644 c11644) {
        C6663 c6663M29094 = c11644.m29094();
        if (c6663M29094.f49442.size() >= 50) {
            return true;
        }
        int iM31403 = 0;
        for (C8781 c8781 : c6663M29094.f49442) {
            if (c8781 instanceof C16851) {
                C12618 c12618 = ((C16851) c8781).f53918;
                if (c12618 != null) {
                    iM31403 += c12618.m31403();
                }
            } else {
                iM31403++;
            }
            if (iM31403 >= 500) {
                return true;
            }
        }
        return false;
    }
}
