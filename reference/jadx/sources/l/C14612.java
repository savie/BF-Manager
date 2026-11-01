package l;

/* JADX INFO: renamed from: l.ܳܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7ZR */
/* JADX INFO: loaded from: classes5.dex */
public class C14612 extends C9673 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f47815 = new byte[16];

    @Override // l.C9673, l.InterfaceC10130
    public final int getBlockSize() {
        return 12;
    }

    @Override // l.AbstractC23784, l.InterfaceC10130
    /* JADX INFO: renamed from: ܰ */
    public final void mo3164(int i, byte[] bArr) {
        byte[] bArr2 = this.f47815;
        super.mo3164(0, bArr2);
        System.arraycopy(bArr2, 0, bArr, i, 12);
    }
}
