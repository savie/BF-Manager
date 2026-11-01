package l;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.᩷᩹ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8FJ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21167 extends AbstractC16862 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean f68913;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f68914;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f68915;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public Surface f68916;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10388 f68917;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public C13314 f68918;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public Object f68919;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public C12629 f68920;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19841 f68921;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final C13842 f68922;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final C16033 f68923;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public boolean f68924;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C3871 f68925;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C17443 f68926;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public boolean f68927;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public long f68928;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public int f68929;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC19790 f68930;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C7648 f68931;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f68932;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public C16033 f68933;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public long f68934;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final int f68935;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public long f68936;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f68937;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f68938;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C7648 f68939;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public long f68940;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f68941;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final long f68942;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19790 f68943;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15608 f68944;

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public final void mo13950(C7648[] c7648Arr, long j, long j2, C15274 c15274) {
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract InterfaceC10388 mo17158(C7648 c7648);

    public AbstractC21167(long j, Handler handler, InterfaceC11725 interfaceC11725, int i) {
        super(2);
        this.f68942 = j;
        this.f68935 = i;
        this.f68934 = -9223372036854775807L;
        this.f68925 = new C3871();
        this.f68923 = new C16033(0, 0);
        this.f68922 = new C13842(handler, interfaceC11725);
        this.f68941 = 0;
        this.f68915 = -1;
        this.f68938 = 0;
        this.f68920 = new C12629();
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public final void mo13260(long j, long j2) throws C2170 {
        if (this.f68924) {
            return;
        }
        if (this.f68939 == null) {
            C12526 c12526M39525 = m39525();
            this.f68923.mo7();
            int iM39515 = m39515(c12526M39525, this.f68923, 2);
            if (iM39515 != -5) {
                if (iM39515 == -4) {
                    C2023.m6510(this.f68923.m42264());
                    this.f68913 = true;
                    this.f68924 = true;
                    return;
                }
                return;
            }
            m47624(c12526M39525);
        }
        m47620();
        if (this.f68917 != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (m47621(j)) {
                }
                while (m47622()) {
                }
                Trace.endSection();
                synchronized (this.f68920) {
                }
            } catch (C7565 e) {
                C0303.m1854("Video codec error", e);
                this.f68922.m33681((Exception) e);
                throw m39516(e, this.f68939, 4003);
            }
        }
    }

    @Override // l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13268() {
        return this.f68924;
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo13264() {
        if (this.f68939 != null && ((m39519() || this.f68926 != null) && (this.f68938 == 3 || this.f68915 == -1))) {
            this.f68934 = -9223372036854775807L;
            return true;
        }
        if (this.f68934 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f68934) {
            return true;
        }
        this.f68934 = -9223372036854775807L;
        return false;
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public final void mo13949(boolean z, boolean z2) {
        C12629 c12629 = new C12629();
        this.f68920 = c12629;
        this.f68922.m33689(c12629);
        this.f68938 = z2 ? 1 : 0;
    }

    @Override // l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ۬ */
    public final void mo13266() {
        if (this.f68938 == 0) {
            this.f68938 = 1;
        }
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public final void mo13942(long j, boolean z) throws C2170 {
        this.f68913 = false;
        this.f68924 = false;
        this.f68938 = Math.min(this.f68938, 1);
        this.f68940 = -9223372036854775807L;
        this.f68929 = 0;
        if (this.f68917 != null) {
            m47626();
        }
        if (!z) {
            this.f68934 = -9223372036854775807L;
        } else {
            long j2 = this.f68942;
            this.f68934 = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : -9223372036854775807L;
        }
        this.f68925.m11200();
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۢ */
    public final void mo13956() {
        this.f68937 = 0;
        this.f68936 = SystemClock.elapsedRealtime();
        this.f68928 = C17983.m41827(SystemClock.elapsedRealtime());
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۗ */
    public final void mo13931() {
        this.f68934 = -9223372036854775807L;
        if (this.f68937 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f68922.m33680(this.f68937, jElapsedRealtime - this.f68936);
            this.f68937 = 0;
            this.f68936 = jElapsedRealtime;
        }
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۧ */
    public final void mo13958() {
        C13842 c13842 = this.f68922;
        this.f68939 = null;
        this.f68918 = null;
        this.f68938 = Math.min(this.f68938, 0);
        try {
            C19084.m43862(this.f68930, (InterfaceC19790) null);
            this.f68930 = null;
            m47627();
        } finally {
            c13842.m33686(this.f68920);
        }
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m47626() throws C2170 {
        this.f68914 = 0;
        if (this.f68941 != 0) {
            m47627();
            m47620();
            return;
        }
        this.f68933 = null;
        if (this.f68926 != null) {
            throw null;
        }
        InterfaceC10388 interfaceC10388 = this.f68917;
        interfaceC10388.getClass();
        interfaceC10388.flush();
        interfaceC10388.mo26288(m39528());
        this.f68932 = false;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final void m47627() {
        this.f68933 = null;
        this.f68926 = null;
        this.f68941 = 0;
        this.f68932 = false;
        this.f68914 = 0;
        InterfaceC10388 interfaceC10388 = this.f68917;
        if (interfaceC10388 != null) {
            this.f68920.f42205++;
            interfaceC10388.mo14();
            this.f68922.m33683(this.f68917.getName());
            this.f68917 = null;
        }
        C19084.m43862(this.f68943, (InterfaceC19790) null);
        this.f68943 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47624(C12526 c12526) throws C2170 {
        C17567 c17567Mo17157;
        this.f68927 = true;
        C7648 c7648 = c12526.f41899;
        c7648.getClass();
        InterfaceC19790 interfaceC19790 = c12526.f41898;
        C19084.m43862(this.f68930, interfaceC19790);
        this.f68930 = interfaceC19790;
        C7648 c7649 = this.f68939;
        this.f68939 = c7648;
        InterfaceC10388 interfaceC10388 = this.f68917;
        C13842 c13842 = this.f68922;
        if (interfaceC10388 == null) {
            m47620();
            C7648 c76410 = this.f68939;
            c76410.getClass();
            c13842.m33685(c76410, (C17567) null);
            return;
        }
        if (interfaceC19790 != this.f68943) {
            String name = interfaceC10388.getName();
            c7649.getClass();
            c17567Mo17157 = new C17567(name, c7649, c7648, 0, 128);
        } else {
            String name2 = interfaceC10388.getName();
            c7649.getClass();
            c17567Mo17157 = mo17157(name2, c7649, c7648);
        }
        if (c17567Mo17157.f55818 == 0) {
            if (this.f68932) {
                this.f68941 = 1;
            } else {
                m47627();
                m47620();
            }
        }
        C7648 c76411 = this.f68939;
        c76411.getClass();
        c13842.m33685(c76411, c17567Mo17157);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47623(int i, int i2) {
        int i3;
        C12629 c12629 = this.f68920;
        c12629.f42198 += i;
        int i4 = i + i2;
        c12629.f42203 += i4;
        this.f68937 += i4;
        int i5 = this.f68929 + i4;
        this.f68929 = i5;
        c12629.f42207 = Math.max(i5, c12629.f42207);
        int i6 = this.f68935;
        if (i6 <= 0 || (i3 = this.f68937) < i6 || i3 <= 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f68922.m33680(this.f68937, jElapsedRealtime - this.f68936);
        this.f68937 = 0;
        this.f68936 = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47625(C17443 c17443, long j, C7648 c7648) {
        InterfaceC19841 interfaceC19841 = this.f68921;
        if (interfaceC19841 != null) {
            interfaceC19841.mo2526(j, m39520().mo28885(), c7648, null);
        }
        this.f68928 = C17983.m41827(SystemClock.elapsedRealtime());
        c17443.getClass();
        boolean z = this.f68944 != null;
        if (!z) {
            m47623(0, 1);
            throw null;
        }
        C13314 c13314 = this.f68918;
        C13842 c13842 = this.f68922;
        if (c13314 == null || c13314.f44194 != 0 || c13314.f44193 != 0) {
            C13314 c13315 = new C13314(0, 0);
            this.f68918 = c13315;
            c13842.m33687(c13315);
        }
        if (!z) {
            this.f68916.getClass();
        } else {
            InterfaceC15608 interfaceC15608 = this.f68944;
            interfaceC15608.getClass();
            interfaceC15608.mo37274(c17443);
        }
        this.f68929 = 0;
        this.f68920.f42204++;
        if (this.f68938 != 3) {
            this.f68938 = 3;
            Object obj = this.f68919;
            if (obj != null) {
                c13842.m33682(obj);
            }
        }
    }

    @Override // l.AbstractC16862, l.InterfaceC23691
    /* JADX INFO: renamed from: ۙ */
    public final void mo13941(int i, Object obj) {
        Object obj2;
        if (i != 1) {
            if (i == 7) {
                this.f68921 = (InterfaceC19841) obj;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.f68916 = (Surface) obj;
            this.f68944 = null;
            this.f68915 = 1;
        } else if (obj instanceof InterfaceC15608) {
            this.f68916 = null;
            this.f68944 = (InterfaceC15608) obj;
            this.f68915 = 0;
        } else {
            this.f68916 = null;
            this.f68944 = null;
            this.f68915 = -1;
            obj = null;
        }
        Object obj3 = this.f68919;
        C13842 c13842 = this.f68922;
        if (obj3 == obj) {
            if (obj != null) {
                C13314 c13314 = this.f68918;
                if (c13314 != null) {
                    c13842.m33687(c13314);
                }
                if (this.f68938 != 3 || (obj2 = this.f68919) == null) {
                    return;
                }
                c13842.m33682(obj2);
                return;
            }
            return;
        }
        this.f68919 = obj;
        if (obj == null) {
            this.f68918 = null;
            this.f68938 = Math.min(this.f68938, 1);
            return;
        }
        C13314 c13315 = this.f68918;
        if (c13315 != null) {
            c13842.m33687(c13315);
        }
        this.f68938 = Math.min(this.f68938, 1);
        if (getState() == 2) {
            long j = this.f68942;
            this.f68934 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public C17567 mo17157(String str, C7648 c7648, C7648 c7649) {
        return new C17567(str, c7648, c7649, 0, 1);
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    private void m47620() throws C2170 {
        if (this.f68917 != null) {
            return;
        }
        InterfaceC19790 interfaceC19790 = this.f68930;
        C19084.m43862(this.f68943, interfaceC19790);
        this.f68943 = interfaceC19790;
        if (interfaceC19790 != null && interfaceC19790.mo28385() == null && this.f68943.getError() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            C7648 c7648 = this.f68939;
            c7648.getClass();
            mo17158(c7648);
            this.f68917 = null;
            throw null;
        } catch (OutOfMemoryError e) {
            throw m39516(e, this.f68939, OpenAuthTask.NOT_INSTALLED);
        } catch (C7565 e2) {
            C0303.m1854("Video codec error", e2);
            this.f68922.m33681((Exception) e2);
            throw m39516(e2, this.f68939, OpenAuthTask.NOT_INSTALLED);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    private boolean m47622() throws C2170 {
        C16033 c16033;
        C12526 c12526M39525;
        int iM39515;
        InterfaceC10388 interfaceC10388 = this.f68917;
        if (interfaceC10388 != null && this.f68941 != 2 && !this.f68913) {
            if (this.f68933 == null) {
                C16033 c16034 = (C16033) interfaceC10388.mo26287();
                this.f68933 = c16034;
                if (c16034 != null) {
                    c16033 = this.f68933;
                    c16033.getClass();
                    if (this.f68941 == 1) {
                        c16033.m42267(4);
                        InterfaceC10388 interfaceC10389 = this.f68917;
                        interfaceC10389.getClass();
                        interfaceC10389.mo26286(c16033);
                        this.f68933 = null;
                        this.f68941 = 2;
                        return false;
                    }
                    c12526M39525 = m39525();
                    iM39515 = m39515(c12526M39525, c16033, 0);
                    if (iM39515 != -5) {
                        m47624(c12526M39525);
                        return true;
                    }
                    if (iM39515 != -4) {
                        if (c16033.m42264()) {
                            this.f68913 = true;
                            InterfaceC10388 interfaceC103810 = this.f68917;
                            interfaceC103810.getClass();
                            interfaceC103810.mo26286(c16033);
                            this.f68933 = null;
                            return false;
                        }
                        if (this.f68927) {
                            long j = c16033.f51910;
                            C7648 c7648 = this.f68939;
                            c7648.getClass();
                            this.f68925.m11201(j, c7648);
                            this.f68927 = false;
                        }
                        c16033.m38025();
                        c16033.f51911 = this.f68939;
                        InterfaceC10388 interfaceC103811 = this.f68917;
                        interfaceC103811.getClass();
                        interfaceC103811.mo26286(c16033);
                        this.f68914++;
                        this.f68932 = true;
                        this.f68920.f42197++;
                        this.f68933 = null;
                        return true;
                    }
                    if (iM39515 != -3) {
                        throw new IllegalStateException();
                    }
                }
            } else {
                c16033 = this.f68933;
                c16033.getClass();
                if (this.f68941 == 1) {
                    c16033.m42267(4);
                    InterfaceC10388 interfaceC103812 = this.f68917;
                    interfaceC103812.getClass();
                    interfaceC103812.mo26286(c16033);
                    this.f68933 = null;
                    this.f68941 = 2;
                    return false;
                }
                c12526M39525 = m39525();
                iM39515 = m39515(c12526M39525, c16033, 0);
                if (iM39515 != -5) {
                    m47624(c12526M39525);
                    return true;
                }
                if (iM39515 != -4) {
                    if (c16033.m42264()) {
                        this.f68913 = true;
                        InterfaceC10388 interfaceC103813 = this.f68917;
                        interfaceC103813.getClass();
                        interfaceC103813.mo26286(c16033);
                        this.f68933 = null;
                        return false;
                    }
                    if (this.f68927) {
                        long j2 = c16033.f51910;
                        C7648 c7649 = this.f68939;
                        c7649.getClass();
                        this.f68925.m11201(j2, c7649);
                        this.f68927 = false;
                    }
                    c16033.m38025();
                    c16033.f51911 = this.f68939;
                    InterfaceC10388 interfaceC103814 = this.f68917;
                    interfaceC103814.getClass();
                    interfaceC103814.mo26286(c16033);
                    this.f68914++;
                    this.f68932 = true;
                    this.f68920.f42197++;
                    this.f68933 = null;
                    return true;
                }
                if (iM39515 != -3) {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0106  */
    /* JADX WARN: Code duplicated, block: B:72:0x010a  */
    /* JADX WARN: Code duplicated, block: B:73:0x010c  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0115  */
    /* JADX WARN: Code duplicated, block: B:79:0x011f  */
    /* JADX WARN: Code duplicated, block: B:85:0x012e  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m47621(long j) throws C2170 {
        boolean z;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        if (this.f68926 == null) {
            InterfaceC10388 interfaceC10388 = this.f68917;
            interfaceC10388.getClass();
            C17443 c17443 = (C17443) interfaceC10388.mo21899();
            this.f68926 = c17443;
            if (c17443 == null) {
                return false;
            }
            C12629 c12629 = this.f68920;
            int i = c12629.f42202;
            int i2 = c17443.f2201;
            c12629.f42202 = i + i2;
            this.f68914 -= i2;
        }
        if (this.f68926.m42264()) {
            if (this.f68941 != 2) {
                this.f68926.getClass();
                throw null;
            }
            m47627();
            m47620();
            return false;
        }
        if (this.f68940 == -9223372036854775807L) {
            this.f68940 = j;
        }
        C17443 c17444 = this.f68926;
        c17444.getClass();
        long j4 = c17444.f2202;
        long j5 = j4 - j;
        if (this.f68915 != -1) {
            C3871 c3871 = this.f68925;
            C7648 c7648 = (C7648) c3871.m11204(j4);
            if (c7648 != null) {
                this.f68931 = c7648;
            } else if (this.f68931 == null) {
                this.f68931 = (C7648) c3871.m11203();
            }
            long jM39522 = j4 - m39522();
            boolean z4 = getState() == 2;
            int i3 = this.f68938;
            if (i3 != 0) {
                if (i3 != 1) {
                    j3 = -30000;
                    if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                    j2 = jM39522;
                    long jM41827 = C17983.m41827(SystemClock.elapsedRealtime()) - this.f68928;
                    if (!z4 || j5 >= -30000 || jM41827 <= 100000) {
                        z4 = false;
                    }
                } else {
                    j2 = jM39522;
                    j3 = -30000;
                }
                z4 = true;
            } else {
                j2 = jM39522;
                j3 = -30000;
            }
            if (z4) {
                C7648 c7649 = this.f68931;
                c7649.getClass();
                m47625(c17444, j2, c7649);
            } else {
                long j6 = j2;
                if ((getState() == 2) && j != this.f68940) {
                    if (!(j5 < -500000)) {
                        if (j5 < j3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            m47623(0, 1);
                            throw null;
                        }
                        if (j5 < 30000) {
                            C7648 c76410 = this.f68931;
                            c76410.getClass();
                            m47625(c17444, j6, c76410);
                        }
                        if (z) {
                            this.f68926.getClass();
                            this.f68914--;
                            this.f68926 = null;
                        }
                        return z;
                    }
                    int iM39523 = m39523(j);
                    if (iM39523 == 0) {
                        z3 = false;
                    } else {
                        this.f68920.f42201++;
                        m47623(iM39523, this.f68914);
                        m47626();
                        z3 = true;
                    }
                    if (!z3) {
                        if (j5 < j3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            m47623(0, 1);
                            throw null;
                        }
                        if (j5 < 30000) {
                            C7648 c76411 = this.f68931;
                            c76411.getClass();
                            m47625(c17444, j6, c76411);
                        }
                        if (z) {
                            this.f68926.getClass();
                            this.f68914--;
                            this.f68926 = null;
                        }
                        return z;
                    }
                }
            }
            z = true;
            if (z) {
                this.f68926.getClass();
                this.f68914--;
                this.f68926 = null;
            }
            return z;
        }
        if (j5 < -30000) {
            this.f68920.f42202++;
            throw null;
        }
        z = false;
        if (z) {
            this.f68926.getClass();
            this.f68914--;
            this.f68926 = null;
        }
        return z;
    }
}
