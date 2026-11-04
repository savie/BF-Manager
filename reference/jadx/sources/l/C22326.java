package l;

/* JADX INFO: renamed from: l.᩷᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes.dex */
public final class C22326 extends AbstractC18217 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11137 f72268;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17850 f72269;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0318 f72270;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22326(C11137 c11137, C17850 c17850, C17850 c17851, C0318 c0318) {
        super(c17850);
        this.f72268 = c11137;
        this.f72269 = c17851;
        this.f72270 = c0318;
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ */
    public final void mo2000() {
        super.mo2000();
        String strM41698 = this.f72269.m41698();
        try {
            this.f72268.f35104[0] = this.f72270.m2010();
        } catch (Throwable th) {
            throw new C16601(C25272.m56409("ASM fail to generate .class file: ", strM41698), th);
        }
    }
}
