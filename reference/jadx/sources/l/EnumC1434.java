package l;

import java.util.EnumSet;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ܿ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.֨᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1434 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC1434 f5032;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC1434 f5033;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC1434 f5034;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC1434[] f5035;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumSet f5036;

    public static EnumC1434 valueOf(String str) {
        return (EnumC1434) Enum.valueOf(EnumC1434.class, str);
    }

    public static EnumC1434[] values() {
        return (EnumC1434[]) f5035.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC1434[] m5172() {
        return new EnumC1434[]{f5034, f5032, f5033};
    }

    static {
        EnumC3342 enumC3342 = EnumC3342.f10913;
        f5034 = new EnumC1434("EQ", 0, EnumSet.of(enumC3342));
        EnumC3342 enumC3343 = EnumC3342.f10915;
        f5032 = new EnumC1434("EQ_LOWER", 1, EnumSet.of(enumC3342, enumC3343));
        f5033 = new EnumC1434("EQ_LOWER_THROWS_UPPER_CAPTURED", 2, EnumSet.of(enumC3342, enumC3343, EnumC3342.f10916, EnumC3342.f10918, EnumC3342.f10917));
        f5035 = m5172();
    }

    public EnumC1434(String str, int i, EnumSet enumSet) {
        super(str, i);
        this.f5036 = enumSet;
    }
}
