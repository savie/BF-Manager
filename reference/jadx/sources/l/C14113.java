package l;

/* JADX INFO: renamed from: l.۬᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56BZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14113 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f44623;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f44624;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f44625;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f44626;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f44627;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC4836 f44628;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f44629;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f44630;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f44631;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f44632;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f44633;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f44634;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f44635;

    public C14113(C7402 c7402) {
        this.f44634 = c7402.f24394;
        this.f44631 = c7402.f24390;
        this.f44629 = c7402.f24405;
        this.f44626 = c7402.f24395;
        this.f44635 = c7402.f24400;
        this.f44630 = c7402.f24393;
        this.f44627 = c7402.f24403;
        this.f44623 = c7402.f24396;
        this.f44624 = c7402.f24388;
        this.f44625 = C7336.m20110(c7402.f24391, c7402.f24398);
        this.f44633 = c7402.f24401;
        this.f44632 = c7402.f24392;
        this.f44628 = c7402.f24397;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34264() {
        EnumC4836 enumC4836 = EnumC4836.RUNNING;
        EnumC4836 enumC4837 = this.f44628;
        return enumC4837 == enumC4836 || enumC4837 == EnumC4836.WAITING;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m34263(long j) {
        return this.f44635 + (this.f44628 == EnumC4836.WAITING ? Math.max(0L, j - this.f44630) : 0L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m34262(C14113 c14113) {
        int length = c14113.f44627.length();
        String str = c14113.f44624;
        return (c14113.f44632.length() + c14113.f44633.length() + c14113.f44625.length() + length + (str == null ? 0 : str.length())) * 2;
    }
}
