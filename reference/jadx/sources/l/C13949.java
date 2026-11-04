package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.۬ܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8RD */
/* JADX INFO: loaded from: classes4.dex */
public final class C13949 implements InterfaceC22024 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1272 f44228;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15648 f44229;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f44230;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22024 f44231;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC2763 f44235;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f44232 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f44233 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f44234 = C7116.f23453;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21287 f44236 = new C21287();

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo14382(long j) {
    }

    public C13949(InterfaceC22024 interfaceC22024, InterfaceC1272 interfaceC1272) {
        this.f44231 = interfaceC22024;
        this.f44228 = interfaceC1272;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33995() {
        this.f44230 = true;
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14384(C15648 c15648) {
        c15648.f50848.getClass();
        String str = c15648.f50848;
        C20782.m47565(C9681.m25260(str) == 3);
        boolean zEquals = c15648.equals(this.f44229);
        InterfaceC1272 interfaceC1272 = this.f44228;
        if (!zEquals) {
            this.f44229 = c15648;
            this.f44235 = interfaceC1272.mo4645(c15648) ? interfaceC1272.mo4646(c15648) : null;
        }
        InterfaceC2763 interfaceC2763 = this.f44235;
        InterfaceC22024 interfaceC22024 = this.f44231;
        if (interfaceC2763 == null) {
            interfaceC22024.mo14384(c15648);
            return;
        }
        C20124 c20124M37397 = c15648.m37397();
        c20124M37397.m46315("application/x-media3-cues");
        c20124M37397.m46300(str);
        c20124M37397.m46298(C25227.FOREVER_NS);
        c20124M37397.m46314(interfaceC1272.mo4647(c15648));
        interfaceC22024.mo14384(c20124M37397.m46295());
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ᩷ */
    public final int mo14386(InterfaceC9461 interfaceC9461, int i, boolean z) throws EOFException {
        if (this.f44235 == null) {
            return this.f44231.mo14386(interfaceC9461, i, z);
        }
        m33993(i);
        int i2 = interfaceC9461.read(this.f44234, this.f44233, i);
        if (i2 != -1) {
            this.f44233 += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14385(C21287 c21287, int i, int i2) {
        if (this.f44235 == null) {
            this.f44231.mo14385(c21287, i, i2);
            return;
        }
        m33993(i);
        c21287.m48490(this.f44233, i, this.f44234);
        this.f44233 += i;
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14383(final long j, final int i, int i2, int i3, C4870 c4870) {
        if (this.f44235 == null) {
            this.f44231.mo14383(j, i, i2, i3, c4870);
            return;
        }
        C20782.m47564("DRM on subtitles is not supported", c4870 == null);
        int i4 = (this.f44233 - i3) - i2;
        try {
            this.f44235.mo5930(this.f44234, i4, i2, C9474.m24857(), new InterfaceC8103() { // from class: l.ۜܶ᩷
                @Override // l.InterfaceC8103
                public final void accept(Object obj) {
                    C13949.m33994(this.f23868, j, i, (C16187) obj);
                }
            });
        } catch (RuntimeException e) {
            if (this.f44230) {
                C1896.m6514("Parsing subtitles failed, ignoring sample.", e);
            } else {
                throw e;
            }
        }
        int i5 = i4 + i2;
        this.f44232 = i5;
        if (i5 == this.f44233) {
            this.f44232 = 0;
            this.f44233 = 0;
        }
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final int mo14380(InterfaceC9461 interfaceC9461, int i, boolean z) {
        return mo14386(interfaceC9461, i, z);
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14381(int i, C21287 c21287) {
        mo14385(c21287, i, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33994(C13949 c13949, long j, int i, C16187 c16187) {
        C20782.m47566(c13949.f44229);
        byte[] bArrM41345 = C17679.m41345(c16187.f52543, c16187.f52541);
        C21287 c21287 = c13949.f44236;
        c21287.getClass();
        c21287.m48491(bArrM41345.length, bArrM41345);
        c13949.f44231.mo14381(bArrM41345.length, c21287);
        long j2 = c16187.f52544;
        if (j2 == -9223372036854775807L) {
            C20782.m47568(c13949.f44229.f50837 == C25227.FOREVER_NS);
        } else {
            long j3 = c13949.f44229.f50837;
            j = j3 == C25227.FOREVER_NS ? j + j2 : j2 + j3;
        }
        c13949.f44231.mo14383(j, i | 1, bArrM41345.length, 0, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33993(int i) {
        int length = this.f44234.length;
        int i2 = this.f44233;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f44232;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f44234;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f44232, bArr2, 0, i3);
        this.f44232 = 0;
        this.f44233 = i3;
        this.f44234 = bArr2;
    }
}
