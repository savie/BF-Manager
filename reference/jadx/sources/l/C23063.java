package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K51P */
/* JADX INFO: loaded from: classes.dex */
public final class C23063 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final RectF f74922 = new RectF();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentMapC13783 f74923 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public TextPaint f74929;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C6834 f74931;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Context f74933;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final TextView f74934;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f74928 = 0;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f74926 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f74930 = -1.0f;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f74932 = -1.0f;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f74927 = -1.0f;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int[] f74925 = new int[0];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f74924 = false;

    public C23063(TextView textView) {
        this.f74934 = textView;
        this.f74933 = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f74931 = new C4011();
        } else if (i >= 23) {
            this.f74931 = new C13185();
        } else {
            this.f74931 = new C6834();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51027(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.f74933;
        int[] iArr = C12108.f40518;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f74934;
        C5031.m13983(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            this.f74928 = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr2 = new int[length];
            if (length > 0) {
                for (int i2 = 0; i2 < length; i2++) {
                    iArr2[i2] = typedArrayObtainTypedArray.getDimensionPixelSize(i2, -1);
                }
                this.f74925 = m51018(iArr2);
                m51013();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (m51019()) {
            if (this.f74928 == 1) {
                if (!this.f74924) {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    m51017(dimension2, dimension3, dimension);
                }
                m51020();
                return;
            }
            return;
        }
        this.f74928 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51025(int i) {
        if (m51019()) {
            if (i == 0) {
                this.f74928 = 0;
                this.f74932 = -1.0f;
                this.f74927 = -1.0f;
                this.f74930 = -1.0f;
                this.f74925 = new int[0];
                this.f74926 = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(C8479.m22141(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = this.f74933.getResources().getDisplayMetrics();
            m51017(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m51020()) {
                m51023();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51026(int i, int i2, int i3, int i4) {
        if (m51019()) {
            DisplayMetrics displayMetrics = this.f74933.getResources().getDisplayMetrics();
            m51017(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m51020()) {
                m51023();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51028(int[] iArr, int i) {
        if (m51019()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f74933.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f74925 = m51018(iArrCopyOf);
                if (!m51013()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f74924 = false;
            }
            if (m51020()) {
                m51023();
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m51032() {
        return this.f74928;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m51022() {
        return Math.round(this.f74930);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m51030() {
        return Math.round(this.f74932);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m51031() {
        return Math.round(this.f74927);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] m51029() {
        return this.f74925;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private boolean m51013() {
        int[] iArr = this.f74925;
        int length = iArr.length;
        boolean z = length > 0;
        this.f74924 = z;
        if (z) {
            this.f74928 = 1;
            this.f74932 = iArr[0];
            this.f74927 = iArr[length - 1];
            this.f74930 = -1.0f;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m51018(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51017(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f74928 = 1;
        this.f74932 = f;
        this.f74927 = f2;
        this.f74930 = f3;
        this.f74924 = false;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m51020() {
        if (m51019() && this.f74928 == 1) {
            if (!this.f74924 || this.f74925.length == 0) {
                int iFloor = ((int) Math.floor((this.f74927 - this.f74932) / this.f74930)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f74930) + this.f74932);
                }
                this.f74925 = m51018(iArr);
            }
            this.f74926 = true;
        } else {
            this.f74926 = false;
        }
        return this.f74926;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51023() {
        if (m51021()) {
            if (this.f74926) {
                if (this.f74934.getMeasuredHeight() <= 0 || this.f74934.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f74931.mo11518(this.f74934) ? 1048576 : (this.f74934.getMeasuredWidth() - this.f74934.getTotalPaddingLeft()) - this.f74934.getTotalPaddingRight();
                int height = (this.f74934.getHeight() - this.f74934.getCompoundPaddingBottom()) - this.f74934.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f74922;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fM51014 = m51014(rectF);
                    if (fM51014 != this.f74934.getTextSize()) {
                        m51024(fM51014, 0);
                    }
                }
            }
            this.f74926 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51024(float f, int i) {
        Resources resources;
        Context context = this.f74933;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float fApplyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        TextView textView = this.f74934;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f74926 = false;
                try {
                    Method methodM51016 = m51016("nullLayouts");
                    if (methodM51016 != null) {
                        methodM51016.invoke(textView, null);
                    }
                } catch (Exception unused) {
                }
                if (!zIsInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m51014(RectF rectF) {
        StaticLayout staticLayout;
        CharSequence transformation;
        int length = this.f74925.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= i) {
            int i4 = (i2 + i) / 2;
            int i5 = this.f74925[i4];
            TextView textView = this.f74934;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f74929;
            if (textPaint == null) {
                this.f74929 = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f74929.set(textView.getPaint());
            this.f74929.setTextSize(i5);
            Layout.Alignment alignment = (Layout.Alignment) m51015("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = C1189.m4358(charSequence, alignment, iRound, maxLines, textView, this.f74929, this.f74931);
            } else {
                staticLayout = new StaticLayout(charSequence, this.f74929, iRound, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
            }
            if ((maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == charSequence.length())) && staticLayout.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i3 = i2;
                i2 = i6;
            } else {
                i3 = i4 - 1;
                i = i3;
            }
        }
        return this.f74925[i3];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m51015(String str, Object obj, Object obj2) {
        try {
            return m51016(str).invoke(obj, null);
        } catch (Exception unused) {
            return obj2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Method m51016(String str) {
        try {
            ConcurrentMapC13783 concurrentMapC13783 = f74923;
            Method declaredMethod = (Method) concurrentMapC13783.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentMapC13783.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m51021() {
        return m51019() && this.f74928 != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m51019() {
        return !(this.f74934 instanceof C1647);
    }
}
