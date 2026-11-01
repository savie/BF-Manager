package l;

/* JADX INFO: renamed from: l.֫ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: SA0U */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1655 {
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


    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int f6614 = 15;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f6620 = 255;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f6623;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f6624;

    EnumC1655(String str, int i) {
        this.f6623 = str;
        this.f6624 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m5559() {
        return this.f6623;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int m5560() {
        return this.f6624;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC1655 m5556(int i) {
        int i2 = i & 15;
        for (EnumC1655 enumC1655 : values()) {
            if (enumC1655.f6624 == i2) {
                return enumC1655;
            }
        }
        return Unknown;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC1655 m5558(int i, int i2) {
        int i3 = (i & 15) | ((i2 >> 28) & 255);
        for (EnumC1655 enumC1655 : values()) {
            if (enumC1655.f6624 == i3) {
                return enumC1655;
            }
        }
        return Unknown;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m5560();
    }
}
