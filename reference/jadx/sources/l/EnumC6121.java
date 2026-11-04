package l;

import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ۛۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K9U2 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6121 {
    CLASS_UNKNOWN("?", 0),
    CLASS_IN("in", 1),
    CLASS_CS("cs", 2),
    CLASS_CH("ch", 3),
    CLASS_HS("hs", 4),
    CLASS_NONE("none", Scalar25519.TARGET_LENGTH),
    CLASS_ANY("any", 255);


    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f20877 = true;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final int f20880 = 32768;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int f20881 = 32767;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final boolean f20883 = false;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f20886 = C16980.m40038(EnumC6121.class.getName());

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f20887;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f20888;

    EnumC6121(String str, int i) {
        this.f20887 = str;
        this.f20888 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m17675() {
        return this.f20887;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int m17677() {
        return this.f20888;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m17676(int i) {
        return (this == CLASS_UNKNOWN || (i & 32768) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC6121 m17672(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            for (EnumC6121 enumC6121 : values()) {
                if (enumC6121.f20887.equals(lowerCase)) {
                    return enumC6121;
                }
            }
        }
        f20886.mo13728(str, "Could not find record class for name: {}");
        return CLASS_UNKNOWN;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC6121 m17674(int i) {
        int i2 = i & f20881;
        for (EnumC6121 enumC6121 : values()) {
            if (enumC6121.f20888 == i2) {
                return enumC6121;
            }
        }
        f20886.mo13728(Integer.valueOf(i), "Could not find record class for index: {}");
        return CLASS_UNKNOWN;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m17677();
    }
}
