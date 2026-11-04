package l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.֨֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes3.dex */
public final class C0822 implements InterfaceC11502 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6789 f3101;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12994 f3102;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC10756 f3103;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f3104;

    public C0822(C6789 c6789, C12994 c12994) {
        this.f3101 = c6789;
        this.f3102 = c12994;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3291(C0822 c0822, C15648 c15648) {
        C6789 c6789 = c0822.f3101;
        if (c6789.f22625 == 0 || c0822.f3104) {
            return;
        }
        Looper looper = c6789.f22638;
        looper.getClass();
        c0822.f3103 = c6789.m18933(looper, c0822.f3102, c15648, false);
        c6789.f22634.add(c0822);
    }

    @Override // l.InterfaceC11502
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3292() {
        Handler handler = this.f3101.f22629;
        handler.getClass();
        C7116.m19483(handler, new Runnable() { // from class: l.ᩳ֨ۙ
            @Override // java.lang.Runnable
            public final void run() {
                C0822.m3290(this.f60875);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3290(C0822 c0822) {
        if (c0822.f3104) {
            return;
        }
        InterfaceC10756 interfaceC10756 = c0822.f3103;
        if (interfaceC10756 != null) {
            interfaceC10756.mo27415(c0822.f3102);
        }
        c0822.f3101.f22634.remove(c0822);
        c0822.f3104 = true;
    }
}
