package l;

import android.util.TypedValue;
import com.umeng.analytics.pro.d;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.۫ܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M7AC */
/* JADX INFO: loaded from: classes3.dex */
public final class C12461 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0465 m30940(C2455 c2455) {
        String str;
        C12107 entry = c2455.getEntry("AndroidManifest.xml");
        if (entry == null) {
            C0465 c0465 = new C0465();
            c0465.f2099 = false;
            c0465.f2094 = "AndroidManifest.xml not found";
            return c0465;
        }
        try {
            C20945 c20945M47103 = C20945.m47103(c2455.m7475(entry, (C8516) null));
            C0465 c0466 = new C0465();
            C6037 c6037 = c2455.getEntry("resources.arsc") == null ? new C6037() : new C6037(c2455);
            c20945M47103.m47112(c6037);
            XmlResourceParserC11068 xmlResourceParserC11068M47106 = c20945M47103.m47106();
            while (true) {
                C16694 c16694 = null;
                while (true) {
                    try {
                        int next = xmlResourceParserC11068M47106.next();
                        if (next == 1) {
                            xmlResourceParserC11068M47106.close();
                            c0466.f2099 = true;
                            return c0466;
                        }
                        if (next == 2) {
                            String name = xmlResourceParserC11068M47106.getName();
                            if ("manifest".equals(name)) {
                                c0466.f2093 = m30939(xmlResourceParserC11068M47106, "package", c6037);
                                c0466.f2098 = m30939(xmlResourceParserC11068M47106, "versionName", c6037);
                                c0466.f2095 = m30939(xmlResourceParserC11068M47106, "versionCode", c6037);
                            } else if ("uses-sdk".equals(name)) {
                                c0466.f2102 = m30939(xmlResourceParserC11068M47106, "minSdkVersion", c6037);
                                c0466.f2100 = m30939(xmlResourceParserC11068M47106, "targetSdkVersion", c6037);
                            } else if (!"uses-permission".equals(name)) {
                                if ("application".equals(name)) {
                                    m30941(c0466, xmlResourceParserC11068M47106, c6037);
                                } else if ("activity".equals(name) || "activity-alias".equals(name)) {
                                    String str2 = c0466.f2093;
                                    String strM30939 = m30939(xmlResourceParserC11068M47106, "name", c6037);
                                    String strM309310 = m30939(xmlResourceParserC11068M47106, "targetActivity", c6037);
                                    if ("activity-alias".equals(name) && strM309310 != null && !strM309310.isEmpty()) {
                                        strM30939 = strM309310;
                                    }
                                    if (strM30939 != null && !strM30939.isEmpty() && str2 != null && !str2.isEmpty()) {
                                        if (strM30939.charAt(0) == '.') {
                                            strM30939 = str2.concat(strM30939);
                                        } else if (strM30939.indexOf(46) < 0) {
                                            strM30939 = C1679.m5594(str2, ".", strM30939);
                                        }
                                    }
                                    c16694 = new C16694(strM30939);
                                } else if (c16694 != null && "intent-filter".equals(name)) {
                                    c16694.f53477 = true;
                                    c16694.f53478 = false;
                                    c16694.f53475 = false;
                                } else if (!"service".equals(name) && !"receiver".equals(name) && !d.M.equals(name)) {
                                    if (c16694 != null && "action".equals(name)) {
                                        String strM309311 = m30939(xmlResourceParserC11068M47106, "name", c6037);
                                        if (c16694.f53477) {
                                            c16694.f53478 = "android.intent.action.MAIN".equals(strM309311) | c16694.f53478;
                                        }
                                    } else if (c16694 != null && "category".equals(name)) {
                                        String strM309312 = m30939(xmlResourceParserC11068M47106, "name", c6037);
                                        if (c16694.f53477) {
                                            c16694.f53475 = "android.intent.category.LAUNCHER".equals(strM309312) | c16694.f53475;
                                        }
                                    }
                                }
                            }
                        } else if (next == 3) {
                            String name2 = xmlResourceParserC11068M47106.getName();
                            if (c16694 != null && "intent-filter".equals(name2)) {
                                if (c16694.f53477 && c16694.f53478 && c16694.f53475) {
                                    c16694.f53474 = true;
                                }
                                c16694.f53477 = false;
                                c16694.f53478 = false;
                                c16694.f53475 = false;
                            } else if (c16694 != null && ("activity".equals(name2) || "activity-alias".equals(name2))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } catch (Throwable th) {
                        try {
                            xmlResourceParserC11068M47106.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (c16694.f53474 && (str = c16694.f53476) != null) {
                    c0466.f2097.add(str);
                }
            }
        } catch (Exception e) {
            String message = e.getMessage() == null ? "Failed to parse manifest" : e.getMessage();
            C0465 c0467 = new C0465();
            c0467.f2099 = false;
            c0467.f2094 = message;
            return c0467;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30941(C0465 c0465, XmlResourceParserC11068 xmlResourceParserC11068, C6037 c6037) {
        CharSequence charSequence;
        for (int i = 0; i < xmlResourceParserC11068.getAttributeCount(); i++) {
            if (AnnotatedPrivateKey.LABEL.equals(xmlResourceParserC11068.getAttributeName(i))) {
                int i2 = C6110.f20693;
                C14795 c14795 = new C14795();
                C6110.m16614(c14795, xmlResourceParserC11068.m27894(i), xmlResourceParserC11068.m27896(i), xmlResourceParserC11068.getAttributeNamespace(i), xmlResourceParserC11068.getAttributeName(i), xmlResourceParserC11068.getAttributeNameResource(i), xmlResourceParserC11068.getAttributeValue(i), c6037);
                c0465.f2101 = c14795.toString();
                int iM27894 = xmlResourceParserC11068.m27894(i);
                int iM27896 = xmlResourceParserC11068.m27896(i);
                String attributeValue = xmlResourceParserC11068.getAttributeValue(i);
                String str = null;
                if (iM27894 != 3) {
                    if (iM27894 == 1 && iM27896 != 0) {
                        try {
                            TypedValue typedValue = new TypedValue();
                            c6037.m16370(iM27896, typedValue, true);
                            if (typedValue.type == 3 && (charSequence = typedValue.string) != null && (attributeValue = charSequence.toString()) != null && !attributeValue.trim().isEmpty()) {
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (str != null) {
                        c0465.f2096 = str;
                        return;
                    }
                    return;
                }
                if (attributeValue == null || attributeValue.trim().isEmpty()) {
                    attributeValue = null;
                }
                str = attributeValue;
                if (str != null) {
                    c0465.f2096 = str;
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30939(XmlResourceParserC11068 xmlResourceParserC11068, String str, C6037 c6037) {
        for (int i = 0; i < xmlResourceParserC11068.getAttributeCount(); i++) {
            if (str.equals(xmlResourceParserC11068.getAttributeName(i))) {
                int i2 = C6110.f20693;
                C14795 c14795 = new C14795();
                C6110.m16614(c14795, xmlResourceParserC11068.m27894(i), xmlResourceParserC11068.m27896(i), xmlResourceParserC11068.getAttributeNamespace(i), xmlResourceParserC11068.getAttributeName(i), xmlResourceParserC11068.getAttributeNameResource(i), xmlResourceParserC11068.getAttributeValue(i), c6037);
                return c14795.toString();
            }
        }
        return null;
    }
}
