package l;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۡܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5DS */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9007 implements Runnable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f30801 = new ThreadLocal();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Comparator f30802 = new C18884();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f30804;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f30806;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f30803 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f30805 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23323(C17492 c17492, int i, int i2) {
        if (c17492.isAttachedToWindow()) {
            if (C17492.sDebugAssertionsEnabled && !this.f30803.contains(c17492)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f30806 == 0) {
                this.f30806 = c17492.getNanoTime();
                c17492.post(this);
            }
        }
        C8301 c8301 = c17492.mPrefetchRegistry;
        c8301.f28823 = i;
        c8301.f28821 = i2;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x011e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23322(long j) {
        C19590 c19590;
        C17492 c17492;
        C17492 c17493;
        C19590 c19591;
        ArrayList arrayList = this.f30803;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C17492 c17494 = (C17492) arrayList.get(i2);
            if (c17494.getWindowVisibility() == 0) {
                c17494.mPrefetchRegistry.m21734(c17494, false);
                i += c17494.mPrefetchRegistry.f28822;
            }
        }
        ArrayList arrayList2 = this.f30805;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C17492 c17495 = (C17492) arrayList.get(i4);
            if (c17495.getWindowVisibility() == 0) {
                C8301 c8301 = c17495.mPrefetchRegistry;
                int iAbs = Math.abs(c8301.f28821) + Math.abs(c8301.f28823);
                for (int i5 = 0; i5 < c8301.f28822 * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c19591 = new C19590();
                        arrayList2.add(c19591);
                    } else {
                        c19591 = (C19590) arrayList2.get(i3);
                    }
                    int[] iArr = c8301.f28824;
                    int i6 = iArr[i5 + 1];
                    c19591.f62929 = i6 <= iAbs;
                    c19591.f62927 = iAbs;
                    c19591.f62926 = i6;
                    c19591.f62925 = c17495;
                    c19591.f62928 = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f30802);
        for (int i7 = 0; i7 < arrayList2.size() && (c17492 = (c19590 = (C19590) arrayList2.get(i7)).f62925) != null; i7++) {
            AbstractC12554 abstractC12554M23321 = m23321(c17492, c19590.f62928, c19590.f62929 ? C17492.FOREVER_NS : j);
            if (abstractC12554M23321 != null && abstractC12554M23321.mNestedRecyclerView != null && abstractC12554M23321.isBound() && !abstractC12554M23321.isInvalid() && (c17493 = (C17492) abstractC12554M23321.mNestedRecyclerView.get()) != null) {
                if (c17493.mDataSetHasChangedAfterLayout && c17493.mChildHelper.m45070() != 0) {
                    c17493.removeAndRecycleViews();
                }
                C8301 c8302 = c17493.mPrefetchRegistry;
                c8302.m21734(c17493, true);
                if (c8302.f28822 != 0) {
                    try {
                        int i8 = C8684.f29888;
                        Trace.beginSection(C17492.TRACE_NESTED_PREFETCH_TAG);
                        C16082 c16082 = c17493.mState;
                        AbstractC0414 abstractC0414 = c17493.mAdapter;
                        c16082.f52018 = 1;
                        c16082.f52011 = abstractC0414.getItemCount();
                        c16082.f52015 = false;
                        c16082.f52021 = false;
                        c16082.f52023 = false;
                        for (int i9 = 0; i9 < c8302.f28822 * 2; i9 += 2) {
                            m23321(c17493, c8302.f28824[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = C8684.f29888;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c19590.f62929 = false;
            c19590.f62927 = 0;
            c19590.f62926 = 0;
            c19590.f62925 = null;
            c19590.f62928 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC12554 m23321(C17492 c17492, int i, long j) {
        int iM45070 = c17492.mChildHelper.m45070();
        for (int i2 = 0; i2 < iM45070; i2++) {
            AbstractC12554 abstractC12554M40745 = C17492.m40745(c17492.mChildHelper.m45068(i2));
            if (abstractC12554M40745.mPosition == i && !abstractC12554M40745.isInvalid()) {
                return null;
            }
        }
        C21726 c21726 = c17492.mRecycler;
        try {
            c17492.onEnterLayoutOrScroll();
            AbstractC12554 abstractC12554M48475 = c21726.m48475(i, j);
            if (abstractC12554M48475 != null) {
                if (abstractC12554M48475.isBound() && !abstractC12554M48475.isInvalid()) {
                    c21726.m48477(abstractC12554M48475.itemView);
                } else {
                    c21726.m48480(abstractC12554M48475, false);
                }
            }
            return abstractC12554M48475;
        } finally {
            c17492.onExitLayoutOrScroll(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f30803;
        try {
            int i = C8684.f29888;
            Trace.beginSection(C17492.TRACE_PREFETCH_TAG);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C17492 c17492 = (C17492) arrayList.get(i2);
                    if (c17492.getWindowVisibility() == 0) {
                        jMax = Math.max(c17492.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m23322(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f30804);
                }
            }
            this.f30806 = 0L;
        } finally {
            this.f30806 = 0L;
            int i3 = C8684.f29888;
            Trace.endSection();
        }
    }
}
