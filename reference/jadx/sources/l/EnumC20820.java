package l;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.agreement.srp.SRP6StandardGroups;

/* JADX INFO: renamed from: l.᩵᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M4ER */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20820 {
    JDK1_2("1.2"),
    JDK1_3("1.3"),
    JDK1_4("1.4"),
    JDK5("5"),
    JDK6("6"),
    JDK7("7"),
    JDK8("8"),
    JDK9("9"),
    JDK10("10"),
    JDK11("11"),
    JDK12("12"),
    JDK13(SRP6StandardGroups.rfc5054_8192_g),
    JDK14("14"),
    JDK15("15"),
    JDK16("16"),
    JDK17("17");


    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC20820 f66668;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC20820 f66676;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC20820 f66679;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f66685;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final C13477 f66665 = new C13477();

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final Map f66675 = new HashMap();

    static {
        for (EnumC20820 enumC20820 : values()) {
            f66675.put(enumC20820.f66685, enumC20820);
        }
        Map map = f66675;
        map.put("1.5", JDK5);
        map.put("1.6", JDK6);
        EnumC20820 enumC20821 = JDK7;
        map.put("1.7", enumC20821);
        map.put("1.8", JDK8);
        map.put("1.9", JDK9);
        map.put("1.10", JDK10);
        f66668 = enumC20821;
        EnumC20820 enumC20822 = values()[values().length - 1];
        f66676 = enumC20822;
        f66679 = enumC20822;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC20820 m47625(C4747 c4747) {
        C13477 c13477 = f66665;
        EnumC20820 enumC20820M47624 = (EnumC20820) c4747.m14643(c13477);
        if (enumC20820M47624 == null) {
            String strM32423 = C13015.m32421(c4747).m32423(EnumC7687.f25299);
            if (strM32423 != null) {
                enumC20820M47624 = m47624(strM32423);
            }
            if (enumC20820M47624 == null) {
                enumC20820M47624 = f66679;
            }
            c4747.m14646(c13477, enumC20820M47624);
        }
        return enumC20820M47624;
    }

    EnumC20820(String str) {
        this.f66685 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC20820 m47624(String str) {
        return (EnumC20820) f66675.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m47629() {
        return compareTo(f66668) >= 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC16305 m47630() {
        switch (ordinal()) {
            case 2:
                return EnumC16305.JDK1_4;
            case 3:
                return EnumC16305.JDK1_5;
            case 4:
                return EnumC16305.JDK1_6;
            case 5:
                return EnumC16305.JDK1_7;
            case 6:
                return EnumC16305.JDK1_8;
            case 7:
                return EnumC16305.JDK1_9;
            case 8:
                return EnumC16305.JDK1_10;
            case 9:
                return EnumC16305.JDK1_11;
            case 10:
                return EnumC16305.JDK1_12;
            case 11:
                return EnumC16305.JDK1_13;
            case 12:
                return EnumC16305.JDK1_14;
            case 13:
                return EnumC16305.JDK1_15;
            case 14:
                return EnumC16305.JDK1_16;
            case 15:
                return EnumC16305.JDK1_17;
            default:
                return EnumC16305.JDK1_1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC21704 m47626(EnumC20820 enumC20820) {
        switch (enumC20820) {
            case JDK1_2:
                return EnumC21704.RELEASE_2;
            case JDK1_3:
                return EnumC21704.RELEASE_3;
            case JDK1_4:
                return EnumC21704.RELEASE_4;
            case JDK5:
                return EnumC21704.RELEASE_5;
            case JDK6:
                return EnumC21704.RELEASE_6;
            case JDK7:
                return EnumC21704.RELEASE_7;
            case JDK8:
                return EnumC21704.RELEASE_8;
            case JDK9:
                return EnumC21704.RELEASE_9;
            case JDK10:
                return EnumC21704.RELEASE_10;
            case JDK11:
                return EnumC21704.RELEASE_11;
            case JDK12:
                return EnumC21704.RELEASE_12;
            case JDK13:
                return EnumC21704.RELEASE_13;
            case JDK14:
                return EnumC21704.RELEASE_14;
            case JDK15:
                return EnumC21704.RELEASE_15;
            case JDK16:
                return EnumC21704.RELEASE_16;
            case JDK17:
                return EnumC21704.RELEASE_17;
            default:
                return null;
        }
    }
}
