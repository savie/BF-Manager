package l;

import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬֨۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H78K */
/* JADX INFO: loaded from: classes3.dex */
public final class C12784 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7221 f42604;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18469 m31759(C7886 c7886) {
        if (c7886 == null) {
            return new C18469(false, null);
        }
        try {
            C1493 c1493M20809 = c7886.m20809();
            c1493M20809.mo5141();
            for (InterfaceC17721 interfaceC17721 : c1493M20809.mo17615()) {
                interfaceC17721.mo7941();
                Iterator it = interfaceC17721.mo19112().iterator();
                while (it.hasNext()) {
                    ((InterfaceC19133) it.next()).mo1519();
                }
            }
            return new C18469(true, null);
        } catch (Exception e) {
            return new C18469(false, e.getMessage() == null ? "Failed to parse resources.arsc" : e.getMessage());
        }
    }

    public C12784(C7221 c7221, C6433 c6433) {
        this.f42604 = c7221;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2199 m31758(C2455 c2455) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = c2455.getEntry("AndroidManifest.xml") != null;
        boolean z4 = c2455.getEntry("resources.arsc") != null;
        for (C12107 c12107 : c2455.m7489()) {
            if (!c12107.isDirectory()) {
                arrayList.add(C9878.m24972(c12107));
            }
        }
        try {
            z = !c2455.m7472(true).isEmpty();
        } catch (IOException unused) {
            z = false;
        }
        if (z3 && (z || z4)) {
            z2 = true;
        }
        return new C2199(arrayList, z2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0088: MOVE (r3 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:37:0x0088 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21956 m31768(AbstractC20745 abstractC20745, boolean z) {
        AbstractC20745 abstractC20745M19203;
        AbstractC20745 abstractC20746;
        String message;
        C7221 c7221 = this.f42604;
        AbstractC20745 abstractC20747 = null;
        int i = 0;
        try {
            try {
                C2455 c2455 = new C2455(abstractC20745);
                try {
                    C2199 c2199M31758 = m31758(c2455);
                    if (!c2199M31758.f7950) {
                        throw C12731.m31630("NOT_APK", "Not an APK");
                    }
                    try {
                        C0465 c0465M30940 = C12461.m30940(c2455);
                        C2581.m8038(c0465M30940.f2093);
                        abstractC20745M19203 = c7221.m19203();
                        try {
                            C19216 c19216M31761 = m31761(abstractC20745M19203, abstractC20745, C7221.m19190(c2455, abstractC20745M19203.m46690("original.apk")), z);
                            m31765(c2455, c19216M31761);
                            m31763(c2455, c19216M31761);
                            while (i < 100) {
                                String strM19207 = c7221.m19207();
                                C19216 c19216M31760 = m31760(c19216M31761, abstractC20745M19203, strM19207);
                                String str = c19216M31760.f62066;
                                C7221.m19194(abstractC20745M19203, c19216M31760);
                                if (c7221.m19204(abstractC20745M19203, strM19207)) {
                                    C19216 c19216M31762 = m31760(c19216M31760, c7221.m19206(str), str);
                                    C21956 c21956M31762 = m31762(c19216M31762, c2199M31758, c0465M30940);
                                    c21956M31762.f71234 = c19216M31762.f62056;
                                    try {
                                        c2455.close();
                                        return c21956M31762;
                                    } catch (Exception e) {
                                        e = e;
                                        i = 1;
                                        if (abstractC20745M19203 != null) {
                                            C7221.m19199(abstractC20745M19203);
                                            C15157.m36345();
                                        }
                                        if (i != 0) {
                                            if (e.getMessage() == null) {
                                                message = "Failed to create workspace.";
                                            } else {
                                                message = e.getMessage();
                                            }
                                            throw C12731.m31629(null, "WORKSPACE_CREATE_FAILED", message, "fatal");
                                        }
                                        throw C12731.m31630("NOT_APK", "Not an APK");
                                    }
                                }
                                i++;
                            }
                            throw new IOException("Unable to publish workspace");
                        } catch (Throwable th) {
                            th = th;
                            i = 1;
                            c2455.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        abstractC20745M19203 = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    abstractC20745M19203 = null;
                }
                try {
                    c2455.close();
                } catch (Throwable th4) {
                    try {
                        th.addSuppressed(th4);
                    } catch (Exception e2) {
                        e = e2;
                        if (abstractC20745M19203 != null) {
                            C7221.m19199(abstractC20745M19203);
                            C15157.m36345();
                        }
                        if (i != 0) {
                            if (e.getMessage() == null) {
                                message = "Failed to create workspace.";
                            } else {
                                message = e.getMessage();
                            }
                            throw C12731.m31629(null, "WORKSPACE_CREATE_FAILED", message, "fatal");
                        }
                        throw C12731.m31630("NOT_APK", "Not an APK");
                    }
                }
                throw th;
            } catch (C12731 e3) {
                e = e3;
                abstractC20747 = abstractC20746;
                if (abstractC20747 != null) {
                    C7221.m19199(abstractC20747);
                    C15157.m36345();
                }
                throw e;
            }
        } catch (C12731 e4) {
            e = e4;
            if (abstractC20747 != null) {
                C7221.m19199(abstractC20747);
                C15157.m36345();
            }
            throw e;
        } catch (Exception e5) {
            e = e5;
            abstractC20745M19203 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C19216 m31761(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, String str, boolean z) {
        C19216 c19216 = new C19216(abstractC20745, "");
        c19216.f62065 = z;
        c19216.f62064 = C6370.m17479(abstractC20746.mo24643(), "sourcePath");
        c19216.f62067 = abstractC20746.mo33964();
        c19216.f62069 = abstractC20746.mo33991();
        c19216.f62059 = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c19216.f62058 = jCurrentTimeMillis;
        c19216.f62056 = jCurrentTimeMillis;
        return c19216;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19216 m31760(C19216 c19216, AbstractC20745 abstractC20745, String str) {
        C19216 c19217 = new C19216(abstractC20745, str);
        c19217.f62065 = c19216.f62065;
        c19217.f62064 = c19216.f62064;
        c19217.f62067 = c19216.f62067;
        c19217.f62069 = c19216.f62069;
        c19217.f62059 = c19216.f62059;
        c19217.f62058 = c19216.f62058;
        c19217.f62056 = c19216.f62056;
        c19217.f62063.addAll(c19216.f62063);
        c19217.f62060 = c19216.f62060;
        c19217.f62068 = c19216.f62068;
        c19217.f62057 = c19216.f62057;
        c19217.f62055 = c19216.f62055;
        c19217.f62062 = c19216.f62062;
        return c19217;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m31765(C2455 c2455, C19216 c19216) {
        C12107 entry = c2455.getEntry("resources.arsc");
        if (entry == null) {
            c19216.f62060 = "absent";
            c19216.f62068 = null;
            return;
        }
        AbstractC20745 abstractC20745 = c19216.f62061;
        int i = C7221.f24051;
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("entries").m46690("resources.arsc");
        try {
            abstractC20745M46690.m46694(c2455.m7471(entry));
            c19216.f62057 = C7221.m19200(abstractC20745M46690);
            long jMo33964 = abstractC20745M46690.mo33964();
            c19216.f62055 = jMo33964;
            c19216.f62062 = true;
            try {
                C18469 c18469M31759 = m31759(new C7886(jMo33964, abstractC20745M46690, c19216.f62057));
                if (c18469M31759.f58847) {
                    c19216.f62060 = "available";
                    c19216.f62068 = null;
                } else {
                    m31766(c19216);
                    c19216.f62060 = "parse_error";
                    c19216.f62068 = c18469M31759.f58848;
                }
            } catch (Exception e) {
                m31766(c19216);
                c19216.f62060 = "parse_error";
                c19216.f62068 = e.getMessage() == null ? "Failed to parse resources.arsc" : e.getMessage();
            }
        } catch (Exception e2) {
            abstractC20745M46690.mo24647();
            m31766(c19216);
            c19216.f62060 = "extract_error";
            c19216.f62068 = e2.getMessage() == null ? "Failed to extract resources.arsc" : e2.getMessage();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31763(C2455 c2455, C19216 c19216) {
        ArrayList arrayList = c19216.f62063;
        AbstractC20745 abstractC20745 = c19216.f62061;
        arrayList.clear();
        boolean z = false;
        for (C12107 c12107 : c2455.m7472(true)) {
            String name = c12107.getName();
            if (z) {
                arrayList.add(new C7927(name, "skipped", "Skipped after previous dex error", null));
            } else {
                int i = C7221.f24051;
                AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("entries").m46690(name);
                try {
                    abstractC20745M46690.m46694(c2455.m7471(c12107));
                    C21966.m48797(abstractC20745M46690, C7221.m19198(abstractC20745, name));
                    arrayList.add(new C7927(name, "available", null, "cache/dex/" + name + ".type_index"));
                } catch (Exception e) {
                    arrayList.add(new C7927(name, d.O, e.getMessage() == null ? "Failed to open dex" : e.getMessage(), null));
                    z = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21956 m31767(C19216 c19216) throws C12731 {
        try {
            C2455 c2455 = new C2455(c19216.f62061.m46690("original.apk"));
            try {
                C21956 c21956M31762 = m31762(c19216, m31758(c2455), C12461.m30940(c2455));
                c2455.close();
                return c21956M31762;
            } catch (Throwable th) {
                try {
                    c2455.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
            throw C2664.m8200(c19216.f62064, c19216.f62065);
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21956 m31762(C19216 c19216, C2199 c2199, C0465 c0465) throws IOException {
        C7886 c7886;
        C18469 c18469;
        C18469 c18469M31759;
        boolean z;
        C21956 c21956;
        Iterator it;
        int i;
        DataInputStream dataInputStream;
        int i2;
        C9639 c9639;
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList<C7927> arrayList2 = c19216.f62063;
        AbstractC20745 abstractC20745 = c19216.f62061;
        for (C7927 c7927 : arrayList2) {
            if ("available".equals(c7927.f26034) && (str = c7927.f26035) != null) {
                arrayList.add(str);
            }
        }
        C3287 c3287 = new C3287();
        for (C7927 c7928 : arrayList2) {
            String str2 = c7928.f26035;
            String str3 = c7928.f26034;
            if (str2 != null) {
                if (d.O.equals(str3)) {
                    C9639 c96310 = new C9639(str2);
                    c96310.f32434 = false;
                    c3287.m9801(c96310);
                } else if ("skipped".equals(str3)) {
                    C9639 c96311 = new C9639(str2);
                    c96311.f32434 = false;
                    c3287.m9801(c96311);
                } else if (arrayList.contains(str2)) {
                    try {
                        int i3 = C7221.f24051;
                        c3287.m9801(C9639.m24541(str2, m31764(abstractC20745.m46690("entries").m46690(str2))));
                    } catch (Exception e) {
                        if (e.getMessage() != null) {
                            e.getMessage();
                        }
                        C9639 c96312 = new C9639(str2);
                        c96312.f32434 = false;
                        c3287.m9801(c96312);
                    }
                }
            }
        }
        if (!"available".equals(c19216.f62060)) {
            m31766(c19216);
            if (c19216.f62062) {
                try {
                    c19216.f62062 = false;
                    C7221.m19194(abstractC20745, c19216);
                } catch (IOException unused) {
                }
            }
            c7886 = null;
        } else {
            int i4 = C7221.f24051;
            AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("entries").m46690("resources.arsc");
            if (c19216.f62057 == null) {
                c19216.f62057 = C7221.m19200(abstractC20745M46690);
                c19216.f62055 = abstractC20745M46690.mo33964();
                c19216.f62062 = true;
            }
            C7886 c7887 = new C7886(c19216.f62055, abstractC20745M46690, c19216.f62057);
            if (c19216.f62062) {
                try {
                    c19216.f62062 = false;
                    C7221.m19194(abstractC20745, c19216);
                } catch (IOException unused2) {
                }
            }
            c7886 = c7887;
        }
        if ("absent".equals(c19216.f62060) || "extract_error".equals(c19216.f62060)) {
            c18469 = new C18469(false, c19216.f62068);
        } else {
            if ("parse_error".equals(c19216.f62060)) {
                String str4 = c19216.f62068;
                if (str4 == null) {
                    str4 = "Failed to parse resources.arsc";
                }
                c18469 = new C18469(false, str4);
            } else {
                c18469M31759 = m31759(c7886);
            }
            if (!"available".equals(c19216.f62060) || "parse_error".equals(c19216.f62060)) {
                z = true;
            } else {
                z = false;
            }
            c21956 = new C21956(this.f42604, c19216.f62066, c19216.f62065, c19216.f62061, c19216.f62064, c19216.f62067, c19216.f62069, c2199.f7949, arrayList, z, c19216.f62060, c19216.f62068, c0465, c3287, c18469M31759, c7886);
            ArrayList arrayList3 = new ArrayList();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (String str5 : c21956.f71224) {
                it = c21956.f71220.f12189.iterator();
                while (true) {
                    if (it.hasNext()) {
                        i = -1;
                        break;
                    }
                    c9639 = (C9639) it.next();
                    if (!c9639.f32434 && c9639.f32435.equals(str5)) {
                        i = c9639.f32436;
                        break;
                    }
                }
                c21956.f71231.getClass();
                AbstractC20745 abstractC20745M19198 = C7221.m19198(c21956.f71232, str5);
                dataInputStream = new DataInputStream(abstractC20745M19198.m46719());
                try {
                    if (dataInputStream.readInt() == 1296323657 || dataInputStream.readInt() != 2) {
                        throw new IOException("Invalid type index header");
                    }
                    int i5 = dataInputStream.readInt();
                    if (i5 < 0 || ((i >= 0 && i5 != i) || i5 > Math.max(0L, (abstractC20745M19198.mo33964() - 12) / 6))) {
                        throw new IOException("Invalid type index count");
                    }
                    ArrayList<C5032> arrayList4 = new ArrayList(Math.min(i5, 4096));
                    for (int i6 = 0; i6 < i5; i6++) {
                        String utf = dataInputStream.readUTF();
                        int i7 = dataInputStream.readInt();
                        if ((Integer.MIN_VALUE & i7) != 0) {
                            i7 &= Integer.MAX_VALUE;
                            i2 = dataInputStream.readInt();
                        } else {
                            i2 = 0;
                        }
                        arrayList4.add(new C5032(null, i7, i2, utf));
                    }
                    if (dataInputStream.read() != -1) {
                        throw new IOException("Trailing type index data");
                    }
                    dataInputStream.close();
                    for (C5032 c5032 : arrayList4) {
                        String str6 = c5032.f17548;
                        C9735.merge(map2, str6, 1, new C13582());
                        if (!map.containsKey(str6)) {
                            C5032 c5033 = new C5032(str5, c5032.f17546, c5032.f17545, str6);
                            map.put(str6, c5033);
                            arrayList3.add(c5033);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            c21956.f71221 = arrayList3;
            c21956.f71233 = map;
            c21956.f71230 = map2;
            ArrayList arrayList5 = new ArrayList(arrayList3);
            C23846.sort(arrayList5, new C0788());
            c21956.f71240 = arrayList5;
            return c21956;
        }
        c18469M31759 = c18469;
        if ("available".equals(c19216.f62060)) {
            z = true;
        } else {
            z = true;
        }
        c21956 = new C21956(this.f42604, c19216.f62066, c19216.f62065, c19216.f62061, c19216.f62064, c19216.f62067, c19216.f62069, c2199.f7949, arrayList, z, c19216.f62060, c19216.f62068, c0465, c3287, c18469M31759, c7886);
        ArrayList arrayList6 = new ArrayList();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        while (r4.hasNext()) {
            it = c21956.f71220.f12189.iterator();
            while (true) {
                if (it.hasNext()) {
                    i = -1;
                    break;
                }
                c9639 = (C9639) it.next();
                if (!c9639.f32434) {
                }
            }
            c21956.f71231.getClass();
            AbstractC20745 abstractC20745M19199 = C7221.m19198(c21956.f71232, str5);
            dataInputStream = new DataInputStream(abstractC20745M19199.m46719());
            if (dataInputStream.readInt() == 1296323657) {
            }
            throw new IOException("Invalid type index header");
        }
        c21956.f71221 = arrayList6;
        c21956.f71233 = map3;
        c21956.f71230 = map4;
        ArrayList arrayList7 = new ArrayList(arrayList6);
        C23846.sort(arrayList7, new C0788());
        c21956.f71240 = arrayList7;
        return c21956;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m31766(C19216 c19216) {
        if (c19216.f62057 != null || c19216.f62055 != -1) {
            c19216.f62062 = true;
        }
        c19216.f62057 = null;
        c19216.f62055 = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m31764(AbstractC20745 abstractC20745) throws IOException {
        InputStream inputStreamMo33970 = abstractC20745.mo33970();
        try {
            int i = UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            C19551 c19551 = new C19551(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
            byte[] bArr = new byte[8192];
            while (i > 0) {
                int i2 = inputStreamMo33970.read(bArr, 0, Math.min(8192, i));
                if (i2 == -1) {
                    break;
                }
                c19551.write(bArr, 0, i2);
                i -= i2;
            }
            byte[] bArr2 = c19551.f62829;
            int length = bArr2.length;
            int i3 = c19551.f62830;
            if (length == i3) {
                if (inputStreamMo33970 != null) {
                    inputStreamMo33970.close();
                }
                return bArr2;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr2, i3);
            if (inputStreamMo33970 != null) {
                inputStreamMo33970.close();
            }
            return bArrCopyOf;
        } catch (Throwable th) {
            if (inputStreamMo33970 != null) {
                try {
                    inputStreamMo33970.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
        if (inputStreamMo33970 != null) {
            inputStreamMo33970.close();
        }
        throw th;
    }
}
