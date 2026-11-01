package l;

import java.lang.ref.SoftReference;
import java.util.List;

/* JADX INFO: renamed from: l.֡᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A7JN */
/* JADX INFO: loaded from: classes2.dex */
public final class C0649 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SoftReference f2764 = new SoftReference(new C20406());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20406 m2943() {
        C20406 c20406 = (C20406) f2764.get();
        if (c20406 != null) {
            return c20406;
        }
        C20406 c20407 = new C20406();
        f2764 = new SoftReference(c20407);
        return c20407;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21111 m2944(String str, boolean z) {
        String strM46043 = m2943().m46043(str, z);
        if (strM46043 == null) {
            return null;
        }
        C18995 c18995 = new C18995();
        c18995.f31055 = C22420.m49741(strM46043);
        c18995.f61485 = C18747.m43296(-16777216);
        c18995.f61480 = C18747.m43296(0);
        C21111 c21111 = new C21111();
        C10529 c10529 = c21111.f68769.f25496;
        float fM33769 = C13932.m33769(24.0f);
        c10529.f36042 = fM33769;
        c10529.f36047 = fM33769;
        c10529.f36049 = 24.0f;
        c10529.f36050 = 24.0f;
        c10529.f36044.f29163.add(c18995);
        return c21111;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static List m2946() {
        return (List) C9030.stream(m2943().f66111.entrySet()).filter(new C21386(2)).map(new C22057(1)).sorted().collect(C1890.toUnmodifiableList());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static List m2945() {
        return (List) C9030.stream(m2943().f66111.entrySet()).filter(new C16173(0)).map(new C22057(1)).sorted().collect(C1890.toUnmodifiableList());
    }
}
