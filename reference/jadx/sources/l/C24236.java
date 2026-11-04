package l;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.᩺ۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKO */
/* JADX INFO: loaded from: classes.dex */
public final class C24236 extends Drawable implements InterfaceC8800 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f78486 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f78487 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Rect f78488;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f78489;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final float[] f78490;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C6336 f78491;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ColorFilter f78492;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f78493;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Matrix f78494;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f78495;

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C24236() {
        this.f78490 = new float[9];
        this.f78494 = new Matrix();
        this.f78488 = new Rect();
        C6336 c6336 = new C6336();
        c6336.f21453 = null;
        c6336.f21460 = f78486;
        c6336.f21456 = new C12301();
        this.f78491 = c6336;
    }

    public C24236(C6336 c6336) {
        this.f78490 = new float[9];
        this.f78494 = new Matrix();
        this.f78488 = new Rect();
        this.f78491 = c6336;
        this.f78493 = m54218(c6336.f21453, c6336.f21460);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f78495 && super.mutate() == this) {
            C6336 c6336 = this.f78491;
            C6336 c6337 = new C6336();
            c6337.f21453 = null;
            c6337.f21460 = f78486;
            if (c6336 != null) {
                c6337.f21451 = c6336.f21451;
                C12301 c12301 = new C12301(c6336.f21456);
                c6337.f21456 = c12301;
                if (c6336.f21456.f39542 != null) {
                    c12301.f39542 = new Paint(c6336.f21456.f39542);
                }
                if (c6336.f21456.f39547 != null) {
                    c6337.f21456.f39547 = new Paint(c6336.f21456.f39547);
                }
                c6337.f21453 = c6336.f21453;
                c6337.f21460 = c6336.f21460;
                c6337.f21450 = c6336.f21450;
            }
            this.f78491 = c6337;
            this.f78495 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        this.f78491.f21451 = getChangingConfigurations();
        return this.f78491;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Rect rect = this.f78488;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f78492;
        if (colorFilter == null) {
            colorFilter = this.f78493;
        }
        Matrix matrix = this.f78494;
        canvas.getMatrix(matrix);
        float[] fArr = this.f78490;
        matrix.getValues(fArr);
        float fHypot = (float) Math.hypot(fArr[0], fArr[3]);
        float fHypot2 = (float) Math.hypot(fArr[1], fArr[4]);
        int iWidth = (int) (rect.width() * fHypot);
        int iHeight = (int) (rect.height() * fHypot2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (this.f78491.f21450 && C0597.m2701(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C6336 c6336 = this.f78491;
        Bitmap bitmap = c6336.f21459;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c6336.f21459.getHeight()) {
            c6336.f21459 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c6336.f21458 = true;
        }
        C6336 c6337 = this.f78491;
        if (c6337.f21458 || c6337.f21455 != c6337.f21453 || c6337.f21454 != c6337.f21460 || c6337.f21452 != c6337.f21450 || c6337.f21457 != c6337.f21456.f39539) {
            c6337.f21459.eraseColor(0);
            c6337.f21456.m30697(new Canvas(c6337.f21459), iMin, iMin2);
            C6336 c6338 = this.f78491;
            c6338.f21455 = c6338.f21453;
            c6338.f21454 = c6338.f21460;
            c6338.f21457 = c6338.f21456.f39539;
            c6338.f21452 = c6338.f21450;
            c6338.f21458 = false;
        }
        C6336 c6339 = this.f78491;
        if (c6339.f21456.f39539 >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c6339.f21449 == null) {
                Paint paint2 = new Paint();
                c6339.f21449 = paint2;
                paint2.setFilterBitmap(true);
            }
            c6339.f21449.setAlpha(c6339.f21456.f39539);
            c6339.f21449.setColorFilter(colorFilter);
            paint = c6339.f21449;
        }
        canvas.drawBitmap(c6339.f21459, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f78491.f21456.f39539;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C12301 c12301 = this.f78491.f21456;
        if (c12301.f39539 != i) {
            c12301.f39539 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f78492 = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f78492;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PorterDuffColorFilter m54218(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C6336 c6336 = this.f78491;
        if (c6336.f21453 != colorStateList) {
            c6336.f21453 = colorStateList;
            this.f78493 = m54218(colorStateList, c6336.f21460);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C6336 c6336 = this.f78491;
        if (c6336.f21460 != mode) {
            c6336.f21460 = mode;
            this.f78493 = m54218(c6336.f21453, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        C6336 c6336 = this.f78491;
        if (c6336 == null) {
            return false;
        }
        C12301 c12301 = c6336.f21456;
        if (c12301.f39549 == null) {
            c12301.f39549 = Boolean.valueOf(c12301.f39543.mo11001());
        }
        if (c12301.f39549.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f78491.f21453;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        C6336 c6336 = this.f78491;
        ColorStateList colorStateList = c6336.f21453;
        if (colorStateList == null || (mode = c6336.f21460) == null) {
            z = false;
        } else {
            this.f78493 = m54218(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C12301 c12301 = c6336.f21456;
        if (c12301.f39549 == null) {
            c12301.f39549 = Boolean.valueOf(c12301.f39543.mo11001());
        }
        if (c12301.f39549.booleanValue()) {
            boolean zMo11002 = c6336.f21456.f39543.mo11002(iArr);
            c6336.f21458 |= zMo11002;
            if (zMo11002) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.f78491.f21456.f39550;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f78491.f21456.f39540;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f78491.f21450;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.f78491.f21450 = z;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24236 m54217(XmlResourceParserC9734 xmlResourceParserC9734, C21246 c21246, boolean z) throws XmlPullParserException {
        int next;
        int i;
        int i2;
        ColorStateList colorStateListValueOf;
        C24236 c24236;
        int i3;
        int i4;
        int i5;
        int iM30848;
        do {
            next = xmlResourceParserC9734.next();
            i = 1;
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (!xmlResourceParserC9734.getName().equals("vector")) {
            throw new XmlPullParserException("Unexpected tag: " + xmlResourceParserC9734.getName());
        }
        C24236 c24237 = new C24236();
        c24237.f78489 = z;
        C6336 c6336 = c24237.f78491;
        c6336.f21456 = new C12301();
        C12367 c12367M18165 = C6402.m18165(xmlResourceParserC9734, C4782.f16777, c21246);
        C6336 c6337 = c24237.f78491;
        C12301 c12301 = c6337.f21456;
        int iM30849 = xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "tintMode") != null ? c12367M18165.m30848(6, -1) : -1;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (iM30849 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iM30849 != 5) {
            if (iM30849 != 9) {
                switch (iM30849) {
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
        c6337.f21460 = mode;
        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "tint") != null) {
            TypedValue typedValue = new TypedValue();
            c12367M18165.m30850(1, typedValue);
            int i7 = typedValue.type;
            if (i7 >= 28 && i7 <= 31) {
                colorStateListValueOf = ColorStateList.valueOf(typedValue.data);
            } else if (i7 == 1 || i7 == 2) {
                colorStateListValueOf = ColorStateList.valueOf(-16777216);
            } else {
                colorStateListValueOf = null;
            }
        } else {
            colorStateListValueOf = null;
        }
        if (colorStateListValueOf != null) {
            c6337.f21453 = colorStateListValueOf;
        }
        boolean zM30851 = c6337.f21450;
        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "autoMirrored") != null) {
            zM30851 = c12367M18165.m30851(zM30851);
        }
        c6337.f21450 = zM30851;
        float fM30852 = c12301.f39552;
        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportWidth") != null) {
            fM30852 = c12367M18165.m30852(fM30852, 7);
        }
        c12301.f39552 = fM30852;
        float fM30853 = c12301.f39546;
        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportHeight") != null) {
            fM30853 = c12367M18165.m30852(fM30853, 8);
        }
        c12301.f39546 = fM30853;
        if (c12301.f39552 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires viewportWidth > 0");
        }
        if (fM30853 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires viewportHeight > 0");
        }
        c12301.f39550 = c12367M18165.m30847(c12301.f39550, 3);
        float fM30847 = c12367M18165.m30847(c12301.f39540, 2);
        c12301.f39540 = fM30847;
        if (c12301.f39550 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires width > 0");
        }
        if (fM30847 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires height > 0");
        }
        float fM30854 = c12301.f39539 / 255.0f;
        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "alpha") != null) {
            fM30854 = c12367M18165.m30852(fM30854, 4);
        }
        c12301.f39539 = (int) (fM30854 * 255.0f);
        int i8 = 0;
        String strM30849 = c12367M18165.m30849(0);
        if (strM30849 != null) {
            c12301.f39553 = strM30849;
            c12301.f39548.put(strM30849, c12301);
        }
        c6336.f21451 = c24237.getChangingConfigurations();
        c6336.f21458 = true;
        C6336 c6338 = c24237.f78491;
        C12301 c12302 = c6338.f21456;
        ArrayDeque arrayDeque = new ArrayDeque();
        C23490 c23490 = c12302.f39543;
        C14307 c14307 = c12302.f39548;
        arrayDeque.push(c23490);
        int eventType = xmlResourceParserC9734.getEventType();
        int depth = xmlResourceParserC9734.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i && (xmlResourceParserC9734.getDepth() >= depth || eventType != i6)) {
            if (eventType == i2) {
                String name = xmlResourceParserC9734.getName();
                C23490 c23491 = (C23490) arrayDeque.peek();
                C17359.requireNonNull(c23491);
                ArrayList arrayList = c23491.f75951;
                i3 = depth;
                if (MotionUtils.EASING_TYPE_PATH.equals(name)) {
                    C16030 c16030 = new C16030();
                    boolean z3 = c24237.f78489;
                    C12367 c12367M18166 = C6402.m18165(xmlResourceParserC9734, C4782.f16775, c21246);
                    if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        String strM308410 = c12367M18166.m30849(i8);
                        if (strM308410 != null) {
                            c16030.f65699 = strM308410;
                        }
                        String strM308411 = c12367M18166.m30849(2);
                        if (strM308411 != null) {
                            if (c12367M18166.m30853(2) != 3) {
                                throw new RuntimeException();
                            }
                            c16030.f65698 = C25210.m56210(strM308411);
                            if (z3) {
                                c16030.f65697 = strM308411;
                            }
                        }
                        c16030.f52003 = C6402.m18166(c12367M18166, xmlResourceParserC9734, "fillColor", 1);
                        float fM30855 = c16030.f52007;
                        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillAlpha") != null) {
                            fM30855 = c12367M18166.m30852(fM30855, 12);
                        }
                        c16030.f52007 = fM30855;
                        int iM308410 = xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineCap") != null ? c12367M18166.m30848(8, -1) : -1;
                        Paint.Cap cap = c16030.f51999;
                        if (iM308410 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (iM308410 == 1) {
                            cap = Paint.Cap.ROUND;
                        } else if (iM308410 == 2) {
                            cap = Paint.Cap.SQUARE;
                        }
                        c16030.f51999 = cap;
                        int iM308411 = xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineJoin") != null ? c12367M18166.m30848(9, -1) : -1;
                        Paint.Join join = c16030.f52001;
                        if (iM308411 == 0) {
                            join = Paint.Join.MITER;
                        } else if (iM308411 == 1) {
                            join = Paint.Join.ROUND;
                        } else if (iM308411 == 2) {
                            join = Paint.Join.BEVEL;
                        }
                        c16030.f52001 = join;
                        float fM30856 = c16030.f52009;
                        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeMiterLimit") != null) {
                            fM30856 = c12367M18166.m30852(fM30856, 10);
                        }
                        c16030.f52009 = fM30856;
                        c16030.f52000 = C6402.m18166(c12367M18166, xmlResourceParserC9734, "strokeColor", 3);
                        float fM30857 = c16030.f52002;
                        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeAlpha") != null) {
                            fM30857 = c12367M18166.m30852(fM30857, 11);
                        }
                        c16030.f52002 = fM30857;
                        float fM30858 = c16030.f52005;
                        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeWidth") != null) {
                            fM30858 = c12367M18166.m30852(fM30858, 4);
                        }
                        c16030.f52005 = fM30858;
                        float fM30859 = c16030.f52006;
                        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathEnd") != null) {
                            fM30859 = c12367M18166.m30852(fM30859, 6);
                        }
                        c16030.f52006 = fM30859;
                        float fM308510 = c16030.f52004;
                        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathOffset") != null) {
                            fM308510 = c12367M18166.m30852(fM308510, 7);
                        }
                        c16030.f52004 = fM308510;
                        float fM308511 = c16030.f52008;
                        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathStart") != null) {
                            fM308511 = c12367M18166.m30852(fM308511, 5);
                        }
                        c16030.f52008 = fM308511;
                        int iM308412 = c16030.f65696;
                        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillType") != null) {
                            iM308412 = c12367M18166.m30848(13, iM308412);
                        }
                        c16030.f65696 = iM308412;
                    }
                    arrayList.add(c16030);
                    String str = c16030.f65699;
                    if (str != null) {
                        c14307.put(str, c16030);
                    }
                    c6338.f21451 = c6338.f21451;
                    i4 = 0;
                    z2 = false;
                    c24236 = c24237;
                } else if ("clip-path".equals(name)) {
                    C17522 c17522 = new C17522();
                    boolean z4 = c24237.f78489;
                    if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        C12367 c12367M18167 = C6402.m18165(xmlResourceParserC9734, C4782.f16774, c21246);
                        String strM308412 = c12367M18167.m30849(0);
                        if (strM308412 != null) {
                            c17522.f65699 = strM308412;
                        }
                        String strM308413 = c12367M18167.m30849(1);
                        if (strM308413 != null) {
                            c24236 = c24237;
                            if (c12367M18167.m30853(1) != 3) {
                                throw new RuntimeException();
                            }
                            c17522.f65698 = C25210.m56210(strM308413);
                            if (z4) {
                                c17522.f65697 = strM308413;
                            }
                        } else {
                            c24236 = c24237;
                        }
                        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillType") != null) {
                            i5 = 0;
                            iM30848 = c12367M18167.m30848(2, 0);
                        } else {
                            i5 = 0;
                            iM30848 = 0;
                        }
                        c17522.f65696 = iM30848;
                    } else {
                        c24236 = c24237;
                        i5 = 0;
                    }
                    arrayList.add(c17522);
                    String str2 = c17522.f65699;
                    if (str2 != null) {
                        c14307.put(str2, c17522);
                    }
                    c6338.f21451 = c6338.f21451;
                    i4 = i5;
                } else {
                    c24236 = c24237;
                    if ("group".equals(name)) {
                        C23490 c23492 = new C23490();
                        c23492.m52683(xmlResourceParserC9734, c21246);
                        arrayList.add(c23492);
                        arrayDeque.push(c23492);
                        if (c23492.m52684() != null) {
                            c14307.put(c23492.m52684(), c23492);
                        }
                        c6338.f21451 = c6338.f21451;
                    }
                    i4 = 0;
                }
                i8 = i4;
            } else {
                c24236 = c24237;
                i3 = depth;
                if (eventType == 3 && "group".equals(xmlResourceParserC9734.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlResourceParserC9734.next();
            i = 1;
            i2 = 2;
            i6 = 3;
            depth = i3;
            c24237 = c24236;
        }
        C24236 c24238 = c24237;
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        c24238.f78493 = c24238.m54218(c6336.f21453, c6336.f21460);
        return c24238;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f78491.f21451;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m54219() {
        if (!this.f78489) {
            throw new IllegalStateException("Need set savePathData to true");
        }
        return C16381.m38875(this);
    }
}
