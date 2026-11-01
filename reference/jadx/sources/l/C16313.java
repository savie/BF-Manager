package l;

import android.content.Context;
import android.view.Surface;

/* JADX INFO: renamed from: l.ܽ֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8ML */
/* JADX INFO: loaded from: classes4.dex */
public final class C16313 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f52521;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f52522;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f52524;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C23369 f52525;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f52526;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f52530;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f52531;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5023 f52533;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f52527 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f52528 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f52534 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f52523 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f52532 = 1.0f;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC11593 f52529 = InterfaceC11593.f38960;

    public C16313(Context context, C5023 c5023, long j) {
        this.f52533 = c5023;
        this.f52524 = j;
        this.f52525 = new C23369(context);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m38468() {
        this.f52531 = true;
        this.f52530 = C17983.m41827(this.f52529.mo28888());
        this.f52525.m51491();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m38459() {
        this.f52531 = false;
        this.f52523 = -9223372036854775807L;
        this.f52525.m51490();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38464(Surface surface) {
        this.f52521 = surface != null;
        this.f52522 = false;
        this.f52525.m51489(surface);
        this.f52527 = Math.min(this.f52527, 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38462(float f) {
        this.f52525.m51487(f);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m38472() {
        boolean z = this.f52527 != 3;
        this.f52527 = 3;
        this.f52530 = C17983.m41827(this.f52529.mo28888());
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38465(InterfaceC11593 interfaceC11593) {
        this.f52529 = interfaceC11593;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38461() {
        if (this.f52527 == 0) {
            this.f52527 = 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38466(boolean z) {
        if (z && (this.f52527 == 3 || (!this.f52521 && this.f52522))) {
            this.f52523 = -9223372036854775807L;
            return true;
        }
        if (this.f52523 == -9223372036854775807L) {
            return false;
        }
        if (this.f52529.mo28888() < this.f52523) {
            return true;
        }
        this.f52523 = -9223372036854775807L;
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38471(boolean z) {
        this.f52526 = z;
        long j = this.f52524;
        this.f52523 = j > 0 ? this.f52529.mo28888() + j : -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38460(long j, long j2, long j3, long j4, boolean z, boolean z2, C0084 c0084) {
        boolean z3;
        C0084.m1018(c0084);
        if (this.f52531 && this.f52528 == -9223372036854775807L) {
            this.f52528 = j2;
        }
        long j5 = this.f52534;
        C23369 c23369 = this.f52525;
        if (j5 != j) {
            c23369.m51493(j);
            this.f52534 = j;
        }
        long jM41827 = (long) ((j - j2) / ((double) this.f52532));
        if (this.f52531) {
            jM41827 -= C17983.m41827(this.f52529.mo28888()) - j3;
        }
        c0084.f994 = jM41827;
        if (z && !z2) {
            return 3;
        }
        boolean z4 = this.f52521;
        C5023 c5023 = this.f52533;
        if (!z4) {
            this.f52522 = true;
            if (c5023.m13952(c0084.f994, j2, z2, true)) {
                return 4;
            }
            return (!this.f52531 || c0084.f994 >= 30000) ? 5 : 3;
        }
        long j6 = c0084.f994;
        boolean z5 = false;
        if (this.f52523 == -9223372036854775807L || this.f52526) {
            int i = this.f52527;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            long jM41828 = C17983.m41827(this.f52529.mo28888()) - this.f52530;
                            if (this.f52531) {
                                long j7 = this.f52528;
                                if (j7 == -9223372036854775807L || j7 == j2 || j6 >= -30000 || jM41828 <= 100000) {
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
                z3 = this.f52531;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            return 0;
        }
        if (!this.f52531 || j2 == this.f52528) {
            return 5;
        }
        long jMo28885 = this.f52529.mo28885();
        c0084.f995 = c23369.m51485((c0084.f994 * 1000) + jMo28885);
        c0084.f994 = (c0084.f995 - jMo28885) / 1000;
        boolean z6 = (this.f52523 == -9223372036854775807L || this.f52526) ? false : true;
        if (c5023.m13952(c0084.f994, j2, z2, z6)) {
            return 4;
        }
        if (c0084.f994 < -30000 && !z2) {
            z5 = true;
        }
        if (z5) {
            return z6 ? 3 : 2;
        }
        return c0084.f994 > 50000 ? 5 : 1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m38467() {
        this.f52525.m51486();
        this.f52534 = -9223372036854775807L;
        this.f52528 = -9223372036854775807L;
        this.f52527 = Math.min(this.f52527, 1);
        this.f52523 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38470(int i) {
        this.f52525.m51488(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38469(float f) {
        C2023.m6507(f > 0.0f);
        if (f == this.f52532) {
            return;
        }
        this.f52532 = f;
        this.f52525.m51492(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38463(int i) {
        if (i == 0) {
            this.f52527 = 1;
        } else if (i == 1) {
            this.f52527 = 0;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            this.f52527 = Math.min(this.f52527, 2);
        }
    }
}
