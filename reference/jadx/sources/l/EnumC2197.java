package l;

/* JADX INFO: renamed from: l.ۖ֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9JT */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2197 {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f7947;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f7948;

    EnumC2197(int i, String str) {
        this.f7947 = i;
        this.f7948 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m6811() {
        return this.f7947;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f7948;
    }
}
