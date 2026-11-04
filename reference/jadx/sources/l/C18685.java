package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܿ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AOM */
/* JADX INFO: loaded from: classes4.dex */
public final class C18685 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43474(AbstractC22044 abstractC22044) {
        try {
            C22941 c22941 = new C22941(abstractC22044);
            try {
                String strM43475 = m43475(c22941);
                c22941.close();
                return strM43475;
            } catch (Throwable th) {
                try {
                    c22941.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43475(C22941 c22941) {
        C8002 entry = c22941.getEntry("AndroidManifest.xml");
        if (entry == null || entry.getSize() > 5242880) {
            return null;
        }
        try {
            return m43479(C14955.m35973(c22941.m51727(entry)));
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m43480(C22941 c22941) {
        C8002 entry = c22941.getEntry("AndroidManifest.xml");
        if (entry == null || entry.getSize() > 5242880) {
            return false;
        }
        try {
            return m43478(C14955.m35973(c22941.m51727(entry)));
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m43479(C14955 c14955) {
        try {
            XmlResourceParserC9734 xmlResourceParserC9734M35991 = c14955.m35991();
            while (true) {
                int next = xmlResourceParserC9734M35991.next();
                if (next == 1) {
                    return null;
                }
                if (next == 2) {
                    int attributeCount = xmlResourceParserC9734M35991.getAttributeCount();
                    for (int i = 0; i != attributeCount; i++) {
                        StringBuilder sb = new StringBuilder();
                        String attributePrefix = xmlResourceParserC9734M35991.getAttributePrefix(i);
                        sb.append((attributePrefix == null || attributePrefix.length() == 0) ? "" : attributePrefix.concat(":"));
                        sb.append(xmlResourceParserC9734M35991.getAttributeName(i));
                        if ("package".equals(sb.toString())) {
                            return xmlResourceParserC9734M35991.getAttributeValue(i);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String[] m43476(C14955 c14955) {
        try {
            XmlResourceParserC9734 xmlResourceParserC9734M35991 = c14955.m35991();
            String attributeValue = null;
            while (true) {
                int next = xmlResourceParserC9734M35991.next();
                if (next == 1) {
                    break;
                }
                if (next == 2) {
                    int i = 0;
                    if (xmlResourceParserC9734M35991.getName().equals("manifest")) {
                        int attributeCount = xmlResourceParserC9734M35991.getAttributeCount();
                        while (i < attributeCount) {
                            if (xmlResourceParserC9734M35991.getAttributeName(i).equals("package")) {
                                attributeValue = xmlResourceParserC9734M35991.getAttributeValue(i);
                            }
                            i++;
                        }
                    } else if (xmlResourceParserC9734M35991.getName().equals("application")) {
                        if (attributeValue != null) {
                            int attributeCount2 = xmlResourceParserC9734M35991.getAttributeCount();
                            while (i < attributeCount2) {
                                if (xmlResourceParserC9734M35991.getAttributeNameResource(i) == 16842755) {
                                    String attributeValue2 = xmlResourceParserC9734M35991.getAttributeValue(i);
                                    if (attributeValue2.startsWith(".")) {
                                        attributeValue2 = attributeValue + attributeValue2;
                                    }
                                    return new String[]{attributeValue, attributeValue2};
                                }
                                i++;
                            }
                            break;
                        }
                        break;
                    }
                }
            }
            return new String[]{attributeValue, null};
        } catch (Throwable unused) {
            return new String[2];
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m43477(C14955 c14955) {
        XmlResourceParserC9734 xmlResourceParserC9734M35991 = c14955.m35991();
        while (true) {
            int next = xmlResourceParserC9734M35991.next();
            if (next == 1) {
                break;
            }
            if (next == 2 && xmlResourceParserC9734M35991.getName().equals("application")) {
                int attributeCount = xmlResourceParserC9734M35991.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC9734M35991.getAttributeNameResource(i) == 16844010) {
                        return !xmlResourceParserC9734M35991.getAttributeBooleanValue(i, true);
                    }
                }
                break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m43478(C14955 c14955) {
        XmlResourceParserC9734 xmlResourceParserC9734M35991 = c14955.m35991();
        while (true) {
            int next = xmlResourceParserC9734M35991.next();
            if (next == 1) {
                return false;
            }
            if (next == 2 && (xmlResourceParserC9734M35991.getName().equals("application") || xmlResourceParserC9734M35991.getName().equals(UMModuleRegister.PROCESS))) {
                int attributeCount = xmlResourceParserC9734M35991.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC9734M35991.getAttributeNameResource(i) == 16844190 && xmlResourceParserC9734M35991.getAttributeBooleanValue(i, false)) {
                        return true;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m43481(C14955 c14955) {
        XmlResourceParserC9734 xmlResourceParserC9734M35991 = c14955.m35991();
        while (true) {
            int next = xmlResourceParserC9734M35991.next();
            if (next == 1) {
                break;
            }
            if (next == 2 && xmlResourceParserC9734M35991.getName().equals("uses-sdk")) {
                int attributeCount = xmlResourceParserC9734M35991.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC9734M35991.getAttributeNameResource(i) == 16843376) {
                        return xmlResourceParserC9734M35991.getAttributeIntValue(i, -1);
                    }
                }
                break;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43473(C14955 c14955) {
        XmlResourceParserC9734 xmlResourceParserC9734M35991 = c14955.m35991();
        while (true) {
            int next = xmlResourceParserC9734M35991.next();
            if (next == 1) {
                break;
            }
            if (next == 2 && xmlResourceParserC9734M35991.getName().equals("uses-sdk")) {
                int attributeCount = xmlResourceParserC9734M35991.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC9734M35991.getAttributeNameResource(i) == 16843276) {
                        return xmlResourceParserC9734M35991.getAttributeIntValue(i, -1);
                    }
                }
                break;
            }
        }
        return -1;
    }
}
