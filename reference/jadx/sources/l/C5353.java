package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5353 implements InterfaceC1624 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23253 f18789;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC3071 f18790;

    public C5353(C23253 c23253, InterfaceC3071 interfaceC3071) {
        this.f18789 = c23253;
        this.f18790 = interfaceC3071;
    }

    @Override // l.InterfaceC1624
    public final Iterator iterator() {
        return new C12810(this);
    }
}
