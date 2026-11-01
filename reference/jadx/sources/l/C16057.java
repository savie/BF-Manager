package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16057 implements InterfaceC22407 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9707 f51949;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f51950;

    public C16057(String str, C9707 c9707) {
        this.f51950 = str;
        this.f51949 = c9707;
    }

    @Override // l.InterfaceC22407
    public final Iterator iterator() {
        return new C20995(this);
    }
}
