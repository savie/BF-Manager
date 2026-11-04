package l;

/* JADX INFO: renamed from: l.ܶۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: SIU2 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15997 {
    EQ("=="),
    NE("!="),
    LT("<"),
    LE("<="),
    GT(">"),
    GE(">=");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f51930;

    EnumC15997(String str) {
        this.f51930 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m38125() {
        return this.f51930;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC15997 m38126() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return NE;
        }
        if (iOrdinal == 1) {
            return EQ;
        }
        if (iOrdinal == 2) {
            return GE;
        }
        if (iOrdinal == 3) {
            return GT;
        }
        if (iOrdinal == 4) {
            return LE;
        }
        if (iOrdinal == 5) {
            return LT;
        }
        throw new C8597("Unknown if operations type: " + this);
    }
}
