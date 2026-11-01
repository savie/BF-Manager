package l;

/* JADX INFO: renamed from: l.۬᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes3.dex */
public final class C13391 extends Exception {
    public static final long serialVersionUID = 5750205775490483148L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1332 f44342;

    public /* synthetic */ C13391(AbstractC10569 abstractC10569, String str, int i) {
        this(abstractC10569, str);
    }

    public C13391(AbstractC10569 abstractC10569, String str) {
        super(abstractC10569.mo8523() + ": " + str);
        abstractC10569.mo8523();
        this.f44342 = abstractC10569.mo8524();
    }

    public C13391(AbstractC10569 abstractC10569, String str, Exception exc) {
        this(abstractC10569, str);
        initCause(exc);
    }

    public C13391(C9158 c9158, String str) {
        super(c9158.getName() + ": " + str);
        c9158.getName();
    }
}
