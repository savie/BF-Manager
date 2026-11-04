package l;

/* JADX INFO: renamed from: l.۫ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y74I */
/* JADX INFO: loaded from: classes4.dex */
public final class C13216 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f42180;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f42182;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f42183;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f42184;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f42185;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f42186;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f42191;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f42192;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f42193;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15453 f42187 = new C15453();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C15453 f42189 = new C15453();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15453 f42194 = new C15453();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C15453 f42195 = new C15453();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C15453 f42188 = new C15453();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15453 f42190 = new C15453();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f42181 = "";

    /* JADX WARN: Code duplicated, block: B:14:0x0019 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0024 A[RETURN] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static char m32733(char c, int i) {
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m32749(String str) {
        if (str == null) {
            str = "";
        }
        m32731(str, 0, str.length(), false);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m32745(String str) {
        if (str == null || str.length() < 2 || str.charAt(0) != 'L' || C22313.m50373(1, str) != ';') {
            m32749("");
            return false;
        }
        m32731(str, 1, str.length() - 1, true);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m32735() {
        if (this.f42180) {
            return this.f42181;
        }
        String str = this.f42181;
        int i = this.f42191;
        int i2 = this.f42192;
        C15453 c15453 = this.f42187;
        c15453.m37006(i, i2, str);
        return c15453;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CharSequence m32750() {
        if (!this.f42180 && !this.f42182) {
            return this.f42181;
        }
        String str = this.f42181;
        int i = this.f42191;
        int i2 = this.f42192;
        C15453 c15453 = this.f42194;
        c15453.m37005(i, i2, 2, str);
        return c15453;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final CharSequence m32737() {
        String str = this.f42181;
        int i = this.f42191;
        int i2 = this.f42192;
        C15453 c15453 = this.f42189;
        c15453.m37005(i, i2, 1, str);
        return c15453;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CharSequence m32741() {
        String str = this.f42181;
        int i = this.f42191;
        int i2 = this.f42192;
        C15453 c15453 = this.f42195;
        c15453.m37005(i, i2, 3, str);
        return c15453;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharSequence m32740() {
        String str = this.f42181;
        int i = this.f42191 + this.f42193;
        int i2 = this.f42192;
        C15453 c15453 = this.f42188;
        c15453.m37005(i, i2, 1, str);
        return c15453;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m32734() {
        String str = this.f42181;
        int i = this.f42191 + this.f42193;
        int i2 = this.f42192;
        C15453 c15453 = this.f42190;
        c15453.m37005(i, i2, 3, str);
        return c15453;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m32746() {
        if (this.f42185 == null) {
            this.f42185 = m32735().toString();
        }
        return this.f42185;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32736(String str) {
        char cCharAt;
        int i = this.f42184 + 2;
        if (str.length() == i) {
            int i2 = 0;
            while (i2 < i) {
                if (i2 == 0) {
                    cCharAt = 'L';
                } else {
                    cCharAt = i2 == this.f42184 + 1 ? ';' : this.f42181.charAt((this.f42191 + i2) - 1);
                }
                if (cCharAt == str.charAt(i2)) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m32747(String str) {
        char cCharAt;
        int i = this.f42184;
        if (1 <= i + 2 && str.length() <= i + 1) {
            int i2 = 0;
            while (i2 < str.length()) {
                int i3 = 1 + i2;
                if (i3 == 0) {
                    cCharAt = 'L';
                } else {
                    cCharAt = i3 == this.f42184 + 1 ? ';' : this.f42181.charAt((this.f42191 + i3) - 1);
                }
                if (cCharAt == str.charAt(i2)) {
                    i2 = i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m32743(String str) {
        return m32732(2, str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m32739(String str) {
        return m32732(4, str);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m32742() {
        return this.f42183;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m32744() {
        return this.f42186;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m32748() {
        return this.f42193;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m32738() {
        return this.f42184;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32731(String str, int i, int i2, boolean z) {
        this.f42181 = str;
        this.f42180 = z;
        this.f42191 = i;
        this.f42192 = i2;
        this.f42184 = i2 - i;
        this.f42185 = z ? str : null;
        this.f42182 = false;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = i; i5 < i2; i5++) {
            char cCharAt = str.charAt(i5);
            int i6 = i5 - i;
            if (cCharAt == '.') {
                this.f42182 = true;
            }
            if (cCharAt == '/' || cCharAt == '.') {
                i3 = i6;
            }
            if (cCharAt == '/') {
                i4 = i6;
            }
        }
        this.f42193 = i3 + 1;
        this.f42183 = i4 >= 0 ? i4 + 2 : 0;
        this.f42186 = this.f42184 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m32732(int i, String str) {
        if (str.length() <= this.f42184) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (m32733(this.f42181.charAt(this.f42191 + i2), i) == str.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }
}
