package l;

/* JADX INFO: renamed from: l.ۧ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7AC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11832 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f38158 = 49152;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25259 m29680(String str) {
        int iCodePointCount = str.codePointCount(0, str.length());
        int i = this.f38158;
        if (iCodePointCount <= i) {
            this.f38158 = i - iCodePointCount;
            return new C25259(str, false);
        }
        int iMax = Math.max(0, i);
        this.f38158 = 0;
        return new C25259(iMax <= 0 ? "" : str.substring(0, str.offsetByCodePoints(0, iMax)), iCodePointCount > iMax);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m29681(String str) {
        int iCodePointCount = str.codePointCount(0, str.length());
        int i = this.f38158;
        if (iCodePointCount > i) {
            return false;
        }
        this.f38158 = i - iCodePointCount;
        return true;
    }
}
