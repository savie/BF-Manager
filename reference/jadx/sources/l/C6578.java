package l;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ۜۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes3.dex */
public class C6578 extends AbstractC5498 implements InterfaceC7615 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C22101 f22137;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f22138;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C12929 f22139;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13635 f22140;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f22141;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f22143;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC21581 f22144;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f22145;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f22146;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f22147;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f22148;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Runnable f22149;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int[] f22150;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Rect f22151;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public BitSet f22152;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f22153;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3755[] f22155;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC21581 f22156;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13821 f22157;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f22154 = false;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f22142 = -1;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f22158 = Integer.MIN_VALUE;

    public C6578(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f22143 = -1;
        this.f22153 = false;
        C22101 c22101 = new C22101();
        this.f22137 = c22101;
        this.f22147 = 2;
        this.f22151 = new Rect();
        this.f22140 = new C13635(this);
        this.f22146 = true;
        this.f22149 = new RunnableC4461(this);
        C2675 c2675M15190 = AbstractC5498.m15190(context, attributeSet, i, i2);
        int i3 = c2675M15190.f10343;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i3 != this.f22148) {
            this.f22148 = i3;
            AbstractC21581 abstractC21581 = this.f22156;
            this.f22156 = this.f22144;
            this.f22144 = abstractC21581;
            requestLayout();
        }
        int i4 = c2675M15190.f10344;
        assertNotInLayoutOrScroll(null);
        if (i4 != this.f22143) {
            c22101.m49038();
            requestLayout();
            this.f22143 = i4;
            this.f22152 = new BitSet(this.f22143);
            this.f22155 = new C3755[this.f22143];
            for (int i5 = 0; i5 < this.f22143; i5++) {
                this.f22155[i5] = new C3755(this, i5);
            }
            requestLayout();
        }
        boolean z = c2675M15190.f10345;
        assertNotInLayoutOrScroll(null);
        C12929 c12929 = this.f22139;
        if (c12929 != null && c12929.f42965 != z) {
            c12929.f42965 = z;
        }
        this.f22153 = z;
        requestLayout();
        C13821 c13821 = new C13821();
        c13821.f45623 = true;
        c13821.f45629 = 0;
        c13821.f45628 = 0;
        this.f22157 = c13821;
        this.f22156 = AbstractC21581.m48293(this, this.f22148);
        this.f22144 = AbstractC21581.m48293(this, 1 - this.f22148);
    }

    @Override // l.AbstractC5498
    public final boolean isAutoMeasureEnabled() {
        return this.f22147 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17836() {
        int iM17838;
        if (getChildCount() != 0 && this.f22147 != 0 && isAttachedToWindow()) {
            if (this.f22154) {
                iM17838 = m17837();
                m17838();
            } else {
                iM17838 = m17838();
                m17837();
            }
            if (iM17838 == 0 && m17833() != null) {
                this.f22137.m49038();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC5498
    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            m17836();
        }
    }

    @Override // l.AbstractC5498
    public final void onDetachedFromWindow(C17492 c17492, C21726 c21726) {
        super.onDetachedFromWindow(c17492, c21726);
        removeCallbacks(this.f22149);
        for (int i = 0; i < this.f22143; i++) {
            this.f22155[i].m10985();
        }
        c17492.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final View m17833() {
        boolean z;
        boolean z2;
        int childCount = getChildCount();
        int i = childCount - 1;
        BitSet bitSet = new BitSet(this.f22143);
        bitSet.set(0, this.f22143, true);
        byte b = (this.f22148 == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f22154) {
            childCount = -1;
        } else {
            i = 0;
        }
        int i2 = i < childCount ? 1 : -1;
        while (i != childCount) {
            View childAt = getChildAt(i);
            C11518 c11518 = (C11518) childAt.getLayoutParams();
            if (bitSet.get(c11518.f38735.f13602)) {
                C3755 c3755 = c11518.f38735;
                if (this.f22154) {
                    int i3 = c3755.f13603;
                    if (i3 == Integer.MIN_VALUE) {
                        c3755.m10981();
                        i3 = c3755.f13603;
                    }
                    if (i3 < this.f22156.mo36481()) {
                        ((C11518) ((View) C19084.m43861(c3755.f13604, 1)).getLayoutParams()).getClass();
                        return childAt;
                    }
                } else {
                    int i4 = c3755.f13606;
                    ArrayList arrayList = c3755.f13604;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        C11518 c11519 = (C11518) view.getLayoutParams();
                        c3755.f13606 = c3755.f13607.f22156.mo36473(view);
                        c11519.getClass();
                        i4 = c3755.f13606;
                    }
                    if (i4 > this.f22156.mo36483()) {
                        ((C11518) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return childAt;
                    }
                }
                bitSet.clear(c11518.f38735.f13602);
            }
            i += i2;
            if (i != childCount) {
                View childAt2 = getChildAt(i);
                if (this.f22154) {
                    int iMo36475 = this.f22156.mo36475(childAt);
                    int iMo36476 = this.f22156.mo36475(childAt2);
                    if (iMo36475 >= iMo36476) {
                        if (iMo36475 == iMo36476) {
                            if (c11518.f38735.f13602 - ((C11518) childAt2.getLayoutParams()).f38735.f13602 < 0) {
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
                int iMo36473 = this.f22156.mo36473(childAt);
                int iMo36474 = this.f22156.mo36473(childAt2);
                if (iMo36473 <= iMo36474) {
                    if (iMo36473 == iMo36474) {
                        if (c11518.f38735.f13602 - ((C11518) childAt2.getLayoutParams()).f38735.f13602 < 0) {
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

    @Override // l.AbstractC5498
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f22139 == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m17825() {
        if (this.f22148 == 1 || !isLayoutRTL()) {
            this.f22154 = this.f22153;
        } else {
            this.f22154 = !this.f22153;
        }
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // l.AbstractC5498
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iM15187;
        int iM15188;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f22148 == 1) {
            iM15188 = AbstractC5498.m15187(i2, rect.height() + paddingBottom, getMinimumHeight());
            iM15187 = AbstractC5498.m15187(i, (this.f22145 * this.f22143) + paddingRight, getMinimumWidth());
        } else {
            iM15187 = AbstractC5498.m15187(i, rect.width() + paddingRight, getMinimumWidth());
            iM15188 = AbstractC5498.m15187(i2, (this.f22145 * this.f22143) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iM15187, iM15188);
    }

    @Override // l.AbstractC5498
    public final void onLayoutChildren(C21726 c21726, C16082 c16082) {
        m17827(c21726, c16082, true);
    }

    @Override // l.AbstractC5498
    public final void onAdapterChanged(AbstractC0414 abstractC0414, AbstractC0414 abstractC0415) {
        this.f22137.m49038();
        for (int i = 0; i < this.f22143; i++) {
            this.f22155[i].m10985();
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
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m17827(C21726 c21726, C16082 c16082, boolean z) {
        boolean z2;
        C12929 c12929;
        int childCount;
        int i;
        int position;
        int position2;
        int childCount2;
        int i2;
        boolean z3;
        C12929 c129210 = this.f22139;
        C13635 c13635 = this.f22140;
        if (!(c129210 == null && this.f22142 == -1) && c16082.m38108() == 0) {
            removeAndRecycleAllViews(c21726);
            c13635.m33338();
            return;
        }
        boolean z4 = c13635.f44988;
        C6578 c6578 = c13635.f44982;
        boolean z5 = (z4 && this.f22142 == -1 && this.f22139 == null) ? false : true;
        C22101 c22101 = this.f22137;
        if (z5) {
            c13635.m33338();
            C12929 c129211 = this.f22139;
            if (c129211 != null) {
                int i3 = c129211.f42971;
                if (i3 > 0) {
                    if (i3 == this.f22143) {
                        for (int i4 = 0; i4 < this.f22143; i4++) {
                            this.f22155[i4].m10985();
                            C12929 c129212 = this.f22139;
                            int iMo36481 = c129212.f42964[i4];
                            if (iMo36481 != Integer.MIN_VALUE) {
                                iMo36481 += c129212.f42967 ? this.f22156.mo36481() : this.f22156.mo36483();
                            }
                            C3755 c3755 = this.f22155[i4];
                            c3755.f13606 = iMo36481;
                            c3755.f13603 = iMo36481;
                        }
                    } else {
                        c129211.f42964 = null;
                        c129211.f42971 = 0;
                        c129211.f42963 = 0;
                        c129211.f42969 = null;
                        c129211.f42962 = null;
                        c129211.f42970 = c129211.f42966;
                    }
                }
                C12929 c129213 = this.f22139;
                this.f22141 = c129213.f42968;
                boolean z6 = c129213.f42965;
                assertNotInLayoutOrScroll(null);
                C12929 c129214 = this.f22139;
                if (c129214 != null && c129214.f42965 != z6) {
                    c129214.f42965 = z6;
                }
                this.f22153 = z6;
                requestLayout();
                m17825();
                C12929 c129215 = this.f22139;
                int i5 = c129215.f42970;
                if (i5 != -1) {
                    this.f22142 = i5;
                    c13635.f44987 = c129215.f42967;
                } else {
                    c13635.f44987 = this.f22154;
                }
                if (c129215.f42963 > 1) {
                    c22101.f71574 = c129215.f42969;
                    c22101.f71575 = c129215.f42962;
                }
            } else {
                m17825();
                c13635.f44987 = this.f22154;
            }
            if (c16082.f52015 || (i2 = this.f22142) == -1) {
                if (this.f22138) {
                    int iM38108 = c16082.m38108();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        }
                        position2 = getPosition(getChildAt(childCount2));
                        if (position2 < 0 && position2 < iM38108) {
                            break;
                        } else {
                            childCount2--;
                        }
                    }
                } else {
                    int iM38109 = c16082.m38108();
                    childCount = getChildCount();
                    i = 0;
                    while (true) {
                        if (i >= childCount) {
                            position2 = 0;
                            break;
                        }
                        position = getPosition(getChildAt(i));
                        if (position < 0 && position < iM38109) {
                            position2 = position;
                            break;
                        }
                        i++;
                    }
                }
                c13635.f44983 = position2;
                c13635.f44986 = Integer.MIN_VALUE;
            } else if (i2 < 0 || i2 >= c16082.m38108()) {
                this.f22142 = -1;
                this.f22158 = Integer.MIN_VALUE;
                if (this.f22138) {
                    int iM381010 = c16082.m38108();
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
                    int iM381011 = c16082.m38108();
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
                c13635.f44983 = position2;
                c13635.f44986 = Integer.MIN_VALUE;
            } else {
                C12929 c129216 = this.f22139;
                if (c129216 == null || c129216.f42970 == -1 || c129216.f42971 < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f22142);
                    if (viewFindViewByPosition != null) {
                        c13635.f44983 = this.f22154 ? m17837() : m17838();
                        if (this.f22158 != Integer.MIN_VALUE) {
                            if (c13635.f44987) {
                                c13635.f44986 = (this.f22156.mo36481() - this.f22158) - this.f22156.mo36475(viewFindViewByPosition);
                            } else {
                                c13635.f44986 = (this.f22156.mo36483() + this.f22158) - this.f22156.mo36473(viewFindViewByPosition);
                            }
                        } else if (this.f22156.mo36482(viewFindViewByPosition) > this.f22156.mo36471()) {
                            c13635.f44986 = c13635.f44987 ? this.f22156.mo36481() : this.f22156.mo36483();
                        } else {
                            int iMo36473 = this.f22156.mo36473(viewFindViewByPosition) - this.f22156.mo36483();
                            if (iMo36473 < 0) {
                                c13635.f44986 = -iMo36473;
                            } else {
                                int iMo36482 = this.f22156.mo36481() - this.f22156.mo36475(viewFindViewByPosition);
                                if (iMo36482 < 0) {
                                    c13635.f44986 = iMo36482;
                                } else {
                                    c13635.f44986 = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f22142;
                        c13635.f44983 = i6;
                        int i7 = this.f22158;
                        if (i7 == Integer.MIN_VALUE) {
                            if (getChildCount() != 0) {
                                if ((i6 < m17838()) != this.f22154) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                            } else if (this.f22154) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c13635.f44987 = z3;
                            c13635.f44986 = z3 ? c6578.f22156.mo36481() : c6578.f22156.mo36483();
                        } else if (c13635.f44987) {
                            c13635.f44986 = c6578.f22156.mo36481() - i7;
                        } else {
                            c13635.f44986 = c6578.f22156.mo36483() + i7;
                        }
                        c13635.f44984 = true;
                    }
                } else {
                    c13635.f44986 = Integer.MIN_VALUE;
                    c13635.f44983 = this.f22142;
                }
            }
            c13635.f44988 = true;
        }
        if (this.f22139 == null && this.f22142 == -1 && (c13635.f44987 != this.f22138 || isLayoutRTL() != this.f22141)) {
            c22101.m49038();
            c13635.f44984 = true;
        }
        if (getChildCount() > 0 && ((c12929 = this.f22139) == null || c12929.f42971 < 1)) {
            if (c13635.f44984) {
                for (int i8 = 0; i8 < this.f22143; i8++) {
                    this.f22155[i8].m10985();
                    int i9 = c13635.f44986;
                    if (i9 != Integer.MIN_VALUE) {
                        C3755 c3756 = this.f22155[i8];
                        c3756.f13606 = i9;
                        c3756.f13603 = i9;
                    }
                }
            } else if (z5 || c13635.f44985 == null) {
                for (int i10 = 0; i10 < this.f22143; i10++) {
                    C3755 c3757 = this.f22155[i10];
                    boolean z7 = this.f22154;
                    int i11 = c13635.f44986;
                    C6578 c6579 = c3757.f13607;
                    int iM10979 = z7 ? c3757.m10979(Integer.MIN_VALUE) : c3757.m10983(Integer.MIN_VALUE);
                    c3757.m10985();
                    if (iM10979 != Integer.MIN_VALUE && ((!z7 || iM10979 >= c6579.f22156.mo36481()) && (z7 || iM10979 <= c6579.f22156.mo36483()))) {
                        if (i11 != Integer.MIN_VALUE) {
                            iM10979 += i11;
                        }
                        c3757.f13603 = iM10979;
                        c3757.f13606 = iM10979;
                    }
                }
                C3755[] c3755Arr = this.f22155;
                int length = c3755Arr.length;
                int[] iArr = c13635.f44985;
                if (iArr == null || iArr.length < length) {
                    c13635.f44985 = new int[c6578.f22155.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    c13635.f44985[i12] = c3755Arr[i12].m10983(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.f22143; i13++) {
                    C3755 c3758 = this.f22155[i13];
                    c3758.m10985();
                    int i14 = c13635.f44985[i13];
                    c3758.f13606 = i14;
                    c3758.f13603 = i14;
                }
            }
        }
        detachAndScrapAttachedViews(c21726);
        C13821 c13821 = this.f22157;
        c13821.f45623 = false;
        int iMo36471 = this.f22144.mo36471();
        this.f22145 = iMo36471 / this.f22143;
        View.MeasureSpec.makeMeasureSpec(iMo36471, this.f22144.mo36472());
        m17830(c13635.f44983, c16082);
        if (c13635.f44987) {
            m17816(-1);
            m17819(c21726, c13821, c16082);
            m17816(1);
            c13821.f45630 = c13635.f44983 + c13821.f45627;
            m17819(c21726, c13821, c16082);
        } else {
            m17816(1);
            m17819(c21726, c13821, c16082);
            m17816(-1);
            c13821.f45630 = c13635.f44983 + c13821.f45627;
            m17819(c21726, c13821, c16082);
        }
        if (this.f22144.mo36472() != 1073741824) {
            int childCount3 = getChildCount();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < childCount3; i15++) {
                View childAt = getChildAt(i15);
                float fMo36482 = this.f22144.mo36482(childAt);
                if (fMo36482 >= fMax) {
                    ((C11518) childAt.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo36482);
                }
            }
            int i16 = this.f22145;
            int iRound = Math.round(fMax * this.f22143);
            if (this.f22144.mo36472() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f22144.mo36471());
            }
            this.f22145 = iRound / this.f22143;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f22144.mo36472());
            if (this.f22145 != i16) {
                for (int i17 = 0; i17 < childCount3; i17++) {
                    View childAt2 = getChildAt(i17);
                    C11518 c11518 = (C11518) childAt2.getLayoutParams();
                    c11518.getClass();
                    if (isLayoutRTL() && this.f22148 == 1) {
                        int i18 = -((this.f22143 - 1) - c11518.f38735.f13602);
                        childAt2.offsetLeftAndRight((this.f22145 * i18) - (i18 * i16));
                    } else {
                        int i19 = c11518.f38735.f13602;
                        int i20 = this.f22145 * i19;
                        int i21 = i19 * i16;
                        if (this.f22148 == 1) {
                            childAt2.offsetLeftAndRight(i20 - i21);
                        } else {
                            childAt2.offsetTopAndBottom(i20 - i21);
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.f22154) {
                m17824(c21726, c16082, true);
                m17832(c21726, c16082, false);
            } else {
                m17832(c21726, c16082, true);
                m17824(c21726, c16082, false);
            }
        }
        if (z && !c16082.f52015 && this.f22147 != 0 && getChildCount() > 0 && m17833() != null) {
            removeCallbacks(this.f22149);
            z2 = m17836();
        }
        if (c16082.f52015) {
            c13635.m33338();
        }
        this.f22138 = c13635.f44987;
        this.f22141 = isLayoutRTL();
        if (z2) {
            c13635.m33338();
            m17827(c21726, c16082, false);
        }
    }

    @Override // l.AbstractC5498
    public final void onLayoutCompleted(C16082 c16082) {
        super.onLayoutCompleted(c16082);
        this.f22142 = -1;
        this.f22158 = Integer.MIN_VALUE;
        this.f22139 = null;
        this.f22140.m33338();
    }

    @Override // l.AbstractC5498
    public final boolean supportsPredictiveItemAnimations() {
        return this.f22139 == null;
    }

    @Override // l.AbstractC5498
    public final int computeHorizontalScrollOffset(C16082 c16082) {
        return m17818(c16082);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m17818(C16082 c16082) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f22146;
        return C23843.m52563(c16082, this.f22156, m17839(z), m17834(z), this, this.f22146, this.f22154);
    }

    @Override // l.AbstractC5498
    public final int computeVerticalScrollOffset(C16082 c16082) {
        return m17818(c16082);
    }

    @Override // l.AbstractC5498
    public final int computeHorizontalScrollExtent(C16082 c16082) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f22146;
        return C23843.m52562(c16082, this.f22156, m17839(z), m17834(z), this, this.f22146);
    }

    @Override // l.AbstractC5498
    public final int computeVerticalScrollExtent(C16082 c16082) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f22146;
        return C23843.m52562(c16082, this.f22156, m17839(z), m17834(z), this, this.f22146);
    }

    @Override // l.AbstractC5498
    public final int computeHorizontalScrollRange(C16082 c16082) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f22146;
        return C23843.m52564(c16082, this.f22156, m17839(z), m17834(z), this, this.f22146);
    }

    @Override // l.AbstractC5498
    public final int computeVerticalScrollRange(C16082 c16082) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f22146;
        return C23843.m52564(c16082, this.f22156, m17839(z), m17834(z), this, this.f22146);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17820(View view, int i, int i2) {
        Rect rect = this.f22151;
        calculateItemDecorationsForChild(view, rect);
        C11518 c11518 = (C11518) view.getLayoutParams();
        int iM17815 = m17815(i, ((ViewGroup.MarginLayoutParams) c11518).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c11518).rightMargin + rect.right);
        int iM17816 = m17815(i2, ((ViewGroup.MarginLayoutParams) c11518).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c11518).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iM17815, iM17816, c11518)) {
            view.measure(iM17815, iM17816);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m17815(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // l.AbstractC5498
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C12929) {
            C12929 c12929 = (C12929) parcelable;
            this.f22139 = c12929;
            if (this.f22142 != -1) {
                c12929.f42970 = -1;
                c12929.f42966 = -1;
                c12929.f42964 = null;
                c12929.f42971 = 0;
                c12929.f42963 = 0;
                c12929.f42969 = null;
                c12929.f42962 = null;
            }
            requestLayout();
        }
    }

    @Override // l.AbstractC5498
    public final Parcelable onSaveInstanceState() {
        int iM10983;
        int iMo36483;
        int[] iArr;
        C12929 c12929 = this.f22139;
        if (c12929 == null) {
            C12929 c129210 = new C12929();
            c129210.f42965 = this.f22153;
            c129210.f42967 = this.f22138;
            c129210.f42968 = this.f22141;
            C22101 c22101 = this.f22137;
            if (c22101 != null && (iArr = c22101.f71574) != null) {
                c129210.f42969 = iArr;
                c129210.f42963 = iArr.length;
                c129210.f42962 = c22101.f71575;
            } else {
                c129210.f42963 = 0;
            }
            if (getChildCount() > 0) {
                c129210.f42970 = this.f22138 ? m17837() : m17838();
                View viewM17834 = this.f22154 ? m17834(true) : m17839(true);
                c129210.f42966 = viewM17834 != null ? getPosition(viewM17834) : -1;
                int i = this.f22143;
                c129210.f42971 = i;
                c129210.f42964 = new int[i];
                for (int i2 = 0; i2 < this.f22143; i2++) {
                    if (this.f22138) {
                        iM10983 = this.f22155[i2].m10979(Integer.MIN_VALUE);
                        if (iM10983 != Integer.MIN_VALUE) {
                            iMo36483 = this.f22156.mo36481();
                            iM10983 -= iMo36483;
                        }
                    } else {
                        iM10983 = this.f22155[i2].m10983(Integer.MIN_VALUE);
                        if (iM10983 != Integer.MIN_VALUE) {
                            iMo36483 = this.f22156.mo36483();
                            iM10983 -= iMo36483;
                        }
                    }
                    c129210.f42964[i2] = iM10983;
                }
                return c129210;
            }
            c129210.f42970 = -1;
            c129210.f42966 = -1;
            c129210.f42971 = 0;
            return c129210;
        }
        C12929 c129211 = new C12929();
        c129211.f42971 = c12929.f42971;
        c129211.f42970 = c12929.f42970;
        c129211.f42966 = c12929.f42966;
        c129211.f42964 = c12929.f42964;
        c129211.f42963 = c12929.f42963;
        c129211.f42969 = c12929.f42969;
        c129211.f42965 = c12929.f42965;
        c129211.f42967 = c12929.f42967;
        c129211.f42968 = c12929.f42968;
        c129211.f42962 = c12929.f42962;
        return c129211;
    }

    @Override // l.AbstractC5498
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewM17839 = m17839(false);
            View viewM17834 = m17834(false);
            if (viewM17839 == null || viewM17834 == null) {
                return;
            }
            int position = getPosition(viewM17839);
            int position2 = getPosition(viewM17834);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View m17839(boolean z) {
        int iMo36483 = this.f22156.mo36483();
        int iMo36481 = this.f22156.mo36481();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iMo36473 = this.f22156.mo36473(childAt);
            if (this.f22156.mo36475(childAt) > iMo36483 && iMo36473 < iMo36481) {
                if (iMo36473 >= iMo36483 || !z) {
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
    public final View m17834(boolean z) {
        int iMo36483 = this.f22156.mo36483();
        int iMo36481 = this.f22156.mo36481();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iMo36473 = this.f22156.mo36473(childAt);
            int iMo36475 = this.f22156.mo36475(childAt);
            if (iMo36475 > iMo36483 && iMo36473 < iMo36481) {
                if (iMo36475 <= iMo36481 || !z) {
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
    private void m17824(C21726 c21726, C16082 c16082, boolean z) {
        int iMo36481;
        int iM17817 = m17817(Integer.MIN_VALUE);
        if (iM17817 != Integer.MIN_VALUE && (iMo36481 = this.f22156.mo36481() - iM17817) > 0) {
            int i = iMo36481 - (-scrollBy(-iMo36481, c21726, c16082));
            if (!z || i <= 0) {
                return;
            }
            this.f22156.mo36476(i);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m17832(C21726 c21726, C16082 c16082, boolean z) {
        int iMo36483;
        int iM17829 = m17829(Integer.MAX_VALUE);
        if (iM17829 != Integer.MAX_VALUE && (iMo36483 = iM17829 - this.f22156.mo36483()) > 0) {
            int iScrollBy = iMo36483 - scrollBy(iMo36483, c21726, c16082);
            if (!z || iScrollBy <= 0) {
                return;
            }
            this.f22156.mo36476(-iScrollBy);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m17830(int i, C16082 c16082) {
        int iMo36471;
        int i2;
        int iMo36472;
        int i3;
        C13821 c13821 = this.f22157;
        boolean z = false;
        c13821.f45626 = 0;
        c13821.f45630 = i;
        if (isSmoothScrolling() && (i3 = c16082.f52022) != -1) {
            if (this.f22154 == (i3 < i)) {
                iMo36471 = this.f22156.mo36471();
            } else {
                iMo36472 = this.f22156.mo36471();
                i2 = 0;
            }
            if (getClipToPadding()) {
                c13821.f45629 = this.f22156.mo36483() - iMo36472;
                c13821.f45628 = this.f22156.mo36481() + i2;
            } else {
                c13821.f45628 = this.f22156.mo36474() + i2;
                c13821.f45629 = -iMo36472;
            }
            c13821.f45625 = false;
            c13821.f45623 = true;
            if (this.f22156.mo36472() == 0 && this.f22156.mo36474() == 0) {
                z = true;
            }
            c13821.f45624 = z;
        }
        iMo36471 = 0;
        i2 = iMo36471;
        iMo36472 = 0;
        if (getClipToPadding()) {
            c13821.f45629 = this.f22156.mo36483() - iMo36472;
            c13821.f45628 = this.f22156.mo36481() + i2;
        } else {
            c13821.f45628 = this.f22156.mo36474() + i2;
            c13821.f45629 = -iMo36472;
        }
        c13821.f45625 = false;
        c13821.f45623 = true;
        if (this.f22156.mo36472() == 0) {
            z = true;
        }
        c13821.f45624 = z;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m17816(int i) {
        C13821 c13821 = this.f22157;
        c13821.f45631 = i;
        c13821.f45627 = this.f22154 != (i == -1) ? -1 : 1;
    }

    @Override // l.AbstractC5498
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f22143; i2++) {
            C3755 c3755 = this.f22155[i2];
            int i3 = c3755.f13606;
            if (i3 != Integer.MIN_VALUE) {
                c3755.f13606 = i3 + i;
            }
            int i4 = c3755.f13603;
            if (i4 != Integer.MIN_VALUE) {
                c3755.f13603 = i4 + i;
            }
        }
    }

    @Override // l.AbstractC5498
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f22143; i2++) {
            C3755 c3755 = this.f22155[i2];
            int i3 = c3755.f13606;
            if (i3 != Integer.MIN_VALUE) {
                c3755.f13606 = i3 + i;
            }
            int i4 = c3755.f13603;
            if (i4 != Integer.MIN_VALUE) {
                c3755.f13603 = i4 + i;
            }
        }
    }

    @Override // l.AbstractC5498
    public final void onItemsRemoved(C17492 c17492, int i, int i2) {
        m17826(i, i2, 2);
    }

    @Override // l.AbstractC5498
    public final void onItemsAdded(C17492 c17492, int i, int i2) {
        m17826(i, i2, 1);
    }

    @Override // l.AbstractC5498
    public final void onItemsChanged(C17492 c17492) {
        this.f22137.m49038();
        requestLayout();
    }

    @Override // l.AbstractC5498
    public final void onItemsMoved(C17492 c17492, int i, int i2, int i3) {
        m17826(i, i2, 8);
    }

    @Override // l.AbstractC5498
    public final void onItemsUpdated(C17492 c17492, int i, int i2, Object obj) {
        m17826(i, i2, 4);
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
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m17826(int i, int i2, int i3) {
        int i4;
        int i5;
        C22101 c22101;
        int[] iArr;
        int iM17837;
        ArrayList arrayList;
        int i6;
        C5167 c5167;
        int size;
        int i7;
        int size2;
        int iM17838 = this.f22154 ? m17837() : m17838();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            c22101 = this.f22137;
            iArr = c22101.f71574;
            if (iArr != null && i5 < iArr.length) {
                arrayList = c22101.f71575;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size();
                        do {
                            size2--;
                            if (size2 >= 0) {
                                c5167 = null;
                                break;
                            }
                            c5167 = (C5167) c22101.f71575.get(size2);
                        } while (c5167.f17935 != i5);
                    } else {
                        c5167 = null;
                        break;
                    }
                    if (c5167 != null) {
                        c22101.f71575.remove(c5167);
                    }
                    size = c22101.f71575.size();
                    i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            i7 = -1;
                            break;
                        } else if (((C5167) c22101.f71575.get(i7)).f17935 >= i5) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (i7 != -1) {
                        C5167 c5168 = (C5167) c22101.f71575.get(i7);
                        c22101.f71575.remove(i7);
                        i6 = c5168.f17935;
                    } else {
                        i6 = -1;
                    }
                } else {
                    i6 = -1;
                }
                if (i6 == -1) {
                    int[] iArr2 = c22101.f71574;
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = c22101.f71574.length;
                } else {
                    Arrays.fill(c22101.f71574, i5, Math.min(i6 + 1, c22101.f71574.length), -1);
                }
            }
            if (i3 != 1) {
                c22101.m49040(i, i2);
            } else if (i3 != 2) {
                c22101.m49041(i, i2);
            } else if (i3 == 8) {
                c22101.m49041(i, 1);
                c22101.m49040(i2, 1);
            }
            if (i4 <= iM17838) {
                return;
            }
            if (this.f22154) {
                iM17837 = m17838();
            } else {
                iM17837 = m17837();
            }
            if (i5 <= iM17837) {
                requestLayout();
            }
        }
        i4 = i + i2;
        i5 = i;
        c22101 = this.f22137;
        iArr = c22101.f71574;
        if (iArr != null) {
            arrayList = c22101.f71575;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size();
                    do {
                        size2--;
                        if (size2 >= 0) {
                            c5167 = null;
                            break;
                        }
                        c5167 = (C5167) c22101.f71575.get(size2);
                    } while (c5167.f17935 != i5);
                } else {
                    c5167 = null;
                    break;
                }
                if (c5167 != null) {
                    c22101.f71575.remove(c5167);
                }
                size = c22101.f71575.size();
                i7 = 0;
                while (true) {
                    if (i7 < size) {
                        i7 = -1;
                        break;
                    } else {
                        if (((C5167) c22101.f71575.get(i7)).f17935 >= i5) {
                            break;
                            break;
                        }
                        i7++;
                    }
                }
                if (i7 != -1) {
                    C5167 c5169 = (C5167) c22101.f71575.get(i7);
                    c22101.f71575.remove(i7);
                    i6 = c5169.f17935;
                } else {
                    i6 = -1;
                }
            } else {
                i6 = -1;
            }
            if (i6 == -1) {
                int[] iArr3 = c22101.f71574;
                Arrays.fill(iArr3, i5, iArr3.length, -1);
                int length2 = c22101.f71574.length;
            } else {
                Arrays.fill(c22101.f71574, i5, Math.min(i6 + 1, c22101.f71574.length), -1);
            }
        }
        if (i3 != 1) {
            c22101.m49040(i, i2);
        } else if (i3 != 2) {
            c22101.m49041(i, i2);
        } else if (i3 == 8) {
            c22101.m49041(i, 1);
            c22101.m49040(i2, 1);
        }
        if (i4 <= iM17838) {
            return;
        }
        if (this.f22154) {
            iM17837 = m17838();
        } else {
            iM17837 = m17837();
        }
        if (i5 <= iM17837) {
            requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m17819(C21726 c21726, C13821 c13821, C16082 c16082) {
        int i;
        int iMo36483;
        int iM17817;
        C3755 c3755;
        ?? r1;
        int iMo36482;
        int iMo36484;
        int iMo36485;
        int iMo36486;
        int i2;
        int i3;
        C21726 c21727 = c21726;
        int i4 = 1;
        this.f22152.set(0, this.f22143, true);
        C13821 c13822 = this.f22157;
        if (c13822.f45624) {
            i = c13821.f45631 == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else if (c13821.f45631 == 1) {
            i = c13821.f45628 + c13821.f45626;
        } else {
            i = c13821.f45629 - c13821.f45626;
        }
        int i5 = c13821.f45631;
        for (int i6 = 0; i6 < this.f22143; i6++) {
            if (!this.f22155[i6].f13604.isEmpty()) {
                m17821(this.f22155[i6], i5, i);
            }
        }
        if (this.f22154) {
            iMo36483 = this.f22156.mo36481();
        } else {
            iMo36483 = this.f22156.mo36483();
        }
        boolean z = false;
        C6578 c6578 = this;
        while (true) {
            int i7 = c13821.f45630;
            int i8 = -1;
            if (i7 < 0 || i7 >= c16082.m38108() || (!c13822.f45624 && c6578.f22152.isEmpty())) {
                break;
            }
            View viewM48485 = c21727.m48485(c13821.f45630);
            c13821.f45630 += c13821.f45627;
            C11518 c11518 = (C11518) viewM48485.getLayoutParams();
            int layoutPosition = c11518.f73212.getLayoutPosition();
            C22101 c22101 = c6578.f22137;
            int[] iArr = c22101.f71574;
            int i9 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i9 != -1) {
                c3755 = c6578.f22155[i9];
            } else {
                if (c6578.m17828(c13821.f45631)) {
                    i3 = c6578.f22143 - i4;
                    i2 = -1;
                } else {
                    i8 = c6578.f22143;
                    i2 = 1;
                    i3 = 0;
                }
                C3755 c3756 = null;
                if (c13821.f45631 == i4) {
                    int iMo36487 = c6578.f22156.mo36483();
                    int i10 = Integer.MAX_VALUE;
                    while (i3 != i8) {
                        C3755 c3757 = c6578.f22155[i3];
                        int iM10979 = c3757.m10979(iMo36487);
                        if (iM10979 < i10) {
                            c3756 = c3757;
                            i10 = iM10979;
                        }
                        i3 += i2;
                    }
                } else {
                    int iMo36481 = c6578.f22156.mo36481();
                    int i11 = Integer.MIN_VALUE;
                    while (i3 != i8) {
                        C3755 c3758 = c6578.f22155[i3];
                        int iM10983 = c3758.m10983(iMo36481);
                        if (iM10983 > i11) {
                            c3756 = c3758;
                            i11 = iM10983;
                        }
                        i3 += i2;
                    }
                }
                c3755 = c3756;
                c22101.m49039(layoutPosition);
                c22101.f71574[layoutPosition] = c3755.f13602;
            }
            c11518.f38735 = c3755;
            if (c13821.f45631 == 1) {
                c6578.addView(viewM48485);
                r1 = 0;
            } else {
                r1 = 0;
                c6578.addView(viewM48485, 0);
            }
            if (c6578.f22148 == 1) {
                c6578.m17820(viewM48485, AbstractC5498.m15188(c6578.f22145, c6578.getWidthMode(), r1, ((ViewGroup.MarginLayoutParams) c11518).width, r1), AbstractC5498.m15188(c6578.getHeight(), c6578.getHeightMode(), c6578.getPaddingBottom() + c6578.getPaddingTop(), ((ViewGroup.MarginLayoutParams) c11518).height, true));
            } else {
                c6578.m17820(viewM48485, AbstractC5498.m15188(c6578.getWidth(), c6578.getWidthMode(), c6578.getPaddingRight() + c6578.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) c11518).width, true), AbstractC5498.m15188(c6578.f22145, c6578.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) c11518).height, false));
            }
            if (c13821.f45631 == 1) {
                iMo36484 = c3755.m10979(iMo36483);
                iMo36482 = c6578.f22156.mo36482(viewM48485) + iMo36484;
            } else {
                int iM10984 = c3755.m10983(iMo36483);
                iMo36482 = iM10984;
                iMo36484 = iM10984 - c6578.f22156.mo36482(viewM48485);
            }
            if (c13821.f45631 == 1) {
                C3755 c3759 = c11518.f38735;
                c3759.getClass();
                C11518 c11519 = (C11518) viewM48485.getLayoutParams();
                c11519.f38735 = c3759;
                ArrayList arrayList = c3759.f13604;
                arrayList.add(viewM48485);
                c3759.f13603 = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c3759.f13606 = Integer.MIN_VALUE;
                }
                if (c11519.f73212.isRemoved() || c11519.f73212.isUpdated()) {
                    c3759.f13605 = c3759.f13607.f22156.mo36482(viewM48485) + c3759.f13605;
                }
            } else {
                C3755 c37510 = c11518.f38735;
                c37510.getClass();
                C11518 c115110 = (C11518) viewM48485.getLayoutParams();
                c115110.f38735 = c37510;
                ArrayList arrayList2 = c37510.f13604;
                arrayList2.add(0, viewM48485);
                c37510.f13606 = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c37510.f13603 = Integer.MIN_VALUE;
                }
                if (c115110.f73212.isRemoved() || c115110.f73212.isUpdated()) {
                    c37510.f13605 = c37510.f13607.f22156.mo36482(viewM48485) + c37510.f13605;
                }
            }
            if (c6578.isLayoutRTL() && c6578.f22148 == 1) {
                iMo36486 = c6578.f22144.mo36481() - (((c6578.f22143 - 1) - c3755.f13602) * c6578.f22145);
                iMo36485 = iMo36486 - c6578.f22144.mo36482(viewM48485);
            } else {
                iMo36485 = c6578.f22144.mo36483() + (c3755.f13602 * c6578.f22145);
                iMo36486 = c6578.f22144.mo36482(viewM48485) + iMo36485;
            }
            int i12 = iMo36486;
            int i13 = iMo36485;
            if (c6578.f22148 == 1) {
                c6578.layoutDecoratedWithMargins(viewM48485, i13, iMo36484, i12, iMo36482);
                c6578 = this;
            } else {
                c6578.layoutDecoratedWithMargins(viewM48485, iMo36484, i13, iMo36482, i12);
            }
            c6578.m17821(c3755, c13822.f45631, i);
            c21727 = c21726;
            c6578.m17823(c21727, c13822);
            if (c13822.f45625 && viewM48485.hasFocusable()) {
                c6578.f22152.set(c3755.f13602, false);
            }
            z = true;
            i4 = 1;
        }
        if (!z) {
            c6578.m17823(c21727, c13822);
        }
        if (c13822.f45631 == -1) {
            iM17817 = c6578.f22156.mo36483() - c6578.m17829(c6578.f22156.mo36483());
        } else {
            iM17817 = c6578.m17817(c6578.f22156.mo36481()) - c6578.f22156.mo36481();
        }
        if (iM17817 > 0) {
            return Math.min(c13821.f45626, iM17817);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17823(C21726 c21726, C13821 c13821) {
        int iMin;
        int iMin2;
        if (!c13821.f45623 || c13821.f45624) {
            return;
        }
        if (c13821.f45626 == 0) {
            if (c13821.f45631 == -1) {
                m17822(c21726, c13821.f45628);
                return;
            } else {
                m17831(c21726, c13821.f45629);
                return;
            }
        }
        int i = 1;
        if (c13821.f45631 == -1) {
            int i2 = c13821.f45629;
            int iM10983 = this.f22155[0].m10983(i2);
            while (i < this.f22143) {
                int iM10984 = this.f22155[i].m10983(i2);
                if (iM10984 > iM10983) {
                    iM10983 = iM10984;
                }
                i++;
            }
            int i3 = i2 - iM10983;
            if (i3 < 0) {
                iMin2 = c13821.f45628;
            } else {
                iMin2 = c13821.f45628 - Math.min(i3, c13821.f45626);
            }
            m17822(c21726, iMin2);
            return;
        }
        int i4 = c13821.f45628;
        int iM10979 = this.f22155[0].m10979(i4);
        while (i < this.f22143) {
            int iM109710 = this.f22155[i].m10979(i4);
            if (iM109710 < iM10979) {
                iM10979 = iM109710;
            }
            i++;
        }
        int i5 = iM10979 - c13821.f45628;
        if (i5 < 0) {
            iMin = c13821.f45629;
        } else {
            iMin = Math.min(i5, c13821.f45626) + c13821.f45629;
        }
        m17831(c21726, iMin);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m17829(int i) {
        int iM10983 = this.f22155[0].m10983(i);
        for (int i2 = 1; i2 < this.f22143; i2++) {
            int iM10984 = this.f22155[i2].m10983(i);
            if (iM10984 < iM10983) {
                iM10983 = iM10984;
            }
        }
        return iM10983;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m17817(int i) {
        int iM10979 = this.f22155[0].m10979(i);
        for (int i2 = 1; i2 < this.f22143; i2++) {
            int iM109710 = this.f22155[i2].m10979(i);
            if (iM109710 > iM10979) {
                iM10979 = iM109710;
            }
        }
        return iM10979;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m17831(C21726 c21726, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f22156.mo36475(childAt) > i || this.f22156.mo36478(childAt) > i) {
                return;
            }
            C11518 c11518 = (C11518) childAt.getLayoutParams();
            c11518.getClass();
            if (c11518.f38735.f13604.size() == 1) {
                return;
            }
            C3755 c3755 = c11518.f38735;
            ArrayList arrayList = c3755.f13604;
            View view = (View) arrayList.remove(0);
            C11518 c11519 = (C11518) view.getLayoutParams();
            c11519.f38735 = null;
            if (arrayList.size() == 0) {
                c3755.f13603 = Integer.MIN_VALUE;
            }
            if (c11519.f73212.isRemoved() || c11519.f73212.isUpdated()) {
                c3755.f13605 -= c3755.f13607.f22156.mo36482(view);
            }
            c3755.f13606 = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c21726);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17822(C21726 c21726, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f22156.mo36473(childAt) < i || this.f22156.mo36484(childAt) < i) {
                return;
            }
            C11518 c11518 = (C11518) childAt.getLayoutParams();
            c11518.getClass();
            if (c11518.f38735.f13604.size() == 1) {
                return;
            }
            C3755 c3755 = c11518.f38735;
            ArrayList arrayList = c3755.f13604;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C11518 c11519 = (C11518) view.getLayoutParams();
            c11519.f38735 = null;
            if (c11519.f73212.isRemoved() || c11519.f73212.isUpdated()) {
                c3755.f13605 -= c3755.f13607.f22156.mo36482(view);
            }
            if (size == 1) {
                c3755.f13606 = Integer.MIN_VALUE;
            }
            c3755.f13603 = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c21726);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m17828(int i) {
        if (this.f22148 == 0) {
            return (i == -1) != this.f22154;
        }
        return ((i == -1) == this.f22154) == isLayoutRTL();
    }

    @Override // l.AbstractC5498
    public final boolean canScrollVertically() {
        return this.f22148 == 1;
    }

    @Override // l.AbstractC5498
    public final boolean canScrollHorizontally() {
        return this.f22148 == 0;
    }

    @Override // l.AbstractC5498
    public final int scrollHorizontallyBy(int i, C21726 c21726, C16082 c16082) {
        return scrollBy(i, c21726, c16082);
    }

    @Override // l.AbstractC5498
    public final int scrollVerticallyBy(int i, C21726 c21726, C16082 c16082) {
        return scrollBy(i, c21726, c16082);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // l.InterfaceC7615
    public final PointF computeScrollVectorForPosition(int i) {
        int i2 = -1;
        if (getChildCount() == 0) {
            if (this.f22154) {
                i2 = 1;
            }
        } else {
            if ((i < m17838()) == this.f22154) {
                i2 = 1;
            }
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.f22148 == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // l.AbstractC5498
    public final void smoothScrollToPosition(C17492 c17492, C16082 c16082, int i) {
        C3941 c3941 = new C3941(c17492.getContext());
        c3941.setTargetPosition(i);
        startSmoothScroll(c3941);
    }

    @Override // l.AbstractC5498
    public final void scrollToPosition(int i) {
        C12929 c12929 = this.f22139;
        if (c12929 != null && c12929.f42970 != i) {
            c12929.f42964 = null;
            c12929.f42971 = 0;
            c12929.f42970 = -1;
            c12929.f42966 = -1;
        }
        this.f22142 = i;
        this.f22158 = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // l.AbstractC5498
    public final void collectAdjacentPrefetchPositions(int i, int i2, C16082 c16082, InterfaceC11849 interfaceC11849) {
        C13821 c13821;
        int iM10979;
        int iM10983;
        if (this.f22148 != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        m17835(i, c16082);
        int[] iArr = this.f22150;
        if (iArr == null || iArr.length < this.f22143) {
            this.f22150 = new int[this.f22143];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f22143;
            c13821 = this.f22157;
            if (i3 >= i5) {
                break;
            }
            if (c13821.f45627 == -1) {
                iM10979 = c13821.f45629;
                iM10983 = this.f22155[i3].m10983(iM10979);
            } else {
                iM10979 = this.f22155[i3].m10979(c13821.f45628);
                iM10983 = c13821.f45628;
            }
            int i6 = iM10979 - iM10983;
            if (i6 >= 0) {
                this.f22150[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f22150, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c13821.f45630;
            if (i8 < 0 || i8 >= c16082.m38108()) {
                return;
            }
            ((C8301) interfaceC11849).m21733(c13821.f45630, this.f22150[i7]);
            c13821.f45630 += c13821.f45627;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17835(int i, C16082 c16082) {
        int iM17838;
        int i2;
        if (i > 0) {
            iM17838 = m17837();
            i2 = 1;
        } else {
            iM17838 = m17838();
            i2 = -1;
        }
        C13821 c13821 = this.f22157;
        c13821.f45623 = true;
        m17830(iM17838, c16082);
        m17816(i2);
        c13821.f45630 = iM17838 + c13821.f45627;
        c13821.f45626 = Math.abs(i);
    }

    public final int scrollBy(int i, C21726 c21726, C16082 c16082) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m17835(i, c16082);
        C13821 c13821 = this.f22157;
        int iM17819 = m17819(c21726, c13821, c16082);
        if (c13821.f45626 >= iM17819) {
            i = i < 0 ? -iM17819 : iM17819;
        }
        this.f22156.mo36476(-i);
        this.f22138 = this.f22154;
        c13821.f45626 = 0;
        m17823(c21726, c13821);
        return i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m17837() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m17838() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    @Override // l.AbstractC5498
    public final C22432 generateDefaultLayoutParams() {
        return this.f22148 == 0 ? new C11518(-2, -1) : new C11518(-1, -2);
    }

    @Override // l.AbstractC5498
    public final C22432 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C11518(context, attributeSet);
    }

    @Override // l.AbstractC5498
    public final C22432 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C11518((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C11518(layoutParams);
    }

    @Override // l.AbstractC5498
    public final boolean checkLayoutParams(C22432 c22432) {
        return c22432 instanceof C11518;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x005a  */
    /* JADX WARN: Code duplicated, block: B:46:0x005c  */
    @Override // l.AbstractC5498
    public final View onFocusSearchFailed(View view, int i, C21726 c21726, C16082 c16082) {
        View viewFindContainingItemView;
        int i2;
        int iM17838;
        int iM10978;
        int iM10979;
        int iM109710;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        m17825();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i == 33) {
                        if (this.f22148 == 1) {
                            i2 = -1;
                        }
                    } else if (i == 66 ? this.f22148 == 0 : !(i != 130 || this.f22148 != 1)) {
                        i2 = 1;
                    }
                    i2 = Integer.MIN_VALUE;
                } else if (this.f22148 == 0) {
                    i2 = -1;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
            } else if (this.f22148 != 1 && isLayoutRTL()) {
                i2 = -1;
            } else {
                i2 = 1;
            }
        } else if (this.f22148 != 1 && isLayoutRTL()) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        C11518 c11518 = (C11518) viewFindContainingItemView.getLayoutParams();
        c11518.getClass();
        C3755 c3755 = c11518.f38735;
        if (i2 == 1) {
            iM17838 = m17837();
        } else {
            iM17838 = m17838();
        }
        m17830(iM17838, c16082);
        m17816(i2);
        C13821 c13821 = this.f22157;
        c13821.f45630 = c13821.f45627 + iM17838;
        c13821.f45626 = (int) (this.f22156.mo36471() * 0.33333334f);
        c13821.f45625 = true;
        c13821.f45623 = false;
        m17819(c21726, c13821, c16082);
        this.f22138 = this.f22154;
        View viewM10984 = c3755.m10984(iM17838, i2);
        if (viewM10984 != null && viewM10984 != viewFindContainingItemView) {
            return viewM10984;
        }
        if (m17828(i2)) {
            for (int i3 = this.f22143 - 1; i3 >= 0; i3--) {
                View viewM10985 = this.f22155[i3].m10984(iM17838, i2);
                if (viewM10985 != null && viewM10985 != viewFindContainingItemView) {
                    return viewM10985;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f22143; i4++) {
                View viewM10986 = this.f22155[i4].m10984(iM17838, i2);
                if (viewM10986 != null && viewM10986 != viewFindContainingItemView) {
                    return viewM10986;
                }
            }
        }
        boolean z = (this.f22153 ^ true) == (i2 == -1);
        if (z) {
            iM10978 = c3755.m10982();
        } else {
            iM10978 = c3755.m10978();
        }
        View viewFindViewByPosition = findViewByPosition(iM10978);
        if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
            return viewFindViewByPosition;
        }
        if (m17828(i2)) {
            for (int i5 = this.f22143 - 1; i5 >= 0; i5--) {
                if (i5 != c3755.f13602) {
                    if (z) {
                        iM109710 = this.f22155[i5].m10982();
                    } else {
                        iM109710 = this.f22155[i5].m10978();
                    }
                    View viewFindViewByPosition2 = findViewByPosition(iM109710);
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f22143; i6++) {
                if (z) {
                    iM10979 = this.f22155[i6].m10982();
                } else {
                    iM10979 = this.f22155[i6].m10978();
                }
                View viewFindViewByPosition3 = findViewByPosition(iM10979);
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17821(C3755 c3755, int i, int i2) {
        int i3 = c3755.f13605;
        int i4 = c3755.f13602;
        if (i == -1) {
            int i5 = c3755.f13606;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) c3755.f13604.get(0);
                C11518 c11518 = (C11518) view.getLayoutParams();
                c3755.f13606 = c3755.f13607.f22156.mo36473(view);
                c11518.getClass();
                i5 = c3755.f13606;
            }
            if (i5 + i3 <= i2) {
                this.f22152.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c3755.f13603;
        if (i6 == Integer.MIN_VALUE) {
            c3755.m10981();
            i6 = c3755.f13603;
        }
        if (i6 - i3 >= i2) {
            this.f22152.set(i4, false);
        }
    }
}
