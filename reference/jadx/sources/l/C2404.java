package l;

/* JADX INFO: renamed from: l.ۖۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes2.dex */
public final class C2404 extends ThreadLocal {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f7720;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f7721;

    public C2404(boolean z, boolean z2) {
        this.f7720 = z;
        this.f7721 = z2;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        C5564 c5564 = new C5564();
        c5564.f19336 = false;
        c5564.f19335 = true;
        c5564.f19338 = true ^ this.f7720;
        c5564.f19333 = this.f7721;
        return c5564;
    }

    @Override // java.lang.ThreadLocal
    public final C5564 get() {
        C5564 c5564 = (C5564) super.get();
        C17359.requireNonNull(c5564);
        return c5564;
    }
}
