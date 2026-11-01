package l;

/* JADX INFO: renamed from: l.᩸ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21516 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69909 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC15167 f69910;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f69911;

    /* JADX INFO: renamed from: ֨ */
    public void mo3991() {
        this.f69911 = -1;
        this.f69909 = -1;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m48233() {
        return this.f69911;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48234(int i) {
        this.f69911 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48229() {
        return this.f69909;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48230(int i) {
        this.f69909 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48227(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m48232() {
        return this.f69910 == EnumC15167.Doctype;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m48236() {
        return this.f69910 == EnumC15167.StartTag;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m48231() {
        return this.f69910 == EnumC15167.EndTag;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m48235() {
        return this.f69910 == EnumC15167.Comment;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m48228() {
        return this.f69910 == EnumC15167.EOF;
    }
}
