package l;

/* JADX INFO: renamed from: l.᩻ۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YX */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23533 {
    READ_ONLY("read_only"),
    READ_WRITE("read_write"),
    DENY("deny");


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f76201;

    EnumC23533(String str) {
        this.f76201 = str;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String m51849() {
        return this.f76201;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m51848() {
        return this != DENY;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m51850() {
        return this == READ_WRITE;
    }
}
