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

/* JADX INFO: renamed from: l.ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K51P */
/* JADX INFO: loaded from: classes4.dex */
public final class C17684 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final RectF f58104 = new RectF();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentMapC17249 f58105 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16938 f58108;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public TextPaint f58110;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Context f58112;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final TextView f58116;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f58113 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f58106 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f58109 = -1.0f;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f58114 = -1.0f;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f58107 = -1.0f;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f58115 = new int[0];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f58111 = false;

    public C17684(TextView textView) {
        this.f58116 = textView;
        this.f58112 = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f58108 = new C25144();
        } else if (i >= 23) {
            this.f58108 = new C11717();
        } else {
            this.f58108 = new C16938();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41370(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.f58112;
        int[] iArr = C10401.f33068;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f58116;
        C22666.m51088(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            this.f58113 = typedArrayObtainStyledAttributes.getInt(5, 0);
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
                this.f58115 = m41363(iArr2);
                m41358();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (m41365()) {
            if (this.f58113 == 1) {
                if (!this.f58111) {
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
                    m41362(dimension2, dimension3, dimension);
                }
                m41364();
                return;
            }
            return;
        }
        this.f58113 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41368(int i) {
        if (m41365()) {
            if (i == 0) {
                this.f58113 = 0;
                this.f58114 = -1.0f;
                this.f58107 = -1.0f;
                this.f58109 = -1.0f;
                this.f58115 = new int[0];
                this.f58106 = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(C13645.m33382(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = this.f58112.getResources().getDisplayMetrics();
            m41362(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m41364()) {
                m41366();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41369(int i, int i2, int i3, int i4) {
        if (m41365()) {
            DisplayMetrics displayMetrics = this.f58112.getResources().getDisplayMetrics();
            m41362(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m41364()) {
                m41366();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41371(int[] iArr, int i) {
        if (m41365()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f58112.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f58115 = m41363(iArrCopyOf);
                if (!m41358()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f58111 = false;
            }
            if (m41364()) {
                m41366();
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m41374() {
        return this.f58113;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m41377() {
        return Math.round(this.f58109);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m41372() {
        return Math.round(this.f58114);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m41376() {
        return Math.round(this.f58107);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] m41375() {
        return this.f58115;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m41358() {
        int[] iArr = this.f58115;
        int length = iArr.length;
        boolean z = length > 0;
        this.f58111 = z;
        if (z) {
            this.f58113 = 1;
            this.f58114 = iArr[0];
            this.f58107 = iArr[length - 1];
            this.f58109 = -1.0f;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m41363(int[] iArr) {
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
    private void m41362(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f58113 = 1;
        this.f58114 = f;
        this.f58107 = f2;
        this.f58109 = f3;
        this.f58111 = false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m41364() {
        if (m41365() && this.f58113 == 1) {
            if (!this.f58111 || this.f58115.length == 0) {
                int iFloor = ((int) Math.floor((this.f58107 - this.f58114) / this.f58109)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f58109) + this.f58114);
                }
                this.f58115 = m41363(iArr);
            }
            this.f58106 = true;
        } else {
            this.f58106 = false;
        }
        return this.f58106;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41366() {
        if (m41373()) {
            if (this.f58106) {
                if (this.f58116.getMeasuredHeight() <= 0 || this.f58116.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f58108.mo39915(this.f58116) ? 1048576 : (this.f58116.getMeasuredWidth() - this.f58116.getTotalPaddingLeft()) - this.f58116.getTotalPaddingRight();
                int height = (this.f58116.getHeight() - this.f58116.getCompoundPaddingBottom()) - this.f58116.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f58104;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fM41359 = m41359(rectF);
                    if (fM41359 != this.f58116.getTextSize()) {
                        m41367(fM41359, 0);
                    }
                }
            }
            this.f58106 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41367(float f, int i) {
        Resources resources;
        Context context = this.f58112;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float fApplyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        TextView textView = this.f58116;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f58106 = false;
                try {
                    Method methodM41361 = m41361("nullLayouts");
                    if (methodM41361 != null) {
                        methodM41361.invoke(textView, null);
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
    private int m41359(RectF rectF) {
        StaticLayout staticLayout;
        CharSequence transformation;
        int length = this.f58115.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= i) {
            int i4 = (i2 + i) / 2;
            int i5 = this.f58115[i4];
            TextView textView = this.f58116;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f58110;
            if (textPaint == null) {
                this.f58110 = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f58110.set(textView.getPaint());
            this.f58110.setTextSize(i5);
            Layout.Alignment alignment = (Layout.Alignment) m41360("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = C2023.m6950(charSequence, alignment, iRound, maxLines, textView, this.f58110, this.f58108);
            } else {
                staticLayout = new StaticLayout(charSequence, this.f58110, iRound, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
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
        return this.f58115[i3];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m41360(String str, Object obj, Object obj2) {
        try {
            return m41361(str).invoke(obj, null);
        } catch (Exception unused) {
            return obj2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Method m41361(String str) {
        try {
            ConcurrentMapC17249 concurrentMapC17249 = f58105;
            Method declaredMethod = (Method) concurrentMapC17249.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentMapC17249.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m41373() {
        return m41365() && this.f58113 != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m41365() {
        return !(this.f58116 instanceof C13801);
    }
}
