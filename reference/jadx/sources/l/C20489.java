package l;

/* JADX INFO: renamed from: l.᩵ۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 06TH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20489 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20424 f65630;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC22662 f65631;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f65632;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C10046 f65633;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f65634;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile long f65635 = -1;

    public C20489(long j, long j2, EnumC22662 enumC22662, C20424 c20424) {
        if (j <= 0 || c20424.isEmpty() || (enumC22662 != EnumC22662.USER && enumC22662 != EnumC22662.BATCH)) {
            throw new IllegalArgumentException("Invalid undo record");
        }
        this.f65634 = j;
        this.f65632 = j2;
        this.f65631 = enumC22662;
        this.f65630 = c20424;
    }
}
