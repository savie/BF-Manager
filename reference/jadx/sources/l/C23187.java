package l;

/* JADX INFO: renamed from: l.᩹֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T9X7 */
/* JADX INFO: loaded from: classes.dex */
public final class C23187 implements InterfaceC17064 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f75135;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f75136;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f75137;

    public C23187(byte[] bArr, int i, int i2) {
        this.f75135 = bArr;
        this.f75136 = i;
        this.f75137 = i2;
    }

    @Override // l.InterfaceC17064
    public final int size() {
        return this.f75137;
    }

    @Override // l.InterfaceC17064
    /* JADX INFO: renamed from: ۙ */
    public final int mo10573(int i, byte[] bArr) {
        byte[] bArr2 = this.f75135;
        int i2 = this.f75136;
        int i3 = this.f75137;
        System.arraycopy(bArr2, i2, bArr, i, i3);
        return i3;
    }
}
