package l;

/* JADX INFO: renamed from: l.ܶܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P9JT */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC16234 {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f52771;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f52772;

    EnumC16234(int i, String str) {
        this.f52771 = i;
        this.f52772 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m38533() {
        return this.f52771;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f52772;
    }
}
