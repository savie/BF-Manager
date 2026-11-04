package l;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.᩹ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1BZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23586 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16872 f76583;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f76587 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f76584 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public SparseArray f76585 = new SparseArray();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public SparseArray f76586 = new SparseArray();

    public C23586(Context context, C16872 c16872, int i) {
        String str;
        this.f76583 = c16872;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C17618 c17618 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                m52831(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                C17618 c17619 = new C17618(context, xml);
                                this.f76585.put(c17619.f57957, c17619);
                                c17618 = c17619;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C16126 c16126 = new C16126(context, xml);
                                if (c17618 != null) {
                                    c17618.f57959.add(c16126);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52832(float f, float f2, int i) {
        C4194 c4194;
        C17618 c17618;
        int i2 = this.f76587;
        int i3 = 0;
        C16872 c16872 = this.f76583;
        SparseArray sparseArray = this.f76585;
        if (i2 == i) {
            if (i == -1) {
                c17618 = (C17618) sparseArray.valueAt(0);
            } else {
                c17618 = (C17618) sparseArray.get(i2);
            }
            int i4 = this.f76584;
            if (i4 == -1 || !((C16126) c17618.f57959.get(i4)).m38285(f, f2)) {
                ArrayList arrayList = c17618.f57959;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        i3 = -1;
                        break;
                    } else if (((C16126) arrayList.get(i3)).m38285(f, f2)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                ArrayList arrayList2 = c17618.f57959;
                if (this.f76584 == i3) {
                    return;
                }
                C4194 c4195 = i3 == -1 ? null : ((C16126) arrayList2.get(i3)).f52407;
                if (i3 != -1) {
                    int i5 = ((C16126) arrayList2.get(i3)).f52403;
                }
                if (c4195 == null) {
                    return;
                }
                this.f76584 = i3;
                c4195.m13392(c16872);
                return;
            }
            return;
        }
        this.f76587 = i;
        C17618 c17619 = (C17618) sparseArray.get(i);
        ArrayList arrayList3 = c17619.f57959;
        while (true) {
            if (i3 >= arrayList3.size()) {
                i3 = -1;
                break;
            } else if (((C16126) arrayList3.get(i3)).m38285(f, f2)) {
                break;
            } else {
                i3++;
            }
        }
        ArrayList arrayList4 = c17619.f57959;
        if (i3 == -1) {
            c4194 = c17619.f57958;
        } else {
            c4194 = ((C16126) arrayList4.get(i3)).f52407;
        }
        if (i3 != -1) {
            int i6 = ((C16126) arrayList4.get(i3)).f52403;
        }
        if (c4194 == null) {
            return;
        }
        this.f76584 = i3;
        c4194.m13392(c16872);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52831(Context context, XmlResourceParser xmlResourceParser) {
        C4194 c4194 = new C4194();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlResourceParser.getAttributeName(i))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                c4194.m13389(context, xmlResourceParser);
                this.f76586.put(identifier, c4194);
                return;
            }
        }
    }
}
