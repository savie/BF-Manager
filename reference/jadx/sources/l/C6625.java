package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۛ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 68HB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6625 implements InterfaceC22792 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f22124;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f22125;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6867 f22126;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f22127;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f22129;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C1150 f22131;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f22132;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f22133;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f22134;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f22135;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14573 f22130 = new C14573(new byte[10], 10);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f22128 = 0;

    public C6625(InterfaceC6867 interfaceC6867) {
        this.f22126 = interfaceC6867;
    }

    @Override // l.InterfaceC22792
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18563(C1150 c1150, InterfaceC12789 interfaceC12789, C10857 c10857) {
        this.f22131 = c1150;
        this.f22126.mo1351(interfaceC12789, c10857);
    }

    @Override // l.InterfaceC22792
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18561() {
        this.f22128 = 0;
        this.f22125 = 0;
        this.f22124 = false;
        this.f22126.mo1349();
    }

    @Override // l.InterfaceC22792
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18562(int i, C21287 c21287) {
        C20782.m47566(this.f22131);
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        InterfaceC6867 interfaceC6867 = this.f22126;
        if (i2 != 0) {
            int i5 = this.f22128;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    C1896.m6517("Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f22132 != -1) {
                        C1896.m6517("Unexpected start indicator: expected " + this.f22132 + " more bytes");
                    }
                    interfaceC6867.mo1353(c21287.m48509() == 0);
                }
            }
            this.f22128 = 1;
            this.f22125 = 0;
        }
        while (c21287.m48486() > 0) {
            int i6 = this.f22128;
            if (i6 != 0) {
                C14573 c14573 = this.f22130;
                if (i6 != 1) {
                    if (i6 == i4) {
                        if (m18559(c21287, c14573.f45926, Math.min(10, this.f22134)) && m18559(c21287, (byte[]) null, this.f22134)) {
                            c14573.m35167(0);
                            this.f22135 = -9223372036854775807L;
                            if (this.f22129) {
                                c14573.m35161(4);
                                long jM35163 = ((long) c14573.m35163(3)) << 30;
                                c14573.m35161(1);
                                long jM35164 = jM35163 | ((long) (c14573.m35163(15) << 15));
                                c14573.m35161(1);
                                long jM35165 = jM35164 | ((long) c14573.m35163(15));
                                c14573.m35161(1);
                                if (!this.f22124 && this.f22127) {
                                    c14573.m35161(4);
                                    long jM35166 = ((long) c14573.m35163(3)) << 30;
                                    c14573.m35161(1);
                                    long jM35167 = jM35166 | ((long) (c14573.m35163(15) << 15));
                                    c14573.m35161(1);
                                    long jM35168 = jM35167 | ((long) c14573.m35163(15));
                                    c14573.m35161(1);
                                    this.f22131.m4249(jM35168);
                                    this.f22124 = true;
                                }
                                this.f22135 = this.f22131.m4249(jM35165);
                            }
                            i |= this.f22133 ? 4 : 0;
                            interfaceC6867.mo1350(i, this.f22135);
                            this.f22128 = 3;
                            this.f22125 = 0;
                        }
                    } else {
                        if (i6 != 3) {
                            throw new IllegalStateException();
                        }
                        int iM48486 = c21287.m48486();
                        int i7 = this.f22132;
                        int i8 = i7 == i3 ? 0 : iM48486 - i7;
                        if (i8 > 0) {
                            iM48486 -= i8;
                            c21287.m48517(c21287.m48516() + iM48486);
                        }
                        interfaceC6867.mo1352(c21287);
                        int i9 = this.f22132;
                        if (i9 != i3) {
                            int i10 = i9 - iM48486;
                            this.f22132 = i10;
                            if (i10 == 0) {
                                interfaceC6867.mo1353(false);
                                this.f22128 = 1;
                                this.f22125 = 0;
                            }
                        }
                    }
                } else if (m18559(c21287, c14573.f45926, 9)) {
                    this.f22128 = m18560() ? 2 : 0;
                    this.f22125 = 0;
                }
            } else {
                c21287.m48503(c21287.m48486());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18564(boolean z) {
        return this.f22128 == 3 && this.f22132 == -1 && !(z && (this.f22126 instanceof C5133)) && (!z || m18560());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m18559(C21287 c21287, byte[] bArr, int i) {
        int iMin = Math.min(c21287.m48486(), i - this.f22125);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c21287.m48503(iMin);
        } else {
            c21287.m48490(this.f22125, iMin, bArr);
        }
        int i2 = this.f22125 + iMin;
        this.f22125 = i2;
        return i2 == i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m18560() {
        C14573 c14573 = this.f22130;
        c14573.m35167(0);
        int iM35163 = c14573.m35163(24);
        if (iM35163 != 1) {
            j$$ExternalSyntheticOutline0.m(iM35163, "Unexpected start code prefix: ");
            this.f22132 = -1;
            return false;
        }
        c14573.m35161(8);
        int iM35164 = c14573.m35163(16);
        c14573.m35161(5);
        this.f22133 = c14573.m35162();
        c14573.m35161(2);
        this.f22129 = c14573.m35162();
        this.f22127 = c14573.m35162();
        c14573.m35161(6);
        int iM35165 = c14573.m35163(8);
        this.f22134 = iM35165;
        if (iM35164 == 0) {
            this.f22132 = -1;
            return true;
        }
        int i = (iM35164 - 3) - iM35165;
        this.f22132 = i;
        if (i < 0) {
            C1896.m6517("Found negative packet payload size: " + this.f22132);
            this.f22132 = -1;
        }
        return true;
    }
}
