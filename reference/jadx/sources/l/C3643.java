package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ۘۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB24 */
/* JADX INFO: loaded from: classes3.dex */
public class C3643 implements InterfaceC7296 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3062 f13366;

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ void mo10182(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo10183(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۚ */
    public final /* synthetic */ void mo10184(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ void mo10185(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ void mo10187(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ܰ */
    public final void mo10186(InterfaceC1423 interfaceC1423) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = C16614.m39075(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new RunnableC17755(), 500L);
        this.f13366.mo9172(this);
    }

    public C3643(C18461 c18461, AbstractC3062 abstractC3062) {
        this.f13366 = abstractC3062;
    }
}
