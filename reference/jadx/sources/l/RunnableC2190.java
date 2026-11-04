package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2190 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7197;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7198;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7199;

    public /* synthetic */ RunnableC2190(int i, Object obj, Object obj2) {
        this.f7197 = i;
        this.f7199 = obj;
        this.f7198 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7197) {
            case 0:
                InterfaceC17105 interfaceC17105 = (InterfaceC17105) this.f7199;
                try {
                    interfaceC17105.mo40271((byte[]) this.f7198);
                } catch (IOException e) {
                    interfaceC17105.mo40270(e);
                    return;
                }
                break;
            default:
                ((AbstractC0578) this.f7198).mo1527((C24533) this.f7199);
                break;
        }
    }
}
