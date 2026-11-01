package l;

/* JADX INFO: renamed from: l.᩻ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23589 {
    SHIZUKU,
    DHIZUKU,
    SHELL,
    SYSTEM;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC23589 m52017() {
        int iOrdinal = ordinal();
        EnumC23589[] enumC23589ArrValues = values();
        int i = iOrdinal + 1;
        if (i >= enumC23589ArrValues.length) {
            throw new RuntimeException();
        }
        return enumC23589ArrValues[i];
    }
}
