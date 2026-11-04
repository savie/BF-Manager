package l;

import android.app.Application;
import android.content.Context;

/* JADX INFO: renamed from: l.ܺ᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8OH */
/* JADX INFO: loaded from: classes5.dex */
public final class C17162 implements InterfaceC15670 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16416 f55961;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Context f55962;

    public C17162(Application application) {
        C16416 c16416 = new C16416();
        this.f55962 = application.getApplicationContext();
        this.f55961 = c16416;
    }

    @Override // l.InterfaceC15670
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC13433 mo3996() {
        return new C17908(this.f55962, this.f55961.mo3996());
    }
}
