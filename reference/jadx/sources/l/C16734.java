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

/* JADX INFO: renamed from: l.ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31AL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16734 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f53595;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public SparseArray f53596 = new SparseArray();

    public C16734(Context context, XmlResourceParser xmlResourceParser) {
        this.f53595 = -1;
        new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C16029.f51897);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f53595 = typedArrayObtainStyledAttributes.getResourceId(index, this.f53595);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            C20262 c20262 = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                C20262 c20263 = new C20262(context, xmlResourceParser);
                                this.f53596.put(c20263.f65709, c20263);
                                c20262 = c20263;
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
                                C0505 c0505 = new C0505(context, xmlResourceParser);
                                if (c20262 != null) {
                                    c20262.f65708.add(c0505);
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
    public final int m39249(float f, float f2, int i, int i2) {
        C20262 c20262 = (C20262) this.f53596.get(i2);
        if (c20262 == null) {
            return i2;
        }
        ArrayList<C0505> arrayList = c20262.f65708;
        int i3 = c20262.f65707;
        if (f != -1.0f && f2 != -1.0f) {
            C0505 c0505 = null;
            for (C0505 c0506 : arrayList) {
                if (c0506.m2393(f, f2)) {
                    if (i != c0506.f2195) {
                        c0505 = c0506;
                    }
                }
            }
            return c0505 != null ? c0505.f2195 : i3;
        }
        if (i3 != i) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (i == ((C0505) it.next()).f2195) {
                }
            }
            return i3;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39250(int i) {
        C20262 c20262;
        float f = -1;
        int i2 = 0;
        SparseArray sparseArray = this.f53596;
        if (-1 == i) {
            if (i == -1) {
                c20262 = (C20262) sparseArray.valueAt(0);
            } else {
                c20262 = (C20262) sparseArray.get(-1);
            }
            if (c20262 != null) {
                ArrayList arrayList = c20262.f65708;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((C0505) arrayList.get(i2)).m2393(f, f)) {
                        break;
                    }
                    i2++;
                }
                if (-1 != i2) {
                    return i2 == -1 ? c20262.f65707 : ((C0505) arrayList.get(i2)).f2195;
                }
            }
        } else {
            C20262 c20263 = (C20262) sparseArray.get(i);
            if (c20263 != null) {
                ArrayList arrayList2 = c20263.f65708;
                while (i2 < arrayList2.size()) {
                    if (((C0505) arrayList2.get(i2)).m2393(f, f)) {
                        return i2 == -1 ? c20263.f65707 : ((C0505) arrayList2.get(i2)).f2195;
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
