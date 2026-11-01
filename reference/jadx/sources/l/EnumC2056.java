package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.֫᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2056 implements InterfaceC17705 {
    public static final EnumC2056 BEFORE_ROC;
    public static final EnumC2056 ROC;
    public static final /* synthetic */ EnumC2056[] a;

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

    public static EnumC2056 valueOf(String str) {
        return (EnumC2056) Enum.valueOf(EnumC2056.class, str);
    }

    public static EnumC2056[] values() {
        return (EnumC2056[]) a.clone();
    }

    static {
        EnumC2056 enumC2056 = new EnumC2056("BEFORE_ROC", 0);
        BEFORE_ROC = enumC2056;
        EnumC2056 enumC2057 = new EnumC2056("ROC", 1);
        ROC = enumC2057;
        a = new EnumC2056[]{enumC2056, enumC2057};
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
