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

/* JADX INFO: renamed from: l.ۢۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: DATI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9362 implements InterfaceC11747 {
    @Override // l.InterfaceC11747
    /* JADX INFO: renamed from: ۙ */
    public final void mo1396(C23473 c23473, Object obj, Object obj2, Type type) {
        boolean z;
        C13158 c13158 = c23473.f76006;
        C1162 c1162 = c23473.f76005;
        if (obj == null) {
            c13158.m32530();
            return;
        }
        Map treeMap = (Map) obj;
        Class<?> cls = treeMap.getClass();
        boolean z2 = (cls == C15676.class || cls == HashMap.class || cls == LinkedHashMap.class) && treeMap.containsKey("@type");
        if ((c13158.f43818 & EnumC3984.SortField.f14811) != 0) {
            if (treeMap instanceof C15676) {
                treeMap = ((C15676) treeMap).m37347();
            }
            if (!(treeMap instanceof SortedMap) && !(treeMap instanceof LinkedHashMap)) {
                try {
                    treeMap = new TreeMap(treeMap);
                } catch (Exception unused) {
                }
            }
        }
        IdentityHashMap identityHashMap = c23473.f76011;
        if (identityHashMap != null && identityHashMap.containsKey(obj)) {
            c23473.m51730(obj);
            return;
        }
        C22330 c22330 = c23473.f76000;
        c23473.m51727(c22330, obj, obj2);
        try {
            c13158.write(123);
            c23473.m51728();
            if ((c13158.f43818 & EnumC3984.WriteClassName.f14811) == 0 || z2) {
                z = true;
            } else {
                c1162.getClass();
                c13158.m32533("@type", false);
                c13158.m32531(obj.getClass().getName());
                z = false;
            }
            Class<?> cls2 = null;
            InterfaceC11747 interfaceC11747 = null;
            for (Map.Entry entry : treeMap.entrySet()) {
                Object value = entry.getValue();
                Object key = entry.getKey();
                ArrayList arrayList = c23473.f76004;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    Object objM22398 = key;
                    while (true) {
                        if (it.hasNext()) {
                            InterfaceC5396 interfaceC5396 = (InterfaceC5396) it.next();
                            if (objM22398 != null && !(objM22398 instanceof String)) {
                                objM22398 = AbstractC8620.m22398(objM22398);
                            }
                            if (!interfaceC5396.m14962()) {
                            }
                        }
                    }
                }
                ArrayList arrayList2 = c23473.f76001;
                if (arrayList2 != null) {
                    Object objM22399 = (key == null || (key instanceof String)) ? key : AbstractC8620.m22398(key);
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((InterfaceC2573) it2.next()).apply()) {
                            }
                        }
                    }
                }
                ArrayList arrayList3 = c23473.f75999;
                if (arrayList3 != null) {
                    if (key != null && !(key instanceof String)) {
                        key = AbstractC8620.m22398(key);
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        key = ((InterfaceC4690) it3.next()).m12997();
                    }
                }
                ArrayList arrayList4 = c23473.f76009;
                if (arrayList4 != null) {
                    Object objM223910 = (key == null || (key instanceof String)) ? key : AbstractC8620.m22398(key);
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        value = ((InterfaceC23036) it4.next()).m50969();
                    }
                }
                if (value != null || (c13158.f43818 & EnumC3984.WriteMapNullValue.f14811) != 0) {
                    if (key instanceof String) {
                        String str = (String) key;
                        if (!z) {
                            c13158.write(44);
                        }
                        if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                            c23473.m51723();
                        }
                        c13158.m32533(str, true);
                    } else {
                        if (!z) {
                            c13158.write(44);
                        }
                        if ((c13158.f43818 & EnumC3984.WriteNonStringKeyAsString.f14811) != 0 && !(key instanceof Enum)) {
                            c23473.m51726(AbstractC8620.m22398(key));
                        } else {
                            c23473.m51725(key);
                        }
                        c13158.write(58);
                    }
                    if (value == null) {
                        c13158.m32530();
                    } else {
                        Class<?> cls3 = value.getClass();
                        if (cls3 == cls2) {
                            interfaceC11747.mo1396(c23473, value, key, null);
                        } else {
                            InterfaceC11747 interfaceC11747M4271 = c1162.m4271(cls3);
                            interfaceC11747M4271.mo1396(c23473, value, key, null);
                            interfaceC11747 = interfaceC11747M4271;
                            cls2 = cls3;
                        }
                    }
                    z = false;
                }
            }
            c23473.f76000 = c22330;
            c23473.m51724();
            if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0 && treeMap.size() > 0) {
                c23473.m51723();
            }
            c13158.write(q.h);
        } catch (Throwable th) {
            c23473.f76000 = c22330;
            throw th;
        }
    }
}
