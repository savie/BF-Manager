package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۨۙ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R7EK */
/* JADX INFO: loaded from: classes3.dex */
public final class C12134 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final HashMap f39023 = new HashMap(9);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final HashMap f39021 = new HashMap(9);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final HashMap f39025 = new HashMap(10);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final HashMap f39022 = new HashMap(10);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f39020 = new HashMap(10);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final HashMap f39024 = new HashMap(20);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final HashMap f39026 = new HashMap(20);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final HashMap f39027 = new HashMap(20);

    static {
        for (EnumC3185 enumC3185 : EnumC3185.values()) {
            f39024.put(enumC3185.f10375, enumC3185);
            if (enumC3185.f10376) {
                f39026.put(enumC3185.f10375, enumC3185);
            }
            HashMap map = f39027;
            if (!map.containsKey(Integer.valueOf(enumC3185.f10373))) {
                map.put(Integer.valueOf(enumC3185.f10373), enumC3185);
            }
        }
        for (EnumC20339 enumC20339 : EnumC20339.values()) {
            f39023.put(enumC20339.f65256, enumC20339);
            f39021.put(enumC20339.f65257, enumC20339);
        }
        for (EnumC23323 enumC23323 : EnumC23323.values()) {
            f39025.put(enumC23323.f75555, enumC23323);
            f39022.put(enumC23323.f75556, enumC23323);
        }
        for (EnumC15863 enumC15863 : EnumC15863.values()) {
            f39020.put(Character.valueOf(enumC15863.f51591.charAt(0)), enumC15863);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC3185 m30332(int i) {
        EnumC3185 enumC3185 = (EnumC3185) f39027.get(Integer.valueOf(i));
        return enumC3185 == null ? EnumC3185.f10350 : enumC3185;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static EnumC3185 m30334(String str) {
        return (EnumC3185) f39024.get(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC3185 m30333(String str) {
        return (EnumC3185) f39026.get(str);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static EnumC20339 m30331(String str) {
        return (EnumC20339) f39023.get(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static EnumC20339 m30329(int i) {
        return (EnumC20339) f39021.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static EnumC23323 m30330(String str) {
        return (EnumC23323) f39025.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23323 m30328(int i) {
        return (EnumC23323) f39022.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30326(String str) {
        EnumC23323 enumC23323 = (EnumC23323) f39025.get(str);
        if (enumC23323 != null) {
            return enumC23323.f75556.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC15863 m30327(char c) {
        EnumC15863 enumC15863 = (EnumC15863) f39020.get(Character.valueOf(c));
        return enumC15863 == null ? EnumC15863.AE_UNKNOWN : enumC15863;
    }
}
