package l;

/* JADX INFO: renamed from: l.ܿ᩵ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XG */
/* JADX INFO: loaded from: classes5.dex */
public final class C18546 implements InterfaceC5417 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8850 f60265;

    public C18546(C8850 c8850) {
        this.f60265 = c8850;
    }

    @Override // l.InterfaceC5417
    public final Object apply(Object obj) {
        InterfaceC13851 interfaceC13851 = (InterfaceC13851) obj;
        C8850 c8850 = this.f60265;
        C21530 c21530M35671 = c8850.f74939.m35671(interfaceC13851.getType());
        C3630 c3630M53049 = null;
        if (!c8850.f28923) {
            C23768 c23768 = (C23768) c8850.f74956;
            String name = interfaceC13851.getName();
            if (name == null) {
                c23768.getClass();
            } else {
                c3630M53049 = c23768.m53049(name);
            }
        }
        return new C20038(c21530M35671, c3630M53049, ((C19380) c8850.f74949).m44825(interfaceC13851.getAnnotations()));
    }
}
