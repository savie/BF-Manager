package l;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.agreement.srp.SRP6StandardGroups;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v6 l.ܶ᩵ۘ, still in use, count: 1, list:
  (r0v6 l.ܶ᩵ۘ) from 0x0121: SPUT (r0v6 l.ܶ᩵ۘ) (LINE:104) l.ܶ᩵ۘ.᩻ۙ l.ܶ᩵ۘ
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
/* JADX INFO: renamed from: l.ܶ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F45A */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC16305 {
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


    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC16305 f52927;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16305 f52942 = new EnumC16305("7", 51, 0);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f52943;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f52944;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f52945;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final C13477 f52937 = new C13477();

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16305 f52932 = values()[values().length - 1];

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final Map f52936 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public char m38664() {
        return '$';
    }

    public static EnumC16305 valueOf(String str) {
        return (EnumC16305) Enum.valueOf(EnumC16305.class, str);
    }

    public static EnumC16305[] values() {
        return (EnumC16305[]) f52920.clone();
    }

    static {
        for (EnumC16305 enumC16305 : values()) {
            f52936.put(enumC16305.f52944, enumC16305);
        }
        Map map = f52936;
        map.put("1.5", JDK1_5);
        map.put("1.6", JDK1_6);
        map.put("1.7", JDK1_7);
        map.put("1.8", JDK1_8);
        map.put("1.9", JDK1_9);
        map.put("1.10", JDK1_10);
        f52927 = values()[values().length - 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC16305 m38659(C4747 c4747) {
        C13477 c13477 = f52937;
        EnumC16305 enumC16305M38658 = (EnumC16305) c4747.m14643(c13477);
        if (enumC16305M38658 == null) {
            String strM32423 = C13015.m32421(c4747).m32423(EnumC7687.f25350);
            if (strM32423 != null) {
                enumC16305M38658 = m38658(strM32423);
            }
            if (enumC16305M38658 == null) {
                enumC16305M38658 = f52927;
            }
            c4747.m14646(c13477, enumC16305M38658);
        }
        return enumC16305M38658;
    }

    public EnumC16305(String str, int i, int i2) {
        super(str, i);
        this.f52944 = str;
        this.f52943 = i;
        this.f52945 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC16305 m38658(String str) {
        return (EnumC16305) f52936.get(str);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean m38671() {
        return compareTo(f52942) >= 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m38669() {
        return compareTo(JDK1_8) >= 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m38661() {
        return compareTo(JDK1_9) >= 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String m38666() {
        return Integer.toString((ordinal() - JDK1_1.ordinal()) + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m38662() {
        return compareTo(JDK1_11) >= 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m38667() {
        return compareTo(JDK1_11) >= 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean m38668() {
        return compareTo(JDK1_15) >= 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m38663() {
        return compareTo(JDK1_11) >= 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean m38665() {
        return compareTo(JDK1_15) >= 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean m38670() {
        return compareTo(JDK1_17) >= 0;
    }
}
