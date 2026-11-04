package l;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ᩳ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18949 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f61453 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final AbstractC3990 f61454;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Class f61455 = AbstractC9035.class;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C9955 f61456;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43984(Class cls) {
        Class cls2;
        if (!AbstractC22701.class.isAssignableFrom(cls) && (cls2 = f61455) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m44003(int i, List list, InterfaceC18356 interfaceC18356, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C21560) interfaceC18356).m49024(i, z, list);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m43993(int i, List list, InterfaceC18356 interfaceC18356, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C21560) interfaceC18356).m49011(i, z, list);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m43986(int i, List list, InterfaceC18356 interfaceC18356, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C21560) interfaceC18356).m49003(i, z, list);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m43994(int i, List list, InterfaceC18356 interfaceC18356, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C21560) interfaceC18356).m49012(i, z, list);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m43995(int i, List list, InterfaceC18356 interfaceC18356, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C21560) interfaceC18356).m49013(i, z, list);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m43998(int i, List list, InterfaceC18356 interfaceC18356, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C21560) interfaceC18356).m49017(i, z, list);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m43989(int i, List list, InterfaceC18356 interfaceC18356, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C21560) interfaceC18356).m49008(i, z, list);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m43991(int i, List list, InterfaceC18356 interfaceC18356, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C21560) interfaceC18356).m49009(i, z, list);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m43996(int i, List list, InterfaceC18356 interfaceC18356, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C21560) interfaceC18356).m49014(i, z, list);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m44006(int i, List list, InterfaceC18356 interfaceC18356, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C21560) interfaceC18356).m49028(i, z, list);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m44005(int i, List list, InterfaceC18356 interfaceC18356, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C21560) interfaceC18356).m49027(i, z, list);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43976(int i, List list, InterfaceC18356 interfaceC18356, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C21560) interfaceC18356).m48989(i, z, list);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m43988(int i, List list, InterfaceC18356 interfaceC18356, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C21560) interfaceC18356).m49007(i, z, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43983(int i, List list, InterfaceC18356 interfaceC18356, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C21560) interfaceC18356).m49002(i, z, list);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m44002(int i, List list, InterfaceC18356 interfaceC18356, InterfaceC7762 interfaceC7762) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C21560 c21560 = (C21560) interfaceC18356;
        c21560.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c21560.m49022(i, list.get(i2), interfaceC7762);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43982(int i, List list, InterfaceC18356 interfaceC18356, InterfaceC7762 interfaceC7762) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C21560 c21560 = (C21560) interfaceC18356;
        c21560.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c21560.m48996(i, list.get(i2), interfaceC7762);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m43987(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C13749)) {
            int iM35762 = 0;
            while (i < size) {
                iM35762 += AbstractC14846.m35762(((Long) list.get(i)).longValue());
                i++;
            }
            return iM35762;
        }
        C13749 c13749 = (C13749) list;
        int iM35763 = 0;
        while (i < size) {
            iM35763 += AbstractC14846.m35762(c13749.getLong(i));
            i++;
        }
        return iM35763;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int m43990(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C13749)) {
            int iM35762 = 0;
            while (i < size) {
                iM35762 += AbstractC14846.m35762(((Long) list.get(i)).longValue());
                i++;
            }
            return iM35762;
        }
        C13749 c13749 = (C13749) list;
        int iM35763 = 0;
        while (i < size) {
            iM35763 += AbstractC14846.m35762(c13749.getLong(i));
            i++;
        }
        return iM35763;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m43997(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C13749)) {
            int iM35762 = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM35762 += AbstractC14846.m35762((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
            return iM35762;
        }
        C13749 c13749 = (C13749) list;
        int iM35763 = 0;
        while (i < size) {
            long j = c13749.getLong(i);
            iM35763 += AbstractC14846.m35762((j >> 63) ^ (j << 1));
            i++;
        }
        return iM35763;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43978(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C19717)) {
            int iM35762 = 0;
            while (i < size) {
                iM35762 += AbstractC14846.m35762(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM35762;
        }
        C19717 c19717 = (C19717) list;
        int iM35763 = 0;
        while (i < size) {
            iM35763 += AbstractC14846.m35762(c19717.getInt(i));
            i++;
        }
        return iM35763;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m44000(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C19717)) {
            int iM35762 = 0;
            while (i < size) {
                iM35762 += AbstractC14846.m35762(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM35762;
        }
        C19717 c19717 = (C19717) list;
        int iM35763 = 0;
        while (i < size) {
            iM35763 += AbstractC14846.m35762(c19717.getInt(i));
            i++;
        }
        return iM35763;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int m43992(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C19717)) {
            int iM35763 = 0;
            while (i < size) {
                iM35763 += AbstractC14846.m35763(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM35763;
        }
        C19717 c19717 = (C19717) list;
        int iM35764 = 0;
        while (i < size) {
            iM35764 += AbstractC14846.m35763(c19717.getInt(i));
            i++;
        }
        return iM35764;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m44004(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C19717)) {
            int iM35763 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM35763 += AbstractC14846.m35763((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iM35763;
        }
        C19717 c19717 = (C19717) list;
        int iM35764 = 0;
        while (i < size) {
            int i2 = c19717.getInt(i);
            iM35764 += AbstractC14846.m35763((i2 >> 31) ^ (i2 << 1));
            i++;
        }
        return iM35764;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43977(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC14846.m35767(i) * size;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m43999(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC14846.m35765(i) + 8) * size;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC3990 m43981() {
        return f61454;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9955 m44001() {
        return f61456;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        AbstractC3990 abstractC3990 = null;
        if (C1007.class != 0) {
            try {
                abstractC3990 = (AbstractC3990) C1007.class.getConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
        }
        f61454 = abstractC3990;
        f61456 = new C9955();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43985(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m43980(Object obj, int i, List list, InterfaceC11512 interfaceC11512, Object obj2, AbstractC3990 abstractC3990) {
        if (interfaceC11512 == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int iIntValue = num.intValue();
                if (interfaceC11512.mo2924(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = m43979(obj, i, iIntValue, obj2, abstractC3990);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
            return obj2;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Integer) it.next()).intValue();
            if (!interfaceC11512.mo2924(iIntValue2)) {
                obj2 = m43979(obj, i, iIntValue2, obj2, abstractC3990);
                it.remove();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m43979(Object obj, int i, int i2, Object obj2, AbstractC3990 abstractC3990) {
        if (obj2 == null) {
            obj2 = abstractC3990.mo3889(obj);
        }
        abstractC3990.mo3902(i, i2, obj2);
        return obj2;
    }
}
