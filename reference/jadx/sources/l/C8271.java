package l;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: l.۠֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 63JU */
/* JADX INFO: loaded from: classes4.dex */
public class C8271 extends AbstractC12546 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC9016 f27215;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC9016 f27216;

    @Override // l.AbstractC12546
    public final int[] calculateDistanceToFinalSnap(AbstractC21169 abstractC21169, View view) {
        int[] iArr = new int[2];
        if (abstractC21169.canScrollHorizontally()) {
            iArr[0] = m22323(view, m22325(abstractC21169));
        } else {
            iArr[0] = 0;
        }
        if (abstractC21169.canScrollVertically()) {
            iArr[1] = m22323(view, m22326(abstractC21169));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // l.AbstractC12546
    public View findSnapView(AbstractC21169 abstractC21169) {
        if (abstractC21169.canScrollVertically()) {
            return m22324(abstractC21169, m22326(abstractC21169));
        }
        if (abstractC21169.canScrollHorizontally()) {
            return m22324(abstractC21169, m22325(abstractC21169));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC12546
    public final int findTargetSnapPosition(AbstractC21169 abstractC21169, int i, int i2) {
        AbstractC9016 abstractC9016M22325;
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = abstractC21169.getItemCount();
        if (itemCount != 0) {
            View view = null;
            if (abstractC21169.canScrollVertically()) {
                abstractC9016M22325 = m22326(abstractC21169);
            } else {
                abstractC9016M22325 = abstractC21169.canScrollHorizontally() ? m22325(abstractC21169) : null;
            }
            if (abstractC9016M22325 != null) {
                int childCount = abstractC21169.getChildCount();
                boolean z = false;
                View view2 = null;
                int i3 = Integer.MIN_VALUE;
                int i4 = Integer.MAX_VALUE;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = abstractC21169.getChildAt(i5);
                    if (childAt != null) {
                        int iM22323 = m22323(childAt, abstractC9016M22325);
                        if (iM22323 <= 0 && iM22323 > i3) {
                            view2 = childAt;
                            i3 = iM22323;
                        }
                        if (iM22323 >= 0 && iM22323 < i4) {
                            view = childAt;
                            i4 = iM22323;
                        }
                    }
                }
                boolean z2 = !abstractC21169.canScrollHorizontally() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return abstractC21169.getPosition(view);
                }
                if (!z2 && view2 != null) {
                    return abstractC21169.getPosition(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view != null) {
                    int position = abstractC21169.getPosition(view);
                    int itemCount2 = abstractC21169.getItemCount();
                    if ((abstractC21169 instanceof InterfaceC22989) && (pointFComputeScrollVectorForPosition = ((InterfaceC22989) abstractC21169).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
                        z = true;
                    }
                    int i6 = position + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < itemCount) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    @Override // l.AbstractC12546
    public final AbstractC20005 createScroller(AbstractC21169 abstractC21169) {
        if (abstractC21169 instanceof InterfaceC22989) {
            return new C2305(this, this.mRecyclerView.getContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22323(View view, AbstractC9016 abstractC9016) {
        return ((abstractC9016.mo3278(view) / 2) + abstractC9016.mo3280(view)) - ((abstractC9016.mo3272() / 2) + abstractC9016.mo3273());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static View m22324(AbstractC21169 abstractC21169, AbstractC9016 abstractC9016) {
        int childCount = abstractC21169.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iMo3272 = (abstractC9016.mo3272() / 2) + abstractC9016.mo3273();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = abstractC21169.getChildAt(i2);
            int iAbs = Math.abs(((abstractC9016.mo3278(childAt) / 2) + abstractC9016.mo3280(childAt)) - iMo3272);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private AbstractC9016 m22326(AbstractC21169 abstractC21169) {
        AbstractC9016 abstractC9016 = this.f27216;
        if (abstractC9016 == null || abstractC9016.f29369 != abstractC21169) {
            this.f27216 = new C0813(abstractC21169);
        }
        return this.f27216;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC9016 m22325(AbstractC21169 abstractC21169) {
        AbstractC9016 abstractC9016 = this.f27215;
        if (abstractC9016 == null || abstractC9016.f29369 != abstractC21169) {
            this.f27215 = new C9761(abstractC21169);
        }
        return this.f27215;
    }
}
