package l;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ۢᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes4.dex */
public class C10308 extends AbstractC21169 implements InterfaceC22989 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8072 f32886;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC9016 f32887;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C19259[] f32888;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24481 f32889;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f32890;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f32891;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f32892;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f32894;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C18513 f32895;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Rect f32896;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6034 f32897;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public BitSet f32898;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int[] f32899;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC9016 f32900;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f32901;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Runnable f32903;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f32904;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f32905;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f32906;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f32902 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f32893 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f32907 = Integer.MIN_VALUE;

    public C10308(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f32906 = -1;
        this.f32905 = false;
        C18513 c18513 = new C18513();
        this.f32895 = c18513;
        this.f32892 = 2;
        this.f32896 = new Rect();
        this.f32889 = new C24481(this);
        this.f32891 = true;
        this.f32903 = new RunnableC6581(this);
        C14455 c14455M48283 = AbstractC21169.m48283(context, attributeSet, i, i2);
        int i3 = c14455M48283.f45483;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i3 != this.f32890) {
            this.f32890 = i3;
            AbstractC9016 abstractC9016 = this.f32900;
            this.f32900 = this.f32887;
            this.f32887 = abstractC9016;
            requestLayout();
        }
        int i4 = c14455M48283.f45484;
        assertNotInLayoutOrScroll(null);
        if (i4 != this.f32906) {
            c18513.m43099();
            requestLayout();
            this.f32906 = i4;
            this.f32898 = new BitSet(this.f32906);
            this.f32888 = new C19259[this.f32906];
            for (int i5 = 0; i5 < this.f32906; i5++) {
                this.f32888[i5] = new C19259(this, i5);
            }
            requestLayout();
        }
        boolean z = c14455M48283.f45485;
        assertNotInLayoutOrScroll(null);
        C8072 c8072 = this.f32886;
        if (c8072 != null && c8072.f26712 != z) {
            c8072.f26712 = z;
        }
        this.f32905 = z;
        requestLayout();
        C6034 c6034 = new C6034();
        c6034.f20636 = true;
        c6034.f20634 = 0;
        c6034.f20635 = 0;
        this.f32897 = c6034;
        this.f32900 = AbstractC9016.m24071(this, this.f32890);
        this.f32887 = AbstractC9016.m24071(this, 1 - this.f32890);
    }

    @Override // l.AbstractC21169
    public final boolean isAutoMeasureEnabled() {
        return this.f32892 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26575() {
        int iM26577;
        if (getChildCount() != 0 && this.f32892 != 0 && isAttachedToWindow()) {
            if (this.f32902) {
                iM26577 = m26576();
                m26577();
            } else {
                iM26577 = m26577();
                m26576();
            }
            if (iM26577 == 0 && m26579() != null) {
                this.f32895.m43099();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC21169
    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            m26575();
        }
    }

    @Override // l.AbstractC21169
    public final void onDetachedFromWindow(C25227 c25227, C2523 c2523) {
        super.onDetachedFromWindow(c25227, c2523);
        removeCallbacks(this.f32903);
        for (int i = 0; i < this.f32906; i++) {
            this.f32888[i].m44599();
        }
        c25227.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View m26579() {
        boolean z;
        boolean z2;
        int childCount = getChildCount();
        int i = childCount - 1;
        BitSet bitSet = new BitSet(this.f32906);
        bitSet.set(0, this.f32906, true);
        byte b = (this.f32890 == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f32902) {
            childCount = -1;
        } else {
            i = 0;
        }
        int i2 = i < childCount ? 1 : -1;
        while (i != childCount) {
            View childAt = getChildAt(i);
            C4343 c4343 = (C4343) childAt.getLayoutParams();
            if (bitSet.get(c4343.f15712.f62290)) {
                C19259 c19259 = c4343.f15712;
                if (this.f32902) {
                    int i3 = c19259.f62285;
                    if (i3 == Integer.MIN_VALUE) {
                        c19259.m44595();
                        i3 = c19259.f62285;
                    }
                    if (i3 < this.f32900.mo3277()) {
                        ((C4343) ((View) j$$ExternalSyntheticOutline0.m(c19259.f62288, 1)).getLayoutParams()).getClass();
                        return childAt;
                    }
                } else {
                    int i4 = c19259.f62289;
                    ArrayList arrayList = c19259.f62288;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        C4343 c4344 = (C4343) view.getLayoutParams();
                        c19259.f62289 = c19259.f62287.f32900.mo3280(view);
                        c4344.getClass();
                        i4 = c19259.f62289;
                    }
                    if (i4 > this.f32900.mo3273()) {
                        ((C4343) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return childAt;
                    }
                }
                bitSet.clear(c4343.f15712.f62290);
            }
            i += i2;
            if (i != childCount) {
                View childAt2 = getChildAt(i);
                if (this.f32902) {
                    int iMo3268 = this.f32900.mo3268(childAt);
                    int iMo3269 = this.f32900.mo3268(childAt2);
                    if (iMo3268 >= iMo3269) {
                        if (iMo3268 == iMo3269) {
                            if (c4343.f15712.f62290 - ((C4343) childAt2.getLayoutParams()).f15712.f62290 < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return childAt;
                }
                int iMo3280 = this.f32900.mo3280(childAt);
                int iMo3281 = this.f32900.mo3280(childAt2);
                if (iMo3280 <= iMo3281) {
                    if (iMo3280 == iMo3281) {
                        if (c4343.f15712.f62290 - ((C4343) childAt2.getLayoutParams()).f15712.f62290 < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return childAt;
            }
        }
        return null;
    }

    @Override // l.AbstractC21169
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f32886 == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m26566() {
        if (this.f32890 == 1 || !isLayoutRTL()) {
            this.f32902 = this.f32905;
        } else {
            this.f32902 = !this.f32905;
        }
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // l.AbstractC21169
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iM48280;
        int iM48281;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f32890 == 1) {
            iM48281 = AbstractC21169.m48280(i2, rect.height() + paddingBottom, getMinimumHeight());
            iM48280 = AbstractC21169.m48280(i, (this.f32894 * this.f32906) + paddingRight, getMinimumWidth());
        } else {
            iM48280 = AbstractC21169.m48280(i, rect.width() + paddingRight, getMinimumWidth());
            iM48281 = AbstractC21169.m48280(i2, (this.f32894 * this.f32906) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iM48280, iM48281);
    }

    @Override // l.AbstractC21169
    public final void onLayoutChildren(C2523 c2523, C15529 c15529) {
        m26564(c2523, c15529, true);
    }

    @Override // l.AbstractC21169
    public final void onAdapterChanged(AbstractC12964 abstractC12964, AbstractC12964 abstractC12965) {
        this.f32895.m43099();
        for (int i = 0; i < this.f32906; i++) {
            this.f32888[i].m44599();
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:130:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:132:0x0206  */
    /* JADX WARN: Code duplicated, block: B:251:0x0416  */
    /* JADX WARN: Code duplicated, block: B:262:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0217 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m26564(C2523 c2523, C15529 c15529, boolean z) {
        boolean z2;
        C8072 c8072;
        int childCount;
        int i;
        int position;
        int position2;
        int childCount2;
        int i2;
        boolean z3;
        C8072 c8073 = this.f32886;
        C24481 c24481 = this.f32889;
        if (!(c8073 == null && this.f32893 == -1) && c15529.m37184() == 0) {
            removeAndRecycleAllViews(c2523);
            c24481.m54745();
            return;
        }
        boolean z4 = c24481.f79449;
        C10308 c10308 = c24481.f79448;
        boolean z5 = (z4 && this.f32893 == -1 && this.f32886 == null) ? false : true;
        C18513 c18513 = this.f32895;
        if (z5) {
            c24481.m54745();
            C8072 c8074 = this.f32886;
            if (c8074 != null) {
                int i3 = c8074.f26713;
                if (i3 > 0) {
                    if (i3 == this.f32906) {
                        for (int i4 = 0; i4 < this.f32906; i4++) {
                            this.f32888[i4].m44599();
                            C8072 c8075 = this.f32886;
                            int iMo3277 = c8075.f26710[i4];
                            if (iMo3277 != Integer.MIN_VALUE) {
                                iMo3277 += c8075.f26715 ? this.f32900.mo3277() : this.f32900.mo3273();
                            }
                            C19259 c19259 = this.f32888[i4];
                            c19259.f62289 = iMo3277;
                            c19259.f62285 = iMo3277;
                        }
                    } else {
                        c8074.f26710 = null;
                        c8074.f26713 = 0;
                        c8074.f26714 = 0;
                        c8074.f26717 = null;
                        c8074.f26716 = null;
                        c8074.f26718 = c8074.f26711;
                    }
                }
                C8072 c8076 = this.f32886;
                this.f32901 = c8076.f26709;
                boolean z6 = c8076.f26712;
                assertNotInLayoutOrScroll(null);
                C8072 c8077 = this.f32886;
                if (c8077 != null && c8077.f26712 != z6) {
                    c8077.f26712 = z6;
                }
                this.f32905 = z6;
                requestLayout();
                m26566();
                C8072 c8078 = this.f32886;
                int i5 = c8078.f26718;
                if (i5 != -1) {
                    this.f32893 = i5;
                    c24481.f79451 = c8078.f26715;
                } else {
                    c24481.f79451 = this.f32902;
                }
                if (c8078.f26714 > 1) {
                    c18513.f60204 = c8078.f26717;
                    c18513.f60205 = c8078.f26716;
                }
            } else {
                m26566();
                c24481.f79451 = this.f32902;
            }
            if (c15529.f50525 || (i2 = this.f32893) == -1) {
                if (this.f32904) {
                    int iM37184 = c15529.m37184();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        }
                        position2 = getPosition(getChildAt(childCount2));
                        if (position2 < 0 && position2 < iM37184) {
                            break;
                        } else {
                            childCount2--;
                        }
                    }
                } else {
                    int iM37185 = c15529.m37184();
                    childCount = getChildCount();
                    i = 0;
                    while (true) {
                        if (i >= childCount) {
                            position2 = 0;
                            break;
                        }
                        position = getPosition(getChildAt(i));
                        if (position < 0 && position < iM37185) {
                            position2 = position;
                            break;
                        }
                        i++;
                    }
                }
                c24481.f79452 = position2;
                c24481.f79447 = Integer.MIN_VALUE;
            } else if (i2 < 0 || i2 >= c15529.m37184()) {
                this.f32893 = -1;
                this.f32907 = Integer.MIN_VALUE;
                if (this.f32904) {
                    int iM37186 = c15529.m37184();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        } else {
                            position2 = getPosition(getChildAt(childCount2));
                            if (position2 < 0) {
                            }
                            childCount2--;
                        }
                    }
                } else {
                    int iM37187 = c15529.m37184();
                    childCount = getChildCount();
                    i = 0;
                    while (true) {
                        if (i >= childCount) {
                            position2 = 0;
                            break;
                        } else {
                            position = getPosition(getChildAt(i));
                            if (position < 0) {
                            }
                            i++;
                        }
                    }
                }
                c24481.f79452 = position2;
                c24481.f79447 = Integer.MIN_VALUE;
            } else {
                C8072 c8079 = this.f32886;
                if (c8079 == null || c8079.f26718 == -1 || c8079.f26713 < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f32893);
                    if (viewFindViewByPosition != null) {
                        c24481.f79452 = this.f32902 ? m26576() : m26577();
                        if (this.f32907 != Integer.MIN_VALUE) {
                            if (c24481.f79451) {
                                c24481.f79447 = (this.f32900.mo3277() - this.f32907) - this.f32900.mo3268(viewFindViewByPosition);
                            } else {
                                c24481.f79447 = (this.f32900.mo3273() + this.f32907) - this.f32900.mo3280(viewFindViewByPosition);
                            }
                        } else if (this.f32900.mo3278(viewFindViewByPosition) > this.f32900.mo3272()) {
                            c24481.f79447 = c24481.f79451 ? this.f32900.mo3277() : this.f32900.mo3273();
                        } else {
                            int iMo3280 = this.f32900.mo3280(viewFindViewByPosition) - this.f32900.mo3273();
                            if (iMo3280 < 0) {
                                c24481.f79447 = -iMo3280;
                            } else {
                                int iMo3278 = this.f32900.mo3277() - this.f32900.mo3268(viewFindViewByPosition);
                                if (iMo3278 < 0) {
                                    c24481.f79447 = iMo3278;
                                } else {
                                    c24481.f79447 = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f32893;
                        c24481.f79452 = i6;
                        int i7 = this.f32907;
                        if (i7 == Integer.MIN_VALUE) {
                            if (getChildCount() != 0) {
                                if ((i6 < m26577()) != this.f32902) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                            } else if (this.f32902) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c24481.f79451 = z3;
                            c24481.f79447 = z3 ? c10308.f32900.mo3277() : c10308.f32900.mo3273();
                        } else if (c24481.f79451) {
                            c24481.f79447 = c10308.f32900.mo3277() - i7;
                        } else {
                            c24481.f79447 = c10308.f32900.mo3273() + i7;
                        }
                        c24481.f79446 = true;
                    }
                } else {
                    c24481.f79447 = Integer.MIN_VALUE;
                    c24481.f79452 = this.f32893;
                }
            }
            c24481.f79449 = true;
        }
        if (this.f32886 == null && this.f32893 == -1 && (c24481.f79451 != this.f32904 || isLayoutRTL() != this.f32901)) {
            c18513.m43099();
            c24481.f79446 = true;
        }
        if (getChildCount() > 0 && ((c8072 = this.f32886) == null || c8072.f26713 < 1)) {
            if (c24481.f79446) {
                for (int i8 = 0; i8 < this.f32906; i8++) {
                    this.f32888[i8].m44599();
                    int i9 = c24481.f79447;
                    if (i9 != Integer.MIN_VALUE) {
                        C19259 c192510 = this.f32888[i8];
                        c192510.f62289 = i9;
                        c192510.f62285 = i9;
                    }
                }
            } else if (z5 || c24481.f79450 == null) {
                for (int i10 = 0; i10 < this.f32906; i10++) {
                    C19259 c192511 = this.f32888[i10];
                    boolean z7 = this.f32902;
                    int i11 = c24481.f79447;
                    C10308 c10309 = c192511.f62287;
                    int iM44593 = z7 ? c192511.m44593(Integer.MIN_VALUE) : c192511.m44597(Integer.MIN_VALUE);
                    c192511.m44599();
                    if (iM44593 != Integer.MIN_VALUE && ((!z7 || iM44593 >= c10309.f32900.mo3277()) && (z7 || iM44593 <= c10309.f32900.mo3273()))) {
                        if (i11 != Integer.MIN_VALUE) {
                            iM44593 += i11;
                        }
                        c192511.f62285 = iM44593;
                        c192511.f62289 = iM44593;
                    }
                }
                C19259[] c19259Arr = this.f32888;
                int length = c19259Arr.length;
                int[] iArr = c24481.f79450;
                if (iArr == null || iArr.length < length) {
                    c24481.f79450 = new int[c10308.f32888.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    c24481.f79450[i12] = c19259Arr[i12].m44597(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.f32906; i13++) {
                    C19259 c192512 = this.f32888[i13];
                    c192512.m44599();
                    int i14 = c24481.f79450[i13];
                    c192512.f62289 = i14;
                    c192512.f62285 = i14;
                }
            }
        }
        detachAndScrapAttachedViews(c2523);
        C6034 c6034 = this.f32897;
        c6034.f20636 = false;
        int iMo3272 = this.f32887.mo3272();
        this.f32894 = iMo3272 / this.f32906;
        View.MeasureSpec.makeMeasureSpec(iMo3272, this.f32887.mo3279());
        m26568(c24481.f79452, c15529);
        if (c24481.f79451) {
            m26572(-1);
            m26556(c2523, c6034, c15529);
            m26572(1);
            c6034.f20639 = c24481.f79452 + c6034.f20638;
            m26556(c2523, c6034, c15529);
        } else {
            m26572(1);
            m26556(c2523, c6034, c15529);
            m26572(-1);
            c6034.f20639 = c24481.f79452 + c6034.f20638;
            m26556(c2523, c6034, c15529);
        }
        if (this.f32887.mo3279() != 1073741824) {
            int childCount3 = getChildCount();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < childCount3; i15++) {
                View childAt = getChildAt(i15);
                float fMo3278 = this.f32887.mo3278(childAt);
                if (fMo3278 >= fMax) {
                    ((C4343) childAt.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo3278);
                }
            }
            int i16 = this.f32894;
            int iRound = Math.round(fMax * this.f32906);
            if (this.f32887.mo3279() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f32887.mo3272());
            }
            this.f32894 = iRound / this.f32906;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f32887.mo3279());
            if (this.f32894 != i16) {
                for (int i17 = 0; i17 < childCount3; i17++) {
                    View childAt2 = getChildAt(i17);
                    C4343 c4343 = (C4343) childAt2.getLayoutParams();
                    c4343.getClass();
                    if (isLayoutRTL() && this.f32890 == 1) {
                        int i18 = -((this.f32906 - 1) - c4343.f15712.f62290);
                        childAt2.offsetLeftAndRight((this.f32894 * i18) - (i18 * i16));
                    } else {
                        int i19 = c4343.f15712.f62290;
                        int i20 = this.f32894 * i19;
                        int i21 = i19 * i16;
                        if (this.f32890 == 1) {
                            childAt2.offsetLeftAndRight(i20 - i21);
                        } else {
                            childAt2.offsetTopAndBottom(i20 - i21);
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.f32902) {
                m26561(c2523, c15529, true);
                m26570(c2523, c15529, false);
            } else {
                m26570(c2523, c15529, true);
                m26561(c2523, c15529, false);
            }
        }
        if (z && !c15529.f50525 && this.f32892 != 0 && getChildCount() > 0 && m26579() != null) {
            removeCallbacks(this.f32903);
            z2 = m26575();
        }
        if (c15529.f50525) {
            c24481.m54745();
        }
        this.f32904 = c24481.f79451;
        this.f32901 = isLayoutRTL();
        if (z2) {
            c24481.m54745();
            m26564(c2523, c15529, false);
        }
    }

    @Override // l.AbstractC21169
    public final void onLayoutCompleted(C15529 c15529) {
        super.onLayoutCompleted(c15529);
        this.f32893 = -1;
        this.f32907 = Integer.MIN_VALUE;
        this.f32886 = null;
        this.f32889.m54745();
    }

    @Override // l.AbstractC21169
    public final boolean supportsPredictiveItemAnimations() {
        return this.f32886 == null;
    }

    @Override // l.AbstractC21169
    public final int computeHorizontalScrollOffset(C15529 c15529) {
        return m26557(c15529);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m26557(C15529 c15529) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f32891;
        return C16275.m38609(c15529, this.f32900, m26578(z), m26573(z), this, this.f32891, this.f32902);
    }

    @Override // l.AbstractC21169
    public final int computeVerticalScrollOffset(C15529 c15529) {
        return m26557(c15529);
    }

    @Override // l.AbstractC21169
    public final int computeHorizontalScrollExtent(C15529 c15529) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f32891;
        return C16275.m38608(c15529, this.f32900, m26578(z), m26573(z), this, this.f32891);
    }

    @Override // l.AbstractC21169
    public final int computeVerticalScrollExtent(C15529 c15529) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f32891;
        return C16275.m38608(c15529, this.f32900, m26578(z), m26573(z), this, this.f32891);
    }

    @Override // l.AbstractC21169
    public final int computeHorizontalScrollRange(C15529 c15529) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f32891;
        return C16275.m38610(c15529, this.f32900, m26578(z), m26573(z), this, this.f32891);
    }

    @Override // l.AbstractC21169
    public final int computeVerticalScrollRange(C15529 c15529) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f32891;
        return C16275.m38610(c15529, this.f32900, m26578(z), m26573(z), this, this.f32891);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26558(View view, int i, int i2) {
        Rect rect = this.f32896;
        calculateItemDecorationsForChild(view, rect);
        C4343 c4343 = (C4343) view.getLayoutParams();
        int iM26571 = m26571(i, ((ViewGroup.MarginLayoutParams) c4343).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c4343).rightMargin + rect.right);
        int iM26572 = m26571(i2, ((ViewGroup.MarginLayoutParams) c4343).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c4343).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iM26571, iM26572, c4343)) {
            view.measure(iM26571, iM26572);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m26571(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // l.AbstractC21169
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C8072) {
            C8072 c8072 = (C8072) parcelable;
            this.f32886 = c8072;
            if (this.f32893 != -1) {
                c8072.f26718 = -1;
                c8072.f26711 = -1;
                c8072.f26710 = null;
                c8072.f26713 = 0;
                c8072.f26714 = 0;
                c8072.f26717 = null;
                c8072.f26716 = null;
            }
            requestLayout();
        }
    }

    @Override // l.AbstractC21169
    public final Parcelable onSaveInstanceState() {
        int iM44597;
        int iMo3273;
        int[] iArr;
        C8072 c8072 = this.f32886;
        if (c8072 == null) {
            C8072 c8073 = new C8072();
            c8073.f26712 = this.f32905;
            c8073.f26715 = this.f32904;
            c8073.f26709 = this.f32901;
            C18513 c18513 = this.f32895;
            if (c18513 != null && (iArr = c18513.f60204) != null) {
                c8073.f26717 = iArr;
                c8073.f26714 = iArr.length;
                c8073.f26716 = c18513.f60205;
            } else {
                c8073.f26714 = 0;
            }
            if (getChildCount() > 0) {
                c8073.f26718 = this.f32904 ? m26576() : m26577();
                View viewM26573 = this.f32902 ? m26573(true) : m26578(true);
                c8073.f26711 = viewM26573 != null ? getPosition(viewM26573) : -1;
                int i = this.f32906;
                c8073.f26713 = i;
                c8073.f26710 = new int[i];
                for (int i2 = 0; i2 < this.f32906; i2++) {
                    if (this.f32904) {
                        iM44597 = this.f32888[i2].m44593(Integer.MIN_VALUE);
                        if (iM44597 != Integer.MIN_VALUE) {
                            iMo3273 = this.f32900.mo3277();
                            iM44597 -= iMo3273;
                        }
                    } else {
                        iM44597 = this.f32888[i2].m44597(Integer.MIN_VALUE);
                        if (iM44597 != Integer.MIN_VALUE) {
                            iMo3273 = this.f32900.mo3273();
                            iM44597 -= iMo3273;
                        }
                    }
                    c8073.f26710[i2] = iM44597;
                }
                return c8073;
            }
            c8073.f26718 = -1;
            c8073.f26711 = -1;
            c8073.f26713 = 0;
            return c8073;
        }
        C8072 c8074 = new C8072();
        c8074.f26713 = c8072.f26713;
        c8074.f26718 = c8072.f26718;
        c8074.f26711 = c8072.f26711;
        c8074.f26710 = c8072.f26710;
        c8074.f26714 = c8072.f26714;
        c8074.f26717 = c8072.f26717;
        c8074.f26712 = c8072.f26712;
        c8074.f26715 = c8072.f26715;
        c8074.f26709 = c8072.f26709;
        c8074.f26716 = c8072.f26716;
        return c8074;
    }

    @Override // l.AbstractC21169
    public final void onInitializeAccessibilityNodeInfo(C2523 c2523, C15529 c15529, C19835 c19835) {
        super.onInitializeAccessibilityNodeInfo(c2523, c15529, c19835);
        c19835.m45639("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // l.AbstractC21169
    public final void onInitializeAccessibilityNodeInfoForItem(C2523 c2523, C15529 c15529, View view, C19835 c19835) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C4343)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c19835);
            return;
        }
        C4343 c4343 = (C4343) layoutParams;
        if (this.f32890 == 0) {
            C19259 c19259 = c4343.f15712;
            c19835.m45642(C10884.m27635(c19259 == null ? -1 : c19259.f62290, 1, -1, -1, false, false));
        } else {
            C19259 c192510 = c4343.f15712;
            c19835.m45642(C10884.m27635(-1, -1, c192510 == null ? -1 : c192510.f62290, 1, false, false));
        }
    }

    @Override // l.AbstractC21169
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewM26578 = m26578(false);
            View viewM26573 = m26573(false);
            if (viewM26578 == null || viewM26573 == null) {
                return;
            }
            int position = getPosition(viewM26578);
            int position2 = getPosition(viewM26573);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // l.AbstractC21169
    public final int getRowCountForAccessibility(C2523 c2523, C15529 c15529) {
        if (this.f32890 == 0) {
            return Math.min(this.f32906, c15529.m37184());
        }
        return -1;
    }

    @Override // l.AbstractC21169
    public final int getColumnCountForAccessibility(C2523 c2523, C15529 c15529) {
        if (this.f32890 == 1) {
            return Math.min(this.f32906, c15529.m37184());
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View m26578(boolean z) {
        int iMo3273 = this.f32900.mo3273();
        int iMo3277 = this.f32900.mo3277();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iMo3280 = this.f32900.mo3280(childAt);
            if (this.f32900.mo3268(childAt) > iMo3273 && iMo3280 < iMo3277) {
                if (iMo3280 >= iMo3273 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m26573(boolean z) {
        int iMo3273 = this.f32900.mo3273();
        int iMo3277 = this.f32900.mo3277();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iMo3280 = this.f32900.mo3280(childAt);
            int iMo3268 = this.f32900.mo3268(childAt);
            if (iMo3268 > iMo3273 && iMo3280 < iMo3277) {
                if (iMo3268 <= iMo3277 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26561(C2523 c2523, C15529 c15529, boolean z) {
        int iMo3277;
        int iM26555 = m26555(Integer.MIN_VALUE);
        if (iM26555 != Integer.MIN_VALUE && (iMo3277 = this.f32900.mo3277() - iM26555) > 0) {
            int i = iMo3277 - (-scrollBy(-iMo3277, c2523, c15529));
            if (!z || i <= 0) {
                return;
            }
            this.f32900.mo3269(i);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m26570(C2523 c2523, C15529 c15529, boolean z) {
        int iMo3273;
        int iM26567 = m26567(Integer.MAX_VALUE);
        if (iM26567 != Integer.MAX_VALUE && (iMo3273 = iM26567 - this.f32900.mo3273()) > 0) {
            int iScrollBy = iMo3273 - scrollBy(iMo3273, c2523, c15529);
            if (!z || iScrollBy <= 0) {
                return;
            }
            this.f32900.mo3269(-iScrollBy);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m26568(int i, C15529 c15529) {
        int iMo3272;
        int i2;
        int iMo3273;
        int i3;
        C6034 c6034 = this.f32897;
        boolean z = false;
        c6034.f20633 = 0;
        c6034.f20639 = i;
        if (isSmoothScrolling() && (i3 = c15529.f50524) != -1) {
            if (this.f32902 == (i3 < i)) {
                iMo3272 = this.f32900.mo3272();
            } else {
                iMo3273 = this.f32900.mo3272();
                i2 = 0;
            }
            if (getClipToPadding()) {
                c6034.f20634 = this.f32900.mo3273() - iMo3273;
                c6034.f20635 = this.f32900.mo3277() + i2;
            } else {
                c6034.f20635 = this.f32900.mo3267() + i2;
                c6034.f20634 = -iMo3273;
            }
            c6034.f20632 = false;
            c6034.f20636 = true;
            if (this.f32900.mo3279() == 0 && this.f32900.mo3267() == 0) {
                z = true;
            }
            c6034.f20640 = z;
        }
        iMo3272 = 0;
        i2 = iMo3272;
        iMo3273 = 0;
        if (getClipToPadding()) {
            c6034.f20634 = this.f32900.mo3273() - iMo3273;
            c6034.f20635 = this.f32900.mo3277() + i2;
        } else {
            c6034.f20635 = this.f32900.mo3267() + i2;
            c6034.f20634 = -iMo3273;
        }
        c6034.f20632 = false;
        c6034.f20636 = true;
        if (this.f32900.mo3279() == 0) {
            z = true;
        }
        c6034.f20640 = z;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m26572(int i) {
        C6034 c6034 = this.f32897;
        c6034.f20637 = i;
        c6034.f20638 = this.f32902 != (i == -1) ? -1 : 1;
    }

    @Override // l.AbstractC21169
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f32906; i2++) {
            C19259 c19259 = this.f32888[i2];
            int i3 = c19259.f62289;
            if (i3 != Integer.MIN_VALUE) {
                c19259.f62289 = i3 + i;
            }
            int i4 = c19259.f62285;
            if (i4 != Integer.MIN_VALUE) {
                c19259.f62285 = i4 + i;
            }
        }
    }

    @Override // l.AbstractC21169
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f32906; i2++) {
            C19259 c19259 = this.f32888[i2];
            int i3 = c19259.f62289;
            if (i3 != Integer.MIN_VALUE) {
                c19259.f62289 = i3 + i;
            }
            int i4 = c19259.f62285;
            if (i4 != Integer.MIN_VALUE) {
                c19259.f62285 = i4 + i;
            }
        }
    }

    @Override // l.AbstractC21169
    public final void onItemsRemoved(C25227 c25227, int i, int i2) {
        m26563(i, i2, 2);
    }

    @Override // l.AbstractC21169
    public final void onItemsAdded(C25227 c25227, int i, int i2) {
        m26563(i, i2, 1);
    }

    @Override // l.AbstractC21169
    public final void onItemsChanged(C25227 c25227) {
        this.f32895.m43099();
        requestLayout();
    }

    @Override // l.AbstractC21169
    public final void onItemsMoved(C25227 c25227, int i, int i2, int i3) {
        m26563(i, i2, 8);
    }

    @Override // l.AbstractC21169
    public final void onItemsUpdated(C25227 c25227, int i, int i2, Object obj) {
        m26563(i, i2, 4);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0030 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0033  */
    /* JADX WARN: Code duplicated, block: B:27:0x003b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0048 A[EDGE_INSN: B:30:0x0048->B:31:0x0049 BREAK  A[LOOP:0: B:25:0x0037->B:66:?]] */
    /* JADX WARN: Code duplicated, block: B:32:0x004b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066 A[LOOP:1: B:34:0x0057->B:38:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x006a A[EDGE_INSN: B:68:0x006a->B:40:0x006a BREAK  A[LOOP:1: B:34:0x0057->B:38:0x0066], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m26563(int i, int i2, int i3) {
        int i4;
        int i5;
        C18513 c18513;
        int[] iArr;
        int iM26576;
        ArrayList arrayList;
        int i6;
        C21497 c21497;
        int size;
        int i7;
        int size2;
        int iM26577 = this.f32902 ? m26576() : m26577();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            c18513 = this.f32895;
            iArr = c18513.f60204;
            if (iArr != null && i5 < iArr.length) {
                arrayList = c18513.f60205;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size();
                        do {
                            size2--;
                            if (size2 >= 0) {
                                c21497 = null;
                                break;
                            }
                            c21497 = (C21497) c18513.f60205.get(size2);
                        } while (c21497.f68717 != i5);
                    } else {
                        c21497 = null;
                        break;
                    }
                    if (c21497 != null) {
                        c18513.f60205.remove(c21497);
                    }
                    size = c18513.f60205.size();
                    i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            i7 = -1;
                            break;
                        } else if (((C21497) c18513.f60205.get(i7)).f68717 >= i5) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (i7 != -1) {
                        C21497 c21498 = (C21497) c18513.f60205.get(i7);
                        c18513.f60205.remove(i7);
                        i6 = c21498.f68717;
                    } else {
                        i6 = -1;
                    }
                } else {
                    i6 = -1;
                }
                if (i6 == -1) {
                    int[] iArr2 = c18513.f60204;
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = c18513.f60204.length;
                } else {
                    Arrays.fill(c18513.f60204, i5, Math.min(i6 + 1, c18513.f60204.length), -1);
                }
            }
            if (i3 != 1) {
                c18513.m43101(i, i2);
            } else if (i3 != 2) {
                c18513.m43102(i, i2);
            } else if (i3 == 8) {
                c18513.m43102(i, 1);
                c18513.m43101(i2, 1);
            }
            if (i4 <= iM26577) {
                return;
            }
            if (this.f32902) {
                iM26576 = m26577();
            } else {
                iM26576 = m26576();
            }
            if (i5 <= iM26576) {
                requestLayout();
            }
        }
        i4 = i + i2;
        i5 = i;
        c18513 = this.f32895;
        iArr = c18513.f60204;
        if (iArr != null) {
            arrayList = c18513.f60205;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size();
                    do {
                        size2--;
                        if (size2 >= 0) {
                            c21497 = null;
                            break;
                        }
                        c21497 = (C21497) c18513.f60205.get(size2);
                    } while (c21497.f68717 != i5);
                } else {
                    c21497 = null;
                    break;
                }
                if (c21497 != null) {
                    c18513.f60205.remove(c21497);
                }
                size = c18513.f60205.size();
                i7 = 0;
                while (true) {
                    if (i7 < size) {
                        i7 = -1;
                        break;
                    } else {
                        if (((C21497) c18513.f60205.get(i7)).f68717 >= i5) {
                            break;
                            break;
                        }
                        i7++;
                    }
                }
                if (i7 != -1) {
                    C21497 c21499 = (C21497) c18513.f60205.get(i7);
                    c18513.f60205.remove(i7);
                    i6 = c21499.f68717;
                } else {
                    i6 = -1;
                }
            } else {
                i6 = -1;
            }
            if (i6 == -1) {
                int[] iArr3 = c18513.f60204;
                Arrays.fill(iArr3, i5, iArr3.length, -1);
                int length2 = c18513.f60204.length;
            } else {
                Arrays.fill(c18513.f60204, i5, Math.min(i6 + 1, c18513.f60204.length), -1);
            }
        }
        if (i3 != 1) {
            c18513.m43101(i, i2);
        } else if (i3 != 2) {
            c18513.m43102(i, i2);
        } else if (i3 == 8) {
            c18513.m43102(i, 1);
            c18513.m43101(i2, 1);
        }
        if (i4 <= iM26577) {
            return;
        }
        if (this.f32902) {
            iM26576 = m26577();
        } else {
            iM26576 = m26576();
        }
        if (i5 <= iM26576) {
            requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m26556(C2523 c2523, C6034 c6034, C15529 c15529) {
        int i;
        int iMo3273;
        int iM26555;
        C19259 c19259;
        ?? r1;
        int iMo3278;
        int iMo3279;
        int iMo3274;
        int iMo32710;
        int i2;
        int i3;
        C2523 c2524 = c2523;
        int i4 = 1;
        this.f32898.set(0, this.f32906, true);
        C6034 c6035 = this.f32897;
        if (c6035.f20640) {
            i = c6034.f20637 == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else if (c6034.f20637 == 1) {
            i = c6034.f20635 + c6034.f20633;
        } else {
            i = c6034.f20634 - c6034.f20633;
        }
        int i5 = c6034.f20637;
        for (int i6 = 0; i6 < this.f32906; i6++) {
            if (!this.f32888[i6].f62288.isEmpty()) {
                m26562(this.f32888[i6], i5, i);
            }
        }
        if (this.f32902) {
            iMo3273 = this.f32900.mo3277();
        } else {
            iMo3273 = this.f32900.mo3273();
        }
        boolean z = false;
        C10308 c10308 = this;
        while (true) {
            int i7 = c6034.f20639;
            int i8 = -1;
            if (i7 < 0 || i7 >= c15529.m37184() || (!c6035.f20640 && c10308.f32898.isEmpty())) {
                break;
            }
            View viewM8425 = c2524.m8425(c6034.f20639);
            c6034.f20639 += c6034.f20638;
            C4343 c4343 = (C4343) viewM8425.getLayoutParams();
            int layoutPosition = c4343.f59428.getLayoutPosition();
            C18513 c18513 = c10308.f32895;
            int[] iArr = c18513.f60204;
            int i9 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i9 != -1) {
                c19259 = c10308.f32888[i9];
            } else {
                if (c10308.m26565(c6034.f20637)) {
                    i3 = c10308.f32906 - i4;
                    i2 = -1;
                } else {
                    i8 = c10308.f32906;
                    i2 = 1;
                    i3 = 0;
                }
                C19259 c192510 = null;
                if (c6034.f20637 == i4) {
                    int iMo3275 = c10308.f32900.mo3273();
                    int i10 = Integer.MAX_VALUE;
                    while (i3 != i8) {
                        C19259 c192511 = c10308.f32888[i3];
                        int iM44593 = c192511.m44593(iMo3275);
                        if (iM44593 < i10) {
                            c192510 = c192511;
                            i10 = iM44593;
                        }
                        i3 += i2;
                    }
                } else {
                    int iMo3277 = c10308.f32900.mo3277();
                    int i11 = Integer.MIN_VALUE;
                    while (i3 != i8) {
                        C19259 c192512 = c10308.f32888[i3];
                        int iM44597 = c192512.m44597(iMo3277);
                        if (iM44597 > i11) {
                            c192510 = c192512;
                            i11 = iM44597;
                        }
                        i3 += i2;
                    }
                }
                c19259 = c192510;
                c18513.m43100(layoutPosition);
                c18513.f60204[layoutPosition] = c19259.f62290;
            }
            c4343.f15712 = c19259;
            if (c6034.f20637 == 1) {
                c10308.addView(viewM8425);
                r1 = 0;
            } else {
                r1 = 0;
                c10308.addView(viewM8425, 0);
            }
            if (c10308.f32890 == 1) {
                c10308.m26558(viewM8425, AbstractC21169.m48281(c10308.f32894, c10308.getWidthMode(), r1, ((ViewGroup.MarginLayoutParams) c4343).width, r1), AbstractC21169.m48281(c10308.getHeight(), c10308.getHeightMode(), c10308.getPaddingBottom() + c10308.getPaddingTop(), ((ViewGroup.MarginLayoutParams) c4343).height, true));
            } else {
                c10308.m26558(viewM8425, AbstractC21169.m48281(c10308.getWidth(), c10308.getWidthMode(), c10308.getPaddingRight() + c10308.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) c4343).width, true), AbstractC21169.m48281(c10308.f32894, c10308.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) c4343).height, false));
            }
            if (c6034.f20637 == 1) {
                iMo3279 = c19259.m44593(iMo3273);
                iMo3278 = c10308.f32900.mo3278(viewM8425) + iMo3279;
            } else {
                int iM44598 = c19259.m44597(iMo3273);
                iMo3278 = iM44598;
                iMo3279 = iM44598 - c10308.f32900.mo3278(viewM8425);
            }
            if (c6034.f20637 == 1) {
                C19259 c192513 = c4343.f15712;
                c192513.getClass();
                C4343 c4344 = (C4343) viewM8425.getLayoutParams();
                c4344.f15712 = c192513;
                ArrayList arrayList = c192513.f62288;
                arrayList.add(viewM8425);
                c192513.f62285 = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c192513.f62289 = Integer.MIN_VALUE;
                }
                if (c4344.f59428.isRemoved() || c4344.f59428.isUpdated()) {
                    c192513.f62286 = c192513.f62287.f32900.mo3278(viewM8425) + c192513.f62286;
                }
            } else {
                C19259 c192514 = c4343.f15712;
                c192514.getClass();
                C4343 c4345 = (C4343) viewM8425.getLayoutParams();
                c4345.f15712 = c192514;
                ArrayList arrayList2 = c192514.f62288;
                arrayList2.add(0, viewM8425);
                c192514.f62289 = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c192514.f62285 = Integer.MIN_VALUE;
                }
                if (c4345.f59428.isRemoved() || c4345.f59428.isUpdated()) {
                    c192514.f62286 = c192514.f62287.f32900.mo3278(viewM8425) + c192514.f62286;
                }
            }
            if (c10308.isLayoutRTL() && c10308.f32890 == 1) {
                iMo32710 = c10308.f32887.mo3277() - (((c10308.f32906 - 1) - c19259.f62290) * c10308.f32894);
                iMo3274 = iMo32710 - c10308.f32887.mo3278(viewM8425);
            } else {
                iMo3274 = c10308.f32887.mo3273() + (c19259.f62290 * c10308.f32894);
                iMo32710 = c10308.f32887.mo3278(viewM8425) + iMo3274;
            }
            int i12 = iMo32710;
            int i13 = iMo3274;
            if (c10308.f32890 == 1) {
                c10308.layoutDecoratedWithMargins(viewM8425, i13, iMo3279, i12, iMo3278);
                c10308 = this;
            } else {
                c10308.layoutDecoratedWithMargins(viewM8425, iMo3279, i13, iMo3278, i12);
            }
            c10308.m26562(c19259, c6035.f20637, i);
            c2524 = c2523;
            c10308.m26560(c2524, c6035);
            if (c6035.f20632 && viewM8425.hasFocusable()) {
                c10308.f32898.set(c19259.f62290, false);
            }
            z = true;
            i4 = 1;
        }
        if (!z) {
            c10308.m26560(c2524, c6035);
        }
        if (c6035.f20637 == -1) {
            iM26555 = c10308.f32900.mo3273() - c10308.m26567(c10308.f32900.mo3273());
        } else {
            iM26555 = c10308.m26555(c10308.f32900.mo3277()) - c10308.f32900.mo3277();
        }
        if (iM26555 > 0) {
            return Math.min(c6034.f20633, iM26555);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26560(C2523 c2523, C6034 c6034) {
        int iMin;
        int iMin2;
        if (!c6034.f20636 || c6034.f20640) {
            return;
        }
        if (c6034.f20633 == 0) {
            if (c6034.f20637 == -1) {
                m26559(c2523, c6034.f20635);
                return;
            } else {
                m26569(c2523, c6034.f20634);
                return;
            }
        }
        int i = 1;
        if (c6034.f20637 == -1) {
            int i2 = c6034.f20634;
            int iM44597 = this.f32888[0].m44597(i2);
            while (i < this.f32906) {
                int iM44598 = this.f32888[i].m44597(i2);
                if (iM44598 > iM44597) {
                    iM44597 = iM44598;
                }
                i++;
            }
            int i3 = i2 - iM44597;
            if (i3 < 0) {
                iMin2 = c6034.f20635;
            } else {
                iMin2 = c6034.f20635 - Math.min(i3, c6034.f20633);
            }
            m26559(c2523, iMin2);
            return;
        }
        int i4 = c6034.f20635;
        int iM44593 = this.f32888[0].m44593(i4);
        while (i < this.f32906) {
            int iM44594 = this.f32888[i].m44593(i4);
            if (iM44594 < iM44593) {
                iM44593 = iM44594;
            }
            i++;
        }
        int i5 = iM44593 - c6034.f20635;
        if (i5 < 0) {
            iMin = c6034.f20634;
        } else {
            iMin = Math.min(i5, c6034.f20633) + c6034.f20634;
        }
        m26569(c2523, iMin);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m26567(int i) {
        int iM44597 = this.f32888[0].m44597(i);
        for (int i2 = 1; i2 < this.f32906; i2++) {
            int iM44598 = this.f32888[i2].m44597(i);
            if (iM44598 < iM44597) {
                iM44597 = iM44598;
            }
        }
        return iM44597;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m26555(int i) {
        int iM44593 = this.f32888[0].m44593(i);
        for (int i2 = 1; i2 < this.f32906; i2++) {
            int iM44594 = this.f32888[i2].m44593(i);
            if (iM44594 > iM44593) {
                iM44593 = iM44594;
            }
        }
        return iM44593;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m26569(C2523 c2523, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f32900.mo3268(childAt) > i || this.f32900.mo3276(childAt) > i) {
                return;
            }
            C4343 c4343 = (C4343) childAt.getLayoutParams();
            c4343.getClass();
            if (c4343.f15712.f62288.size() == 1) {
                return;
            }
            C19259 c19259 = c4343.f15712;
            ArrayList arrayList = c19259.f62288;
            View view = (View) arrayList.remove(0);
            C4343 c4344 = (C4343) view.getLayoutParams();
            c4344.f15712 = null;
            if (arrayList.size() == 0) {
                c19259.f62285 = Integer.MIN_VALUE;
            }
            if (c4344.f59428.isRemoved() || c4344.f59428.isUpdated()) {
                c19259.f62286 -= c19259.f62287.f32900.mo3278(view);
            }
            c19259.f62289 = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c2523);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26559(C2523 c2523, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f32900.mo3280(childAt) < i || this.f32900.mo3274(childAt) < i) {
                return;
            }
            C4343 c4343 = (C4343) childAt.getLayoutParams();
            c4343.getClass();
            if (c4343.f15712.f62288.size() == 1) {
                return;
            }
            C19259 c19259 = c4343.f15712;
            ArrayList arrayList = c19259.f62288;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C4343 c4344 = (C4343) view.getLayoutParams();
            c4344.f15712 = null;
            if (c4344.f59428.isRemoved() || c4344.f59428.isUpdated()) {
                c19259.f62286 -= c19259.f62287.f32900.mo3278(view);
            }
            if (size == 1) {
                c19259.f62289 = Integer.MIN_VALUE;
            }
            c19259.f62285 = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c2523);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m26565(int i) {
        if (this.f32890 == 0) {
            return (i == -1) != this.f32902;
        }
        return ((i == -1) == this.f32902) == isLayoutRTL();
    }

    @Override // l.AbstractC21169
    public final boolean canScrollVertically() {
        return this.f32890 == 1;
    }

    @Override // l.AbstractC21169
    public final boolean canScrollHorizontally() {
        return this.f32890 == 0;
    }

    @Override // l.AbstractC21169
    public final boolean isLayoutReversed() {
        return this.f32905;
    }

    @Override // l.AbstractC21169
    public final int scrollHorizontallyBy(int i, C2523 c2523, C15529 c15529) {
        return scrollBy(i, c2523, c15529);
    }

    @Override // l.AbstractC21169
    public final int scrollVerticallyBy(int i, C2523 c2523, C15529 c15529) {
        return scrollBy(i, c2523, c15529);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // l.InterfaceC22989
    public final PointF computeScrollVectorForPosition(int i) {
        int i2 = -1;
        if (getChildCount() == 0) {
            if (this.f32902) {
                i2 = 1;
            }
        } else {
            if ((i < m26577()) == this.f32902) {
                i2 = 1;
            }
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.f32890 == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // l.AbstractC21169
    public final void smoothScrollToPosition(C25227 c25227, C15529 c15529, int i) {
        C7525 c7525 = new C7525(c25227.getContext());
        c7525.setTargetPosition(i);
        startSmoothScroll(c7525);
    }

    @Override // l.AbstractC21169
    public final void scrollToPosition(int i) {
        C8072 c8072 = this.f32886;
        if (c8072 != null && c8072.f26718 != i) {
            c8072.f26710 = null;
            c8072.f26713 = 0;
            c8072.f26718 = -1;
            c8072.f26711 = -1;
        }
        this.f32893 = i;
        this.f32907 = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // l.AbstractC21169
    public final void collectAdjacentPrefetchPositions(int i, int i2, C15529 c15529, InterfaceC4015 interfaceC4015) {
        C6034 c6034;
        int iM44593;
        int iM44597;
        if (this.f32890 != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        m26574(i, c15529);
        int[] iArr = this.f32899;
        if (iArr == null || iArr.length < this.f32906) {
            this.f32899 = new int[this.f32906];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f32906;
            c6034 = this.f32897;
            if (i3 >= i5) {
                break;
            }
            if (c6034.f20638 == -1) {
                iM44593 = c6034.f20634;
                iM44597 = this.f32888[i3].m44597(iM44593);
            } else {
                iM44593 = this.f32888[i3].m44593(c6034.f20635);
                iM44597 = c6034.f20635;
            }
            int i6 = iM44593 - iM44597;
            if (i6 >= 0) {
                this.f32899[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f32899, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c6034.f20639;
            if (i8 < 0 || i8 >= c15529.m37184()) {
                return;
            }
            ((C7304) interfaceC4015).m19987(c6034.f20639, this.f32899[i7]);
            c6034.f20639 += c6034.f20638;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26574(int i, C15529 c15529) {
        int iM26577;
        int i2;
        if (i > 0) {
            iM26577 = m26576();
            i2 = 1;
        } else {
            iM26577 = m26577();
            i2 = -1;
        }
        C6034 c6034 = this.f32897;
        c6034.f20636 = true;
        m26568(iM26577, c15529);
        m26572(i2);
        c6034.f20639 = iM26577 + c6034.f20638;
        c6034.f20633 = Math.abs(i);
    }

    public final int scrollBy(int i, C2523 c2523, C15529 c15529) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m26574(i, c15529);
        C6034 c6034 = this.f32897;
        int iM26556 = m26556(c2523, c6034, c15529);
        if (c6034.f20633 >= iM26556) {
            i = i < 0 ? -iM26556 : iM26556;
        }
        this.f32900.mo3269(-i);
        this.f32904 = this.f32902;
        c6034.f20633 = 0;
        m26560(c2523, c6034);
        return i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m26576() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m26577() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    @Override // l.AbstractC21169
    public final C18185 generateDefaultLayoutParams() {
        return this.f32890 == 0 ? new C4343(-2, -1) : new C4343(-1, -2);
    }

    @Override // l.AbstractC21169
    public final C18185 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C4343(context, attributeSet);
    }

    @Override // l.AbstractC21169
    public final C18185 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C4343((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C4343(layoutParams);
    }

    @Override // l.AbstractC21169
    public final boolean checkLayoutParams(C18185 c18185) {
        return c18185 instanceof C4343;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x005a  */
    /* JADX WARN: Code duplicated, block: B:46:0x005c  */
    @Override // l.AbstractC21169
    public final View onFocusSearchFailed(View view, int i, C2523 c2523, C15529 c15529) {
        View viewFindContainingItemView;
        int i2;
        int iM26577;
        int iM44600;
        int iM44601;
        int iM44602;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        m26566();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i == 33) {
                        if (this.f32890 == 1) {
                            i2 = -1;
                        }
                    } else if (i == 66 ? this.f32890 == 0 : !(i != 130 || this.f32890 != 1)) {
                        i2 = 1;
                    }
                    i2 = Integer.MIN_VALUE;
                } else if (this.f32890 == 0) {
                    i2 = -1;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
            } else if (this.f32890 != 1 && isLayoutRTL()) {
                i2 = -1;
            } else {
                i2 = 1;
            }
        } else if (this.f32890 != 1 && isLayoutRTL()) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        C4343 c4343 = (C4343) viewFindContainingItemView.getLayoutParams();
        c4343.getClass();
        C19259 c19259 = c4343.f15712;
        if (i2 == 1) {
            iM26577 = m26576();
        } else {
            iM26577 = m26577();
        }
        m26568(iM26577, c15529);
        m26572(i2);
        C6034 c6034 = this.f32897;
        c6034.f20639 = c6034.f20638 + iM26577;
        c6034.f20633 = (int) (this.f32900.mo3272() * 0.33333334f);
        c6034.f20632 = true;
        c6034.f20636 = false;
        m26556(c2523, c6034, c15529);
        this.f32904 = this.f32902;
        View viewM44598 = c19259.m44598(iM26577, i2);
        if (viewM44598 != null && viewM44598 != viewFindContainingItemView) {
            return viewM44598;
        }
        if (m26565(i2)) {
            for (int i3 = this.f32906 - 1; i3 >= 0; i3--) {
                View viewM44599 = this.f32888[i3].m44598(iM26577, i2);
                if (viewM44599 != null && viewM44599 != viewFindContainingItemView) {
                    return viewM44599;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f32906; i4++) {
                View viewM445910 = this.f32888[i4].m44598(iM26577, i2);
                if (viewM445910 != null && viewM445910 != viewFindContainingItemView) {
                    return viewM445910;
                }
            }
        }
        boolean z = (this.f32905 ^ true) == (i2 == -1);
        if (z) {
            iM44600 = c19259.m44596();
        } else {
            iM44600 = c19259.m44600();
        }
        View viewFindViewByPosition = findViewByPosition(iM44600);
        if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
            return viewFindViewByPosition;
        }
        if (m26565(i2)) {
            for (int i5 = this.f32906 - 1; i5 >= 0; i5--) {
                if (i5 != c19259.f62290) {
                    if (z) {
                        iM44602 = this.f32888[i5].m44596();
                    } else {
                        iM44602 = this.f32888[i5].m44600();
                    }
                    View viewFindViewByPosition2 = findViewByPosition(iM44602);
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f32906; i6++) {
                if (z) {
                    iM44601 = this.f32888[i6].m44596();
                } else {
                    iM44601 = this.f32888[i6].m44600();
                }
                View viewFindViewByPosition3 = findViewByPosition(iM44601);
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26562(C19259 c19259, int i, int i2) {
        int i3 = c19259.f62286;
        int i4 = c19259.f62290;
        if (i == -1) {
            int i5 = c19259.f62289;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) c19259.f62288.get(0);
                C4343 c4343 = (C4343) view.getLayoutParams();
                c19259.f62289 = c19259.f62287.f32900.mo3280(view);
                c4343.getClass();
                i5 = c19259.f62289;
            }
            if (i5 + i3 <= i2) {
                this.f32898.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c19259.f62285;
        if (i6 == Integer.MIN_VALUE) {
            c19259.m44595();
            i6 = c19259.f62285;
        }
        if (i6 - i3 >= i2) {
            this.f32898.set(i4, false);
        }
    }
}
