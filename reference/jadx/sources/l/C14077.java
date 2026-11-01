package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C14077 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f46231;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f46232;

    public C14077(int i, boolean z) {
        this.f46232 = i;
        this.f46231 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14077 m34052(int i, ArrayList arrayList, float f, float f2) {
        if (f >= f2) {
            return new C14077(i, true);
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            if (((C9843) arrayList.get(i2)).f33625 == i) {
                return new C14077(i2 == 0 ? -1 : ((C9843) arrayList.get(i2 - 1)).f33625, false);
            }
            i2++;
        }
        throw new IllegalArgumentException(C8479.m22141(i, "Unknown target group "));
    }
}
