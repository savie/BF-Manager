package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩸ᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC22996 implements InterfaceC7421 {
    public static final EnumC22996 AH;
    public static final /* synthetic */ EnumC22996[] a;

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

    @Override // l.InterfaceC7421
    public final int getValue() {
        return 1;
    }

    @Override // l.InterfaceC9437
    public final /* synthetic */ int i(InterfaceC16831 interfaceC16831) {
        return AbstractC2946.c(this, interfaceC16831);
    }

    public static EnumC22996 valueOf(String str) {
        return (EnumC22996) Enum.valueOf(EnumC22996.class, str);
    }

    public static EnumC22996[] values() {
        return (EnumC22996[]) a.clone();
    }

    static {
        EnumC22996 enumC22996 = new EnumC22996("AH", 0);
        AH = enumC22996;
        a = new EnumC22996[]{enumC22996};
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 == EnumC8692.ERA) {
            return C23545.f(1L, 1L);
        }
        return AbstractC17577.d(this, interfaceC16831);
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        return interfaceC1235.b(1, EnumC8692.ERA);
    }
}
