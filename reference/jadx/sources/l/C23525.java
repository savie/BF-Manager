package l;

/* JADX INFO: renamed from: l.᩻ۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SN */
/* JADX INFO: loaded from: classes.dex */
public final class C23525 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC1651 m51821(EnumC9414 enumC9414) {
        C13465.m32966(enumC9414, "state");
        int i = C10825.f36858[enumC9414.ordinal()];
        if (i == 1) {
            return EnumC1651.ON_DESTROY;
        }
        if (i == 2) {
            return EnumC1651.ON_STOP;
        }
        if (i != 3) {
            return null;
        }
        return EnumC1651.ON_PAUSE;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static EnumC1651 m51822(EnumC9414 enumC9414) {
        C13465.m32966(enumC9414, "state");
        int i = C10825.f36858[enumC9414.ordinal()];
        if (i == 1) {
            return EnumC1651.ON_CREATE;
        }
        if (i == 2) {
            return EnumC1651.ON_START;
        }
        if (i != 3) {
            return null;
        }
        return EnumC1651.ON_RESUME;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC1651 m51823(EnumC9414 enumC9414) {
        C13465.m32966(enumC9414, "state");
        int i = C10825.f36858[enumC9414.ordinal()];
        if (i == 1) {
            return EnumC1651.ON_START;
        }
        if (i == 2) {
            return EnumC1651.ON_RESUME;
        }
        if (i != 5) {
            return null;
        }
        return EnumC1651.ON_CREATE;
    }
}
