package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ܺ۬۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 75VW */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16860 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54393;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f54394;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f54395;

    public /* synthetic */ RunnableC16860(int i, Object obj, Object obj2) {
        this.f54393 = i;
        this.f54395 = obj;
        this.f54394 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54393) {
            case 0:
                C21712 c21712 = (C21712) this.f54395;
                InterfaceC8697 interfaceC8697 = (InterfaceC8697) this.f54394;
                c21712.m14310();
                ViewOnClickListenerC15284.m36687(c21712.m49282(), interfaceC8697.mo23385().toUpperCase(Locale.ENGLISH));
                break;
            default:
                C24306.m54317((C24306) this.f54395, (Exception) this.f54394);
                break;
        }
    }
}
