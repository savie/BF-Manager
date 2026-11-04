package l;

/* JADX INFO: renamed from: l.᩷۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1UA */
/* JADX INFO: loaded from: classes.dex */
public final class C22064 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f71138;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f71139;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f71140;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f71141;

    public C22064(String str) {
        int length;
        this.f71140 = str;
        if (str.charAt(0) == '<') {
            this.f71139 = 1;
            int i = 1;
            do {
                int i2 = this.f71139;
                this.f71139 = i2 + 1;
                char cCharAt = str.charAt(i2);
                if (cCharAt == '<') {
                    i++;
                } else if (cCharAt == '>') {
                    i--;
                }
            } while (i > 0);
        }
        int iIndexOf = str.indexOf(40, this.f71139);
        if (iIndexOf >= 0) {
            length = str.indexOf(41, iIndexOf);
        } else {
            length = str.length();
        }
        this.f71138 = length;
        this.f71141 = iIndexOf >= 0 ? iIndexOf + 1 : this.f71139;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49896() {
        return this.f71141 < this.f71138;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m49897() {
        String str;
        int i = this.f71141;
        while (true) {
            int i2 = this.f71141;
            str = this.f71140;
            if (str.charAt(i2) != '[') {
                break;
            }
            this.f71141++;
        }
        int i3 = this.f71141;
        this.f71141 = i3 + 1;
        char cCharAt = str.charAt(i3);
        if (cCharAt == '<') {
            m49895();
        } else if (cCharAt == 'L' || cCharAt == 'T') {
            while (true) {
                int i4 = this.f71141;
                this.f71141 = i4 + 1;
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 == ';') {
                    break;
                }
                if (cCharAt2 == '<') {
                    m49895();
                }
            }
        }
        return str.substring(i, this.f71141);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m49895() {
        int i = 1;
        do {
            int i2 = this.f71141;
            this.f71141 = i2 + 1;
            char cCharAt = this.f71140.charAt(i2);
            if (cCharAt == '<') {
                i++;
            } else if (cCharAt == '>') {
                i--;
            }
        } while (i > 0);
    }
}
