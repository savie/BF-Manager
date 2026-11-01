package l;

/* JADX INFO: renamed from: l.ᩳܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y74I */
/* JADX INFO: loaded from: classes4.dex */
public final class C18134 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f57980;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f57981;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f57982;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f57983;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f57984;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f57985;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f57987;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f57988;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f57989;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21662 f57994 = new C21662();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C21662 f57990 = new C21662();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C21662 f57992 = new C21662();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C21662 f57995 = new C21662();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21662 f57991 = new C21662();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21662 f57993 = new C21662();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f57986 = "";

    /* JADX WARN: Code duplicated, block: B:14:0x0019 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0024 A[RETURN] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static char m42206(char c, int i) {
        if (i == 1) {
            if (c == '/') {
                return '.';
            }
            return c;
        }
        if (i == 2) {
            if (c == '.') {
                return '/';
            }
            return c;
        }
        if (i == 3) {
            if (c == '/' || c == '$') {
                return '.';
            }
        } else if (i == 4 && (c == '.' || c == '/' || c == '$')) {
            return '/';
        }
        return c;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m42209(String str) {
        if (str == null) {
            str = "";
        }
        m42204(str, 0, str.length(), false);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m42214(String str) {
        if (str == null || str.length() < 2 || str.charAt(0) != 'L' || C3184.m9601(1, str) != ';') {
            m42209("");
            return false;
        }
        m42204(str, 1, str.length() - 1, true);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m42211() {
        if (this.f57982) {
            return this.f57986;
        }
        String str = this.f57986;
        int i = this.f57984;
        int i2 = this.f57989;
        C21662 c21662 = this.f57994;
        c21662.m48390(i, i2, str);
        return c21662;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final CharSequence m42223() {
        if (!this.f57982 && !this.f57983) {
            return this.f57986;
        }
        String str = this.f57986;
        int i = this.f57984;
        int i2 = this.f57989;
        C21662 c21662 = this.f57992;
        c21662.m48389(i, i2, 2, str);
        return c21662;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CharSequence m42218() {
        String str = this.f57986;
        int i = this.f57984;
        int i2 = this.f57989;
        C21662 c21662 = this.f57990;
        c21662.m48389(i, i2, 1, str);
        return c21662;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final CharSequence m42207() {
        String str = this.f57986;
        int i = this.f57984;
        int i2 = this.f57989;
        C21662 c21662 = this.f57995;
        c21662.m48389(i, i2, 3, str);
        return c21662;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final CharSequence m42215() {
        String str = this.f57986;
        int i = this.f57984 + this.f57981;
        int i2 = this.f57989;
        C21662 c21662 = this.f57991;
        c21662.m48389(i, i2, 1, str);
        return c21662;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final CharSequence m42210() {
        String str = this.f57986;
        int i = this.f57984 + this.f57981;
        int i2 = this.f57989;
        C21662 c21662 = this.f57993;
        c21662.m48389(i, i2, 3, str);
        return c21662;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m42219() {
        if (this.f57985 == null) {
            this.f57985 = m42211().toString();
        }
        return this.f57985;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42212(String str) {
        char cCharAt;
        int i = this.f57987 + 2;
        if (str.length() == i) {
            int i2 = 0;
            while (i2 < i) {
                if (i2 == 0) {
                    cCharAt = 'L';
                } else {
                    cCharAt = i2 == this.f57987 + 1 ? ';' : this.f57986.charAt((this.f57984 + i2) - 1);
                }
                if (cCharAt == str.charAt(i2)) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m42220(String str) {
        char cCharAt;
        int i = this.f57987;
        if (1 <= i + 2 && str.length() <= i + 1) {
            int i2 = 0;
            while (i2 < str.length()) {
                int i3 = 1 + i2;
                if (i3 == 0) {
                    cCharAt = 'L';
                } else {
                    cCharAt = i3 == this.f57987 + 1 ? ';' : this.f57986.charAt((this.f57984 + i3) - 1);
                }
                if (cCharAt == str.charAt(i2)) {
                    i2 = i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m42222(String str) {
        return m42205(2, str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m42217(String str) {
        return m42205(4, str);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m42221() {
        return this.f57988;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m42213() {
        return this.f57980;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m42208() {
        return this.f57981;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m42216() {
        return this.f57987;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42204(String str, int i, int i2, boolean z) {
        this.f57986 = str;
        this.f57982 = z;
        this.f57984 = i;
        this.f57989 = i2;
        this.f57987 = i2 - i;
        this.f57985 = z ? str : null;
        this.f57983 = false;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = i; i5 < i2; i5++) {
            char cCharAt = str.charAt(i5);
            int i6 = i5 - i;
            if (cCharAt == '.') {
                this.f57983 = true;
            }
            if (cCharAt == '/' || cCharAt == '.') {
                i3 = i6;
            }
            if (cCharAt == '/') {
                i4 = i6;
            }
        }
        this.f57981 = i3 + 1;
        this.f57988 = i4 >= 0 ? i4 + 2 : 0;
        this.f57980 = this.f57987 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m42205(int i, String str) {
        if (str.length() <= this.f57987) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (m42206(this.f57986.charAt(this.f57984 + i2), i) == str.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }
}
