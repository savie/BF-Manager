package l;

/* JADX INFO: renamed from: l.ۛ۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6074 implements InterfaceC6927 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11450 f20577;

    public C6074(C11450 c11450) {
        this.f20577 = c11450;
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7547(C2693 c2693) {
        C11450 c11450 = this.f20577;
        C5888 c5888 = c11450.f38548;
        C20809 c20809 = c11450.f38541;
        AbstractC16579 abstractC16579 = c2693.f75167;
        Object obj = c2693.f10382;
        if (abstractC16579.mo1933() == EnumC6617.CLASS) {
            C6171.m17176(obj instanceof String);
            c20809.m46793(115);
            c20809.m46798(C17177.m40100(c5888.f20079, c11450.f38547.f77631.m17389((String) obj)));
            return;
        }
        switch (C17363.f55244[abstractC16579.mo1933().ordinal()]) {
            case 1:
                c20809.m46793(66);
                break;
            case 2:
                c20809.m46793(67);
                break;
            case 3:
                c20809.m46793(83);
                break;
            case 4:
                c20809.m46793(73);
                break;
            case 5:
                c20809.m46793(74);
                break;
            case 6:
                c20809.m46793(70);
                break;
            case 7:
                c20809.m46793(68);
                break;
            case 8:
                c20809.m46793(90);
                break;
            default:
                throw new AssertionError(abstractC16579);
        }
        c20809.m46798(c5888.m16111(obj));
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7549(C5516 c5516) {
        C11450 c11450 = this.f20577;
        C20809 c20809 = c11450.f38541;
        c20809.m46793(101);
        C5888 c5888 = c11450.f38548;
        C6263 c6263 = c5516.f18928;
        c20809.m46798(c5888.m16117(c6263.f77449));
        c20809.m46798(C17177.m40100(c5888.f20079, c6263.f77453));
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7551(C13984 c13984) {
        C11450 c11450 = this.f20577;
        C20809 c20809 = c11450.f38541;
        c20809.m46793(99);
        c20809.m46798(c11450.f38548.m16117(c13984.f45980));
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7550(C11867 c11867) {
        C11450 c11450 = this.f20577;
        c11450.f38541.m46793(64);
        c11450.m28586(c11867);
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7552(C22450 c22450) {
        throw new AssertionError(c22450);
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7548(C4810 c4810) {
        C20809 c20809 = this.f20577.f38541;
        c20809.m46793(91);
        AbstractC23156[] abstractC23156Arr = c4810.f16902;
        c20809.m46798(abstractC23156Arr.length);
        for (AbstractC23156 abstractC23156 : abstractC23156Arr) {
            abstractC23156.mo4166(this);
        }
    }
}
