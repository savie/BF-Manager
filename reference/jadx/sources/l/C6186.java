package l;

/* JADX INFO: renamed from: l.ۛܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6186 implements InterfaceC21584 {
    public final /* synthetic */ InterfaceC17579 a;
    public final /* synthetic */ InterfaceC21584 b;
    public final /* synthetic */ InterfaceC21233 c;
    public final /* synthetic */ AbstractC9114 d;

    @Override // l.InterfaceC21584
    public final /* synthetic */ int l(InterfaceC11002 interfaceC11002) {
        return AbstractC23702.a(this, interfaceC11002);
    }

    public C6186(InterfaceC17579 interfaceC17579, InterfaceC21584 interfaceC21584, InterfaceC21233 interfaceC21233, AbstractC9114 abstractC9114) {
        this.a = interfaceC17579;
        this.b = interfaceC21584;
        this.c = interfaceC21233;
        this.d = abstractC9114;
    }

    @Override // l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        InterfaceC17579 interfaceC17579 = this.a;
        if (interfaceC17579 != null && interfaceC11002.isDateBased()) {
            return interfaceC17579.e(interfaceC11002);
        }
        return this.b.e(interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        InterfaceC17579 interfaceC17579 = this.a;
        if (interfaceC17579 != null && interfaceC11002.isDateBased()) {
            return interfaceC17579.n(interfaceC11002);
        }
        return this.b.n(interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        InterfaceC17579 interfaceC17579 = this.a;
        if (interfaceC17579 != null && interfaceC11002.isDateBased()) {
            return interfaceC17579.G(interfaceC11002);
        }
        return this.b.G(interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final Object T(C22935 c22935) {
        if (c22935 == AbstractC23702.b) {
            return this.c;
        }
        if (c22935 == AbstractC23702.a) {
            return this.d;
        }
        if (c22935 == AbstractC23702.c) {
            return this.b.T(c22935);
        }
        return c22935.h(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        InterfaceC21233 interfaceC21233 = this.c;
        if (interfaceC21233 != null) {
            str = " with chronology " + interfaceC21233;
        } else {
            str = "";
        }
        AbstractC9114 abstractC9114 = this.d;
        if (abstractC9114 != null) {
            str2 = " with zone " + abstractC9114;
        }
        return this.b + str + str2;
    }
}
