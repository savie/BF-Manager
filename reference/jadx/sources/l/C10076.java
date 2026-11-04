package l;

/* JADX INFO: renamed from: l.ۢۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10076 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC9330 m26039(EnumC2619 enumC2619) {
        C15243.m36590(enumC2619, "state");
        int i = C19027.f61639[enumC2619.ordinal()];
        if (i == 1) {
            return EnumC9330.ON_DESTROY;
        }
        if (i == 2) {
            return EnumC9330.ON_STOP;
        }
        if (i != 3) {
            return null;
        }
        return EnumC9330.ON_PAUSE;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC9330 m26040(EnumC2619 enumC2619) {
        C15243.m36590(enumC2619, "state");
        int i = C19027.f61639[enumC2619.ordinal()];
        if (i == 1) {
            return EnumC9330.ON_START;
        }
        if (i == 2) {
            return EnumC9330.ON_RESUME;
        }
        if (i != 5) {
            return null;
        }
        return EnumC9330.ON_CREATE;
    }
}
