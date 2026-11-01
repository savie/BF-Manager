package l;

/* JADX INFO: renamed from: l.ۙ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7WJ */
/* JADX INFO: loaded from: classes3.dex */
public class C4920 extends C11977 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f17239 = new byte[20];

    @Override // l.C11977, l.InterfaceC10130
    public final int getBlockSize() {
        return 12;
    }

    @Override // l.AbstractC23784, l.InterfaceC10130
    /* JADX INFO: renamed from: ܰ */
    public final void mo3164(int i, byte[] bArr) {
        byte[] bArr2 = this.f17239;
        super.mo3164(0, bArr2);
        System.arraycopy(bArr2, 0, bArr, i, 12);
    }
}
