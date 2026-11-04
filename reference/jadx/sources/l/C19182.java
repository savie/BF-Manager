package l;

/* JADX INFO: renamed from: l.ᩳܺۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: P2S7 */
/* JADX INFO: loaded from: classes5.dex */
public class C19182 implements InterfaceC4288 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24404 f62035;

    public C19182(C24404 c24404) {
        this.f62035 = c24404;
    }

    @Override // l.InterfaceC4288
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public InterfaceC16791 mo2798(InterfaceC16791 interfaceC16791) {
        switch (interfaceC16791.mo5414()) {
            case 24:
                return new C7995(this, (InterfaceC21267) interfaceC16791);
            case 25:
                return new C18436(this, (InterfaceC16045) interfaceC16791);
            case 26:
                return new C0537(this, (InterfaceC12316) interfaceC16791);
            case 27:
                return new C21420(this, (InterfaceC17537) interfaceC16791);
            case 28:
                return new C14706(this, (InterfaceC13062) interfaceC16791);
            case 29:
                return new C4266(this, (InterfaceC15299) interfaceC16791);
            default:
                return interfaceC16791;
        }
    }
}
