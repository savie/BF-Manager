package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۚܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C5429 {
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m15003() {
        return C11904.m29695().m46690("protector/tasks/" + C1709.m5696().toLowerCase());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m15001(C11780 c11780) {
        return C11904.m29695().m46690("protector/export/" + C1709.m5696().toLowerCase() + "_" + c11780.f39567 + ".apk");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m15005(C11780 c11780) {
        c11780.f39567.getClass();
        return m15003().m46690(c11780.f39567);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15002(AbstractC20745 abstractC20745, C11780 c11780) {
        if (c11780.f39567.equals(abstractC20745.getName()) && c11780.f39569.equalsIgnoreCase(C1709.m5696())) {
            return c11780.f39568.equals(C3907.m11362(abstractC20745.m46690("packageLocal"), "MD5"));
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m15000() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC20745 abstractC20745 : m15003().mo33983(true)) {
            if (abstractC20745.mo33974()) {
                AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("info");
                AbstractC20745 abstractC20745M46691 = abstractC20745.m46690("packageLocal");
                AbstractC20745 abstractC20745M46692 = abstractC20745.m46690("packageUpload");
                if (abstractC20745M46690.mo33975() && abstractC20745M46691.mo33975() && abstractC20745M46692.mo33975()) {
                    try {
                        C11780 c11780M29446 = C11780.m29446(abstractC20745M46690.m46727());
                        if (!m15002(abstractC20745, c11780M29446)) {
                            throw new Exception();
                        }
                        if (ServiceC23069.m51046(c11780M29446.f39567)) {
                            c11780M29446.f39566 = -1;
                        } else if (ServiceC23069.f74950.contains(c11780M29446.f39567)) {
                            c11780M29446.f39566 = -2;
                        } else {
                            c11780M29446.f39566 = -3;
                        }
                        arrayList.add(c11780M29446);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static List m15004() {
        List<C11780> listM13091 = C4723.m13091();
        for (C11780 c11780 : listM13091) {
            AbstractC20745 abstractC20745M15005 = m15005(c11780);
            AbstractC20745 abstractC20745M46690 = abstractC20745M15005.m46690("info");
            AbstractC20745 abstractC20745M46691 = abstractC20745M15005.m46690("packageLocal");
            AbstractC20745 abstractC20745M46692 = abstractC20745M15005.m46690("packageUpload");
            if (!abstractC20745M46690.mo33975() || !abstractC20745M46691.mo33975()) {
                c11780.f39566 = -4;
            } else {
                if (abstractC20745M46692.mo33975()) {
                    abstractC20745M46692.mo24647();
                }
                try {
                    C11780 c11780M29446 = C11780.m29446(abstractC20745M46690.m46727());
                    if (c11780M29446.f39567.equals(c11780.f39567) && m15002(abstractC20745M15005, c11780M29446)) {
                        c11780.f39564 = c11780M29446.f39564;
                        c11780.f39568 = c11780M29446.f39568;
                        c11780.f39573 = c11780M29446.f39573;
                    } else {
                        c11780.f39566 = -4;
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(listM13091);
        return listM13091;
    }
}
