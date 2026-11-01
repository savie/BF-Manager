package l;

/* JADX INFO: renamed from: l.֡᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R9WA */
/* JADX INFO: loaded from: classes3.dex */
public final class C0679 implements InterfaceC20436 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f2842;

    @Override // l.InterfaceC20478
    public final int size() {
        return 8;
    }

    @Override // l.InterfaceC20436
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte mo3043() {
        return (byte) 6;
    }

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        this.f2842 = C4850.m13547(i, bArr);
        return 8;
    }

    @Override // l.InterfaceC20478
    /* JADX INFO: renamed from: ۙ */
    public final int mo1806(int i, byte[] bArr) {
        C4850.m13548(this.f2842, i, bArr);
        return 8;
    }

    public final String toString() {
        return new String(C15037.m36023(new StringBuilder("SmbQueryFileInternalInfo[indexNumber="), this.f2842, "]"));
    }
}
