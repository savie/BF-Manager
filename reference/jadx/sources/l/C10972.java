package l;

/* JADX INFO: renamed from: l.ۧۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes3.dex */
public final class C10972 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new C2093();
    }

    @Override // java.lang.ThreadLocal
    public final C2093 get() {
        C2093 c2093 = (C2093) super.get();
        C13638.requireNonNull(c2093);
        c2093.m6636();
        return c2093;
    }
}
