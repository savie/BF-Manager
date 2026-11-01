package l;

/* JADX INFO: renamed from: l.᩹ᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes.dex */
public class C22479 implements InterfaceC23869 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f73376;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19741 f73377;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Class f73378;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5545 f73379;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f73380;

    public C22479(C19741 c19741, String str, Class cls, Class cls2, String str2) {
        boolean z = c19741.m44912() != null;
        this.f73376 = z;
        boolean zM44897 = c19741.m44897();
        this.f73380 = zM44897;
        C5545 c5545 = new C5545(str, cls, cls2, str2, z, zM44897);
        this.f73377 = c19741;
        this.f73378 = c5545.f19010.getReturnType();
        this.f73379 = c5545;
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public Object mo8303(AbstractC18245 abstractC18245) {
        return this.f73379.m15285(abstractC18245);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ */
    public Object mo8304(AbstractC0584 abstractC0584) {
        return this.f73379.m15291(abstractC0584);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۨ */
    public Object mo32796(AbstractC18245 abstractC18245) {
        return mo8303(abstractC18245);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public void mo4666(AbstractC0584 abstractC0584, Object obj) {
        this.f73379.m15287(abstractC0584, obj);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10105(int i, AbstractC18245 abstractC18245) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ */
    public final Object mo10107(AbstractC0584 abstractC0584, int i) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final void mo10106(AbstractC0584 abstractC0584, int i, Object obj) {
        throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ */
    public final void mo10108(AbstractC0584 abstractC0584, Object obj) {
        throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo33884(AbstractC18245 abstractC18245) {
        boolean z = this.f73380;
        C5545 c5545 = this.f73379;
        if (!z) {
            boolean z2 = this.f73376;
            C19741 c19741 = this.f73377;
            if (z2) {
                return c5545.m15290(abstractC18245) == c19741.getNumber();
            }
            return !mo8303(abstractC18245).equals(c19741.m44911());
        }
        return c5545.m15289(abstractC18245);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo33883(AbstractC0584 abstractC0584) {
        boolean z = this.f73380;
        C5545 c5545 = this.f73379;
        if (!z) {
            boolean z2 = this.f73376;
            C19741 c19741 = this.f73377;
            if (z2) {
                return c5545.m15288(abstractC0584) == c19741.getNumber();
            }
            return !mo8304(abstractC0584).equals(c19741.m44911());
        }
        return c5545.m15284(abstractC0584);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۖ */
    public final int mo33880(AbstractC18245 abstractC18245) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۚ */
    public final int mo33882(AbstractC0584 abstractC0584) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final void mo33881(AbstractC0584 abstractC0584) {
        this.f73379.m15286(abstractC0584);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC22500 mo4665() {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۖ */
    public InterfaceC22500 mo4664(AbstractC0584 abstractC0584) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC22500 mo29658(AbstractC0584 abstractC0584, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }
}
