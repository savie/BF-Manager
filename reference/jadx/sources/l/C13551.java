package l;

/* JADX INFO: renamed from: l.ܰۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: A78P */
/* JADX INFO: loaded from: classes3.dex */
public final class C13551 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3693 f44722;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f44723;

    public C13551(C3693 c3693, long j) {
        this.f44722 = c3693;
        this.f44723 = j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m33141() {
        return this.f44723;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33136() {
        return this.f44722.f13477;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m33138(int i) {
        return this.f44722.f13474[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m33140(int i) {
        return this.f44722.f13476[i];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m33139(int i) {
        return this.f44722.f13479[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33137(long j) {
        C3693 c3693 = this.f44722;
        int i = c3693.f13477;
        if (i <= 1 || j <= c3693.f13479[0]) {
            return 0;
        }
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (c3693.f13479[i4] <= j) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        return Math.max(0, Math.min(i2, c3693.f13477 - 1));
    }
}
