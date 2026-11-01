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

/* JADX INFO: renamed from: l.ۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: U50M */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnClickListenerC6772 extends C22357 implements InterfaceC0858, View.OnClickListener, InterfaceC22109 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Drawable f22865;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f22866;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC3949 f22867;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC16651 f22868;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f22869;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f22870;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23707 f22871;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f22872;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractViewOnTouchListenerC9658 f22873;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f22874;

    @Override // l.InterfaceC0858
    public final boolean prefersCondensedTitle() {
        return true;
    }

    public ViewOnClickListenerC6772(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewOnClickListenerC6772(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f22870 = m18380();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12108.f40524, i, 0);
        this.f22866 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f22872 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f22874 = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f22870 = m18380();
        m18379();
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m18380() {
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
        this.f22874 = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // l.InterfaceC0858
    public final C23707 getItemData() {
        return this.f22871;
    }

    @Override // l.InterfaceC0858
    public final void initialize(C23707 c23707, int i) {
        this.f22871 = c23707;
        Drawable icon = c23707.getIcon();
        this.f22865 = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i2 = this.f22872;
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
        m18379();
        this.f22869 = c23707.m52171(this);
        m18379();
        setId(c23707.getItemId());
        setVisibility(c23707.isVisible() ? 0 : 8);
        setEnabled(c23707.isEnabled());
        if (c23707.hasSubMenu() && this.f22873 == null) {
            this.f22873 = new C13123(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC9658 abstractViewOnTouchListenerC9658;
        if (this.f22871.hasSubMenu() && (abstractViewOnTouchListenerC9658 = this.f22873) != null && abstractViewOnTouchListenerC9658.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC16651 interfaceC16651 = this.f22868;
        if (interfaceC16651 != null) {
            interfaceC16651.mo26120(this.f22871);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18382(InterfaceC16651 interfaceC16651) {
        this.f22868 = interfaceC16651;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18381(AbstractC3949 abstractC3949) {
        this.f22867 = abstractC3949;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m18379() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f22869);
        if (this.f22865 != null && (!this.f22871.m52181() || !this.f22870)) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f22869 : null);
        CharSequence contentDescription = this.f22871.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f22871.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f22871.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C18933.m43611(this, z3 ? null : this.f22871.getTitle());
        } else {
            C18933.m43611(this, tooltipText);
        }
    }

    @Override // l.C22357, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f22874) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f22866;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f22865 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f22865.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // l.InterfaceC22109
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8866() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.InterfaceC22109
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo8867() {
        return !TextUtils.isEmpty(getText()) && this.f22871.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
