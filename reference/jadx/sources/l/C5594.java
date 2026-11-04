package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8N8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5594 implements InterfaceC0636 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7467 f19418;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f19419;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C25368 f19420;

    @Override // l.InterfaceC0636
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2803() {
    }

    public C5594(InterfaceC13433 interfaceC13433, C25368 c25368) {
        C14368.m34811();
        this.f19420 = c25368;
        this.f19418 = new C7467(interfaceC13433);
    }

    @Override // l.InterfaceC0636
    /* JADX INFO: renamed from: ۙ */
    public final void mo2802() {
        C7467 c7467 = this.f19418;
        c7467.m20510();
        try {
            c7467.mo8326(this.f19420);
            int i = 0;
            while (i != -1) {
                int iM20513 = (int) c7467.m20513();
                byte[] bArr = this.f19419;
                if (bArr == null) {
                    this.f19419 = new byte[1024];
                } else if (iM20513 == bArr.length) {
                    this.f19419 = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f19419;
                i = c7467.read(bArr2, iM20513, bArr2.length - iM20513);
            }
        } finally {
            C18856.m43745(c7467);
        }
    }
}
