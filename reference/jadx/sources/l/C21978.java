package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: D3VQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21978 extends AbstractC9943 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Iterator f71287;

    public C21978(C0810 c0810) {
        this.f71287 = C0810.f3431.m31458(c0810.f3432).iterator();
    }

    @Override // l.AbstractC9943
    /* JADX INFO: renamed from: ۙ */
    public final Object mo20056() {
        Iterator it = this.f71287;
        if (it.hasNext()) {
            String str = (String) it.next();
            if (it.hasNext() || !str.isEmpty()) {
                return str;
            }
        }
        m25170();
        return null;
    }
}
