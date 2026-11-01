package l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ۘ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes3.dex */
public final class C4266 implements InterfaceC0738 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC19790 f15396;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21200 f15397;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21906 f15398;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f15399;

    public C4266(C21906 c21906, C21200 c21200) {
        this.f15398 = c21906;
        this.f15397 = c21200;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12060(C4266 c4266, C7648 c7648) {
        C21906 c21906 = c4266.f15398;
        if (c21906.f71078 == 0 || c4266.f15399) {
            return;
        }
        Looper looper = c21906.f71086;
        looper.getClass();
        c4266.f15396 = c21906.m48712(looper, c4266.f15397, c7648, false);
        c21906.f71087.add(c4266);
    }

    @Override // l.InterfaceC0738
    /* JADX INFO: renamed from: ۙ */
    public final void mo3203() {
        Handler handler = this.f15398.f71085;
        handler.getClass();
        C17983.m41836(handler, new Runnable() { // from class: l.֨᩻ۙ
            @Override // java.lang.Runnable
            public final void run() {
                C4266.m12059(this.f5911);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12059(C4266 c4266) {
        if (c4266.f15399) {
            return;
        }
        InterfaceC19790 interfaceC19790 = c4266.f15396;
        if (interfaceC19790 != null) {
            interfaceC19790.mo28386(c4266.f15397);
        }
        c4266.f15398.f71087.remove(c4266);
        c4266.f15399 = true;
    }
}
