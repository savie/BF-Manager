package l;

/* JADX INFO: renamed from: l.᩸᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23063 extends C13608 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25301 f74814;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C14769 f74815;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f74816;

    @Override // l.C13608, l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23063(C25301 c25301) {
        super(c25301);
        this.f74814 = c25301;
    }

    @Override // l.C13608, l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        AbstractC22664 abstractC22664 = c16327.f26659;
        if ((abstractC22664 == null || !abstractC22664.mo9329()) && !this.f74816) {
            C14769 c14769 = this.f43230;
            C14769 c147610 = this.f43228;
            C18499 c18499 = this.f7757;
            this.f74816 = true;
            try {
                this.f7757 = new C18499();
                this.f43230 = C14769.of((Object) this.f74814.f81712.f48325);
                this.f43228 = C14769.m35543();
                mo5474(c16327.f53001);
                this.f74815 = this.f43228;
            } finally {
                this.f7757 = c18499;
                this.f43230 = c14769;
                this.f43228 = c147610;
                this.f74816 = false;
            }
        }
    }
}
