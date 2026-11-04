package l;

import android.util.TypedValue;
import com.umeng.analytics.pro.d;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.ۙۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7AC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4684 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7139 m14548(C22941 c22941) {
        return m14549(c22941, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C7139 m14551(C22941 c22941) {
        return m14549(c22941, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7139 m14549(C22941 c22941, boolean z) {
        C21246 c21246;
        String str;
        C7139 c7139;
        String str2;
        C8002 entry = c22941.getEntry("AndroidManifest.xml");
        if (entry == null) {
            c7139 = new C7139();
            c7139.f23605 = false;
            str2 = "AndroidManifest.xml not found";
        } else {
            C8002 entry2 = c22941.getEntry("resources.arsc");
            if (z) {
                long size = entry.getSize();
                long size2 = entry2 == null ? 0L : entry2.getSize();
                if (size < 0 || size2 < 0 || size > 2097152 || size2 > 2097152 - size) {
                    c7139 = new C7139();
                    c7139.f23605 = false;
                    str2 = "Manifest log input exceeds size limit";
                }
            }
            try {
                C14955 c14955M35982 = C14955.m35982(c22941.m51731(entry, (C3374) null));
                C7139 c71310 = new C7139();
                if (entry2 == null) {
                    c21246 = new C21246();
                } else {
                    c21246 = z ? new C21246(0, new C24296(c22941.m51731(entry2, (C3374) null))) : new C21246(c22941);
                }
                c14955M35982.m35989(c21246);
                XmlResourceParserC9734 xmlResourceParserC9734M35991 = c14955M35982.m35991();
                while (true) {
                    C13850 c13850 = null;
                    while (true) {
                        try {
                            int next = xmlResourceParserC9734M35991.next();
                            if (next == 1) {
                                xmlResourceParserC9734M35991.close();
                                c71310.f23605 = true;
                                return c71310;
                            }
                            if (next == 2) {
                                String name = xmlResourceParserC9734M35991.getName();
                                if ("manifest".equals(name)) {
                                    c71310.f23607 = m14547(xmlResourceParserC9734M35991, "package", c21246);
                                    c71310.f23606 = m14547(xmlResourceParserC9734M35991, "versionName", c21246);
                                    c71310.f23602 = m14547(xmlResourceParserC9734M35991, "versionCode", c21246);
                                } else if ("uses-sdk".equals(name)) {
                                    c71310.f23608 = m14547(xmlResourceParserC9734M35991, "minSdkVersion", c21246);
                                    c71310.f23604 = m14547(xmlResourceParserC9734M35991, "targetSdkVersion", c21246);
                                } else if (!"uses-permission".equals(name)) {
                                    if ("application".equals(name)) {
                                        m14550(c71310, xmlResourceParserC9734M35991, c21246);
                                    } else if ("activity".equals(name) || "activity-alias".equals(name)) {
                                        String str3 = c71310.f23607;
                                        String strM14547 = m14547(xmlResourceParserC9734M35991, "name", c21246);
                                        String strM14548 = m14547(xmlResourceParserC9734M35991, "targetActivity", c21246);
                                        if ("activity-alias".equals(name) && strM14548 != null && !strM14548.isEmpty()) {
                                            strM14547 = strM14548;
                                        }
                                        if (strM14547 != null && !strM14547.isEmpty() && str3 != null && !str3.isEmpty()) {
                                            if (strM14547.charAt(0) == '.') {
                                                strM14547 = str3.concat(strM14547);
                                            } else if (strM14547.indexOf(46) < 0) {
                                                strM14547 = C20196.m46451(str3, ".", strM14547);
                                            }
                                        }
                                        c13850 = new C13850(strM14547);
                                    } else if (c13850 != null && "intent-filter".equals(name)) {
                                        c13850.f43945 = true;
                                        c13850.f43947 = false;
                                        c13850.f43944 = false;
                                    } else if (!"service".equals(name) && !"receiver".equals(name) && !d.M.equals(name)) {
                                        if (c13850 != null && "action".equals(name)) {
                                            String strM14549 = m14547(xmlResourceParserC9734M35991, "name", c21246);
                                            if (c13850.f43945) {
                                                c13850.f43947 = "android.intent.action.MAIN".equals(strM14549) | c13850.f43947;
                                            }
                                        } else if (c13850 != null && "category".equals(name)) {
                                            String strM145410 = m14547(xmlResourceParserC9734M35991, "name", c21246);
                                            if (c13850.f43945) {
                                                c13850.f43944 = "android.intent.category.LAUNCHER".equals(strM145410) | c13850.f43944;
                                            }
                                        }
                                    }
                                }
                            } else if (next == 3) {
                                String name2 = xmlResourceParserC9734M35991.getName();
                                if (c13850 != null && "intent-filter".equals(name2)) {
                                    if (c13850.f43945 && c13850.f43947 && c13850.f43944) {
                                        c13850.f43948 = true;
                                    }
                                    c13850.f43945 = false;
                                    c13850.f43947 = false;
                                    c13850.f43944 = false;
                                } else if (c13850 != null && ("activity".equals(name2) || "activity-alias".equals(name2))) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } catch (Throwable th) {
                            try {
                                xmlResourceParserC9734M35991.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (c13850.f43948 && (str = c13850.f43946) != null) {
                        c71310.f23609.add(str);
                    }
                }
            } catch (Exception e) {
                String message = e.getMessage() == null ? "Failed to parse manifest" : e.getMessage();
                C7139 c71311 = new C7139();
                c71311.f23605 = false;
                c71311.f23611 = message;
                return c71311;
            }
        }
        c7139.f23611 = str2;
        return c7139;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14550(C7139 c7139, XmlResourceParserC9734 xmlResourceParserC9734, C21246 c21246) {
        CharSequence charSequence;
        for (int i = 0; i < xmlResourceParserC9734.getAttributeCount(); i++) {
            if (AnnotatedPrivateKey.LABEL.equals(xmlResourceParserC9734.getAttributeName(i))) {
                int i2 = C10649.f33754;
                C18459 c18459 = new C18459();
                C10649.m27143(c18459, xmlResourceParserC9734.m25344(i), xmlResourceParserC9734.m25350(i), xmlResourceParserC9734.getAttributeNamespace(i), xmlResourceParserC9734.getAttributeName(i), xmlResourceParserC9734.getAttributeNameResource(i), xmlResourceParserC9734.getAttributeValue(i), c21246);
                c7139.f23610 = c18459.toString();
                int iM25344 = xmlResourceParserC9734.m25344(i);
                int iM25350 = xmlResourceParserC9734.m25350(i);
                String attributeValue = xmlResourceParserC9734.getAttributeValue(i);
                String str = null;
                if (iM25344 != 3) {
                    if (iM25344 == 1 && iM25350 != 0) {
                        try {
                            TypedValue typedValue = new TypedValue();
                            c21246.m48425(iM25350, typedValue, true);
                            if (typedValue.type == 3 && (charSequence = typedValue.string) != null && (attributeValue = charSequence.toString()) != null && !attributeValue.trim().isEmpty()) {
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (str != null) {
                        c7139.f23603 = str;
                        return;
                    }
                    return;
                }
                if (attributeValue == null || attributeValue.trim().isEmpty()) {
                    attributeValue = null;
                }
                str = attributeValue;
                if (str != null) {
                    c7139.f23603 = str;
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14547(XmlResourceParserC9734 xmlResourceParserC9734, String str, C21246 c21246) {
        for (int i = 0; i < xmlResourceParserC9734.getAttributeCount(); i++) {
            if (str.equals(xmlResourceParserC9734.getAttributeName(i))) {
                int i2 = C10649.f33754;
                C18459 c18459 = new C18459();
                C10649.m27143(c18459, xmlResourceParserC9734.m25344(i), xmlResourceParserC9734.m25350(i), xmlResourceParserC9734.getAttributeNamespace(i), xmlResourceParserC9734.getAttributeName(i), xmlResourceParserC9734.getAttributeNameResource(i), xmlResourceParserC9734.getAttributeValue(i), c21246);
                return c18459.toString();
            }
        }
        return null;
    }
}
