package l;

/* JADX INFO: renamed from: l.ۡۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SN */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9330 {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ InterfaceC18995 f30331 = C10044.m25933(m24583());

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C10076 f30332 = new C10076();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC9330 m24578(EnumC2619 enumC2619) {
        f30332.getClass();
        return C10076.m26039(enumC2619);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC9330 m24579(EnumC2619 enumC2619) {
        f30332.getClass();
        return C10076.m26040(enumC2619);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static InterfaceC18995 m24580() {
        return f30331;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC9330 m24581(EnumC2619 enumC2619) {
        f30332.getClass();
        C15243.m36590(enumC2619, "state");
        int i = C19027.f61639[enumC2619.ordinal()];
        if (i == 1) {
            return ON_STOP;
        }
        if (i == 2) {
            return ON_PAUSE;
        }
        if (i != 4) {
            return null;
        }
        return ON_DESTROY;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC9330 m24582(EnumC2619 enumC2619) {
        f30332.getClass();
        C15243.m36590(enumC2619, "state");
        int i = C19027.f61639[enumC2619.ordinal()];
        if (i == 1) {
            return ON_CREATE;
        }
        if (i == 2) {
            return ON_START;
        }
        if (i != 3) {
            return null;
        }
        return ON_RESUME;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC2619 m24584() {
        switch (C1128.f4202[ordinal()]) {
            case 1:
            case 2:
                return EnumC2619.CREATED;
            case 3:
            case 4:
                return EnumC2619.STARTED;
            case 5:
                return EnumC2619.RESUMED;
            case 6:
                return EnumC2619.DESTROYED;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new C4760();
        }
    }
}
