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

/* JADX INFO: renamed from: l.֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 165A */
/* JADX INFO: loaded from: classes3.dex */
public class C0094 extends AbstractC3823 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public View f1020;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f1021;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public View f1022;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f1023;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public View f1024;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f1025;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public TextView f1026;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public CharSequence f1027;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f1028;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f1029;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public TextView f1030;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public LinearLayout f1031;

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public C0094(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C0094(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C5204 c5204M15649 = C5204.m15649(context, attributeSet, C10401.f33082, i, 0);
        setBackground(c5204M15649.m15669(0));
        this.f1028 = c5204M15649.m15660(5, 0);
        this.f1021 = c5204M15649.m15660(4, 0);
        this.f13041 = c5204M15649.m15662(3, 0);
        this.f1023 = c5204M15649.m15660(2, R.layout.MT_Protector);
        c5204M15649.m15664();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C13056 c13056 = this.f13038;
        if (c13056 != null) {
            c13056.m32536();
            C8298 c8298 = this.f13038.f41783;
            if (c8298 != null) {
                c8298.m36140();
            }
        }
    }

    @Override // l.AbstractC3823
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1183(int i) {
        this.f13041 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1184(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1022;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1022 = view;
        if (view != null && (linearLayout = this.f1031) != null) {
            removeView(linearLayout);
            this.f1031 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m1192(CharSequence charSequence) {
        this.f1025 = charSequence;
        m1180();
        C22666.m51091(this, charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1185(CharSequence charSequence) {
        this.f1027 = charSequence;
        m1180();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence m1188() {
        return this.f1025;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CharSequence m1191() {
        return this.f1027;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m1180() {
        if (this.f1031 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1031 = linearLayout;
            this.f1026 = (TextView) linearLayout.findViewById(R.id.MT_Protector);
            this.f1030 = (TextView) this.f1031.findViewById(R.id.MT_Protector);
            int i = this.f1028;
            if (i != 0) {
                this.f1026.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1021;
            if (i2 != 0) {
                this.f1030.setTextAppearance(getContext(), i2);
            }
        }
        this.f1026.setText(this.f1025);
        this.f1030.setText(this.f1027);
        boolean zIsEmpty = TextUtils.isEmpty(this.f1025);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f1027);
        this.f1030.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f1031.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f1031.getParent() == null) {
            addView(this.f1031);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24158 m1181(int i, long j) {
        C24158 c24158 = this.f13035;
        if (c24158 != null) {
            c24158.m54119();
        }
        C23961 c23961 = this.f13037;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C24158 c24158M51085 = C22666.m51085(this);
            c24158M51085.m54120(1.0f);
            c24158M51085.m54121(j);
            c23961.f77553.f13035 = c24158M51085;
            c23961.f77554 = i;
            c24158M51085.m54123(c23961);
            return c24158M51085;
        }
        C24158 c24158M51086 = C22666.m51085(this);
        c24158M51086.m54120(0.0f);
        c24158M51086.m54121(j);
        c23961.f77553.f13035 = c24158M51086;
        c23961.f77554 = i;
        c24158M51086.m54123(c23961);
        return c24158M51086;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1186(AbstractC10116 abstractC10116) {
        View view = this.f1024;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f1023, (ViewGroup) this, false);
            this.f1024 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f1024);
        }
        View viewFindViewById = this.f1024.findViewById(R.id.MT_Protector);
        this.f1020 = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC17993(abstractC10116));
        C9898 c9898Mo8805 = abstractC10116.mo8805();
        C13056 c13056 = this.f13038;
        if (c13056 != null) {
            c13056.m32536();
            C8298 c8298 = c13056.f41783;
            if (c8298 != null) {
                c8298.m36140();
            }
        }
        C13056 c13057 = new C13056(getContext());
        this.f13038 = c13057;
        c13057.m32537();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c9898Mo8805.addMenuPresenter(this.f13038, this.f13040);
        C17531 c17531 = (C17531) this.f13038.mo32529(this);
        this.f13036 = c17531;
        c17531.setBackground(null);
        addView(this.f13036, layoutParams);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1182() {
        if (this.f1024 == null) {
            m1190();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m1190() {
        removeAllViews();
        this.f1022 = null;
        this.f13036 = null;
        this.f13038 = null;
        View view = this.f1020;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m1189() {
        C13056 c13056 = this.f13038;
        if (c13056 != null) {
            c13056.m32535();
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
        int size2 = this.f13041;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f1024;
        if (view != null) {
            int iM12360 = AbstractC3823.m12360(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1024.getLayoutParams();
            paddingLeft = iM12360 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        C17531 c17531 = this.f13036;
        if (c17531 != null && c17531.getParent() == this) {
            paddingLeft = AbstractC3823.m12360(this.f13036, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1031;
        if (linearLayout != null && this.f1022 == null) {
            if (this.f1029) {
                this.f1031.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1031.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f1031.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = AbstractC3823.m12360(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f1022;
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
            this.f1022.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f13041 <= 0) {
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
        int i5 = C19374.f62602;
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1024;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1024.getLayoutParams();
            int i6 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = z2 ? paddingRight - i6 : paddingRight + i6;
            int iM12359 = i8 + AbstractC3823.m12359(i8, paddingTop, paddingTop2, this.f1024, z2);
            paddingRight = z2 ? iM12359 - i7 : iM12359 + i7;
        }
        LinearLayout linearLayout = this.f1031;
        if (linearLayout != null && this.f1022 == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbstractC3823.m12359(paddingRight, paddingTop, paddingTop2, this.f1031, z2);
        }
        View view2 = this.f1022;
        if (view2 != null) {
            AbstractC3823.m12359(paddingRight, paddingTop, paddingTop2, view2, z2);
        }
        int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        C17531 c17531 = this.f13036;
        if (c17531 != null) {
            AbstractC3823.m12359(paddingLeft, paddingTop, paddingTop2, c17531, !z2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1187(boolean z) {
        if (z != this.f1029) {
            requestLayout();
        }
        this.f1029 = z;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m1193() {
        return this.f1029;
    }
}
