package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9577 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Exception f32286;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f32287;

    public C9577(ArrayList arrayList, Exception exc) {
        this.f32287 = arrayList;
        this.f32286 = exc;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9577 m24443(ArrayList arrayList) {
        return new C9577(arrayList, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9577 m24442(Exception exc) {
        return new C9577(new ArrayList(), exc);
    }
}
