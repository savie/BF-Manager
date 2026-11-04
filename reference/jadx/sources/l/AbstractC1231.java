package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1231 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f4481;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9433 f4482;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashSet f4483 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Iterable mo4468(AbstractC22970 abstractC22970);

    public AbstractC1231(C9433 c9433, boolean z) {
        this.f4482 = c9433;
        int i = C14769.f48334;
        this.f4481 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m4469(AbstractC22970 abstractC22970, C14769 c14769) {
        if (abstractC22970 == null || !this.f4483.add(abstractC22970)) {
            return c14769;
        }
        if (this.f4481) {
            C9433 c9433 = this.f4482;
            c14769 = m4469(c9433.f30603.m55137(abstractC22970.f38067).f73596, c14769);
            Iterator it = c9433.f30603.m55144(abstractC22970.f38067).iterator();
            while (it.hasNext()) {
                c14769 = m4469(((AbstractC22664) it.next()).f73596, c14769);
            }
        }
        return c14769.m35552(mo4468(abstractC22970));
    }
}
