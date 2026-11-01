package l;

import android.os.Looper;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7N0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23753 extends AbstractC6537 implements InterfaceC2440 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16967 f76847;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19706 f76848;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20225 f76849;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C23876 f76850;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final int f76851;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f76852;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f76853;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C13689 f76854;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14113 f76855;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15992 f76856;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5263 f76857;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C2641 f76858;

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final synchronized C13689 mo4106() {
        return this.f76854;
    }

    @Override // l.AbstractC6537, l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final synchronized void mo4109(C13689 c13689) {
        this.f76854 = c13689;
    }

    static {
        C11572.m28868("media3.exoplayer.hls");
    }

    public C23753(C13689 c13689, InterfaceC15992 interfaceC15992, C21635 c21635, C2641 c2641, InterfaceC16967 interfaceC16967, InterfaceC14113 interfaceC14113, InterfaceC5263 interfaceC5263, long j, boolean z, int i) {
        this.f76854 = c13689;
        this.f76850 = c13689.f45158;
        this.f76856 = interfaceC15992;
        this.f76849 = c21635;
        this.f76858 = c2641;
        this.f76847 = interfaceC16967;
        this.f76855 = interfaceC14113;
        this.f76857 = interfaceC5263;
        this.f76852 = j;
        this.f76853 = z;
        this.f76851 = i;
    }

    @Override // l.AbstractC6537
    /* JADX INFO: renamed from: ۙ */
    public final void mo4110(InterfaceC19706 interfaceC19706) {
        this.f76848 = interfaceC19706;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C9724 c9724M17753 = m17753();
        InterfaceC16967 interfaceC16967 = this.f76847;
        interfaceC16967.mo39759(looperMyLooper, c9724M17753);
        interfaceC16967.mo39761();
        C7512 c7512M17767 = m17767((C15274) null);
        C14704 c14704 = mo4106().f45157;
        c14704.getClass();
        this.f76857.mo14538(c14704.f48029, c7512M17767, this);
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ܰ */
    public final void mo4111() {
        this.f76857.mo14533();
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6806 mo4105(C15274 c15274, InterfaceC15732 interfaceC15732, long j) {
        C7512 c7512M17767 = m17767(c15274);
        C21200 c21200M17755 = m17755(c15274);
        return new C6113(this.f76849, this.f76857, this.f76856, this.f76848, this.f76847, c21200M17755, this.f76855, c7512M17767, interfaceC15732, this.f76858, this.f76853, this.f76851, m17753());
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final void mo4108(InterfaceC6806 interfaceC6806) {
        ((C6113) interfaceC6806).m17087();
    }

    @Override // l.AbstractC6537
    /* JADX INFO: renamed from: ۘ */
    public final void mo4104() {
        this.f76857.stop();
        this.f76847.mo39758();
    }

    @Override // l.InterfaceC2440
    /* JADX INFO: renamed from: ۙ */
    public final void mo7423(C16325 c16325) {
        long j;
        C7450 c7450;
        long jM41827;
        long j2;
        long jM41828;
        long j3;
        long jElapsedRealtime;
        boolean z = c16325.f52574;
        boolean z2 = c16325.f52584;
        AbstractC22433 abstractC22433 = c16325.f52586;
        long j4 = c16325.f52575;
        long jM41829 = c16325.f52580;
        int i = c16325.f52589;
        long j5 = c16325.f52577;
        long jM41856 = z ? C17983.m41856(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jM41856 : -9223372036854775807L;
        InterfaceC5263 interfaceC5263 = this.f76857;
        interfaceC5263.mo14543().getClass();
        C13426 c13426 = new C13426();
        if (interfaceC5263.mo14542()) {
            C0096 c0096 = c16325.f52579;
            long jMo14535 = j5 - interfaceC5263.mo14535();
            boolean z3 = c16325.f52572;
            long j7 = z3 ? jMo14535 + j4 : -9223372036854775807L;
            if (c16325.f52574) {
                String str = C17983.f57504;
                long j8 = this.f76852;
                if (j8 == -9223372036854775807L) {
                    jElapsedRealtime = System.currentTimeMillis();
                } else {
                    jElapsedRealtime = SystemClock.elapsedRealtime() + j8;
                }
                jM41827 = C17983.m41827(jElapsedRealtime) - (j5 + j4);
            } else {
                jM41827 = 0;
            }
            long j9 = this.f76850.f77163;
            if (j9 != -9223372036854775807L) {
                jM41828 = C17983.m41827(j9);
            } else {
                if (jM41829 != -9223372036854775807L) {
                    j2 = j4 - jM41829;
                } else {
                    j2 = c0096.f1023;
                    if (j2 == -9223372036854775807L || c16325.f52582 == -9223372036854775807L) {
                        j2 = c0096.f1026;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * c16325.f52588;
                        }
                    }
                }
                jM41828 = j2 + jM41827;
            }
            long j10 = j4 + jM41827;
            long jM418210 = C17983.m41829(jM41828, jM41827, j10);
            C23876 c23876 = mo4106().f45158;
            boolean z4 = c23876.f77161 == -3.4028235E38f && c23876.f77165 == -3.4028235E38f && c0096.f1026 == -9223372036854775807L && c0096.f1023 == -9223372036854775807L;
            C11176 c11176 = new C11176();
            c11176.m28116(C17983.m41856(jM418210));
            c11176.m28117(z4 ? 1.0f : this.f76850.f77161);
            c11176.m28114(z4 ? 1.0f : this.f76850.f77165);
            C23876 c23876M28113 = c11176.m28113();
            this.f76850 = c23876M28113;
            if (jM41829 == -9223372036854775807L) {
                jM41829 = j10 - C17983.m41827(c23876M28113.f77163);
            }
            if (z2) {
                j3 = jM41829;
            } else {
                C7152 c7152M52311 = m52311(jM41829, c16325.f52583);
                if (c7152M52311 != null) {
                    j3 = c7152M52311.f63678;
                } else if (abstractC22433.isEmpty()) {
                    j3 = 0;
                } else {
                    C15620 c15620 = (C15620) abstractC22433.get(C17983.m41822((List) abstractC22433, Long.valueOf(jM41829), true));
                    C7152 c7152M52312 = m52311(jM41829, c15620.f50799);
                    if (c7152M52312 != null) {
                        j3 = c7152M52312.f63678;
                    } else {
                        j3 = c15620.f63678;
                    }
                }
            }
            c7450 = new C7450(j6, jM41856, j7, c16325.f52575, jMo14535, j3, true, !z3, i == 2 && c16325.f52581, c13426, mo4106(), this.f76850);
        } else {
            if (jM41829 == -9223372036854775807L || abstractC22433.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jM41829 != j4) {
                    jM41829 = ((C15620) abstractC22433.get(C17983.m41822((List) abstractC22433, Long.valueOf(jM41829), true))).f63678;
                }
                j = jM41829;
            }
            long j11 = c16325.f52575;
            c7450 = new C7450(j6, jM41856, j11, j11, 0L, j, true, false, true, c13426, mo4106(), null);
        }
        m17759(c7450);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7152 m52311(long j, List list) {
        C7152 c7152 = null;
        for (int i = 0; i < list.size(); i++) {
            C7152 c7153 = (C7152) list.get(i);
            long j2 = c7153.f63678;
            if (j2 > j || !c7153.f23910) {
                if (j2 > j) {
                    break;
                }
            } else {
                c7152 = c7153;
            }
        }
        return c7152;
    }
}
