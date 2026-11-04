package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31AL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8668 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f28309;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public SparseArray f28310 = new SparseArray();

    public C8668(Context context, XmlResourceParser xmlResourceParser) {
        this.f28309 = -1;
        new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1211.f4438);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f28309 = typedArrayObtainStyledAttributes.getResourceId(index, this.f28309);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            C9413 c9413 = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                C9413 c9414 = new C9413(context, xmlResourceParser);
                                this.f28310.put(c9414.f30552, c9414);
                                c9413 = c9414;
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C2702 c2702 = new C2702(context, xmlResourceParser);
                                if (c9413 != null) {
                                    c9413.f30551.add(c2702);
                                }
                            }
                            break;
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23350(float f, float f2, int i, int i2) {
        C9413 c9413 = (C9413) this.f28310.get(i2);
        if (c9413 == null) {
            return i2;
        }
        ArrayList<C2702> arrayList = c9413.f30551;
        int i3 = c9413.f30550;
        if (f != -1.0f && f2 != -1.0f) {
            C2702 c2702 = null;
            for (C2702 c2703 : arrayList) {
                if (c2703.m8887(f, f2)) {
                    if (i != c2703.f8587) {
                        c2702 = c2703;
                    }
                }
            }
            return c2702 != null ? c2702.f8587 : i3;
        }
        if (i3 != i) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (i == ((C2702) it.next()).f8587) {
                }
            }
            return i3;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23351(int i) {
        C9413 c9413;
        float f = -1;
        int i2 = 0;
        SparseArray sparseArray = this.f28310;
        if (-1 == i) {
            if (i == -1) {
                c9413 = (C9413) sparseArray.valueAt(0);
            } else {
                c9413 = (C9413) sparseArray.get(-1);
            }
            if (c9413 != null) {
                ArrayList arrayList = c9413.f30551;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((C2702) arrayList.get(i2)).m8887(f, f)) {
                        break;
                    }
                    i2++;
                }
                if (-1 != i2) {
                    return i2 == -1 ? c9413.f30550 : ((C2702) arrayList.get(i2)).f8587;
                }
            }
        } else {
            C9413 c9414 = (C9413) sparseArray.get(i);
            if (c9414 != null) {
                ArrayList arrayList2 = c9414.f30551;
                while (i2 < arrayList2.size()) {
                    if (((C2702) arrayList2.get(i2)).m8887(f, f)) {
                        return i2 == -1 ? c9414.f30550 : ((C2702) arrayList2.get(i2)).f8587;
                    }
                    i2++;
                }
                i2 = -1;
                if (i2 == -1) {
                }
            }
        }
        return -1;
    }
}
