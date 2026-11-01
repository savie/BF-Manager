package l;

/* JADX INFO: renamed from: l.᩺ۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes.dex */
public final class C22944 implements InterfaceC9081 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19664[] f74574;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21074 f74575;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17299 f74576;

    public C22944(InterfaceC19664... interfaceC19664Arr) {
        C17299 c17299 = new C17299();
        C21074 c21074 = new C21074();
        InterfaceC19664[] interfaceC19664Arr2 = new InterfaceC19664[interfaceC19664Arr.length + 2];
        this.f74574 = interfaceC19664Arr2;
        System.arraycopy(interfaceC19664Arr, 0, interfaceC19664Arr2, 0, interfaceC19664Arr.length);
        this.f74576 = c17299;
        this.f74575 = c21074;
        interfaceC19664Arr2[interfaceC19664Arr.length] = c17299;
        interfaceC19664Arr2[interfaceC19664Arr.length + 1] = c21074;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19664[] m50783() {
        return this.f74574;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21449 m50781(C21449 c21449) {
        float f = c21449.f69728;
        C21074 c21074 = this.f74575;
        c21074.m47485(f);
        c21074.m47484(c21449.f69727);
        return c21449;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50782(boolean z) {
        this.f74576.m40267(z);
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m50780(long j) {
        C21074 c21074 = this.f74575;
        return c21074.mo26629() ? c21074.m47483(j) : j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m50784() {
        return this.f74576.m40266();
    }
}
