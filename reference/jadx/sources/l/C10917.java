package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۧۢܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1O9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10917 extends AbstractC6909 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C17492 f37148;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f37149;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f37150;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f37151;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f37152;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C5977 f37153;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f37154;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f37155;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC11435 f37156;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C21312 f37157;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13115 f37158;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f37159;

    public C10917(C21312 c21312) {
        this.f37157 = c21312;
        C17492 c17492 = c21312.f69345;
        this.f37148 = c17492;
        this.f37158 = (C13115) c17492.getLayoutManager();
        this.f37153 = new C5977();
        m27365();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m27365() {
        this.f37151 = 0;
        this.f37150 = 0;
        C5977 c5977 = this.f37153;
        c5977.f20341 = -1;
        c5977.f20340 = 0.0f;
        c5977.f20342 = 0;
        this.f37152 = -1;
        this.f37159 = -1;
        this.f37149 = false;
        this.f37155 = false;
        this.f37154 = false;
    }

    @Override // l.AbstractC6909
    public final void onScrollStateChanged(C17492 c17492, int i) {
        AbstractC11435 abstractC11435;
        AbstractC11435 abstractC11436;
        int i2 = this.f37151;
        if (!(i2 == 1 && this.f37150 == 1) && i == 1) {
            this.f37151 = 1;
            int i3 = this.f37159;
            if (i3 != -1) {
                this.f37152 = i3;
                this.f37159 = -1;
            } else if (this.f37152 == -1) {
                this.f37152 = this.f37158.findFirstVisibleItemPosition();
            }
            m27364(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.f37155) {
                m27364(2);
                this.f37149 = true;
                return;
            }
            return;
        }
        C5977 c5977 = this.f37153;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            m27366();
            if (!this.f37155) {
                int i4 = c5977.f20341;
                if (i4 != -1 && (abstractC11436 = this.f37156) != null) {
                    abstractC11436.onPageScrolled(i4, 0.0f, 0);
                }
            } else if (c5977.f20342 == 0) {
                int i5 = this.f37152;
                int i6 = c5977.f20341;
                if (i5 != i6 && (abstractC11435 = this.f37156) != null) {
                    abstractC11435.onPageSelected(i6);
                }
            }
            m27364(0);
            m27365();
        }
        if (this.f37151 == 2 && i == 0 && this.f37154) {
            m27366();
            if (c5977.f20342 == 0) {
                int i7 = this.f37159;
                int i8 = c5977.f20341;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    AbstractC11435 abstractC11437 = this.f37156;
                    if (abstractC11437 != null) {
                        abstractC11437.onPageSelected(i8);
                    }
                }
                m27364(0);
                m27365();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a A[PHI: r7 r8
      0x004a: PHI (r7v11 int) = (r7v3 int), (r7v15 int) binds: [B:30:0x0048, B:22:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r8v4 l.ۨۗܰ) = (r8v1 l.ۨۗܰ), (r8v6 l.ۨۗܰ) binds: [B:30:0x0048, B:22:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC6909
    public final void onScrolled(C17492 c17492, int i, int i2) {
        int i3;
        AbstractC11435 abstractC11435;
        this.f37155 = true;
        m27366();
        boolean z = this.f37149;
        C5977 c5977 = this.f37153;
        if (z) {
            this.f37149 = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == (this.f37157.f69353.getLayoutDirection() == 1)) {
                        if (c5977.f20342 != 0) {
                            i3 = c5977.f20341 + 1;
                        }
                    }
                }
                i3 = c5977.f20341;
            } else if (c5977.f20342 != 0) {
                i3 = c5977.f20341 + 1;
            } else {
                i3 = c5977.f20341;
            }
            this.f37159 = i3;
            if (this.f37152 != i3 && (abstractC11435 = this.f37156) != null) {
                abstractC11435.onPageSelected(i3);
            }
        } else if (this.f37151 == 0) {
            i3 = c5977.f20341;
            if (i3 == -1) {
                i3 = 0;
            }
            abstractC11435 = this.f37156;
            if (abstractC11435 != null) {
                abstractC11435.onPageSelected(i3);
            }
        }
        int i4 = c5977.f20341;
        if (i4 == -1) {
            i4 = 0;
        }
        float f = c5977.f20340;
        int i5 = c5977.f20342;
        AbstractC11435 abstractC11436 = this.f37156;
        if (abstractC11436 != null) {
            abstractC11436.onPageScrolled(i4, f, i5);
        }
        int i6 = c5977.f20341;
        int i7 = this.f37159;
        if ((i6 == i7 || i7 == -1) && c5977.f20342 == 0 && this.f37150 != 1) {
            m27364(0);
            m27365();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m27366() {
        View viewFindViewByPosition;
        int top;
        C13115 c13115 = this.f37158;
        int iFindFirstVisibleItemPosition = c13115.findFirstVisibleItemPosition();
        C5977 c5977 = this.f37153;
        c5977.f20341 = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1 || (viewFindViewByPosition = c13115.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
            c5977.f20341 = -1;
            c5977.f20340 = 0.0f;
            c5977.f20342 = 0;
            return;
        }
        int leftDecorationWidth = c13115.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = c13115.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = c13115.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = c13115.getBottomDecorationHeight(viewFindViewByPosition);
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
        int orientation = c13115.getOrientation();
        C17492 c17492 = this.f37148;
        if (orientation == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - c17492.getPaddingLeft();
            if (this.f37157.f69353.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - c17492.getPaddingTop();
        }
        int i = -top;
        c5977.f20342 = i;
        if (i >= 0) {
            c5977.f20340 = height != 0 ? i / height : 0.0f;
        } else {
            if (new C0332(c13115).m1993()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            Locale locale = Locale.US;
            throw new IllegalStateException(C8479.m22141(c5977.f20342, "Page can only be offset by a positive amount, not by "));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m27367() {
        this.f37154 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27369(int i, boolean z) {
        AbstractC11435 abstractC11435;
        this.f37151 = z ? 2 : 3;
        boolean z2 = this.f37159 != i;
        this.f37159 = i;
        m27364(2);
        if (!z2 || (abstractC11435 = this.f37156) == null) {
            return;
        }
        abstractC11435.onPageSelected(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27370(AbstractC11435 abstractC11435) {
        this.f37156 = abstractC11435;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m27372() {
        return this.f37150;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m27371() {
        return this.f37150 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m27368() {
        m27366();
        C5977 c5977 = this.f37153;
        return ((double) c5977.f20341) + ((double) c5977.f20340);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27364(int i) {
        if ((this.f37151 == 3 && this.f37150 == 0) || this.f37150 == i) {
            return;
        }
        this.f37150 = i;
        AbstractC11435 abstractC11435 = this.f37156;
        if (abstractC11435 != null) {
            abstractC11435.onPageScrollStateChanged(i);
        }
    }
}
