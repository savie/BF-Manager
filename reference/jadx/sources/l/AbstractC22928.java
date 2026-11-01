package l;

/* JADX INFO: renamed from: l.᩺ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22928 extends AbstractC21516 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f74523;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f74526;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15436 f74528;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f74529;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f74530;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f74524 = new StringBuilder();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f74525 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final StringBuilder f74532 = new StringBuilder();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f74527 = false;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f74533 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f74531 = false;

    @Override // l.AbstractC21516
    /* JADX INFO: renamed from: ֨, reason: merged with bridge method [inline-methods] */
    public AbstractC22928 mo3991() {
        super.mo3991();
        this.f74530 = null;
        this.f74529 = null;
        AbstractC21516.m48227(this.f74524);
        this.f74526 = null;
        this.f74525 = false;
        AbstractC21516.m48227(this.f74532);
        this.f74523 = null;
        this.f74533 = false;
        this.f74527 = false;
        this.f74531 = false;
        this.f74528 = null;
        return this;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m50753() {
        String string;
        if (this.f74528 == null) {
            this.f74528 = new C15436();
        }
        boolean z = this.f74525;
        StringBuilder sb = this.f74532;
        StringBuilder sb2 = this.f74524;
        if (z && this.f74528.size() < 512) {
            String strTrim = (sb2.length() > 0 ? sb2.toString() : this.f74526).trim();
            if (strTrim.length() > 0) {
                if (this.f74527) {
                    string = sb.length() > 0 ? sb.toString() : this.f74523;
                } else {
                    string = this.f74533 ? "" : null;
                }
                this.f74528.m36935(strTrim, string);
            }
        }
        AbstractC21516.m48227(sb2);
        this.f74526 = null;
        this.f74525 = false;
        AbstractC21516.m48227(sb);
        this.f74523 = null;
        this.f74527 = false;
        this.f74533 = false;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m50749() {
        return this.f74528 != null;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m50745() {
        if (this.f74525) {
            m50753();
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m50755() {
        String str = this.f74530;
        if (str == null || str.length() == 0) {
            throw new C22491("Must be false");
        }
        return this.f74530;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m50744(String str) {
        this.f74530 = str;
        this.f74529 = C1323.m4722(str.trim());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m50750(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        String str2 = this.f74530;
        if (str2 != null) {
            strReplace = str2.concat(strReplace);
        }
        this.f74530 = strReplace;
        this.f74529 = C1323.m4722(strReplace.trim());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50747(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        this.f74525 = true;
        String str2 = this.f74526;
        StringBuilder sb = this.f74524;
        if (str2 != null) {
            sb.append(str2);
            this.f74526 = null;
        }
        if (sb.length() == 0) {
            this.f74526 = strReplace;
        } else {
            sb.append(strReplace);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m50754() {
        this.f74533 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50746(char c) {
        this.f74525 = true;
        String str = this.f74526;
        StringBuilder sb = this.f74524;
        if (str != null) {
            sb.append(str);
            this.f74526 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50748(int[] iArr) {
        this.f74527 = true;
        String str = this.f74523;
        StringBuilder sb = this.f74532;
        if (str != null) {
            sb.append(str);
            this.f74523 = null;
        }
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50751(char c) {
        this.f74527 = true;
        String str = this.f74523;
        StringBuilder sb = this.f74532;
        if (str != null) {
            sb.append(str);
            this.f74523 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50752(String str) {
        this.f74527 = true;
        String str2 = this.f74523;
        StringBuilder sb = this.f74532;
        if (str2 != null) {
            sb.append(str2);
            this.f74523 = null;
        }
        if (sb.length() == 0) {
            this.f74523 = str;
        } else {
            sb.append(str);
        }
    }
}
