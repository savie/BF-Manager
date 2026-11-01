package l;

import android.util.TypedValue;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: l.ܺܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4GT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16089 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21027 m38116(XmlResourceParserC11068 xmlResourceParserC11068, int[] iArr, C6037 c6037) {
        C21027 c21027 = new C21027(xmlResourceParserC11068, iArr.length);
        int attributeCount = xmlResourceParserC11068.getAttributeCount();
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < attributeCount; i3++) {
                if (xmlResourceParserC11068.getAttributeNameResource(i3) == i2) {
                    int i4 = i * 2;
                    int iM27894 = xmlResourceParserC11068.m27894(i3);
                    int iM27896 = xmlResourceParserC11068.m27896(i3);
                    if (iM27894 == 1) {
                        TypedValue typedValue = new TypedValue();
                        c6037.m16370(iM27896, typedValue, true);
                        int i5 = typedValue.type;
                        int i6 = typedValue.data;
                        if (i5 == 3) {
                            int iM30302 = xmlResourceParserC11068.m27903().m40055(typedValue.string.toString()).m30302();
                            iM27894 = i5;
                            iM27896 = iM30302;
                        } else {
                            iM27894 = i5;
                            iM27896 = i6;
                        }
                    }
                    int[] iArr2 = c21027.f68476;
                    iArr2[i4] = iM27894;
                    iArr2[i4 + 1] = iM27896;
                    break;
                }
            }
        }
        return c21027;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1107 m38115(C21027 c21027, XmlResourceParserC11068 xmlResourceParserC11068, String str, int i) {
        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, str) != null) {
            TypedValue typedValue = new TypedValue();
            c21027.m47395(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return C18747.m43296(typedValue.data);
            }
            if (i2 == 1 || i2 == 2) {
                return C18747.m43296(-16777216);
            }
        }
        return C18747.m43296(0);
    }
}
