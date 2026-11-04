package l;

import android.content.ComponentName;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.᩹ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q13J */
/* JADX INFO: loaded from: classes.dex */
public final class C23296 implements InterfaceC16648 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ComponentName f75458;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f75459;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f75460;

    public C23296(ComponentName componentName, boolean z, boolean z2) {
        this.f75458 = componentName;
        this.f75459 = z;
        this.f75460 = z2;
    }

    @Override // l.InterfaceC16648
    /* JADX INFO: renamed from: ۤ */
    public final ComponentName mo39358() {
        return this.f75458;
    }

    @Override // l.InterfaceC16648
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo39359() {
        return this.f75459;
    }

    @Override // l.InterfaceC16648
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo39357() {
        return this.f75460;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52412(final C8614 c8614, final InterfaceC2386 interfaceC2386) {
        if (C3158.m10299(c8614, interfaceC2386)) {
            C20065.m46116(interfaceC2386, OpenAuthTask.Duplex);
            C3158.m10298(c8614, interfaceC2386, this.f75458);
        } else {
            C1663.m5975(c8614, interfaceC2386, new InterfaceC5392() { // from class: l.ܶۘᩴ
                @Override // l.InterfaceC5392
                /* JADX INFO: renamed from: ۙ */
                public final void mo1772(AbstractC22044 abstractC22044) {
                    InterfaceC2386 interfaceC2387 = interfaceC2386;
                    C20065.m46116(interfaceC2387, OpenAuthTask.Duplex);
                    C20312.m46653(c8614.m23233(), abstractC22044, interfaceC2387.mo8114()).m46659(this.f51504);
                }
            });
        }
    }
}
