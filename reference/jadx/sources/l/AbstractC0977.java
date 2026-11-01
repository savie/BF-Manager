package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.֨۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KV */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0977 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3767(AbstractC16584 abstractC16584, C19383 c19383) {
        C13465.m32966(abstractC16584, "baseDotsIndicator");
        C13465.m32966(c19383, "attachable");
        AbstractC14217 abstractC14217M44430 = c19383.m44430();
        if (abstractC14217M44430 == null) {
            throw new IllegalStateException("Please set an adapter to the view pager (1 or 2) or the recycler before initializing the dots indicator");
        }
        abstractC14217M44430.m34319((DataSetObserver) new C6622(new C5211(abstractC16584)));
        abstractC16584.m39017(new C3799(c19383));
        abstractC16584.m39014();
    }
}
