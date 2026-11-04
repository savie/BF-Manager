package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1C9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15380 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f50150;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f50151;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC19856 f50152;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f50153;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f50154;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f50155;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f50156;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m36837(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC19856 m36840() {
        return this.f50152;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m36844() {
        int i = C22840.f74022[this.f50152.ordinal()];
        return (i == 1 || i == 2) ? 4 : 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m36845() {
        switch (C22840.f74022[this.f50152.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return this.f50156;
            case 4:
                return this.f50151;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                return this.f50150 ? 1.0f : 0.0f;
            case 7:
                return this.f50151;
            default:
                return Float.NaN;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36843(float[] fArr) {
        switch (C22840.f74022[this.f50152.ordinal()]) {
            case 1:
            case 2:
                int i = this.f50155;
                int i2 = (i >> 24) & 255;
                float fPow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                return;
            case 3:
                fArr[0] = this.f50156;
                return;
            case 4:
                fArr[0] = this.f50151;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                fArr[0] = this.f50150 ? 1.0f : 0.0f;
                return;
            case 7:
                fArr[0] = this.f50151;
                return;
            default:
                return;
        }
    }

    public C15380(C15380 c15380, Object obj) {
        this.f50154 = c15380.f50154;
        this.f50152 = c15380.f50152;
        m36842(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36842(Object obj) {
        switch (C22840.f74022[this.f50152.ordinal()]) {
            case 1:
            case 2:
                this.f50155 = ((Integer) obj).intValue();
                break;
            case 3:
                this.f50156 = ((Integer) obj).intValue();
                break;
            case 4:
                this.f50151 = ((Float) obj).floatValue();
                break;
            case 5:
                this.f50153 = (String) obj;
                break;
            case 6:
                this.f50150 = ((Boolean) obj).booleanValue();
                break;
            case 7:
                this.f50151 = ((Float) obj).floatValue();
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36839(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C15380 c15380 = (C15380) map.get(str);
            String strM56409 = C25272.m56409("set", str);
            try {
                try {
                    int i = C22840.f74022[c15380.f50152.ordinal()];
                    Class<?> cls2 = Integer.TYPE;
                    Class<?> cls3 = Float.TYPE;
                    switch (i) {
                        case 1:
                            cls.getMethod(strM56409, cls2).invoke(view, Integer.valueOf(c15380.f50155));
                            break;
                        case 2:
                            Method method = cls.getMethod(strM56409, Drawable.class);
                            ColorDrawable colorDrawable = new ColorDrawable();
                            colorDrawable.setColor(c15380.f50155);
                            method.invoke(view, colorDrawable);
                            break;
                        case 3:
                            cls.getMethod(strM56409, cls2).invoke(view, Integer.valueOf(c15380.f50156));
                            break;
                        case 4:
                            cls.getMethod(strM56409, cls3).invoke(view, Float.valueOf(c15380.f50151));
                            break;
                        case 5:
                            cls.getMethod(strM56409, CharSequence.class).invoke(view, c15380.f50153);
                            break;
                        case 6:
                            cls.getMethod(strM56409, Boolean.TYPE).invoke(view, Boolean.valueOf(c15380.f50150));
                            break;
                        case 7:
                            cls.getMethod(strM56409, cls3).invoke(view, Float.valueOf(c15380.f50151));
                            break;
                    }
                } catch (NoSuchMethodException e) {
                    e.getMessage();
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36841(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        StringBuilder sb = new StringBuilder("set");
        String str = this.f50154;
        sb.append(str);
        String string = sb.toString();
        try {
            int i = C22840.f74022[this.f50152.ordinal()];
            Class<?> cls2 = Integer.TYPE;
            Class<?> cls3 = Float.TYPE;
            switch (i) {
                case 1:
                    cls.getMethod(string, cls2).invoke(view, Integer.valueOf((m36837((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m36837((int) (fArr[3] * 255.0f)) << 24) | (m36837((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m36837((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 2:
                    Method method = cls.getMethod(string, Drawable.class);
                    int iM36837 = (m36837((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m36837((int) (fArr[3] * 255.0f)) << 24) | (m36837((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m36837((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iM36837);
                    method.invoke(view, colorDrawable);
                    return;
                case 3:
                    cls.getMethod(string, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 4:
                    cls.getMethod(string, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + str);
                case 6:
                    cls.getMethod(string, Boolean.TYPE).invoke(view, Boolean.valueOf(fArr[0] > 0.5f));
                    return;
                case 7:
                    cls.getMethod(string, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException unused) {
            C18540.m43118(view);
        } catch (NoSuchMethodException unused2) {
            C18540.m43118(view);
        } catch (InvocationTargetException unused3) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36838(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        EnumC19856 enumC19856;
        Object string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1211.f4436);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        EnumC19856 enumC19857 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC19857 = EnumC19856.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    enumC19856 = EnumC19856.COLOR_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    enumC19856 = EnumC19856.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    enumC19856 = EnumC19856.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    enumC19856 = EnumC19856.DIMENSION_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    enumC19856 = EnumC19856.FLOAT_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    enumC19856 = EnumC19856.INT_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == 8) {
                    enumC19856 = EnumC19856.STRING_TYPE;
                    string = typedArrayObtainStyledAttributes.getString(index);
                }
                Object obj = string;
                enumC19857 = enumC19856;
                objValueOf = obj;
            }
        }
        if (string2 != null && objValueOf != null) {
            C15380 c15380 = new C15380();
            c15380.f50154 = string2;
            c15380.f50152 = enumC19857;
            c15380.m36842(objValueOf);
            map.put(string2, c15380);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
