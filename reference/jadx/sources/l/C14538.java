package l;

import java.lang.ref.SoftReference;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7JN */
/* JADX INFO: loaded from: classes4.dex */
public final class C14538 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SoftReference f45737 = new SoftReference(new C4098());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4098 m35075() {
        C4098 c4098 = (C4098) f45737.get();
        if (c4098 != null) {
            return c4098;
        }
        C4098 c4099 = new C4098();
        f45737 = new SoftReference(c4099);
        return c4099;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24236 m35076(String str, boolean z) {
        String strM13189 = m35075().m13189(str, z);
        if (strM13189 == null) {
            return null;
        }
        C16030 c16030 = new C16030();
        c16030.f65698 = C25210.m56210(strM13189);
        c16030.f52003 = C3998.m12916(-16777216);
        c16030.f52000 = C3998.m12916(0);
        C24236 c24236 = new C24236();
        C12301 c12301 = c24236.f78491.f21456;
        float fM19160 = C6907.m19160(24.0f);
        c12301.f39540 = fM19160;
        c12301.f39550 = fM19160;
        c12301.f39546 = 24.0f;
        c12301.f39552 = 24.0f;
        c12301.f39543.f75951.add(c16030);
        return c24236;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static List m35078() {
        return (List) C1170.stream(m35075().f13960.entrySet()).filter(new C15342(1)).map(new C22255(1)).sorted().collect(C2025.toUnmodifiableList());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static List m35077() {
        return (List) C1170.stream(m35075().f13960.entrySet()).filter(new C18218(3)).map(new C22255(1)).sorted().collect(C2025.toUnmodifiableList());
    }
}
