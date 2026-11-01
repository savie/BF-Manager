package l;

/* JADX INFO: renamed from: l.ۜۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970E */
/* JADX INFO: loaded from: classes2.dex */
public final class C6591 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f22210;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17898() {
        return this.f22210 < 1024;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m17899() {
        if (!m17898()) {
            return false;
        }
        this.f22210++;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17897(int i) {
        int i2;
        if (i < 0 || i > (i2 = this.f22210)) {
            throw new IllegalArgumentException("Invalid proof budget release");
        }
        this.f22210 = i2 - i;
    }
}
