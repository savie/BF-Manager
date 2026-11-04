package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1L1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18662 implements InterfaceC21646 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3746 f60691;

    public C18662(InterfaceC3746 interfaceC3746) {
        this.f60691 = interfaceC3746;
    }

    @Override // l.InterfaceC3746
    /* JADX INFO: renamed from: ᩴ */
    public final int mo3130() {
        return this.f60691.mo3130();
    }

    @Override // l.InterfaceC3746
    /* JADX INFO: renamed from: ᩸ */
    public final int mo3132() {
        return this.f60691.mo3132();
    }

    @Override // l.InterfaceC3746
    /* JADX INFO: renamed from: ۙ */
    public final C16424 mo3127() {
        return new C16424(this);
    }

    @Override // l.InterfaceC3746
    /* JADX INFO: renamed from: ܳ */
    public final Iterator mo3129() {
        return this.f60691.mo3129();
    }

    @Override // l.InterfaceC3746
    /* JADX INFO: renamed from: ᩷ */
    public final Iterable mo3131() {
        return new Iterable() { // from class: l.᩹᩺ܶ
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return this.mo3128();
            }
        };
    }

    @Override // l.InterfaceC3746
    /* JADX INFO: renamed from: ۤ */
    public final Iterator mo3128() {
        return this.f60691.mo3128();
    }
}
