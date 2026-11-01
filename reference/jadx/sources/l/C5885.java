package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۛۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAOD */
/* JADX INFO: loaded from: classes2.dex */
public final class C5885 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C2604 m16102(C20690 c20690, AbstractC3062 abstractC3062, String str, Bundle bundle) {
        C13465.m32966(c20690, "registry");
        C13465.m32966(abstractC3062, "lifecycle");
        Bundle bundleM46522 = c20690.m46522(str);
        int i = C13895.f45775;
        C2604 c2604 = new C2604(str, C4721.m13081(bundleM46522, bundle));
        c2604.m8079(abstractC3062, c20690);
        m16103(abstractC3062, c20690);
        return c2604;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m16104(AbstractC8956 abstractC8956, C20690 c20690, AbstractC3062 abstractC3062) {
        C13465.m32966(c20690, "registry");
        C13465.m32966(abstractC3062, "lifecycle");
        C2604 c2604 = (C2604) abstractC8956.m23253();
        if (c2604 == null || c2604.m8080()) {
            return;
        }
        c2604.m8079(abstractC3062, c20690);
        m16103(abstractC3062, c20690);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16103(AbstractC3062 abstractC3062, C20690 c20690) {
        EnumC9414 enumC9414Mo9170 = abstractC3062.mo9170();
        if (enumC9414Mo9170 == EnumC9414.INITIALIZED || enumC9414Mo9170.m24173(EnumC9414.STARTED)) {
            c20690.m46527();
        } else {
            abstractC3062.mo9171(new C17174(abstractC3062, c20690));
        }
    }
}
