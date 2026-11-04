package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U8U5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18098 implements InterfaceC9147, InterfaceC0945 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC9147 f59226;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f59227;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC13622 f59228;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f59229 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13314 f59230;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8402 f59231;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f59232;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC0945 f59233;

    @Override // l.InterfaceC22002
    /* JADX INFO: renamed from: ۙ */
    public final void mo7501(InterfaceC10813 interfaceC10813) {
        InterfaceC0945 interfaceC0945 = this.f59233;
        String str = C7116.f23455;
        interfaceC0945.mo7501((InterfaceC10813) this);
    }

    public C18098(C8402 c8402, InterfaceC13314 interfaceC13314, long j) {
        this.f59231 = c8402;
        this.f59230 = interfaceC13314;
        this.f59227 = j;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m42210() {
        return this.f59227;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m42209(long j) {
        this.f59229 = j;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m42211() {
        return this.f59229;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42208(InterfaceC13622 interfaceC13622) {
        C20782.m47568(this.f59228 == null);
        this.f59228 = interfaceC13622;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42206() {
        if (this.f59226 != null) {
            InterfaceC13622 interfaceC13622 = this.f59228;
            interfaceC13622.getClass();
            interfaceC13622.mo33372(this.f59226);
        }
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final void mo6409(InterfaceC0945 interfaceC0945, long j) {
        this.f59233 = interfaceC0945;
        InterfaceC9147 interfaceC9147 = this.f59226;
        if (interfaceC9147 != null) {
            long j2 = this.f59229;
            if (j2 == -9223372036854775807L) {
                j2 = this.f59227;
            }
            interfaceC9147.mo6409(this, j2);
        }
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ᩴ */
    public final void mo6412() throws IOException {
        try {
            InterfaceC9147 interfaceC9147 = this.f59226;
            if (interfaceC9147 != null) {
                interfaceC9147.mo6412();
                return;
            }
            InterfaceC13622 interfaceC13622 = this.f59228;
            if (interfaceC13622 != null) {
                interfaceC13622.mo16154();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۫ */
    public final C3356 mo6411() {
        InterfaceC9147 interfaceC9147 = this.f59226;
        String str = C7116.f23455;
        return interfaceC9147.mo6411();
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final long mo6403(InterfaceC1470[] interfaceC1470Arr, boolean[] zArr, InterfaceC4848[] interfaceC4848Arr, boolean[] zArr2, long j) {
        long j2 = this.f59229;
        long j3 = (j2 == -9223372036854775807L || j != this.f59227) ? j : j2;
        this.f59229 = -9223372036854775807L;
        InterfaceC9147 interfaceC9147 = this.f59226;
        String str = C7116.f23455;
        return interfaceC9147.mo6403(interfaceC1470Arr, zArr, interfaceC4848Arr, zArr2, j3);
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final void mo6405(long j, boolean z) {
        InterfaceC9147 interfaceC9147 = this.f59226;
        String str = C7116.f23455;
        interfaceC9147.mo6405(j, z);
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۤ */
    public final long mo6410() {
        InterfaceC9147 interfaceC9147 = this.f59226;
        String str = C7116.f23455;
        return interfaceC9147.mo6410();
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۚ */
    public final long mo6052() {
        InterfaceC9147 interfaceC9147 = this.f59226;
        String str = C7116.f23455;
        return interfaceC9147.mo6052();
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final long mo6401(long j) {
        InterfaceC9147 interfaceC9147 = this.f59226;
        String str = C7116.f23455;
        return interfaceC9147.mo6401(j);
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final long mo6402(long j, C9221 c9221) {
        InterfaceC9147 interfaceC9147 = this.f59226;
        String str = C7116.f23455;
        return interfaceC9147.mo6402(j, c9221);
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ᩷ */
    public final long mo6053() {
        InterfaceC9147 interfaceC9147 = this.f59226;
        String str = C7116.f23455;
        return interfaceC9147.mo6053();
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6054(long j) {
        InterfaceC9147 interfaceC9147 = this.f59226;
        String str = C7116.f23455;
        interfaceC9147.mo6054(j);
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6051(C20191 c20191) {
        InterfaceC9147 interfaceC9147 = this.f59226;
        return interfaceC9147 != null && interfaceC9147.mo6051(c20191);
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6050() {
        InterfaceC9147 interfaceC9147 = this.f59226;
        return interfaceC9147 != null && interfaceC9147.mo6050();
    }

    @Override // l.InterfaceC0945
    /* JADX INFO: renamed from: ۙ */
    public final void mo3768(InterfaceC9147 interfaceC9147) {
        InterfaceC0945 interfaceC0945 = this.f59233;
        String str = C7116.f23455;
        interfaceC0945.mo3768((InterfaceC9147) this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42207(C8402 c8402) {
        long j = this.f59229;
        if (j == -9223372036854775807L) {
            j = this.f59227;
        }
        InterfaceC13622 interfaceC13622 = this.f59228;
        interfaceC13622.getClass();
        InterfaceC9147 interfaceC9147Mo33371 = interfaceC13622.mo33371(c8402, this.f59230, j);
        this.f59226 = interfaceC9147Mo33371;
        if (this.f59233 != null) {
            interfaceC9147Mo33371.mo6409(this, j);
        }
    }
}
