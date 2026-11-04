package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4069 extends AbstractC0078 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f13887;

    public final String toString() {
        return C14442.m34865("[^", this.f13887, "]");
    }

    public C4069(String str) {
        C14838.m35755(str);
        this.f13887 = C15300.m36731(str);
    }

    @Override // l.AbstractC0078
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1133(C15496 c15496, C15496 c15497) {
        Iterator it = c15497.mo37069().m26660().iterator();
        while (it.hasNext()) {
            if (C15300.m36731(((C8127) it.next()).getKey()).startsWith(this.f13887)) {
                return true;
            }
        }
        return false;
    }
}
