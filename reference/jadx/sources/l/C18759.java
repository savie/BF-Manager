package l;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: l.ᩴ۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 63JU */
/* JADX INFO: loaded from: classes5.dex */
public class C18759 extends AbstractC3380 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC21581 f60814;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC21581 f60815;

    @Override // l.AbstractC3380
    public final int[] calculateDistanceToFinalSnap(AbstractC5498 abstractC5498, View view) {
        int[] iArr = new int[2];
        if (abstractC5498.canScrollHorizontally()) {
            iArr[0] = m43314(view, m43316(abstractC5498));
        } else {
            iArr[0] = 0;
        }
        if (abstractC5498.canScrollVertically()) {
            iArr[1] = m43314(view, m43317(abstractC5498));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // l.AbstractC3380
    public View findSnapView(AbstractC5498 abstractC5498) {
        if (abstractC5498.canScrollVertically()) {
            return m43315(abstractC5498, m43317(abstractC5498));
        }
        if (abstractC5498.canScrollHorizontally()) {
            return m43315(abstractC5498, m43316(abstractC5498));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC3380
    public final int findTargetSnapPosition(AbstractC5498 abstractC5498, int i, int i2) {
        AbstractC21581 abstractC21581M43316;
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = abstractC5498.getItemCount();
        if (itemCount != 0) {
            View view = null;
            if (abstractC5498.canScrollVertically()) {
                abstractC21581M43316 = m43317(abstractC5498);
            } else {
                abstractC21581M43316 = abstractC5498.canScrollHorizontally() ? m43316(abstractC5498) : null;
            }
            if (abstractC21581M43316 != null) {
                int childCount = abstractC5498.getChildCount();
                boolean z = false;
                View view2 = null;
                int i3 = Integer.MIN_VALUE;
                int i4 = Integer.MAX_VALUE;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = abstractC5498.getChildAt(i5);
                    if (childAt != null) {
                        int iM43314 = m43314(childAt, abstractC21581M43316);
                        if (iM43314 <= 0 && iM43314 > i3) {
                            view2 = childAt;
                            i3 = iM43314;
                        }
                        if (iM43314 >= 0 && iM43314 < i4) {
                            view = childAt;
                            i4 = iM43314;
                        }
                    }
                }
                boolean z2 = !abstractC5498.canScrollHorizontally() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return abstractC5498.getPosition(view);
                }
                if (!z2 && view2 != null) {
                    return abstractC5498.getPosition(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view != null) {
                    int position = abstractC5498.getPosition(view);
                    int itemCount2 = abstractC5498.getItemCount();
                    if ((abstractC5498 instanceof InterfaceC7615) && (pointFComputeScrollVectorForPosition = ((InterfaceC7615) abstractC5498).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
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

    @Override // l.AbstractC3380
    public final AbstractC21020 createScroller(AbstractC5498 abstractC5498) {
        if (abstractC5498 instanceof InterfaceC7615) {
            return new C18053(this, this.mRecyclerView.getContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43314(View view, AbstractC21581 abstractC21581) {
        return ((abstractC21581.mo36482(view) / 2) + abstractC21581.mo36473(view)) - ((abstractC21581.mo36471() / 2) + abstractC21581.mo36483());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static View m43315(AbstractC5498 abstractC5498, AbstractC21581 abstractC21581) {
        int childCount = abstractC5498.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iMo36471 = (abstractC21581.mo36471() / 2) + abstractC21581.mo36483();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = abstractC5498.getChildAt(i2);
            int iAbs = Math.abs(((abstractC21581.mo36482(childAt) / 2) + abstractC21581.mo36473(childAt)) - iMo36471);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private AbstractC21581 m43317(AbstractC5498 abstractC5498) {
        AbstractC21581 abstractC21581 = this.f60815;
        if (abstractC21581 == null || abstractC21581.f70033 != abstractC5498) {
            this.f60815 = new C15232(abstractC5498);
        }
        return this.f60815;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC21581 m43316(AbstractC5498 abstractC5498) {
        AbstractC21581 abstractC21581 = this.f60814;
        if (abstractC21581 == null || abstractC21581.f70033 != abstractC5498) {
            this.f60814 = new C22993(abstractC5498);
        }
        return this.f60814;
    }
}
