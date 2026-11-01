package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes4.dex */
public final class C11824 implements InterfaceC22407 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18879 f39714;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9002 f39715;

    public C11824(C9002 c9002, C18879 c18879) {
        this.f39715 = c9002;
        this.f39714 = c18879;
    }

    @Override // l.InterfaceC22407
    public final Iterator iterator() {
        return new C13941(this);
    }
}
