package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76ZW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17505 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6216 f55666;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f55667;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f55668;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f55669;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f55670;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f55671;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f55672;

    public C17505(C6216 c6216) {
        this.f55666 = c6216;
        this.f55672 = new int[c6216.f21119.length];
        this.f55670 = new int[Math.min(16, c6216.f21119.length)];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16800 m40769(C21033 c21033) {
        C13638.requireNonNull(c21033);
        int iM47422 = c21033.m47422();
        C6216 c6216 = this.f55666;
        if (iM47422 != c6216.f21112) {
            throw new IllegalArgumentException("Index and change set lengths differ");
        }
        this.f55667 = 0;
        this.f55671 = 0;
        this.f55669 = -1;
        if (this.f55668 == Integer.MAX_VALUE) {
            Arrays.fill(this.f55672, 0);
            this.f55668 = 0;
        }
        boolean z = true;
        this.f55668++;
        if (c21033.m47425()) {
            return C16800.f53789;
        }
        for (int i = 0; i < c21033.m47429(); i++) {
            int iM47423 = c21033.m47423(i);
            int iM47417 = c21033.m47417(i);
            m40768(0, c6216.f21114.length, iM47423, iM47417, iM47417 - iM47423 != c21033.m47427(i) - c21033.m47424(i));
        }
        if (c21033.m47421()) {
            for (int i2 : c6216.f21113) {
                m40767(i2);
            }
        }
        for (int i3 : c6216.f21118) {
            m40767(i3);
        }
        Arrays.sort(this.f55670, 0, this.f55671);
        if (c6216.f21115 == EnumC16095.COMPLETE && c6216.f21118.length == 0) {
            z = false;
        }
        return new C16800(Arrays.copyOf(this.f55670, this.f55671), z, this.f55669, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40768(int i, int i2, int i3, int i4, boolean z) {
        if (i == i2) {
            return;
        }
        int i5 = (i + i2) >>> 1;
        this.f55667++;
        C6216 c6216 = this.f55666;
        if (c6216.f21120[i5] < i3 || C6216.m17227(c6216, c6216.f21114[i]) > i4) {
            return;
        }
        m40768(i, i5, i3, i4, z);
        int i6 = c6216.f21114[i5];
        if (c6216.f21119[i6].m2686(i3, i4) || (z && C6216.m17227(c6216, i6) <= i4 && i3 <= C6216.m17222(c6216, i6))) {
            this.f55669 = Math.max(this.f55669, c6216.f21116[i6]);
            m40767(i6);
        }
        m40768(i5 + 1, i2, i3, i4, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40767(int i) {
        int[] iArr = this.f55672;
        int i2 = iArr[i];
        int i3 = this.f55668;
        if (i2 == i3) {
            return;
        }
        iArr[i] = i3;
        if (this.f55671 == this.f55670.length) {
            int length = this.f55666.f21119.length;
            int i4 = this.f55671;
            this.f55670 = Arrays.copyOf(this.f55670, Math.min(length, Math.max(16, i4 + (i4 >>> 1))));
        }
        int[] iArr2 = this.f55670;
        int i5 = this.f55671;
        this.f55671 = i5 + 1;
        iArr2[i5] = i;
    }
}
