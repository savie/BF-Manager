package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.֫ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1903 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6402;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6403;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6404;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6405;

    public /* synthetic */ RunnableC1903(Object obj, Object obj2, Object obj3, int i) {
        this.f6403 = i;
        this.f6405 = obj;
        this.f6404 = obj2;
        this.f6402 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6403) {
            case 0:
                C8614.m23134((C8614) this.f6405, (C2889) this.f6404, (String) this.f6402);
                break;
            case 1:
                C17015.m40118((C17015) this.f6405, (C12915) this.f6404, (ArrayList) this.f6402);
                break;
            default:
                InterfaceC25004 interfaceC25004 = (InterfaceC25004) this.f6405;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f6404;
                InterfaceC6595 interfaceC6595 = (InterfaceC6595) this.f6402;
                if (interfaceC25004.mo924()) {
                    atomicBoolean.set(true);
                    interfaceC6595.cancel();
                }
                break;
        }
    }
}
