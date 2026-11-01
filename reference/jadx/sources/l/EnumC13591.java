package l;

/* JADX INFO: renamed from: l.ܰۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7EB */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC13591 {
    ARRAY(0),
    INNER_TYPE(1),
    WILDCARD(2),
    TYPE_ARGUMENT(3);


    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int f44814 = 3;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f44819;

    EnumC13591(int i) {
        this.f44819 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int m33214() {
        return this.f44819;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m33213() {
        return toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC13591 m33211(String str) {
        for (EnumC13591 enumC13591 : values()) {
            if (enumC13591.m33213().equals(str)) {
                return enumC13591;
            }
        }
        return null;
    }
}
