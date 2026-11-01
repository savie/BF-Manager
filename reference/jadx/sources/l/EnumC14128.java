package l;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.agreement.srp.SRP6StandardGroups;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v6 l.ܰ᩺۟, still in use, count: 1, list:
  (r0v6 l.ܰ᩺۟) from 0x0121: SPUT (r0v6 l.ܰ᩺۟) (LINE:104) l.ܰ᩺۟.᩺ۙ l.ܰ᩺۟
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ܰ᩺۟, reason: contains not printable characters */
/* JADX INFO: compiled from: F45A */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC14128 {
    JDK1_1("1.1", 45, 3),
    JDK1_2("1.2", 46, 0),
    JDK1_3("1.3", 47, 0),
    JDK1_4("1.4", 48, 0),
    JDK1_5("5", 49, 0),
    JDK1_6("6", 50, 0),
    JDK1_7("7", 51, 0),
    JDK1_8("8", 52, 0),
    JDK1_9("9", 53, 0),
    JDK1_10("10", 54, 0),
    JDK1_11("11", 55, 0),
    JDK1_12("12", 56, 0),
    JDK1_13(SRP6StandardGroups.rfc5054_8192_g, 57, 0),
    JDK1_14("14", 58, 0),
    JDK1_15("15", 59, 0),
    JDK1_16("16", 60, 0),
    JDK1_17("17", 61, 0);


    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC14128 f46376;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC14128 f46385 = new EnumC14128("7", 51, 0);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f46387;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f46388;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f46389;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final C16576 f46383 = new C16576();

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC14128 f46372 = values()[values().length - 1];

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final Map f46380 = new HashMap();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public char m34166() {
        return '$';
    }

    public static EnumC14128 valueOf(String str) {
        return (EnumC14128) Enum.valueOf(EnumC14128.class, str);
    }

    public static EnumC14128[] values() {
        return (EnumC14128[]) f46381.clone();
    }

    static {
        for (EnumC14128 enumC14128 : values()) {
            f46380.put(enumC14128.f46387, enumC14128);
        }
        Map map = f46380;
        map.put("1.5", JDK1_5);
        map.put("1.6", JDK1_6);
        map.put("1.7", JDK1_7);
        map.put("1.8", JDK1_8);
        map.put("1.9", JDK1_9);
        map.put("1.10", JDK1_10);
        f46376 = values()[values().length - 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC14128 m34159(C12343 c12343) {
        C16576 c16576 = f46383;
        EnumC14128 enumC14128M34158 = (EnumC14128) c12343.m30656(c16576);
        if (enumC14128M34158 == null) {
            String strM35398 = C14770.m35395(c12343).m35398(EnumC19730.f63392);
            if (strM35398 != null) {
                enumC14128M34158 = m34158(strM35398);
            }
            if (enumC14128M34158 == null) {
                enumC14128M34158 = f46376;
            }
            c12343.m30659(c16576, enumC14128M34158);
        }
        return enumC14128M34158;
    }

    public EnumC14128(String str, int i, int i2) {
        super(str, i);
        this.f46387 = str;
        this.f46388 = i;
        this.f46389 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC14128 m34158(String str) {
        return (EnumC14128) f46380.get(str);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean m34171() {
        return compareTo(f46385) >= 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m34167() {
        return compareTo(JDK1_8) >= 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean m34162() {
        return compareTo(JDK1_9) >= 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String m34168() {
        return Integer.toString((ordinal() - JDK1_1.ordinal()) + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m34163() {
        return compareTo(JDK1_11) >= 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m34164() {
        return compareTo(JDK1_11) >= 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean m34170() {
        return compareTo(JDK1_15) >= 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean m34165() {
        return compareTo(JDK1_11) >= 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean m34161() {
        return compareTo(JDK1_15) >= 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m34169() {
        return compareTo(JDK1_17) >= 0;
    }
}
