package l;

/* JADX INFO: renamed from: l.᩵ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I81G */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20291 {
    Unknown("", 128),
    Standard("standard label", 0),
    Compressed("compressed label", 192),
    Extended("extended label", 64);


    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int f65145 = 63;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f65147 = 192;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f65148;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f65149;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m46626(int i) {
        return i & 63;
    }

    EnumC20291(String str, int i) {
        this.f65148 = str;
        this.f65149 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m46627() {
        return this.f65148;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int m46628() {
        return this.f65149;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC20291 m46624(int i) {
        int i2 = i & 192;
        for (EnumC20291 enumC20291 : values()) {
            if (enumC20291.f65149 == i2) {
                return enumC20291;
            }
        }
        return Unknown;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m46628();
    }
}
