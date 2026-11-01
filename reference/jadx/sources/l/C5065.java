package l;

import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۚۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes2.dex */
public final class C5065 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f17667 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22705 f17668;

    public C5065(C22705 c22705) {
        this.f17668 = c22705;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21999 m14114(C3320 c3320) {
        HashMap map = this.f17667;
        C21999 c21999 = (C21999) map.get(c3320);
        if (c21999 != null) {
            return c21999;
        }
        C21999 c219910 = new C21999(this.f17668.f73954.mo3427(), c3320);
        map.put(c3320, c219910);
        return c219910;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection m14113() {
        return this.f17667.values();
    }
}
