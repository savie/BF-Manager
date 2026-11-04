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

/* JADX INFO: renamed from: l.᩷ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H78K */
/* JADX INFO: loaded from: classes.dex */
public final class C22034 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20893 f71063;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9462 m49812(C2751 c2751) {
        if (c2751 == null) {
            return new C9462(false, null);
        }
        try {
            C24296 c24296M9101 = c2751.m9101();
            c24296M9101.mo15674();
            for (InterfaceC10869 interfaceC10869 : c24296M9101.mo15672()) {
                interfaceC10869.mo19820();
                Iterator it = interfaceC10869.mo19822().iterator();
                while (it.hasNext()) {
                    ((InterfaceC15344) it.next()).mo4328();
                }
            }
            return new C9462(true, null);
        } catch (Exception e) {
            return new C9462(false, e.getMessage() == null ? "Failed to parse resources.arsc" : e.getMessage());
        }
    }

    public C22034(C20893 c20893, C22780 c22780) {
        this.f71063 = c20893;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8849 m49811(C22941 c22941) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = c22941.getEntry("AndroidManifest.xml") != null;
        boolean z4 = c22941.getEntry("resources.arsc") != null;
        for (C8002 c8002 : c22941.m51740()) {
            if (!c8002.isDirectory()) {
                arrayList.add(C19291.m44660(c8002));
            }
        }
        try {
            z = !c22941.m51728(true).isEmpty();
        } catch (IOException unused) {
            z = false;
        }
        if (z3 && (z || z4)) {
            z2 = true;
        }
        return new C8849(arrayList, z2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0088: MOVE (r3 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:37:0x0088 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14069 m49821(AbstractC22044 abstractC22044, boolean z) {
        AbstractC22044 abstractC22044M47753;
        AbstractC22044 abstractC22045;
        String message;
        C20893 c20893 = this.f71063;
        AbstractC22044 abstractC22046 = null;
        int i = 0;
        try {
            try {
                C22941 c22941 = new C22941(abstractC22044);
                try {
                    C8849 c8849M49811 = m49811(c22941);
                    if (!c8849M49811.f28920) {
                        throw C10186.m26305("NOT_APK", "Not an APK");
                    }
                    try {
                        C7139 c7139M14548 = C4684.m14548(c22941);
                        C17580.m41242(c7139M14548.f23607);
                        abstractC22044M47753 = c20893.m47753();
                        try {
                            C16417 c16417M49815 = m49815(abstractC22044M47753, abstractC22044, C20893.m47738(c22941, abstractC22044M47753.m49876("original.apk")), z);
                            m49819(c22941, c16417M49815);
                            m49816(c22941, c16417M49815);
                            while (i < 100) {
                                String strM47757 = c20893.m47757();
                                C16417 c16417M49814 = m49814(c16417M49815, abstractC22044M47753, strM47757);
                                String str = c16417M49814.f53281;
                                C20893.m47742(abstractC22044M47753, c16417M49814);
                                if (c20893.m47754(abstractC22044M47753, strM47757)) {
                                    C16417 c16417M49816 = m49814(c16417M49814, c20893.m47756(str), str);
                                    C14069 c14069M49813 = m49813(c16417M49816, c8849M49811, c7139M14548);
                                    c14069M49813.f44546 = c16417M49816.f53280;
                                    try {
                                        c22941.close();
                                        return c14069M49813;
                                    } catch (Exception e) {
                                        e = e;
                                        i = 1;
                                        if (abstractC22044M47753 != null) {
                                            C20893.m47748(abstractC22044M47753);
                                            C22099.m50062();
                                        }
                                        if (i != 0) {
                                            if (e.getMessage() == null) {
                                                message = "Failed to create workspace.";
                                            } else {
                                                message = e.getMessage();
                                            }
                                            throw C10186.m26304(null, "WORKSPACE_CREATE_FAILED", message, "fatal");
                                        }
                                        throw C10186.m26305("NOT_APK", "Not an APK");
                                    }
                                }
                                i++;
                            }
                            throw new IOException("Unable to publish workspace");
                        } catch (Throwable th) {
                            th = th;
                            i = 1;
                            c22941.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        abstractC22044M47753 = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    abstractC22044M47753 = null;
                }
                try {
                    c22941.close();
                } catch (Throwable th4) {
                    try {
                        th.addSuppressed(th4);
                    } catch (Exception e2) {
                        e = e2;
                        if (abstractC22044M47753 != null) {
                            C20893.m47748(abstractC22044M47753);
                            C22099.m50062();
                        }
                        if (i != 0) {
                            if (e.getMessage() == null) {
                                message = "Failed to create workspace.";
                            } else {
                                message = e.getMessage();
                            }
                            throw C10186.m26304(null, "WORKSPACE_CREATE_FAILED", message, "fatal");
                        }
                        throw C10186.m26305("NOT_APK", "Not an APK");
                    }
                }
                throw th;
            } catch (C10186 e3) {
                e = e3;
                abstractC22046 = abstractC22045;
                if (abstractC22046 != null) {
                    C20893.m47748(abstractC22046);
                    C22099.m50062();
                }
                throw e;
            }
        } catch (C10186 e4) {
            e = e4;
            if (abstractC22046 != null) {
                C20893.m47748(abstractC22046);
                C22099.m50062();
            }
            throw e;
        } catch (Exception e5) {
            e = e5;
            abstractC22044M47753 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C16417 m49815(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, String str, boolean z) {
        C16417 c16417 = new C16417(abstractC22044, "");
        c16417.f53275 = z;
        c16417.f53276 = C0470.m2304(abstractC22045.mo4278(), "sourcePath");
        c16417.f53277 = abstractC22045.mo4285();
        c16417.f53282 = abstractC22045.mo4286();
        c16417.f53278 = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c16417.f53269 = jCurrentTimeMillis;
        c16417.f53280 = jCurrentTimeMillis;
        return c16417;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16417 m49814(C16417 c16417, AbstractC22044 abstractC22044, String str) {
        C16417 c16418 = new C16417(abstractC22044, str);
        c16418.f53275 = c16417.f53275;
        c16418.f53276 = c16417.f53276;
        c16418.f53277 = c16417.f53277;
        c16418.f53282 = c16417.f53282;
        c16418.f53278 = c16417.f53278;
        c16418.f53269 = c16417.f53269;
        c16418.f53280 = c16417.f53280;
        c16418.f53279.addAll(c16417.f53279);
        c16418.f53272 = c16417.f53272;
        c16418.f53274 = c16417.f53274;
        c16418.f53268 = c16417.f53268;
        c16418.f53273 = c16417.f53273;
        c16418.f53270 = c16417.f53270;
        return c16418;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m49819(C22941 c22941, C16417 c16417) {
        C8002 entry = c22941.getEntry("resources.arsc");
        if (entry == null) {
            c16417.f53272 = "absent";
            c16417.f53274 = null;
            return;
        }
        AbstractC22044 abstractC22044 = c16417.f53271;
        int i = C20893.f66878;
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("entries").m49876("resources.arsc");
        try {
            abstractC22044M49876.m49840(c22941.m51727(entry));
            c16417.f53268 = C20893.m47745(abstractC22044M49876);
            long jMo4285 = abstractC22044M49876.mo4285();
            c16417.f53273 = jMo4285;
            c16417.f53270 = true;
            try {
                C9462 c9462M49812 = m49812(new C2751(jMo4285, abstractC22044M49876, c16417.f53268));
                if (c9462M49812.f30674) {
                    c16417.f53272 = "available";
                    c16417.f53274 = null;
                } else {
                    m49818(c16417);
                    c16417.f53272 = "parse_error";
                    c16417.f53274 = c9462M49812.f30675;
                }
            } catch (Exception e) {
                m49818(c16417);
                c16417.f53272 = "parse_error";
                c16417.f53274 = e.getMessage() == null ? "Failed to parse resources.arsc" : e.getMessage();
            }
        } catch (Exception e2) {
            abstractC22044M49876.mo4296();
            m49818(c16417);
            c16417.f53272 = "extract_error";
            c16417.f53274 = e2.getMessage() == null ? "Failed to extract resources.arsc" : e2.getMessage();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49816(C22941 c22941, C16417 c16417) {
        ArrayList arrayList = c16417.f53279;
        AbstractC22044 abstractC22044 = c16417.f53271;
        arrayList.clear();
        boolean z = false;
        for (C8002 c8002 : c22941.m51728(true)) {
            String name = c8002.getName();
            if (z) {
                arrayList.add(new C17909(name, "skipped", "Skipped after previous dex error", null));
            } else {
                int i = C20893.f66878;
                AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("entries").m49876(name);
                try {
                    abstractC22044M49876.m49840(c22941.m51727(c8002));
                    C3192.m10508(abstractC22044M49876, C20893.m47747(abstractC22044, name));
                    arrayList.add(new C17909(name, "available", null, "cache/dex/" + name + ".type_index"));
                } catch (Exception e) {
                    arrayList.add(new C17909(name, d.O, e.getMessage() == null ? "Failed to open dex" : e.getMessage(), null));
                    z = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14069 m49820(C16417 c16417) throws C10186 {
        try {
            C22941 c22941 = new C22941(c16417.f53271.m49876("original.apk"));
            try {
                C14069 c14069M49813 = m49813(c16417, m49811(c22941), C4684.m14548(c22941));
                c22941.close();
                return c14069M49813;
            } catch (Throwable th) {
                try {
                    c22941.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
            throw C18723.m43535(c16417.f53276, c16417.f53275);
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14069 m49813(C16417 c16417, C8849 c8849, C7139 c7139) throws IOException {
        C2751 c2751;
        C9462 c9462;
        C9462 c9462M49812;
        boolean z;
        C14069 c14069;
        Iterator it;
        int i;
        DataInputStream dataInputStream;
        int i2;
        C1701 c1701;
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList<C17909> arrayList2 = c16417.f53279;
        AbstractC22044 abstractC22044 = c16417.f53271;
        for (C17909 c17909 : arrayList2) {
            if ("available".equals(c17909.f58662) && (str = c17909.f58659) != null) {
                arrayList.add(str);
            }
        }
        C11395 c11395 = new C11395();
        for (C17909 c179010 : arrayList2) {
            String str2 = c179010.f58659;
            String str3 = c179010.f58662;
            if (str2 != null) {
                if (d.O.equals(str3)) {
                    C1701 c1702 = new C1701(str2);
                    c1702.f5833 = false;
                    c11395.m28748(c1702);
                } else if ("skipped".equals(str3)) {
                    C1701 c1703 = new C1701(str2);
                    c1703.f5833 = false;
                    c11395.m28748(c1703);
                } else if (arrayList.contains(str2)) {
                    try {
                        int i3 = C20893.f66878;
                        c11395.m28748(C1701.m6061(str2, m49817(abstractC22044.m49876("entries").m49876(str2))));
                    } catch (Exception e) {
                        if (e.getMessage() != null) {
                            e.getMessage();
                        }
                        C1701 c1704 = new C1701(str2);
                        c1704.f5833 = false;
                        c11395.m28748(c1704);
                    }
                }
            }
        }
        if (!"available".equals(c16417.f53272)) {
            m49818(c16417);
            if (c16417.f53270) {
                try {
                    c16417.f53270 = false;
                    C20893.m47742(abstractC22044, c16417);
                } catch (IOException unused) {
                }
            }
            c2751 = null;
        } else {
            int i4 = C20893.f66878;
            AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("entries").m49876("resources.arsc");
            if (c16417.f53268 == null) {
                c16417.f53268 = C20893.m47745(abstractC22044M49876);
                c16417.f53273 = abstractC22044M49876.mo4285();
                c16417.f53270 = true;
            }
            C2751 c2752 = new C2751(c16417.f53273, abstractC22044M49876, c16417.f53268);
            if (c16417.f53270) {
                try {
                    c16417.f53270 = false;
                    C20893.m47742(abstractC22044, c16417);
                } catch (IOException unused2) {
                }
            }
            c2751 = c2752;
        }
        if ("absent".equals(c16417.f53272) || "extract_error".equals(c16417.f53272)) {
            c9462 = new C9462(false, c16417.f53274);
        } else {
            if ("parse_error".equals(c16417.f53272)) {
                String str4 = c16417.f53274;
                if (str4 == null) {
                    str4 = "Failed to parse resources.arsc";
                }
                c9462 = new C9462(false, str4);
            } else {
                c9462M49812 = m49812(c2751);
            }
            if (!"available".equals(c16417.f53272) || "parse_error".equals(c16417.f53272)) {
                z = true;
            } else {
                z = false;
            }
            c14069 = new C14069(this.f71063, c16417.f53281, c16417.f53275, c16417.f53271, c16417.f53276, c16417.f53277, c16417.f53282, c8849.f28919, arrayList, z, c16417.f53272, c16417.f53274, c7139, c11395, c9462M49812, c2751);
            ArrayList arrayList3 = new ArrayList();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (String str5 : c14069.f44549) {
                it = c14069.f44542.f35856.iterator();
                while (true) {
                    if (it.hasNext()) {
                        i = -1;
                        break;
                    }
                    c1701 = (C1701) it.next();
                    if (!c1701.f5833 && c1701.f5834.equals(str5)) {
                        i = c1701.f5835;
                        break;
                    }
                }
                c14069.f44538.getClass();
                AbstractC22044 abstractC22044M47747 = C20893.m47747(c14069.f44536, str5);
                dataInputStream = new DataInputStream(abstractC22044M47747.m49875());
                try {
                    if (dataInputStream.readInt() == 1296323657 || dataInputStream.readInt() != 2) {
                        throw new IOException("Invalid type index header");
                    }
                    int i5 = dataInputStream.readInt();
                    if (i5 < 0 || ((i >= 0 && i5 != i) || i5 > Math.max(0L, (abstractC22044M47747.mo4285() - 12) / 6))) {
                        throw new IOException("Invalid type index count");
                    }
                    ArrayList<C23330> arrayList4 = new ArrayList(Math.min(i5, 4096));
                    for (int i6 = 0; i6 < i5; i6++) {
                        String utf = dataInputStream.readUTF();
                        int i7 = dataInputStream.readInt();
                        if ((Integer.MIN_VALUE & i7) != 0) {
                            i7 &= Integer.MAX_VALUE;
                            i2 = dataInputStream.readInt();
                        } else {
                            i2 = 0;
                        }
                        arrayList4.add(new C23330(null, i7, i2, utf));
                    }
                    if (dataInputStream.read() != -1) {
                        throw new IOException("Trailing type index data");
                    }
                    dataInputStream.close();
                    for (C23330 c23330 : arrayList4) {
                        String str6 = c23330.f75565;
                        C11392.merge(map2, str6, 1, new C10828());
                        if (!map.containsKey(str6)) {
                            C23330 c23331 = new C23330(str5, c23330.f75563, c23330.f75566, str6);
                            map.put(str6, c23331);
                            arrayList3.add(c23331);
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
            c14069.f44553 = arrayList3;
            c14069.f44552 = map;
            c14069.f44539 = map2;
            ArrayList arrayList5 = new ArrayList(arrayList3);
            C12884.sort(arrayList5, new C4880(0));
            c14069.f44551 = arrayList5;
            return c14069;
        }
        c9462M49812 = c9462;
        if ("available".equals(c16417.f53272)) {
            z = true;
        } else {
            z = true;
        }
        c14069 = new C14069(this.f71063, c16417.f53281, c16417.f53275, c16417.f53271, c16417.f53276, c16417.f53277, c16417.f53282, c8849.f28919, arrayList, z, c16417.f53272, c16417.f53274, c7139, c11395, c9462M49812, c2751);
        ArrayList arrayList6 = new ArrayList();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        while (r4.hasNext()) {
            it = c14069.f44542.f35856.iterator();
            while (true) {
                if (it.hasNext()) {
                    i = -1;
                    break;
                }
                c1701 = (C1701) it.next();
                if (!c1701.f5833) {
                }
            }
            c14069.f44538.getClass();
            AbstractC22044 abstractC22044M47748 = C20893.m47747(c14069.f44536, str5);
            dataInputStream = new DataInputStream(abstractC22044M47748.m49875());
            if (dataInputStream.readInt() == 1296323657) {
            }
            throw new IOException("Invalid type index header");
        }
        c14069.f44553 = arrayList6;
        c14069.f44552 = map3;
        c14069.f44539 = map4;
        ArrayList arrayList7 = new ArrayList(arrayList6);
        C12884.sort(arrayList7, new C4880(0));
        c14069.f44551 = arrayList7;
        return c14069;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49818(C16417 c16417) {
        if (c16417.f53268 != null || c16417.f53273 != -1) {
            c16417.f53270 = true;
        }
        c16417.f53268 = null;
        c16417.f53273 = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m49817(AbstractC22044 abstractC22044) throws IOException {
        InputStream inputStreamMo4290 = abstractC22044.mo4290();
        try {
            int i = UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            C9982 c9982 = new C9982(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
            byte[] bArr = new byte[8192];
            while (i > 0) {
                int i2 = inputStreamMo4290.read(bArr, 0, Math.min(8192, i));
                if (i2 == -1) {
                    break;
                }
                c9982.write(bArr, 0, i2);
                i -= i2;
            }
            byte[] bArr2 = c9982.f32079;
            int length = bArr2.length;
            int i3 = c9982.f32081;
            if (length == i3) {
                if (inputStreamMo4290 != null) {
                    inputStreamMo4290.close();
                }
                return bArr2;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr2, i3);
            if (inputStreamMo4290 != null) {
                inputStreamMo4290.close();
            }
            return bArrCopyOf;
        } catch (Throwable th) {
            if (inputStreamMo4290 != null) {
                try {
                    inputStreamMo4290.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
        if (inputStreamMo4290 != null) {
            inputStreamMo4290.close();
        }
        throw th;
    }
}
