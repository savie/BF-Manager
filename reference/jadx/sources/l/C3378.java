package l;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K8KP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3378 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f10993;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f10994;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f10995;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f10996;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f10997;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f10998;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f10999;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22024 f11000;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long[] f11001;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23516 f11002;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f11003;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f11004;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f11005;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int[] f11006;

    public C3378(int i, C23516 c23516, InterfaceC22024 interfaceC22024) {
        int i2 = c23516.f75997;
        this.f11002 = c23516;
        int iM52698 = c23516.m52698();
        boolean z = true;
        if (iM52698 != 1 && iM52698 != 2) {
            z = false;
        }
        C20782.m47565(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f11005 = (iM52698 == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) c23516.f76002) * 1000000;
        long j2 = c23516.f76001;
        String str = C7116.f23455;
        this.f10998 = C7116.m19477(i2, j, j2, RoundingMode.DOWN);
        this.f11000 = interfaceC22024;
        this.f10994 = iM52698 == 2 ? i3 | 1650720768 : -1;
        this.f10995 = -1L;
        this.f11001 = new long[512];
        this.f11006 = new int[512];
        this.f10996 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11085(long j, boolean z) {
        if (this.f10995 == -1) {
            this.f10995 = j;
        }
        if (z) {
            if (this.f10997 == this.f11006.length) {
                long[] jArr = this.f11001;
                this.f11001 = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f11006;
                this.f11006 = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f11001;
            int i = this.f10997;
            jArr2[i] = j;
            this.f11006[i] = this.f10993;
            this.f10997 = i + 1;
        }
        this.f10993++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11084() {
        int i;
        this.f11001 = Arrays.copyOf(this.f11001, this.f10997);
        this.f11006 = Arrays.copyOf(this.f11006, this.f10997);
        if ((this.f11005 & 1651965952) != 1651965952 || this.f11002.f75998 == 0 || (i = this.f10997) <= 0) {
            return;
        }
        this.f10996 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11086(int i) {
        return this.f11005 == i || this.f10994 == i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11088(int i) {
        this.f10999 = i;
        this.f11004 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11087(InterfaceC19502 interfaceC19502) {
        int i = this.f11004;
        int iMo14380 = i - this.f11000.mo14380((InterfaceC9461) interfaceC19502, i, false);
        this.f11004 = iMo14380;
        boolean z = iMo14380 == 0;
        if (z) {
            if (this.f10999 > 0) {
                int i2 = this.f11003;
                this.f11000.mo14383((this.f10998 * ((long) i2)) / ((long) this.f10996), Arrays.binarySearch(this.f11006, i2) >= 0 ? 1 : 0, this.f10999, 0, null);
            }
            this.f11003++;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11089(long j) {
        if (this.f10997 == 0) {
            this.f11003 = 0;
        } else {
            this.f11003 = this.f11006[C7116.m19505(this.f11001, j, true)];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9805 m11083(long j) {
        if (this.f10997 == 0) {
            C2349 c2349 = new C2349(0L, this.f10995);
            return new C9805(c2349, c2349);
        }
        int i = (int) (j / ((this.f10998 * ((long) 1)) / ((long) this.f10996)));
        int iM19471 = C7116.m19471(this.f11006, i, true, true);
        if (this.f11006[iM19471] == i) {
            C2349 c2349M11082 = m11082(iM19471);
            return new C9805(c2349M11082, c2349M11082);
        }
        C2349 c2349M11083 = m11082(iM19471);
        int i2 = iM19471 + 1;
        if (i2 >= this.f11001.length) {
            return new C9805(c2349M11083, c2349M11083);
        }
        return new C9805(c2349M11083, m11082(i2));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C2349 m11082(int i) {
        return new C2349(((this.f10998 * ((long) 1)) / ((long) this.f10996)) * ((long) this.f11006[i]), this.f11001[i]);
    }
}
