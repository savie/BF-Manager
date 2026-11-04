package l;

/* JADX INFO: renamed from: l.ۨۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N9TZ */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12086 {
    Unknown("Unknown", 65535),
    LLQ("LLQ", 1),
    UL("UL", 2),
    NSID("NSID", 3),
    Owner("Owner", 4);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f38918;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f38919;

    EnumC12086(String str, int i) {
        this.f38918 = str;
        this.f38919 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m30267() {
        return this.f38918;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int m30268() {
        return this.f38919;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC12086 m30265(int i) {
        for (EnumC12086 enumC12086 : values()) {
            if (enumC12086.f38919 == i) {
                return enumC12086;
            }
        }
        return Unknown;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m30268();
    }
}
