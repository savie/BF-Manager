package l;

/* JADX INFO: renamed from: l.᩻᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49FM */
/* JADX INFO: loaded from: classes.dex */
public final class C25398 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f81978;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f81979;

    public C25398(byte[] bArr, byte[] bArr2) {
        this.f81978 = bArr;
        this.f81979 = bArr2;
    }

    public final String toString() {
        return "SMB2FileId{persistentHandle=" + C4996.m15222(this.f81978) + '}';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56760(C7453 c7453) {
        byte[] bArr = this.f81978;
        c7453.m56007(bArr.length, bArr);
        byte[] bArr2 = this.f81979;
        c7453.m56007(bArr2.length, bArr2);
    }
}
