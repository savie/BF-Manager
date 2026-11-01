package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۤ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC9945 implements InterfaceC17705 {
    public static final EnumC9945 AH;
    public static final /* synthetic */ EnumC9945[] a;

    @Override // l.InterfaceC21584
    public final /* synthetic */ long G(InterfaceC11002 interfaceC11002) {
        return AbstractC14884.d(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final /* synthetic */ Object T(C22935 c22935) {
        return AbstractC14884.f(this, c22935);
    }

    @Override // l.InterfaceC21584
    public final /* synthetic */ boolean e(InterfaceC11002 interfaceC11002) {
        return AbstractC14884.e(this, interfaceC11002);
    }

    @Override // l.InterfaceC17705
    public final int getValue() {
        return 1;
    }

    @Override // l.InterfaceC21584
    public final /* synthetic */ int l(InterfaceC11002 interfaceC11002) {
        return AbstractC14884.c(this, interfaceC11002);
    }

    public static EnumC9945 valueOf(String str) {
        return (EnumC9945) Enum.valueOf(EnumC9945.class, str);
    }

    public static EnumC9945[] values() {
        return (EnumC9945[]) a.clone();
    }

    static {
        EnumC9945 enumC9945 = new EnumC9945("AH", 0);
        AH = enumC9945;
        a = new EnumC9945[]{enumC9945};
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 == EnumC18762.ERA) {
            return C1828.f(1L, 1L);
        }
        return AbstractC23702.d(this, interfaceC11002);
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        return interfaceC15235.c(1, EnumC18762.ERA);
    }
}
