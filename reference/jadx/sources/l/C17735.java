package l;

import java.io.IOException;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܽܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5XS */
/* JADX INFO: loaded from: classes4.dex */
public final class C17735 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41542(C12275 c12275, long j) {
        C7033 c7033 = c12275.f39464;
        if (c7033 != null) {
            for (C9775 c9775 : c7033.f23208) {
                switch (C25195.f81431[c9775.mo2083().ordinal()]) {
                    case 1:
                        if (((C8546) c9775).mo15898() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        if (((InterfaceC21204) c9775).mo15898() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 6:
                        if (((C15742) c9775).mo15898() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 7:
                        if (((C23948) c9775).mo15898() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 8:
                        Iterator itM30630 = ((C12253) c9775).m30630();
                        while (itM30630.hasNext()) {
                            if (j == ((C20458) itM30630.next()).f65550) {
                                return true;
                            }
                        }
                        break;
                    case 9:
                        Iterator itM2085 = ((C0343) c9775).m2085();
                        while (itM2085.hasNext()) {
                            C18242 c18242 = (C18242) itM2085.next();
                            int i = (c18242.f59555 + c18242.f59554) - 1;
                            long j2 = 0;
                            int i2 = 0;
                            while (i >= c18242.f59555) {
                                j2 = (j2 << (i2 * 8)) | ((long) (c18242.f59553[i] & 255));
                                i--;
                                i2++;
                            }
                            if (j2 == j) {
                                return true;
                            }
                        }
                        break;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41543(C12275 c12275, String str) {
        if (c12275.f39463.f19210.m10827().toLowerCase().contains(str)) {
            return true;
        }
        C7033 c7033 = c12275.f39464;
        if (c7033 != null) {
            for (AbstractC24188 abstractC24188 : c7033.f23208) {
                switch (C25195.f81431[abstractC24188.mo2083().ordinal()]) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        EnumC18966 enumC18966 = abstractC24188.f78334.f25843;
                        if (enumC18966 == EnumC18966.string) {
                            if (((C3282) ((AbstractC14490) abstractC24188).m35002()).m10827().toLowerCase().contains(str)) {
                                return true;
                            }
                        } else if (enumC18966 == EnumC18966.method) {
                            C5520 c5520 = (C5520) ((AbstractC14490) abstractC24188).m35002();
                            if (c5520.f19210.m10827().toLowerCase().contains(str) || c5520.f19209.m46860().toLowerCase().contains(str) || c5520.f19208.m39476().toLowerCase().contains(str)) {
                                return true;
                            }
                        } else if (enumC18966 != EnumC18966.field) {
                            continue;
                        } else {
                            C13548 c13548 = (C13548) ((AbstractC14490) abstractC24188).m35002();
                            if (c13548.f43034.m10827().toLowerCase().contains(str) || c13548.f43032.m46860().toLowerCase().contains(str) || c13548.f43033.m46860().toLowerCase().contains(str)) {
                                return true;
                            }
                        }
                        break;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41544(C12275 c12275, Pattern pattern) {
        C18481 c18481 = new C18481(c12275.f39464);
        StringBuilder sb = new StringBuilder(4096);
        try {
            c18481.m43068(new C5890(sb));
            return pattern.matcher(sb.toString()).find();
        } catch (IOException unused) {
            return false;
        }
    }
}
