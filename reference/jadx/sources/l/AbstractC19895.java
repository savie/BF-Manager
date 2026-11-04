package l;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.ᩴܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E8FJ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19895 extends AbstractC25280 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public long f64009;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C17622 f64010;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19860 f64011;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C15648 f64012;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final C24306 f64013;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public long f64014;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public C18787 f64015;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f64016;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C10098 f64017;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f64018;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public long f64019;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f64020;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC22814 f64021;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public Object f64022;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public boolean f64023;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C17074 f64024;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C5690 f64025;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f64026;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public Surface f64027;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C5690 f64028;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final long f64029;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public long f64030;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f64031;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f64032;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean f64033;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final int f64034;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f64035;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C15648 f64036;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC10756 f64037;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f64038;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19830 f64039;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10756 f64040;

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo11188(C15648[] c15648Arr, long j, long j2, C8402 c8402) {
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract InterfaceC19860 mo38289(C15648 c15648);

    public AbstractC19895(long j, Handler handler, InterfaceC4168 interfaceC4168, int i) {
        super(2);
        this.f64029 = j;
        this.f64034 = i;
        this.f64009 = -9223372036854775807L;
        this.f64017 = new C10098();
        this.f64025 = new C5690(0, 0);
        this.f64013 = new C24306(handler, interfaceC4168);
        this.f64032 = 0;
        this.f64020 = -1;
        this.f64035 = 0;
        this.f64024 = new C17074();
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public final void mo11186(long j, long j2) throws C18566 {
        if (this.f64018) {
            return;
        }
        if (this.f64036 == null) {
            C16461 c16461M56450 = m56450();
            this.f64025.mo7();
            int iM56443 = m56443(c16461M56450, this.f64025, 2);
            if (iM56443 != -5) {
                if (iM56443 == -4) {
                    C20782.m47568(this.f64025.m33305());
                    this.f64033 = true;
                    this.f64018 = true;
                    return;
                }
                return;
            }
            m45797(c16461M56450);
        }
        m45795();
        if (this.f64011 != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (m45793(j)) {
                }
                while (m45794()) {
                }
                Trace.endSection();
                synchronized (this.f64024) {
                }
            } catch (C15384 e) {
                C1896.m6516("Video codec error", e);
                this.f64013.m54327((Exception) e);
                throw m56444(e, this.f64036, 4003);
            }
        }
    }

    @Override // l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo11190() {
        return this.f64018;
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo11189() {
        if (this.f64036 != null && ((m56449() || this.f64010 != null) && (this.f64035 == 3 || this.f64020 == -1))) {
            this.f64009 = -9223372036854775807L;
            return true;
        }
        if (this.f64009 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f64009) {
            return true;
        }
        this.f64009 = -9223372036854775807L;
        return false;
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo22678(boolean z, boolean z2) {
        C17074 c17074 = new C17074();
        this.f64024 = c17074;
        this.f64013.m54335(c17074);
        this.f64035 = z2 ? 1 : 0;
    }

    @Override // l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ۚ */
    public final void mo12946() {
        if (this.f64035 == 0) {
            this.f64035 = 1;
        }
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo11187(long j, boolean z) throws C18566 {
        this.f64033 = false;
        this.f64018 = false;
        this.f64035 = Math.min(this.f64035, 1);
        this.f64014 = -9223372036854775807L;
        this.f64016 = 0;
        if (this.f64011 != null) {
            m45799();
        }
        if (!z) {
            this.f64009 = -9223372036854775807L;
        } else {
            long j2 = this.f64029;
            this.f64009 = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : -9223372036854775807L;
        }
        this.f64017.m26054();
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo45800() {
        this.f64038 = 0;
        this.f64030 = SystemClock.elapsedRealtime();
        this.f64019 = C7116.m19474(SystemClock.elapsedRealtime());
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void mo45801() {
        this.f64009 = -9223372036854775807L;
        if (this.f64038 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f64013.m54326(this.f64038, jElapsedRealtime - this.f64030);
            this.f64038 = 0;
            this.f64030 = jElapsedRealtime;
        }
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ֨ */
    public final void mo11184() {
        C24306 c24306 = this.f64013;
        this.f64036 = null;
        this.f64015 = null;
        this.f64035 = Math.min(this.f64035, 0);
        try {
            C4791.m14767(this.f64037, (InterfaceC10756) null);
            this.f64037 = null;
            m45802();
        } finally {
            c24306.m54332(this.f64024);
        }
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m45799() throws C18566 {
        this.f64026 = 0;
        if (this.f64032 != 0) {
            m45802();
            m45795();
            return;
        }
        this.f64028 = null;
        if (this.f64010 != null) {
            throw null;
        }
        InterfaceC19860 interfaceC19860 = this.f64011;
        interfaceC19860.getClass();
        interfaceC19860.flush();
        interfaceC19860.mo39839(m56453());
        this.f64031 = false;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final void m45802() {
        this.f64028 = null;
        this.f64010 = null;
        this.f64032 = 0;
        this.f64031 = false;
        this.f64026 = 0;
        InterfaceC19860 interfaceC19860 = this.f64011;
        if (interfaceC19860 != null) {
            this.f64024.f55753++;
            interfaceC19860.mo12();
            this.f64013.m54329(this.f64011.getName());
            this.f64011 = null;
        }
        C4791.m14767(this.f64040, (InterfaceC10756) null);
        this.f64040 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45797(C16461 c16461) throws C18566 {
        C17820 c17820Mo38288;
        this.f64023 = true;
        C15648 c15648 = c16461.f53378;
        c15648.getClass();
        InterfaceC10756 interfaceC10756 = c16461.f53377;
        C4791.m14767(this.f64037, interfaceC10756);
        this.f64037 = interfaceC10756;
        C15648 c15649 = this.f64036;
        this.f64036 = c15648;
        InterfaceC19860 interfaceC19860 = this.f64011;
        C24306 c24306 = this.f64013;
        if (interfaceC19860 == null) {
            m45795();
            C15648 c156410 = this.f64036;
            c156410.getClass();
            c24306.m54331(c156410, (C17820) null);
            return;
        }
        if (interfaceC10756 != this.f64040) {
            String name = interfaceC19860.getName();
            c15649.getClass();
            c17820Mo38288 = new C17820(name, c15649, c15648, 0, 128);
        } else {
            String name2 = interfaceC19860.getName();
            c15649.getClass();
            c17820Mo38288 = mo38288(name2, c15649, c15648);
        }
        if (c17820Mo38288.f58465 == 0) {
            if (this.f64031) {
                this.f64032 = 1;
            } else {
                m45802();
                m45795();
            }
        }
        C15648 c156411 = this.f64036;
        c156411.getClass();
        c24306.m54331(c156411, c17820Mo38288);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45796(int i, int i2) {
        int i3;
        C17074 c17074 = this.f64024;
        c17074.f55754 += i;
        int i4 = i + i2;
        c17074.f55747 += i4;
        this.f64038 += i4;
        int i5 = this.f64016 + i4;
        this.f64016 = i5;
        c17074.f55750 = Math.max(i5, c17074.f55750);
        int i6 = this.f64034;
        if (i6 <= 0 || (i3 = this.f64038) < i6 || i3 <= 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f64013.m54326(this.f64038, jElapsedRealtime - this.f64030);
        this.f64038 = 0;
        this.f64030 = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45798(C17622 c17622, long j, C15648 c15648) {
        InterfaceC19830 interfaceC19830 = this.f64039;
        if (interfaceC19830 != null) {
            interfaceC19830.mo24942(j, m56455().mo2212(), c15648, null);
        }
        this.f64019 = C7116.m19474(SystemClock.elapsedRealtime());
        c17622.getClass();
        boolean z = this.f64021 != null;
        if (!z) {
            m45796(0, 1);
            throw null;
        }
        C18787 c18787 = this.f64015;
        C24306 c24306 = this.f64013;
        if (c18787 == null || c18787.f61012 != 0 || c18787.f61011 != 0) {
            C18787 c18788 = new C18787(0, 0);
            this.f64015 = c18788;
            c24306.m54333(c18788);
        }
        if (!z) {
            this.f64027.getClass();
        } else {
            InterfaceC22814 interfaceC22814 = this.f64021;
            interfaceC22814.getClass();
            interfaceC22814.mo27627(c17622);
        }
        this.f64016 = 0;
        this.f64024.f55746++;
        if (this.f64035 != 3) {
            this.f64035 = 3;
            Object obj = this.f64022;
            if (obj != null) {
                c24306.m54328(obj);
            }
        }
    }

    @Override // l.AbstractC25280, l.InterfaceC3256
    /* JADX INFO: renamed from: ۙ */
    public final void mo10630(int i, Object obj) {
        Object obj2;
        if (i != 1) {
            if (i == 7) {
                this.f64039 = (InterfaceC19830) obj;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.f64027 = (Surface) obj;
            this.f64021 = null;
            this.f64020 = 1;
        } else if (obj instanceof InterfaceC22814) {
            this.f64027 = null;
            this.f64021 = (InterfaceC22814) obj;
            this.f64020 = 0;
        } else {
            this.f64027 = null;
            this.f64021 = null;
            this.f64020 = -1;
            obj = null;
        }
        Object obj3 = this.f64022;
        C24306 c24306 = this.f64013;
        if (obj3 == obj) {
            if (obj != null) {
                C18787 c18787 = this.f64015;
                if (c18787 != null) {
                    c24306.m54333(c18787);
                }
                if (this.f64035 != 3 || (obj2 = this.f64022) == null) {
                    return;
                }
                c24306.m54328(obj2);
                return;
            }
            return;
        }
        this.f64022 = obj;
        if (obj == null) {
            this.f64015 = null;
            this.f64035 = Math.min(this.f64035, 1);
            return;
        }
        C18787 c18788 = this.f64015;
        if (c18788 != null) {
            c24306.m54333(c18788);
        }
        this.f64035 = Math.min(this.f64035, 1);
        if (getState() == 2) {
            long j = this.f64029;
            this.f64009 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public C17820 mo38288(String str, C15648 c15648, C15648 c15649) {
        return new C17820(str, c15648, c15649, 0, 1);
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    private void m45795() throws C18566 {
        if (this.f64011 != null) {
            return;
        }
        InterfaceC10756 interfaceC10756 = this.f64037;
        C4791.m14767(this.f64040, interfaceC10756);
        this.f64040 = interfaceC10756;
        if (interfaceC10756 != null && interfaceC10756.mo27414() == null && this.f64040.getError() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            C15648 c15648 = this.f64036;
            c15648.getClass();
            mo38289(c15648);
            this.f64011 = null;
            throw null;
        } catch (OutOfMemoryError e) {
            throw m56444(e, this.f64036, OpenAuthTask.NOT_INSTALLED);
        } catch (C15384 e2) {
            C1896.m6516("Video codec error", e2);
            this.f64013.m54327((Exception) e2);
            throw m56444(e2, this.f64036, OpenAuthTask.NOT_INSTALLED);
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
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    private boolean m45794() throws C18566 {
        C5690 c5690;
        C16461 c16461M56450;
        int iM56443;
        InterfaceC19860 interfaceC19860 = this.f64011;
        if (interfaceC19860 != null && this.f64032 != 2 && !this.f64033) {
            if (this.f64028 == null) {
                C5690 c5691 = (C5690) interfaceC19860.mo39837();
                this.f64028 = c5691;
                if (c5691 != null) {
                    c5690 = this.f64028;
                    c5690.getClass();
                    if (this.f64032 == 1) {
                        c5690.m33307(4);
                        InterfaceC19860 interfaceC19861 = this.f64011;
                        interfaceC19861.getClass();
                        interfaceC19861.mo39834(c5690);
                        this.f64028 = null;
                        this.f64032 = 2;
                        return false;
                    }
                    c16461M56450 = m56450();
                    iM56443 = m56443(c16461M56450, c5690, 0);
                    if (iM56443 != -5) {
                        m45797(c16461M56450);
                        return true;
                    }
                    if (iM56443 != -4) {
                        if (c5690.m33305()) {
                            this.f64033 = true;
                            InterfaceC19860 interfaceC19862 = this.f64011;
                            interfaceC19862.getClass();
                            interfaceC19862.mo39834(c5690);
                            this.f64028 = null;
                            return false;
                        }
                        if (this.f64023) {
                            long j = c5690.f19652;
                            C15648 c15648 = this.f64036;
                            c15648.getClass();
                            this.f64017.m26055(j, c15648);
                            this.f64023 = false;
                        }
                        c5690.m16713();
                        c5690.f19653 = this.f64036;
                        InterfaceC19860 interfaceC19863 = this.f64011;
                        interfaceC19863.getClass();
                        interfaceC19863.mo39834(c5690);
                        this.f64026++;
                        this.f64031 = true;
                        this.f64024.f55749++;
                        this.f64028 = null;
                        return true;
                    }
                    if (iM56443 != -3) {
                        throw new IllegalStateException();
                    }
                }
            } else {
                c5690 = this.f64028;
                c5690.getClass();
                if (this.f64032 == 1) {
                    c5690.m33307(4);
                    InterfaceC19860 interfaceC19864 = this.f64011;
                    interfaceC19864.getClass();
                    interfaceC19864.mo39834(c5690);
                    this.f64028 = null;
                    this.f64032 = 2;
                    return false;
                }
                c16461M56450 = m56450();
                iM56443 = m56443(c16461M56450, c5690, 0);
                if (iM56443 != -5) {
                    m45797(c16461M56450);
                    return true;
                }
                if (iM56443 != -4) {
                    if (c5690.m33305()) {
                        this.f64033 = true;
                        InterfaceC19860 interfaceC19865 = this.f64011;
                        interfaceC19865.getClass();
                        interfaceC19865.mo39834(c5690);
                        this.f64028 = null;
                        return false;
                    }
                    if (this.f64023) {
                        long j2 = c5690.f19652;
                        C15648 c15649 = this.f64036;
                        c15649.getClass();
                        this.f64017.m26055(j2, c15649);
                        this.f64023 = false;
                    }
                    c5690.m16713();
                    c5690.f19653 = this.f64036;
                    InterfaceC19860 interfaceC19866 = this.f64011;
                    interfaceC19866.getClass();
                    interfaceC19866.mo39834(c5690);
                    this.f64026++;
                    this.f64031 = true;
                    this.f64024.f55749++;
                    this.f64028 = null;
                    return true;
                }
                if (iM56443 != -3) {
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
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m45793(long j) throws C18566 {
        boolean z;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        if (this.f64010 == null) {
            InterfaceC19860 interfaceC19860 = this.f64011;
            interfaceC19860.getClass();
            C17622 c17622 = (C17622) interfaceC19860.mo28187();
            this.f64010 = c17622;
            if (c17622 == null) {
                return false;
            }
            C17074 c17074 = this.f64024;
            int i = c17074.f55748;
            int i2 = c17622.f37778;
            c17074.f55748 = i + i2;
            this.f64026 -= i2;
        }
        if (this.f64010.m33305()) {
            if (this.f64032 != 2) {
                this.f64010.getClass();
                throw null;
            }
            m45802();
            m45795();
            return false;
        }
        if (this.f64014 == -9223372036854775807L) {
            this.f64014 = j;
        }
        C17622 c17623 = this.f64010;
        c17623.getClass();
        long j4 = c17623.f37777;
        long j5 = j4 - j;
        if (this.f64020 != -1) {
            C10098 c10098 = this.f64017;
            C15648 c15648 = (C15648) c10098.m26058(j4);
            if (c15648 != null) {
                this.f64012 = c15648;
            } else if (this.f64012 == null) {
                this.f64012 = (C15648) c10098.m26057();
            }
            long jM56448 = j4 - m56448();
            boolean z4 = getState() == 2;
            int i3 = this.f64035;
            if (i3 != 0) {
                if (i3 != 1) {
                    j3 = -30000;
                    if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                    j2 = jM56448;
                    long jM19474 = C7116.m19474(SystemClock.elapsedRealtime()) - this.f64019;
                    if (!z4 || j5 >= -30000 || jM19474 <= 100000) {
                        z4 = false;
                    }
                } else {
                    j2 = jM56448;
                    j3 = -30000;
                }
                z4 = true;
            } else {
                j2 = jM56448;
                j3 = -30000;
            }
            if (z4) {
                C15648 c15649 = this.f64012;
                c15649.getClass();
                m45798(c17623, j2, c15649);
            } else {
                long j6 = j2;
                if ((getState() == 2) && j != this.f64014) {
                    if (!(j5 < -500000)) {
                        if (j5 < j3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            m45796(0, 1);
                            throw null;
                        }
                        if (j5 < 30000) {
                            C15648 c156410 = this.f64012;
                            c156410.getClass();
                            m45798(c17623, j6, c156410);
                        }
                        if (z) {
                            this.f64010.getClass();
                            this.f64026--;
                            this.f64010 = null;
                        }
                        return z;
                    }
                    int iM56454 = m56454(j);
                    if (iM56454 == 0) {
                        z3 = false;
                    } else {
                        this.f64024.f55752++;
                        m45796(iM56454, this.f64026);
                        m45799();
                        z3 = true;
                    }
                    if (!z3) {
                        if (j5 < j3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            m45796(0, 1);
                            throw null;
                        }
                        if (j5 < 30000) {
                            C15648 c156411 = this.f64012;
                            c156411.getClass();
                            m45798(c17623, j6, c156411);
                        }
                        if (z) {
                            this.f64010.getClass();
                            this.f64026--;
                            this.f64010 = null;
                        }
                        return z;
                    }
                }
            }
            z = true;
            if (z) {
                this.f64010.getClass();
                this.f64026--;
                this.f64010 = null;
            }
            return z;
        }
        if (j5 < -30000) {
            this.f64024.f55748++;
            throw null;
        }
        z = false;
        if (z) {
            this.f64010.getClass();
            this.f64026--;
            this.f64010 = null;
        }
        return z;
    }
}
