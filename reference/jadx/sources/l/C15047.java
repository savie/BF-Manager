package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes5.dex */
public final class C15047 implements InterfaceC1624 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12064 f49110;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3861 f49111;

    public C15047(C3861 c3861, C12064 c12064) {
        this.f49111 = c3861;
        this.f49110 = c12064;
    }

    @Override // l.InterfaceC1624
    public final Iterator iterator() {
        return new C19523(this);
    }
}
