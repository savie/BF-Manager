package l;

/* JADX INFO: renamed from: l.ܳᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470D */
/* JADX INFO: loaded from: classes4.dex */
public final class C14684 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6216 f48001;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17505 f48002;

    public C14684(C6216 c6216) {
        C13638.requireNonNull(c6216);
        this.f48001 = c6216;
        this.f48002 = new C17505(c6216);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11156 m35215(C21033 c21033) {
        int i;
        int i2;
        int iM17232;
        int iM47428;
        C16800 c16800M40769 = this.f48002.m40769(c21033);
        if (c21033.m47425()) {
            return new C11156(-1, -1, -1, -1, EnumC23856.NO_CHANGE, c16800M40769);
        }
        if (c16800M40769.m39450()) {
            return new C11156(0, 0, -1, -1, EnumC23856.UNKNOWN_DEPENDENCY, c16800M40769);
        }
        int iM47426 = c21033.m47426();
        C6216 c6216 = this.f48001;
        int iM17233 = c6216.m17233(iM47426);
        for (int i3 = 0; i3 < c16800M40769.m39449(); i3++) {
            iM17233 = Math.min(iM17233, c6216.m17230(c16800M40769.m39448(i3)));
        }
        int iM39447 = c16800M40769.m39447();
        if (iM39447 >= c6216.m17234() || (iM17232 = c6216.m17232(Math.max(c21033.m47417(c21033.m47429() - 1), iM39447 + 1))) < 0 || iM17232 >= c6216.m17234() || (iM47428 = c21033.m47428(iM17232, EnumC10451.AFTER)) < 0 || iM47428 >= c21033.m47416() || c6216.m17234() - iM17232 != c21033.m47416() - iM47428) {
            i = -1;
            i2 = -1;
        } else {
            i = iM17232;
            i2 = iM47428;
        }
        return new C11156(iM17233, c21033.m47428(iM17233, EnumC10451.BEFORE), i, i2, c16800M40769.m39449() == 0 ? EnumC23856.LOCAL_CHANGE : EnumC23856.AFFECTED_DEPENDENCY, c16800M40769);
    }
}
