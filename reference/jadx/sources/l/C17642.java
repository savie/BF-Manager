package l;

/* JADX INFO: renamed from: l.ܽܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17642 implements InterfaceC9437 {
    public final /* synthetic */ InterfaceC17116 a;
    public final /* synthetic */ InterfaceC9437 b;
    public final /* synthetic */ InterfaceC8912 c;
    public final /* synthetic */ AbstractC22338 d;

    @Override // l.InterfaceC9437
    public final /* synthetic */ int i(InterfaceC16831 interfaceC16831) {
        return AbstractC17577.a(this, interfaceC16831);
    }

    public C17642(InterfaceC17116 interfaceC17116, InterfaceC9437 interfaceC9437, InterfaceC8912 interfaceC8912, AbstractC22338 abstractC22338) {
        this.a = interfaceC17116;
        this.b = interfaceC9437;
        this.c = interfaceC8912;
        this.d = abstractC22338;
    }

    @Override // l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        InterfaceC17116 interfaceC17116 = this.a;
        if (interfaceC17116 != null && interfaceC16831.isDateBased()) {
            return interfaceC17116.d(interfaceC16831);
        }
        return this.b.d(interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        InterfaceC17116 interfaceC17116 = this.a;
        if (interfaceC17116 != null && interfaceC16831.isDateBased()) {
            return interfaceC17116.k(interfaceC16831);
        }
        return this.b.k(interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        InterfaceC17116 interfaceC17116 = this.a;
        if (interfaceC17116 != null && interfaceC16831.isDateBased()) {
            return interfaceC17116.C(interfaceC16831);
        }
        return this.b.C(interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final Object P(C14435 c14435) {
        if (c14435 == AbstractC17577.b) {
            return this.c;
        }
        if (c14435 == AbstractC17577.a) {
            return this.d;
        }
        if (c14435 == AbstractC17577.c) {
            return this.b.P(c14435);
        }
        return c14435.g(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        InterfaceC8912 interfaceC8912 = this.c;
        if (interfaceC8912 != null) {
            str = " with chronology " + interfaceC8912;
        } else {
            str = "";
        }
        AbstractC22338 abstractC22338 = this.d;
        if (abstractC22338 != null) {
            str2 = " with zone " + abstractC22338;
        }
        return this.b + str + str2;
    }
}
