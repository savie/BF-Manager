package l;

/* JADX INFO: renamed from: l.֫ۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SN */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1651 {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;


    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C23525 f6602 = new C23525();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC1651 m5545(EnumC9414 enumC9414) {
        f6602.getClass();
        return C23525.m51822(enumC9414);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1651 m5546(EnumC9414 enumC9414) {
        f6602.getClass();
        return C23525.m51821(enumC9414);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC1651 m5547(EnumC9414 enumC9414) {
        f6602.getClass();
        return C23525.m51823(enumC9414);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC1651 m5548(EnumC9414 enumC9414) {
        f6602.getClass();
        C13465.m32966(enumC9414, "state");
        int i = C10825.f36858[enumC9414.ordinal()];
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC9414 m5550() {
        switch (C14353.f47019[ordinal()]) {
            case 1:
            case 2:
                return EnumC9414.CREATED;
            case 3:
            case 4:
                return EnumC9414.STARTED;
            case 5:
                return EnumC9414.RESUMED;
            case 6:
                return EnumC9414.DESTROYED;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
