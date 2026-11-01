package l;

/* JADX INFO: renamed from: l.۟᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes3.dex */
public final class C7725 extends AbstractC0764 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12760 f25546;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14781 f25547;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21130 f25548;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7725(C21130 c21130, C14781 c14781, C14781 c14782, C12760 c12760) {
        super(c14781);
        this.f25548 = c21130;
        this.f25547 = c14782;
        this.f25546 = c12760;
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final void mo3284() {
        super.mo3284();
        String strM35421 = this.f25547.m35421();
        try {
            this.f25548.f68804[0] = this.f25546.m31713();
        } catch (Throwable th) {
            throw new C23560(C0252.m1693("ASM fail to generate .class file: ", strM35421), th);
        }
    }
}
