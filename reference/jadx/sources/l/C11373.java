package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨ֨۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K6YZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11373 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7221 f38355;

    public C11373(C7221 c7221) {
        this.f38355 = c7221;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13490 m28478() {
        boolean z;
        boolean zIsSymbolicLink;
        ArrayList arrayList = new ArrayList();
        C7221 c7221 = this.f38355;
        AbstractC20745 abstractC20745M19205 = c7221.m19205();
        if (!abstractC20745M19205.mo33974()) {
            return new C13490(arrayList, 0);
        }
        int i = 0;
        for (AbstractC20745 abstractC20745 : abstractC20745M19205.mo33983(true)) {
            String name = abstractC20745.getName();
            if (!abstractC20745.mo33974() || name.startsWith(".tmp-") || name.equals("xref")) {
                z = false;
            } else {
                if (abstractC20745.m46723()) {
                    zIsSymbolicLink = true;
                } else {
                    try {
                        zIsSymbolicLink = C5212.isSymbolicLink(C22852.get(abstractC20745.mo33986(), new String[0]));
                    } catch (Exception unused) {
                        zIsSymbolicLink = false;
                    }
                }
                if (zIsSymbolicLink) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                try {
                    C19216 c19216M19208 = c7221.m19208(abstractC20745.getName());
                    if (!c19216M19208.f62065) {
                        arrayList.add(m28477(c19216M19208));
                    }
                } catch (Exception unused2) {
                    i++;
                }
            }
        }
        C23846.sort(arrayList, C21023.thenComparing(C21023.reversed(C7618.comparingLong(new C3526())), new C7497(2)));
        return new C13490(arrayList, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C4316 m28477(C19216 c19216) {
        boolean zMo33971;
        String name;
        Long lValueOf;
        C2455 c2455 = new C2455(c19216.f62061.m46690("original.apk"));
        try {
            C0465 c0465M30940 = C12461.m30940(c2455);
            c2455.close();
            String str = c0465M30940.f2096;
            if (str == null) {
                str = c0465M30940.f2101;
            }
            String str2 = str;
            long j = c19216.f62056;
            if (j < 0) {
                j = c19216.f62058;
            }
            long j2 = j;
            String str3 = c19216.f62066;
            String str4 = c19216.f62064;
            int i = 0;
            if (str4 == null || str4.isEmpty()) {
                zMo33971 = false;
            } else {
                try {
                    zMo33971 = C5553.m15313(str4, new String[0]).mo33971();
                } catch (RuntimeException unused) {
                    zMo33971 = false;
                }
            }
            String str5 = c19216.f62064;
            if (str5 == null || str5.isEmpty()) {
                name = null;
            } else {
                try {
                    name = C5553.m15313(str5, new String[0]).getName();
                } catch (RuntimeException unused2) {
                    name = null;
                }
            }
            String str6 = c0465M30940.f2093;
            String str7 = c0465M30940.f2098;
            String str8 = c0465M30940.f2095;
            if (str8 != null && !str8.isEmpty()) {
                while (true) {
                    if (i < str8.length()) {
                        char cCharAt = str8.charAt(i);
                        if (cCharAt >= '0' && cCharAt <= '9') {
                            i++;
                        }
                    } else {
                        try {
                            lValueOf = Long.valueOf(Long.parseLong(str8));
                            break;
                        } catch (NumberFormatException unused3) {
                            lValueOf = null;
                            break;
                        }
                    }
                    lValueOf = null;
                    break;
                }
            }
            lValueOf = null;
            break;
            return new C4316(str3, str4, zMo33971, name, str2, str6, str7, lValueOf, c19216.f62058, j2, c0465M30940.f2099, c0465M30940.f2094);
        } catch (Throwable th) {
            try {
                c2455.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
