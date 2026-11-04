package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩵᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC20846 implements InterfaceC7421 {
    public static final EnumC20846 BEFORE_ROC;
    public static final EnumC20846 ROC;
    public static final /* synthetic */ EnumC20846[] a;

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

    public static EnumC20846 valueOf(String str) {
        return (EnumC20846) Enum.valueOf(EnumC20846.class, str);
    }

    public static EnumC20846[] values() {
        return (EnumC20846[]) a.clone();
    }

    static {
        EnumC20846 enumC20846 = new EnumC20846("BEFORE_ROC", 0);
        BEFORE_ROC = enumC20846;
        EnumC20846 enumC20847 = new EnumC20846("ROC", 1);
        ROC = enumC20847;
        a = new EnumC20846[]{enumC20846, enumC20847};
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
