package l;

import bin.mt.plus.R;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۬ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13610 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12359 f43232;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f43233;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23065 f43234;

    public C13610(C23065 c23065, C12359 c12359, DialogInterfaceC8327 dialogInterfaceC8327) {
        this.f43234 = c23065;
        this.f43232 = c12359;
        this.f43233 = dialogInterfaceC8327;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8199(this.f43234.f74817, 300);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        int i = ServiceC6459.f21716;
        final C20629 c20629 = new C20629(0);
        int i2 = C11678.f37828;
        C1897.m6529(this.f43232, new Supplier() { // from class: l.֫ܳۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C11678.m29354(c20629);
            }
        });
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f43233;
        C23065 c23065 = this.f43234;
        C23065.m51975(c23065, dialogInterfaceC8327);
        new C6899(c23065).m8197();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C22673.m51154((CharSequence) this.f43234.f74817.getString(R.string.MT_Protector, exc.getMessage()));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
