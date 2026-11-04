package l;

/* JADX INFO: renamed from: l.ᩳ֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18701 extends AbstractC0802 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C10363 f60782;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f60784;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f60786;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f60787;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f60789;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final StringBuilder f60790 = new StringBuilder();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f60781 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f60785 = new StringBuilder();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f60783 = false;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f60791 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f60788 = false;

    @Override // l.AbstractC0802
    /* JADX INFO: renamed from: ۫, reason: merged with bridge method [inline-methods] */
    public AbstractC18701 mo3216() {
        super.mo3216();
        this.f60786 = null;
        this.f60787 = null;
        AbstractC0802.m3211(this.f60790);
        this.f60789 = null;
        this.f60781 = false;
        AbstractC0802.m3211(this.f60785);
        this.f60784 = null;
        this.f60791 = false;
        this.f60783 = false;
        this.f60788 = false;
        this.f60782 = null;
        return this;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m43493() {
        String string;
        if (this.f60782 == null) {
            this.f60782 = new C10363();
        }
        boolean z = this.f60781;
        StringBuilder sb = this.f60785;
        StringBuilder sb2 = this.f60790;
        if (z && this.f60782.size() < 512) {
            String strTrim = (sb2.length() > 0 ? sb2.toString() : this.f60789).trim();
            if (strTrim.length() > 0) {
                if (this.f60783) {
                    string = sb.length() > 0 ? sb.toString() : this.f60784;
                } else {
                    string = this.f60791 ? "" : null;
                }
                this.f60782.m26651(strTrim, string);
            }
        }
        AbstractC0802.m3211(sb2);
        this.f60789 = null;
        this.f60781 = false;
        AbstractC0802.m3211(sb);
        this.f60784 = null;
        this.f60783 = false;
        this.f60791 = false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43492() {
        return this.f60782 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43487() {
        if (this.f60781) {
            m43493();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m43498() {
        String str = this.f60786;
        if (str == null || str.length() == 0) {
            throw new C21552("Must be false");
        }
        return this.f60786;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m43497(String str) {
        this.f60786 = str;
        this.f60787 = C15300.m36731(str.trim());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m43491(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        String str2 = this.f60786;
        if (str2 != null) {
            strReplace = str2.concat(strReplace);
        }
        this.f60786 = strReplace;
        this.f60787 = C15300.m36731(strReplace.trim());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43489(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        this.f60781 = true;
        String str2 = this.f60789;
        StringBuilder sb = this.f60790;
        if (str2 != null) {
            sb.append(str2);
            this.f60789 = null;
        }
        if (sb.length() == 0) {
            this.f60789 = strReplace;
        } else {
            sb.append(strReplace);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43494() {
        this.f60791 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43488(char c) {
        this.f60781 = true;
        String str = this.f60789;
        StringBuilder sb = this.f60790;
        if (str != null) {
            sb.append(str);
            this.f60789 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43490(int[] iArr) {
        this.f60783 = true;
        String str = this.f60784;
        StringBuilder sb = this.f60785;
        if (str != null) {
            sb.append(str);
            this.f60784 = null;
        }
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43495(char c) {
        this.f60783 = true;
        String str = this.f60784;
        StringBuilder sb = this.f60785;
        if (str != null) {
            sb.append(str);
            this.f60784 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43496(String str) {
        this.f60783 = true;
        String str2 = this.f60784;
        StringBuilder sb = this.f60785;
        if (str2 != null) {
            sb.append(str2);
            this.f60784 = null;
        }
        if (sb.length() == 0) {
            this.f60784 = str;
        } else {
            sb.append(str);
        }
    }
}
