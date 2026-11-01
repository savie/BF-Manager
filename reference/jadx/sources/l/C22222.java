package l;

/* JADX INFO: renamed from: l.᩹ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes.dex */
public final class C22222 extends AbstractC21516 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f72668;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f72667 = new StringBuilder();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f72666 = false;

    @Override // l.AbstractC21516
    /* JADX INFO: renamed from: ֨ */
    public final void mo3991() {
        super.mo3991();
        AbstractC21516.m48227(this.f72667);
        this.f72668 = null;
        this.f72666 = false;
    }

    public C22222() {
        this.f69910 = EnumC15167.Comment;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m49335() {
        String str = this.f72668;
        return str != null ? str : this.f72667.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49336(char c) {
        String str = this.f72668;
        StringBuilder sb = this.f72667;
        if (str != null) {
            sb.append(str);
            this.f72668 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49337(String str) {
        String str2 = this.f72668;
        StringBuilder sb = this.f72667;
        if (str2 != null) {
            sb.append(str2);
            this.f72668 = null;
        }
        if (sb.length() == 0) {
            this.f72668 = str;
        } else {
            sb.append(str);
        }
    }

    public final String toString() {
        return C16523.m38890("<!--", m49335(), "-->");
    }
}
