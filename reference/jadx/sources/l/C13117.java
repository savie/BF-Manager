package l;

import android.content.Context;
import android.view.Surface;

/* JADX INFO: renamed from: l.۫۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D8ML */
/* JADX INFO: loaded from: classes4.dex */
public final class C13117 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f41911;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f41914;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f41915;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21387 f41916;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f41917;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f41918;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C16846 f41920;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f41922;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f41913 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f41912 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f41923 = -9223372036854775807L;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f41910 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f41919 = 1.0f;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC14814 f41921 = InterfaceC14814.f48448;

    public C13117(Context context, C21387 c21387, long j) {
        this.f41916 = c21387;
        this.f41911 = j;
        this.f41920 = new C16846(context);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m32585() {
        this.f41917 = true;
        this.f41918 = C7116.m19474(this.f41921.mo2210());
        this.f41920.m39762();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m32591() {
        this.f41917 = false;
        this.f41910 = -9223372036854775807L;
        this.f41920.m39761();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32582(Surface surface) {
        this.f41915 = surface != null;
        this.f41922 = false;
        this.f41920.m39760(surface);
        this.f41913 = Math.min(this.f41913, 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32580(float f) {
        this.f41920.m39758(f);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m32590() {
        boolean z = this.f41913 != 3;
        this.f41913 = 3;
        this.f41918 = C7116.m19474(this.f41921.mo2210());
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32583(InterfaceC14814 interfaceC14814) {
        this.f41921 = interfaceC14814;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32579() {
        if (this.f41913 == 0) {
            this.f41913 = 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32584(boolean z) {
        if (z && (this.f41913 == 3 || (!this.f41915 && this.f41922))) {
            this.f41910 = -9223372036854775807L;
            return true;
        }
        if (this.f41910 == -9223372036854775807L) {
            return false;
        }
        if (this.f41921.mo2210() < this.f41910) {
            return true;
        }
        this.f41910 = -9223372036854775807L;
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32589(boolean z) {
        this.f41914 = z;
        long j = this.f41911;
        this.f41910 = j > 0 ? this.f41921.mo2210() + j : -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32578(long j, long j2, long j3, long j4, boolean z, boolean z2, C15354 c15354) {
        boolean z3;
        C15354.m36793(c15354);
        if (this.f41917 && this.f41912 == -9223372036854775807L) {
            this.f41912 = j2;
        }
        long j5 = this.f41923;
        C16846 c16846 = this.f41920;
        if (j5 != j) {
            c16846.m39764(j);
            this.f41923 = j;
        }
        long jM19474 = (long) ((j - j2) / ((double) this.f41919));
        if (this.f41917) {
            jM19474 -= C7116.m19474(this.f41921.mo2210()) - j3;
        }
        c15354.f50110 = jM19474;
        if (z && !z2) {
            return 3;
        }
        boolean z4 = this.f41915;
        C21387 c21387 = this.f41916;
        if (!z4) {
            this.f41922 = true;
            if (c21387.m48643(c15354.f50110, j2, z2, true)) {
                return 4;
            }
            return (!this.f41917 || c15354.f50110 >= 30000) ? 5 : 3;
        }
        long j6 = c15354.f50110;
        boolean z5 = false;
        if (this.f41910 == -9223372036854775807L || this.f41914) {
            int i = this.f41913;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            long jM19475 = C7116.m19474(this.f41921.mo2210()) - this.f41918;
                            if (this.f41917) {
                                long j7 = this.f41912;
                                if (j7 == -9223372036854775807L || j7 == j2 || j6 >= -30000 || jM19475 <= 100000) {
                                }
                            }
                            z3 = false;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (j2 < j4) {
                        z3 = false;
                    }
                }
                z3 = true;
            } else {
                z3 = this.f41917;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            return 0;
        }
        if (!this.f41917 || j2 == this.f41912) {
            return 5;
        }
        long jMo2212 = this.f41921.mo2212();
        c15354.f50111 = c16846.m39756((c15354.f50110 * 1000) + jMo2212);
        c15354.f50110 = (c15354.f50111 - jMo2212) / 1000;
        boolean z6 = (this.f41910 == -9223372036854775807L || this.f41914) ? false : true;
        if (c21387.m48643(c15354.f50110, j2, z2, z6)) {
            return 4;
        }
        if (c15354.f50110 < -30000 && !z2) {
            z5 = true;
        }
        if (z5) {
            return z6 ? 3 : 2;
        }
        return c15354.f50110 > 50000 ? 5 : 1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m32586() {
        this.f41920.m39757();
        this.f41923 = -9223372036854775807L;
        this.f41912 = -9223372036854775807L;
        this.f41913 = Math.min(this.f41913, 1);
        this.f41910 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32588(int i) {
        this.f41920.m39759(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32587(float f) {
        C20782.m47565(f > 0.0f);
        if (f == this.f41919) {
            return;
        }
        this.f41919 = f;
        this.f41920.m39763(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32581(int i) {
        if (i == 0) {
            this.f41913 = 1;
        } else if (i == 1) {
            this.f41913 = 0;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            this.f41913 = Math.min(this.f41913, 2);
        }
    }
}
