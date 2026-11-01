package l;

/* JADX INFO: renamed from: l.᩷ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20825 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CharSequence f67679;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f67680;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3329 f67681;

    public C20825(CharSequence charSequence, C3329 c3329) {
        this.f67679 = charSequence;
        this.f67681 = c3329;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20825 m46853(CharSequence charSequence) {
        if (charSequence instanceof InterfaceC0507) {
            C3329 c3329Mo2398 = ((InterfaceC0507) charSequence).mo2398();
            return new C20825(c3329Mo2398, c3329Mo2398);
        }
        return new C20825(charSequence, null);
    }

    public final CharSequence range(int i, int i2) {
        int length = length();
        if (i >= 0 && i2 >= i && i2 <= length) {
            return new C7419(this, i, i2);
        }
        throw new IndexOutOfBoundsException("Invalid diff text range");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m46855(C20825 c20825) {
        if (c20825.f67680) {
            throw new IllegalStateException("Diff reader is closed");
        }
    }

    public final int length() {
        if (!this.f67680) {
            return this.f67679.length();
        }
        throw new IllegalStateException("Diff reader is closed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46854(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException("Invalid diff text range");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f67680) {
            return;
        }
        this.f67680 = true;
        C3329 c3329 = this.f67681;
        if (c3329 != null) {
            c3329.close();
        }
    }
}
