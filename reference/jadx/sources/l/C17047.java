package l;

/* JADX INFO: renamed from: l.ܿۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C17047 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f54437;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54438;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f54439;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f54440;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39829(String str) {
        if (this.f54439 == null) {
            this.f54439 = str;
        }
        if ("\r\n".equals(str)) {
            this.f54440++;
        } else if ("\r".equals(str)) {
            this.f54438++;
        } else {
            this.f54437++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m39828() {
        int i;
        String str = this.f54439;
        if (str == null) {
            return "\n";
        }
        String str2 = "\r\n";
        if ("\r\n".equals(str)) {
            i = this.f54440;
        } else if ("\r".equals(str)) {
            i = this.f54438;
        } else {
            i = this.f54437;
        }
        int i2 = this.f54437;
        if (i2 > i) {
            str = "\n";
            i = i2;
        }
        int i3 = this.f54440;
        if (i3 > i) {
            i = i3;
        } else {
            str2 = str;
        }
        return this.f54438 > i ? "\r" : str2;
    }
}
