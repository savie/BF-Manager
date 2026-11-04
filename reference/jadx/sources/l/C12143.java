package l;

/* JADX INFO: renamed from: l.ۨۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5I6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12143 implements InterfaceC7669 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6178 f39049;

    public C12143(C6178 c6178) {
        this.f39049 = c6178;
    }

    @Override // l.InterfaceC7669
    public final void writeByte(int i) {
        C6178 c6178 = this.f39049;
        byte[] bArr = c6178.f21044;
        int i2 = c6178.f21042;
        c6178.f21042 = i2 + 1;
        bArr[i2] = (byte) i;
    }
}
