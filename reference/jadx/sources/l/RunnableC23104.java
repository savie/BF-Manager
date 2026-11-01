package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23104 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75058;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75059;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75060;

    public /* synthetic */ RunnableC23104(int i, Object obj, Object obj2) {
        this.f75059 = i;
        this.f75060 = obj;
        this.f75058 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75059) {
            case 0:
                ((InterfaceC21692) this.f75060).mo22086((IOException) this.f75058);
                break;
            case 1:
                C10659.m26847((C10659) this.f75060, (Class) this.f75058);
                break;
            case 2:
                C23421.m51569((C23421) this.f75060, (C11381) this.f75058);
                break;
            default:
                ViewOnClickListenerC3520.m10359((ViewOnClickListenerC3520) this.f75060, (Runnable) this.f75058);
                break;
        }
    }
}
