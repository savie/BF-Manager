package l;

import android.util.TypedValue;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: l.ۛ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4GT */
/* JADX INFO: loaded from: classes3.dex */
public final class C6402 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12367 m18165(XmlResourceParserC9734 xmlResourceParserC9734, int[] iArr, C21246 c21246) {
        C12367 c12367 = new C12367(xmlResourceParserC9734, iArr.length);
        int attributeCount = xmlResourceParserC9734.getAttributeCount();
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < attributeCount; i3++) {
                if (xmlResourceParserC9734.getAttributeNameResource(i3) == i2) {
                    int i4 = i * 2;
                    int iM25344 = xmlResourceParserC9734.m25344(i3);
                    int iM25350 = xmlResourceParserC9734.m25350(i3);
                    if (iM25344 == 1) {
                        TypedValue typedValue = new TypedValue();
                        c21246.m48425(iM25350, typedValue, true);
                        int i5 = typedValue.type;
                        int i6 = typedValue.data;
                        if (i5 == 3) {
                            int iM47469 = xmlResourceParserC9734.m25349().m31256(typedValue.string.toString()).m47469();
                            iM25344 = i5;
                            iM25350 = iM47469;
                        } else {
                            iM25344 = i5;
                            iM25350 = i6;
                        }
                    }
                    int[] iArr2 = c12367.f39722;
                    iArr2[i4] = iM25344;
                    iArr2[i4 + 1] = iM25350;
                    break;
                }
            }
        }
        return c12367;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17422 m18166(C12367 c12367, XmlResourceParserC9734 xmlResourceParserC9734, String str, int i) {
        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, str) != null) {
            TypedValue typedValue = new TypedValue();
            c12367.m30850(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return C3998.m12916(typedValue.data);
            }
            if (i2 == 1 || i2 == 2) {
                return C3998.m12916(-16777216);
            }
        }
        return C3998.m12916(0);
    }
}
