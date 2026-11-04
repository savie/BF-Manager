package l;

/* JADX INFO: renamed from: l.ۘ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes2.dex */
public final class C4378 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new C0560();
    }

    @Override // java.lang.ThreadLocal
    public final C0560 get() {
        C0560 c0560 = (C0560) super.get();
        C17359.requireNonNull(c0560);
        c0560.m2567();
        return c0560;
    }
}
