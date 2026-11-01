package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: l.۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4GT */
/* JADX INFO: loaded from: classes3.dex */
public final class C12398 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1107 m30836(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return C1107.m4116(typedValue.data);
            }
            C1107 c1107M4117 = C1107.m4117(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (c1107M4117 != null) {
                return c1107M4117;
            }
        }
        return C1107.m4116(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30837(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, str) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30833(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m30837(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30835(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m30837(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static TypedArray m30834(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30832(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }
}
