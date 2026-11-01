package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.᩸ᩴܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8RD */
/* JADX INFO: loaded from: classes5.dex */
public final class C21768 implements InterfaceC8011 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13302 f70530;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7648 f70531;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8011 f70533;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f70534;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC6951 f70535;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f70528 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f70536 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f70532 = C17983.f57507;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2460 f70529 = new C2460();

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo8113(long j) {
    }

    public C21768(InterfaceC8011 interfaceC8011, InterfaceC13302 interfaceC13302) {
        this.f70533 = interfaceC8011;
        this.f70530 = interfaceC13302;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48532() {
        this.f70534 = true;
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8116(C7648 c7648) {
        c7648.f25265.getClass();
        String str = c7648.f25265;
        C2023.m6507(C6632.m17981(str) == 3);
        boolean zEquals = c7648.equals(this.f70531);
        InterfaceC13302 interfaceC13302 = this.f70530;
        if (!zEquals) {
            this.f70531 = c7648;
            this.f70535 = interfaceC13302.mo4660(c7648) ? interfaceC13302.mo4661(c7648) : null;
        }
        InterfaceC6951 interfaceC6951 = this.f70535;
        InterfaceC8011 interfaceC8011 = this.f70533;
        if (interfaceC6951 == null) {
            interfaceC8011.mo8116(c7648);
            return;
        }
        C10471 c10471M20201 = c7648.m20201();
        c10471M20201.m26533("application/x-media3-cues");
        c10471M20201.m26502(str);
        c10471M20201.m26500(C17492.FOREVER_NS);
        c10471M20201.m26532(interfaceC13302.mo4662(c7648));
        interfaceC8011.mo8116(c10471M20201.m26497());
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ܰ */
    public final int mo8117(InterfaceC6942 interfaceC6942, int i, boolean z) throws EOFException {
        if (this.f70535 == null) {
            return this.f70533.mo8117(interfaceC6942, i, z);
        }
        m48530(i);
        int i2 = interfaceC6942.read(this.f70532, this.f70536, i);
        if (i2 != -1) {
            this.f70536 += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8115(C2460 c2460, int i, int i2) {
        if (this.f70535 == null) {
            this.f70533.mo8115(c2460, i, i2);
            return;
        }
        m48530(i);
        c2460.m7507(this.f70536, i, this.f70532);
        this.f70536 += i;
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8114(final long j, final int i, int i2, int i3, C18594 c18594) {
        if (this.f70535 == null) {
            this.f70533.mo8114(j, i, i2, i3, c18594);
            return;
        }
        C2023.m6506("DRM on subtitles is not supported", c18594 == null);
        int i4 = (this.f70536 - i3) - i2;
        try {
            this.f70535.mo11109(this.f70532, i4, i2, C4128.m11752(), new InterfaceC1008() { // from class: l.ܶᩴܰ
                @Override // l.InterfaceC1008
                public final void accept(Object obj) {
                    C21768.m48531(this.f50264, j, i, (C17513) obj);
                }
            });
        } catch (RuntimeException e) {
            if (this.f70534) {
                C0303.m1852("Parsing subtitles failed, ignoring sample.", e);
            } else {
                throw e;
            }
        }
        int i5 = i4 + i2;
        this.f70528 = i5;
        if (i5 == this.f70536) {
            this.f70528 = 0;
            this.f70536 = 0;
        }
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final int mo8111(InterfaceC6942 interfaceC6942, int i, boolean z) {
        return mo8117(interfaceC6942, i, z);
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8112(int i, C2460 c2460) {
        mo8115(c2460, i, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48531(C21768 c21768, long j, int i, C17513 c17513) {
        C2023.m6508(c21768.f70531);
        byte[] bArrM31290 = C12575.m31290(c17513.f55688, c17513.f55686);
        C2460 c2460 = c21768.f70529;
        c2460.getClass();
        c2460.m7508(bArrM31290.length, bArrM31290);
        c21768.f70533.mo8112(bArrM31290.length, c2460);
        long j2 = c17513.f55685;
        if (j2 == -9223372036854775807L) {
            C2023.m6510(c21768.f70531.f25278 == C17492.FOREVER_NS);
        } else {
            long j3 = c21768.f70531.f25278;
            j = j3 == C17492.FOREVER_NS ? j + j2 : j2 + j3;
        }
        c21768.f70533.mo8114(j, i | 1, bArrM31290.length, 0, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48530(int i) {
        int length = this.f70532.length;
        int i2 = this.f70536;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f70528;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f70532;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f70528, bArr2, 0, i3);
        this.f70528 = 0;
        this.f70536 = i3;
        this.f70532 = bArr2;
    }
}
