package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.֨᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1455 implements InterfaceC7421 {
    public static final EnumC1455 BE;
    public static final EnumC1455 BEFORE_BE;
    public static final /* synthetic */ EnumC1455[] a;

    @Override // l.InterfaceC9437
    public final /* synthetic */ long C(InterfaceC16831 interfaceC16831) {
        return AbstractC2946.d(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final /* synthetic */ Object P(C14435 c14435) {
        return AbstractC2946.f(this, c14435);
    }

    @Override // l.InterfaceC9437
    public final /* synthetic */ boolean d(InterfaceC16831 interfaceC16831) {
        return AbstractC2946.e(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final /* synthetic */ int i(InterfaceC16831 interfaceC16831) {
        return AbstractC2946.c(this, interfaceC16831);
    }

    public static EnumC1455 valueOf(String str) {
        return (EnumC1455) Enum.valueOf(EnumC1455.class, str);
    }

    public static EnumC1455[] values() {
        return (EnumC1455[]) a.clone();
    }

    static {
        EnumC1455 enumC1455 = new EnumC1455("BEFORE_BE", 0);
        BEFORE_BE = enumC1455;
        EnumC1455 enumC1456 = new EnumC1455("BE", 1);
        BE = enumC1456;
        a = new EnumC1455[]{enumC1455, enumC1456};
    }

    @Override // l.InterfaceC7421
    public final int getValue() {
        return ordinal();
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        return AbstractC17577.d(this, interfaceC16831);
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        return interfaceC1235.b(getValue(), EnumC8692.ERA);
    }
}
