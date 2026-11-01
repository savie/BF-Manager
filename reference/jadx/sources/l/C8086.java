package l;

import android.graphics.Bitmap;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.۠ۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08T5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8086 extends AbstractC16862 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28317;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f28318;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final C1029 f28319;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f28320;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f28321;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28322;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public long f28323;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C18669 f28324;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public C13025 f28325;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final C16033 f28326;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public C17963 f28327;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public C18669 f28328;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public C16033 f28329;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C7648 f28330;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public long f28331;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f28332;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28333;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15142 f28334;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28335;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f28336;

    @Override // l.InterfaceC4784, l.InterfaceC2667
    public final String getName() {
        return "ImageRenderer";
    }

    public C8086(C1029 c1029) {
        super(4);
        this.f28319 = c1029;
        this.f28334 = InterfaceC15142.f49474;
        this.f28326 = new C16033(0, 0);
        this.f28327 = C17963.f57454;
        this.f28332 = new ArrayDeque();
        this.f28331 = -9223372036854775807L;
        this.f28323 = -9223372036854775807L;
        this.f28320 = 0;
        this.f28336 = 1;
    }

    @Override // l.InterfaceC2667
    /* JADX INFO: renamed from: ۙ */
    public final int mo8212(C7648 c7648) {
        return this.f28319.m3873(c7648);
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public final void mo13260(long j, long j2) throws C2170 {
        if (this.f28333) {
            return;
        }
        if (this.f28330 == null) {
            C12526 c12526M39525 = m39525();
            C16033 c16033 = this.f28326;
            c16033.mo7();
            int iM39515 = m39515(c12526M39525, c16033, 2);
            if (iM39515 != -5) {
                if (iM39515 == -4) {
                    C2023.m6510(c16033.m42264());
                    this.f28322 = true;
                    this.f28333 = true;
                    return;
                }
                return;
            }
            C7648 c7648 = c12526M39525.f41899;
            C2023.m6508(c7648);
            this.f28330 = c7648;
            this.f28335 = true;
        }
        if (this.f28325 == null) {
            m21293();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (m21294(j)) {
            }
            while (m21292(j)) {
            }
            Trace.endSection();
        } catch (C6674 e) {
            throw m39516(e, (C7648) null, 4003);
        }
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo13264() {
        int i = this.f28336;
        if (i != 3) {
            return i == 0 && this.f28317;
        }
        return true;
    }

    @Override // l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13268() {
        return this.f28333;
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public final void mo13949(boolean z, boolean z2) {
        this.f28336 = z2 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo13950(l.C7648[] r5, long r6, long r8, l.C15274 r10) {
        /*
            r4 = this;
            l.ᩳۢۙ r5 = r4.f28327
            long r5 = r5.f57456
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L31
            java.util.ArrayDeque r5 = r4.f28332
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.f28331
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f28323
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 < 0) goto L26
            goto L31
        L26:
            l.ᩳۢۙ r6 = new l.ᩳۢۙ
            long r0 = r4.f28331
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            l.ᩳۢۙ r5 = new l.ᩳۢۙ
            r5.<init>(r0, r8)
            r4.f28327 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8086.mo13950(l.۟ᩴۙ[], long, long, l.ܶܰܰ):void");
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۧ */
    public final void mo13958() {
        this.f28330 = null;
        this.f28327 = C17963.f57454;
        this.f28332.clear();
        m21295();
        this.f28334.mo36309();
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ֫ */
    public final void mo13928() {
        m21295();
        this.f28336 = Math.min(this.f28336, 1);
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ᩻ */
    public final void mo13967() {
        m21295();
    }

    @Override // l.AbstractC16862, l.InterfaceC23691
    /* JADX INFO: renamed from: ۙ */
    public final void mo13941(int i, Object obj) {
        if (i != 15) {
            return;
        }
        InterfaceC15142 interfaceC15142 = obj instanceof InterfaceC15142 ? (InterfaceC15142) obj : null;
        if (interfaceC15142 == null) {
            interfaceC15142 = InterfaceC15142.f49474;
        }
        this.f28334 = interfaceC15142;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:73:0x0117  */
    /* JADX WARN: Code duplicated, block: B:81:0x0142  */
    /* JADX WARN: Code duplicated, block: B:83:0x015e  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m21294(long j) throws C2170 {
        boolean z;
        Bitmap bitmapM43154;
        long jM43151;
        boolean z2;
        int i;
        boolean z3;
        int iM43153;
        int i2;
        C7648 c7648;
        C18669 c18669;
        Bitmap bitmapCreateBitmap;
        if ((this.f28321 == null || this.f28328 != null) && (this.f28336 != 0 || getState() == 2)) {
            Bitmap bitmap = this.f28321;
            ArrayDeque arrayDeque = this.f28332;
            if (bitmap == null) {
                C2023.m6508(this.f28325);
                AbstractC21491 abstractC21491 = (AbstractC21491) this.f28325.mo21899();
                if (abstractC21491 != null) {
                    if (abstractC21491.m42264()) {
                        if (this.f28320 == 3) {
                            m21295();
                            C2023.m6508(this.f28330);
                            m21293();
                            return false;
                        }
                        abstractC21491.mo8();
                        if (arrayDeque.isEmpty()) {
                            this.f28333 = true;
                            return false;
                        }
                    } else {
                        Bitmap bitmap2 = abstractC21491.f69840;
                        if (bitmap2 == null) {
                            throw new IllegalStateException("Non-EOS buffer came back from the decoder without bitmap.");
                        }
                        this.f28321 = bitmap2;
                        abstractC21491.mo8();
                        if (this.f28317 && this.f28321 != null && this.f28328 != null) {
                            C2023.m6508(this.f28330);
                            C7648 c7649 = this.f28330;
                            int i3 = c7649.f25240;
                            int i4 = c7649.f25263;
                            z = ((i3 != 1 && i4 == 1) || i3 == -1 || i4 == -1) ? false : true;
                            if (!this.f28328.m43150()) {
                                c18669 = this.f28328;
                                if (z) {
                                    int iM43154 = c18669.m43153();
                                    C2023.m6508(this.f28321);
                                    int width = this.f28321.getWidth();
                                    C7648 c76410 = this.f28330;
                                    C2023.m6508(c76410);
                                    int i5 = width / c76410.f25240;
                                    int height = this.f28321.getHeight();
                                    C7648 c76411 = this.f28330;
                                    C2023.m6508(c76411);
                                    int i6 = height / c76411.f25263;
                                    int i7 = this.f28330.f25240;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.f28321, (iM43154 % i7) * i5, (iM43154 / i7) * i6, i5, i6);
                                } else {
                                    bitmapCreateBitmap = this.f28321;
                                    C2023.m6508(bitmapCreateBitmap);
                                }
                                c18669.m43152(bitmapCreateBitmap);
                            }
                            bitmapM43154 = this.f28328.m43154();
                            C2023.m6508(bitmapM43154);
                            jM43151 = this.f28328.m43151();
                            long j2 = jM43151 - j;
                            if (getState() == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = this.f28336;
                            if (i != 0) {
                                if (i != 1) {
                                    z2 = true;
                                } else {
                                    if (i == 3) {
                                        throw new IllegalStateException();
                                    }
                                    z2 = false;
                                }
                            }
                            if (!z2 || j2 < 30000) {
                                this.f28334.mo36310(jM43151 - this.f28327.f57456, bitmapM43154);
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                C18669 c186610 = this.f28328;
                                C2023.m6508(c186610);
                                long jM43152 = c186610.m43151();
                                this.f28323 = jM43152;
                                while (!arrayDeque.isEmpty() && jM43152 >= ((C17963) arrayDeque.peek()).f57455) {
                                    this.f28327 = (C17963) arrayDeque.removeFirst();
                                }
                                this.f28336 = 3;
                                if (z) {
                                    C18669 c186611 = this.f28328;
                                    C2023.m6508(c186611);
                                    iM43153 = c186611.m43153();
                                    C7648 c76412 = this.f28330;
                                    C2023.m6508(c76412);
                                    i2 = c76412.f25263;
                                    c7648 = this.f28330;
                                    C2023.m6508(c7648);
                                    if (iM43153 == (i2 * c7648.f25240) - 1) {
                                        this.f28321 = null;
                                    }
                                } else {
                                    this.f28321 = null;
                                }
                                this.f28328 = this.f28324;
                                this.f28324 = null;
                                return true;
                            }
                        }
                    }
                }
            } else if (this.f28317) {
                C2023.m6508(this.f28330);
                C7648 c76413 = this.f28330;
                int i8 = c76413.f25240;
                int i9 = c76413.f25263;
                if (i8 != 1) {
                }
                if (!this.f28328.m43150()) {
                    c18669 = this.f28328;
                    if (z) {
                        int iM43155 = c18669.m43153();
                        C2023.m6508(this.f28321);
                        int width2 = this.f28321.getWidth();
                        C7648 c76414 = this.f28330;
                        C2023.m6508(c76414);
                        int i10 = width2 / c76414.f25240;
                        int height2 = this.f28321.getHeight();
                        C7648 c76415 = this.f28330;
                        C2023.m6508(c76415);
                        int i11 = height2 / c76415.f25263;
                        int i12 = this.f28330.f25240;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.f28321, (iM43155 % i12) * i10, (iM43155 / i12) * i11, i10, i11);
                    } else {
                        bitmapCreateBitmap = this.f28321;
                        C2023.m6508(bitmapCreateBitmap);
                    }
                    c18669.m43152(bitmapCreateBitmap);
                }
                bitmapM43154 = this.f28328.m43154();
                C2023.m6508(bitmapM43154);
                jM43151 = this.f28328.m43151();
                long j3 = jM43151 - j;
                if (getState() == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = this.f28336;
                if (i != 0) {
                    if (i != 1) {
                        z2 = true;
                    } else {
                        if (i == 3) {
                            throw new IllegalStateException();
                        }
                        z2 = false;
                    }
                }
                if (z2) {
                    this.f28334.mo36310(jM43151 - this.f28327.f57456, bitmapM43154);
                    z3 = true;
                } else {
                    this.f28334.mo36310(jM43151 - this.f28327.f57456, bitmapM43154);
                    z3 = true;
                }
                if (z3) {
                    C18669 c186612 = this.f28328;
                    C2023.m6508(c186612);
                    long jM43153 = c186612.m43151();
                    this.f28323 = jM43153;
                    while (!arrayDeque.isEmpty()) {
                        this.f28327 = (C17963) arrayDeque.removeFirst();
                    }
                    this.f28336 = 3;
                    if (z) {
                        C18669 c186613 = this.f28328;
                        C2023.m6508(c186613);
                        iM43153 = c186613.m43153();
                        C7648 c76416 = this.f28330;
                        C2023.m6508(c76416);
                        i2 = c76416.f25263;
                        c7648 = this.f28330;
                        C2023.m6508(c7648);
                        if (iM43153 == (i2 * c7648.f25240) - 1) {
                            this.f28321 = null;
                        }
                    } else {
                        this.f28321 = null;
                    }
                    this.f28328 = this.f28324;
                    this.f28324 = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0113  */
    /* JADX WARN: Code duplicated, block: B:75:0x011d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0125  */
    /* JADX WARN: Code duplicated, block: B:83:0x0136  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x014c  */
    /* JADX WARN: Code duplicated, block: B:88:0x014f  */
    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m21292(long j) {
        int iM39515;
        ByteBuffer byteBuffer;
        C16033 c16033;
        boolean z;
        C16033 c16034;
        C18669 c18669;
        long jM43151;
        boolean z2;
        C18669 c186610;
        boolean z3;
        C7648 c7648;
        boolean z4;
        boolean z5;
        C16033 c16035;
        if (!this.f28317 || this.f28328 == null) {
            C12526 c12526M39525 = m39525();
            C13025 c13025 = this.f28325;
            if (c13025 != null && this.f28320 != 3 && !this.f28322) {
                if (this.f28329 == null) {
                    C16033 c16036 = (C16033) c13025.mo26287();
                    this.f28329 = c16036;
                    if (c16036 != null) {
                        if (this.f28320 == 2) {
                            C2023.m6508(this.f28329);
                            this.f28329.m42267(4);
                            C13025 c13026 = this.f28325;
                            C2023.m6508(c13026);
                            c13026.m11173(this.f28329);
                            this.f28329 = null;
                            this.f28320 = 3;
                            return false;
                        }
                        iM39515 = m39515(c12526M39525, this.f28329, 0);
                        if (iM39515 != -5) {
                            C7648 c7649 = c12526M39525.f41899;
                            C2023.m6508(c7649);
                            this.f28330 = c7649;
                            this.f28335 = true;
                            this.f28320 = 2;
                            return true;
                        }
                        if (iM39515 != -4) {
                            this.f28329.m38025();
                            byteBuffer = this.f28329.f51912;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                c16033 = this.f28329;
                                C2023.m6508(c16033);
                                if (c16033.m42264()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                C16033 c16037 = this.f28329;
                                C2023.m6508(c16037);
                                c16037.f51911 = this.f28330;
                                C13025 c13027 = this.f28325;
                                C2023.m6508(c13027);
                                C16033 c16038 = this.f28329;
                                C2023.m6508(c16038);
                                c13027.m11173(c16038);
                                this.f28318 = 0;
                            }
                            c16034 = this.f28329;
                            C2023.m6508(c16034);
                            if (c16034.m42264()) {
                                this.f28317 = true;
                            } else {
                                int i = this.f28318;
                                c18669 = new C18669(i, c16034.f51910);
                                this.f28324 = c18669;
                                this.f28318 = i + 1;
                                if (!this.f28317) {
                                    jM43151 = c18669.m43151();
                                    if (jM43151 - 30000 <= j || j > 30000 + jM43151) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    c186610 = this.f28328;
                                    if (c186610 != null || c186610.m43151() > j || j >= jM43151) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    C18669 c186611 = this.f28324;
                                    C2023.m6508(c186611);
                                    c7648 = this.f28330;
                                    C2023.m6508(c7648);
                                    if (c7648.f25240 != -1 || this.f28330.f25263 == -1) {
                                        z4 = true;
                                    } else {
                                        int iM43153 = c186611.m43153();
                                        C7648 c76410 = this.f28330;
                                        C2023.m6508(c76410);
                                        if (iM43153 == (c76410.f25263 * this.f28330.f25240) - 1) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                    if (!z2 || z3 || z4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    this.f28317 = z5;
                                    if (z3 || z2) {
                                        this.f28328 = this.f28324;
                                        this.f28324 = null;
                                    }
                                } else {
                                    this.f28328 = this.f28324;
                                    this.f28324 = null;
                                }
                            }
                            c16035 = this.f28329;
                            C2023.m6508(c16035);
                            if (c16035.m42264()) {
                                this.f28322 = true;
                                this.f28329 = null;
                                return false;
                            }
                            long j2 = this.f28331;
                            C16033 c16039 = this.f28329;
                            C2023.m6508(c16039);
                            this.f28331 = Math.max(j2, c16039.f51910);
                            if (z) {
                                this.f28329 = null;
                            } else {
                                C16033 c160310 = this.f28329;
                                C2023.m6508(c160310);
                                c160310.mo7();
                            }
                            return !this.f28317;
                        }
                        if (iM39515 != -3) {
                            throw new IllegalStateException();
                        }
                    }
                } else {
                    if (this.f28320 == 2) {
                        C2023.m6508(this.f28329);
                        this.f28329.m42267(4);
                        C13025 c13028 = this.f28325;
                        C2023.m6508(c13028);
                        c13028.m11173(this.f28329);
                        this.f28329 = null;
                        this.f28320 = 3;
                        return false;
                    }
                    iM39515 = m39515(c12526M39525, this.f28329, 0);
                    if (iM39515 != -5) {
                        C7648 c76411 = c12526M39525.f41899;
                        C2023.m6508(c76411);
                        this.f28330 = c76411;
                        this.f28335 = true;
                        this.f28320 = 2;
                        return true;
                    }
                    if (iM39515 != -4) {
                        this.f28329.m38025();
                        byteBuffer = this.f28329.f51912;
                        if (byteBuffer != null) {
                            c16033 = this.f28329;
                            C2023.m6508(c16033);
                            if (c16033.m42264()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            c16033 = this.f28329;
                            C2023.m6508(c16033);
                            if (c16033.m42264()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            C16033 c160311 = this.f28329;
                            C2023.m6508(c160311);
                            c160311.f51911 = this.f28330;
                            C13025 c13029 = this.f28325;
                            C2023.m6508(c13029);
                            C16033 c160312 = this.f28329;
                            C2023.m6508(c160312);
                            c13029.m11173(c160312);
                            this.f28318 = 0;
                        }
                        c16034 = this.f28329;
                        C2023.m6508(c16034);
                        if (c16034.m42264()) {
                            this.f28317 = true;
                        } else {
                            int i2 = this.f28318;
                            c18669 = new C18669(i2, c16034.f51910);
                            this.f28324 = c18669;
                            this.f28318 = i2 + 1;
                            if (!this.f28317) {
                                jM43151 = c18669.m43151();
                                if (jM43151 - 30000 <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                c186610 = this.f28328;
                                if (c186610 != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                C18669 c186612 = this.f28324;
                                C2023.m6508(c186612);
                                c7648 = this.f28330;
                                C2023.m6508(c7648);
                                if (c7648.f25240 != -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                this.f28317 = z5;
                                if (z3) {
                                    this.f28328 = this.f28324;
                                    this.f28324 = null;
                                } else {
                                    this.f28328 = this.f28324;
                                    this.f28324 = null;
                                }
                            } else {
                                this.f28328 = this.f28324;
                                this.f28324 = null;
                            }
                        }
                        c16035 = this.f28329;
                        C2023.m6508(c16035);
                        if (c16035.m42264()) {
                            this.f28322 = true;
                            this.f28329 = null;
                            return false;
                        }
                        long j3 = this.f28331;
                        C16033 c160313 = this.f28329;
                        C2023.m6508(c160313);
                        this.f28331 = Math.max(j3, c160313.f51910);
                        if (z) {
                            this.f28329 = null;
                        } else {
                            C16033 c160314 = this.f28329;
                            C2023.m6508(c160314);
                            c160314.mo7();
                        }
                        return !this.f28317;
                    }
                    if (iM39515 != -3) {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    private void m21293() throws C2170 {
        if (this.f28335) {
            C7648 c7648 = this.f28330;
            c7648.getClass();
            C1029 c1029 = this.f28319;
            int iM3873 = c1029.m3873(c7648);
            if (iM3873 == C13958.m33811(4, 0, 0, 0) || iM3873 == C13958.m33811(3, 0, 0, 0)) {
                C13025 c13025 = this.f28325;
                if (c13025 != null) {
                    c13025.mo14();
                }
                this.f28325 = c1029.m3874();
                this.f28335 = false;
                return;
            }
            throw m39516(new C6674("Provided decoder factory can't create decoder for format."), this.f28330, 4005);
        }
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public final void mo13942(long j, boolean z) {
        this.f28336 = Math.min(this.f28336, 1);
        this.f28333 = false;
        this.f28322 = false;
        this.f28321 = null;
        this.f28328 = null;
        this.f28324 = null;
        this.f28317 = false;
        this.f28329 = null;
        C13025 c13025 = this.f28325;
        if (c13025 != null) {
            c13025.flush();
        }
        this.f28332.clear();
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    private void m21295() {
        this.f28329 = null;
        this.f28320 = 0;
        this.f28331 = -9223372036854775807L;
        C13025 c13025 = this.f28325;
        if (c13025 != null) {
            c13025.mo14();
            this.f28325 = null;
        }
    }
}
