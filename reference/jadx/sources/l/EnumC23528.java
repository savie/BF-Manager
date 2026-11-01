package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '۫' uses external variables
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
/* JADX INFO: renamed from: l.᩻ۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: D26X */
/* JADX INFO: loaded from: classes.dex */
public class EnumC23528 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC23528 f76171;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC23528 f76172;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC23528 f76173;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC23528[] f76174;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC23528 f76175;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C16576 f76176;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f76177;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f76178;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Set f76179;

    public /* synthetic */ EnumC23528(String str, int i, int i2) {
        this(str, i);
    }

    public static EnumC23528 valueOf(String str) {
        return (EnumC23528) Enum.valueOf(EnumC23528.class, str);
    }

    public static EnumC23528[] values() {
        return (EnumC23528[]) f76174.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC23528[] m51836() {
        return new EnumC23528[]{f76173, f76175, f76171, f76172};
    }

    static {
        EnumC14128 enumC14128 = EnumC14128.JDK1_8;
        f76173 = new EnumC23528("COMPACT1", 0, "compact1", 1, enumC14128, new EnumC14128[0]);
        f76175 = new EnumC23528("COMPACT2", 1, "compact2", 2, enumC14128, new EnumC14128[0]);
        f76171 = new EnumC23528("COMPACT3", 2, "compact3", 3, enumC14128, new EnumC14128[0]);
        f76172 = new C10828();
        f76174 = m51836();
        f76176 = new C16576();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23528 m51835(C12343 c12343) {
        C16576 c16576 = f76176;
        EnumC23528 enumC23528M51834 = (EnumC23528) c12343.m30656(c16576);
        if (enumC23528M51834 == null) {
            String strM35398 = C14770.m35395(c12343).m35398(EnumC19730.f63397);
            if (strM35398 != null) {
                enumC23528M51834 = m51834(strM35398);
            }
            if (enumC23528M51834 == null) {
                enumC23528M51834 = f76172;
            }
            c12343.m30659(c16576, enumC23528M51834);
        }
        return enumC23528M51834;
    }

    public EnumC23528(String str, int i) {
        super(str, i);
        this.f76178 = null;
        this.f76177 = Integer.MAX_VALUE;
        this.f76179 = null;
    }

    public EnumC23528(String str, int i, String str2, int i2, EnumC14128 enumC14128, EnumC14128... enumC14128Arr) {
        super(str, i);
        this.f76178 = str2;
        this.f76177 = i2;
        this.f76179 = EnumSet.of(enumC14128, enumC14128Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23528 m51834(String str) {
        for (EnumC23528 enumC23528 : values()) {
            if (str.equals(enumC23528.f76178)) {
                return enumC23528;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23528 m51833(int i) {
        for (EnumC23528 enumC23528 : values()) {
            if (i == enumC23528.f76177) {
                return enumC23528;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo27147(EnumC14128 enumC14128) {
        return this.f76179.contains(enumC14128);
    }
}
