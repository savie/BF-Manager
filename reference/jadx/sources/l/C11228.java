package l;

/* JADX INFO: renamed from: l.ۤ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6MK */
/* JADX INFO: loaded from: classes3.dex */
public final class C11228 implements Appendable, CharSequence, AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0352 f35419;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2830 f35420;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f35421;

    public C11228(InterfaceC24329 interfaceC24329, C0352 c0352) {
        this.f35421 = interfaceC24329;
        this.f35419 = c0352;
        this.f35420 = new C2830(interfaceC24329, c0352, 524288);
    }

    @Override // java.lang.Appendable
    public final C11228 append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m28292(0, charSequence.length(), charSequence);
        return this;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C18334(i, i2, this);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f35420.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f35420.charAt(i);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws Throwable {
        this.f35420.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final C11228 append(char c) throws Throwable {
        this.f35420.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.f35420.append(charSequence, i, i2);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11228 m28292(int i, int i2, CharSequence charSequence) {
        this.f35420.append(charSequence, i, i2);
        return this;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28293(int i) {
        this.f35420.m9321(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11228 m28291() {
        return new C11228(this.f35421, this.f35419);
    }

    public final C8796 finish() {
        return this.f35420.finish();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f35420.close();
    }
}
