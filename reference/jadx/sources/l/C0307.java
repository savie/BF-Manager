package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֡۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I5V7 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC9255
public class C0307 extends ViewGroup {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f1638 = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f1639 = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f1640;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public TextView f1641;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f1642;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f1643;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f1644;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f1645;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f1646;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15179 f1647;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public WeakReference f1648;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public TextView f1649;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f1650;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21190 f1651;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f1652;

    public C0307(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1650 = -1;
        this.f1640 = -1.0f;
        this.f1651 = new C21190(this);
        TextView textView = new TextView(context);
        this.f1641 = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f1649 = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f1644 = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1638);
        boolean z = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C18085.m42126(textView, resourceId);
            C18085.m42126(textView2, resourceId);
            C18085.m42126(textView3, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f = dimensionPixelSize;
            textView.setTextSize(0, f);
            textView2.setTextSize(0, f);
            textView3.setTextSize(0, f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        this.f1652 = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        int defaultColor = textView2.getTextColors().getDefaultColor();
        this.f1642 = defaultColor;
        int i = (defaultColor & 16777215) | ((((int) 153.0f) & 255) << 24);
        textView.setTextColor(i);
        textView3.setTextColor(i);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setEllipsize(truncateAt);
        textView3.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f1639);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z) {
            textView.setTransformationMethod(new C18206(textView.getContext()));
            textView2.setTransformationMethod(new C18206(textView2.getContext()));
            textView3.setTransformationMethod(new C18206(textView3.getContext()));
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.f1646 = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m1891(int i) {
        this.f1646 = i;
        requestLayout();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m1894() {
        return this.f1646;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof C15179)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        C15179 c15179 = (C15179) parent;
        AbstractC6274 abstractC6274 = c15179.f49541;
        C21190 c21190 = this.f1651;
        c15179.m36519(c21190);
        c15179.m36515((InterfaceC13730) c21190);
        this.f1647 = c15179;
        WeakReference weakReference = this.f1648;
        m1893(weakReference != null ? (AbstractC6274) weakReference.get() : null, abstractC6274);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C15179 c15179 = this.f1647;
        if (c15179 != null) {
            m1893(c15179.f49541, (AbstractC6274) null);
            this.f1647.m36519((InterfaceC4739) null);
            this.f1647.m36526((InterfaceC13730) this.f1651);
            this.f1647 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1892(int i, AbstractC6274 abstractC6274) {
        int iMo3000 = abstractC6274 != null ? abstractC6274.mo3000() : 0;
        this.f1643 = true;
        CharSequence charSequenceMo2996 = null;
        CharSequence charSequenceMo2997 = (i < 1 || abstractC6274 == null) ? null : abstractC6274.mo2996(i - 1);
        TextView textView = this.f1641;
        textView.setText(charSequenceMo2997);
        CharSequence charSequenceMo2998 = (abstractC6274 == null || i >= iMo3000) ? null : abstractC6274.mo2996(i);
        TextView textView2 = this.f1649;
        textView2.setText(charSequenceMo2998);
        int i2 = i + 1;
        if (i2 < iMo3000 && abstractC6274 != null) {
            charSequenceMo2996 = abstractC6274.mo2996(i2);
        }
        TextView textView3 = this.f1644;
        textView3.setText(charSequenceMo2996);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f1650 = i;
        if (!this.f1645) {
            mo1890(this.f1640, false, i);
        }
        this.f1643 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1643) {
            return;
        }
        super.requestLayout();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1893(AbstractC6274 abstractC6274, AbstractC6274 abstractC6275) {
        C21190 c21190 = this.f1651;
        if (abstractC6274 != null) {
            abstractC6274.m17947(c21190);
            this.f1648 = null;
        }
        if (abstractC6275 != null) {
            abstractC6275.m17943((DataSetObserver) c21190);
            this.f1648 = new WeakReference(abstractC6275);
        }
        C15179 c15179 = this.f1647;
        if (c15179 != null) {
            this.f1650 = -1;
            this.f1640 = -1.0f;
            m1892(c15179.f49522, abstractC6275);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo1890(float f, boolean z, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.f1650) {
            m1892(i, this.f1647.f49541);
        } else if (!z && f == this.f1640) {
            return;
        }
        this.f1645 = true;
        TextView textView = this.f1641;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.f1649;
        int measuredWidth2 = textView2.getMeasuredWidth();
        TextView textView3 = this.f1644;
        int measuredWidth3 = textView3.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = f + 0.5f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = textView.getBaseline();
        int baseline2 = textView2.getBaseline();
        int baseline3 = textView3.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = iMax - baseline;
        int i12 = iMax - baseline2;
        int i13 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(textView.getMeasuredHeight() + i11, textView2.getMeasuredHeight() + i12), textView3.getMeasuredHeight() + i13);
        int i14 = this.f1652 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        if (i14 == 16) {
            i2 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        } else {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
            } else {
                i2 = (height - paddingBottom) - iMax2;
            }
            textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
            int iMin = Math.min(paddingLeft, (i9 - this.f1646) - measuredWidth);
            textView.layout(iMin, i3, measuredWidth + iMin, textView.getMeasuredHeight() + i3);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f1646);
            textView3.layout(iMax3, i5, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
            this.f1640 = f;
            this.f1645 = false;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
        int iMin2 = Math.min(paddingLeft, (i9 - this.f1646) - measuredWidth);
        textView.layout(iMin2, i3, measuredWidth + iMin2, textView.getMeasuredHeight() + i3);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f1646);
        textView3.layout(iMax4, i5, iMax4 + measuredWidth3, textView3.getMeasuredHeight() + i5);
        this.f1640 = f;
        this.f1645 = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.f1641.measure(childMeasureSpec2, childMeasureSpec);
        TextView textView = this.f1649;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.f1644.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i2);
        } else {
            iMax = Math.max(mo1889(), textView.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i2, textView.getMeasuredState() << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1647 != null) {
            float f = this.f1640;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo1890(f, true, this.f1650);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo1889() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }
}
