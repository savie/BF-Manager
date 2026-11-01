package l;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.agreement.srp.SRP6StandardGroups;

/* JADX INFO: renamed from: l.ۨ᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4ER */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC11909 {
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


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC11909 f39952;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC11909 f39953;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC11909 f39966;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f39974;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final C16576 f39957 = new C16576();

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final Map f39961 = new HashMap();

    static {
        for (EnumC11909 enumC11909 : values()) {
            f39961.put(enumC11909.f39974, enumC11909);
        }
        Map map = f39961;
        map.put("1.5", JDK5);
        map.put("1.6", JDK6);
        EnumC11909 enumC119010 = JDK7;
        map.put("1.7", enumC119010);
        map.put("1.8", JDK8);
        map.put("1.9", JDK9);
        map.put("1.10", JDK10);
        f39966 = enumC119010;
        EnumC11909 enumC119011 = values()[values().length - 1];
        f39953 = enumC119011;
        f39952 = enumC119011;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC11909 m29706(C12343 c12343) {
        C16576 c16576 = f39957;
        EnumC11909 enumC11909M29705 = (EnumC11909) c12343.m30656(c16576);
        if (enumC11909M29705 == null) {
            String strM35398 = C14770.m35395(c12343).m35398(EnumC19730.f63357);
            if (strM35398 != null) {
                enumC11909M29705 = m29705(strM35398);
            }
            if (enumC11909M29705 == null) {
                enumC11909M29705 = f39952;
            }
            c12343.m30659(c16576, enumC11909M29705);
        }
        return enumC11909M29705;
    }

    EnumC11909(String str) {
        this.f39974 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC11909 m29705(String str) {
        return (EnumC11909) f39961.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m29709() {
        return compareTo(f39966) >= 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC14128 m29710() {
        switch (ordinal()) {
            case 2:
                return EnumC14128.JDK1_4;
            case 3:
                return EnumC14128.JDK1_5;
            case 4:
                return EnumC14128.JDK1_6;
            case 5:
                return EnumC14128.JDK1_7;
            case 6:
                return EnumC14128.JDK1_8;
            case 7:
                return EnumC14128.JDK1_9;
            case 8:
                return EnumC14128.JDK1_10;
            case 9:
                return EnumC14128.JDK1_11;
            case 10:
                return EnumC14128.JDK1_12;
            case 11:
                return EnumC14128.JDK1_13;
            case 12:
                return EnumC14128.JDK1_14;
            case 13:
                return EnumC14128.JDK1_15;
            case 14:
                return EnumC14128.JDK1_16;
            case 15:
                return EnumC14128.JDK1_17;
            default:
                return EnumC14128.JDK1_1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC12508 m29707(EnumC11909 enumC11909) {
        switch (enumC11909) {
            case JDK1_2:
                return EnumC12508.RELEASE_2;
            case JDK1_3:
                return EnumC12508.RELEASE_3;
            case JDK1_4:
                return EnumC12508.RELEASE_4;
            case JDK5:
                return EnumC12508.RELEASE_5;
            case JDK6:
                return EnumC12508.RELEASE_6;
            case JDK7:
                return EnumC12508.RELEASE_7;
            case JDK8:
                return EnumC12508.RELEASE_8;
            case JDK9:
                return EnumC12508.RELEASE_9;
            case JDK10:
                return EnumC12508.RELEASE_10;
            case JDK11:
                return EnumC12508.RELEASE_11;
            case JDK12:
                return EnumC12508.RELEASE_12;
            case JDK13:
                return EnumC12508.RELEASE_13;
            case JDK14:
                return EnumC12508.RELEASE_14;
            case JDK15:
                return EnumC12508.RELEASE_15;
            case JDK16:
                return EnumC12508.RELEASE_16;
            case JDK17:
                return EnumC12508.RELEASE_17;
            default:
                return null;
        }
    }
}
