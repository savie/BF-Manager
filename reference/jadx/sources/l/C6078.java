package l;

/* JADX INFO: renamed from: l.ۛ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5I6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6078 implements InterfaceC4397 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11018 f20586;

    public C6078(C11018 c11018) {
        this.f20586 = c11018;
    }

    @Override // l.InterfaceC4397
    public final void writeByte(int i) {
        C11018 c11018 = this.f20586;
        byte[] bArr = c11018.f37458;
        int i2 = c11018.f37459;
        c11018.f37459 = i2 + 1;
        bArr[i2] = (byte) i;
    }
}
