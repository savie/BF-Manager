package l;

/* JADX INFO: renamed from: l.ۢۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SN */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9414 {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24173(EnumC9414 enumC9414) {
        C13465.m32966(enumC9414, "state");
        return compareTo(enumC9414) >= 0;
    }
}
