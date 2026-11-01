package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D6L6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9264 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f31493;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f31494;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f31492 = -1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f31490 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31491 = 1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23800(long j, int i, int i2, boolean z, boolean z2) {
        if (i != 0) {
            this.f31491 = i > 0 ? 1 : -1;
        }
        if (!z && !z2) {
            this.f31490 = 0;
            this.f31492 = j;
            this.f31494 = 0.0f;
        } else if (z2) {
            this.f31490 = 2;
            this.f31492 = j;
            this.f31493 = j;
            this.f31494 = 0.0f;
        } else {
            if (this.f31490 == 0) {
                this.f31490 = 1;
            }
            if (this.f31492 < 0) {
                this.f31492 = j;
            }
            float fAbs = this.f31494 + Math.abs(i);
            this.f31494 = fAbs;
            long j2 = j - this.f31492;
            if (j2 >= 40 && i2 > 0) {
                float f = (fAbs * 1000.0f) / (i2 * j2);
                if (f >= 2.0f) {
                    this.f31490 = 2;
                    this.f31493 = j;
                } else if (f <= 1.0f && j - this.f31493 >= 120) {
                    this.f31490 = 1;
                }
                this.f31494 = 0.0f;
                this.f31492 = j;
            }
        }
        return this.f31490;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23799() {
        return this.f31491;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23801() {
        this.f31492 = -1L;
        this.f31494 = 0.0f;
        this.f31490 = 0;
        this.f31491 = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m23797(List list, int i, int i2, int i3, int i4) {
        ArrayList arrayList = new ArrayList();
        if (i >= 0 && i2 >= i && i < list.size()) {
            int iMin = Math.min(i2, list.size() - 1);
            for (int i5 = i; i5 <= iMin; i5++) {
                arrayList.add((InterfaceC2557) list.get(i5));
            }
            if (i3 != 2) {
                int i6 = iMin - i;
                int i7 = i6 + 1;
                int i8 = i3 == 0 ? i7 : (i6 + 2) / 2;
                int iMin2 = i3 == 0 ? (i6 + 2) / 2 : Math.min(2, i7 / 4);
                m23798(arrayList, list, i4 > 0 ? iMin + 1 : i - 1, i4, i8);
                m23798(arrayList, list, i4 > 0 ? i - 1 : iMin + 1, -i4, iMin2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23798(ArrayList arrayList, List list, int i, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3 && i >= 0 && i < list.size()) {
            arrayList.add((InterfaceC2557) list.get(i));
            i4++;
            i += i2;
        }
    }
}
