package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes5.dex */
public final class C17285 implements InterfaceC1624 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23955 f56312;

    public C17285(InterfaceC23955 interfaceC23955) {
        this.f56312 = interfaceC23955;
    }

    @Override // l.InterfaceC1624
    public final Iterator iterator() {
        C11318 c11318 = new C11318();
        c11318.m28602(C13808.m33719(this.f56312, c11318, c11318));
        return c11318;
    }
}
