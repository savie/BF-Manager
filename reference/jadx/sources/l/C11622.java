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

/* JADX INFO: renamed from: l.ۨۢܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5V7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC13033
public class C11622 extends ViewGroup {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f39036 = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f39037 = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f39038;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f39039;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public WeakReference f39040;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C19383 f39041;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f39042;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public TextView f39043;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f39044;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f39045;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public TextView f39046;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f39047;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4565 f39048;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f39049;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f39050;

    public C11622(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39038 = -1;
        this.f39047 = -1.0f;
        this.f39048 = new C4565(this);
        TextView textView = new TextView(context);
        this.f39043 = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f39046 = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f39044 = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f39036);
        boolean z = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C16407.m38617(textView, resourceId);
            C16407.m38617(textView2, resourceId);
            C16407.m38617(textView3, resourceId);
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
        this.f39049 = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        int defaultColor = textView2.getTextColors().getDefaultColor();
        this.f39045 = defaultColor;
        int i = (defaultColor & 16777215) | ((((int) 153.0f) & 255) << 24);
        textView.setTextColor(i);
        textView3.setTextColor(i);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setEllipsize(truncateAt);
        textView3.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f39037);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z) {
            textView.setTransformationMethod(new C13739(textView.getContext()));
            textView2.setTransformationMethod(new C13739(textView2.getContext()));
            textView3.setTransformationMethod(new C13739(textView3.getContext()));
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.f39050 = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m28963(int i) {
        this.f39050 = i;
        requestLayout();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m28966() {
        return this.f39050;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof C19383)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        C19383 c19383 = (C19383) parent;
        AbstractC14217 abstractC14217 = c19383.f62507;
        C4565 c4565 = this.f39048;
        c19383.m44428(c4565);
        c19383.m44421((InterfaceC15150) c4565);
        this.f39041 = c19383;
        WeakReference weakReference = this.f39040;
        m28965(weakReference != null ? (AbstractC14217) weakReference.get() : null, abstractC14217);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C19383 c19383 = this.f39041;
        if (c19383 != null) {
            m28965(c19383.f62507, (AbstractC14217) null);
            this.f39041.m44428((InterfaceC21499) null);
            this.f39041.m44431((InterfaceC15150) this.f39048);
            this.f39041 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28964(int i, AbstractC14217 abstractC14217) {
        int iMo4245 = abstractC14217 != null ? abstractC14217.mo4245() : 0;
        this.f39042 = true;
        CharSequence charSequenceMo4241 = null;
        CharSequence charSequenceMo4242 = (i < 1 || abstractC14217 == null) ? null : abstractC14217.mo4241(i - 1);
        TextView textView = this.f39043;
        textView.setText(charSequenceMo4242);
        CharSequence charSequenceMo4243 = (abstractC14217 == null || i >= iMo4245) ? null : abstractC14217.mo4241(i);
        TextView textView2 = this.f39046;
        textView2.setText(charSequenceMo4243);
        int i2 = i + 1;
        if (i2 < iMo4245 && abstractC14217 != null) {
            charSequenceMo4241 = abstractC14217.mo4241(i2);
        }
        TextView textView3 = this.f39044;
        textView3.setText(charSequenceMo4241);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f39038 = i;
        if (!this.f39039) {
            mo8750(this.f39047, false, i);
        }
        this.f39042 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f39042) {
            return;
        }
        super.requestLayout();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28965(AbstractC14217 abstractC14217, AbstractC14217 abstractC14218) {
        C4565 c4565 = this.f39048;
        if (abstractC14217 != null) {
            abstractC14217.m34323(c4565);
            this.f39040 = null;
        }
        if (abstractC14218 != null) {
            abstractC14218.m34319((DataSetObserver) c4565);
            this.f39040 = new WeakReference(abstractC14218);
        }
        C19383 c19383 = this.f39041;
        if (c19383 != null) {
            this.f39038 = -1;
            this.f39047 = -1.0f;
            m28964(c19383.f62481, abstractC14218);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo8750(float f, boolean z, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.f39038) {
            m28964(i, this.f39041.f62507);
        } else if (!z && f == this.f39047) {
            return;
        }
        this.f39039 = true;
        TextView textView = this.f39043;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.f39046;
        int measuredWidth2 = textView2.getMeasuredWidth();
        TextView textView3 = this.f39044;
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
        int i14 = this.f39049 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
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
            int iMin = Math.min(paddingLeft, (i9 - this.f39050) - measuredWidth);
            textView.layout(iMin, i3, measuredWidth + iMin, textView.getMeasuredHeight() + i3);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f39050);
            textView3.layout(iMax3, i5, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
            this.f39047 = f;
            this.f39039 = false;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
        int iMin2 = Math.min(paddingLeft, (i9 - this.f39050) - measuredWidth);
        textView.layout(iMin2, i3, measuredWidth + iMin2, textView.getMeasuredHeight() + i3);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f39050);
        textView3.layout(iMax4, i5, iMax4 + measuredWidth3, textView3.getMeasuredHeight() + i5);
        this.f39047 = f;
        this.f39039 = false;
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
        this.f39043.measure(childMeasureSpec2, childMeasureSpec);
        TextView textView = this.f39046;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.f39044.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i2);
        } else {
            iMax = Math.max(mo8749(), textView.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i2, textView.getMeasuredState() << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f39041 != null) {
            float f = this.f39047;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo8750(f, true, this.f39038);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo8749() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }
}
