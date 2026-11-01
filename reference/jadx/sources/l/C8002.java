package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۠ۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5S8 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class C8002 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f26242 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f26243;

    public C8002(HashMap map) {
        this.f26243 = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC1651 enumC1651 = (EnumC1651) entry.getValue();
            List arrayList = (List) this.f26242.get(enumC1651);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f26242.put(enumC1651, arrayList);
            }
            arrayList.add((C19291) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21067(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651, Object obj) {
        HashMap map = this.f26242;
        m21066((List) map.get(enumC1651), interfaceC1423, enumC1651, obj);
        m21066((List) map.get(EnumC1651.ON_ANY), interfaceC1423, enumC1651, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21066(List list, InterfaceC1423 interfaceC1423, EnumC1651 enumC1651, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C19291 c19291 = (C19291) list.get(size);
                Method method = c19291.f62258;
                try {
                    int i = c19291.f62257;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC1423);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC1423, enumC1651);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
