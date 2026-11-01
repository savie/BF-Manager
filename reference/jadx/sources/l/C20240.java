package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AOM */
/* JADX INFO: loaded from: classes4.dex */
public final class C20240 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45747(AbstractC20745 abstractC20745) {
        try {
            C2455 c2455 = new C2455(abstractC20745);
            try {
                String strM45746 = m45746(c2455);
                c2455.close();
                return strM45746;
            } catch (Throwable th) {
                try {
                    c2455.close();
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
    public static String m45746(C2455 c2455) {
        C12107 entry = c2455.getEntry("AndroidManifest.xml");
        if (entry == null || entry.getSize() > 5242880) {
            return null;
        }
        try {
            return m45750(C20945.m47094(c2455.m7471(entry)));
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m45751(C2455 c2455) {
        C12107 entry = c2455.getEntry("AndroidManifest.xml");
        if (entry == null || entry.getSize() > 5242880) {
            return false;
        }
        try {
            return m45748(C20945.m47094(c2455.m7471(entry)));
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m45750(C20945 c20945) {
        try {
            XmlResourceParserC11068 xmlResourceParserC11068M47106 = c20945.m47106();
            while (true) {
                int next = xmlResourceParserC11068M47106.next();
                if (next == 1) {
                    return null;
                }
                if (next == 2) {
                    int attributeCount = xmlResourceParserC11068M47106.getAttributeCount();
                    for (int i = 0; i != attributeCount; i++) {
                        StringBuilder sb = new StringBuilder();
                        String attributePrefix = xmlResourceParserC11068M47106.getAttributePrefix(i);
                        sb.append((attributePrefix == null || attributePrefix.length() == 0) ? "" : attributePrefix.concat(":"));
                        sb.append(xmlResourceParserC11068M47106.getAttributeName(i));
                        if ("package".equals(sb.toString())) {
                            return xmlResourceParserC11068M47106.getAttributeValue(i);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String[] m45749(C20945 c20945) {
        try {
            XmlResourceParserC11068 xmlResourceParserC11068M47106 = c20945.m47106();
            String attributeValue = null;
            while (true) {
                int next = xmlResourceParserC11068M47106.next();
                if (next == 1) {
                    break;
                }
                if (next == 2) {
                    int i = 0;
                    if (xmlResourceParserC11068M47106.getName().equals("manifest")) {
                        int attributeCount = xmlResourceParserC11068M47106.getAttributeCount();
                        while (i < attributeCount) {
                            if (xmlResourceParserC11068M47106.getAttributeName(i).equals("package")) {
                                attributeValue = xmlResourceParserC11068M47106.getAttributeValue(i);
                            }
                            i++;
                        }
                    } else if (xmlResourceParserC11068M47106.getName().equals("application")) {
                        if (attributeValue != null) {
                            int attributeCount2 = xmlResourceParserC11068M47106.getAttributeCount();
                            while (i < attributeCount2) {
                                if (xmlResourceParserC11068M47106.getAttributeNameResource(i) == 16842755) {
                                    String attributeValue2 = xmlResourceParserC11068M47106.getAttributeValue(i);
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

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m45752(C20945 c20945) {
        XmlResourceParserC11068 xmlResourceParserC11068M47106 = c20945.m47106();
        while (true) {
            int next = xmlResourceParserC11068M47106.next();
            if (next == 1) {
                break;
            }
            if (next == 2 && xmlResourceParserC11068M47106.getName().equals("application")) {
                int attributeCount = xmlResourceParserC11068M47106.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC11068M47106.getAttributeNameResource(i) == 16844010) {
                        return !xmlResourceParserC11068M47106.getAttributeBooleanValue(i, true);
                    }
                }
                break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m45748(C20945 c20945) {
        XmlResourceParserC11068 xmlResourceParserC11068M47106 = c20945.m47106();
        while (true) {
            int next = xmlResourceParserC11068M47106.next();
            if (next == 1) {
                return false;
            }
            if (next == 2 && (xmlResourceParserC11068M47106.getName().equals("application") || xmlResourceParserC11068M47106.getName().equals(UMModuleRegister.PROCESS))) {
                int attributeCount = xmlResourceParserC11068M47106.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC11068M47106.getAttributeNameResource(i) == 16844190 && xmlResourceParserC11068M47106.getAttributeBooleanValue(i, false)) {
                        return true;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m45744(C20945 c20945) {
        XmlResourceParserC11068 xmlResourceParserC11068M47106 = c20945.m47106();
        while (true) {
            int next = xmlResourceParserC11068M47106.next();
            if (next == 1) {
                break;
            }
            if (next == 2 && xmlResourceParserC11068M47106.getName().equals("uses-sdk")) {
                int attributeCount = xmlResourceParserC11068M47106.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC11068M47106.getAttributeNameResource(i) == 16843376) {
                        return xmlResourceParserC11068M47106.getAttributeIntValue(i, -1);
                    }
                }
                break;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45745(C20945 c20945) {
        XmlResourceParserC11068 xmlResourceParserC11068M47106 = c20945.m47106();
        while (true) {
            int next = xmlResourceParserC11068M47106.next();
            if (next == 1) {
                break;
            }
            if (next == 2 && xmlResourceParserC11068M47106.getName().equals("uses-sdk")) {
                int attributeCount = xmlResourceParserC11068M47106.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC11068M47106.getAttributeNameResource(i) == 16843276) {
                        return xmlResourceParserC11068M47106.getAttributeIntValue(i, -1);
                    }
                }
                break;
            }
        }
        return -1;
    }
}
