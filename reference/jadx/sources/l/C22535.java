package l;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q151 */
/* JADX INFO: loaded from: classes.dex */
public final class C22535 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50057(InputStream inputStream, C6222 c6222, boolean z, C6037 c6037) throws Throwable {
        boolean z2;
        try {
            C20945 c20945M47094 = C20945.m47094(inputStream);
            Iterator it = c20945M47094.f68265.m10938().iterator();
            while (it.hasNext()) {
                c6222.m17276reset((CharSequence) ((InterfaceC12078) it.next()).getValue());
                if (z) {
                    if (c6222.matches()) {
                        return true;
                    }
                } else if (c6222.find()) {
                    return true;
                }
            }
            XmlResourceParserC11068 xmlResourceParserC11068M47106 = c20945M47094.m47106();
            do {
                try {
                    int next = xmlResourceParserC11068M47106.next();
                    if (next == 1) {
                        xmlResourceParserC11068M47106.close();
                        return false;
                    }
                    z2 = false;
                    if (next == 2) {
                        int attributeCount = xmlResourceParserC11068M47106.getAttributeCount();
                        for (int i = 0; i != attributeCount; i++) {
                            int iM27894 = xmlResourceParserC11068M47106.m27894(i);
                            if (iM27894 == 2 || iM27894 == 1) {
                                c6222.m17276reset((CharSequence) C0252.m1693(iM27894 == 2 ? "?" : "@", c6037.m16371(xmlResourceParserC11068M47106.m27896(i)).toLowerCase()));
                                if (!z) {
                                    if (c6222.find()) {
                                        z2 = true;
                                        break;
                                        break;
                                    }
                                } else {
                                    if (c6222.matches()) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        xmlResourceParserC11068M47106.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } while (!z2);
            xmlResourceParserC11068M47106.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m50059(InputStream inputStream, C6222 c6222, boolean z, boolean z2, String str, C20494 c20494) throws Throwable {
        try {
            C20945 c20945M47094 = C20945.m47094(inputStream);
            ArrayList arrayList = new ArrayList(1);
            boolean z3 = false;
            for (C12202 c12202 : c20945M47094.f68265.m10937()) {
                String strM31635 = C12733.m31635(c12202.getValue(), str, c6222, z, z2, c20494, arrayList);
                if (strM31635 != null) {
                    c12202.m30301(strM31635);
                    z3 = true;
                }
            }
            if (z3) {
                return c20945M47094.m47111();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m50061(InputStream inputStream, final int i, final int i2, C20494 c20494) {
        try {
            return m50060(C20945.m47094(inputStream), c20494, new InterfaceC5601() { // from class: l.ܰ᩷ۨ
                @Override // l.InterfaceC5601
                /* JADX INFO: renamed from: ۙ */
                public final int mo8451(int i3, int i4) {
                    return ((i3 == 2 || i3 == 1) && i4 == i) ? i2 : i4;
                }
            });
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m50058(InputStream inputStream, final int i, final int i2, C20494 c20494) {
        try {
            return m50060(C20945.m47094(inputStream), c20494, new InterfaceC5601() { // from class: l.ۨ᩷ۨ
                @Override // l.InterfaceC5601
                /* JADX INFO: renamed from: ۙ */
                public final int mo8451(int i3, int i4) {
                    return (i3 < 28 || i3 > 31 || i4 != i) ? i4 : i2;
                }
            });
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m50062(InputStream inputStream, final int i, final int i2, C20494 c20494) {
        try {
            return m50060(C20945.m47094(inputStream), c20494, new InterfaceC5601() { // from class: l.ۖ᩷ۨ
                @Override // l.InterfaceC5601
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final int mo8451(int i3, int i4) {
                    return (i3 < 16 || i3 > 31 || i4 != i) ? i4 : i2;
                }
            });
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50056(C20945 c20945, InterfaceC5601 interfaceC5601) {
        m50060(c20945, null, new C4895(interfaceC5601));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m50060(C20945 c20945, C20494 c20494, InterfaceC5601 interfaceC5601) {
        try {
            XmlResourceParserC11068 xmlResourceParserC11068M47106 = c20945.m47106();
            int i = 0;
            while (true) {
                int next = xmlResourceParserC11068M47106.next();
                if (next == 1) {
                    break;
                }
                if (next == 2) {
                    int attributeCount = xmlResourceParserC11068M47106.getAttributeCount();
                    for (int i2 = 0; i2 != attributeCount; i2++) {
                        int iM27894 = xmlResourceParserC11068M47106.m27894(i2);
                        int iM27896 = xmlResourceParserC11068M47106.m27896(i2);
                        int iMo8451 = interfaceC5601.mo8451(iM27894, iM27896);
                        if (iMo8451 != iM27896) {
                            C15157.m36338((((i2 * 5) + 4) * 4) + c20945.m47107() + xmlResourceParserC11068M47106.f37566, iMo8451, c20945.m47117());
                            i++;
                            break;
                        }
                    }
                }
            }
            xmlResourceParserC11068M47106.close();
            if (i <= 0) {
                return null;
            }
            if (c20494 != null) {
                c20494.m46298(i);
            }
            return c20945.m47117();
        } catch (Exception unused) {
            return null;
        }
    }
}
