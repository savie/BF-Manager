package l;

import java.util.Arrays;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۨۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6Q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11512 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f38702;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f38701 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f38703 = new int[24];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28696(C23289 c23289) {
        if ((c23289 instanceof C6758) || (c23289 instanceof C16761) || (c23289 instanceof C13815) || (c23289 instanceof C6053)) {
            this.f38701.put(c23289, new C13629(0));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28697(C23289 c23289, InterfaceC19761 interfaceC19761) {
        boolean z = c23289 instanceof C20165;
        if (z || (c23289 instanceof C6758) || (c23289 instanceof C16761)) {
            C13629 c13629 = (C13629) this.f38701.get(z ? c23289.f29378 : c23289);
            if (c13629 == null) {
                return;
            }
            if (interfaceC19761.getType() == 45) {
                c13629.f44962 = (byte) (c13629.f44962 | 1);
            }
            if (interfaceC19761.getType() != 127 || (c23289 instanceof C16761)) {
                return;
            }
            c13629.f44962 = (byte) (c13629.f44962 | 2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28694(int i, int i2, byte b) {
        if (i < 0 || i2 <= i) {
            return;
        }
        int i3 = this.f38702 + 3;
        int[] iArr = this.f38703;
        if (i3 > iArr.length) {
            this.f38703 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f38703;
        int i4 = this.f38702;
        int i5 = i4 + 1;
        this.f38702 = i5;
        iArr2[i4] = i;
        int i6 = i4 + 2;
        this.f38702 = i6;
        iArr2[i5] = i2;
        this.f38702 = i4 + 3;
        iArr2[i6] = b;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2338 m28695(int i) {
        C2338 c2338 = new C2338(i);
        int i2 = this.f38702;
        while (true) {
            i2 -= 3;
            if (i2 < 0) {
                return c2338;
            }
            C18567.m42975();
            int iMax = Math.max(0, this.f38703[i2]);
            int iMin = Math.min(c2338.f8273.length, this.f38703[i2 + 1]);
            if (iMin > iMax) {
                Arrays.fill(c2338.f8273, iMax, iMin, (byte) this.f38703[i2 + 2]);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m28698(C23289 c23289) {
        InterfaceC19761 interfaceC19761;
        C23289 c232810 = c23289.f29378;
        IdentityHashMap identityHashMap = this.f38701;
        C13629 c13629 = (C13629) identityHashMap.get(c232810);
        if (c13629 != null && (interfaceC19761 = c23289.f75536) != null && c23289.f75537 != null) {
            int iMo22508 = interfaceC19761.mo22508();
            int iMo22510 = c23289.f75537.mo22510() + 1;
            if (c23289 instanceof C23693) {
                c13629.f44959 = iMo22508;
                c13629.f44965 = iMo22510;
            }
            if (c23289 instanceof C9706) {
                c13629.f44960 = iMo22508;
                c13629.f44963 = iMo22510;
            }
            if (c23289 instanceof C12528) {
                c13629.f44964 = iMo22508;
                c13629.f44961 = iMo22510;
            }
        }
        C13629 c136210 = (C13629) identityHashMap.remove(c23289);
        if (c136210 == null) {
            return;
        }
        if ((c23289 instanceof C6758) || (c23289 instanceof C16761)) {
            InterfaceC19761 interfaceC19762 = c23289.f75536;
            if (interfaceC19762 == null || c23289.f75537 == null) {
                return;
            }
            m28694(interfaceC19762.mo22508(), c23289.f75537.mo22510() + 1, c136210.f44962);
            return;
        }
        boolean z = c23289 instanceof C13815;
        if (z || c136210.f44959 >= 0) {
            m28694(c136210.f44959, c136210.f44965, c136210.f44962);
            m28694(c136210.f44960, c136210.f44963, c136210.f44962);
            if (z) {
                m28694(c136210.f44964, c136210.f44961, (byte) 0);
            }
        }
    }
}
