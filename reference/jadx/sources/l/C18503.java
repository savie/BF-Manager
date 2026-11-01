package l;

/* JADX INFO: renamed from: l.ᩴۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6MK */
/* JADX INFO: loaded from: classes4.dex */
public final class C18503 implements Appendable, CharSequence, AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12627 f58942;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10428 f58943;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f58944;

    public C18503(InterfaceC3800 interfaceC3800, C10428 c10428) {
        this.f58944 = interfaceC3800;
        this.f58943 = c10428;
        this.f58942 = new C12627(interfaceC3800, c10428, 524288);
    }

    @Override // java.lang.Appendable
    public final C18503 append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m42896(0, charSequence.length(), charSequence);
        return this;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C17499(i, i2, this);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f58942.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f58942.charAt(i);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws Throwable {
        this.f58942.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final C18503 append(char c) throws Throwable {
        this.f58942.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.f58942.append(charSequence, i, i2);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18503 m42896(int i, int i2, CharSequence charSequence) {
        this.f58942.append(charSequence, i, i2);
        return this;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42897(int i) {
        this.f58942.m31410(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18503 m42895() {
        return new C18503(this.f58944, this.f58943);
    }

    public final C17565 finish() {
        return this.f58942.finish();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f58942.close();
    }
}
