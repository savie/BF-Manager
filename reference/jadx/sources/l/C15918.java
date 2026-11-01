package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8N8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15918 implements InterfaceC1411 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19000 f51586;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f51587;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12257 f51588;

    @Override // l.InterfaceC1411
    /* JADX INFO: renamed from: ܰ */
    public final void mo2335() {
    }

    public C15918(InterfaceC15785 interfaceC15785, C12257 c12257) {
        C13863.m33700();
        this.f51588 = c12257;
        this.f51586 = new C19000(interfaceC15785);
    }

    @Override // l.InterfaceC1411
    /* JADX INFO: renamed from: ۙ */
    public final void mo2330() {
        C19000 c19000 = this.f51586;
        c19000.m43701();
        try {
            c19000.mo9272(this.f51588);
            int i = 0;
            while (i != -1) {
                int iM43703 = (int) c19000.m43703();
                byte[] bArr = this.f51587;
                if (bArr == null) {
                    this.f51587 = new byte[1024];
                } else if (iM43703 == bArr.length) {
                    this.f51587 = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f51587;
                i = c19000.read(bArr2, iM43703, bArr2.length - iM43703);
            }
        } finally {
            C22851.m50584(c19000);
        }
    }
}
