package l;

/* JADX INFO: renamed from: l.ۘܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9F1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3985 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f14812;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC20508 f14813;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f14814;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f14815;

    public C3985(EnumC20508 enumC20508, int i, int i2, int i3, boolean z) {
        this.f14813 = enumC20508;
        this.f14814 = z ? i : Math.max(i, 65536);
        this.f14815 = z ? i2 : Math.max(i2, 65536);
        this.f14812 = z ? i3 : Math.max(i3, 65536);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC20508 m11484() {
        return this.f14813;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m11485() {
        return this.f14814;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m11486() {
        return this.f14815;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m11483() {
        return this.f14812;
    }

    public final String toString() {
        return "NegotiatedProtocol{dialect=" + this.f14813 + ", maxTransactSize=" + this.f14814 + ", maxReadSize=" + this.f14815 + ", maxWriteSize=" + this.f14812 + '}';
    }
}
