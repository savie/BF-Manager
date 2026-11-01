package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 41UK */
/* JADX INFO: loaded from: classes4.dex */
public final class C19597 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44691(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, boolean z, boolean z2, InterfaceC20302 interfaceC20302) {
        AbstractC20745 abstractC20745M46728 = C11904.f39941.m46728();
        abstractC20745M46728.m46739();
        try {
            C2455 c2455 = new C2455(abstractC20745);
            try {
                C12107 c12107M44689 = m44689(c2455);
                if (c12107M44689 == null) {
                    throw new C8142(R.string.MT_Protector);
                }
                C20178 c20178 = new C20178();
                C0545.m2555(c2455, c20178, null, abstractC20745M46728, interfaceC20302);
                if (interfaceC20302.mo45818()) {
                    c2455.close();
                    abstractC20745M46728.mo24647();
                    return;
                }
                interfaceC20302.mo45820();
                C18060 c18060M44690 = m44690(c2455.m7471(c12107M44689), c20178);
                if (interfaceC20302.mo45818()) {
                    c2455.close();
                    abstractC20745M46728.mo24647();
                } else {
                    C0545.m2557(abstractC20746, z, z2, interfaceC20302, c2455, abstractC20745M46728, c20178, c18060M44690, c12107M44689);
                    c2455.close();
                    abstractC20745M46728.mo24647();
                }
            } catch (Throwable th) {
                try {
                    c2455.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            abstractC20745M46728.mo24647();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12107 m44689(C2455 c2455) {
        for (C12107 c12107 : c2455.m7466()) {
            if (!c12107.isDirectory()) {
                String lowerCase = c12107.getName().toLowerCase();
                if (!lowerCase.contains("/") && lowerCase.startsWith("mapping") && lowerCase.endsWith(".bin")) {
                    return c12107;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18060 m44690(InputStream inputStream, C20178 c20178) throws IOException {
        c20178.m45607(new C23706(c20178));
        c20178.m45607(new C13267(new C15364()));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            C17367 c17367 = new C17367(bufferedInputStream);
            ArrayList<C18185> arrayList = new ArrayList();
            C14183.m34279(c17367, new C21713(arrayList));
            bufferedInputStream.close();
            C18060 c18060 = new C18060(0);
            for (C18185 c18185 : arrayList) {
                c18060.m42051(new C21588(C22697.m50267(new StringBuilder("L"), c18185.f58131, l.b), C22697.m50267(new StringBuilder("L"), c18185.f58133, l.b)));
            }
            for (C18185 c18186 : arrayList) {
                C12417 c12417 = (C12417) c20178.m45611(c18186.f58133);
                if (c12417 != null) {
                    c12417.mo2194((Object) c18186.f58131);
                    for (C18891 c18891 : c18186.f58132) {
                        String str = c18891.f61168;
                        C13953 c13953 = new C13953(c20178.m45610(c18060.m42050(str, str)));
                        String str2 = c18891.f61170;
                        String str3 = c18891.f61169;
                        for (C17355 c17355 : c12417.m2204()) {
                            if (c17355.m39114().equals(str2) && c17355.m39118().equals(c13953)) {
                                C15364.m36802(c17355).mo2194(str3);
                                break;
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (C8308 c8308 : c18186.f58134) {
                        arrayList2.add(MotionUtils.EASING_TYPE_FORMAT_START);
                        C2682 c2682 = new C2682(c8308.f28829);
                        while (c2682.m8220()) {
                            String strM8221 = c2682.m8221();
                            arrayList2.add(c20178.m45610(c18060.m42050(strM8221, strM8221)));
                        }
                        arrayList2.add(MotionUtils.EASING_TYPE_FORMAT_END);
                        String str4 = c8308.f28829;
                        String strSubstring = str4.substring(str4.indexOf(41) + 1);
                        arrayList2.add(c20178.m45610(c18060.m42050(strSubstring, strSubstring)));
                        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                        C4779 c4779 = new C4779(strArr, strArr.length);
                        arrayList2.clear();
                        String str5 = c8308.f28831;
                        String str6 = c8308.f28830;
                        for (C11006 c11006 : c12417.m2203()) {
                            if (c11006.m39114().equals(str5) && c11006.m39118().equals(c4779)) {
                                C15364.m36802(c11006).mo2194(str6);
                                break;
                            }
                        }
                    }
                }
            }
            C18060 c18061 = new C18060(0);
            c20178.m45607(new C20883(c18061));
            return c18061;
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
