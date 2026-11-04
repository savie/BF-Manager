package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41XE */
/* JADX INFO: loaded from: classes4.dex */
public final class C15856 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f51559;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f51560;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String[] f51561;

    public C15856(String str, String[] strArr) {
        this.f51560 = str;
        this.f51561 = strArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37816(String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            String strConcat = strArr[i];
            if (!strConcat.isEmpty() && !strConcat.endsWith(".")) {
                strConcat = strConcat.concat(".");
            }
            strArr[i] = "L" + strConcat.replace('.', '/');
        }
        this.f51559 = Arrays.asList(strArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m37815(C24975 c24975) {
        boolean z;
        int i;
        int i2;
        HashMap map = new HashMap();
        for (C22737 c22737 : (AbstractC8696) c24975.mo4327()) {
            map.put(c22737.getType(), c22737);
        }
        Iterator it = map.values().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            C22737 c22738 = (C22737) it.next();
            if (C23316.m52467(map, c22738)) {
                z = true;
                int i3 = 0;
                int i4 = 0;
                for (C4091 c4091 : c22738.m51271(true)) {
                    if (c4091.getName().startsWith("on") && c4091.mo13175() != null) {
                        try {
                            Iterator it2 = ((C14531) c4091.mo13175().mo2840()).iterator();
                            i = 0;
                            i2 = 0;
                            while (true) {
                                try {
                                    AbstractC4450 abstractC4450 = (AbstractC4450) it2;
                                    if (!abstractC4450.hasNext()) {
                                        break;
                                    }
                                    if (((InterfaceC23331) abstractC4450.next()).mo30864() == EnumC22631.f73424) {
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
    public static boolean m37814(C24975 c24975) {
        HashMap map = new HashMap();
        for (C22737 c22737 : (AbstractC8696) c24975.mo4327()) {
            map.put(c22737.getType(), c22737);
        }
        Iterator it = map.values().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                return false;
            }
            C22737 c22738 = (C22737) it.next();
            if (C23316.m52467(map, c22738)) {
                int i2 = 0;
                for (C4091 c4091 : c22738.m51271(true)) {
                    if (c4091.getName().startsWith("on")) {
                        if (EnumC2536.NATIVE.m8459(c4091.f13946)) {
                            System.out.println("Native: " + c4091);
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
