package l;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۙ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R5DS */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4542 implements Runnable {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f16146 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Comparator f16147 = new C8795();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f16149;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f16151;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f16150 = new ArrayList();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f16148 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14284(C25227 c25227, int i, int i2) {
        if (c25227.isAttachedToWindow()) {
            if (C25227.sDebugAssertionsEnabled && !this.f16150.contains(c25227)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f16151 == 0) {
                this.f16151 = c25227.getNanoTime();
                c25227.post(this);
            }
        }
        C7304 c7304 = c25227.mPrefetchRegistry;
        c7304.f24041 = i;
        c7304.f24043 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14283(long j) {
        C14015 c14015;
        C25227 c25227;
        C25227 c25228;
        C14015 c14016;
        ArrayList arrayList = this.f16150;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C25227 c25229 = (C25227) arrayList.get(i2);
            if (c25229.getWindowVisibility() == 0) {
                c25229.mPrefetchRegistry.m19988(c25229, false);
                i += c25229.mPrefetchRegistry.f24040;
            }
        }
        ArrayList arrayList2 = this.f16148;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C25227 c252210 = (C25227) arrayList.get(i4);
            if (c252210.getWindowVisibility() == 0) {
                C7304 c7304 = c252210.mPrefetchRegistry;
                int iAbs = Math.abs(c7304.f24043) + Math.abs(c7304.f24041);
                for (int i5 = 0; i5 < c7304.f24040 * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c14016 = new C14015();
                        arrayList2.add(c14016);
                    } else {
                        c14016 = (C14015) arrayList2.get(i3);
                    }
                    int[] iArr = c7304.f24042;
                    int i6 = iArr[i5 + 1];
                    c14016.f44404 = i6 <= iAbs;
                    c14016.f44403 = iAbs;
                    c14016.f44401 = i6;
                    c14016.f44405 = c252210;
                    c14016.f44402 = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f16147);
        for (int i7 = 0; i7 < arrayList2.size() && (c25227 = (c14015 = (C14015) arrayList2.get(i7)).f44405) != null; i7++) {
            AbstractC11800 abstractC11800M14282 = m14282(c25227, c14015.f44402, c14015.f44404 ? Long.MAX_VALUE : j);
            if (abstractC11800M14282 != null && abstractC11800M14282.mNestedRecyclerView != null && abstractC11800M14282.isBound() && !abstractC11800M14282.isInvalid() && (c25228 = (C25227) abstractC11800M14282.mNestedRecyclerView.get()) != null) {
                if (c25228.mDataSetHasChangedAfterLayout && c25228.mChildHelper.m37158() != 0) {
                    c25228.removeAndRecycleViews();
                }
                C7304 c7305 = c25228.mPrefetchRegistry;
                c7305.m19988(c25228, true);
                if (c7305.f24040 == 0) {
                    continue;
                } else {
                    try {
                        Trace.beginSection(j == C25227.FOREVER_NS ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        C15529 c15529 = c25228.mState;
                        AbstractC12964 abstractC12964 = c25228.mAdapter;
                        c15529.f50517 = 1;
                        c15529.f50520 = abstractC12964.getItemCount();
                        c15529.f50525 = false;
                        c15529.f50522 = false;
                        c15529.f50521 = false;
                        for (int i8 = 0; i8 < c7305.f24040 * 2; i8 += 2) {
                            m14282(c25228, c7305.f24042[i8], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c14015.f44404 = false;
            c14015.f44403 = 0;
            c14015.f44401 = 0;
            c14015.f44405 = null;
            c14015.f44402 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11800 m14282(C25227 c25227, int i, long j) {
        int iM37158 = c25227.mChildHelper.m37158();
        for (int i2 = 0; i2 < iM37158; i2++) {
            AbstractC11800 abstractC11800M56274 = C25227.m56274(c25227.mChildHelper.m37155(i2));
            if (abstractC11800M56274.mPosition == i && !abstractC11800M56274.isInvalid()) {
                return null;
            }
        }
        C2523 c2523 = c25227.mRecycler;
        if (j == C25227.FOREVER_NS) {
            try {
                if (C21217.m48373()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                c25227.onExitLayoutOrScroll(false);
                Trace.endSection();
            }
        }
        c25227.onEnterLayoutOrScroll();
        AbstractC11800 abstractC11800M8415 = c2523.m8415(i, j);
        if (abstractC11800M8415 != null) {
            if (abstractC11800M8415.isBound() && !abstractC11800M8415.isInvalid()) {
                c2523.m8416(abstractC11800M8415.itemView);
            } else {
                c2523.m8419(abstractC11800M8415, false);
            }
        }
        return abstractC11800M8415;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f16150;
        try {
            Trace.beginSection(C25227.TRACE_PREFETCH_TAG);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    C25227 c25227 = (C25227) arrayList.get(i);
                    if (c25227.getWindowVisibility() == 0) {
                        jMax = Math.max(c25227.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m14283(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f16149);
                }
            }
        } finally {
            this.f16151 = 0L;
            Trace.endSection();
        }
    }
}
