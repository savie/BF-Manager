package l;

/* JADX INFO: renamed from: l.ۢ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes4.dex */
public final class C10136 extends C19087 {

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public C0442 f32432;

    public C10136(EnumC15863 enumC15863, AbstractC1890 abstractC1890, C0442 c0442) {
        super(enumC15863, abstractC1890);
        this.f32432 = c0442;
        this.f6365 = "Annotation_AnnotationValue";
    }

    @Override // l.C19087
    /* JADX INFO: renamed from: ᩶ */
    public final String mo4365() {
        return this.f32432.toString();
    }

    @Override // l.AbstractC1890
    /* JADX INFO: renamed from: ۙ */
    public final void mo6502(EnumC5619 enumC5619) {
        super.mo6502(enumC5619);
        this.f32432.mo6502(enumC5619);
    }

    @Override // l.C19087, l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1688() {
        C0442 c0442 = this.f32432;
        if (c0442 != null) {
            c0442.f67148 = this.f67148;
            c0442.m47994(this);
            c0442.mo1688();
        }
    }
}
