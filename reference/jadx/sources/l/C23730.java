package l;

/* JADX INFO: renamed from: l.᩹ᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7WJ */
/* JADX INFO: loaded from: classes2.dex */
public class C23730 extends C20746 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f76923 = new byte[20];

    @Override // l.C20746, l.InterfaceC7299
    public final int getBlockSize() {
        return 12;
    }

    @Override // l.AbstractC11795, l.InterfaceC7299
    /* JADX INFO: renamed from: ᩷ */
    public final void mo19967(int i, byte[] bArr) {
        byte[] bArr2 = this.f76923;
        super.mo19967(0, bArr2);
        System.arraycopy(bArr2, 0, bArr, i, 12);
    }
}
