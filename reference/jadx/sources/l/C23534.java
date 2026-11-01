package l;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻ۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8KP */
/* JADX INFO: loaded from: classes.dex */
public final class C23534 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f76202;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f76203;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f76204;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f76205;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f76206;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f76207;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f76208;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f76209;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f76210;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long[] f76211;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8011 f76212;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10834 f76213;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f76214;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int[] f76215;

    public C23534(int i, C10834 c10834, InterfaceC8011 interfaceC8011) {
        int i2 = c10834.f36875;
        this.f76213 = c10834;
        int iM27156 = c10834.m27156();
        boolean z = true;
        if (iM27156 != 1 && iM27156 != 2) {
            z = false;
        }
        C2023.m6507(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f76203 = (iM27156 == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) c10834.f36874) * 1000000;
        long j2 = c10834.f36878;
        String str = C17983.f57504;
        this.f76202 = C17983.m41830(i2, j, j2, RoundingMode.DOWN);
        this.f76212 = interfaceC8011;
        this.f76205 = iM27156 == 2 ? i3 | 1650720768 : -1;
        this.f76209 = -1L;
        this.f76211 = new long[512];
        this.f76215 = new int[512];
        this.f76208 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51854(long j, boolean z) {
        if (this.f76209 == -1) {
            this.f76209 = j;
        }
        if (z) {
            if (this.f76207 == this.f76215.length) {
                long[] jArr = this.f76211;
                this.f76211 = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f76215;
                this.f76215 = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f76211;
            int i = this.f76207;
            jArr2[i] = j;
            this.f76215[i] = this.f76204;
            this.f76207 = i + 1;
        }
        this.f76204++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51853() {
        int i;
        this.f76211 = Arrays.copyOf(this.f76211, this.f76207);
        this.f76215 = Arrays.copyOf(this.f76215, this.f76207);
        if ((this.f76203 & 1651965952) != 1651965952 || this.f76213.f36877 == 0 || (i = this.f76207) <= 0) {
            return;
        }
        this.f76208 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51855(int i) {
        return this.f76203 == i || this.f76205 == i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51857(int i) {
        this.f76214 = i;
        this.f76210 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51856(InterfaceC7222 interfaceC7222) {
        int i = this.f76210;
        int iMo8111 = i - this.f76212.mo8111((InterfaceC6942) interfaceC7222, i, false);
        this.f76210 = iMo8111;
        boolean z = iMo8111 == 0;
        if (z) {
            if (this.f76214 > 0) {
                int i2 = this.f76206;
                this.f76212.mo8114((this.f76202 * ((long) i2)) / ((long) this.f76208), Arrays.binarySearch(this.f76215, i2) >= 0 ? 1 : 0, this.f76214, 0, null);
            }
            this.f76206++;
        }
        return z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51858(long j) {
        if (this.f76207 == 0) {
            this.f76206 = 0;
        } else {
            this.f76206 = this.f76215[C17983.m41855(this.f76211, j, true)];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12950 m51852(long j) {
        if (this.f76207 == 0) {
            C22828 c22828 = new C22828(0L, this.f76209);
            return new C12950(c22828, c22828);
        }
        int i = (int) (j / ((this.f76202 * ((long) 1)) / ((long) this.f76208)));
        int iM41824 = C17983.m41824(this.f76215, i, true, true);
        if (this.f76215[iM41824] == i) {
            C22828 c22828M51851 = m51851(iM41824);
            return new C12950(c22828M51851, c22828M51851);
        }
        C22828 c22828M51852 = m51851(iM41824);
        int i2 = iM41824 + 1;
        if (i2 >= this.f76211.length) {
            return new C12950(c22828M51852, c22828M51852);
        }
        return new C12950(c22828M51852, m51851(i2));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C22828 m51851(int i) {
        return new C22828(((this.f76202 * ((long) 1)) / ((long) this.f76208)) * ((long) this.f76215[i]), this.f76211[i]);
    }
}
