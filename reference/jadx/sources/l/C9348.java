package l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes3.dex */
public final class C9348 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21855 f30375;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f30376;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f30378;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1497 f30379 = new C1497();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1497 f30374 = new C1497();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C4194 f30377 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4194 f30373 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24642(C1497 c1497, C1497 c1498) {
        C10445 c10445;
        ArrayList<C10445> arrayList = c1497.f33652;
        HashMap map = new HashMap();
        map.put(c1497, c1498);
        c1498.f33652.clear();
        c1498.mo9735(c1497, map);
        for (C10445 c10446 : arrayList) {
            if (c10446 instanceof C24618) {
                c10445 = new C24618();
            } else if (c10446 instanceof C7463) {
                c10445 = new C7463();
            } else if (c10446 instanceof C2988) {
                c10445 = new C2988();
            } else if (c10446 instanceof C14174) {
                c10445 = new C14174();
            } else {
                c10445 = new C10445();
            }
            c1498.f33652.add(c10445);
            C10445 c10447 = c10445.f33252;
            if (c10447 != null) {
                ((C10600) c10447).f33652.remove(c10445);
                c10445.mo5339();
            }
            c10445.f33252 = c1498;
            map.put(c10446, c10445);
        }
        for (C10445 c10448 : arrayList) {
            ((C10445) map.get(c10448)).mo9735(c10448, map);
        }
    }

    public C9348(C21855 c21855) {
        this.f30375 = c21855;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24645(C4194 c4194, C4194 c4195) {
        this.f30377 = c4194;
        this.f30373 = c4195;
        this.f30379 = new C1497();
        this.f30374 = new C1497();
        C1497 c1497 = this.f30379;
        C21855 c21855 = this.f30375;
        c1497.m5335(c21855.mLayoutWidget.m5337());
        this.f30374.m5335(c21855.mLayoutWidget.m5337());
        this.f30379.f33652.clear();
        this.f30374.f33652.clear();
        m24642(c21855.mLayoutWidget, this.f30379);
        m24642(c21855.mLayoutWidget, this.f30374);
        if (c21855.f69653 > 0.5d) {
            if (c4194 != null) {
                m24643(this.f30379, c4194);
            }
            m24643(this.f30374, c4195);
        } else {
            m24643(this.f30374, c4195);
            if (c4194 != null) {
                m24643(this.f30379, c4194);
            }
        }
        this.f30379.m5349(c21855.isRtl());
        this.f30379.m5344();
        this.f30374.m5349(c21855.isRtl());
        this.f30374.m5344();
        ViewGroup.LayoutParams layoutParams = c21855.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                C1497 c1498 = this.f30379;
                EnumC19396 enumC19396 = EnumC19396.WRAP_CONTENT;
                c1498.m26820(enumC19396);
                this.f30374.m26820(enumC19396);
            }
            if (layoutParams.height == -2) {
                C1497 c1499 = this.f30379;
                EnumC19396 enumC19397 = EnumC19396.WRAP_CONTENT;
                c1499.m26862(enumC19397);
                this.f30374.m26862(enumC19397);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24643(C1497 c1497, C4194 c4194) {
        SparseArray sparseArray = new SparseArray();
        C14634 c14634 = new C14634();
        sparseArray.clear();
        sparseArray.put(0, c1497);
        C21855 c21855 = this.f30375;
        sparseArray.put(c21855.getId(), c1497);
        for (C10445 c10445 : c1497.f33652) {
            sparseArray.put(((View) c10445.m26851()).getId(), c10445);
        }
        for (C10445 c10446 : c1497.f33652) {
            View view = (View) c10446.m26851();
            c4194.m13387(view.getId(), c14634);
            c10446.m26805(c4194.m13398(view.getId()));
            c10446.m26824(c4194.m13400(view.getId()));
            if (view instanceof AbstractC13143) {
                c4194.m13391((AbstractC13143) view, c10446, c14634, sparseArray);
                if (view instanceof C10905) {
                    ((C10905) view).m32674();
                }
            }
            c14634.resolveLayoutDirection(c21855.getLayoutDirection());
            c21855.applyConstraintsFromLayoutParams(false, view, c10446, c14634, sparseArray);
            if (c4194.m13399(view.getId()) == 1) {
                c10446.m26869(view.getVisibility());
            } else {
                c10446.m26869(c4194.m13404(view.getId()));
            }
        }
        for (C10445 c10447 : c1497.f33652) {
            if (c10447 instanceof C21789) {
                AbstractC13143 abstractC13143 = (AbstractC13143) c10447.m26851();
                C14174 c14174 = (C14174) c10447;
                abstractC13143.m32671(c14174, sparseArray);
                C21789 c21789 = (C21789) c14174;
                for (int i = 0; i < c21789.f44822; i++) {
                    C10445 c10448 = c21789.f44823[i];
                    if (c10448 != null) {
                        c10448.m26867();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10445 m24641(C1497 c1497, View view) {
        if (c1497.m26851() == view) {
            return c1497;
        }
        ArrayList arrayList = c1497.f33652;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C10445 c10445 = (C10445) arrayList.get(i);
            if (c10445.m26851() == view) {
                return c10445;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24646() {
        C21855 c21855 = this.f30375;
        int i = c21855.f69666;
        int i2 = c21855.f69631;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        c21855.f69632 = mode;
        c21855.f69658 = mode2;
        int optimizationLevel = c21855.getOptimizationLevel();
        if (c21855.f69627 == c21855.m49551()) {
            c21855.resolveSystem(this.f30374, optimizationLevel, i, i2);
            if (this.f30377 != null) {
                c21855.resolveSystem(this.f30379, optimizationLevel, i, i2);
            }
        } else {
            if (this.f30377 != null) {
                c21855.resolveSystem(this.f30379, optimizationLevel, i, i2);
            }
            c21855.resolveSystem(this.f30374, optimizationLevel, i, i2);
        }
        int i3 = 0;
        if (!(c21855.getParent() instanceof C21855) || mode != 1073741824 || mode2 != 1073741824) {
            c21855.f69632 = mode;
            c21855.f69658 = mode2;
            if (c21855.f69627 == c21855.m49551()) {
                c21855.resolveSystem(this.f30374, optimizationLevel, i, i2);
                if (this.f30377 != null) {
                    c21855.resolveSystem(this.f30379, optimizationLevel, i, i2);
                }
            } else {
                if (this.f30377 != null) {
                    c21855.resolveSystem(this.f30379, optimizationLevel, i, i2);
                }
                c21855.resolveSystem(this.f30374, optimizationLevel, i, i2);
            }
            c21855.f69630 = this.f30379.m26806();
            c21855.f69651 = this.f30379.m26823();
            c21855.f69633 = this.f30374.m26806();
            int iM26823 = this.f30374.m26823();
            c21855.f69648 = iM26823;
            c21855.f69635 = (c21855.f69630 == c21855.f69633 && c21855.f69651 == iM26823) ? false : true;
        }
        int i4 = c21855.f69630;
        int i5 = c21855.f69651;
        int i6 = c21855.f69632;
        if (i6 == Integer.MIN_VALUE || i6 == 0) {
            i4 = (int) ((c21855.f69636 * (c21855.f69633 - i4)) + i4);
        }
        int i7 = i4;
        int i8 = c21855.f69658;
        c21855.resolveMeasuredDimension(i, i2, i7, (i8 == Integer.MIN_VALUE || i8 == 0) ? (int) ((c21855.f69636 * (c21855.f69648 - i5)) + i5) : i5, this.f30379.m5346() || this.f30374.m5346(), this.f30379.m5351() || this.f30374.m5351());
        HashMap map = c21855.f69646;
        int childCount = c21855.getChildCount();
        c21855.f69673.m24644();
        c21855.f69676 = true;
        int width = c21855.getWidth();
        int height = c21855.getHeight();
        C15141 c15141 = c21855.f69675.f41276;
        int i9 = c15141 != null ? c15141.f49409 : -1;
        if (i9 != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                C21283 c21283 = (C21283) map.get(c21855.getChildAt(i10));
                if (c21283 != null) {
                    c21283.m48468(i9);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            C21283 c21284 = (C21283) map.get(c21855.getChildAt(i11));
            if (c21284 != null) {
                c21855.f69675.m31956(c21284);
                c21284.m48459(width, height, System.nanoTime());
            }
        }
        C15141 c15142 = c21855.f69675.f41276;
        float f = c15142 != null ? c15142.f49394 : 0.0f;
        if (f != 0.0f) {
            boolean z = ((double) f) < 0.0d;
            float fAbs = Math.abs(f);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMin2 = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            for (int i12 = 0; i12 < childCount; i12++) {
                C21283 c21285 = (C21283) map.get(c21855.getChildAt(i12));
                if (!Float.isNaN(c21285.f67850)) {
                    for (int i13 = 0; i13 < childCount; i13++) {
                        C21283 c21286 = (C21283) map.get(c21855.getChildAt(i13));
                        if (!Float.isNaN(c21286.f67850)) {
                            fMin = Math.min(fMin, c21286.f67850);
                            fMax = Math.max(fMax, c21286.f67850);
                        }
                    }
                    while (i3 < childCount) {
                        C21283 c21287 = (C21283) map.get(c21855.getChildAt(i3));
                        if (!Float.isNaN(c21287.f67850)) {
                            c21287.f67872 = 1.0f / (1.0f - fAbs);
                            if (z) {
                                c21287.f67854 = fAbs - (((fMax - c21287.f67850) / (fMax - fMin)) * fAbs);
                            } else {
                                c21287.f67854 = fAbs - (((c21287.f67850 - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i3++;
                    }
                    return;
                }
                float fM48467 = c21285.m48467();
                float fM48466 = c21285.m48466();
                float f2 = z ? fM48466 - fM48467 : fM48466 + fM48467;
                fMin2 = Math.min(fMin2, f2);
                fMax2 = Math.max(fMax2, f2);
            }
            while (i3 < childCount) {
                C21283 c21288 = (C21283) map.get(c21855.getChildAt(i3));
                float fM48468 = c21288.m48467();
                float fM48469 = c21288.m48466();
                float f3 = z ? fM48469 - fM48468 : fM48469 + fM48468;
                c21288.f67872 = 1.0f / (1.0f - fAbs);
                c21288.f67854 = fAbs - (((f3 - fMin2) * fAbs) / (fMax2 - fMin2));
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24644() {
        C21855 c21855 = this.f30375;
        int childCount = c21855.getChildCount();
        HashMap map = c21855.f69646;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c21855.getChildAt(i);
            map.put(childAt, new C21283(childAt));
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = c21855.getChildAt(i2);
            C21283 c21283 = (C21283) map.get(childAt2);
            if (c21283 != null) {
                if (this.f30377 != null) {
                    C10445 c10445M24641 = m24641(this.f30379, childAt2);
                    if (c10445M24641 != null) {
                        c21283.m48469(c10445M24641, this.f30377);
                    } else if (c21855.f69644 != 0) {
                        C18540.m43117();
                        C18540.m43118(childAt2);
                        childAt2.getClass();
                    }
                }
                if (this.f30373 != null) {
                    C10445 c10445M24642 = m24641(this.f30374, childAt2);
                    if (c10445M24642 != null) {
                        c21283.m48464(c10445M24642, this.f30373);
                    } else if (c21855.f69644 != 0) {
                        C18540.m43117();
                        C18540.m43118(childAt2);
                        childAt2.getClass();
                    }
                }
            }
        }
    }
}
