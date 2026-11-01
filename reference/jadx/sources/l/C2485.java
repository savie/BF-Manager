package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖۧۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7EK */
/* JADX INFO: loaded from: classes2.dex */
public final class C2485 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final HashMap f9876 = new HashMap(9);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final HashMap f9881 = new HashMap(9);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final HashMap f9879 = new HashMap(10);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final HashMap f9880 = new HashMap(10);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f9878 = new HashMap(10);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final HashMap f9883 = new HashMap(20);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final HashMap f9882 = new HashMap(20);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final HashMap f9877 = new HashMap(20);

    static {
        for (EnumC13776 enumC13776 : EnumC13776.values()) {
            f9883.put(enumC13776.f45437, enumC13776);
            if (enumC13776.f45441) {
                f9882.put(enumC13776.f45437, enumC13776);
            }
            HashMap map = f9877;
            if (!map.containsKey(Integer.valueOf(enumC13776.f45438))) {
                map.put(Integer.valueOf(enumC13776.f45438), enumC13776);
            }
        }
        for (EnumC11659 enumC11659 : EnumC11659.values()) {
            f9876.put(enumC11659.f39198, enumC11659);
            f9881.put(enumC11659.f39199, enumC11659);
        }
        for (EnumC4602 enumC4602 : EnumC4602.values()) {
            f9879.put(enumC4602.f16292, enumC4602);
            f9880.put(enumC4602.f16293, enumC4602);
        }
        for (EnumC3046 enumC3046 : EnumC3046.values()) {
            f9878.put(Character.valueOf(enumC3046.f11426.charAt(0)), enumC3046);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC13776 m7622(int i) {
        EnumC13776 enumC13776 = (EnumC13776) f9877.get(Integer.valueOf(i));
        return enumC13776 == null ? EnumC13776.f45407 : enumC13776;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static EnumC13776 m7615(String str) {
        return (EnumC13776) f9883.get(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC13776 m7623(String str) {
        return (EnumC13776) f9882.get(str);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static EnumC11659 m7619(String str) {
        return (EnumC11659) f9876.get(str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static EnumC11659 m7621(int i) {
        return (EnumC11659) f9881.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static EnumC4602 m7620(String str) {
        return (EnumC4602) f9879.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4602 m7618(int i) {
        return (EnumC4602) f9880.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m7616(String str) {
        EnumC4602 enumC4602 = (EnumC4602) f9879.get(str);
        if (enumC4602 != null) {
            return enumC4602.f16293.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC3046 m7617(char c) {
        EnumC3046 enumC3046 = (EnumC3046) f9878.get(Character.valueOf(c));
        return enumC3046 == null ? EnumC3046.AE_UNKNOWN : enumC3046;
    }
}
