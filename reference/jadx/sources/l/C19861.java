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

/* JADX INFO: renamed from: l.᩶֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19861 extends AbstractC17743 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f63696 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ColorFilter f63697;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final float[] f63698;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Matrix f63699;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f63700;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f63701;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Rect f63702;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f63703;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C20566 f63704;

    public C19861() {
        this.f63703 = true;
        this.f63698 = new float[9];
        this.f63699 = new Matrix();
        this.f63702 = new Rect();
        C20566 c20566 = new C20566();
        c20566.f67022 = null;
        c20566.f67028 = f63696;
        c20566.f67026 = new C7160();
        this.f63704 = c20566;
    }

    public C19861(C20566 c20566) {
        this.f63703 = true;
        this.f63698 = new float[9];
        this.f63699 = new Matrix();
        this.f63702 = new Rect();
        this.f63704 = c20566;
        this.f63700 = m45107(c20566.f67022, c20566.f67028);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PorterDuffColorFilter m45107(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(super.getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f63701 && super.mutate() == this) {
            C20566 c20566 = this.f63704;
            C20566 c20567 = new C20566();
            c20567.f67022 = null;
            c20567.f67028 = f63696;
            if (c20566 != null) {
                c20567.f67024 = c20566.f67024;
                C7160 c7160 = new C7160(c20566.f67026);
                c20567.f67026 = c7160;
                if (c20566.f67026.f23933 != null) {
                    c7160.f23933 = new Paint(c20566.f67026.f23933);
                }
                if (c20566.f67026.f23936 != null) {
                    c20567.f67026.f23936 = new Paint(c20566.f67026.f23936);
                }
                c20567.f67022 = c20566.f67022;
                c20567.f67028 = c20566.f67028;
                c20567.f67020 = c20566.f67020;
            }
            this.f63704 = c20567;
            this.f63701 = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m45108(String str) {
        return this.f63704.f67026.f23939.getOrDefault(str, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f56306 != null && Build.VERSION.SDK_INT >= 24) {
            return new C15628(this.f56306.getConstantState());
        }
        this.f63704.f67024 = getChangingConfigurations();
        return this.f63704;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f63702;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f63697;
        if (colorFilter == null) {
            colorFilter = this.f63700;
        }
        Matrix matrix = this.f63699;
        canvas.getMatrix(matrix);
        float[] fArr = this.f63698;
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
        if (isAutoMirrored() && C7603.m20126(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C20566 c20566 = this.f63704;
        Bitmap bitmap = c20566.f67018;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c20566.f67018.getHeight()) {
            c20566.f67018 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c20566.f67025 = true;
        }
        if (!this.f63703) {
            C20566 c20567 = this.f63704;
            c20567.f67018.eraseColor(0);
            c20567.f67026.m19079(new Canvas(c20567.f67018), iMin, iMin2);
        } else {
            C20566 c20568 = this.f63704;
            if (c20568.f67025 || c20568.f67027 != c20568.f67022 || c20568.f67017 != c20568.f67028 || c20568.f67023 != c20568.f67020 || c20568.f67021 != c20568.f67026.getRootAlpha()) {
                C20566 c20569 = this.f63704;
                c20569.f67018.eraseColor(0);
                c20569.f67026.m19079(new Canvas(c20569.f67018), iMin, iMin2);
                C20566 c205610 = this.f63704;
                c205610.f67027 = c205610.f67022;
                c205610.f67017 = c205610.f67028;
                c205610.f67021 = c205610.f67026.getRootAlpha();
                c205610.f67023 = c205610.f67020;
                c205610.f67025 = false;
            }
        }
        C20566 c205611 = this.f63704;
        if (c205611.f67026.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c205611.f67019 == null) {
                Paint paint2 = new Paint();
                c205611.f67019 = paint2;
                paint2.setFilterBitmap(true);
            }
            c205611.f67019.setAlpha(c205611.f67026.getRootAlpha());
            c205611.f67019.setColorFilter(colorFilter);
            paint = c205611.f67019;
        }
        canvas.drawBitmap(c205611.f67018, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f63704.f67026.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f63704.f67026.getRootAlpha() != i) {
            this.f63704.f67026.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f63697 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return C7603.m20136(drawable);
        }
        return this.f63697;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            C7603.m20138(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            C7603.m20129(drawable, colorStateList);
            return;
        }
        C20566 c20566 = this.f63704;
        if (c20566.f67022 != colorStateList) {
            c20566.f67022 = colorStateList;
            this.f63700 = m45107(colorStateList, c20566.f67028);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            C7603.m20132(drawable, mode);
            return;
        }
        C20566 c20566 = this.f63704;
        if (c20566.f67028 != mode) {
            c20566.f67028 = mode;
            this.f63700 = m45107(c20566.f67022, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C20566 c20566 = this.f63704;
        if (c20566 == null) {
            return false;
        }
        C7160 c7160 = c20566.f67026;
        if (c7160.f23931 == null) {
            c7160.f23931 = Boolean.valueOf(c7160.f23932.mo20764());
        }
        if (c7160.f23931.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f63704.f67022;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C20566 c20566 = this.f63704;
        ColorStateList colorStateList = c20566.f67022;
        if (colorStateList == null || (mode = c20566.f67028) == null) {
            z = false;
        } else {
            this.f63700 = m45107(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C7160 c7160 = c20566.f67026;
        if (c7160.f23931 == null) {
            c7160.f23931 = Boolean.valueOf(c7160.f23932.mo20764());
        }
        if (c7160.f23931.booleanValue()) {
            boolean zMo20765 = c20566.f67026.f23932.mo20765(iArr);
            c20566.f67025 |= zMo20765;
            if (zMo20765) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f63704.f67026.f23935;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f63704.f67026.f23930;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f56306;
        if (drawable == null) {
            return false;
        }
        C7603.m20133(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f63704.f67020;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f63704.f67020 = z;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19861 m45105(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C19861 c19861 = new C19861();
            c19861.f56306 = C16631.m39101(resources, i, theme);
            new C15628(c19861.f56306.getConstantState());
            return c19861;
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
            return m45106(resources, xml, attributeSetAsAttributeSet, theme);
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19861 m45106(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C19861 c19861 = new C19861();
        c19861.inflate(resources, xmlResourceParser, attributeSet, theme);
        return c19861;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ColorStateList colorStateListM49440;
        int i;
        Drawable drawable = this.f56306;
        if (drawable != null) {
            C7603.m20131(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C20566 c20566 = this.f63704;
        c20566.f67026 = new C7160();
        TypedArray typedArrayM30834 = C12398.m30834(resources, theme, attributeSet, C13511.f44634);
        C20566 c20567 = this.f63704;
        C7160 c7160 = c20567.f67026;
        int iM30833 = C12398.m30833(typedArrayM30834, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (iM30833 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iM30833 != 5) {
            if (iM30833 != 9) {
                switch (iM30833) {
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
        c20567.f67028 = mode;
        int i2 = 1;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM30834.getValue(1, typedValue);
            int i3 = typedValue.type;
            if (i3 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i3 < 28 || i3 > 31) {
                Resources resources2 = typedArrayM30834.getResources();
                int resourceId = typedArrayM30834.getResourceId(1, 0);
                int i4 = C22275.f72789;
                try {
                    colorStateListM49440 = C22275.m49440(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception unused) {
                    colorStateListM49440 = null;
                }
            } else {
                colorStateListM49440 = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateListM49440 = null;
        }
        if (colorStateListM49440 != null) {
            c20567.f67022 = colorStateListM49440;
        }
        boolean z = c20567.f67020;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "autoMirrored") != null) {
            z = typedArrayM30834.getBoolean(5, z);
        }
        c20567.f67020 = z;
        float f = c7160.f23938;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportWidth") != null) {
            f = typedArrayM30834.getFloat(7, f);
        }
        c7160.f23938 = f;
        float f2 = c7160.f23937;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportHeight") != null) {
            f2 = typedArrayM30834.getFloat(8, f2);
        }
        c7160.f23937 = f2;
        if (c7160.f23938 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM30834.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM30834.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c7160.f23935 = typedArrayM30834.getDimension(3, c7160.f23935);
        float dimension = typedArrayM30834.getDimension(2, c7160.f23930);
        c7160.f23930 = dimension;
        if (c7160.f23935 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM30834.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayM30834.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = c7160.getAlpha();
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "alpha") != null) {
            alpha = typedArrayM30834.getFloat(4, alpha);
        }
        c7160.setAlpha(alpha);
        String string = typedArrayM30834.getString(0);
        if (string != null) {
            c7160.f23941 = string;
            c7160.f23939.put(string, c7160);
        }
        typedArrayM30834.recycle();
        c20566.f67024 = getChangingConfigurations();
        c20566.f67025 = true;
        C20566 c20568 = this.f63704;
        C7160 c7161 = c20568.f67026;
        ArrayDeque arrayDeque = new ArrayDeque();
        C19155 c19155 = c7161.f23932;
        C21445 c21445 = c7161.f23939;
        arrayDeque.push(c19155);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C19155 c19156 = (C19155) arrayDeque.peek();
                i = depth;
                if (MotionUtils.EASING_TYPE_PATH.equals(name)) {
                    C7866 c7866 = new C7866();
                    TypedArray typedArrayM30835 = C12398.m30834(resources, theme, attributeSet, C13511.f44629);
                    if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        String string2 = typedArrayM30835.getString(0);
                        if (string2 != null) {
                            c7866.f34114 = string2;
                        }
                        String string3 = typedArrayM30835.getString(2);
                        if (string3 != null) {
                            c7866.f34115 = C22420.m49741(string3);
                        }
                        c7866.f25889 = C12398.m30836(typedArrayM30835, xmlPullParser, theme, "fillColor", 1);
                        float f3 = c7866.f25887;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillAlpha") != null) {
                            f3 = typedArrayM30835.getFloat(12, f3);
                        }
                        c7866.f25887 = f3;
                        int i5 = xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineCap") != null ? typedArrayM30835.getInt(8, -1) : -1;
                        Paint.Cap cap = c7866.f25891;
                        if (i5 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (i5 == 1) {
                            cap = Paint.Cap.ROUND;
                        } else if (i5 == 2) {
                            cap = Paint.Cap.SQUARE;
                        }
                        c7866.f25891 = cap;
                        int i6 = xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineJoin") != null ? typedArrayM30835.getInt(9, -1) : -1;
                        Paint.Join join = c7866.f25888;
                        if (i6 == 0) {
                            join = Paint.Join.MITER;
                        } else if (i6 == 1) {
                            join = Paint.Join.ROUND;
                        } else if (i6 == 2) {
                            join = Paint.Join.BEVEL;
                        }
                        c7866.f25888 = join;
                        float f4 = c7866.f25890;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeMiterLimit") != null) {
                            f4 = typedArrayM30835.getFloat(10, f4);
                        }
                        c7866.f25890 = f4;
                        c7866.f25886 = C12398.m30836(typedArrayM30835, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = c7866.f25895;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeAlpha") != null) {
                            f5 = typedArrayM30835.getFloat(11, f5);
                        }
                        c7866.f25895 = f5;
                        float f6 = c7866.f25896;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeWidth") != null) {
                            f6 = typedArrayM30835.getFloat(4, f6);
                        }
                        c7866.f25896 = f6;
                        float f7 = c7866.f25892;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathEnd") != null) {
                            f7 = typedArrayM30835.getFloat(6, f7);
                        }
                        c7866.f25892 = f7;
                        float f8 = c7866.f25894;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathOffset") != null) {
                            f8 = typedArrayM30835.getFloat(7, f8);
                        }
                        c7866.f25894 = f8;
                        float f9 = c7866.f25893;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathStart") != null) {
                            f9 = typedArrayM30835.getFloat(5, f9);
                        }
                        c7866.f25893 = f9;
                        int i7 = c7866.f34113;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillType") != null) {
                            i7 = typedArrayM30835.getInt(13, i7);
                        }
                        c7866.f34113 = i7;
                    }
                    typedArrayM30835.recycle();
                    c19156.f61878.add(c7866);
                    if (c7866.getPathName() != null) {
                        c21445.put(c7866.getPathName(), c7866);
                    }
                    c20568.f67024 = c20568.f67024;
                    z2 = false;
                } else if ("clip-path".equals(name)) {
                    C18449 c18449 = new C18449();
                    if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        TypedArray typedArrayM30836 = C12398.m30834(resources, theme, attributeSet, C13511.f44631);
                        String string4 = typedArrayM30836.getString(0);
                        if (string4 != null) {
                            c18449.f34114 = string4;
                        }
                        String string5 = typedArrayM30836.getString(1);
                        if (string5 != null) {
                            c18449.f34115 = C22420.m49741(string5);
                        }
                        c18449.f34113 = !C12398.m30837(xmlPullParser, "fillType") ? 0 : typedArrayM30836.getInt(2, 0);
                        typedArrayM30836.recycle();
                    }
                    c19156.f61878.add(c18449);
                    if (c18449.getPathName() != null) {
                        c21445.put(c18449.getPathName(), c18449);
                    }
                    c20568.f67024 = c20568.f67024;
                } else if ("group".equals(name)) {
                    C19155 c19157 = new C19155();
                    c19157.m43968(resources, xmlPullParser, attributeSet, theme);
                    c19156.f61878.add(c19157);
                    arrayDeque.push(c19157);
                    if (c19157.getGroupName() != null) {
                        c21445.put(c19157.getGroupName(), c19157);
                    }
                    c20568.f67024 = c20568.f67024;
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
        this.f63700 = m45107(c20566.f67022, c20566.f67028);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45109() {
        this.f63703 = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f63704.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
