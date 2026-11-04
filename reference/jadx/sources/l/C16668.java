package l;

/* JADX INFO: renamed from: l.ܺۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QN */
/* JADX INFO: loaded from: classes4.dex */
public final class C16668 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f53847;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final StringBuilder f53848 = new StringBuilder();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f53846 = false;

    public C16668(StringBuilder sb) {
        this.f53847 = sb;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39381() {
        this.f53848.append(EnumC7687.f25319);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m39380() {
        StringBuilder sb = this.f53848;
        int length = sb.length();
        if (length == 0) {
            throw new IllegalArgumentException(" Outdent() without matching Indent().");
        }
        sb.setLength(length - 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39379(String str) {
        boolean z = this.f53846;
        StringBuilder sb = this.f53847;
        if (z) {
            this.f53846 = false;
            sb.append((CharSequence) this.f53848);
        }
        sb.append((CharSequence) str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39378() {
        this.f53847.append((CharSequence) "\n");
        this.f53846 = true;
    }
}
