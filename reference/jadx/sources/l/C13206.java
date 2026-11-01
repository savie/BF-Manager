package l;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1BZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13206 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5444 f43936;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f43935 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f43938 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public SparseArray f43937 = new SparseArray();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public SparseArray f43939 = new SparseArray();

    public C13206(Context context, C5444 c5444, int i) {
        String str;
        this.f43936 = c5444;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C22378 c22378 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                m32675(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                C22378 c22379 = new C22378(context, xml);
                                this.f43937.put(c22379.f73068, c22379);
                                c22378 = c22379;
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
                                C1210 c1210 = new C1210(context, xml);
                                if (c22378 != null) {
                                    c22378.f73066.add(c1210);
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
    public final void m32676(float f, float f2, int i) {
        C18144 c18144;
        C22378 c22378;
        int i2 = this.f43935;
        int i3 = 0;
        C5444 c5444 = this.f43936;
        SparseArray sparseArray = this.f43937;
        if (i2 == i) {
            if (i == -1) {
                c22378 = (C22378) sparseArray.valueAt(0);
            } else {
                c22378 = (C22378) sparseArray.get(i2);
            }
            int i4 = this.f43938;
            if (i4 == -1 || !((C1210) c22378.f73066.get(i4)).m4403(f, f2)) {
                ArrayList arrayList = c22378.f73066;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        i3 = -1;
                        break;
                    } else if (((C1210) arrayList.get(i3)).m4403(f, f2)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                ArrayList arrayList2 = c22378.f73066;
                if (this.f43938 == i3) {
                    return;
                }
                C18144 c18145 = i3 == -1 ? null : ((C1210) arrayList2.get(i3)).f5334;
                if (i3 != -1) {
                    int i5 = ((C1210) arrayList2.get(i3)).f5331;
                }
                if (c18145 == null) {
                    return;
                }
                this.f43938 = i3;
                c18145.m42246(c5444);
                return;
            }
            return;
        }
        this.f43935 = i;
        C22378 c22379 = (C22378) sparseArray.get(i);
        ArrayList arrayList3 = c22379.f73066;
        while (true) {
            if (i3 >= arrayList3.size()) {
                i3 = -1;
                break;
            } else if (((C1210) arrayList3.get(i3)).m4403(f, f2)) {
                break;
            } else {
                i3++;
            }
        }
        ArrayList arrayList4 = c22379.f73066;
        if (i3 == -1) {
            c18144 = c22379.f73069;
        } else {
            c18144 = ((C1210) arrayList4.get(i3)).f5334;
        }
        if (i3 != -1) {
            int i6 = ((C1210) arrayList4.get(i3)).f5331;
        }
        if (c18144 == null) {
            return;
        }
        this.f43938 = i3;
        c18144.m42246(c5444);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32675(Context context, XmlResourceParser xmlResourceParser) {
        C18144 c18144 = new C18144();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlResourceParser.getAttributeName(i))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                c18144.m42244(context, xmlResourceParser);
                this.f43939.put(identifier, c18144);
                return;
            }
        }
    }
}
