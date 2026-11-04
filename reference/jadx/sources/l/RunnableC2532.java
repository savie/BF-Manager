package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۖ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2532 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8080;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f8081;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8082;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8083;

    public /* synthetic */ RunnableC2532(Object obj, Object obj2, Object obj3, int i) {
        this.f8081 = i;
        this.f8083 = obj;
        this.f8082 = obj2;
        this.f8080 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8081) {
            case 0:
                ActivityC15913.m37892((ActivityC15913) this.f8083, (AtomicBoolean) this.f8082, (C12184) this.f8080);
                break;
            default:
                InterfaceC23507 interfaceC23507 = (InterfaceC23507) this.f8083;
                InterfaceC16047 interfaceC16047 = (InterfaceC16047) this.f8082;
                ArrayList arrayList = (ArrayList) this.f8080;
                if (interfaceC23507.mo19226()) {
                    C22673.m51157();
                }
                interfaceC23507.mo19225(interfaceC16047.mo7394(arrayList));
                interfaceC23507.mo19229();
                break;
        }
    }
}
