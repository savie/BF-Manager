package l;

/* JADX INFO: renamed from: l.۠ۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes4.dex */
public final class C8541 implements InterfaceC11085 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22274[] f27896;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15560 f27897;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17229 f27898;

    public C8541(InterfaceC22274... interfaceC22274Arr) {
        C17229 c17229 = new C17229();
        C15560 c15560 = new C15560();
        InterfaceC22274[] interfaceC22274Arr2 = new InterfaceC22274[interfaceC22274Arr.length + 2];
        this.f27896 = interfaceC22274Arr2;
        System.arraycopy(interfaceC22274Arr, 0, interfaceC22274Arr2, 0, interfaceC22274Arr.length);
        this.f27898 = c17229;
        this.f27897 = c15560;
        interfaceC22274Arr2[interfaceC22274Arr.length] = c17229;
        interfaceC22274Arr2[interfaceC22274Arr.length + 1] = c15560;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22274[] m22854() {
        return this.f27896;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7445 m22852(C7445 c7445) {
        float f = c7445.f24500;
        C15560 c15560 = this.f27897;
        c15560.m37282(f);
        c15560.m37279(c7445.f24499);
        return c7445;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22853(boolean z) {
        this.f27898.m40468(z);
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m22851(long j) {
        C15560 c15560 = this.f27897;
        return c15560.mo37280() ? c15560.m37277(j) : j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m22855() {
        return this.f27898.m40467();
    }
}
