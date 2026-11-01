package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩵ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19376 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C7381 f62445;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8793 f62446;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2516 f62447;

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
    }

    public C19376(ViewOnClickListenerC8793 viewOnClickListenerC8793, C2516 c2516, C7381 c7381) {
        this.f62446 = viewOnClickListenerC8793;
        this.f62447 = c2516;
        this.f62445 = c7381;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        this.f62445.m19656();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        ViewOnClickListenerC8793 viewOnClickListenerC8793 = this.f62446;
        if (viewOnClickListenerC8793.f30234 == this) {
            viewOnClickListenerC8793.f30234 = null;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C13026 c13026;
        ViewOnClickListenerC8793 viewOnClickListenerC8793 = this.f62446;
        if (viewOnClickListenerC8793.f30234 != this || viewOnClickListenerC8793.f30251 || viewOnClickListenerC8793.f30227 || viewOnClickListenerC8793.isFinishing() || viewOnClickListenerC8793.isDestroyed() || (c13026 = viewOnClickListenerC8793.f30239) == null) {
            return;
        }
        C2516 c2516M33458 = c13026.f43452.m33458();
        C2516 c2516 = this.f62447;
        if (c2516M33458 == c2516 && viewOnClickListenerC8793.f30236 == this.f62445 && !viewOnClickListenerC8793.f30228.m43157(c2516)) {
            if (exc instanceof C8599) {
                viewOnClickListenerC8793.m22903();
            } else {
                viewOnClickListenerC8793.m31018(R.string.MT_Protector);
            }
        }
    }
}
