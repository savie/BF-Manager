package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ۛ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KV */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6422 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18186(AbstractC22830 abstractC22830, C15179 c15179) {
        C15243.m36590(abstractC22830, "baseDotsIndicator");
        C15243.m36590(c15179, "attachable");
        AbstractC6274 abstractC6274M36524 = c15179.m36524();
        if (abstractC6274M36524 == null) {
            throw new IllegalStateException("Please set an adapter to the view pager (1 or 2) or the recycler before initializing the dots indicator");
        }
        abstractC6274M36524.m17943((DataSetObserver) new C14624(new C12387(abstractC22830)));
        abstractC22830.m51487(new C4184(c15179));
        abstractC22830.m51484();
    }
}
