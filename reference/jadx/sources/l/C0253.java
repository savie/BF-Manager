package l;

/* JADX INFO: renamed from: l.֡ۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBGJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0253 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f1539;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f1540;

    public C0253(String str, byte[] bArr) {
        this.f1540 = str;
        this.f1539 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m1749() {
        return this.f1539;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1540);
        sb.append(": ");
        return C12669.m31437(this.f1539.length, "b", sb);
    }
}
