package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6YZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2883 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20893 f9468;

    public C2883(C20893 c20893) {
        this.f9468 = c20893;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9594 m9499() {
        boolean z;
        boolean zIsSymbolicLink;
        ArrayList arrayList = new ArrayList();
        C20893 c20893 = this.f9468;
        AbstractC22044 abstractC22044M47755 = c20893.m47755();
        if (!abstractC22044M47755.mo4281()) {
            return new C9594(arrayList, 0);
        }
        int i = 0;
        for (AbstractC22044 abstractC22044 : abstractC22044M47755.mo4299(true)) {
            String name = abstractC22044.getName();
            if (!abstractC22044.mo4281() || name.startsWith(".tmp-") || name.equals("xref")) {
                z = false;
            } else {
                if (abstractC22044.m49860()) {
                    zIsSymbolicLink = true;
                } else {
                    try {
                        zIsSymbolicLink = C3445.isSymbolicLink(C14631.get(abstractC22044.mo4294(), new String[0]));
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
                    C16417 c16417M47758 = c20893.m47758(abstractC22044.getName());
                    if (!c16417M47758.f53275) {
                        arrayList.add(m9498(c16417M47758));
                    }
                } catch (Exception unused2) {
                    i++;
                }
            }
        }
        C12884.sort(arrayList, C8627.thenComparing(C8627.reversed(C2661.comparingLong(new C10340())), new C19297(2)));
        return new C9594(arrayList, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1392 m9498(C16417 c16417) {
        boolean zMo4304;
        String name;
        Long lValueOf;
        C22941 c22941 = new C22941(c16417.f53271.m49876("original.apk"));
        try {
            C7139 c7139M14548 = C4684.m14548(c22941);
            c22941.close();
            String str = c7139M14548.f23603;
            if (str == null) {
                str = c7139M14548.f23610;
            }
            String str2 = str;
            long j = c16417.f53280;
            if (j < 0) {
                j = c16417.f53269;
            }
            long j2 = j;
            String str3 = c16417.f53281;
            String str4 = c16417.f53276;
            int i = 0;
            if (str4 == null || str4.isEmpty()) {
                zMo4304 = false;
            } else {
                try {
                    zMo4304 = C14584.m35193(str4, new String[0]).mo4304();
                } catch (RuntimeException unused) {
                    zMo4304 = false;
                }
            }
            String str5 = c16417.f53276;
            if (str5 == null || str5.isEmpty()) {
                name = null;
            } else {
                try {
                    name = C14584.m35193(str5, new String[0]).getName();
                } catch (RuntimeException unused2) {
                    name = null;
                }
            }
            String str6 = c7139M14548.f23607;
            String str7 = c7139M14548.f23606;
            String str8 = c7139M14548.f23602;
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
            return new C1392(str3, str4, zMo4304, name, str2, str6, str7, lValueOf, c16417.f53269, j2, c7139M14548.f23605, c7139M14548.f23611);
        } catch (Throwable th) {
            try {
                c22941.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
