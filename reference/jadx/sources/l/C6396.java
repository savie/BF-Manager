package l;

/* JADX INFO: renamed from: l.ۛ᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 49FM */
/* JADX INFO: loaded from: classes2.dex */
public final class C6396 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f21705;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f21706;

    public C6396(byte[] bArr, byte[] bArr2) {
        this.f21705 = bArr;
        this.f21706 = bArr2;
    }

    public final String toString() {
        return "SMB2FileId{persistentHandle=" + C10216.m26000(this.f21705) + '}';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17542(C19240 c19240) {
        byte[] bArr = this.f21705;
        c19240.m27383(bArr.length, bArr);
        byte[] bArr2 = this.f21706;
        c19240.m27383(bArr2.length, bArr2);
    }
}
