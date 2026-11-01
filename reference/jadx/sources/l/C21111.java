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

/* JADX INFO: renamed from: l.᩷᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKO */
/* JADX INFO: loaded from: classes5.dex */
public final class C21111 extends Drawable implements InterfaceC17480 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f68766 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f68767 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f68768;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C7706 f68769;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f68770;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float[] f68771;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ColorFilter f68772;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Rect f68773;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Matrix f68774;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f68775;

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C21111() {
        this.f68771 = new float[9];
        this.f68774 = new Matrix();
        this.f68773 = new Rect();
        C7706 c7706 = new C7706();
        c7706.f25492 = null;
        c7706.f25498 = f68766;
        c7706.f25496 = new C10529();
        this.f68769 = c7706;
    }

    public C21111(C7706 c7706) {
        this.f68771 = new float[9];
        this.f68774 = new Matrix();
        this.f68773 = new Rect();
        this.f68769 = c7706;
        this.f68768 = m47539(c7706.f25492, c7706.f25498);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f68775 && super.mutate() == this) {
            C7706 c7706 = this.f68769;
            C7706 c7707 = new C7706();
            c7707.f25492 = null;
            c7707.f25498 = f68766;
            if (c7706 != null) {
                c7707.f25494 = c7706.f25494;
                C10529 c10529 = new C10529(c7706.f25496);
                c7707.f25496 = c10529;
                if (c7706.f25496.f36045 != null) {
                    c10529.f36045 = new Paint(c7706.f25496.f36045);
                }
                if (c7706.f25496.f36048 != null) {
                    c7707.f25496.f36048 = new Paint(c7706.f25496.f36048);
                }
                c7707.f25492 = c7706.f25492;
                c7707.f25498 = c7706.f25498;
                c7707.f25490 = c7706.f25490;
            }
            this.f68769 = c7707;
            this.f68775 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        this.f68769.f25494 = getChangingConfigurations();
        return this.f68769;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Rect rect = this.f68773;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f68772;
        if (colorFilter == null) {
            colorFilter = this.f68768;
        }
        Matrix matrix = this.f68774;
        canvas.getMatrix(matrix);
        float[] fArr = this.f68771;
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
        if (this.f68769.f25490 && C7603.m20126(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C7706 c7706 = this.f68769;
        Bitmap bitmap = c7706.f25488;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c7706.f25488.getHeight()) {
            c7706.f25488 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c7706.f25495 = true;
        }
        C7706 c7707 = this.f68769;
        if (c7707.f25495 || c7707.f25497 != c7707.f25492 || c7707.f25487 != c7707.f25498 || c7707.f25493 != c7707.f25490 || c7707.f25491 != c7707.f25496.f36041) {
            c7707.f25488.eraseColor(0);
            c7707.f25496.m26671(new Canvas(c7707.f25488), iMin, iMin2);
            C7706 c7708 = this.f68769;
            c7708.f25497 = c7708.f25492;
            c7708.f25487 = c7708.f25498;
            c7708.f25491 = c7708.f25496.f36041;
            c7708.f25493 = c7708.f25490;
            c7708.f25495 = false;
        }
        C7706 c7709 = this.f68769;
        if (c7709.f25496.f36041 >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c7709.f25489 == null) {
                Paint paint2 = new Paint();
                c7709.f25489 = paint2;
                paint2.setFilterBitmap(true);
            }
            c7709.f25489.setAlpha(c7709.f25496.f36041);
            c7709.f25489.setColorFilter(colorFilter);
            paint = c7709.f25489;
        }
        canvas.drawBitmap(c7709.f25488, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f68769.f25496.f36041;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C10529 c10529 = this.f68769.f25496;
        if (c10529.f36041 != i) {
            c10529.f36041 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f68772 = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f68772;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PorterDuffColorFilter m47539(ColorStateList colorStateList, PorterDuff.Mode mode) {
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
        C7706 c7706 = this.f68769;
        if (c7706.f25492 != colorStateList) {
            c7706.f25492 = colorStateList;
            this.f68768 = m47539(colorStateList, c7706.f25498);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C7706 c7706 = this.f68769;
        if (c7706.f25498 != mode) {
            c7706.f25498 = mode;
            this.f68768 = m47539(c7706.f25492, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        C7706 c7706 = this.f68769;
        if (c7706 == null) {
            return false;
        }
        C10529 c10529 = c7706.f25496;
        if (c10529.f36043 == null) {
            c10529.f36043 = Boolean.valueOf(c10529.f36044.mo22043());
        }
        if (c10529.f36043.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f68769.f25492;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        C7706 c7706 = this.f68769;
        ColorStateList colorStateList = c7706.f25492;
        if (colorStateList == null || (mode = c7706.f25498) == null) {
            z = false;
        } else {
            this.f68768 = m47539(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C10529 c10529 = c7706.f25496;
        if (c10529.f36043 == null) {
            c10529.f36043 = Boolean.valueOf(c10529.f36044.mo22043());
        }
        if (c10529.f36043.booleanValue()) {
            boolean zMo22044 = c7706.f25496.f36044.mo22044(iArr);
            c7706.f25495 |= zMo22044;
            if (zMo22044) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.f68769.f25496.f36047;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f68769.f25496.f36042;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f68769.f25490;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.f68769.f25490 = z;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21111 m47538(XmlResourceParserC11068 xmlResourceParserC11068, C6037 c6037, boolean z) throws XmlPullParserException {
        int next;
        int i;
        int i2;
        ColorStateList colorStateListValueOf;
        C21111 c21111;
        int i3;
        int i4;
        int i5;
        int iM47393;
        do {
            next = xmlResourceParserC11068.next();
            i = 1;
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (!xmlResourceParserC11068.getName().equals("vector")) {
            throw new XmlPullParserException("Unexpected tag: " + xmlResourceParserC11068.getName());
        }
        C21111 c21112 = new C21111();
        c21112.f68770 = z;
        C7706 c7706 = c21112.f68769;
        c7706.f25496 = new C10529();
        C21027 c21027M38116 = C16089.m38116(xmlResourceParserC11068, C21271.f69262, c6037);
        C7706 c7707 = c21112.f68769;
        C10529 c10529 = c7707.f25496;
        int iM47394 = xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "tintMode") != null ? c21027M38116.m47393(6, -1) : -1;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (iM47394 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iM47394 != 5) {
            if (iM47394 != 9) {
                switch (iM47394) {
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
        c7707.f25498 = mode;
        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "tint") != null) {
            TypedValue typedValue = new TypedValue();
            c21027M38116.m47395(1, typedValue);
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
            c7707.f25492 = colorStateListValueOf;
        }
        boolean zM47396 = c7707.f25490;
        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "autoMirrored") != null) {
            zM47396 = c21027M38116.m47396(zM47396);
        }
        c7707.f25490 = zM47396;
        float fM47397 = c10529.f36050;
        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportWidth") != null) {
            fM47397 = c21027M38116.m47397(fM47397, 7);
        }
        c10529.f36050 = fM47397;
        float fM47398 = c10529.f36049;
        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportHeight") != null) {
            fM47398 = c21027M38116.m47397(fM47398, 8);
        }
        c10529.f36049 = fM47398;
        if (c10529.f36050 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires viewportWidth > 0");
        }
        if (fM47398 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires viewportHeight > 0");
        }
        c10529.f36047 = c21027M38116.m47392(c10529.f36047, 3);
        float fM47392 = c21027M38116.m47392(c10529.f36042, 2);
        c10529.f36042 = fM47392;
        if (c10529.f36047 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires width > 0");
        }
        if (fM47392 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires height > 0");
        }
        float fM47399 = c10529.f36041 / 255.0f;
        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "alpha") != null) {
            fM47399 = c21027M38116.m47397(fM47399, 4);
        }
        c10529.f36041 = (int) (fM47399 * 255.0f);
        int i8 = 0;
        String strM47394 = c21027M38116.m47394(0);
        if (strM47394 != null) {
            c10529.f36053 = strM47394;
            c10529.f36051.put(strM47394, c10529);
        }
        c7706.f25494 = c21112.getChangingConfigurations();
        c7706.f25495 = true;
        C7706 c7708 = c21112.f68769;
        C10529 c105210 = c7708.f25496;
        ArrayDeque arrayDeque = new ArrayDeque();
        C8412 c8412 = c105210.f36044;
        C21445 c21445 = c105210.f36051;
        arrayDeque.push(c8412);
        int eventType = xmlResourceParserC11068.getEventType();
        int depth = xmlResourceParserC11068.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i && (xmlResourceParserC11068.getDepth() >= depth || eventType != i6)) {
            if (eventType == i2) {
                String name = xmlResourceParserC11068.getName();
                C8412 c8413 = (C8412) arrayDeque.peek();
                C13638.requireNonNull(c8413);
                ArrayList arrayList = c8413.f29163;
                i3 = depth;
                if (MotionUtils.EASING_TYPE_PATH.equals(name)) {
                    C18995 c18995 = new C18995();
                    boolean z3 = c21112.f68770;
                    C21027 c21027M38117 = C16089.m38116(xmlResourceParserC11068, C21271.f69264, c6037);
                    if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        String strM47395 = c21027M38117.m47394(i8);
                        if (strM47395 != null) {
                            c18995.f31052 = strM47395;
                        }
                        String strM47396 = c21027M38117.m47394(2);
                        if (strM47396 != null) {
                            if (c21027M38117.m47398(2) != 3) {
                                throw new RuntimeException();
                            }
                            c18995.f31055 = C22420.m49741(strM47396);
                            if (z3) {
                                c18995.f31054 = strM47396;
                            }
                        }
                        c18995.f61485 = C16089.m38115(c21027M38117, xmlResourceParserC11068, "fillColor", 1);
                        float fM473910 = c18995.f61478;
                        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillAlpha") != null) {
                            fM473910 = c21027M38117.m47397(fM473910, 12);
                        }
                        c18995.f61478 = fM473910;
                        int iM47395 = xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineCap") != null ? c21027M38117.m47393(8, -1) : -1;
                        Paint.Cap cap = c18995.f61477;
                        if (iM47395 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (iM47395 == 1) {
                            cap = Paint.Cap.ROUND;
                        } else if (iM47395 == 2) {
                            cap = Paint.Cap.SQUARE;
                        }
                        c18995.f61477 = cap;
                        int iM47396 = xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineJoin") != null ? c21027M38117.m47393(9, -1) : -1;
                        Paint.Join join = c18995.f61479;
                        if (iM47396 == 0) {
                            join = Paint.Join.MITER;
                        } else if (iM47396 == 1) {
                            join = Paint.Join.ROUND;
                        } else if (iM47396 == 2) {
                            join = Paint.Join.BEVEL;
                        }
                        c18995.f61479 = join;
                        float fM473911 = c18995.f61486;
                        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeMiterLimit") != null) {
                            fM473911 = c21027M38117.m47397(fM473911, 10);
                        }
                        c18995.f61486 = fM473911;
                        c18995.f61480 = C16089.m38115(c21027M38117, xmlResourceParserC11068, "strokeColor", 3);
                        float fM473912 = c18995.f61476;
                        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeAlpha") != null) {
                            fM473912 = c21027M38117.m47397(fM473912, 11);
                        }
                        c18995.f61476 = fM473912;
                        float fM473913 = c18995.f61481;
                        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeWidth") != null) {
                            fM473913 = c21027M38117.m47397(fM473913, 4);
                        }
                        c18995.f61481 = fM473913;
                        float fM473914 = c18995.f61484;
                        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathEnd") != null) {
                            fM473914 = c21027M38117.m47397(fM473914, 6);
                        }
                        c18995.f61484 = fM473914;
                        float fM473915 = c18995.f61482;
                        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathOffset") != null) {
                            fM473915 = c21027M38117.m47397(fM473915, 7);
                        }
                        c18995.f61482 = fM473915;
                        float fM473916 = c18995.f61483;
                        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathStart") != null) {
                            fM473916 = c21027M38117.m47397(fM473916, 5);
                        }
                        c18995.f61483 = fM473916;
                        int iM47397 = c18995.f31053;
                        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillType") != null) {
                            iM47397 = c21027M38117.m47393(13, iM47397);
                        }
                        c18995.f31053 = iM47397;
                    }
                    arrayList.add(c18995);
                    String str = c18995.f31052;
                    if (str != null) {
                        c21445.put(str, c18995);
                    }
                    c7708.f25494 = c7708.f25494;
                    i4 = 0;
                    z2 = false;
                    c21111 = c21112;
                } else if ("clip-path".equals(name)) {
                    C18289 c18289 = new C18289();
                    boolean z4 = c21112.f68770;
                    if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        C21027 c21027M38118 = C16089.m38116(xmlResourceParserC11068, C21271.f69263, c6037);
                        String strM47397 = c21027M38118.m47394(0);
                        if (strM47397 != null) {
                            c18289.f31052 = strM47397;
                        }
                        String strM47398 = c21027M38118.m47394(1);
                        if (strM47398 != null) {
                            c21111 = c21112;
                            if (c21027M38118.m47398(1) != 3) {
                                throw new RuntimeException();
                            }
                            c18289.f31055 = C22420.m49741(strM47398);
                            if (z4) {
                                c18289.f31054 = strM47398;
                            }
                        } else {
                            c21111 = c21112;
                        }
                        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillType") != null) {
                            i5 = 0;
                            iM47393 = c21027M38118.m47393(2, 0);
                        } else {
                            i5 = 0;
                            iM47393 = 0;
                        }
                        c18289.f31053 = iM47393;
                    } else {
                        c21111 = c21112;
                        i5 = 0;
                    }
                    arrayList.add(c18289);
                    String str2 = c18289.f31052;
                    if (str2 != null) {
                        c21445.put(str2, c18289);
                    }
                    c7708.f25494 = c7708.f25494;
                    i4 = i5;
                } else {
                    c21111 = c21112;
                    if ("group".equals(name)) {
                        C8412 c8414 = new C8412();
                        c8414.m22042(xmlResourceParserC11068, c6037);
                        arrayList.add(c8414);
                        arrayDeque.push(c8414);
                        if (c8414.m22045() != null) {
                            c21445.put(c8414.m22045(), c8414);
                        }
                        c7708.f25494 = c7708.f25494;
                    }
                    i4 = 0;
                }
                i8 = i4;
            } else {
                c21111 = c21112;
                i3 = depth;
                if (eventType == 3 && "group".equals(xmlResourceParserC11068.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlResourceParserC11068.next();
            i = 1;
            i2 = 2;
            i6 = 3;
            depth = i3;
            c21112 = c21111;
        }
        C21111 c21113 = c21112;
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        c21113.f68768 = c21113.m47539(c7706.f25492, c7706.f25498);
        return c21113;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f68769.f25494;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m47540() {
        if (!this.f68770) {
            throw new IllegalStateException("Need set savePathData to true");
        }
        return C7832.m20656(this);
    }
}
