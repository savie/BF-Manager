package l;

/* JADX INFO: renamed from: l.۟ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YX */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7623 {
    READ_ONLY("read_only"),
    READ_WRITE("read_write"),
    DENY("deny");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f25163;

    EnumC7623(String str) {
        this.f25163 = str;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String m20827() {
        return this.f25163;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m20826() {
        return this != DENY;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m20828() {
        return this == READ_WRITE;
    }
}
