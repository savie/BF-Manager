package l;

/* JADX INFO: renamed from: l.᩶ܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: NATX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21399 extends ThreadLocal {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18415 f68161;

    public C21399(C18415 c18415) {
        this.f68161 = c18415;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return this.f68161.matcher((CharSequence) "");
    }

    @Override // java.lang.ThreadLocal
    public final C4245 get() {
        C4245 c4245 = (C4245) super.get();
        C17359.requireNonNull(c4245);
        return c4245;
    }
}
