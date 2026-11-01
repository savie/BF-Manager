package l;

/* JADX INFO: renamed from: l.֡ۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: T9X7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0348 implements InterfaceC20478 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f1771;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f1772;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f1773;

    public C0348(byte[] bArr, int i, int i2) {
        this.f1772 = bArr;
        this.f1771 = i;
        this.f1773 = i2;
    }

    @Override // l.InterfaceC20478
    public final int size() {
        return this.f1773;
    }

    @Override // l.InterfaceC20478
    /* JADX INFO: renamed from: ۙ */
    public final int mo1806(int i, byte[] bArr) {
        byte[] bArr2 = this.f1772;
        int i2 = this.f1771;
        int i3 = this.f1773;
        System.arraycopy(bArr2, i2, bArr, i, i3);
        return i3;
    }
}
