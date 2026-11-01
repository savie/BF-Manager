package l;

/* JADX INFO: renamed from: l.᩻ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QN */
/* JADX INFO: loaded from: classes.dex */
public final class C23602 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f76460;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f76461 = new StringBuilder();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f76459 = false;

    public C23602(StringBuilder sb) {
        this.f76460 = sb;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m52033() {
        this.f76461.append(EnumC19730.f63352);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m52032() {
        StringBuilder sb = this.f76461;
        int length = sb.length();
        if (length == 0) {
            throw new IllegalArgumentException(" Outdent() without matching Indent().");
        }
        sb.setLength(length - 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52031(String str) {
        boolean z = this.f76459;
        StringBuilder sb = this.f76460;
        if (z) {
            this.f76459 = false;
            sb.append((CharSequence) this.f76461);
        }
        sb.append((CharSequence) str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52030() {
        this.f76460.append((CharSequence) "\n");
        this.f76459 = true;
    }
}
