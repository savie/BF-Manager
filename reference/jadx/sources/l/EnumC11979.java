package l;

import java.util.EnumSet;
import java.util.function.Consumer;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v21 l.ۧ᩻᩺, still in use, count: 1, list:
  (r0v21 l.ۧ᩻᩺) from 0x0160: INVOKE (r0v21 l.ۧ᩻᩺) STATIC call: java.util.EnumSet.of(java.lang.Enum):java.util.EnumSet A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>):java.util.EnumSet<E extends java.lang.Enum<E>> (c), WRAPPED] (LINE:113)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ۧ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC11979 {
    NONE("No options"),
    CONSTANT_POOL("Constant Pool"),
    PRINT_BCI("Program Counter - for all instructions"),
    LABELS("Labels (as identifiers)"),
    CP_INDEX("CP index along with arguments"),
    LINE_NUMBER_TABLE_Numbers("Line Numbers in comments"),
    LINE_NUMBER_TABLE_Lines("Java Source Lines in comments"),
    LINE_NUMBER_TABLE_Table("LineNumberTable attribute as table"),
    LINE_NUMBER_TABLE_All("Line Numbers, Source Lines, attribute as Table", new C6014()),
    LOCAL_VARIABLE_Vars("Print LocalVariableTable attribute"),
    LOCAL_VARIABLE_Types("Print LocalVariableTypeTable attribute"),
    LOCAL_VARIABLE_All("Print both LocalVariableTable and LocalVariableTypeTable attributes", new C2285()),
    HEX("Numbers as hexadecimals"),
    TRACE("Print internal traces, debug information"),
    SYSINFO("system information"),
    NO_COMMENTS("No comments, suppress printing comments"),
    VERBOSE("Verbose information"),
    TABLE("Attributes as table"),
    DROP_Source("Discard SourceFile attribute"),
    DROP_Signatures("Discard Signature attribute"),
    DROP_Classes("Discard this_class and super_class pair"),
    DROP_CharacterRange("Discard CharacterRangeTable attribute"),
    DROP_All("Discard SourceFile, CharacterRangeTable attributes, this_class and super_class pair", new C22689(3)),
    DETAILED_Output("Detailed output"),
    EXTRA_DETAILED_Output("Detailed output, this_class and super_class pair"),
    BEST_EFFORT("Print as much as possible despite errors");


    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f38595 = EnumSet.of(new EnumC11979("Discard CharacterRangeTable attribute"));

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Consumer f38600;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f38601;

    public static EnumC11979 valueOf(String str) {
        return (EnumC11979) Enum.valueOf(EnumC11979.class, str);
    }

    public static EnumC11979[] values() {
        return (EnumC11979[]) f38592.clone();
    }

    static {
    }

    public EnumC11979(String str) {
        super(str, i);
        this.f38601 = str;
        this.f38600 = null;
    }

    public EnumC11979(String str, Consumer consumer) {
        super(str, i);
        this.f38601 = str;
        this.f38600 = consumer;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m30073() {
        Consumer consumer = this.f38600;
        if (consumer != null) {
            consumer.accept(this);
        } else {
            C25406.m56768(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC11979 m30065(String str, String str2) {
        int iLastIndexOf;
        for (EnumC11979 enumC11979 : values()) {
            String strName = enumC11979.name();
            if (strName.startsWith(str) && (iLastIndexOf = enumC11979.name().lastIndexOf(95)) > 0 && strName.substring(iLastIndexOf + 1).equalsIgnoreCase(str2)) {
                return enumC11979;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m30074() {
        return !f38595.contains(this);
    }
}
