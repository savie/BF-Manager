package l;

/* JADX INFO: renamed from: l.᩵ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAQI */
/* JADX INFO: loaded from: classes4.dex */
public final class C19396 extends Exception {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f62532;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f62533;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f62534;

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }

    public C19396(int i, String str) {
        super(C16737.m39288(i));
        this.f62534 = str;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m44441() {
        this.f62533 = true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m44443() {
        this.f62532 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m44442() {
        return this.f62534;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m44445() {
        return this.f62533;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m44444() {
        return this.f62532;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return getMessage() + "\n" + this.f62534;
    }
}
