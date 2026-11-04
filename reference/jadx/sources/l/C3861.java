package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes3.dex */
public final class C3861 implements InterfaceC1624 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1624 f13173;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC3071 f13174;

    public C3861(InterfaceC1624 interfaceC1624, InterfaceC3071 interfaceC3071) {
        this.f13173 = interfaceC1624;
        this.f13174 = interfaceC3071;
    }

    @Override // l.InterfaceC1624
    public final Iterator iterator() {
        return new C23999(this);
    }
}
