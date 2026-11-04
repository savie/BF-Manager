package l;

/* JADX INFO: renamed from: l.ۖܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A78P */
/* JADX INFO: loaded from: classes2.dex */
public final class C2769 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18866 f9142;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f9143;

    public C2769(C18866 c18866, long j) {
        this.f9142 = c18866;
        this.f9143 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m9145() {
        return this.f9143;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m9140() {
        return this.f9142.f61253;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m9142(int i) {
        return this.f9142.f61257[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m9144(int i) {
        return this.f9142.f61255[i];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m9143(int i) {
        return this.f9142.f61254[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m9141(long j) {
        C18866 c18866 = this.f9142;
        int i = c18866.f61253;
        if (i <= 1 || j <= c18866.f61254[0]) {
            return 0;
        }
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (c18866.f61254[i4] <= j) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        return Math.max(0, Math.min(i2, c18866.f61253 - 1));
    }
}
