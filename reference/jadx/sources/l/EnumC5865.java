package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '۟' uses external variables
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
/* JADX INFO: renamed from: l.ۚ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D26X */
/* JADX INFO: loaded from: classes3.dex */
public class EnumC5865 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC5865[] f20114;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC5865 f20115;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC5865 f20116;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C13477 f20117;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC5865 f20118;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC5865 f20119;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f20120;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f20121;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Set f20122;

    public /* synthetic */ EnumC5865(String str, int i, int i2) {
        this(str, i);
    }

    public static EnumC5865 valueOf(String str) {
        return (EnumC5865) Enum.valueOf(EnumC5865.class, str);
    }

    public static EnumC5865[] values() {
        return (EnumC5865[]) f20114.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC5865[] m17071() {
        return new EnumC5865[]{f20116, f20119, f20118, f20115};
    }

    static {
        EnumC16305 enumC16305 = EnumC16305.JDK1_8;
        f20116 = new EnumC5865("COMPACT1", 0, "compact1", 1, enumC16305, new EnumC16305[0]);
        f20119 = new EnumC5865("COMPACT2", 1, "compact2", 2, enumC16305, new EnumC16305[0]);
        f20118 = new EnumC5865("COMPACT3", 2, "compact3", 3, enumC16305, new EnumC16305[0]);
        f20115 = new C13322();
        f20114 = m17071();
        f20117 = new C13477();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC5865 m17070(C4747 c4747) {
        C13477 c13477 = f20117;
        EnumC5865 enumC5865M17069 = (EnumC5865) c4747.m14643(c13477);
        if (enumC5865M17069 == null) {
            String strM32423 = C13015.m32421(c4747).m32423(EnumC7687.f25339);
            if (strM32423 != null) {
                enumC5865M17069 = m17069(strM32423);
            }
            if (enumC5865M17069 == null) {
                enumC5865M17069 = f20115;
            }
            c4747.m14646(c13477, enumC5865M17069);
        }
        return enumC5865M17069;
    }

    public EnumC5865(String str, int i) {
        super(str, i);
        this.f20120 = null;
        this.f20121 = Integer.MAX_VALUE;
        this.f20122 = null;
    }

    public EnumC5865(String str, int i, String str2, int i2, EnumC16305 enumC16305, EnumC16305... enumC16305Arr) {
        super(str, i);
        this.f20120 = str2;
        this.f20121 = i2;
        this.f20122 = EnumSet.of(enumC16305, enumC16305Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC5865 m17069(String str) {
        for (EnumC5865 enumC5865 : values()) {
            if (str.equals(enumC5865.f20120)) {
                return enumC5865;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC5865 m17068(int i) {
        for (EnumC5865 enumC5865 : values()) {
            if (i == enumC5865.f20121) {
                return enumC5865;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo17072(EnumC16305 enumC16305) {
        return this.f20122.contains(enumC16305);
    }
}
