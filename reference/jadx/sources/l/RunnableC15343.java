package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC15343 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49953;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49954;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49955;

    public /* synthetic */ RunnableC15343(int i, Object obj, Object obj2) {
        this.f49954 = i;
        this.f49955 = obj;
        this.f49953 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f49954;
        Object obj = this.f49953;
        Object obj2 = this.f49955;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                ((InterfaceC21692) obj2).mo22086(new IOException(th.getMessage(), th));
                break;
            case 1:
                ActivityC20293.m45792((ActivityC20293) obj2, (AbstractC17131) obj);
                break;
            default:
                int i2 = C22689.f73869;
                ((AbstractC20745) obj2).mo32855(((AbstractC10444) obj).m26392());
                break;
        }
    }
}
