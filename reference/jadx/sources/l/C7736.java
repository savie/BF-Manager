package l;

/* JADX INFO: renamed from: l.۟᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 5A0Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C7736 implements InterfaceC20436, InterfaceC20478 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f25573 = 0;

    @Override // l.InterfaceC20478
    public final int size() {
        return 8;
    }

    @Override // l.InterfaceC20436
    /* JADX INFO: renamed from: ܰ */
    public final byte mo3043() {
        return (byte) 20;
    }

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        this.f25573 = C4850.m13547(i, bArr);
        return 8;
    }

    @Override // l.InterfaceC20478
    /* JADX INFO: renamed from: ۙ */
    public final int mo1806(int i, byte[] bArr) {
        C4850.m13548(this.f25573, i, bArr);
        return 8;
    }

    public final String toString() {
        return new String(C15037.m36023(new StringBuilder("EndOfFileInformation[endOfFile="), this.f25573, "]"));
    }
}
