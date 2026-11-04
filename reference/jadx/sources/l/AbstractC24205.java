package l;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.᩺ۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8FI */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC24205 extends AbstractC25280 implements InterfaceC11986 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public long f78408;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f78409;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public long f78410;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f78411;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f78412;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public C5690 f78413;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f78414;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C5690 f78415;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10756 f78416;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public long f78417;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f78418;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public long f78419;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public SimpleDecoderOutputBuffer f78420;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19860 f78421;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f78422;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16745 f78423;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C15648 f78424;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f78425;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f78426;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10756 f78427;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f78428;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean f78429;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public long f78430;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C22713 f78431;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean f78432;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f78433;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f78434;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public C17074 f78435;

    /* JADX INFO: renamed from: ۙ */
    public abstract C15648 mo11269(InterfaceC19860 interfaceC19860);

    @Override // l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC11986 mo12947() {
        return this;
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract int mo11270(C15648 c15648);

    /* JADX INFO: renamed from: ᩷ */
    public abstract InterfaceC19860 mo11271(C15648 c15648);

    public AbstractC24205(Handler handler, InterfaceC19729 interfaceC19729, InterfaceC16745 interfaceC16745) {
        super(1);
        this.f78431 = new C22713(handler, interfaceC19729);
        this.f78423 = interfaceC16745;
        interfaceC16745.mo36077(new C6305(this));
        this.f78415 = new C5690(0, 0);
        this.f78426 = 0;
        this.f78414 = true;
        m54183(-9223372036854775807L);
        this.f78418 = new long[10];
        this.f78408 = -9223372036854775807L;
        this.f78417 = -9223372036854775807L;
        this.f78430 = -9223372036854775807L;
    }

    @Override // l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ᩷ */
    public final long mo12954(long j, long j2) {
        boolean z = this.f78430 != -9223372036854775807L;
        if (!this.f78429) {
            if (z || this.f78409) {
                return 1000000L;
            }
        } else {
            InterfaceC16745 interfaceC16745 = this.f78423;
            long jMo36098 = interfaceC16745.mo36098();
            if (z && jMo36098 != -9223372036854775807L) {
                return Math.max(10000L, ((long) ((Math.min(jMo36098, this.f78430 - j) / (interfaceC16745.mo36089() != null ? interfaceC16745.mo36089().f24500 : 1.0f)) / 2.0f)) - (C7116.m19474(m56455().mo2210()) - j2));
            }
        }
        return 10000L;
    }

    @Override // l.InterfaceC18172
    /* JADX INFO: renamed from: ۙ */
    public final int mo11185(C15648 c15648) {
        if (!C9681.m25258(c15648.f50848)) {
            return C14442.m34863(0, 0, 0, 0);
        }
        int iMo11270 = mo11270(c15648);
        return iMo11270 <= 2 ? C14442.m34863(iMo11270, 0, 0, 0) : iMo11270 | 168;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m54193(C15648 c15648) {
        return this.f78423.mo36087(c15648);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m54192(C15648 c15648) {
        return this.f78423.mo36095(c15648);
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public final void mo11186(long j, long j2) throws C18566 {
        if (this.f78409) {
            try {
                this.f78423.mo36088();
                this.f78430 = this.f78417;
                return;
            } catch (C24951 e) {
                throw m56445(e, e.f80781, e.f80780, 5002);
            }
        }
        if (this.f78424 == null) {
            C16461 c16461M56450 = m56450();
            this.f78415.mo7();
            int iM56443 = m56443(c16461M56450, this.f78415, 2);
            if (iM56443 != -5) {
                if (iM56443 == -4) {
                    C20782.m47568(this.f78415.m33305());
                    this.f78432 = true;
                    try {
                        this.f78409 = true;
                        this.f78423.mo36088();
                        this.f78430 = this.f78417;
                        return;
                    } catch (C24951 e2) {
                        throw m56444(e2, (C15648) null, 5002);
                    }
                }
                return;
            }
            m54182(c16461M56450);
        }
        m54190();
        if (this.f78421 != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (m54189()) {
                }
                while (m54185()) {
                }
                Trace.endSection();
                synchronized (this.f78435) {
                }
            } catch (C5559 e3) {
                throw m56445(e3, e3.f19304, e3.f19303, 5001);
            } catch (C13016 e4) {
                throw m56444(e4, e4.f41684, 5001);
            } catch (C15384 e5) {
                C1896.m6516("Audio codec error", e5);
                this.f78431.m51211(e5);
                throw m56444(e5, this.f78424, 4003);
            } catch (C24951 e6) {
                throw m56445(e6, e6.f80781, e6.f80780, 5002);
            }
        }
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m54191() {
        this.f78425 = true;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    private boolean m54189() throws C18566 {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.f78420;
        InterfaceC16745 interfaceC16745 = this.f78423;
        if (simpleDecoderOutputBuffer == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = (SimpleDecoderOutputBuffer) this.f78421.mo28187();
            this.f78420 = simpleDecoderOutputBuffer2;
            if (simpleDecoderOutputBuffer2 == null) {
                return false;
            }
            int i = simpleDecoderOutputBuffer2.f37778;
            if (i > 0) {
                this.f78435.f55748 += i;
                interfaceC16745.mo36071();
            }
            if (this.f78420.m33303()) {
                interfaceC16745.mo36071();
                if (this.f78411 != 0) {
                    long[] jArr = this.f78418;
                    m54183(jArr[0]);
                    int i2 = this.f78411 - 1;
                    this.f78411 = i2;
                    System.arraycopy(jArr, 1, jArr, 0, i2);
                }
            }
        }
        if (this.f78420.m33305()) {
            if (this.f78426 == 2) {
                m54187();
                m54190();
                this.f78414 = true;
                return false;
            }
            this.f78420.mo8();
            this.f78420 = null;
            try {
                this.f78409 = true;
                interfaceC16745.mo36088();
                this.f78430 = this.f78417;
                return false;
            } catch (C24951 e) {
                throw m56445(e, e.f80781, e.f80780, 5002);
            }
        }
        this.f78430 = -9223372036854775807L;
        if (this.f78414) {
            C20124 c20124M37397 = mo11269(this.f78421).m37397();
            c20124M37397.m46292(this.f78433);
            c20124M37397.m46310(this.f78412);
            c20124M37397.m46303(this.f78424.f50812);
            c20124M37397.m46299(this.f78424.f50853);
            c20124M37397.m46309(this.f78424.f50817);
            c20124M37397.m46330(this.f78424.f50846);
            c20124M37397.m46328(this.f78424.f50841);
            c20124M37397.m46321(this.f78424.f50811);
            c20124M37397.m46294(this.f78424.f50850);
            c20124M37397.m46311(this.f78424.f50834);
            interfaceC16745.mo36081(c20124M37397.m46295(), null);
            this.f78414 = false;
        }
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer3 = this.f78420;
        if (interfaceC16745.mo36086(1, simpleDecoderOutputBuffer3.f37777, simpleDecoderOutputBuffer3.f0)) {
            this.f78435.f55746++;
            this.f78420.mo8();
            this.f78420 = null;
            return true;
        }
        this.f78430 = this.f78420.f37777;
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m54183(long j) {
        this.f78419 = j;
        if (j != -9223372036854775807L) {
            this.f78423.getClass();
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
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    private boolean m54185() throws C18566 {
        C16461 c16461M56450;
        int iM56443;
        InterfaceC19860 interfaceC19860 = this.f78421;
        if (interfaceC19860 != null && this.f78426 != 2 && !this.f78432) {
            if (this.f78413 == null) {
                C5690 c5690 = (C5690) interfaceC19860.mo39837();
                this.f78413 = c5690;
                if (c5690 != null) {
                    if (this.f78426 == 1) {
                        this.f78413.m33307(4);
                        this.f78421.mo39834(this.f78413);
                        this.f78413 = null;
                        this.f78426 = 2;
                        return false;
                    }
                    c16461M56450 = m56450();
                    iM56443 = m56443(c16461M56450, this.f78413, 0);
                    if (iM56443 != -5) {
                        m54182(c16461M56450);
                        return true;
                    }
                    if (iM56443 != -4) {
                        if (this.f78413.m33305()) {
                            this.f78432 = true;
                            this.f78417 = this.f78408;
                            this.f78421.mo39834(this.f78413);
                            this.f78413 = null;
                            return false;
                        }
                        if (!this.f78422) {
                            this.f78422 = true;
                            this.f78413.m33309(134217728);
                        }
                        this.f78408 = this.f78413.f19652;
                        if (!mo12948() || this.f78413.m33311()) {
                            this.f78417 = this.f78408;
                        }
                        this.f78413.m16713();
                        C5690 c5691 = this.f78413;
                        c5691.f19653 = this.f78424;
                        this.f78421.mo39834(c5691);
                        this.f78428 = true;
                        this.f78435.f55749++;
                        this.f78413 = null;
                        return true;
                    }
                    if (iM56443 == -3) {
                        if (mo12948()) {
                            this.f78417 = this.f78408;
                            return false;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                if (this.f78426 == 1) {
                    this.f78413.m33307(4);
                    this.f78421.mo39834(this.f78413);
                    this.f78413 = null;
                    this.f78426 = 2;
                    return false;
                }
                c16461M56450 = m56450();
                iM56443 = m56443(c16461M56450, this.f78413, 0);
                if (iM56443 != -5) {
                    m54182(c16461M56450);
                    return true;
                }
                if (iM56443 != -4) {
                    if (this.f78413.m33305()) {
                        this.f78432 = true;
                        this.f78417 = this.f78408;
                        this.f78421.mo39834(this.f78413);
                        this.f78413 = null;
                        return false;
                    }
                    if (!this.f78422) {
                        this.f78422 = true;
                        this.f78413.m33309(134217728);
                    }
                    this.f78408 = this.f78413.f19652;
                    if (!mo12948()) {
                        this.f78417 = this.f78408;
                    } else {
                        this.f78417 = this.f78408;
                    }
                    this.f78413.m16713();
                    C5690 c5692 = this.f78413;
                    c5692.f19653 = this.f78424;
                    this.f78421.mo39834(c5692);
                    this.f78428 = true;
                    this.f78435.f55749++;
                    this.f78413 = null;
                    return true;
                }
                if (iM56443 == -3) {
                    if (mo12948()) {
                        this.f78417 = this.f78408;
                        return false;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo11190() {
        return this.f78409 && this.f78423.mo36097();
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo11189() {
        if (this.f78423.mo36085()) {
            return true;
        }
        if (this.f78424 != null) {
            return m56449() || this.f78420 != null;
        }
        return false;
    }

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ᩹ */
    public final long mo8400() {
        if (getState() == 2) {
            m54186();
        }
        return this.f78410;
    }

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8398() {
        boolean z = this.f78434;
        this.f78434 = false;
        return z;
    }

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ۙ */
    public final void mo8396(C7445 c7445) {
        this.f78423.mo36078(c7445);
    }

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ۤ */
    public final C7445 mo8397() {
        return this.f78423.mo36089();
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo22678(boolean z, boolean z2) {
        C17074 c17074 = new C17074();
        this.f78435 = c17074;
        this.f78431.m51220(c17074);
        boolean z3 = m56442().f1571;
        InterfaceC16745 interfaceC16745 = this.f78423;
        if (z3) {
            interfaceC16745.mo36091();
        } else {
            interfaceC16745.mo36093();
        }
        interfaceC16745.mo36083(m56451());
        interfaceC16745.mo36080(m56455());
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo11187(long j, boolean z) throws C18566 {
        this.f78423.flush();
        this.f78410 = j;
        this.f78430 = -9223372036854775807L;
        this.f78434 = false;
        this.f78425 = true;
        this.f78432 = false;
        this.f78409 = false;
        if (this.f78421 != null) {
            if (this.f78426 != 0) {
                m54187();
                m54190();
                return;
            }
            this.f78413 = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.f78420;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.mo8();
                this.f78420 = null;
            }
            InterfaceC19860 interfaceC19860 = this.f78421;
            interfaceC19860.getClass();
            interfaceC19860.flush();
            interfaceC19860.mo39839(m56453());
            this.f78428 = false;
        }
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۜ */
    public final void mo45800() {
        this.f78423.mo36094();
        this.f78429 = true;
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۬ */
    public final void mo45801() {
        m54186();
        this.f78423.pause();
        this.f78429 = false;
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ֨ */
    public final void mo11184() {
        C22713 c22713 = this.f78431;
        this.f78424 = null;
        this.f78414 = true;
        m54183(-9223372036854775807L);
        this.f78434 = false;
        this.f78430 = -9223372036854775807L;
        try {
            C4791.m14767(this.f78416, (InterfaceC10756) null);
            this.f78416 = null;
            m54187();
            this.f78423.reset();
        } finally {
            c22713.m51216(this.f78435);
        }
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo11188(C15648[] c15648Arr, long j, long j2, C8402 c8402) {
        this.f78422 = false;
        if (this.f78419 == -9223372036854775807L) {
            m54183(j2);
            return;
        }
        int i = this.f78411;
        long[] jArr = this.f78418;
        if (i == jArr.length) {
            C1896.m6517("Too many stream changes, so dropping offset: " + jArr[this.f78411 - 1]);
        } else {
            this.f78411 = i + 1;
        }
        jArr[this.f78411 - 1] = j2;
    }

    @Override // l.AbstractC25280, l.InterfaceC3256
    /* JADX INFO: renamed from: ۙ */
    public final void mo10630(int i, Object obj) {
        InterfaceC16745 interfaceC16745 = this.f78423;
        if (i == 2) {
            interfaceC16745.mo36072(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            interfaceC16745.mo36082((C18412) obj);
            return;
        }
        if (i == 6) {
            interfaceC16745.mo36076((C0513) obj);
            return;
        }
        if (i == 12) {
            if (Build.VERSION.SDK_INT >= 23) {
                C12270.m30650(interfaceC16745, obj);
            }
        } else if (i == 9) {
            interfaceC16745.mo36084(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                return;
            }
            interfaceC16745.mo36073(((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    private void m54190() throws C18566 {
        if (this.f78421 != null) {
            return;
        }
        InterfaceC10756 interfaceC10756 = this.f78416;
        C4791.m14767(this.f78427, interfaceC10756);
        this.f78427 = interfaceC10756;
        if (interfaceC10756 != null && interfaceC10756.mo27414() == null && this.f78427.getError() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            InterfaceC19860 interfaceC19860Mo11271 = mo11271(this.f78424);
            this.f78421 = interfaceC19860Mo11271;
            ((AbstractC16876) interfaceC19860Mo11271).mo39839(m56453());
            Trace.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f78431.m51213(this.f78421.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.f78435.f55745++;
        } catch (OutOfMemoryError e) {
            throw m56444(e, this.f78424, OpenAuthTask.NOT_INSTALLED);
        } catch (C15384 e2) {
            C1896.m6516("Audio codec error", e2);
            this.f78431.m51211(e2);
            throw m56444(e2, this.f78424, OpenAuthTask.NOT_INSTALLED);
        }
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    private void m54187() {
        this.f78413 = null;
        this.f78420 = null;
        this.f78426 = 0;
        this.f78428 = false;
        this.f78408 = -9223372036854775807L;
        this.f78417 = -9223372036854775807L;
        InterfaceC19860 interfaceC19860 = this.f78421;
        if (interfaceC19860 != null) {
            this.f78435.f55753++;
            interfaceC19860.mo12();
            this.f78431.m51212(this.f78421.getName());
            this.f78421 = null;
        }
        C4791.m14767(this.f78427, (InterfaceC10756) null);
        this.f78427 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54182(C16461 c16461) throws C18566 {
        C17820 c17820;
        C15648 c15648 = c16461.f53378;
        c15648.getClass();
        InterfaceC10756 interfaceC10756 = c16461.f53377;
        C4791.m14767(this.f78416, interfaceC10756);
        this.f78416 = interfaceC10756;
        C15648 c15649 = this.f78424;
        this.f78424 = c15648;
        this.f78433 = c15648.f50851;
        this.f78412 = c15648.f50816;
        InterfaceC19860 interfaceC19860 = this.f78421;
        C22713 c22713 = this.f78431;
        if (interfaceC19860 == null) {
            m54190();
            c22713.m51215(this.f78424, (C17820) null);
            return;
        }
        if (interfaceC10756 == this.f78427) {
            c17820 = new C17820(interfaceC19860.getName(), c15649, c15648, 0, 1);
        } else {
            c17820 = new C17820(interfaceC19860.getName(), c15649, c15648, 0, 128);
        }
        if (c17820.f58465 == 0) {
            if (this.f78428) {
                this.f78426 = 1;
            } else {
                m54187();
                m54190();
                this.f78414 = true;
            }
        }
        c22713.m51215(this.f78424, c17820);
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    private void m54186() {
        mo11190();
        long jMo36092 = this.f78423.mo36092();
        if (jMo36092 != Long.MIN_VALUE) {
            if (!this.f78425) {
                jMo36092 = Math.max(this.f78410, jMo36092);
            }
            this.f78410 = jMo36092;
            this.f78425 = false;
        }
    }
}
