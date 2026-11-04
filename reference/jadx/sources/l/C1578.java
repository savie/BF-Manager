package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.֫֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes2.dex */
public final class C1578 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterator f5469;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Map.Entry f5470;

    public C1578(AbstractC11272 abstractC11272) {
        Iterator itM22904 = abstractC11272.f35569.m22904();
        this.f5469 = itM22904;
        if (itM22904.hasNext()) {
            this.f5470 = (Map.Entry) itM22904.next();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5597(int i, AbstractC14846 abstractC14846) {
        while (true) {
            Map.Entry entry = this.f5470;
            if (entry == null || ((C7323) entry.getKey()).getNumber() >= i) {
                return;
            }
            C8551.m22879((C7323) this.f5470.getKey(), this.f5470.getValue(), abstractC14846);
            Iterator it = this.f5469;
            if (it.hasNext()) {
                this.f5470 = (Map.Entry) it.next();
            } else {
                this.f5470 = null;
            }
        }
    }
}
