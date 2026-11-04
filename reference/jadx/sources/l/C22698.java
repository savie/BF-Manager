package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes.dex */
public final class C22698 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f73686;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f73687;

    public C22698(int i, boolean z) {
        this.f73687 = i;
        this.f73686 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22698 m51173(int i, ArrayList arrayList, float f, float f2) {
        if (f >= f2) {
            return new C22698(i, true);
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            if (((C10567) arrayList.get(i2)).f33580 == i) {
                return new C22698(i2 == 0 ? -1 : ((C10567) arrayList.get(i2 - 1)).f33580, false);
            }
            i2++;
        }
        throw new IllegalArgumentException(C13645.m33382(i, "Unknown target group "));
    }
}
