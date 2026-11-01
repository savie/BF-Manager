package l;

import java.util.EnumSet;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '֡' uses external variables
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
/* JADX INFO: renamed from: l.ᩴ᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC19089 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC19089 f61673;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC19089 f61674;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19089 f61675;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC19089[] f61676;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumSet f61677;

    public static EnumC19089 valueOf(String str) {
        return (EnumC19089) Enum.valueOf(EnumC19089.class, str);
    }

    public static EnumC19089[] values() {
        return (EnumC19089[]) f61676.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC19089[] m43864() {
        return new EnumC19089[]{f61673, f61675, f61674};
    }

    static {
        EnumC13880 enumC13880 = EnumC13880.f45738;
        f61673 = new EnumC19089("EQ", 0, EnumSet.of(enumC13880));
        EnumC13880 enumC13881 = EnumC13880.f45737;
        f61675 = new EnumC19089("EQ_LOWER", 1, EnumSet.of(enumC13880, enumC13881));
        f61674 = new EnumC19089("EQ_LOWER_THROWS_UPPER_CAPTURED", 2, EnumSet.of(enumC13880, enumC13881, EnumC13880.f45735, EnumC13880.f45739, EnumC13880.f45734));
        f61676 = m43864();
    }

    public EnumC19089(String str, int i, EnumSet enumSet) {
        super(str, i);
        this.f61677 = enumSet;
    }
}
