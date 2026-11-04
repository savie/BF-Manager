package l;

/* JADX INFO: renamed from: l.ܶ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC16427 {
    SHIZUKU,
    DHIZUKU,
    SHELL,
    SYSTEM;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC16427 m38991() {
        int iOrdinal = ordinal();
        EnumC16427[] enumC16427ArrValues = values();
        int i = iOrdinal + 1;
        if (i >= enumC16427ArrValues.length) {
            throw new RuntimeException();
        }
        return enumC16427ArrValues[i];
    }
}
