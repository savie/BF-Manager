package l;

/* JADX INFO: renamed from: l.ܶۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470D */
/* JADX INFO: loaded from: classes4.dex */
public final class C15814 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24766 f51453;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11339 f51454;

    public C15814(C24766 c24766) {
        C17359.requireNonNull(c24766);
        this.f51453 = c24766;
        this.f51454 = new C11339(c24766);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16560 m37741(C22528 c22528) {
        int i;
        int i2;
        int iM55281;
        int iM50766;
        C5374 c5374M28638 = this.f51454.m28638(c22528);
        if (c22528.m50760()) {
            return new C16560(-1, -1, -1, -1, EnumC17306.NO_CHANGE, c5374M28638);
        }
        if (c5374M28638.m16059()) {
            return new C16560(0, 0, -1, -1, EnumC17306.UNKNOWN_DEPENDENCY, c5374M28638);
        }
        int iM50764 = c22528.m50764();
        C24766 c24766 = this.f51453;
        int iM55282 = c24766.m55282(iM50764);
        for (int i3 = 0; i3 < c5374M28638.m16058(); i3++) {
            iM55282 = Math.min(iM55282, c24766.m55285(c5374M28638.m16057(i3)));
        }
        int iM16056 = c5374M28638.m16056();
        if (iM16056 >= c24766.m55283() || (iM55281 = c24766.m55281(Math.max(c22528.m50768(c22528.m50761() - 1), iM16056 + 1))) < 0 || iM55281 >= c24766.m55283() || (iM50766 = c22528.m50766(iM55281, EnumC21782.AFTER)) < 0 || iM50766 >= c22528.m50767() || c24766.m55283() - iM55281 != c22528.m50767() - iM50766) {
            i = -1;
            i2 = -1;
        } else {
            i = iM55281;
            i2 = iM50766;
        }
        return new C16560(iM55282, c22528.m50766(iM55282, EnumC21782.BEFORE), i, i2, c5374M28638.m16058() == 0 ? EnumC17306.LOCAL_CHANGE : EnumC17306.AFFECTED_DEPENDENCY, c5374M28638);
    }
}
