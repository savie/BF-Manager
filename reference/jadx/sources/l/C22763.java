package l;

/* JADX INFO: renamed from: l.᩺ۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes2.dex */
public final class C22763 extends C6534 {

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public C12885 f74141;

    public C22763(EnumC3046 enumC3046, AbstractC14504 abstractC14504, C12885 c12885) {
        super(enumC3046, abstractC14504);
        this.f74141 = c12885;
        this.f47507 = "Annotation_AnnotationValue";
    }

    @Override // l.C6534
    /* JADX INFO: renamed from: ᩶ */
    public final String mo17752() {
        return this.f74141.toString();
    }

    @Override // l.AbstractC14504
    /* JADX INFO: renamed from: ۙ */
    public final void mo34919(EnumC23676 enumC23676) {
        super.mo34919(enumC23676);
        this.f74141.mo34919(enumC23676);
    }

    @Override // l.C6534, l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ܰ */
    public final void mo3628() {
        C12885 c12885 = this.f74141;
        if (c12885 != null) {
            c12885.f22686 = this.f22686;
            c12885.m18216(this);
            c12885.mo3628();
        }
    }
}
