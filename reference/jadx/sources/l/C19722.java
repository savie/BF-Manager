package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 41XE */
/* JADX INFO: loaded from: classes4.dex */
public final class C19722 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f63293;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f63294;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String[] f63295;

    public C19722(String str, String[] strArr) {
        this.f63294 = str;
        this.f63295 = strArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44846(String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            String strConcat = strArr[i];
            if (!strConcat.isEmpty() && !strConcat.endsWith(".")) {
                strConcat = strConcat.concat(".");
            }
            strArr[i] = "L" + strConcat.replace('.', '/');
        }
        this.f63293 = Arrays.asList(strArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m44845(C17684 c17684) {
        boolean z;
        int i;
        int i2;
        HashMap map = new HashMap();
        for (C7807 c7807 : (AbstractC18494) c17684.mo34148()) {
            map.put(c7807.getType(), c7807);
        }
        Iterator it = map.values().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            C7807 c7808 = (C7807) it.next();
            if (C9139.m23466(map, c7808)) {
                z = true;
                int i3 = 0;
                int i4 = 0;
                for (C11770 c11770 : c7808.m20499(true)) {
                    if (c11770.getName().startsWith("on") && c11770.mo25747() != null) {
                        try {
                            Iterator it2 = ((C5419) c11770.mo25747().mo11508()).iterator();
                            i = 0;
                            i2 = 0;
                            while (true) {
                                try {
                                    AbstractC9943 abstractC9943 = (AbstractC9943) it2;
                                    if (!abstractC9943.hasNext()) {
                                        break;
                                    }
                                    if (((InterfaceC1594) abstractC9943.next()).mo5435() == EnumC10297.f35298) {
                                        i++;
                                    } else {
                                        i2++;
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        } catch (Throwable unused2) {
                            i = 0;
                            i2 = 0;
                        }
                        if (i2 > 2 || i <= 5) {
                            i4++;
                        } else {
                            i3++;
                        }
                    }
                }
                if (i3 > i4) {
                    break;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44844(C17684 c17684) {
        HashMap map = new HashMap();
        for (C7807 c7807 : (AbstractC18494) c17684.mo34148()) {
            map.put(c7807.getType(), c7807);
        }
        Iterator it = map.values().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                return false;
            }
            C7807 c7808 = (C7807) it.next();
            if (C9139.m23466(map, c7808)) {
                int i2 = 0;
                for (C11770 c11770 : c7808.m20499(true)) {
                    if (c11770.getName().startsWith("on")) {
                        if (EnumC15236.NATIVE.m36501(c11770.f39510)) {
                            System.out.println("Native: " + c11770);
                            i++;
                        } else {
                            i2++;
                        }
                    }
                }
                if (i > i2) {
                    return true;
                }
            }
        }
    }
}
