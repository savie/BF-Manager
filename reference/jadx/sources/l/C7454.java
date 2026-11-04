package l;

import com.alipay.sdk.m.y.q;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۜ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DATI */
/* JADX INFO: loaded from: classes4.dex */
public final class C7454 implements InterfaceC10591 {
    @Override // l.InterfaceC10591
    /* JADX INFO: renamed from: ۙ */
    public final void mo3063(C9690 c9690, Object obj, Object obj2, Type type) {
        boolean z;
        C5372 c5372 = c9690.f31276;
        C12829 c12829 = c9690.f31277;
        if (obj == null) {
            c5372.m16046();
            return;
        }
        Map treeMap = (Map) obj;
        Class<?> cls = treeMap.getClass();
        boolean z2 = (cls == C14691.class || cls == HashMap.class || cls == LinkedHashMap.class) && treeMap.containsKey("@type");
        if ((c5372.f18847 & EnumC1643.SortField.f5702) != 0) {
            if (treeMap instanceof C14691) {
                treeMap = ((C14691) treeMap).m35338();
            }
            if (!(treeMap instanceof SortedMap) && !(treeMap instanceof LinkedHashMap)) {
                try {
                    treeMap = new TreeMap(treeMap);
                } catch (Exception unused) {
                }
            }
        }
        IdentityHashMap identityHashMap = c9690.f31286;
        if (identityHashMap != null && identityHashMap.containsKey(obj)) {
            c9690.m25282(obj);
            return;
        }
        C15066 c15066 = c9690.f31285;
        c9690.m25279(c15066, obj, obj2);
        try {
            c5372.write(123);
            c9690.m25280();
            if ((c5372.f18847 & EnumC1643.WriteClassName.f5702) == 0 || z2) {
                z = true;
            } else {
                c12829.getClass();
                c5372.m16049("@type", false);
                c5372.m16047(obj.getClass().getName());
                z = false;
            }
            Class<?> cls2 = null;
            InterfaceC10591 interfaceC10591 = null;
            for (Map.Entry entry : treeMap.entrySet()) {
                Object value = entry.getValue();
                Object key = entry.getKey();
                ArrayList arrayList = c9690.f31278;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    Object objM30927 = key;
                    while (true) {
                        if (it.hasNext()) {
                            InterfaceC19542 interfaceC19542 = (InterfaceC19542) it.next();
                            if (objM30927 != null && !(objM30927 instanceof String)) {
                                objM30927 = AbstractC12454.m30927(objM30927);
                            }
                            if (!interfaceC19542.m45077()) {
                            }
                        }
                    }
                }
                ArrayList arrayList2 = c9690.f31274;
                if (arrayList2 != null) {
                    Object objM30928 = (key == null || (key instanceof String)) ? key : AbstractC12454.m30927(key);
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((InterfaceC22526) it2.next()).apply()) {
                            }
                        }
                    }
                }
                ArrayList arrayList3 = c9690.f31279;
                if (arrayList3 != null) {
                    if (key != null && !(key instanceof String)) {
                        key = AbstractC12454.m30927(key);
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        key = ((InterfaceC4626) it3.next()).m14437();
                    }
                }
                ArrayList arrayList4 = c9690.f31282;
                if (arrayList4 != null) {
                    Object objM30929 = (key == null || (key instanceof String)) ? key : AbstractC12454.m30927(key);
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        value = ((InterfaceC24764) it4.next()).m55268();
                    }
                }
                if (value != null || (c5372.f18847 & EnumC1643.WriteMapNullValue.f5702) != 0) {
                    if (key instanceof String) {
                        String str = (String) key;
                        if (!z) {
                            c5372.write(44);
                        }
                        if ((c5372.f18847 & EnumC1643.PrettyFormat.f5702) != 0) {
                            c9690.m25283();
                        }
                        c5372.m16049(str, true);
                    } else {
                        if (!z) {
                            c5372.write(44);
                        }
                        if ((c5372.f18847 & EnumC1643.WriteNonStringKeyAsString.f5702) != 0 && !(key instanceof Enum)) {
                            c9690.m25278(AbstractC12454.m30927(key));
                        } else {
                            c9690.m25277(key);
                        }
                        c5372.write(58);
                    }
                    if (value == null) {
                        c5372.m16046();
                    } else {
                        Class<?> cls3 = value.getClass();
                        if (cls3 == cls2) {
                            interfaceC10591.mo3063(c9690, value, key, null);
                        } else {
                            InterfaceC10591 interfaceC10591M31835 = c12829.m31835(cls3);
                            interfaceC10591M31835.mo3063(c9690, value, key, null);
                            interfaceC10591 = interfaceC10591M31835;
                            cls2 = cls3;
                        }
                    }
                    z = false;
                }
            }
            c9690.f31285 = c15066;
            c9690.m25276();
            if ((c5372.f18847 & EnumC1643.PrettyFormat.f5702) != 0 && treeMap.size() > 0) {
                c9690.m25283();
            }
            c5372.write(q.h);
        } catch (Throwable th) {
            c9690.f31285 = c15066;
            throw th;
        }
    }
}
