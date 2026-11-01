package l;

/* JADX INFO: renamed from: l.᩻ᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: NATX */
/* JADX INFO: loaded from: classes.dex */
public final class C23862 extends ThreadLocal {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14690 f77131;

    public C23862(C14690 c14690) {
        this.f77131 = c14690;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return this.f77131.matcher((CharSequence) "");
    }

    @Override // java.lang.ThreadLocal
    public final C6222 get() {
        C6222 c6222 = (C6222) super.get();
        C13638.requireNonNull(c6222);
        return c6222;
    }
}
