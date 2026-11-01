package l;

/* JADX INFO: renamed from: l.ۛۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I81G */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5889 {
    Unknown("", 128),
    Standard("standard label", 0),
    Compressed("compressed label", 192),
    Extended("extended label", 64);


    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int f20086 = 63;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f20090 = 192;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f20092;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f20093;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m16121(int i) {
        return i & 63;
    }

    EnumC5889(String str, int i) {
        this.f20092 = str;
        this.f20093 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m16122() {
        return this.f20092;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int m16123() {
        return this.f20093;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC5889 m16119(int i) {
        int i2 = i & 192;
        for (EnumC5889 enumC5889 : values()) {
            if (enumC5889.f20093 == i2) {
                return enumC5889;
            }
        }
        return Unknown;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m16123();
    }
}
