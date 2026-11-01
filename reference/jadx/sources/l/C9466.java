package l;

/* JADX INFO: renamed from: l.ۢ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5LF */
/* JADX INFO: loaded from: classes3.dex */
public final class C9466 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f32024;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f32025;

    public C9466(int i, long j) {
        this.f32025 = j;
        this.f32024 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24237() {
        return this.f32024;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9466 m24236(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new C9466(i3, j);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m24238() {
        return (int) this.f32025;
    }
}
