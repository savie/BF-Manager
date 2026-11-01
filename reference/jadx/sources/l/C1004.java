package l;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1AK */
/* JADX INFO: loaded from: classes2.dex */
public final class C1004 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static HashMap f4689;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f4690 = new HashMap();

    static {
        HashMap map = new HashMap();
        f4689 = map;
        try {
            map.put("KeyAttribute", C7665.class.getConstructor(null));
            map.put("KeyPosition", C3826.class.getConstructor(null));
            map.put("KeyCycle", C20365.class.getConstructor(null));
            map.put("KeyTimeCycle", C15117.class.getConstructor(null));
            map.put("KeyTrigger", C17938.class.getConstructor(null));
        } catch (NoSuchMethodException unused) {
        }
    }

    public C1004(Context context, XmlResourceParser xmlResourceParser) {
        HashMap map;
        try {
            int eventType = xmlResourceParser.getEventType();
            AbstractC9077 abstractC9077 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    HashMap map2 = f4689;
                    if (map2.containsKey(name)) {
                        try {
                            AbstractC9077 abstractC9078 = (AbstractC9077) ((Constructor) map2.get(name)).newInstance(null);
                            try {
                                abstractC9078.mo11119(context, Xml.asAttributeSet(xmlResourceParser));
                                HashMap map3 = this.f4690;
                                if (!map3.containsKey(Integer.valueOf(abstractC9078.f30945))) {
                                    map3.put(Integer.valueOf(abstractC9078.f30945), new ArrayList());
                                }
                                ((ArrayList) map3.get(Integer.valueOf(abstractC9078.f30945))).add(abstractC9078);
                            } catch (Exception unused) {
                            }
                            abstractC9077 = abstractC9078;
                        } catch (Exception unused2) {
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute") && abstractC9077 != null && (map = abstractC9077.f30944) != null) {
                        C9824.m24925(context, xmlResourceParser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused3) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3833(C8061 c8061) {
        Integer numValueOf = Integer.valueOf(c8061.f28251);
        HashMap map = this.f4690;
        ArrayList arrayList = (ArrayList) map.get(numValueOf);
        if (arrayList != null) {
            c8061.m21228(arrayList);
        }
        ArrayList<AbstractC9077> arrayList2 = (ArrayList) map.get(-1);
        if (arrayList2 != null) {
            for (AbstractC9077 abstractC9077 : arrayList2) {
                String str = ((C11795) c8061.f28260.getLayoutParams()).f39606;
                String str2 = abstractC9077.f30943;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    c8061.m21229(abstractC9077);
                }
            }
        }
    }
}
