package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.۬ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AXS */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13255 extends AbstractRunnableC22344 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f44023;

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC14771 mo32429();

    /* JADX INFO: renamed from: ۙ */
    public void mo32430(Object obj, CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: ۨ */
    public abstract Object mo32437();

    /* JADX INFO: renamed from: ۨ */
    public Object mo32438(Object obj) {
        return obj;
    }

    public AbstractC13255(int i) {
        this.f44023 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32737(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C13672.m33380(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        C13465.m32962(th);
        C23694.m52151(new C4787("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), mo32429().getContext());
    }

    /* JADX INFO: renamed from: ܰ */
    public Throwable mo32441(Object obj) {
        C18754 c18754 = obj instanceof C18754 ? (C18754) obj : null;
        if (c18754 != null) {
            return c18754.f60808;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    @Override // java.lang.Runnable
    public final void run() {
        Object objM43014;
        InterfaceC11138 interfaceC11138;
        Object objM43015;
        InterfaceC1176 interfaceC1176 = this.f72949;
        try {
            C14149 c14149 = (C14149) mo32429();
            AbstractC18858 abstractC18858 = c14149.f46446;
            Object obj = c14149.f46448;
            InterfaceC22386 context = abstractC18858.getContext();
            Object objM41155 = C17675.m41155(context, obj);
            C18568 c18568M45601 = objM41155 != C17675.f56144 ? C20166.m45601(abstractC18858, context) : null;
            try {
                InterfaceC22386 context2 = abstractC18858.getContext();
                Object objMo32437 = mo32437();
                Throwable thMo32441 = mo32441(objMo32437);
                if (thMo32441 == null) {
                    int i = this.f44023;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        C6198 c6198 = InterfaceC11138.f37788;
                        interfaceC11138 = (InterfaceC11138) context2.mo4416(C6198.f21082);
                    } else {
                        interfaceC11138 = null;
                    }
                } else {
                    interfaceC11138 = null;
                }
                if (interfaceC11138 != null && !interfaceC11138.mo7120()) {
                    CancellationException cancellationExceptionMo7109 = interfaceC11138.mo7109();
                    mo32430(objMo32437, cancellationExceptionMo7109);
                    abstractC18858.mo2097(C18610.m43014((Throwable) cancellationExceptionMo7109));
                } else if (thMo32441 != null) {
                    abstractC18858.mo2097(C18610.m43014(thMo32441));
                } else {
                    abstractC18858.mo2097(mo32438(objMo32437));
                }
                C7321 c7321 = C7321.f24318;
                if (c18568M45601 == null) {
                    C17675.m41154(context, objM41155);
                    try {
                        interfaceC1176.getClass();
                        objM43015 = C7321.f24318;
                    } catch (Throwable th) {
                        objM43015 = C18610.m43014(th);
                    }
                    m32737((Throwable) null, C17904.m41594(objM43015));
                    return;
                }
                throw null;
            } catch (Throwable th2) {
                if (c18568M45601 != null) {
                    throw null;
                }
                C17675.m41154(context, objM41155);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                interfaceC1176.getClass();
                objM43014 = C7321.f24318;
            } catch (Throwable th4) {
                objM43014 = C18610.m43014(th4);
            }
            m32737(th3, C17904.m41594(objM43014));
        }
    }
}
