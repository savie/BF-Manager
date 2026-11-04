package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5S8 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C16043 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f52043 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f52044;

    public C16043(HashMap map) {
        this.f52044 = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC9330 enumC9330 = (EnumC9330) entry.getValue();
            List arrayList = (List) this.f52043.get(enumC9330);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f52043.put(enumC9330, arrayList);
            }
            arrayList.add((C23503) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38209(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330, Object obj) {
        HashMap map = this.f52043;
        m38208((List) map.get(enumC9330), interfaceC11217, enumC9330, obj);
        m38208((List) map.get(EnumC9330.ON_ANY), interfaceC11217, enumC9330, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38208(List list, InterfaceC11217 interfaceC11217, EnumC9330 enumC9330, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C23503 c23503 = (C23503) list.get(size);
                Method method = c23503.f75984;
                try {
                    int i = c23503.f75983;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC11217);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC11217, enumC9330);
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
