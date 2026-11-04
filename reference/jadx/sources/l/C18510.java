package l;

/* JADX INFO: renamed from: l.ܿᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes4.dex */
public final class C18510 extends Exception {
    public static final long serialVersionUID = 5750205775490483148L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21013 f60198;

    public /* synthetic */ C18510(AbstractC4823 abstractC4823, String str, int i) {
        this(abstractC4823, str);
    }

    public C18510(AbstractC4823 abstractC4823, String str) {
        super(abstractC4823.mo5002() + ": " + str);
        abstractC4823.mo5002();
        this.f60198 = abstractC4823.mo5000();
    }

    public C18510(AbstractC4823 abstractC4823, String str, Exception exc) {
        this(abstractC4823, str);
        initCause(exc);
    }

    public C18510(C14034 c14034, String str) {
        super(c14034.getName() + ": " + str);
        c14034.getName();
    }
}
