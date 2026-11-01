package l;

/* JADX INFO: renamed from: l.᩷᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1E3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21199 extends ThreadLocal {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14690 f68998;

    public C21199(C14690 c14690) {
        this.f68998 = c14690;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return this.f68998.matcher((CharSequence) "");
    }

    @Override // java.lang.ThreadLocal
    public final C6222 get() {
        C6222 c6222 = (C6222) super.get();
        C13638.requireNonNull(c6222);
        return c6222;
    }
}
