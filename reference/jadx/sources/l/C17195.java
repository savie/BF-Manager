package l;

import android.app.Application;
import android.content.Context;

/* JADX INFO: renamed from: l.ܿ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8OH */
/* JADX INFO: loaded from: classes4.dex */
public final class C17195 implements InterfaceC20723 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10846 f54820;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Context f54821;

    public C17195(Application application) {
        C10846 c10846 = new C10846();
        this.f54821 = application.getApplicationContext();
        this.f54820 = c10846;
    }

    @Override // l.InterfaceC20723
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15785 mo4000() {
        return new C5906(this.f54821, this.f54820.mo4000());
    }
}
