package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۜ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6416 implements InterfaceC17705 {
    public static final EnumC6416 BE;
    public static final EnumC6416 BEFORE_BE;
    public static final /* synthetic */ EnumC6416[] a;

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

    @Override // l.InterfaceC21584
    public final /* synthetic */ int l(InterfaceC11002 interfaceC11002) {
        return AbstractC14884.c(this, interfaceC11002);
    }

    public static EnumC6416 valueOf(String str) {
        return (EnumC6416) Enum.valueOf(EnumC6416.class, str);
    }

    public static EnumC6416[] values() {
        return (EnumC6416[]) a.clone();
    }

    static {
        EnumC6416 enumC6416 = new EnumC6416("BEFORE_BE", 0);
        BEFORE_BE = enumC6416;
        EnumC6416 enumC6417 = new EnumC6416("BE", 1);
        BE = enumC6417;
        a = new EnumC6416[]{enumC6416, enumC6417};
    }

    @Override // l.InterfaceC17705
    public final int getValue() {
        return ordinal();
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        return AbstractC23702.d(this, interfaceC11002);
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        return interfaceC15235.c(getValue(), EnumC18762.ERA);
    }
}
