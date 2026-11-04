package l;

import android.os.Looper;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7N0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20257 extends AbstractC9395 implements InterfaceC18193 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f65044;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5341 f65045;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C3716 f65046;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f65047;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC24929 f65048;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C17933 f65049;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C14902 f65050;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC1612 f65051;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0294 f65052;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final int f65053;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4365 f65054;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4639 f65055;

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final synchronized C14902 mo30717() {
        return this.f65050;
    }

    @Override // l.AbstractC9395, l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final synchronized void mo24727(C14902 c14902) {
        this.f65050 = c14902;
    }

    static {
        C21616.m49139("media3.exoplayer.hls");
    }

    public C20257(C14902 c14902, InterfaceC5341 interfaceC5341, C7028 c7028, C17933 c17933, InterfaceC24929 interfaceC24929, InterfaceC4365 interfaceC4365, InterfaceC0294 interfaceC0294, long j, boolean z, int i) {
        this.f65050 = c14902;
        this.f65046 = c14902.f48684;
        this.f65045 = interfaceC5341;
        this.f65051 = c7028;
        this.f65049 = c17933;
        this.f65048 = interfaceC24929;
        this.f65054 = interfaceC4365;
        this.f65052 = interfaceC0294;
        this.f65047 = j;
        this.f65044 = z;
        this.f65053 = i;
    }

    @Override // l.AbstractC9395
    /* JADX INFO: renamed from: ۙ */
    public final void mo16151(InterfaceC4639 interfaceC4639) {
        this.f65055 = interfaceC4639;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C20738 c20738M24732 = m24732();
        InterfaceC24929 interfaceC24929 = this.f65048;
        interfaceC24929.mo6288(looperMyLooper, c20738M24732);
        interfaceC24929.mo6290();
        C15617 c15617M24734 = m24734((C8402) null);
        C20870 c20870 = mo30717().f48681;
        c20870.getClass();
        this.f65052.mo1865(c20870.f66802, c15617M24734, this);
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16154() {
        this.f65052.mo1873();
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9147 mo33371(C8402 c8402, InterfaceC13314 interfaceC13314, long j) {
        C15617 c15617M24734 = m24734(c8402);
        C12994 c12994M24720 = m24720(c8402);
        return new C23241(this.f65051, this.f65052, this.f65045, this.f65055, this.f65048, c12994M24720, this.f65054, c15617M24734, interfaceC13314, this.f65049, this.f65044, this.f65053, m24732());
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final void mo33372(InterfaceC9147 interfaceC9147) {
        ((C23241) interfaceC9147).m52228();
    }

    @Override // l.AbstractC9395
    /* JADX INFO: renamed from: ֫ */
    public final void mo16145() {
        this.f65052.stop();
        this.f65048.mo6287();
    }

    @Override // l.InterfaceC18193
    /* JADX INFO: renamed from: ۙ */
    public final void mo14515(C24907 c24907) {
        long j;
        C15288 c15288;
        long jM19474;
        long j2;
        long jM19475;
        long j3;
        long jElapsedRealtime;
        boolean z = c24907.f80593;
        boolean z2 = c24907.f80603;
        AbstractC1928 abstractC1928 = c24907.f80607;
        long j4 = c24907.f80606;
        long jM19476 = c24907.f80597;
        int i = c24907.f80605;
        long j5 = c24907.f80611;
        long jM19506 = z ? C7116.m19506(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jM19506 : -9223372036854775807L;
        InterfaceC0294 interfaceC0294 = this.f65052;
        interfaceC0294.mo1870().getClass();
        C11306 c11306 = new C11306();
        if (interfaceC0294.mo1869()) {
            C11480 c11480 = c24907.f80599;
            long jMo1862 = j5 - interfaceC0294.mo1862();
            boolean z3 = c24907.f80600;
            long j7 = z3 ? jMo1862 + j4 : -9223372036854775807L;
            if (c24907.f80593) {
                String str = C7116.f23455;
                long j8 = this.f65047;
                if (j8 == -9223372036854775807L) {
                    jElapsedRealtime = System.currentTimeMillis();
                } else {
                    jElapsedRealtime = SystemClock.elapsedRealtime() + j8;
                }
                jM19474 = C7116.m19474(jElapsedRealtime) - (j5 + j4);
            } else {
                jM19474 = 0;
            }
            long j9 = this.f65046.f12772;
            if (j9 != -9223372036854775807L) {
                jM19475 = C7116.m19474(j9);
            } else {
                if (jM19476 != -9223372036854775807L) {
                    j2 = j4 - jM19476;
                } else {
                    j2 = c11480.f36112;
                    if (j2 == -9223372036854775807L || c24907.f80604 == -9223372036854775807L) {
                        j2 = c11480.f36109;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * c24907.f80595;
                        }
                    }
                }
                jM19475 = j2 + jM19474;
            }
            long j10 = j4 + jM19474;
            long jM19477 = C7116.m19476(jM19475, jM19474, j10);
            C3716 c3716 = mo30717().f48684;
            boolean z4 = c3716.f12774 == -3.4028235E38f && c3716.f12773 == -3.4028235E38f && c11480.f36109 == -9223372036854775807L && c11480.f36112 == -9223372036854775807L;
            C23854 c23854 = new C23854();
            c23854.m53202(C7116.m19506(jM19477));
            c23854.m53203(z4 ? 1.0f : this.f65046.f12774);
            c23854.m53200(z4 ? 1.0f : this.f65046.f12773);
            C3716 c3716M53199 = c23854.m53199();
            this.f65046 = c3716M53199;
            if (jM19476 == -9223372036854775807L) {
                jM19476 = j10 - C7116.m19474(c3716M53199.f12772);
            }
            if (z2) {
                j3 = jM19476;
            } else {
                C15209 c15209M46531 = m46531(jM19476, c24907.f80601);
                if (c15209M46531 != null) {
                    j3 = c15209M46531.f6095;
                } else if (abstractC1928.isEmpty()) {
                    j3 = 0;
                } else {
                    C5515 c5515 = (C5515) abstractC1928.get(C7116.m19469((List) abstractC1928, Long.valueOf(jM19476), true));
                    C15209 c15209M46532 = m46531(jM19476, c5515.f19195);
                    if (c15209M46532 != null) {
                        j3 = c15209M46532.f6095;
                    } else {
                        j3 = c5515.f6095;
                    }
                }
            }
            c15288 = new C15288(j6, jM19506, j7, c24907.f80606, jMo1862, j3, true, !z3, i == 2 && c24907.f80596, c11306, mo30717(), this.f65046);
        } else {
            if (jM19476 == -9223372036854775807L || abstractC1928.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jM19476 != j4) {
                    jM19476 = ((C5515) abstractC1928.get(C7116.m19469((List) abstractC1928, Long.valueOf(jM19476), true))).f6095;
                }
                j = jM19476;
            }
            long j11 = c24907.f80606;
            c15288 = new C15288(j6, jM19506, j11, j11, 0L, j, true, false, true, c11306, mo30717(), null);
        }
        m24728(c15288);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15209 m46531(long j, List list) {
        C15209 c15209 = null;
        for (int i = 0; i < list.size(); i++) {
            C15209 c152010 = (C15209) list.get(i);
            long j2 = c152010.f6095;
            if (j2 > j || !c152010.f49638) {
                if (j2 > j) {
                    break;
                }
            } else {
                c15209 = c152010;
            }
        }
        return c15209;
    }
}
