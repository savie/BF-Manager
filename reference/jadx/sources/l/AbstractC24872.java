package l;

/* JADX INFO: renamed from: l.᩻ۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P89T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24872 extends AbstractC13725 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Long f80490;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC15920 f80491;

    /* JADX INFO: renamed from: ۫ */
    public abstract C17412 mo28806();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15920 m55396() {
        return this.f80491;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Long m55397() {
        return this.f80490;
    }

    @Override // l.AbstractC13725
    /* JADX INFO: renamed from: ᩷ */
    public final void mo33543(C0302 c0302) {
        C17412 c17412Mo28806 = mo28806();
        this.f80491 = c17412Mo28806;
        c0302.m1881(c17412Mo28806);
        c0302.m1882(EnumC18947.FOUR);
        c0302.m1885();
        if (c0302.m1884() != 0) {
            this.f80490 = Long.valueOf(c0302.m1885());
        } else {
            this.f80490 = null;
        }
    }
}
