package l;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q151 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4642 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14470(InputStream inputStream, C4245 c4245, boolean z, C21246 c21246) throws Throwable {
        boolean z2;
        try {
            C14955 c14955M35973 = C14955.m35973(inputStream);
            Iterator it = c14955M35973.f48832.m15440().iterator();
            while (it.hasNext()) {
                c4245.m13568reset((CharSequence) ((InterfaceC16090) it.next()).getValue());
                if (z) {
                    if (c4245.matches()) {
                        return true;
                    }
                } else if (c4245.find()) {
                    return true;
                }
            }
            XmlResourceParserC9734 xmlResourceParserC9734M35991 = c14955M35973.m35991();
            do {
                try {
                    int next = xmlResourceParserC9734M35991.next();
                    if (next == 1) {
                        xmlResourceParserC9734M35991.close();
                        return false;
                    }
                    z2 = false;
                    if (next == 2) {
                        int attributeCount = xmlResourceParserC9734M35991.getAttributeCount();
                        for (int i = 0; i != attributeCount; i++) {
                            int iM25344 = xmlResourceParserC9734M35991.m25344(i);
                            if (iM25344 == 2 || iM25344 == 1) {
                                c4245.m13568reset((CharSequence) C25272.m56409(iM25344 == 2 ? "?" : "@", c21246.m48428(xmlResourceParserC9734M35991.m25350(i)).toLowerCase()));
                                if (!z) {
                                    if (c4245.find()) {
                                        z2 = true;
                                        break;
                                        break;
                                    }
                                } else {
                                    if (c4245.matches()) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        xmlResourceParserC9734M35991.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } while (!z2);
            xmlResourceParserC9734M35991.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m14472(InputStream inputStream, C4245 c4245, boolean z, boolean z2, String str, C17539 c17539) throws Throwable {
        try {
            C14955 c14955M35973 = C14955.m35973(inputStream);
            ArrayList arrayList = new ArrayList(1);
            boolean z3 = false;
            for (C20763 c20763 : c14955M35973.f48832.m15439()) {
                String strM11067 = C3369.m11067(c20763.getValue(), str, c4245, z, z2, c17539, arrayList);
                if (strM11067 != null) {
                    c20763.m47468(strM11067);
                    z3 = true;
                }
            }
            if (z3) {
                return c14955M35973.m35988();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m14474(InputStream inputStream, final int i, final int i2, C17539 c17539) {
        try {
            return m14473(C14955.m35973(inputStream), c17539, new InterfaceC14181() { // from class: l.ۖ᩺ۤ
                @Override // l.InterfaceC14181
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final int mo9795(int i3, int i4) {
                    return ((i3 == 2 || i3 == 1) && i4 == i) ? i2 : i4;
                }
            });
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m14471(InputStream inputStream, final int i, final int i2, C17539 c17539) {
        try {
            return m14473(C14955.m35973(inputStream), c17539, new InterfaceC14181() { // from class: l.۠᩺ۤ
                @Override // l.InterfaceC14181
                /* JADX INFO: renamed from: ۙ */
                public final int mo9795(int i3, int i4) {
                    return (i3 < 28 || i3 > 31 || i4 != i) ? i4 : i2;
                }
            });
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m14475(InputStream inputStream, final int i, final int i2, C17539 c17539) {
        try {
            return m14473(C14955.m35973(inputStream), c17539, new InterfaceC14181() { // from class: l.ۜ᩺ۤ
                @Override // l.InterfaceC14181
                /* JADX INFO: renamed from: ۙ */
                public final int mo9795(int i3, int i4) {
                    return (i3 < 16 || i3 > 31 || i4 != i) ? i4 : i2;
                }
            });
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14469(C14955 c14955, InterfaceC14181 interfaceC14181) {
        m14473(c14955, null, new C9706(interfaceC14181));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m14473(C14955 c14955, C17539 c17539, InterfaceC14181 interfaceC14181) {
        try {
            XmlResourceParserC9734 xmlResourceParserC9734M35991 = c14955.m35991();
            int i = 0;
            while (true) {
                int next = xmlResourceParserC9734M35991.next();
                if (next == 1) {
                    break;
                }
                if (next == 2) {
                    int attributeCount = xmlResourceParserC9734M35991.getAttributeCount();
                    for (int i2 = 0; i2 != attributeCount; i2++) {
                        int iM25344 = xmlResourceParserC9734M35991.m25344(i2);
                        int iM25350 = xmlResourceParserC9734M35991.m25350(i2);
                        int iMo9795 = interfaceC14181.mo9795(iM25344, iM25350);
                        if (iMo9795 != iM25350) {
                            C6929.m19210((((i2 * 5) + 4) * 4) + c14955.m35997() + xmlResourceParserC9734M35991.f31399, iMo9795, c14955.m35996());
                            i++;
                            break;
                        }
                    }
                }
            }
            xmlResourceParserC9734M35991.close();
            if (i <= 0) {
                return null;
            }
            if (c17539 != null) {
                c17539.m41195(i);
            }
            return c14955.m35996();
        } catch (Exception unused) {
            return null;
        }
    }
}
