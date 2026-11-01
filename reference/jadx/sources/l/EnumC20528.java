package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩷֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC20528 implements InterfaceC17705 {
    public static final EnumC20528 BCE;
    public static final EnumC20528 CE;
    public static final /* synthetic */ EnumC20528[] a;

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

    public static EnumC20528 valueOf(String str) {
        return (EnumC20528) Enum.valueOf(EnumC20528.class, str);
    }

    public static EnumC20528[] values() {
        return (EnumC20528[]) a.clone();
    }

    static {
        EnumC20528 enumC20528 = new EnumC20528("BCE", 0);
        BCE = enumC20528;
        EnumC20528 enumC20529 = new EnumC20528("CE", 1);
        CE = enumC20529;
        a = new EnumC20528[]{enumC20528, enumC20529};
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
