package l;

/* JADX INFO: renamed from: l.ۢܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4NK */
/* JADX INFO: loaded from: classes3.dex */
public class C10234 extends RuntimeException {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC8743 f32696;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC9488 f32697;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7998 f32698;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f32699;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC4269 f32700;

    public C10234(AbstractC9488 abstractC9488, InterfaceC4269 interfaceC4269, C7998 c7998) {
        this.f32699 = -1;
        this.f32697 = abstractC9488;
        this.f32700 = interfaceC4269;
        this.f32698 = c7998;
        if (abstractC9488 != null) {
            this.f32699 = abstractC9488.m24870();
        }
    }

    public C10234(String str, AbstractC0540 abstractC0540, InterfaceC4269 interfaceC4269, C7998 c7998) {
        super(str);
        this.f32699 = -1;
        this.f32697 = abstractC0540;
        this.f32700 = interfaceC4269;
        this.f32698 = c7998;
        if (abstractC0540 != null) {
            this.f32699 = abstractC0540.m24870();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26369(int i) {
        this.f32699 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14907 m26368() {
        AbstractC9488 abstractC9488 = this.f32697;
        if (abstractC9488 != null) {
            return abstractC9488.mo6669().m27843(this.f32699, this.f32698);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC4269 m26372() {
        return this.f32700;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8743 m26371() {
        return this.f32696;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26370(InterfaceC8743 interfaceC8743) {
        this.f32696 = interfaceC8743;
    }
}
