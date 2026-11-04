package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22027 extends AbstractC0860 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized int m49808() {
        int iM50975;
        int iM50976;
        iM50975 = 0;
        for (InterfaceC18152 interfaceC18152 : this.f56602) {
            C0224 c0224 = null;
            try {
                try {
                    ((C9808) this.f56600).mo4161(interfaceC18152);
                    C0224 c0225 = new C0224((C9808) this.f56600);
                    try {
                        interfaceC18152.mo30463(c0225.f67127 || c0225.f67128);
                        DataInputStream dataInputStreamMo30461 = interfaceC18152.mo30461(C15867.of(this.f56600));
                        try {
                            c0225.m1683(dataInputStreamMo30461, C14631.get(interfaceC18152.getName(), new String[0]));
                            dataInputStreamMo30461.close();
                            ((C9808) this.f56600).m32299(new C4873(0));
                            ((C9808) this.f56600).m32306().mo3880(c0225.f1451, C15867.of(".jasm"), this.f56600);
                            c0225.mo1688();
                            ((C9808) this.f56600).m32306().mo3883(c0225.f1451);
                            ((C9808) this.f56600).m32303().flush();
                            iM50975 += ((C22628) ((C9808) this.f56600).m32312()).m50975(iM50975, interfaceC18152);
                            ((C22628) ((C9808) this.f56600).m32312()).m50976();
                        } catch (Throwable th) {
                            try {
                                dataInputStreamMo30461.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        e = e;
                        c0224 = c0225;
                        c0224.m1687();
                        ((C9808) this.f56600).m32298(e);
                        ((C9808) this.f56600).m32313(e);
                        iM50976 = ((C22628) ((C9808) this.f56600).m32312()).m50975(iM50975, interfaceC18152);
                        iM50975 += iM50976;
                        ((C22628) ((C9808) this.f56600).m32312()).m50976();
                        return iM50975;
                    } catch (ClassFormatError e2) {
                        e = e2;
                        c0224 = c0225;
                        c0224.m1687();
                        ((C9808) this.f56600).m32298(e);
                        ((C9808) this.f56600).m32313(e);
                        iM50976 = ((C22628) ((C9808) this.f56600).m32312()).m50975(iM50975, interfaceC18152);
                        iM50975 += iM50976;
                        ((C22628) ((C9808) this.f56600).m32312()).m50976();
                        return iM50975;
                    } catch (Error e3) {
                        e = e3;
                        c0224 = c0225;
                        c0224.m1687();
                        ((C9808) this.f56600).m32298(e);
                        ((C9808) this.f56600).m32313(e);
                        iM50976 = ((C22628) ((C9808) this.f56600).m32312()).m50975(iM50975, interfaceC18152);
                        iM50975 += iM50976;
                        ((C22628) ((C9808) this.f56600).m32312()).m50976();
                        return iM50975;
                    } catch (Exception e4) {
                        e = e4;
                        c0224 = c0225;
                        c0224.m1687();
                        ((C9808) this.f56600).m32298(e);
                        ((C9808) this.f56600).m32313(e);
                        iM50976 = ((C22628) ((C9808) this.f56600).m32312()).m50975(iM50975, interfaceC18152);
                        iM50975 += iM50976;
                        ((C22628) ((C9808) this.f56600).m32312()).m50976();
                        return iM50975;
                    }
                } catch (FileNotFoundException e5) {
                    ((C9808) this.f56600).m32313(e5);
                    ((C9808) this.f56600).mo4160("No such file: {0}", interfaceC18152);
                    iM50975 = 1;
                    ((C22628) ((C9808) this.f56600).m32312()).m50976();
                    return iM50975;
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
        return iM50975;
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
    public C22027(C6965 c6965, C10889 c10889, C12185 c12185, String... strArr) {
        super(c6965, c10889);
        this.f56602.add(c12185);
        ArrayList arrayList = this.f56602;
        AbstractC12931 abstractC12931 = this.f56600;
        try {
            C25406.m56770();
            int i = 0;
            while (i < strArr.length) {
                String str = strArr[i];
                switch (str.hashCode()) {
                    case -620636114:
                        if (str.equals("-sysinfo")) {
                            C25406.m56768(EnumC11979.SYSINFO);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        if (str.equals("-")) {
                            m40880();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1495:
                        if (str.equals("-d")) {
                            i++;
                            m40881(EnumC9947.DIR, i, strArr);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1497:
                        if (str.equals("-f")) {
                            i++;
                            m40881(EnumC9947.FILE, i, strArr);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1498:
                        if (str.equals("-g")) {
                            C25406.m56773();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1511:
                        if (str.equals("-t")) {
                            C25406.m56768(EnumC11979.VERBOSE);
                            C25406.m56768(EnumC11979.TRACE);
                            ((C9808) abstractC12931).m32309();
                            ((C9808) abstractC12931).m32308();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1513:
                        if (str.equals("-v")) {
                            C25406.m56768(EnumC11979.VERBOSE);
                            ((C9808) abstractC12931).m32309();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1514:
                        if (str.equals("-w")) {
                            ((C9808) abstractC12931).m32316();
                            i++;
                            m40881(EnumC9947.DIR, i, strArr);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46541:
                        if (str.equals("-gg")) {
                            C25406.m56773();
                            C25406.m56768(EnumC11979.EXTRA_DETAILED_Output);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46589:
                        if (str.equals("-hx")) {
                            C25406.m56768(EnumC11979.HEX);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46754:
                        if (str.equals("-nc")) {
                            C25406.m56768(EnumC11979.NO_COMMENTS);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46816:
                        if (str.equals("-pc")) {
                            C25406.m56768(EnumC11979.PRINT_BCI);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1440158:
                        if (str.equals("-dls")) {
                            ((C9808) abstractC12931).m32301(new C4924());
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1398427585:
                        if (str.equals("-table")) {
                            C25406.m56768(EnumC11979.TABLE);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1713741480:
                        if (str.equals("-best-effort")) {
                            C25406.m56768(EnumC11979.BEST_EFFORT);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    default:
                        if (str.startsWith("-")) {
                            arrayList.add(new C24120(str));
                        } else if (str.startsWith("-drop")) {
                            if (m49807("-drop", str, "DROP", EnumC11979.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m49807("-lnt", str, "LINE_NUMBER_TABLE", EnumC11979.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C9808) abstractC12931).mo4160("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m49807("-lvt", str, "LOCAL_VARIABLE", EnumC11979.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                }
            }
            if (arrayList.isEmpty()) {
                ((C9808) abstractC12931).mo4160("No input files specified.", new Object[0]);
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException unused) {
            ((C22628) ((C9808) abstractC12931).m32312()).m50976();
            System.exit(1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m49807(String str, String str2, String str3, EnumC11979 enumC11979) {
        String strSubstring = str2.substring(str.length());
        int length = strSubstring.length();
        int iCharCount = 0;
        while (true) {
            AbstractC12931 abstractC12931 = this.f56600;
            if (iCharCount >= length) {
                if (enumC11979.m30074()) {
                    enumC11979.m30073();
                    return true;
                }
                ((C9808) abstractC12931).mo4160("Not implemented yet: {0}", str.concat(":all"));
                return false;
            }
            int iCodePointAt = strSubstring.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                if (!strSubstring.matches("^[:=-]+.*")) {
                    ((C9808) abstractC12931).mo4160("Not implemented yet: {0}", str.concat(strSubstring));
                    return false;
                }
                String[] strArrSplit = strSubstring.substring(1).split(",");
                for (int i = 0; i < strArrSplit.length; i++) {
                    EnumC11979 enumC11979M30065 = EnumC11979.m30065(str3, strArrSplit[i]);
                    if (enumC11979M30065 == null || !enumC11979M30065.name().startsWith(str3)) {
                        ((C9808) abstractC12931).mo4160("Invalid parameter \"{0}\" of option: {1}", strArrSplit[i], str);
                        return false;
                    }
                    if (!enumC11979M30065.m30074()) {
                        ((C9808) abstractC12931).mo4160("Not implemented yet: {0}", C20196.m46451(str, ":", strArrSplit[i]));
                        return false;
                    }
                    enumC11979M30065.m30073();
                    if (enumC11979M30065.equals(enumC11979)) {
                        break;
                    }
                }
                return true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }
}
