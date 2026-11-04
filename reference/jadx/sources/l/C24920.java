package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.material.chip.Chip;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.᩻۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes.dex */
public final class C24920 extends AbstractC21936 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f80648 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f80649;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Matrix f80650;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f80651;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C1799 f80652;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float[] f80653;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ColorFilter f80654;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Rect f80655;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f80656;

    public C24920() {
        this.f80656 = true;
        this.f80653 = new float[9];
        this.f80650 = new Matrix();
        this.f80655 = new Rect();
        C1799 c1799 = new C1799();
        c1799.f6140 = null;
        c1799.f6147 = f80648;
        c1799.f6143 = new C5528();
        this.f80652 = c1799;
    }

    public C24920(C1799 c1799) {
        this.f80656 = true;
        this.f80653 = new float[9];
        this.f80650 = new Matrix();
        this.f80655 = new Rect();
        this.f80652 = c1799;
        this.f80651 = m55519(c1799.f6140, c1799.f6147);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PorterDuffColorFilter m55519(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(super.getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f80649 && super.mutate() == this) {
            C1799 c1799 = this.f80652;
            C1799 c17910 = new C1799();
            c17910.f6140 = null;
            c17910.f6147 = f80648;
            if (c1799 != null) {
                c17910.f6138 = c1799.f6138;
                C5528 c5528 = new C5528(c1799.f6143);
                c17910.f6143 = c5528;
                if (c1799.f6143.f19226 != null) {
                    c5528.f19226 = new Paint(c1799.f6143.f19226);
                }
                if (c1799.f6143.f19231 != null) {
                    c17910.f6143.f19231 = new Paint(c1799.f6143.f19231);
                }
                c17910.f6140 = c1799.f6140;
                c17910.f6147 = c1799.f6147;
                c17910.f6137 = c1799.f6137;
            }
            this.f80652 = c17910;
            this.f80649 = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m55520(String str) {
        return this.f80652.f6143.f19232.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f70810 != null && Build.VERSION.SDK_INT >= 24) {
            return new C11493(this.f70810.getConstantState());
        }
        this.f80652.f6138 = getChangingConfigurations();
        return this.f80652;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f80655;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f80654;
        if (colorFilter == null) {
            colorFilter = this.f80651;
        }
        Matrix matrix = this.f80650;
        canvas.getMatrix(matrix);
        float[] fArr = this.f80653;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && C0597.m2701(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C1799 c1799 = this.f80652;
        Bitmap bitmap = c1799.f6146;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c1799.f6146.getHeight()) {
            c1799.f6146 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c1799.f6145 = true;
        }
        if (!this.f80656) {
            C1799 c17910 = this.f80652;
            c17910.f6146.eraseColor(0);
            c17910.f6143.m16445(new Canvas(c17910.f6146), iMin, iMin2);
        } else {
            C1799 c17911 = this.f80652;
            if (c17911.f6145 || c17911.f6142 != c17911.f6140 || c17911.f6141 != c17911.f6147 || c17911.f6139 != c17911.f6137 || c17911.f6144 != c17911.f6143.getRootAlpha()) {
                C1799 c17912 = this.f80652;
                c17912.f6146.eraseColor(0);
                c17912.f6143.m16445(new Canvas(c17912.f6146), iMin, iMin2);
                C1799 c17913 = this.f80652;
                c17913.f6142 = c17913.f6140;
                c17913.f6141 = c17913.f6147;
                c17913.f6144 = c17913.f6143.getRootAlpha();
                c17913.f6139 = c17913.f6137;
                c17913.f6145 = false;
            }
        }
        C1799 c17914 = this.f80652;
        if (c17914.f6143.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c17914.f6136 == null) {
                Paint paint2 = new Paint();
                c17914.f6136 = paint2;
                paint2.setFilterBitmap(true);
            }
            c17914.f6136.setAlpha(c17914.f6143.getRootAlpha());
            c17914.f6136.setColorFilter(colorFilter);
            paint = c17914.f6136;
        }
        canvas.drawBitmap(c17914.f6146, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f80652.f6143.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f80652.f6143.getRootAlpha() != i) {
            this.f80652.f6143.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f80654 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return C0597.m2696(drawable);
        }
        return this.f80654;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            C0597.m2700(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            C0597.m2690(drawable, colorStateList);
            return;
        }
        C1799 c1799 = this.f80652;
        if (c1799.f6140 != colorStateList) {
            c1799.f6140 = colorStateList;
            this.f80651 = m55519(colorStateList, c1799.f6147);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            C0597.m2693(drawable, mode);
            return;
        }
        C1799 c1799 = this.f80652;
        if (c1799.f6147 != mode) {
            c1799.f6147 = mode;
            this.f80651 = m55519(c1799.f6140, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C1799 c1799 = this.f80652;
        if (c1799 == null) {
            return false;
        }
        C5528 c5528 = c1799.f6143;
        if (c5528.f19233 == null) {
            c5528.f19233 = Boolean.valueOf(c5528.f19227.mo36573());
        }
        if (c5528.f19233.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f80652.f6140;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C1799 c1799 = this.f80652;
        ColorStateList colorStateList = c1799.f6140;
        if (colorStateList == null || (mode = c1799.f6147) == null) {
            z = false;
        } else {
            this.f80651 = m55519(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C5528 c5528 = c1799.f6143;
        if (c5528.f19233 == null) {
            c5528.f19233 = Boolean.valueOf(c5528.f19227.mo36573());
        }
        if (c5528.f19233.booleanValue()) {
            boolean zMo36574 = c1799.f6143.f19227.mo36574(iArr);
            c1799.f6145 |= zMo36574;
            if (zMo36574) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f80652.f6143.f19234;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f80652.f6143.f19224;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f70810;
        if (drawable == null) {
            return false;
        }
        C0597.m2694(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f80652.f6137;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f80652.f6137 = z;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24920 m55517(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C24920 c24920 = new C24920();
            c24920.f70810 = C9217.m24392(resources, i, theme);
            new C11493(c24920.f70810.getConstantState());
            return c24920;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return m55518(resources, xml, attributeSetAsAttributeSet, theme);
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24920 m55518(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C24920 c24920 = new C24920();
        c24920.inflate(resources, xmlResourceParser, attributeSet, theme);
        return c24920;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ColorStateList colorStateListM39394;
        int i;
        Drawable drawable = this.f70810;
        if (drawable != null) {
            C0597.m2692(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1799 c1799 = this.f80652;
        c1799.f6143 = new C5528();
        TypedArray typedArrayM8387 = C2506.m8387(resources, theme, attributeSet, C18032.f59046);
        C1799 c17910 = this.f80652;
        C5528 c5528 = c17910.f6143;
        int iM8386 = C2506.m8386(typedArrayM8387, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (iM8386 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iM8386 != 5) {
            if (iM8386 != 9) {
                switch (iM8386) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c17910.f6147 = mode;
        int i2 = 1;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM8387.getValue(1, typedValue);
            int i3 = typedValue.type;
            if (i3 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i3 < 28 || i3 > 31) {
                Resources resources2 = typedArrayM8387.getResources();
                int resourceId = typedArrayM8387.getResourceId(1, 0);
                int i4 = C16676.f53865;
                try {
                    colorStateListM39394 = C16676.m39394(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception unused) {
                    colorStateListM39394 = null;
                }
            } else {
                colorStateListM39394 = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateListM39394 = null;
        }
        if (colorStateListM39394 != null) {
            c17910.f6140 = colorStateListM39394;
        }
        boolean z = c17910.f6137;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "autoMirrored") != null) {
            z = typedArrayM8387.getBoolean(5, z);
        }
        c17910.f6137 = z;
        float f = c5528.f19236;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportWidth") != null) {
            f = typedArrayM8387.getFloat(7, f);
        }
        c5528.f19236 = f;
        float f2 = c5528.f19230;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportHeight") != null) {
            f2 = typedArrayM8387.getFloat(8, f2);
        }
        c5528.f19230 = f2;
        if (c5528.f19236 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM8387.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM8387.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c5528.f19234 = typedArrayM8387.getDimension(3, c5528.f19234);
        float dimension = typedArrayM8387.getDimension(2, c5528.f19224);
        c5528.f19224 = dimension;
        if (c5528.f19234 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM8387.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayM8387.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = c5528.getAlpha();
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "alpha") != null) {
            alpha = typedArrayM8387.getFloat(4, alpha);
        }
        c5528.setAlpha(alpha);
        String string = typedArrayM8387.getString(0);
        if (string != null) {
            c5528.f19237 = string;
            c5528.f19232.put(string, c5528);
        }
        typedArrayM8387.recycle();
        c1799.f6138 = getChangingConfigurations();
        c1799.f6145 = true;
        C1799 c17911 = this.f80652;
        C5528 c5529 = c17911.f6143;
        ArrayDeque arrayDeque = new ArrayDeque();
        C19698 c19698 = c5529.f19227;
        C14307 c14307 = c5529.f19232;
        arrayDeque.push(c19698);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C19698 c19699 = (C19698) arrayDeque.peek();
                i = depth;
                if (MotionUtils.EASING_TYPE_PATH.equals(name)) {
                    C22682 c22682 = new C22682();
                    TypedArray typedArrayM8388 = C2506.m8387(resources, theme, attributeSet, C18032.f59040);
                    if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        String string2 = typedArrayM8388.getString(0);
                        if (string2 != null) {
                            c22682.f41618 = string2;
                        }
                        String string3 = typedArrayM8388.getString(2);
                        if (string3 != null) {
                            c22682.f41619 = C25210.m56210(string3);
                        }
                        c22682.f73655 = C2506.m8389(typedArrayM8388, xmlPullParser, theme, "fillColor", 1);
                        float f3 = c22682.f73656;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillAlpha") != null) {
                            f3 = typedArrayM8388.getFloat(12, f3);
                        }
                        c22682.f73656 = f3;
                        int i5 = xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineCap") != null ? typedArrayM8388.getInt(8, -1) : -1;
                        Paint.Cap cap = c22682.f73648;
                        if (i5 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (i5 == 1) {
                            cap = Paint.Cap.ROUND;
                        } else if (i5 == 2) {
                            cap = Paint.Cap.SQUARE;
                        }
                        c22682.f73648 = cap;
                        int i6 = xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineJoin") != null ? typedArrayM8388.getInt(9, -1) : -1;
                        Paint.Join join = c22682.f73647;
                        if (i6 == 0) {
                            join = Paint.Join.MITER;
                        } else if (i6 == 1) {
                            join = Paint.Join.ROUND;
                        } else if (i6 == 2) {
                            join = Paint.Join.BEVEL;
                        }
                        c22682.f73647 = join;
                        float f4 = c22682.f73649;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeMiterLimit") != null) {
                            f4 = typedArrayM8388.getFloat(10, f4);
                        }
                        c22682.f73649 = f4;
                        c22682.f73650 = C2506.m8389(typedArrayM8388, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = c22682.f73651;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeAlpha") != null) {
                            f5 = typedArrayM8388.getFloat(11, f5);
                        }
                        c22682.f73651 = f5;
                        float f6 = c22682.f73657;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeWidth") != null) {
                            f6 = typedArrayM8388.getFloat(4, f6);
                        }
                        c22682.f73657 = f6;
                        float f7 = c22682.f73653;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathEnd") != null) {
                            f7 = typedArrayM8388.getFloat(6, f7);
                        }
                        c22682.f73653 = f7;
                        float f8 = c22682.f73654;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathOffset") != null) {
                            f8 = typedArrayM8388.getFloat(7, f8);
                        }
                        c22682.f73654 = f8;
                        float f9 = c22682.f73652;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathStart") != null) {
                            f9 = typedArrayM8388.getFloat(5, f9);
                        }
                        c22682.f73652 = f9;
                        int i7 = c22682.f41617;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillType") != null) {
                            i7 = typedArrayM8388.getInt(13, i7);
                        }
                        c22682.f41617 = i7;
                    }
                    typedArrayM8388.recycle();
                    c19699.f63424.add(c22682);
                    if (c22682.getPathName() != null) {
                        c14307.put(c22682.getPathName(), c22682);
                    }
                    c17911.f6138 = c17911.f6138;
                    z2 = false;
                } else if ("clip-path".equals(name)) {
                    C10747 c10747 = new C10747();
                    if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        TypedArray typedArrayM8389 = C2506.m8387(resources, theme, attributeSet, C18032.f59038);
                        String string4 = typedArrayM8389.getString(0);
                        if (string4 != null) {
                            c10747.f41618 = string4;
                        }
                        String string5 = typedArrayM8389.getString(1);
                        if (string5 != null) {
                            c10747.f41619 = C25210.m56210(string5);
                        }
                        c10747.f41617 = !C2506.m8390(xmlPullParser, "fillType") ? 0 : typedArrayM8389.getInt(2, 0);
                        typedArrayM8389.recycle();
                    }
                    c19699.f63424.add(c10747);
                    if (c10747.getPathName() != null) {
                        c14307.put(c10747.getPathName(), c10747);
                    }
                    c17911.f6138 = c17911.f6138;
                } else if ("group".equals(name)) {
                    C19698 c196910 = new C19698();
                    c196910.m45395(resources, xmlPullParser, attributeSet, theme);
                    c19699.f63424.add(c196910);
                    arrayDeque.push(c196910);
                    if (c196910.getGroupName() != null) {
                        c14307.put(c196910.getGroupName(), c196910);
                    }
                    c17911.f6138 = c17911.f6138;
                }
            } else {
                i = depth;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i2 = 1;
            depth = i;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.f80651 = m55519(c1799.f6140, c1799.f6147);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55521() {
        this.f80656 = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f80652.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
