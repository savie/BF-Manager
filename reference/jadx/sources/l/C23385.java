package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩹ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N1O9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23385 extends AbstractC9980 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f75700;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75701;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f75702;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f75703;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15925 f75704;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C25227 f75705;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0067 f75706;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6976 f75707;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f75708;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC21147 f75709;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f75710;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f75711;

    public C23385(C6976 c6976) {
        this.f75707 = c6976;
        C25227 c25227 = c6976.f23017;
        this.f75705 = c25227;
        this.f75706 = (C0067) c25227.getLayoutManager();
        this.f75704 = new C15925();
        m52555();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m52555() {
        this.f75701 = 0;
        this.f75700 = 0;
        C15925 c15925 = this.f75704;
        c15925.f51732 = -1;
        c15925.f51731 = 0.0f;
        c15925.f51733 = 0;
        this.f75708 = -1;
        this.f75711 = -1;
        this.f75710 = false;
        this.f75702 = false;
        this.f75703 = false;
    }

    @Override // l.AbstractC9980
    public final void onScrollStateChanged(C25227 c25227, int i) {
        AbstractC21147 abstractC21147;
        AbstractC21147 abstractC21148;
        int i2 = this.f75701;
        if (!(i2 == 1 && this.f75700 == 1) && i == 1) {
            this.f75701 = 1;
            int i3 = this.f75711;
            if (i3 != -1) {
                this.f75708 = i3;
                this.f75711 = -1;
            } else if (this.f75708 == -1) {
                this.f75708 = this.f75706.findFirstVisibleItemPosition();
            }
            m52553(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.f75702) {
                m52553(2);
                this.f75710 = true;
                return;
            }
            return;
        }
        C15925 c15925 = this.f75704;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            m52554();
            if (!this.f75702) {
                int i4 = c15925.f51732;
                if (i4 != -1 && (abstractC21148 = this.f75709) != null) {
                    abstractC21148.onPageScrolled(i4, 0.0f, 0);
                }
            } else if (c15925.f51733 == 0) {
                int i5 = this.f75708;
                int i6 = c15925.f51732;
                if (i5 != i6 && (abstractC21147 = this.f75709) != null) {
                    abstractC21147.onPageSelected(i6);
                }
            }
            m52553(0);
            m52555();
        }
        if (this.f75701 == 2 && i == 0 && this.f75703) {
            m52554();
            if (c15925.f51733 == 0) {
                int i7 = this.f75711;
                int i8 = c15925.f51732;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    AbstractC21147 abstractC21149 = this.f75709;
                    if (abstractC21149 != null) {
                        abstractC21149.onPageSelected(i8);
                    }
                }
                m52553(0);
                m52555();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a A[PHI: r7 r8
      0x004a: PHI (r7v11 int) = (r7v3 int), (r7v15 int) binds: [B:30:0x0048, B:22:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r8v4 l.᩶ۜ᩷) = (r8v1 l.᩶ۜ᩷), (r8v6 l.᩶ۜ᩷) binds: [B:30:0x0048, B:22:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC9980
    public final void onScrolled(C25227 c25227, int i, int i2) {
        int i3;
        AbstractC21147 abstractC21147;
        this.f75702 = true;
        m52554();
        boolean z = this.f75710;
        C15925 c15925 = this.f75704;
        if (z) {
            this.f75710 = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == (this.f75707.f23026.getLayoutDirection() == 1)) {
                        if (c15925.f51733 != 0) {
                            i3 = c15925.f51732 + 1;
                        }
                    }
                }
                i3 = c15925.f51732;
            } else if (c15925.f51733 != 0) {
                i3 = c15925.f51732 + 1;
            } else {
                i3 = c15925.f51732;
            }
            this.f75711 = i3;
            if (this.f75708 != i3 && (abstractC21147 = this.f75709) != null) {
                abstractC21147.onPageSelected(i3);
            }
        } else if (this.f75701 == 0) {
            i3 = c15925.f51732;
            if (i3 == -1) {
                i3 = 0;
            }
            abstractC21147 = this.f75709;
            if (abstractC21147 != null) {
                abstractC21147.onPageSelected(i3);
            }
        }
        int i4 = c15925.f51732;
        if (i4 == -1) {
            i4 = 0;
        }
        float f = c15925.f51731;
        int i5 = c15925.f51733;
        AbstractC21147 abstractC21148 = this.f75709;
        if (abstractC21148 != null) {
            abstractC21148.onPageScrolled(i4, f, i5);
        }
        int i6 = c15925.f51732;
        int i7 = this.f75711;
        if ((i6 == i7 || i7 == -1) && c15925.f51733 == 0 && this.f75700 != 1) {
            m52553(0);
            m52555();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m52554() {
        View viewFindViewByPosition;
        int top;
        C0067 c0067 = this.f75706;
        int iFindFirstVisibleItemPosition = c0067.findFirstVisibleItemPosition();
        C15925 c15925 = this.f75704;
        c15925.f51732 = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1 || (viewFindViewByPosition = c0067.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
            c15925.f51732 = -1;
            c15925.f51731 = 0.0f;
            c15925.f51733 = 0;
            return;
        }
        int leftDecorationWidth = c0067.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = c0067.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = c0067.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = c0067.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        int orientation = c0067.getOrientation();
        C25227 c25227 = this.f75705;
        if (orientation == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - c25227.getPaddingLeft();
            if (this.f75707.f23026.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - c25227.getPaddingTop();
        }
        int i = -top;
        c15925.f51733 = i;
        if (i >= 0) {
            c15925.f51731 = height != 0 ? i / height : 0.0f;
        } else {
            if (new C11450(c0067).m28810()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            Locale locale = Locale.US;
            throw new IllegalStateException(C13645.m33382(c15925.f51733, "Page can only be offset by a positive amount, not by "));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m52561() {
        this.f75703 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52557(int i, boolean z) {
        AbstractC21147 abstractC21147;
        this.f75701 = z ? 2 : 3;
        boolean z2 = this.f75711 != i;
        this.f75711 = i;
        m52553(2);
        if (!z2 || (abstractC21147 = this.f75709) == null) {
            return;
        }
        abstractC21147.onPageSelected(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52558(AbstractC21147 abstractC21147) {
        this.f75709 = abstractC21147;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m52560() {
        return this.f75700;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m52559() {
        return this.f75700 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m52556() {
        m52554();
        C15925 c15925 = this.f75704;
        return ((double) c15925.f51732) + ((double) c15925.f51731);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52553(int i) {
        if ((this.f75701 == 3 && this.f75700 == 0) || this.f75700 == i) {
            return;
        }
        this.f75700 = i;
        AbstractC21147 abstractC21147 = this.f75709;
        if (abstractC21147 != null) {
            abstractC21147.onPageScrollStateChanged(i);
        }
    }
}
