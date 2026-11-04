package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5165 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Exception f18011;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f18012;

    public C5165(ArrayList arrayList, Exception exc) {
        this.f18012 = arrayList;
        this.f18011 = exc;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5165 m15585(ArrayList arrayList) {
        return new C5165(arrayList, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5165 m15584(Exception exc) {
        return new C5165(new ArrayList(), exc);
    }
}
