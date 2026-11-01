package l;

/* JADX INFO: renamed from: l.ۧۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N9TZ */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10829 {
    Unknown("Unknown", 65535),
    LLQ("LLQ", 1),
    UL("UL", 2),
    NSID("NSID", 3),
    Owner("Owner", 4);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f36871;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f36872;

    EnumC10829(String str, int i) {
        this.f36871 = str;
        this.f36872 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m27150() {
        return this.f36871;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int m27151() {
        return this.f36872;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC10829 m27148(int i) {
        for (EnumC10829 enumC10829 : values()) {
            if (enumC10829.f36872 == i) {
                return enumC10829;
            }
        }
        return Unknown;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m27151();
    }
}
