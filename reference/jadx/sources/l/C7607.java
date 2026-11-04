package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6L6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7607 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f25118;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f25120;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f25119 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f25121 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f25117 = 1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m20806(long j, int i, int i2, boolean z, boolean z2) {
        if (i != 0) {
            this.f25117 = i > 0 ? 1 : -1;
        }
        if (!z && !z2) {
            this.f25121 = 0;
            this.f25119 = j;
            this.f25120 = 0.0f;
        } else if (z2) {
            this.f25121 = 2;
            this.f25119 = j;
            this.f25118 = j;
            this.f25120 = 0.0f;
        } else {
            if (this.f25121 == 0) {
                this.f25121 = 1;
            }
            if (this.f25119 < 0) {
                this.f25119 = j;
            }
            float fAbs = this.f25120 + Math.abs(i);
            this.f25120 = fAbs;
            long j2 = j - this.f25119;
            if (j2 >= 40 && i2 > 0) {
                float f = (fAbs * 1000.0f) / (i2 * j2);
                if (f >= 2.0f) {
                    this.f25121 = 2;
                    this.f25118 = j;
                } else if (f <= 1.0f && j - this.f25118 >= 120) {
                    this.f25121 = 1;
                }
                this.f25120 = 0.0f;
                this.f25119 = j;
            }
        }
        return this.f25121;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m20805() {
        return this.f25117;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20807() {
        this.f25119 = -1L;
        this.f25120 = 0.0f;
        this.f25121 = 0;
        this.f25117 = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m20803(List list, int i, int i2, int i3, int i4) {
        ArrayList arrayList = new ArrayList();
        if (i >= 0 && i2 >= i && i < list.size()) {
            int iMin = Math.min(i2, list.size() - 1);
            for (int i5 = i; i5 <= iMin; i5++) {
                arrayList.add((InterfaceC2386) list.get(i5));
            }
            if (i3 != 2) {
                int i6 = iMin - i;
                int i7 = i6 + 1;
                int i8 = i3 == 0 ? i7 : (i6 + 2) / 2;
                int iMin2 = i3 == 0 ? (i6 + 2) / 2 : Math.min(2, i7 / 4);
                m20804(arrayList, list, i4 > 0 ? iMin + 1 : i - 1, i4, i8);
                m20804(arrayList, list, i4 > 0 ? i - 1 : iMin + 1, -i4, iMin2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20804(ArrayList arrayList, List list, int i, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3 && i >= 0 && i < list.size()) {
            arrayList.add((InterfaceC2386) list.get(i));
            i4++;
            i += i2;
        }
    }
}
