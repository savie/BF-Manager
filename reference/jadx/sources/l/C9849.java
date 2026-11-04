package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۢۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K8IZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9849 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0901 f31700;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31701;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21287 f31702;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f31703;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21287 f31704;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f31705;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f31706;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f31707;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f31708;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f31709;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f31710;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C14573 f31711;

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC22486 mo2296() {
        return this;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    public C9849(int i) {
        this.f31708 = (i & 2) != 0 ? i | 1 : i;
        this.f31700 = new C0901(null, 0, "audio/mp4a-latm", true);
        this.f31702 = new C21287(2048);
        this.f31701 = -1;
        this.f31703 = -1L;
        C21287 c21287 = new C21287(10);
        this.f31704 = c21287;
        byte[] bArrM48497 = c21287.m48497();
        this.f31711 = new C14573(bArrM48497, bArrM48497.length);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) throws EOFException, InterruptedIOException {
        int iM25640 = m25640(interfaceC19502);
        int i = 0;
        int i2 = 0;
        int i3 = iM25640;
        do {
            C21287 c21287 = this.f31704;
            C9169 c9169 = (C9169) interfaceC19502;
            c9169.mo10078(false, 0, 2, c21287.m48497());
            c21287.m48510(0);
            if ((c21287.m48494() & 65526) == 65520) {
                i++;
                if (i >= 4 && i2 > 188) {
                    return true;
                }
                c9169.mo10078(false, 0, 4, c21287.m48497());
                C14573 c14573 = this.f31711;
                c14573.m35167(14);
                int iM35163 = c14573.m35163(13);
                if (iM35163 > 6) {
                    c9169.mo10077(iM35163 - 6, false);
                    i2 += iM35163;
                } else {
                    i3++;
                    c9169.mo10076();
                }
            } else {
                i3++;
                c9169.mo10076();
            }
            c9169.mo10077(i3, false);
            i = 0;
            i2 = 0;
        } while (i3 - iM25640 < 8192);
        return false;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f31709 = interfaceC12789;
        this.f31700.mo1351(interfaceC12789, new C10857(0, 1));
        interfaceC12789.mo16661();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        this.f31707 = false;
        this.f31700.mo1349();
        this.f31710 = j2;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00df  */
    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) throws C2970 {
        int i;
        boolean z;
        C0901 c0901;
        C20782.m47566(this.f31709);
        long length = interfaceC19502.getLength();
        int i2 = this.f31708;
        int i3 = i2 & 2;
        if (i3 != 0 || ((i2 & 1) != 0 && length != -1)) {
            C14573 c14573 = this.f31711;
            C21287 c21287 = this.f31704;
            if (!this.f31706) {
                this.f31701 = -1;
                interfaceC19502.mo10076();
                long j = 0;
                if (interfaceC19502.getPosition() == 0) {
                    m25640(interfaceC19502);
                }
                int i4 = 0;
                for (int i5 = 0; interfaceC19502.mo10078(true, i5, 2, c21287.m48497()); i5 = 0) {
                    try {
                        c21287.m48510(i5);
                        if (!((c21287.m48494() & 65526) == 65520)) {
                            i4 = 0;
                            break;
                        }
                        if (!interfaceC19502.mo10078(true, i5, 4, c21287.m48497())) {
                            break;
                        }
                        c14573.m35167(14);
                        int iM35163 = c14573.m35163(13);
                        if (iM35163 <= 6) {
                            this.f31706 = true;
                            throw C2970.m9688("Malformed ADTS stream", (Throwable) null);
                        }
                        j += (long) iM35163;
                        i4++;
                        if (i4 == 1000 || !interfaceC19502.mo10077(iM35163 - 6, true)) {
                            break;
                            break;
                        }
                    } catch (EOFException unused) {
                    }
                }
                interfaceC19502.mo10076();
                if (i4 > 0) {
                    this.f31701 = (int) (j / ((long) i4));
                } else {
                    this.f31701 = -1;
                }
                this.f31706 = true;
            }
        }
        C21287 c21288 = this.f31702;
        int i6 = interfaceC19502.read(c21288.m48497(), 0, 2048);
        boolean z2 = i6 == -1;
        boolean z3 = this.f31705;
        C0901 c0902 = this.f31700;
        if (z3) {
            i = -1;
            c0902 = c0902;
            z = true;
        } else {
            boolean z4 = (i2 & 1) != 0 && this.f31701 > 0;
            if (z4 && c0902.m3639() == -9223372036854775807L && !z2) {
                i = -1;
                c0902 = c0902;
                z = true;
            } else {
                if (z4 && c0902.m3639() != -9223372036854775807L) {
                    this.f31709.mo16659(new C0967((int) ((((long) this.f31701) * 8000000) / c0902.m3639()), this.f31701, length, this.f31703, i3 != 0));
                    i = -1;
                } else {
                    i = -1;
                    this.f31709.mo16659(new C0857(-9223372036854775807L));
                }
                z = true;
                this.f31705 = true;
            }
        }
        if (z2) {
            return i;
        }
        c21288.m48510(0);
        c21288.m48517(i6);
        if (this.f31707) {
            c0901 = c0902;
        } else {
            c0901 = c0902;
            c0901.mo1350(4, this.f31710);
            this.f31707 = z;
        }
        c0901.mo1352(c21288);
        return 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m25640(InterfaceC19502 interfaceC19502) {
        int i = 0;
        while (true) {
            C21287 c21287 = this.f31704;
            interfaceC19502.mo10069(0, 10, c21287.m48497());
            c21287.m48510(0);
            if (c21287.m48501() != 4801587) {
                break;
            }
            c21287.m48503(3);
            int iM48499 = c21287.m48499();
            i += iM48499 + 10;
            interfaceC19502.mo10068(iM48499);
        }
        interfaceC19502.mo10076();
        interfaceC19502.mo10068(i);
        if (this.f31703 == -1) {
            this.f31703 = i;
        }
        return i;
    }
}
