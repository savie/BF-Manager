package l;

/* JADX INFO: renamed from: l.ܰܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C13923 extends ThreadLocal {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f45852;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f45853;

    public C13923(boolean z, boolean z2) {
        this.f45852 = z;
        this.f45853 = z2;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        C20424 c20424 = new C20424();
        c20424.f66203 = false;
        c20424.f66197 = true;
        c20424.f66199 = true ^ this.f45852;
        c20424.f66195 = this.f45853;
        return c20424;
    }

    @Override // java.lang.ThreadLocal
    public final C20424 get() {
        C20424 c20424 = (C20424) super.get();
        C13638.requireNonNull(c20424);
        return c20424;
    }
}
