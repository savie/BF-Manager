package l;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.statistics.common.HelperUtils;

/* JADX INFO: renamed from: l.֫ۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T6J6 */
/* JADX INFO: loaded from: classes2.dex */
public class C1626 extends ViewGroup {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public CharSequence f5592;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f5593;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f5594;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f5595;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f5596;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f5597;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public Drawable f5598;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f5599;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final GestureDetector f5600;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f5601;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public C8648 f5602;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C22687 f5603;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f5604;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f5605;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final int[] f5606;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C23255 f5607;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public ColorStateList f5608;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public ColorStateList f5609;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f5610;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public View.OnClickListener f5611;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public C22687 f5612;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C5355 f5613;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public boolean f5614;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f5615;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f5616;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f5617;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public float f5618;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public CharSequence f5619;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f5620;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f5621;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C23255 f5622;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f5623;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f5624;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f5625;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public ViewGroup.OnHierarchyChangeListener f5626;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Drawable f5627;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final TextView f5628;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f5629;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public float f5630;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f5631;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public Drawable f5632;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f5633;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f5634;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f5635;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public final TextWatcher f5636;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f5637;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f5638;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f5639;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public ColorStateList f5640;

    public C1626(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1626(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5634 = 0;
        this.f5639 = new Rect();
        this.f5638 = true;
        this.f5637 = true;
        this.f5605 = true;
        this.f5606 = new int[4];
        this.f5636 = new C22509(this);
        setWillNotDraw(false);
        m5723();
        this.f5608 = C23434.m52628(context.getTheme(), R.attr.textColorHint);
        setSaveEnabled(true);
        GestureDetector gestureDetector = new GestureDetector(context, new C19525(this));
        this.f5600 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        gestureDetector.setOnDoubleTapListener(null);
        TextView textView = new TextView(context);
        this.f5628 = textView;
        textView.setId(bin.mt.plus.R.id.MT_Protector);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        textView.setGravity(8388611);
        textView.setImportantForAccessibility(2);
        TextView textView2 = new TextView(context);
        this.f5621 = textView2;
        textView2.setId(bin.mt.plus.R.id.MT_Protector);
        C18085.m42126(textView2, C4185.f14470);
        textView2.setAccessibilityLiveRegion(1);
        C5355 c5355 = new C5355(this, context);
        this.f5613 = c5355;
        c5355.setId(bin.mt.plus.R.id.MT_Protector);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        c5355.setScaleType(scaleType);
        c5355.setPadding(m5752(12), m5752(12), m5752(12), m5752(12));
        c5355.setBackgroundResource(bin.mt.plus.R.drawable.MT_Protector);
        c5355.setFocusable(true);
        c5355.setFocusableInTouchMode(false);
        c5355.setOnClickListener(new View.OnClickListener() { // from class: l.᩷ۖ᩸
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1626.m5728(this.f69405, view);
            }
        });
        ImageView imageView = new ImageView(context);
        this.f5635 = imageView;
        imageView.setId(bin.mt.plus.R.id.MT_Protector);
        imageView.setImageResource(bin.mt.plus.R.drawable.MT_Protector);
        imageView.setScaleType(scaleType);
        imageView.setPadding(m5752(12), m5752(12), m5752(12), m5752(12));
        imageView.setImportantForAccessibility(2);
        View[] viewArr = {textView, textView2, c5355, imageView};
        for (int i2 = 0; i2 < 4; i2++) {
            View view = viewArr[i2];
            view.setSaveEnabled(false);
            super.addView(view, new ViewGroup.MarginLayoutParams(-2, -2));
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3676.f12642, i, 0);
        this.f5624 = typedArrayObtainStyledAttributes.getText(0);
        this.f5638 = typedArrayObtainStyledAttributes.getBoolean(9, true);
        this.f5637 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f5597 = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.f5627 = typedArrayObtainStyledAttributes.getDrawable(3);
        this.f5592 = typedArrayObtainStyledAttributes.getText(2);
        this.f5609 = typedArrayObtainStyledAttributes.getColorStateList(5);
        this.f5594 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        this.f5615 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.f5616 = typedArrayObtainStyledAttributes.getText(7);
        this.f5640 = typedArrayObtainStyledAttributes.getColorStateList(8);
        this.f5619 = typedArrayObtainStyledAttributes.getText(10);
        typedArrayObtainStyledAttributes.recycle();
        m5737(this.f5597);
        this.f5625 = !TextUtils.isEmpty(this.f5616);
        this.f5601 = !TextUtils.isEmpty(this.f5619);
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC15049(this));
        m5738(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5728(C1626 c1626, View view) {
        C23255 c23255;
        if (c1626.isEnabled() && (c23255 = c1626.f5607) != null && c23255.isEnabled()) {
            int i = c1626.f5597;
            if (i == 1) {
                C23255 c23256 = c1626.f5607;
                c23256.m52340(!c23256.m52327());
            } else if (i == -1) {
                if (c1626.f5594) {
                    C5355 c5355 = c1626.f5613;
                    c5355.setSelected(true ^ c5355.isSelected());
                }
                View.OnClickListener onClickListener = c1626.f5611;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f5626 = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if ((view instanceof C23255) && this.f5607 != null) {
            throw new IllegalArgumentException("Only one EditTextView is supported");
        }
        if (view instanceof EditText) {
            throw new IllegalArgumentException("Use EditTextView for the input field");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            if (!m5732(getChildAt(childCount))) {
                removeViewAt(childCount);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m5732(View view) {
        return view == this.f5628 || view == this.f5621 || view == this.f5613 || view == this.f5635;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5729(C1626 c1626, C23255 c23255) {
        c1626.f5607 = c23255;
        c1626.f5598 = c23255.getBackground();
        int[] iArr = c1626.f5606;
        iArr[0] = c23255.getPaddingLeft();
        iArr[1] = c23255.getPaddingTop() - c23255.m54043();
        iArr[2] = c23255.getPaddingRight();
        iArr[3] = c23255.getPaddingBottom();
        c1626.f5610 = c23255.mo52288();
        if (c1626.f5638 && TextUtils.isEmpty(c1626.f5624) && !TextUtils.isEmpty(c23255.f78022.f43673)) {
            c1626.f5624 = c23255.f78022.f43673;
            c23255.m52337((String) null);
        }
        c23255.m52314(2);
        if (!c1626.isEnabled()) {
            c23255.setEnabled(false);
        }
        c1626.m5754();
        c1626.m5738(false);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m5754() {
        C23255 c23255 = this.f5607;
        if (c23255 == null || this.f5595) {
            return;
        }
        this.f5595 = true;
        this.f5614 = c23255.m52327();
        this.f5607.m53899(this.f5636);
        this.f5607.m52302(new RunnableC4609(0, this));
        C22687 c22687M51119 = C22666.m51119(this.f5607);
        this.f5612 = c22687M51119;
        if (c22687M51119 == null) {
            c22687M51119 = new C22687();
        }
        C12812 c12812 = new C12812(this, c22687M51119);
        this.f5603 = c12812;
        C22666.m51098(this.f5607, c12812);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m5747() {
        if (this.f5595) {
            C23255 c23255 = this.f5607;
            c23255.f78006.remove(this.f5636);
            this.f5607.m52302((RunnableC4609) null);
            if (C22666.m51119(this.f5607) == this.f5603) {
                C22666.m51098(this.f5607, this.f5612);
            }
            this.f5612 = null;
            this.f5603 = null;
            this.f5595 = false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m5741(C1626 c1626) {
        c1626.f5622 = null;
        c1626.m5747();
        c1626.f5607.m52295(0);
        c1626.f5629 = 0;
        c1626.f5607.m52307(c1626.f5610);
        c1626.f5607.setBackground(c1626.f5598);
        C23255 c23255 = c1626.f5607;
        int[] iArr = c1626.f5606;
        c23255.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        c1626.f5598 = null;
        c1626.f5607 = null;
        c1626.m5738(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m5754();
        this.f5608 = C23434.m52628(getContext().getTheme(), R.attr.textColorHint);
        C23255 c23255 = this.f5607;
        if (c23255 != null) {
            c23255.mo40460();
        }
        m5738(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f5622 = null;
        ValueAnimator valueAnimator = this.f5593;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5593 = null;
        }
        m5747();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m5723();
        C18085.m42126(this.f5621, C4185.f14470);
        this.f5608 = C23434.m52628(getContext().getTheme(), R.attr.textColorHint);
        C23255 c23255 = this.f5607;
        if (c23255 != null) {
            c23255.mo40460();
        }
        m5738(false);
        requestLayout();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23255 m5756() {
        return this.f5607;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m5766() {
        if (this.f5634 == 1) {
            return;
        }
        this.f5634 = 1;
        m5723();
        m5748();
        requestLayout();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5761(String str) {
        this.f5624 = str;
        m5738(false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m5771() {
        this.f5637 = false;
        m5738(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5768(CharSequence charSequence) {
        this.f5619 = charSequence;
        if (!TextUtils.isEmpty(charSequence)) {
            this.f5601 = true;
        }
        m5738(true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5769(boolean z) {
        this.f5601 = z;
        if (!z) {
            this.f5619 = null;
        }
        m5738(true);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m5765() {
        return this.f5601;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m5770() {
        return this.f5601 && !TextUtils.isEmpty(this.f5619);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m5764(CharSequence charSequence) {
        this.f5616 = charSequence;
        this.f5625 = !TextUtils.isEmpty(charSequence);
        m5738(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5758(ColorStateList colorStateList) {
        this.f5640 = colorStateList;
        m5748();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5767(int i) {
        m5737(i);
        if (this.f5597 != i) {
            this.f5613.setSelected(false);
        }
        this.f5597 = i;
        m5738(false);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m5737(int i) {
        if (i != 0 && i != 1 && i != -1) {
            throw new IllegalArgumentException(C13645.m33382(i, "Unsupported end icon mode: "));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5757(int i) {
        this.f5627 = i == 0 ? null : C0385.m2186(getContext(), i);
        m5738(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5763(boolean z) {
        this.f5605 = z;
        m5738(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5759(View.OnClickListener onClickListener) {
        this.f5611 = onClickListener;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5760(CharSequence charSequence) {
        this.f5592 = charSequence;
        m5738(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5762(C8648 c8648) {
        this.f5602 = c8648;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            this.f5622 = null;
        }
        C23255 c23255 = this.f5607;
        if (c23255 != null) {
            c23255.setEnabled(z);
        }
        if (this.f5628 != null) {
            m5738(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m5736() {
        return this.f5638 && !TextUtils.isEmpty(this.f5624);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private boolean m5743() {
        if (!isEnabled()) {
            return false;
        }
        C23255 c23255 = this.f5607;
        return c23255 == null || c23255.isEnabled();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5622 = (m5734(this.f5607) && m5730(motionEvent.getX(), motionEvent.getY())) ? this.f5607 : null;
        }
        if (this.f5622 == null) {
            return super.onTouchEvent(motionEvent);
        }
        this.f5600.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f5622 = null;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        InputMethodManager inputMethodManager;
        C23255 c23255 = this.f5622;
        if (c23255 == null) {
            c23255 = this.f5607;
        }
        boolean zPerformClick = super.performClick();
        if (!m5734(c23255) || !c23255.requestFocus()) {
            return zPerformClick;
        }
        if (!m5734(c23255) || !c23255.hasFocus() || c23255.m54083() || c23255.m53884() || (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) == null) {
            return true;
        }
        inputMethodManager.showSoftInput(c23255, 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m5734(C23255 c23255) {
        return c23255 != null && c23255 == this.f5607 && m5743() && c23255.isShown() && c23255.isAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m5730(float f, float f2) {
        return f >= ((float) getPaddingLeft()) && f < ((float) (getWidth() - getPaddingRight())) && f2 >= ((float) getPaddingTop()) && f2 < ((float) this.f5617) && !m5731(f, f2, this.f5613) && !m5731(f, f2, this.f5635);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m5731(float f, float f2, View view) {
        return view.getVisibility() == 0 && f >= ((float) view.getLeft()) && f < ((float) view.getRight()) && f2 >= ((float) view.getTop()) && f2 < ((float) view.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m5738(boolean z) {
        CharSequence charSequence;
        boolean zM52327;
        C23255 c23255;
        C23255 c23256;
        C23255 c23257;
        CharSequence charSequence2 = this.f5624;
        CharSequence charSequence3 = "";
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        TextView textView = this.f5628;
        if (!TextUtils.equals(textView.getText(), charSequence2)) {
            textView.setText(charSequence2);
        }
        textView.setVisibility(m5736() ? 0 : 8);
        boolean z2 = true;
        boolean z3 = !this.f5637 || m5770() || ((c23257 = this.f5607) != null && (c23257.hasFocus() || this.f5607.m54099() > 0));
        boolean z4 = z && ((c23256 = this.f5607) == null || c23256.m54099() == 0);
        float f = z3 ? 1.0f : 0.0f;
        boolean z5 = this.f5633 != z3;
        this.f5633 = z3;
        if (!z4 || !isLaidOut() || !isAttachedToWindow() || !m5736()) {
            ValueAnimator valueAnimator = this.f5593;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f5593 = null;
            }
            this.f5630 = f;
            m5740();
        } else if (z5) {
            ValueAnimator valueAnimator2 = this.f5593;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f5593 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f5630, f);
            this.f5593 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(150L);
            this.f5593.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۤۖ᩸
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    C1626.m5727(this.f33591, valueAnimator3);
                }
            });
            this.f5593.start();
        }
        m5746();
        if (m5770()) {
            charSequence3 = this.f5619;
        } else if (this.f5625 && (charSequence = this.f5616) != null) {
            charSequence3 = charSequence;
        }
        TextView textView2 = this.f5621;
        if (!TextUtils.equals(textView2.getText(), charSequence3)) {
            textView2.setText(charSequence3);
        }
        textView2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        boolean z6 = m5770() && this.f5615;
        this.f5635.setVisibility(z6 ? 0 : 8);
        boolean z7 = this.f5597 == 1;
        C5355 c5355 = this.f5613;
        if (z7) {
            if (!this.f5620) {
                c5355.setImageResource(bin.mt.plus.R.drawable.MT_Protector);
                this.f5620 = true;
            }
            CharSequence text = this.f5592;
            if (text == null) {
                text = getContext().getText(bin.mt.plus.R.string.MT_Protector);
            }
            c5355.setContentDescription(text);
            C23255 c23258 = this.f5607;
            c5355.setSelected(c23258 != null && c23258.m52327());
            if (!z || !isAttachedToWindow()) {
                c5355.jumpDrawablesToCurrentState();
            }
        } else {
            this.f5620 = false;
            c5355.setImageDrawable(this.f5627);
            c5355.setContentDescription(this.f5592);
        }
        if (!z7 ? this.f5597 != -1 || this.f5627 == null : (c23255 = this.f5607) == null || !c23255.m52334()) {
            z2 = false;
        }
        c5355.setVisibility((this.f5605 && z2 && !z6) ? 0 : 8);
        c5355.setEnabled(m5743());
        textView2.setEnabled(m5743());
        m5748();
        C23255 c23259 = this.f5607;
        if (c23259 == null || this.f5614 == (zM52327 = c23259.m52327())) {
            return;
        }
        this.f5614 = zM52327;
        C8648 c8648 = this.f5602;
        if (c8648 != null) {
            ((C1626) c8648.f28240).setVisibility(zM52327 ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m5748() {
        ColorStateList colorStateListValueOf;
        C23255 c23255;
        int defaultColor = isInEditMode() ? C23434.m52628(getContext().getTheme(), R.attr.textColorSecondary).getDefaultColor() : C3296.f10741;
        int i = isInEditMode() ? defaultColor : C3296.f10733;
        int i2 = isInEditMode() ? defaultColor : C3296.f10738;
        int iM20558 = C7508.m20558(getContext(), C16863.f54584);
        if (!m5743()) {
            i2 = i;
        } else if (m5770()) {
            i2 = iM20558;
        } else {
            C23255 c23256 = this.f5607;
            if (c23256 == null || !c23256.hasFocus()) {
                i2 = defaultColor;
            }
        }
        ColorStateList colorStateList = this.f5608;
        boolean zM5743 = m5743();
        int[] iArr = ViewGroup.EMPTY_STATE_SET;
        int[] iArr2 = ViewGroup.ENABLED_STATE_SET;
        int colorForState = colorStateList.getColorForState(zM5743 ? iArr2 : iArr, this.f5608.getDefaultColor());
        if (!m5743() || (!m5770() && ((c23255 = this.f5607) == null || !c23255.hasFocus()))) {
            i2 = colorForState;
        }
        this.f5628.setTextColor(i2);
        Drawable drawable = this.f5632;
        if (m5743()) {
            C23255 c23257 = this.f5607;
            iArr = (c23257 == null || !c23257.hasFocus()) ? iArr2 : ViewGroup.ENABLED_FOCUSED_STATE_SET;
        }
        drawable.setState(iArr);
        if (!m5743()) {
            this.f5632.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        } else if (m5770()) {
            this.f5632.setColorFilter(iM20558, PorterDuff.Mode.SRC_IN);
        } else {
            this.f5632.clearColorFilter();
        }
        if (m5770()) {
            colorStateListValueOf = ColorStateList.valueOf(iM20558);
        } else {
            ColorStateList colorStateList2 = this.f5640;
            if (colorStateList2 != null) {
                colorStateListValueOf = colorStateList2;
            } else {
                if (!m5743()) {
                    defaultColor = i;
                }
                colorStateListValueOf = ColorStateList.valueOf(defaultColor);
            }
        }
        this.f5621.setTextColor(colorStateListValueOf);
        ColorStateList colorStateListM20564 = this.f5609;
        if (colorStateListM20564 == null) {
            colorStateListM20564 = C7508.m20564(getContext(), C16863.f54515);
        }
        this.f5613.setImageTintList(colorStateListM20564);
        if (m5743()) {
            i = iM20558;
        }
        this.f5635.setImageTintList(ColorStateList.valueOf(i));
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5727(C1626 c1626, ValueAnimator valueAnimator) {
        c1626.f5630 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c1626.m5740();
        c1626.m5746();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m5746() {
        C23255 c23255 = this.f5607;
        if (c23255 != null) {
            c23255.m52307(this.f5610 && (!m5736() || (this.f5633 && this.f5630 == 1.0f)));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m5740() {
        int baseline;
        float f = this.f5618;
        if (f == 0.0f) {
            return;
        }
        float fMin = Math.min(f, TypedValue.applyDimension(2, 12, getResources().getDisplayMetrics()));
        boolean z = this.f5630 == 1.0f;
        float f2 = z ? fMin : this.f5618;
        TextView textView = this.f5628;
        textView.setTextSize(0, f2);
        float f3 = z ? 1.0f : 1.0f - ((1.0f - (fMin / this.f5618)) * this.f5630);
        textView.setPivotX(getLayoutDirection() == 1 ? textView.getWidth() : 0.0f);
        textView.setPivotY(0.0f);
        textView.setScaleX(f3);
        textView.setScaleY(f3);
        C23255 c23255 = this.f5607;
        if (c23255 == null) {
            baseline = C6421.m18182(this.f5604, this.f5623, 2, getPaddingTop() + this.f5596);
        } else {
            baseline = (this.f5607.getBaseline() + c23255.getTop()) - this.f5631;
        }
        textView.setTranslationY((1.0f - this.f5630) * (baseline - textView.getTop()));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float textSize;
        C23255 c23255;
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int iMax = Math.max(0, (defaultSize - getPaddingLeft()) - getPaddingRight());
        C5355 c5355 = this.f5613;
        int visibility = c5355.getVisibility();
        ImageView imageView = this.f5635;
        int iMin = (visibility == 0 || imageView.getVisibility() == 0) ? Math.min(m5752(48), iMax) : 0;
        this.f5599 = iMin;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(m5752(48), 1073741824);
        c5355.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        imageView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        Rect rect = this.f5639;
        int iMax2 = Math.max(0, (iMax - rect.left) - rect.right);
        int iMax3 = Math.max(0, iMax2 - this.f5599);
        int iM5744 = m5744() + rect.bottom;
        C23255 c23256 = this.f5607;
        if (c23256 != null) {
            textSize = c23256.f78066.f18967.getTextSize();
        } else {
            textSize = TypedValue.applyDimension(2, 18, getResources().getDisplayMetrics());
        }
        this.f5618 = textSize;
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        float f = this.f5618;
        TextView textView = this.f5628;
        textView.setTextSize(0, f);
        textView.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        this.f5623 = textView.getMeasuredHeight();
        this.f5631 = textView.getBaseline();
        float fMin = Math.min(1.0f, TypedValue.applyDimension(2, 12, getResources().getDisplayMetrics()) / this.f5618);
        this.f5596 = m5736() ? (int) ((-textView.getPaint().ascent()) * fMin) : 0;
        if (this.f5630 == 1.0f) {
            textView.setTextSize(0, this.f5618 * fMin);
            textView.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        }
        int measuredHeight = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (!m5732(childAt) && childAt != this.f5607 && childAt.getVisibility() != 8) {
                m5725(iMax, i2, getPaddingBottom() + getPaddingTop() + this.f5596 + iM5744, childAt);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                measuredHeight += childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
        }
        TextView textView2 = this.f5621;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight += textView2.getMeasuredHeight();
        }
        this.f5604 = (this.f5599 > 0 || this.f5597 != 0) ? m5752(48) : 0;
        this.f5629 = 0;
        C23255 c23257 = this.f5607;
        if (c23257 != null) {
            c23257.m52295(0);
        }
        C23255 c23258 = this.f5607;
        if (c23258 != null && c23258.getVisibility() != 8) {
            m5725(iMax3, i2, C24579.m54897(getPaddingBottom() + getPaddingTop(), this.f5596, measuredHeight, iM5744), this.f5607);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f5607.getLayoutParams();
            this.f5604 = Math.max(this.f5604, this.f5607.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin + iM5744);
        }
        if (m5736() && this.f5637) {
            this.f5604 = Math.max(this.f5604, this.f5623 + iM5744);
        }
        if (this.f5634 == 0 && (c23255 = this.f5607) != null && c23255.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f5607.getLayoutParams();
            int measuredHeight2 = this.f5607.getMeasuredHeight();
            int i4 = (this.f5604 - measuredHeight2) - marginLayoutParams3.topMargin;
            int i5 = marginLayoutParams3.bottomMargin;
            int i6 = (i4 - i5) - iM5744;
            int i7 = (i6 - (i6 / 2)) + i5;
            Drawable drawable = this.f5632;
            int i8 = C23255.f75338;
            int iMax4 = Math.max(0, i7 + (C1402.m5130(drawable) ? ((C15795) drawable).f51384 : 0));
            this.f5629 = iMax4;
            this.f5607.m52295(iMax4);
            C23255 c23259 = this.f5607;
            c23259.measure(View.MeasureSpec.makeMeasureSpec(c23259.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2 + this.f5629, 1073741824));
        }
        setMeasuredDimension(View.resolveSize(defaultSize, i), View.resolveSize(Math.max(getPaddingBottom() + getPaddingTop() + this.f5596 + this.f5604 + measuredHeight, getSuggestedMinimumHeight()), i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5725(int i, int i2, int i3, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.resolveLayoutDirection(getLayoutDirection());
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i, 1073741824), marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i2, i3 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m5744() {
        C23255 c23255;
        int i = this.f5634;
        Rect rect = this.f5639;
        return (i != 0 || (c23255 = this.f5607) == null) ? rect.top : Math.max(0, rect.top - c23255.m54043());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingLeft2 = getPaddingLeft();
        Rect rect = this.f5639;
        int i5 = paddingLeft2 + rect.left;
        int width = (getWidth() - getPaddingRight()) - rect.right;
        boolean z2 = getLayoutDirection() == 1;
        int i6 = z2 ? this.f5599 + i5 : i5;
        int i7 = z2 ? width : width - this.f5599;
        int paddingTop = getPaddingTop() + this.f5596;
        this.f5617 = this.f5604 + paddingTop;
        this.f5632.setBounds(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), this.f5617);
        C23255 c23255 = this.f5607;
        if (c23255 != null && c23255.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5607.getLayoutParams();
            int measuredHeight = ((((((this.f5604 - (this.f5607.getMeasuredHeight() - this.f5629)) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin) - m5744()) - rect.bottom) / 2) + marginLayoutParams.topMargin + paddingTop + m5744();
            int measuredWidth = z2 ? (i7 - marginLayoutParams.rightMargin) - this.f5607.getMeasuredWidth() : marginLayoutParams.leftMargin + i6;
            C23255 c23256 = this.f5607;
            c23256.layout(measuredWidth, measuredHeight, c23256.getMeasuredWidth() + measuredWidth, this.f5607.getMeasuredHeight() + measuredHeight);
        }
        int paddingLeft3 = z2 ? getPaddingLeft() : (getWidth() - getPaddingRight()) - this.f5599;
        int i8 = this.f5604;
        C5355 c5355 = this.f5613;
        int measuredHeight2 = ((i8 - c5355.getMeasuredHeight()) / 2) + paddingTop;
        c5355.layout(paddingLeft3, measuredHeight2, this.f5599 + paddingLeft3, c5355.getMeasuredHeight() + measuredHeight2);
        int i9 = this.f5599 + paddingLeft3;
        ImageView imageView = this.f5635;
        imageView.layout(paddingLeft3, measuredHeight2, i9, imageView.getMeasuredHeight() + measuredHeight2);
        int paddingTop2 = getPaddingTop();
        int paddingTop3 = getPaddingTop();
        TextView textView = this.f5628;
        textView.layout(i6, paddingTop2, i7, textView.getMeasuredHeight() + paddingTop3);
        m5740();
        int measuredHeight3 = this.f5617;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!m5732(childAt) && childAt != this.f5607 && childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int i11 = measuredHeight3 + marginLayoutParams2.topMargin;
                if (z2) {
                    paddingLeft = ((getWidth() - getPaddingRight()) - marginLayoutParams2.rightMargin) - childAt.getMeasuredWidth();
                } else {
                    paddingLeft = getPaddingLeft() + marginLayoutParams2.leftMargin;
                }
                childAt.layout(paddingLeft, i11, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + i11);
                measuredHeight3 = childAt.getMeasuredHeight() + marginLayoutParams2.bottomMargin + i11;
            }
        }
        TextView textView2 = this.f5621;
        if (textView2.getVisibility() == 0) {
            textView2.layout(i5, measuredHeight3, width, textView2.getMeasuredHeight() + measuredHeight3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5723() {
        Drawable drawable = this.f5632;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        Drawable drawableM52277 = C23255.m52277(getContext(), this.f5634);
        this.f5632 = drawableM52277;
        drawableM52277.setCallback(this);
        this.f5632.getPadding(this.f5639);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f5632 || super.verifyDrawable(drawable);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5632.draw(canvas);
    }

    @Override // android.view.View
    public final int getBaseline() {
        C23255 c23255 = this.f5607;
        if (c23255 == null) {
            return super.getBaseline();
        }
        return this.f5607.getBaseline() + c23255.getTop();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        bundle.putCharSequence(d.O, this.f5619);
        bundle.putBoolean("errorEnabled", this.f5601);
        bundle.putCharSequence(HelperUtils.TAG, this.f5616);
        bundle.putBoolean("helperEnabled", this.f5625);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("parent"));
            this.f5619 = bundle.getCharSequence(d.O);
            this.f5601 = bundle.getBoolean("errorEnabled");
            this.f5616 = bundle.getCharSequence(HelperUtils.TAG);
            this.f5625 = bundle.getBoolean("helperEnabled");
            m5738(false);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        super.dispatchRestoreInstanceState(sparseArray);
        m5738(false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m5752(int i) {
        return Math.round(i * getResources().getDisplayMetrics().density);
    }
}
