package l;

import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.᩻ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K9U2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23529 {
    CLASS_UNKNOWN("?", 0),
    CLASS_IN("in", 1),
    CLASS_CS("cs", 2),
    CLASS_CH("ch", 3),
    CLASS_HS("hs", 4),
    CLASS_NONE("none", Scalar25519.TARGET_LENGTH),
    CLASS_ANY("any", 255);


    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int f76181 = 32768;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final boolean f76182 = false;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f76183 = true;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f76188 = C13488.m32998(EnumC23529.class.getName());

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int f76192 = 32767;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f76193;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f76194;

    EnumC23529(String str, int i) {
        this.f76193 = str;
        this.f76194 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m51840() {
        return this.f76193;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int m51842() {
        return this.f76194;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m51841(int i) {
        return (this == CLASS_UNKNOWN || (i & 32768) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23529 m51837(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            for (EnumC23529 enumC23529 : values()) {
                if (enumC23529.f76193.equals(lowerCase)) {
                    return enumC23529;
                }
            }
        }
        f76188.mo12115(str, "Could not find record class for name: {}");
        return CLASS_UNKNOWN;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC23529 m51839(int i) {
        int i2 = i & f76192;
        for (EnumC23529 enumC23529 : values()) {
            if (enumC23529.f76194 == i2) {
                return enumC23529;
            }
        }
        f76188.mo12115(Integer.valueOf(i), "Could not find record class for index: {}");
        return CLASS_UNKNOWN;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m51842();
    }
}
