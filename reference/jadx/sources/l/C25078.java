package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1JV */
/* JADX INFO: loaded from: classes.dex */
public final class C25078 implements InterfaceC15075 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16872 f81098;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16872 f81099;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f81100;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f81101;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f81102;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f81103;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f81104;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f81105;

    public C25078(C16872 c16872, C16872 c16873) {
        this.f81099 = c16872;
        this.f81098 = c16873;
    }

    @Override // l.InterfaceC15075
    /* JADX INFO: renamed from: ۙ */
    public final void mo36336(C10445 c10445, C19551 c19551) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int measuredHeight;
        int baseline;
        int i;
        int i2;
        if (c10445 == null) {
            return;
        }
        C0751 c0751 = c10445.f33248;
        C0751 c0752 = c10445.f33212;
        if (c10445.m26870() != 8 || c10445.m26827()) {
            if (c10445.f33252 == null) {
                return;
            }
            EnumC19396 enumC19396 = c19551.f63050;
            EnumC19396 enumC19397 = c19551.f63049;
            int i3 = c19551.f63057;
            int i4 = c19551.f63053;
            int i5 = this.f81102 + this.f81105;
            int i6 = this.f81101;
            View view = (View) c10445.m26851();
            int[] iArr = C5686.f19643;
            int i7 = iArr[enumC19396.ordinal()];
            if (i7 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (i7 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f81100, i6, -2);
            } else if (i7 == 3) {
                int i8 = this.f81100;
                int i9 = c0752 != null ? c0752.f2748 : 0;
                if (c0751 != null) {
                    i9 += c0751.f2748;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i8, i6 + i9, -1);
            } else if (i7 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f81100, i6, -2);
                boolean z = c10445.f33206 == 1;
                int i10 = c19551.f63052;
                if (i10 == 1 || i10 == 2) {
                    boolean z2 = view.getMeasuredHeight() == c10445.m26823();
                    if (c19551.f63052 == 2 || !z || ((z && z2) || (view instanceof C19110) || c10445.mo20499())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c10445.m26806(), 1073741824);
                    }
                }
            }
            int i11 = iArr[enumC19397.ordinal()];
            if (i11 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (i11 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f81104, i5, -2);
            } else if (i11 == 3) {
                int i12 = this.f81104;
                int i13 = c0752 != null ? c10445.f33197.f2748 : 0;
                if (c0751 != null) {
                    i13 += c10445.f33216.f2748;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i5 + i13, -1);
            } else if (i11 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f81104, i5, -2);
                boolean z3 = c10445.f33209 == 1;
                int i14 = c19551.f63052;
                if (i14 == 1 || i14 == 2) {
                    boolean z4 = view.getMeasuredWidth() == c10445.m26806();
                    if (c19551.f63052 == 2 || !z3 || ((z3 && z4) || (view instanceof C19110) || c10445.mo20493())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c10445.m26823(), 1073741824);
                    }
                }
            }
            C1497 c1497 = (C1497) c10445.f33252;
            C16872 c16872 = this.f81099;
            if (c1497 != null && C4635.m14460(c16872.mOptimizationLevel, 256) && view.getMeasuredWidth() == c10445.m26806() && view.getMeasuredWidth() < c1497.m26806() && view.getMeasuredHeight() == c10445.m26823() && view.getMeasuredHeight() < c1497.m26823() && view.getBaseline() == c10445.m26829() && !c10445.m26801() && m55901(c10445.m26871(), iMakeMeasureSpec, c10445.m26806()) && m55901(c10445.m26845(), iMakeMeasureSpec2, c10445.m26823())) {
                c19551.f63051 = c10445.m26806();
                c19551.f63055 = c10445.m26823();
                c19551.f63058 = c10445.m26829();
                return;
            }
            EnumC19396 enumC19398 = EnumC19396.MATCH_CONSTRAINT;
            boolean z5 = enumC19396 == enumC19398;
            boolean z6 = enumC19397 == enumC19398;
            EnumC19396 enumC19399 = EnumC19396.MATCH_PARENT;
            boolean z7 = enumC19397 == enumC19399 || enumC19397 == EnumC19396.FIXED;
            boolean z8 = enumC19396 == enumC19399 || enumC19396 == EnumC19396.FIXED;
            boolean z9 = z5 && c10445.f33239 > 0.0f;
            boolean z10 = z6 && c10445.f33239 > 0.0f;
            if (view == null) {
                return;
            }
            C11651 c11651 = (C11651) view.getLayoutParams();
            int i15 = c19551.f63052;
            if (i15 != 1 && i15 != 2 && z5 && c10445.f33206 == 0 && z6 && c10445.f33209 == 0) {
                i2 = -1;
                baseline = 0;
                i = 0;
                measuredHeight = 0;
            } else {
                if ((view instanceof AbstractC7177) && (c10445 instanceof C21789)) {
                    ((AbstractC7177) view).mo19752((C21789) c10445, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                c10445.m26831(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i16 = c10445.f33215;
                int iMax = i16 > 0 ? Math.max(i16, measuredWidth) : measuredWidth;
                int i17 = c10445.f33201;
                if (i17 > 0) {
                    iMax = Math.min(i17, iMax);
                }
                int i18 = c10445.f33244;
                int iMax2 = i18 > 0 ? Math.max(i18, measuredHeight2) : measuredHeight2;
                int i19 = iMakeMeasureSpec2;
                int i20 = c10445.f33222;
                if (i20 > 0) {
                    iMax2 = Math.min(i20, iMax2);
                }
                if (!C4635.m14460(c16872.mOptimizationLevel, 1)) {
                    if (z9 && z7) {
                        iMax = (int) ((iMax2 * c10445.f33239) + 0.5f);
                    } else if (z10 && z8) {
                        iMax2 = (int) ((iMax / c10445.f33239) + 0.5f);
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
                    c10445.m26831(iMakeMeasureSpec, iMakeMeasureSpec3);
                    int measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i = measuredWidth2;
                }
                i2 = -1;
            }
            boolean z11 = baseline != i2;
            c19551.f63054 = (i == c19551.f63057 && measuredHeight == c19551.f63053) ? false : true;
            if (c11651.f37706) {
                z11 = true;
            }
            if (z11 && baseline != -1 && c10445.m26829() != baseline) {
                c19551.f63054 = true;
            }
            c19551.f63051 = i;
            c19551.f63055 = measuredHeight;
            c19551.f63056 = z11;
            c19551.f63058 = baseline;
            return;
        }
        c19551.f63051 = 0;
        c19551.f63055 = 0;
        c19551.f63058 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m55901(int i, int i2, int i3) {
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

    @Override // l.InterfaceC15075
    /* JADX INFO: renamed from: ۙ */
    public final void mo36335() {
        C16872 c16872 = this.f81098;
        int childCount = c16872.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c16872.getChildAt(i);
            if (childAt instanceof C19110) {
                ((C19110) childAt).m44232();
            }
        }
        int size = c16872.mConstraintHelpers.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC13143) c16872.mConstraintHelpers.get(i2)).getClass();
            }
        }
    }
}
