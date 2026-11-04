package l;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1AK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16061 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static HashMap f52062;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f52063 = new HashMap();

    static {
        HashMap map = new HashMap();
        f52062 = map;
        try {
            map.put("KeyAttribute", C19286.class.getConstructor(null));
            map.put("KeyPosition", C3383.class.getConstructor(null));
            map.put("KeyCycle", C9589.class.getConstructor(null));
            map.put("KeyTimeCycle", C6367.class.getConstructor(null));
            map.put("KeyTrigger", C4129.class.getConstructor(null));
        } catch (NoSuchMethodException unused) {
        }
    }

    public C16061(Context context, XmlResourceParser xmlResourceParser) {
        HashMap map;
        try {
            int eventType = xmlResourceParser.getEventType();
            AbstractC0641 abstractC0641 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    HashMap map2 = f52062;
                    if (map2.containsKey(name)) {
                        try {
                            AbstractC0641 abstractC0642 = (AbstractC0641) ((Constructor) map2.get(name)).newInstance(null);
                            try {
                                abstractC0642.mo2826(context, Xml.asAttributeSet(xmlResourceParser));
                                HashMap map3 = this.f52063;
                                if (!map3.containsKey(Integer.valueOf(abstractC0642.f2498))) {
                                    map3.put(Integer.valueOf(abstractC0642.f2498), new ArrayList());
                                }
                                ((ArrayList) map3.get(Integer.valueOf(abstractC0642.f2498))).add(abstractC0642);
                            } catch (Exception unused) {
                            }
                            abstractC0641 = abstractC0642;
                        } catch (Exception unused2) {
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute") && abstractC0641 != null && (map = abstractC0641.f2497) != null) {
                        C15380.m36838(context, xmlResourceParser, map);
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
    public final void m38219(C21283 c21283) {
        Integer numValueOf = Integer.valueOf(c21283.f67849);
        HashMap map = this.f52063;
        ArrayList arrayList = (ArrayList) map.get(numValueOf);
        if (arrayList != null) {
            c21283.m48462(arrayList);
        }
        ArrayList<AbstractC0641> arrayList2 = (ArrayList) map.get(-1);
        if (arrayList2 != null) {
            for (AbstractC0641 abstractC0641 : arrayList2) {
                String str = ((C11651) c21283.f67855.getLayoutParams()).f37696;
                String str2 = abstractC0641.f2500;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    c21283.m48463(abstractC0641);
                }
            }
        }
    }
}
