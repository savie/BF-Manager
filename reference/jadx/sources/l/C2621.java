package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1JV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2621 implements InterfaceC9431 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f10238;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f10239;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5444 f10240;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f10241;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f10242;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5444 f10243;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f10244;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f10245;

    public C2621(C5444 c5444, C5444 c5445) {
        this.f10243 = c5444;
        this.f10240 = c5445;
    }

    @Override // l.InterfaceC9431
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8094(C20719 c20719, C1668 c1668) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int measuredHeight;
        int baseline;
        int i;
        int i2;
        if (c20719 == null) {
            return;
        }
        C8725 c8725 = c20719.f67421;
        C8725 c8726 = c20719.f67385;
        if (c20719.m46606() != 8 || c20719.m46618()) {
            if (c20719.f67433 == null) {
                return;
            }
            EnumC7313 enumC7313 = c1668.f6645;
            EnumC7313 enumC7314 = c1668.f6644;
            int i3 = c1668.f6650;
            int i4 = c1668.f6647;
            int i5 = this.f10245 + this.f10239;
            int i6 = this.f10238;
            View view = (View) c20719.m46600();
            int[] iArr = C4738.f16677;
            int i7 = iArr[enumC7313.ordinal()];
            if (i7 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (i7 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f10242, i6, -2);
            } else if (i7 == 3) {
                int i8 = this.f10242;
                int i9 = c8726 != null ? c8726.f29979 : 0;
                if (c8725 != null) {
                    i9 += c8725.f29979;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i8, i6 + i9, -1);
            } else if (i7 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f10242, i6, -2);
                boolean z = c20719.f67395 == 1;
                int i10 = c1668.f6648;
                if (i10 == 1 || i10 == 2) {
                    boolean z2 = view.getMeasuredHeight() == c20719.m46619();
                    if (c1668.f6648 == 2 || !z || ((z && z2) || (view instanceof C7561) || c20719.mo30473())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c20719.m46640(), 1073741824);
                    }
                }
            }
            int i11 = iArr[enumC7314.ordinal()];
            if (i11 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (i11 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f10244, i5, -2);
            } else if (i11 == 3) {
                int i12 = this.f10244;
                int i13 = c8726 != null ? c20719.f67392.f29979 : 0;
                if (c8725 != null) {
                    i13 += c20719.f67387.f29979;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i5 + i13, -1);
            } else if (i11 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f10244, i5, -2);
                boolean z3 = c20719.f67375 == 1;
                int i14 = c1668.f6648;
                if (i14 == 1 || i14 == 2) {
                    boolean z4 = view.getMeasuredWidth() == c20719.m46640();
                    if (c1668.f6648 == 2 || !z3 || ((z3 && z4) || (view instanceof C7561) || c20719.mo30469())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c20719.m46619(), 1073741824);
                    }
                }
            }
            C15781 c15781 = (C15781) c20719.f67433;
            C5444 c5444 = this.f10243;
            if (c15781 != null && C5902.m16170(c5444.mOptimizationLevel, 256) && view.getMeasuredWidth() == c20719.m46640() && view.getMeasuredWidth() < c15781.m46640() && view.getMeasuredHeight() == c20719.m46619() && view.getMeasuredHeight() < c15781.m46619() && view.getBaseline() == c20719.m46614() && !c20719.m46613() && m8092(c20719.m46645(), iMakeMeasureSpec, c20719.m46640()) && m8092(c20719.m46628(), iMakeMeasureSpec2, c20719.m46619())) {
                c1668.f6649 = c20719.m46640();
                c1668.f6651 = c20719.m46619();
                c1668.f6643 = c20719.m46614();
                return;
            }
            EnumC7313 enumC7315 = EnumC7313.MATCH_CONSTRAINT;
            boolean z5 = enumC7313 == enumC7315;
            boolean z6 = enumC7314 == enumC7315;
            EnumC7313 enumC7316 = EnumC7313.MATCH_PARENT;
            boolean z7 = enumC7314 == enumC7316 || enumC7314 == EnumC7313.FIXED;
            boolean z8 = enumC7313 == enumC7316 || enumC7313 == EnumC7313.FIXED;
            boolean z9 = z5 && c20719.f67422 > 0.0f;
            boolean z10 = z6 && c20719.f67422 > 0.0f;
            if (view == null) {
                return;
            }
            C11795 c11795 = (C11795) view.getLayoutParams();
            int i15 = c1668.f6648;
            if (i15 != 1 && i15 != 2 && z5 && c20719.f67395 == 0 && z6 && c20719.f67375 == 0) {
                i2 = -1;
                baseline = 0;
                i = 0;
                measuredHeight = 0;
            } else {
                if ((view instanceof AbstractC12501) && (c20719 instanceof C10842)) {
                    ((AbstractC12501) view).mo8330((C10842) c20719, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                c20719.m46616(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i16 = c20719.f67401;
                int iMax = i16 > 0 ? Math.max(i16, measuredWidth) : measuredWidth;
                int i17 = c20719.f67382;
                if (i17 > 0) {
                    iMax = Math.min(i17, iMax);
                }
                int i18 = c20719.f67407;
                int iMax2 = i18 > 0 ? Math.max(i18, measuredHeight2) : measuredHeight2;
                int i19 = iMakeMeasureSpec2;
                int i20 = c20719.f67378;
                if (i20 > 0) {
                    iMax2 = Math.min(i20, iMax2);
                }
                if (!C5902.m16170(c5444.mOptimizationLevel, 1)) {
                    if (z9 && z7) {
                        iMax = (int) ((iMax2 * c20719.f67422) + 0.5f);
                    } else if (z10 && z8) {
                        iMax2 = (int) ((iMax / c20719.f67422) + 0.5f);
                    }
                }
                if (measuredWidth == iMax && measuredHeight2 == iMax2) {
                    baseline = baseline2;
                    i = iMax;
                    measuredHeight = iMax2;
                } else {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    int iMakeMeasureSpec3 = measuredHeight2 != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i19;
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    c20719.m46616(iMakeMeasureSpec, iMakeMeasureSpec3);
                    int measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i = measuredWidth2;
                }
                i2 = -1;
            }
            boolean z11 = baseline != i2;
            c1668.f6642 = (i == c1668.f6650 && measuredHeight == c1668.f6647) ? false : true;
            if (c11795.f39632) {
                z11 = true;
            }
            if (z11 && baseline != -1 && c20719.m46614() != baseline) {
                c1668.f6642 = true;
            }
            c1668.f6649 = i;
            c1668.f6651 = measuredHeight;
            c1668.f6646 = z11;
            c1668.f6643 = baseline;
            return;
        }
        c1668.f6649 = 0;
        c1668.f6651 = 0;
        c1668.f6643 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m8092(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    @Override // l.InterfaceC9431
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8093() {
        C5444 c5444 = this.f10240;
        int childCount = c5444.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c5444.getChildAt(i);
            if (childAt instanceof C7561) {
                ((C7561) childAt).m20082();
            }
        }
        int size = c5444.mConstraintHelpers.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC3472) c5444.mConstraintHelpers.get(i2)).getClass();
            }
        }
    }
}
