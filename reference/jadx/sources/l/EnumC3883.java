package l;

/* JADX INFO: renamed from: l.ۘۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: SA0U */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3883 {
    Unknown("Unknown", 65535),
    NoError("No Error", 0),
    FormErr("Format Error", 1),
    ServFail("Server Failure", 2),
    NXDomain("Non-Existent Domain", 3),
    NotImp("Not Implemented", 4),
    Refused("Query Refused", 5),
    YXDomain("Name Exists when it should not", 6),
    YXRRSet("RR Set Exists when it should not", 7),
    NXRRSet("RR Set that should exist does not", 8),
    NotAuth("Server Not Authoritative for zone", 9),
    NotZone("NotZone Name not contained in zone", 10);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f13237 = 255;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int f13241 = 15;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f13252;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f13253;

    EnumC3883(String str, int i) {
        this.f13252 = str;
        this.f13253 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m12519() {
        return this.f13252;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int m12520() {
        return this.f13253;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC3883 m12516(int i) {
        int i2 = i & 15;
        for (EnumC3883 enumC3883 : values()) {
            if (enumC3883.f13253 == i2) {
                return enumC3883;
            }
        }
        return Unknown;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC3883 m12518(int i, int i2) {
        int i3 = (i & 15) | ((i2 >> 28) & 255);
        for (EnumC3883 enumC3883 : values()) {
            if (enumC3883.f13253 == i3) {
                return enumC3883;
            }
        }
        return Unknown;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m12520();
    }
}
