package l;

/* JADX INFO: renamed from: l.ۨ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7EB */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12374 {
    ARRAY(0),
    INNER_TYPE(1),
    WILDCARD(2),
    TYPE_ARGUMENT(3);


    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int f39739 = 3;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f39743;

    EnumC12374(int i) {
        this.f39743 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int m30859() {
        return this.f39743;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m30858() {
        return toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC12374 m30856(String str) {
        for (EnumC12374 enumC12374 : values()) {
            if (enumC12374.m30858().equals(str)) {
                return enumC12374;
            }
        }
        return null;
    }
}
