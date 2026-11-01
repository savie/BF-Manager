package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public final class C17518 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterator f55690;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Map.Entry f55691;

    public C17518(AbstractC6229 abstractC6229) {
        Iterator itM21847 = abstractC6229.f21147.m21847();
        this.f55690 = itM21847;
        if (itM21847.hasNext()) {
            this.f55691 = (Map.Entry) itM21847.next();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40779(int i, AbstractC22044 abstractC22044) {
        while (true) {
            Map.Entry entry = this.f55691;
            if (entry == null || ((C19741) entry.getKey()).getNumber() >= i) {
                return;
            }
            C8347.m21820((C19741) this.f55691.getKey(), this.f55691.getValue(), abstractC22044);
            Iterator it = this.f55690;
            if (it.hasNext()) {
                this.f55691 = (Map.Entry) it.next();
            } else {
                this.f55691 = null;
            }
        }
    }
}
