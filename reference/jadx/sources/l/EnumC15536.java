package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܳᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC15536 implements InterfaceC7421 {
    public static final EnumC15536 BCE;
    public static final EnumC15536 CE;
    public static final /* synthetic */ EnumC15536[] a;

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

    public static EnumC15536 valueOf(String str) {
        return (EnumC15536) Enum.valueOf(EnumC15536.class, str);
    }

    public static EnumC15536[] values() {
        return (EnumC15536[]) a.clone();
    }

    static {
        EnumC15536 enumC15536 = new EnumC15536("BCE", 0);
        BCE = enumC15536;
        EnumC15536 enumC15537 = new EnumC15536("CE", 1);
        CE = enumC15537;
        a = new EnumC15536[]{enumC15536, enumC15537};
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
