package l;

/* JADX INFO: renamed from: l.᩻ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1E3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24999 extends ThreadLocal {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18415 f80936;

    public C24999(C18415 c18415) {
        this.f80936 = c18415;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return this.f80936.matcher((CharSequence) "");
    }

    @Override // java.lang.ThreadLocal
    public final C4245 get() {
        C4245 c4245 = (C4245) super.get();
        C17359.requireNonNull(c4245);
        return c4245;
    }
}
