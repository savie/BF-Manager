package l;

/* JADX INFO: renamed from: l.ۖܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J1UA */
/* JADX INFO: loaded from: classes2.dex */
public final class C2682 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f10362;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10363;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f10364;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f10365;

    public C2682(String str) {
        int length;
        this.f10365 = str;
        if (str.charAt(0) == '<') {
            this.f10364 = 1;
            int i = 1;
            do {
                int i2 = this.f10364;
                this.f10364 = i2 + 1;
                char cCharAt = str.charAt(i2);
                if (cCharAt == '<') {
                    i++;
                } else if (cCharAt == '>') {
                    i--;
                }
            } while (i > 0);
        }
        int iIndexOf = str.indexOf(40, this.f10364);
        if (iIndexOf >= 0) {
            length = str.indexOf(41, iIndexOf);
        } else {
            length = str.length();
        }
        this.f10363 = length;
        this.f10362 = iIndexOf >= 0 ? iIndexOf + 1 : this.f10364;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8220() {
        return this.f10362 < this.f10363;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m8221() {
        String str;
        int i = this.f10362;
        while (true) {
            int i2 = this.f10362;
            str = this.f10365;
            if (str.charAt(i2) != '[') {
                break;
            }
            this.f10362++;
        }
        int i3 = this.f10362;
        this.f10362 = i3 + 1;
        char cCharAt = str.charAt(i3);
        if (cCharAt == '<') {
            m8219();
        } else if (cCharAt == 'L' || cCharAt == 'T') {
            while (true) {
                int i4 = this.f10362;
                this.f10362 = i4 + 1;
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 == ';') {
                    break;
                }
                if (cCharAt2 == '<') {
                    m8219();
                }
            }
        }
        return str.substring(i, this.f10362);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m8219() {
        int i = 1;
        do {
            int i2 = this.f10362;
            this.f10362 = i2 + 1;
            char cCharAt = this.f10365.charAt(i2);
            if (cCharAt == '<') {
                i++;
            } else if (cCharAt == '>') {
                i--;
            }
        } while (i > 0);
    }
}
