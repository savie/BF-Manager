package l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes4.dex */
public final class C20056 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10884 f64193;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f64198;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f64199;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C15781 f64194 = new C15781();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C15781 f64197 = new C15781();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C18144 f64196 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18144 f64195 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45416(C15781 c15781, C15781 c15782) {
        C20719 c20719;
        ArrayList<C20719> arrayList = c15781.f76249;
        HashMap map = new HashMap();
        map.put(c15781, c15782);
        c15782.f76249.clear();
        c15782.mo1745(c15781, map);
        for (C20719 c207110 : arrayList) {
            if (c207110 instanceof C21424) {
                c20719 = new C21424();
            } else if (c207110 instanceof C12253) {
                c20719 = new C12253();
            } else if (c207110 instanceof C0257) {
                c20719 = new C0257();
            } else if (c207110 instanceof C17191) {
                c20719 = new C17191();
            } else {
                c20719 = new C20719();
            }
            c15782.f76249.add(c20719);
            C20719 c207111 = c20719.f67433;
            if (c207111 != null) {
                ((C23542) c207111).f76249.remove(c20719);
                c20719.mo37523();
            }
            c20719.f67433 = c15782;
            map.put(c207110, c20719);
        }
        for (C20719 c207112 : arrayList) {
            ((C20719) map.get(c207112)).mo1745(c207112, map);
        }
    }

    public C20056(C10884 c10884) {
        this.f64193 = c10884;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45419(C18144 c18144, C18144 c18145) {
        this.f64196 = c18144;
        this.f64195 = c18145;
        this.f64194 = new C15781();
        this.f64197 = new C15781();
        C15781 c15781 = this.f64194;
        C10884 c10884 = this.f64193;
        c15781.m37527(c10884.mLayoutWidget.m37534());
        this.f64197.m37527(c10884.mLayoutWidget.m37534());
        this.f64194.f76249.clear();
        this.f64197.f76249.clear();
        m45416(c10884.mLayoutWidget, this.f64194);
        m45416(c10884.mLayoutWidget, this.f64197);
        if (c10884.f37028 > 0.5d) {
            if (c18144 != null) {
                m45417(this.f64194, c18144);
            }
            m45417(this.f64197, c18145);
        } else {
            m45417(this.f64197, c18145);
            if (c18144 != null) {
                m45417(this.f64194, c18144);
            }
        }
        this.f64194.m37537(c10884.isRtl());
        this.f64194.m37539();
        this.f64197.m37537(c10884.isRtl());
        this.f64197.m37539();
        ViewGroup.LayoutParams layoutParams = c10884.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                C15781 c15782 = this.f64194;
                EnumC7313 enumC7313 = EnumC7313.WRAP_CONTENT;
                c15782.m46591(enumC7313);
                this.f64197.m46591(enumC7313);
            }
            if (layoutParams.height == -2) {
                C15781 c15783 = this.f64194;
                EnumC7313 enumC7314 = EnumC7313.WRAP_CONTENT;
                c15783.m46626(enumC7314);
                this.f64197.m46626(enumC7314);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45417(C15781 c15781, C18144 c18144) {
        SparseArray sparseArray = new SparseArray();
        C18850 c18850 = new C18850();
        sparseArray.clear();
        sparseArray.put(0, c15781);
        C10884 c10884 = this.f64193;
        sparseArray.put(c10884.getId(), c15781);
        for (C20719 c20719 : c15781.f76249) {
            sparseArray.put(((View) c20719.m46600()).getId(), c20719);
        }
        for (C20719 c207110 : c15781.f76249) {
            View view = (View) c207110.m46600();
            c18144.m42242(view.getId(), c18850);
            c207110.m46608(c18144.m42258(view.getId()));
            c207110.m46620(c18144.m42254(view.getId()));
            if (view instanceof AbstractC3472) {
                c18144.m42245((AbstractC3472) view, c207110, c18850, sparseArray);
                if (view instanceof C23935) {
                    ((C23935) view).m10202();
                }
            }
            c18850.resolveLayoutDirection(c10884.getLayoutDirection());
            c10884.applyConstraintsFromLayoutParams(false, view, c207110, c18850, sparseArray);
            if (c18144.m42251(view.getId()) == 1) {
                c207110.m46636(view.getVisibility());
            } else {
                c207110.m46636(c18144.m42239(view.getId()));
            }
        }
        for (C20719 c207111 : c15781.f76249) {
            if (c207111 instanceof C10842) {
                AbstractC3472 abstractC3472 = (AbstractC3472) c207111.m46600();
                C17191 c17191 = (C17191) c207111;
                abstractC3472.m10200(c17191, sparseArray);
                C10842 c10842 = (C10842) c17191;
                for (int i = 0; i < c10842.f54816; i++) {
                    C20719 c207112 = c10842.f54815[i];
                    if (c207112 != null) {
                        c207112.m46580();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20719 m45415(C15781 c15781, View view) {
        if (c15781.m46600() == view) {
            return c15781;
        }
        ArrayList arrayList = c15781.f76249;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C20719 c20719 = (C20719) arrayList.get(i);
            if (c20719.m46600() == view) {
                return c20719;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45420() {
        C10884 c10884 = this.f64193;
        int i = c10884.f37050;
        int i2 = c10884.f37010;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        c10884.f37011 = mode;
        c10884.f37008 = mode2;
        int optimizationLevel = c10884.getOptimizationLevel();
        if (c10884.f37040 == c10884.m27287()) {
            c10884.resolveSystem(this.f64197, optimizationLevel, i, i2);
            if (this.f64196 != null) {
                c10884.resolveSystem(this.f64194, optimizationLevel, i, i2);
            }
        } else {
            if (this.f64196 != null) {
                c10884.resolveSystem(this.f64194, optimizationLevel, i, i2);
            }
            c10884.resolveSystem(this.f64197, optimizationLevel, i, i2);
        }
        int i3 = 0;
        if (!(c10884.getParent() instanceof C10884) || mode != 1073741824 || mode2 != 1073741824) {
            c10884.f37011 = mode;
            c10884.f37008 = mode2;
            if (c10884.f37040 == c10884.m27287()) {
                c10884.resolveSystem(this.f64197, optimizationLevel, i, i2);
                if (this.f64196 != null) {
                    c10884.resolveSystem(this.f64194, optimizationLevel, i, i2);
                }
            } else {
                if (this.f64196 != null) {
                    c10884.resolveSystem(this.f64194, optimizationLevel, i, i2);
                }
                c10884.resolveSystem(this.f64197, optimizationLevel, i, i2);
            }
            c10884.f37026 = this.f64194.m46640();
            c10884.f37017 = this.f64194.m46619();
            c10884.f37035 = this.f64197.m46640();
            int iM46619 = this.f64197.m46619();
            c10884.f37054 = iM46619;
            c10884.f37020 = (c10884.f37026 == c10884.f37035 && c10884.f37017 == iM46619) ? false : true;
        }
        int i4 = c10884.f37026;
        int i5 = c10884.f37017;
        int i6 = c10884.f37011;
        if (i6 == Integer.MIN_VALUE || i6 == 0) {
            i4 = (int) ((c10884.f37049 * (c10884.f37035 - i4)) + i4);
        }
        int i7 = i4;
        int i8 = c10884.f37008;
        c10884.resolveMeasuredDimension(i, i2, i7, (i8 == Integer.MIN_VALUE || i8 == 0) ? (int) ((c10884.f37049 * (c10884.f37054 - i5)) + i5) : i5, this.f64194.m37540() || this.f64197.m37540(), this.f64194.m37542() || this.f64197.m37542());
        HashMap map = c10884.f37004;
        int childCount = c10884.getChildCount();
        c10884.f37046.m45418();
        c10884.f37033 = true;
        int width = c10884.getWidth();
        int height = c10884.getHeight();
        C9473 c9473 = c10884.f37048.f11764;
        int i9 = c9473 != null ? c9473.f32056 : -1;
        if (i9 != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                C8061 c8061 = (C8061) map.get(c10884.getChildAt(i10));
                if (c8061 != null) {
                    c8061.m21234(i9);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            C8061 c8062 = (C8061) map.get(c10884.getChildAt(i11));
            if (c8062 != null) {
                c10884.f37048.m9410(c8062);
                c8062.m21225(width, height, System.nanoTime());
            }
        }
        C9473 c9474 = c10884.f37048.f11764;
        float f = c9474 != null ? c9474.f32049 : 0.0f;
        if (f != 0.0f) {
            boolean z = ((double) f) < 0.0d;
            float fAbs = Math.abs(f);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMin2 = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            for (int i12 = 0; i12 < childCount; i12++) {
                C8061 c8063 = (C8061) map.get(c10884.getChildAt(i12));
                if (!Float.isNaN(c8063.f28256)) {
                    for (int i13 = 0; i13 < childCount; i13++) {
                        C8061 c8064 = (C8061) map.get(c10884.getChildAt(i13));
                        if (!Float.isNaN(c8064.f28256)) {
                            fMin = Math.min(fMin, c8064.f28256);
                            fMax = Math.max(fMax, c8064.f28256);
                        }
                    }
                    while (i3 < childCount) {
                        C8061 c8065 = (C8061) map.get(c10884.getChildAt(i3));
                        if (!Float.isNaN(c8065.f28256)) {
                            c8065.f28255 = 1.0f / (1.0f - fAbs);
                            if (z) {
                                c8065.f28258 = fAbs - (((fMax - c8065.f28256) / (fMax - fMin)) * fAbs);
                            } else {
                                c8065.f28258 = fAbs - (((c8065.f28256 - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i3++;
                    }
                    return;
                }
                float fM21233 = c8063.m21233();
                float fM21232 = c8063.m21232();
                float f2 = z ? fM21232 - fM21233 : fM21232 + fM21233;
                fMin2 = Math.min(fMin2, f2);
                fMax2 = Math.max(fMax2, f2);
            }
            while (i3 < childCount) {
                C8061 c8066 = (C8061) map.get(c10884.getChildAt(i3));
                float fM21234 = c8066.m21233();
                float fM21235 = c8066.m21232();
                float f3 = z ? fM21235 - fM21234 : fM21235 + fM21234;
                c8066.f28255 = 1.0f / (1.0f - fAbs);
                c8066.f28258 = fAbs - (((f3 - fMin2) * fAbs) / (fMax2 - fMin2));
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45418() {
        C10884 c10884 = this.f64193;
        int childCount = c10884.getChildCount();
        HashMap map = c10884.f37004;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c10884.getChildAt(i);
            map.put(childAt, new C8061(childAt));
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = c10884.getChildAt(i2);
            C8061 c8061 = (C8061) map.get(childAt2);
            if (c8061 != null) {
                if (this.f64196 != null) {
                    C20719 c20719M45415 = m45415(this.f64194, childAt2);
                    if (c20719M45415 != null) {
                        c8061.m21235(c20719M45415, this.f64196);
                    } else if (c10884.f37029 != 0) {
                        C19660.m44789();
                        C19660.m44790(childAt2);
                        childAt2.getClass();
                    }
                }
                if (this.f64195 != null) {
                    C20719 c20719M45416 = m45415(this.f64197, childAt2);
                    if (c20719M45416 != null) {
                        c8061.m21230(c20719M45416, this.f64195);
                    } else if (c10884.f37029 != 0) {
                        C19660.m44789();
                        C19660.m44790(childAt2);
                        childAt2.getClass();
                    }
                }
            }
        }
    }
}
