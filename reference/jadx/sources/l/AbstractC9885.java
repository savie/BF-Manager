package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z94X */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9885 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f31794;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC0937[] f31795;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31796;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC0937[] mo25696();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract AbstractC0937 mo25697();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0937 m25694() {
        AbstractC0937 abstractC0937Mo25697;
        synchronized (this) {
            AbstractC0937[] abstractC0937ArrMo25696 = this.f31795;
            if (abstractC0937ArrMo25696 == null) {
                abstractC0937ArrMo25696 = mo25696();
                this.f31795 = abstractC0937ArrMo25696;
            } else if (this.f31794 >= abstractC0937ArrMo25696.length) {
                Object[] objArrCopyOf = Arrays.copyOf(abstractC0937ArrMo25696, abstractC0937ArrMo25696.length * 2);
                C15243.m36591(objArrCopyOf, "copyOf(...)");
                this.f31795 = (AbstractC0937[]) objArrCopyOf;
                abstractC0937ArrMo25696 = (AbstractC0937[]) objArrCopyOf;
            }
            int i = this.f31796;
            do {
                abstractC0937Mo25697 = abstractC0937ArrMo25696[i];
                if (abstractC0937Mo25697 == null) {
                    abstractC0937Mo25697 = mo25697();
                    abstractC0937ArrMo25696[i] = abstractC0937Mo25697;
                }
                i++;
                if (i >= abstractC0937ArrMo25696.length) {
                    i = 0;
                }
            } while (!abstractC0937Mo25697.mo3739(this));
            this.f31796 = i;
            this.f31794++;
        }
        return abstractC0937Mo25697;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25695(AbstractC0937 abstractC0937) {
        synchronized (this) {
            int i = this.f31794 - 1;
            this.f31794 = i;
            if (i == 0) {
                this.f31796 = 0;
            }
            C15243.m36587((Object) abstractC0937, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            abstractC0937.mo3740(this);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC0937[] m25698() {
        return this.f31795;
    }
}
