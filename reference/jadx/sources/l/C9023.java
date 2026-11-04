package l;

/* JADX INFO: renamed from: l.ۡ֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36BK */
/* JADX INFO: loaded from: classes3.dex */
public final class C9023 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC0336 m24075(EnumC22294 enumC22294) {
        int i = C0820.f3100[enumC22294.ordinal()];
        if (i == 1) {
            return EnumC0336.STATIC;
        }
        if (i == 2) {
            return EnumC0336.VIRTUAL;
        }
        if (i == 3 || i == 4) {
            return EnumC0336.DIRECT;
        }
        if (i == 5) {
            return EnumC0336.INTERFACE;
        }
        throw new C8597("Unsupported method handle type: " + enumC22294);
    }
}
