package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/* JADX INFO: renamed from: l.ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U50M */
/* JADX INFO: loaded from: classes5.dex */
public class ViewOnClickListenerC16611 extends C5752 implements InterfaceC1586, View.OnClickListener, InterfaceC5599 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C8407 f53719;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC24817 f53720;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public CharSequence f53721;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC18849 f53722;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f53723;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f53724;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f53725;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Drawable f53726;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f53727;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractViewOnTouchListenerC5028 f53728;

    @Override // l.InterfaceC1586
    public final boolean prefersCondensedTitle() {
        return true;
    }

    public ViewOnClickListenerC16611(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewOnClickListenerC16611(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f53725 = m39300();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10401.f33067, i, 0);
        this.f53724 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f53727 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f53723 = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f53725 = m39300();
        m39301();
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m39300() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f53723 = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // l.InterfaceC1586
    public final C8407 getItemData() {
        return this.f53719;
    }

    @Override // l.InterfaceC1586
    public final void initialize(C8407 c8407, int i) {
        this.f53719 = c8407;
        Drawable icon = c8407.getIcon();
        this.f53726 = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i2 = this.f53727;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(icon, null, null, null);
        m39301();
        this.f53721 = c8407.m22587(this);
        m39301();
        setId(c8407.getItemId());
        setVisibility(c8407.isVisible() ? 0 : 8);
        setEnabled(c8407.isEnabled());
        if (c8407.hasSubMenu() && this.f53728 == null) {
            this.f53728 = new C11390(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC5028 abstractViewOnTouchListenerC5028;
        if (this.f53719.hasSubMenu() && (abstractViewOnTouchListenerC5028 = this.f53728) != null && abstractViewOnTouchListenerC5028.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC18849 interfaceC18849 = this.f53722;
        if (interfaceC18849 != null) {
            interfaceC18849.mo12636(this.f53719);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39302(InterfaceC18849 interfaceC18849) {
        this.f53722 = interfaceC18849;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39303(AbstractC24817 abstractC24817) {
        this.f53720 = abstractC24817;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m39301() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f53721);
        if (this.f53726 != null && (!this.f53719.m22596() || !this.f53725)) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f53721 : null);
        CharSequence contentDescription = this.f53719.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f53719.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f53719.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C6696.m18717(this, z3 ? null : this.f53719.getTitle());
        } else {
            C6696.m18717(this, tooltipText);
        }
    }

    @Override // l.C5752, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f53723) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f53724;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f53726 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f53726.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // l.InterfaceC5599
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16579() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.InterfaceC5599
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo16580() {
        return !TextUtils.isEmpty(getText()) && this.f53719.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
