package l;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 165A */
/* JADX INFO: loaded from: classes5.dex */
public class C19910 extends AbstractC10032 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public TextView f63813;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f63814;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public LinearLayout f63815;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public CharSequence f63816;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f63817;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f63818;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public View f63819;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f63820;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public TextView f63821;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public View f63822;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f63823;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public View f63824;

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public C19910(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C19910(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1977 c1977M6353 = C1977.m6353(context, attributeSet, C12108.f40513, i, 0);
        setBackground(c1977M6353.m6370(0));
        this.f63823 = c1977M6353.m6387(5, 0);
        this.f63817 = c1977M6353.m6387(4, 0);
        this.f34251 = c1977M6353.m6377(3, 0);
        this.f63814 = c1977M6353.m6387(2, R.layout.MT_Protector);
        c1977M6353.m6379();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C5175 c5175 = this.f34248;
        if (c5175 != null) {
            c5175.m14342();
            C23438 c23438 = this.f34248.f17951;
            if (c23438 != null) {
                c23438.m6954();
            }
        }
    }

    @Override // l.AbstractC10032
    /* JADX INFO: renamed from: ۙ */
    public final void mo25318(int i) {
        this.f34251 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45191(View view) {
        LinearLayout linearLayout;
        View view2 = this.f63819;
        if (view2 != null) {
            removeView(view2);
        }
        this.f63819 = view;
        if (view != null && (linearLayout = this.f63815) != null) {
            removeView(linearLayout);
            this.f63815 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45198(CharSequence charSequence) {
        this.f63820 = charSequence;
        m45187();
        C5031.m13986(this, charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45192(CharSequence charSequence) {
        this.f63816 = charSequence;
        m45187();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CharSequence m45196() {
        return this.f63820;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CharSequence m45197() {
        return this.f63816;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m45187() {
        if (this.f63815 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f63815 = linearLayout;
            this.f63813 = (TextView) linearLayout.findViewById(R.id.MT_Protector);
            this.f63821 = (TextView) this.f63815.findViewById(R.id.MT_Protector);
            int i = this.f63823;
            if (i != 0) {
                this.f63813.setTextAppearance(getContext(), i);
            }
            int i2 = this.f63817;
            if (i2 != 0) {
                this.f63821.setTextAppearance(getContext(), i2);
            }
        }
        this.f63813.setText(this.f63820);
        this.f63821.setText(this.f63816);
        boolean zIsEmpty = TextUtils.isEmpty(this.f63820);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f63816);
        this.f63821.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f63815.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f63815.getParent() == null) {
            addView(this.f63815);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20554 m45189(int i, long j) {
        C20554 c20554 = this.f34246;
        if (c20554 != null) {
            c20554.m46322();
        }
        C8621 c8621 = this.f34245;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C20554 c20554M13980 = C5031.m13980(this);
            c20554M13980.m46323(1.0f);
            c20554M13980.m46324(j);
            c8621.f29751.f34246 = c20554M13980;
            c8621.f29752 = i;
            c20554M13980.m46326(c8621);
            return c20554M13980;
        }
        C20554 c20554M13981 = C5031.m13980(this);
        c20554M13981.m46323(0.0f);
        c20554M13981.m46324(j);
        c8621.f29751.f34246 = c20554M13981;
        c8621.f29752 = i;
        c20554M13981.m46326(c8621);
        return c20554M13981;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45193(AbstractC12067 abstractC12067) {
        View view = this.f63824;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f63814, (ViewGroup) this, false);
            this.f63824 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f63824);
        }
        View viewFindViewById = this.f63824.findViewById(R.id.MT_Protector);
        this.f63822 = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC15677(abstractC12067));
        C12418 c12418Mo6791 = abstractC12067.mo6791();
        C5175 c5175 = this.f34248;
        if (c5175 != null) {
            c5175.m14342();
            C23438 c23438 = c5175.f17951;
            if (c23438 != null) {
                c23438.m6954();
            }
        }
        C5175 c5176 = new C5175(getContext());
        this.f34248 = c5176;
        c5176.m14332();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c12418Mo6791.addMenuPresenter(this.f34248, this.f34250);
        C22815 c22815 = (C22815) this.f34248.mo14335(this);
        this.f34247 = c22815;
        c22815.setBackground(null);
        addView(this.f34247, layoutParams);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45190() {
        if (this.f63824 == null) {
            m45195();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m45195() {
        removeAllViews();
        this.f63819 = null;
        this.f34247 = null;
        this.f34248 = null;
        View view = this.f63822;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m45199() {
        C5175 c5175 = this.f34248;
        if (c5175 != null) {
            c5175.m14343();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f34251;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f63824;
        if (view != null) {
            int iM25315 = AbstractC10032.m25315(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f63824.getLayoutParams();
            paddingLeft = iM25315 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        C22815 c22815 = this.f34247;
        if (c22815 != null && c22815.getParent() == this) {
            paddingLeft = AbstractC10032.m25315(this.f34247, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f63815;
        if (linearLayout != null && this.f63819 == null) {
            if (this.f63818) {
                this.f63815.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f63815.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f63815.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = AbstractC10032.m25315(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f63819;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f63819.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f34251 <= 0) {
            int childCount = getChildCount();
            int i7 = 0;
            for (int i8 = 0; i8 < childCount; i8++) {
                int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > i7) {
                    i7 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i7);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C20344.f65886;
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f63824;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f63824.getLayoutParams();
            int i6 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = z2 ? paddingRight - i6 : paddingRight + i6;
            int iM25314 = i8 + AbstractC10032.m25314(i8, paddingTop, paddingTop2, this.f63824, z2);
            paddingRight = z2 ? iM25314 - i7 : iM25314 + i7;
        }
        LinearLayout linearLayout = this.f63815;
        if (linearLayout != null && this.f63819 == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbstractC10032.m25314(paddingRight, paddingTop, paddingTop2, this.f63815, z2);
        }
        View view2 = this.f63819;
        if (view2 != null) {
            AbstractC10032.m25314(paddingRight, paddingTop, paddingTop2, view2, z2);
        }
        int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        C22815 c22815 = this.f34247;
        if (c22815 != null) {
            AbstractC10032.m25314(paddingLeft, paddingTop, paddingTop2, c22815, !z2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45194(boolean z) {
        if (z != this.f63818) {
            requestLayout();
        }
        this.f63818 = z;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m45188() {
        return this.f63818;
    }
}
