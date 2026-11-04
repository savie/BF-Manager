package l;

/* JADX INFO: renamed from: l.֨֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0802 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f2842 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC9750 f2843;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f2844;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void mo3216() {
        this.f2844 = -1;
        this.f2842 = -1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m3214() {
        return this.f2844;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3219(int i) {
        this.f2844 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3212() {
        return this.f2842;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3213(int i) {
        this.f2842 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3211(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m3215() {
        return this.f2843 == EnumC9750.Doctype;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m3217() {
        return this.f2843 == EnumC9750.StartTag;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m3218() {
        return this.f2843 == EnumC9750.EndTag;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m3220() {
        return this.f2843 == EnumC9750.Comment;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m3221() {
        return this.f2843 == EnumC9750.EOF;
    }
}
