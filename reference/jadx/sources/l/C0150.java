package l;

/* JADX INFO: renamed from: l.֡ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9F1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0150 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC15700 f1142;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f1143;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f1144;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f1145;

    public C0150(EnumC15700 enumC15700, int i, int i2, int i3, boolean z) {
        this.f1142 = enumC15700;
        this.f1143 = z ? i : Math.max(i, 65536);
        this.f1144 = z ? i2 : Math.max(i2, 65536);
        this.f1145 = z ? i3 : Math.max(i3, 65536);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC15700 m1341() {
        return this.f1142;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m1342() {
        return this.f1143;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m1343() {
        return this.f1144;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m1344() {
        return this.f1145;
    }

    public final String toString() {
        return "NegotiatedProtocol{dialect=" + this.f1142 + ", maxTransactSize=" + this.f1143 + ", maxReadSize=" + this.f1144 + ", maxWriteSize=" + this.f1145 + '}';
    }
}
