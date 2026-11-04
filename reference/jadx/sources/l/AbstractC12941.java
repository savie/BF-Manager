package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.۫ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AXS */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12941 extends AbstractRunnableC12297 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f41495;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC4825 mo32326();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo32327(Object obj, CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract Object mo32329();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Object mo32330(Object obj) {
        return obj;
    }

    public AbstractC12941(int i) {
        this.f41495 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Throwable mo32331(Object obj) {
        C12238 c12238 = obj instanceof C12238 ? (C12238) obj : null;
        if (c12238 != null) {
            return c12238.f39390;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    @Override // java.lang.Runnable
    public final void run() {
        Object objM45347;
        InterfaceC9211 interfaceC9211;
        Object objM45348;
        InterfaceC6332 interfaceC6332 = this.f39532;
        try {
            InterfaceC4825 interfaceC4825Mo32326 = mo32326();
            C15243.m36587((Object) interfaceC4825Mo32326, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C25307 c25307 = (C25307) interfaceC4825Mo32326;
            AbstractC6317 abstractC6317 = c25307.f81753;
            Object obj = c25307.f81755;
            InterfaceC11536 context = abstractC6317.getContext();
            Object objM45511 = C19756.m45511(context, obj);
            C20596 c20596M42354 = objM45511 != C19756.f63579 ? C18205.m42354(abstractC6317, context) : null;
            try {
                InterfaceC11536 context2 = abstractC6317.getContext();
                Object objMo32329 = mo32329();
                Throwable thMo32331 = mo32331(objMo32329);
                if (thMo32331 == null) {
                    int i = this.f41495;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        C1009 c1009 = InterfaceC9211.f30029;
                        interfaceC9211 = (InterfaceC9211) context2.mo5005(C1009.f3674);
                    } else {
                        interfaceC9211 = null;
                    }
                } else {
                    interfaceC9211 = null;
                }
                if (interfaceC9211 != null && !interfaceC9211.mo24383()) {
                    CancellationException cancellationExceptionMo24384 = interfaceC9211.mo24384();
                    mo32327(objMo32329, cancellationExceptionMo24384);
                    abstractC6317.mo8188(C19676.m45347((Throwable) cancellationExceptionMo24384));
                } else if (thMo32331 != null) {
                    abstractC6317.mo8188(C19676.m45347(thMo32331));
                } else {
                    abstractC6317.mo8188(mo32330(objMo32329));
                }
                C11471 c11471 = C11471.f36082;
                if (c20596M42354 != null) {
                    c20596M42354.m47185();
                    throw null;
                }
                C19756.m45510(context, objM45511);
                try {
                    interfaceC6332.getClass();
                    objM45348 = C11471.f36082;
                } catch (Throwable th) {
                    objM45348 = C19676.m45347(th);
                }
                m32328((Throwable) null, C22660.m51055(objM45348));
            } catch (Throwable th2) {
                if (c20596M42354 != null) {
                    c20596M42354.m47185();
                    throw null;
                }
                C19756.m45510(context, objM45511);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                interfaceC6332.getClass();
                objM45347 = C11471.f36082;
            } catch (Throwable th4) {
                objM45347 = C19676.m45347(th4);
            }
            m32328(th3, C22660.m51055(objM45347));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32328(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C18856.m43744(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        C15243.m36586(th);
        C9254.m24437(new C4738("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), mo32326().getContext());
    }
}
