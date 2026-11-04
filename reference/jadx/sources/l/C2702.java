package l;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.Window;
import bin.mt.json.JSONObject;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31AL */
/* JADX INFO: loaded from: classes.dex */
public final class C2702 {

    /* JADX INFO: renamed from: ۟֫ܽ, reason: not valid java name and contains not printable characters */
    public static int f8586;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f8587;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f8588;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f8589;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f8590;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f8591;

    /* JADX INFO: renamed from: ֡᩻ۘ, reason: not valid java name and contains not printable characters */
    public static int m8871(Object obj) {
        return ((C15945) obj).m38036();
    }

    /* JADX INFO: renamed from: ֨ᩴ֨, reason: not valid java name and contains not printable characters */
    public static void m8872(Object obj) {
        C21576.m49068((Runnable) obj);
    }

    /* JADX INFO: renamed from: ֫ۙ᩺, reason: not valid java name and contains not printable characters */
    public static boolean m8873() {
        return C18978.m44079();
    }

    /* JADX INFO: renamed from: ۛۖۙ, reason: not valid java name and contains not printable characters */
    public static String m8874(Object obj) {
        return ((InterfaceC2386) obj).getName();
    }

    /* JADX INFO: renamed from: ۟ܿۡ, reason: not valid java name and contains not printable characters */
    public static JSONObject m8875(Object obj, Object obj2, int i) {
        return ((JSONObject) obj).add((String) obj2, i);
    }

    /* JADX INFO: renamed from: ۡۜܶ, reason: not valid java name and contains not printable characters */
    public static boolean m8876() {
        return true;
    }

    /* JADX INFO: renamed from: ۢ֡ᩴ, reason: not valid java name and contains not printable characters */
    public static String m8877(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC9801) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۧ۟᩷, reason: not valid java name and contains not printable characters */
    public static String m8878(int i) {
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: ۨۡܳ, reason: not valid java name and contains not printable characters */
    public static int m8879(Object obj) {
        return ((ArrayList) obj).size();
    }

    /* JADX INFO: renamed from: ۫ۗۧ, reason: not valid java name and contains not printable characters */
    public static int m8880(Object obj, Object obj2) {
        return ((org.json.JSONObject) obj).getInt((String) obj2);
    }

    /* JADX INFO: renamed from: ۬ۛܳ, reason: not valid java name and contains not printable characters */
    public static String m8881(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܰ֨᩵, reason: not valid java name and contains not printable characters */
    public static void m8882(Object obj, int i, Object obj2, int i2, int i3) {
        System.arraycopy(obj, i, obj2, i2, i3);
    }

    /* JADX INFO: renamed from: ܰۛۖ, reason: not valid java name and contains not printable characters */
    public static int m8883(int i, int i2) {
        return Math.max(i, i2);
    }

    /* JADX INFO: renamed from: ܰ᩸᩷, reason: not valid java name and contains not printable characters */
    public static Window m8884(Object obj) {
        return ((Activity) obj).getWindow();
    }

    /* JADX INFO: renamed from: ܺ۬ܿ, reason: not valid java name and contains not printable characters */
    public static int m8885(Object obj) {
        return ((Enum) obj).ordinal();
    }

    /* JADX INFO: renamed from: ᩵ۗ᩺, reason: not valid java name and contains not printable characters */
    public static void m8886(Object obj, Object obj2, Object obj3) {
        C1663.m5975((C8614) obj, (InterfaceC2386) obj2, (InterfaceC5392) obj3);
    }

    public C2702(Context context, XmlResourceParser xmlResourceParser) {
        this.f8589 = Float.NaN;
        this.f8591 = Float.NaN;
        this.f8588 = Float.NaN;
        this.f8590 = Float.NaN;
        this.f8587 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1211.f4425);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f8587);
                this.f8587 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == 1) {
                this.f8590 = typedArrayObtainStyledAttributes.getDimension(index, this.f8590);
            } else if (index == 2) {
                this.f8591 = typedArrayObtainStyledAttributes.getDimension(index, this.f8591);
            } else if (index == 3) {
                this.f8588 = typedArrayObtainStyledAttributes.getDimension(index, this.f8588);
            } else if (index == 4) {
                this.f8589 = typedArrayObtainStyledAttributes.getDimension(index, this.f8589);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8887(float f, float f2) {
        float f3 = this.f8589;
        if (!Float.isNaN(f3) && f < f3) {
            return false;
        }
        float f4 = this.f8591;
        if (!Float.isNaN(f4) && f2 < f4) {
            return false;
        }
        float f5 = this.f8588;
        if (!Float.isNaN(f5) && f > f5) {
            return false;
        }
        float f6 = this.f8590;
        return Float.isNaN(f6) || f2 <= f6;
    }
}
