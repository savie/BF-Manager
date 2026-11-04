package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C0132 implements InterfaceC1624 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21935 f1094;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f1095;

    public C0132(String str, C21935 c21935) {
        this.f1095 = str;
        this.f1094 = c21935;
    }

    @Override // l.InterfaceC1624
    public final Iterator iterator() {
        return new C18031(this);
    }
}
