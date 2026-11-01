package l;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.ۢۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8FI */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9394 extends AbstractC16862 implements InterfaceC1941 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31800;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16449 f31801;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f31802;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public long f31803;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public SimpleDecoderOutputBuffer f31804;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10388 f31805;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31806;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f31807;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public boolean f31808;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19790 f31809;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C16033 f31810;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f31811;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public long f31812;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31813;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f31814;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19790 f31815;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public C7648 f31816;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public long f31817;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public long f31818;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f31819;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f31820;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C19271 f31821;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31822;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C16033 f31823;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31824;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31825;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public C12629 f31826;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public long f31827;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract C7648 mo24109(InterfaceC10388 interfaceC10388);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract int mo24111(C7648 c7648);

    @Override // l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC1941 mo13265() {
        return this;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC10388 mo24113(C7648 c7648);

    public AbstractC9394(Handler handler, InterfaceC8688 interfaceC8688, InterfaceC16449 interfaceC16449) {
        super(1);
        this.f31821 = new C19271(handler, interfaceC8688);
        this.f31801 = interfaceC16449;
        interfaceC16449.mo19888(new C1631(this));
        this.f31810 = new C16033(0, 0);
        this.f31819 = 0;
        this.f31813 = true;
        m24102(-9223372036854775807L);
        this.f31802 = new long[10];
        this.f31817 = -9223372036854775807L;
        this.f31812 = -9223372036854775807L;
        this.f31818 = -9223372036854775807L;
    }

    @Override // l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ܰ */
    public final long mo13267(long j, long j2) {
        boolean z = this.f31818 != -9223372036854775807L;
        if (!this.f31800) {
            if (z || this.f31811) {
                return 1000000L;
            }
        } else {
            InterfaceC16449 interfaceC16449 = this.f31801;
            long jMo19876 = interfaceC16449.mo19876();
            if (z && jMo19876 != -9223372036854775807L) {
                return Math.max(10000L, ((long) ((Math.min(jMo19876, this.f31818 - j) / (interfaceC16449.mo19897() != null ? interfaceC16449.mo19897().f69728 : 1.0f)) / 2.0f)) - (C17983.m41827(m39520().mo28888()) - j2));
            }
        }
        return 10000L;
    }

    @Override // l.InterfaceC2667
    /* JADX INFO: renamed from: ۙ */
    public final int mo8212(C7648 c7648) {
        if (!C6632.m17975(c7648.f25265)) {
            return C13958.m33811(0, 0, 0, 0);
        }
        int iMo24111 = mo24111(c7648);
        return iMo24111 <= 2 ? C13958.m33811(iMo24111, 0, 0, 0) : iMo24111 | 168;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m24108(C7648 c7648) {
        return this.f31801.mo19893(c7648);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m24112(C7648 c7648) {
        return this.f31801.mo19899(c7648);
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public final void mo13260(long j, long j2) throws C2170 {
        if (this.f31811) {
            try {
                this.f31801.mo19898();
                this.f31818 = this.f31812;
                return;
            } catch (C0220 e) {
                throw m39517(e, e.f1400, e.f1398, 5002);
            }
        }
        if (this.f31816 == null) {
            C12526 c12526M39525 = m39525();
            this.f31810.mo7();
            int iM39515 = m39515(c12526M39525, this.f31810, 2);
            if (iM39515 != -5) {
                if (iM39515 == -4) {
                    C2023.m6510(this.f31810.m42264());
                    this.f31822 = true;
                    try {
                        this.f31811 = true;
                        this.f31801.mo19898();
                        this.f31818 = this.f31812;
                        return;
                    } catch (C0220 e2) {
                        throw m39516(e2, (C7648) null, 5002);
                    }
                }
                return;
            }
            m24100(c12526M39525);
        }
        m24098();
        if (this.f31805 != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (m24106()) {
                }
                while (m24104()) {
                }
                Trace.endSection();
                synchronized (this.f31826) {
                }
            } catch (C0220 e3) {
                throw m39517(e3, e3.f1400, e3.f1398, 5002);
            } catch (C7276 e4) {
                throw m39516(e4, e4.f24199, 5001);
            } catch (C7565 e5) {
                C0303.m1854("Audio codec error", e5);
                this.f31821.m44226(e5);
                throw m39516(e5, this.f31816, 4003);
            } catch (C20682 e6) {
                throw m39517(e6, e6.f67272, e6.f67270, 5001);
            }
        }
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m24110() {
        this.f31825 = true;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    private boolean m24106() throws C2170 {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.f31804;
        InterfaceC16449 interfaceC16449 = this.f31801;
        if (simpleDecoderOutputBuffer == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = (SimpleDecoderOutputBuffer) this.f31805.mo21899();
            this.f31804 = simpleDecoderOutputBuffer2;
            if (simpleDecoderOutputBuffer2 == null) {
                return false;
            }
            int i = simpleDecoderOutputBuffer2.f2201;
            if (i > 0) {
                this.f31826.f42202 += i;
                interfaceC16449.mo19877();
            }
            if (this.f31804.m42266()) {
                interfaceC16449.mo19877();
                if (this.f31814 != 0) {
                    long[] jArr = this.f31802;
                    m24102(jArr[0]);
                    int i2 = this.f31814 - 1;
                    this.f31814 = i2;
                    System.arraycopy(jArr, 1, jArr, 0, i2);
                }
            }
        }
        if (this.f31804.m42264()) {
            if (this.f31819 == 2) {
                m24101();
                m24098();
                this.f31813 = true;
                return false;
            }
            this.f31804.mo8();
            this.f31804 = null;
            try {
                this.f31811 = true;
                interfaceC16449.mo19898();
                this.f31818 = this.f31812;
                return false;
            } catch (C0220 e) {
                throw m39517(e, e.f1400, e.f1398, 5002);
            }
        }
        this.f31818 = -9223372036854775807L;
        if (this.f31813) {
            C10471 c10471M20201 = mo24109(this.f31805).m20201();
            c10471M20201.m26496(this.f31820);
            c10471M20201.m26510(this.f31807);
            c10471M20201.m26504(this.f31816.f25258);
            c10471M20201.m26501(this.f31816.f25279);
            c10471M20201.m26516(this.f31816.f25275);
            c10471M20201.m26495(this.f31816.f25274);
            c10471M20201.m26522(this.f31816.f25238);
            c10471M20201.m26509(this.f31816.f25269);
            c10471M20201.m26530(this.f31816.f25243);
            c10471M20201.m26513(this.f31816.f25244);
            interfaceC16449.mo19885(c10471M20201.m26497(), null);
            this.f31813 = false;
        }
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer3 = this.f31804;
        if (interfaceC16449.mo19892(1, simpleDecoderOutputBuffer3.f2202, simpleDecoderOutputBuffer3.f0)) {
            this.f31826.f42204++;
            this.f31804.mo8();
            this.f31804 = null;
            return true;
        }
        this.f31818 = this.f31804.f2202;
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m24102(long j) {
        this.f31827 = j;
        if (j != -9223372036854775807L) {
            this.f31801.getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    private boolean m24104() throws C2170 {
        C12526 c12526M39525;
        int iM39515;
        InterfaceC10388 interfaceC10388 = this.f31805;
        if (interfaceC10388 != null && this.f31819 != 2 && !this.f31822) {
            if (this.f31823 == null) {
                C16033 c16033 = (C16033) interfaceC10388.mo26287();
                this.f31823 = c16033;
                if (c16033 != null) {
                    if (this.f31819 == 1) {
                        this.f31823.m42267(4);
                        this.f31805.mo26286(this.f31823);
                        this.f31823 = null;
                        this.f31819 = 2;
                        return false;
                    }
                    c12526M39525 = m39525();
                    iM39515 = m39515(c12526M39525, this.f31823, 0);
                    if (iM39515 != -5) {
                        m24100(c12526M39525);
                        return true;
                    }
                    if (iM39515 != -4) {
                        if (this.f31823.m42264()) {
                            this.f31822 = true;
                            this.f31812 = this.f31817;
                            this.f31805.mo26286(this.f31823);
                            this.f31823 = null;
                            return false;
                        }
                        if (!this.f31808) {
                            this.f31808 = true;
                            this.f31823.m42270(134217728);
                        }
                        this.f31817 = this.f31823.f51910;
                        if (!mo13253() || this.f31823.m42272()) {
                            this.f31812 = this.f31817;
                        }
                        this.f31823.m38025();
                        C16033 c16034 = this.f31823;
                        c16034.f51911 = this.f31816;
                        this.f31805.mo26286(c16034);
                        this.f31824 = true;
                        this.f31826.f42197++;
                        this.f31823 = null;
                        return true;
                    }
                    if (iM39515 == -3) {
                        if (mo13253()) {
                            this.f31812 = this.f31817;
                            return false;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                if (this.f31819 == 1) {
                    this.f31823.m42267(4);
                    this.f31805.mo26286(this.f31823);
                    this.f31823 = null;
                    this.f31819 = 2;
                    return false;
                }
                c12526M39525 = m39525();
                iM39515 = m39515(c12526M39525, this.f31823, 0);
                if (iM39515 != -5) {
                    m24100(c12526M39525);
                    return true;
                }
                if (iM39515 != -4) {
                    if (this.f31823.m42264()) {
                        this.f31822 = true;
                        this.f31812 = this.f31817;
                        this.f31805.mo26286(this.f31823);
                        this.f31823 = null;
                        return false;
                    }
                    if (!this.f31808) {
                        this.f31808 = true;
                        this.f31823.m42270(134217728);
                    }
                    this.f31817 = this.f31823.f51910;
                    if (!mo13253()) {
                        this.f31812 = this.f31817;
                    } else {
                        this.f31812 = this.f31817;
                    }
                    this.f31823.m38025();
                    C16033 c16035 = this.f31823;
                    c16035.f51911 = this.f31816;
                    this.f31805.mo26286(c16035);
                    this.f31824 = true;
                    this.f31826.f42197++;
                    this.f31823 = null;
                    return true;
                }
                if (iM39515 == -3) {
                    if (mo13253()) {
                        this.f31812 = this.f31817;
                        return false;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13268() {
        return this.f31811 && this.f31801.mo19901();
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo13264() {
        if (this.f31801.mo19891()) {
            return true;
        }
        if (this.f31816 != null) {
            return m39519() || this.f31804 != null;
        }
        return false;
    }

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ᩴ */
    public final long mo6304() {
        if (getState() == 2) {
            m24107();
        }
        return this.f31803;
    }

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo6302() {
        boolean z = this.f31806;
        this.f31806 = false;
        return z;
    }

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ۙ */
    public final void mo6301(C21449 c21449) {
        this.f31801.mo19889(c21449);
    }

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ۨ */
    public final C21449 mo6303() {
        return this.f31801.mo19897();
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public final void mo13949(boolean z, boolean z2) {
        C12629 c12629 = new C12629();
        this.f31826 = c12629;
        this.f31821.m44235(c12629);
        boolean z3 = m39529().f18886;
        InterfaceC16449 interfaceC16449 = this.f31801;
        if (z3) {
            interfaceC16449.mo19895();
        } else {
            interfaceC16449.mo19902();
        }
        interfaceC16449.mo19886(m39514());
        interfaceC16449.mo19887(m39520());
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public final void mo13942(long j, boolean z) throws C2170 {
        this.f31801.flush();
        this.f31803 = j;
        this.f31818 = -9223372036854775807L;
        this.f31806 = false;
        this.f31825 = true;
        this.f31822 = false;
        this.f31811 = false;
        if (this.f31805 != null) {
            if (this.f31819 != 0) {
                m24101();
                m24098();
                return;
            }
            this.f31823 = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.f31804;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.mo8();
                this.f31804 = null;
            }
            InterfaceC10388 interfaceC10388 = this.f31805;
            interfaceC10388.getClass();
            interfaceC10388.flush();
            interfaceC10388.mo26288(m39528());
            this.f31824 = false;
        }
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۢ */
    public final void mo13956() {
        this.f31801.mo19894();
        this.f31800 = true;
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۗ */
    public final void mo13931() {
        m24107();
        this.f31801.pause();
        this.f31800 = false;
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۧ */
    public final void mo13958() {
        C19271 c19271 = this.f31821;
        this.f31816 = null;
        this.f31813 = true;
        m24102(-9223372036854775807L);
        this.f31806 = false;
        this.f31818 = -9223372036854775807L;
        try {
            C19084.m43862(this.f31809, (InterfaceC19790) null);
            this.f31809 = null;
            m24101();
            this.f31801.reset();
        } finally {
            c19271.m44231(this.f31826);
        }
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public final void mo13950(C7648[] c7648Arr, long j, long j2, C15274 c15274) {
        this.f31808 = false;
        if (this.f31827 == -9223372036854775807L) {
            m24102(j2);
            return;
        }
        int i = this.f31814;
        long[] jArr = this.f31802;
        if (i == jArr.length) {
            C0303.m1848("Too many stream changes, so dropping offset: " + jArr[this.f31814 - 1]);
        } else {
            this.f31814 = i + 1;
        }
        jArr[this.f31814 - 1] = j2;
    }

    @Override // l.AbstractC16862, l.InterfaceC23691
    /* JADX INFO: renamed from: ۙ */
    public final void mo13941(int i, Object obj) {
        InterfaceC16449 interfaceC16449 = this.f31801;
        if (i == 2) {
            interfaceC16449.mo19878(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            interfaceC16449.mo19883((C2708) obj);
            return;
        }
        if (i == 6) {
            interfaceC16449.mo19884((C5531) obj);
            return;
        }
        if (i == 12) {
            if (Build.VERSION.SDK_INT >= 23) {
                C14333.m34587(interfaceC16449, obj);
            }
        } else if (i == 9) {
            interfaceC16449.mo19890(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                return;
            }
            interfaceC16449.mo19879(((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    private void m24098() throws C2170 {
        if (this.f31805 != null) {
            return;
        }
        InterfaceC19790 interfaceC19790 = this.f31809;
        C19084.m43862(this.f31815, interfaceC19790);
        this.f31815 = interfaceC19790;
        if (interfaceC19790 != null && interfaceC19790.mo28385() == null && this.f31815.getError() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            InterfaceC10388 interfaceC10388Mo24113 = mo24113(this.f31816);
            this.f31805 = interfaceC10388Mo24113;
            ((AbstractC12505) interfaceC10388Mo24113).mo26288(m39528());
            Trace.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f31821.m44228(this.f31805.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.f31826.f42200++;
        } catch (OutOfMemoryError e) {
            throw m39516(e, this.f31816, OpenAuthTask.NOT_INSTALLED);
        } catch (C7565 e2) {
            C0303.m1854("Audio codec error", e2);
            this.f31821.m44226(e2);
            throw m39516(e2, this.f31816, OpenAuthTask.NOT_INSTALLED);
        }
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private void m24101() {
        this.f31823 = null;
        this.f31804 = null;
        this.f31819 = 0;
        this.f31824 = false;
        this.f31817 = -9223372036854775807L;
        this.f31812 = -9223372036854775807L;
        InterfaceC10388 interfaceC10388 = this.f31805;
        if (interfaceC10388 != null) {
            this.f31826.f42205++;
            interfaceC10388.mo14();
            this.f31821.m44227(this.f31805.getName());
            this.f31805 = null;
        }
        C19084.m43862(this.f31815, (InterfaceC19790) null);
        this.f31815 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24100(C12526 c12526) throws C2170 {
        C17567 c17567;
        C7648 c7648 = c12526.f41899;
        c7648.getClass();
        InterfaceC19790 interfaceC19790 = c12526.f41898;
        C19084.m43862(this.f31809, interfaceC19790);
        this.f31809 = interfaceC19790;
        C7648 c7649 = this.f31816;
        this.f31816 = c7648;
        this.f31820 = c7648.f25272;
        this.f31807 = c7648.f25254;
        InterfaceC10388 interfaceC10388 = this.f31805;
        C19271 c19271 = this.f31821;
        if (interfaceC10388 == null) {
            m24098();
            c19271.m44229(this.f31816, (C17567) null);
            return;
        }
        if (interfaceC19790 == this.f31815) {
            c17567 = new C17567(interfaceC10388.getName(), c7649, c7648, 0, 1);
        } else {
            c17567 = new C17567(interfaceC10388.getName(), c7649, c7648, 0, 128);
        }
        if (c17567.f55818 == 0) {
            if (this.f31824) {
                this.f31819 = 1;
            } else {
                m24101();
                m24098();
                this.f31813 = true;
            }
        }
        c19271.m44229(this.f31816, c17567);
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    private void m24107() {
        mo13268();
        long jMo19875 = this.f31801.mo19875();
        if (jMo19875 != Long.MIN_VALUE) {
            if (!this.f31825) {
                jMo19875 = Math.max(this.f31803, jMo19875);
            }
            this.f31803 = jMo19875;
            this.f31825 = false;
        }
    }
}
