package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C8154 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19341 f26907;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C1442 f26908;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C19143 f26909;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
    }

    public C8154(ViewOnClickListenerC19341 viewOnClickListenerC19341, C19143 c19143, C1442 c1442) {
        this.f26907 = viewOnClickListenerC19341;
        this.f26909 = c19143;
        this.f26908 = c1442;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        this.f26908.m5191();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        ViewOnClickListenerC19341 viewOnClickListenerC19341 = this.f26907;
        if (viewOnClickListenerC19341.f62494 == this) {
            viewOnClickListenerC19341.f62494 = null;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C12628 c12628;
        ViewOnClickListenerC19341 viewOnClickListenerC19341 = this.f26907;
        if (viewOnClickListenerC19341.f62494 != this || viewOnClickListenerC19341.f62502 || viewOnClickListenerC19341.f62470 || viewOnClickListenerC19341.isFinishing() || viewOnClickListenerC19341.isDestroyed() || (c12628 = viewOnClickListenerC19341.f62500) == null) {
            return;
        }
        C19143 c19143M17213 = c12628.f40509.m17213();
        C19143 c19143 = this.f26909;
        if (c19143M17213 == c19143 && viewOnClickListenerC19341.f62482 == this.f26908 && !viewOnClickListenerC19341.f62499.m43174(c19143)) {
            if (!(exc instanceof C12893)) {
                viewOnClickListenerC19341.m40398(R.string.MT_Protector, false);
            } else {
                viewOnClickListenerC19341.m44755();
            }
        }
    }
}
