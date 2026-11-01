package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5453 extends AbstractC4166 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f18801;

    public final String toString() {
        return C16523.m38890("[^", this.f18801, "]");
    }

    public C5453(String str) {
        C5557.m15342(str);
        this.f18801 = C1323.m4722(str);
    }

    @Override // l.AbstractC4166
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2407(C0617 c0617, C0617 c0618) {
        Iterator it = c0618.mo2839().m36940().iterator();
        while (it.hasNext()) {
            if (C1323.m4722(((C6968) it.next()).getKey()).startsWith(this.f18801)) {
                return true;
            }
        }
        return false;
    }
}
