package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16620 extends AbstractC8859 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized int m39082() {
        int iM46905;
        int iM46906;
        iM46905 = 0;
        for (InterfaceC1260 interfaceC1260 : this.f76671) {
            C3980 c3980 = null;
            try {
                try {
                    ((C19442) this.f76669).mo2153(interfaceC1260);
                    C3980 c3981 = new C3980((C19442) this.f76669);
                    try {
                        interfaceC1260.mo4571(c3981.f22706 || c3981.f22698);
                        DataInputStream dataInputStreamMo4569 = interfaceC1260.mo4569(C11521.of(this.f76669));
                        try {
                            c3981.m11475(dataInputStreamMo4569, C22852.get(interfaceC1260.getName(), new String[0]));
                            dataInputStreamMo4569.close();
                            ((C19442) this.f76669).m2152(new C0391());
                            ((C19442) this.f76669).m2144().mo18525(c3981.f14765, C11521.of(".jasm"), this.f76669);
                            c3981.mo3628();
                            ((C19442) this.f76669).m2144().mo18529(c3981.f14765);
                            ((C19442) this.f76669).m2159().flush();
                            iM46905 += ((C20872) ((C19442) this.f76669).m2163()).m46905(iM46905, interfaceC1260);
                            ((C20872) ((C19442) this.f76669).m2163()).m46906();
                        } catch (Throwable th) {
                            try {
                                dataInputStreamMo4569.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        e = e;
                        c3980 = c3981;
                        c3980.m11480();
                        ((C19442) this.f76669).m2151(e);
                        ((C19442) this.f76669).m2165(e);
                        iM46906 = ((C20872) ((C19442) this.f76669).m2163()).m46905(iM46905, interfaceC1260);
                        iM46905 += iM46906;
                        ((C20872) ((C19442) this.f76669).m2163()).m46906();
                        return iM46905;
                    } catch (ClassFormatError e2) {
                        e = e2;
                        c3980 = c3981;
                        c3980.m11480();
                        ((C19442) this.f76669).m2151(e);
                        ((C19442) this.f76669).m2165(e);
                        iM46906 = ((C20872) ((C19442) this.f76669).m2163()).m46905(iM46905, interfaceC1260);
                        iM46905 += iM46906;
                        ((C20872) ((C19442) this.f76669).m2163()).m46906();
                        return iM46905;
                    } catch (Error e3) {
                        e = e3;
                        c3980 = c3981;
                        c3980.m11480();
                        ((C19442) this.f76669).m2151(e);
                        ((C19442) this.f76669).m2165(e);
                        iM46906 = ((C20872) ((C19442) this.f76669).m2163()).m46905(iM46905, interfaceC1260);
                        iM46905 += iM46906;
                        ((C20872) ((C19442) this.f76669).m2163()).m46906();
                        return iM46905;
                    } catch (Exception e4) {
                        e = e4;
                        c3980 = c3981;
                        c3980.m11480();
                        ((C19442) this.f76669).m2151(e);
                        ((C19442) this.f76669).m2165(e);
                        iM46906 = ((C20872) ((C19442) this.f76669).m2163()).m46905(iM46905, interfaceC1260);
                        iM46905 += iM46906;
                        ((C20872) ((C19442) this.f76669).m2163()).m46906();
                        return iM46905;
                    }
                } catch (FileNotFoundException e5) {
                    ((C19442) this.f76669).m2165(e5);
                    ((C19442) this.f76669).mo2150("No such file: {0}", interfaceC1260);
                    iM46905 = 1;
                    ((C20872) ((C19442) this.f76669).m2163()).m46906();
                    return iM46905;
                }
            } catch (IOException e6) {
                e = e6;
            } catch (ClassFormatError e7) {
                e = e7;
            } catch (Error e8) {
                e = e8;
            } catch (Exception e9) {
                e = e9;
            }
        }
        return iM46905;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x012e A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0134 A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x013a A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0144  */
    /* JADX WARN: Code duplicated, block: B:64:0x014b A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0151 A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x015b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0162 A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0168 A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x018b A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C16620(C19606 c19606, C16078 c16078, C4788 c4788, String... strArr) {
        super(c19606, c16078);
        this.f76671.add(c4788);
        ArrayList arrayList = this.f76671;
        AbstractC0410 abstractC0410 = this.f76669;
        try {
            C13612.m33286();
            int i = 0;
            while (i < strArr.length) {
                String str = strArr[i];
                switch (str.hashCode()) {
                    case -620636114:
                        if (str.equals("-sysinfo")) {
                            C13612.m33284(EnumC4438.SYSINFO);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        if (str.equals("-")) {
                            m52152();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1495:
                        if (str.equals("-d")) {
                            i++;
                            m52153(EnumC15373.DIR, i, strArr);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1497:
                        if (str.equals("-f")) {
                            i++;
                            m52153(EnumC15373.FILE, i, strArr);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1498:
                        if (str.equals("-g")) {
                            C13612.m33281();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1511:
                        if (str.equals("-t")) {
                            C13612.m33284(EnumC4438.VERBOSE);
                            C13612.m33284(EnumC4438.TRACE);
                            ((C19442) abstractC0410).m2167();
                            ((C19442) abstractC0410).m2166();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1513:
                        if (str.equals("-v")) {
                            C13612.m33284(EnumC4438.VERBOSE);
                            ((C19442) abstractC0410).m2167();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1514:
                        if (str.equals("-w")) {
                            ((C19442) abstractC0410).m2169();
                            i++;
                            m52153(EnumC15373.DIR, i, strArr);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46541:
                        if (str.equals("-gg")) {
                            C13612.m33281();
                            C13612.m33284(EnumC4438.EXTRA_DETAILED_Output);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46589:
                        if (str.equals("-hx")) {
                            C13612.m33284(EnumC4438.HEX);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46754:
                        if (str.equals("-nc")) {
                            C13612.m33284(EnumC4438.NO_COMMENTS);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46816:
                        if (str.equals("-pc")) {
                            C13612.m33284(EnumC4438.PRINT_BCI);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1440158:
                        if (str.equals("-dls")) {
                            ((C19442) abstractC0410).m2154(new C7611());
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1398427585:
                        if (str.equals("-table")) {
                            C13612.m33284(EnumC4438.TABLE);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1713741480:
                        if (str.equals("-best-effort")) {
                            C13612.m33284(EnumC4438.BEST_EFFORT);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    default:
                        if (str.startsWith("-")) {
                            arrayList.add(new C11845(str));
                        } else if (str.startsWith("-drop")) {
                            if (m39081("-drop", str, "DROP", EnumC4438.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m39081("-lnt", str, "LINE_NUMBER_TABLE", EnumC4438.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C19442) abstractC0410).mo2150("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m39081("-lvt", str, "LOCAL_VARIABLE", EnumC4438.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                }
            }
            if (arrayList.isEmpty()) {
                ((C19442) abstractC0410).mo2150("No input files specified.", new Object[0]);
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException unused) {
            ((C20872) ((C19442) abstractC0410).m2163()).m46906();
            System.exit(1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m39081(String str, String str2, String str3, EnumC4438 enumC4438) {
        String strSubstring = str2.substring(str.length());
        int length = strSubstring.length();
        int iCharCount = 0;
        while (true) {
            AbstractC0410 abstractC0410 = this.f76669;
            if (iCharCount >= length) {
                if (enumC4438.m12386()) {
                    enumC4438.m12385();
                    return true;
                }
                ((C19442) abstractC0410).mo2150("Not implemented yet: {0}", str.concat(":all"));
                return false;
            }
            int iCodePointAt = strSubstring.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                if (!strSubstring.matches("^[:=-]+.*")) {
                    ((C19442) abstractC0410).mo2150("Not implemented yet: {0}", str.concat(strSubstring));
                    return false;
                }
                String[] strArrSplit = strSubstring.substring(1).split(",");
                for (int i = 0; i < strArrSplit.length; i++) {
                    EnumC4438 enumC4438M12378 = EnumC4438.m12378(str3, strArrSplit[i]);
                    if (enumC4438M12378 == null || !enumC4438M12378.name().startsWith(str3)) {
                        ((C19442) abstractC0410).mo2150("Invalid parameter \"{0}\" of option: {1}", strArrSplit[i], str);
                        return false;
                    }
                    if (!enumC4438M12378.m12386()) {
                        ((C19442) abstractC0410).mo2150("Not implemented yet: {0}", C1679.m5594(str, ":", strArrSplit[i]));
                        return false;
                    }
                    enumC4438M12378.m12385();
                    if (enumC4438M12378.equals(enumC4438)) {
                        break;
                    }
                }
                return true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }
}
