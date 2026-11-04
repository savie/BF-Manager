package l;

/* JADX INFO: renamed from: l.᩹ۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9K4 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23337 {
    UNIVERSAL(0),
    APPLICATION(64),
    CONTEXT_SPECIFIC(128),
    PRIVATE(192);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f75597;

    EnumC23337(int i) {
        this.f75597 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23337 m52489(byte b) {
        int i = b & 192;
        for (EnumC23337 enumC23337 : values()) {
            if (enumC23337.f75597 == i) {
                return enumC23337;
            }
        }
        throw new IllegalStateException("Could not parse ASN.1 Tag Class (should be impossible)");
    }

    public int getValue() {
        return this.f75597;
    }
}
