package l;

/* JADX INFO: renamed from: l.᩻ᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7ZR */
/* JADX INFO: loaded from: classes2.dex */
public class C25222 extends C17762 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f81471 = new byte[16];

    @Override // l.C17762, l.InterfaceC7299
    public final int getBlockSize() {
        return 12;
    }

    @Override // l.AbstractC11795, l.InterfaceC7299
    /* JADX INFO: renamed from: ᩷ */
    public final void mo19967(int i, byte[] bArr) {
        byte[] bArr2 = this.f81471;
        super.mo19967(0, bArr2);
        System.arraycopy(bArr2, 0, bArr, i, 12);
    }
}
