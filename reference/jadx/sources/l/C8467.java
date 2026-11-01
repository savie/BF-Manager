package l;

/* JADX INFO: renamed from: l.۠᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H7AC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8467 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f29365 = 49152;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19756 m22118(String str) {
        int iCodePointCount = str.codePointCount(0, str.length());
        int i = this.f29365;
        if (iCodePointCount <= i) {
            this.f29365 = i - iCodePointCount;
            return new C19756(str, false);
        }
        int iMax = Math.max(0, i);
        this.f29365 = 0;
        return new C19756(iMax <= 0 ? "" : str.substring(0, str.offsetByCodePoints(0, iMax)), iCodePointCount > iMax);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m22119(String str) {
        int iCodePointCount = str.codePointCount(0, str.length());
        int i = this.f29365;
        if (iCodePointCount > i) {
            return false;
        }
        this.f29365 = i - iCodePointCount;
        return true;
    }
}
