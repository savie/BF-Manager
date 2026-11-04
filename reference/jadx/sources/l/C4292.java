package l;

/* JADX INFO: renamed from: l.ۘܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes2.dex */
public final class C4292 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15562;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f15563;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f15564;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f15565;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13668(String str) {
        if (this.f15563 == null) {
            this.f15563 = str;
        }
        if ("\r\n".equals(str)) {
            this.f15564++;
        } else if ("\r".equals(str)) {
            this.f15562++;
        } else {
            this.f15565++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m13667() {
        int i;
        String str = this.f15563;
        if (str == null) {
            return "\n";
        }
        String str2 = "\r\n";
        if ("\r\n".equals(str)) {
            i = this.f15564;
        } else if ("\r".equals(str)) {
            i = this.f15562;
        } else {
            i = this.f15565;
        }
        int i2 = this.f15565;
        if (i2 > i) {
            str = "\n";
            i = i2;
        }
        int i3 = this.f15564;
        if (i3 > i) {
            i = i3;
        } else {
            str2 = str;
        }
        return this.f15562 > i ? "\r" : str2;
    }
}
