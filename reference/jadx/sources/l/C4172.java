package l;

import java.util.Arrays;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۘ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6Q0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4172 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f14161;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f14160 = new IdentityHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f14162 = new int[24];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13337(C7998 c7998) {
        if ((c7998 instanceof C10334) || (c7998 instanceof C2132) || (c7998 instanceof C24507) || (c7998 instanceof C16915)) {
            this.f14160.put(c7998, new C24310(0));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13338(C7998 c7998, InterfaceC8743 interfaceC8743) {
        boolean z = c7998 instanceof C13186;
        if (z || (c7998 instanceof C10334) || (c7998 instanceof C2132)) {
            C24310 c24310 = (C24310) this.f14160.get(z ? c7998.f9157 : c7998);
            if (c24310 == null) {
                return;
            }
            if (interfaceC8743.getType() == 45) {
                c24310.f78698 = (byte) (c24310.f78698 | 1);
            }
            if (interfaceC8743.getType() != 127 || (c7998 instanceof C2132)) {
                return;
            }
            c24310.f78698 = (byte) (c24310.f78698 | 2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13335(int i, int i2, byte b) {
        if (i < 0 || i2 <= i) {
            return;
        }
        int i3 = this.f14161 + 3;
        int[] iArr = this.f14162;
        if (i3 > iArr.length) {
            this.f14162 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f14162;
        int i4 = this.f14161;
        int i5 = i4 + 1;
        this.f14161 = i5;
        iArr2[i4] = i;
        int i6 = i4 + 2;
        this.f14161 = i6;
        iArr2[i5] = i2;
        this.f14161 = i4 + 3;
        iArr2[i6] = b;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14612 m13336(int i) {
        C14612 c14612 = new C14612(i);
        int i2 = this.f14161;
        while (true) {
            i2 -= 3;
            if (i2 < 0) {
                return c14612;
            }
            C7155.m19727();
            int iMax = Math.max(0, this.f14162[i2]);
            int iMin = Math.min(c14612.f46019.length, this.f14162[i2 + 1]);
            if (iMin > iMax) {
                Arrays.fill(c14612.f46019, iMax, iMin, (byte) this.f14162[i2 + 2]);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13339(C7998 c7998) {
        InterfaceC8743 interfaceC8743;
        C7998 c7999 = c7998.f9157;
        IdentityHashMap identityHashMap = this.f14160;
        C24310 c24310 = (C24310) identityHashMap.get(c7999);
        if (c24310 != null && (interfaceC8743 = c7998.f26549) != null && c7998.f26548 != null) {
            int iMo23442 = interfaceC8743.mo23442();
            int iMo23440 = c7998.f26548.mo23440() + 1;
            if (c7998 instanceof C16169) {
                c24310.f78696 = iMo23442;
                c24310.f78697 = iMo23440;
            }
            if (c7998 instanceof C20777) {
                c24310.f78700 = iMo23442;
                c24310.f78695 = iMo23440;
            }
            if (c7998 instanceof C11826) {
                c24310.f78699 = iMo23442;
                c24310.f78694 = iMo23440;
            }
        }
        C24310 c24311 = (C24310) identityHashMap.remove(c7998);
        if (c24311 == null) {
            return;
        }
        if ((c7998 instanceof C10334) || (c7998 instanceof C2132)) {
            InterfaceC8743 interfaceC8744 = c7998.f26549;
            if (interfaceC8744 == null || c7998.f26548 == null) {
                return;
            }
            m13335(interfaceC8744.mo23442(), c7998.f26548.mo23440() + 1, c24311.f78698);
            return;
        }
        boolean z = c7998 instanceof C24507;
        if (z || c24311.f78696 >= 0) {
            m13335(c24311.f78696, c24311.f78697, c24311.f78698);
            m13335(c24311.f78700, c24311.f78695, c24311.f78698);
            if (z) {
                m13335(c24311.f78699, c24311.f78694, (byte) 0);
            }
        }
    }
}
