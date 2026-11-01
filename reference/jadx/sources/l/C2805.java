package l;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۖ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X564 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2805 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f10662 = Pattern.compile("(\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*\\.)+\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23786 m8516(C12497 c12497) {
        return m8514(c12497.m31041(), c12497);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23786 m8515(String str) {
        if (str == null) {
            throw new C21856("Parser key cannot be null");
        }
        return m8514(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23786 m8514(String str, C12497 c12497) {
        AbstractC11979 c18328;
        C12497 c12498;
        AbstractC14614 c14096;
        if (f10662.matcher(str).matches()) {
            try {
                Class<?> cls = Class.forName(str);
                try {
                    c18328 = (InterfaceC23786) cls.getConstructor(null).newInstance(null);
                } catch (ClassCastException e) {
                    throw new C21856(cls.getName() + " does not implement the interface " + InterfaceC23786.class.getCanonicalName(), e);
                } catch (Exception e2) {
                    e = e2;
                    throw new C21856("Error initializing parser", e);
                } catch (LinkageError e3) {
                    e = e3;
                    throw new C21856("Error initializing parser", e);
                }
            } catch (ClassNotFoundException unused) {
                c18328 = 0;
            }
        } else {
            c18328 = 0;
        }
        if (c18328 == 0) {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            if (upperCase.contains("UNIX_LTRIM")) {
                c18328 = new C18328(c12497, true);
            } else if (upperCase.contains("UNIX")) {
                c18328 = new C18328(c12497, false);
            } else if (upperCase.contains("VMS")) {
                c18328 = new C8451("(.*?;[0-9]+)\\s*(\\d+)(?:/\\d+)?\\s*(\\S+)\\s+(\\S+)\\s+\\[(([0-9$A-Za-z_]+)|([0-9$A-Za-z_]+),([0-9$a-zA-Z_]+))\\]?\\s*\\([a-zA-Z]*,([a-zA-Z]*),([a-zA-Z]*),([a-zA-Z]*)\\)");
                c18328.mo15525((C12497) null);
                c18328.mo15525(c12497);
            } else {
                if (!upperCase.contains("WINDOWS")) {
                    if (upperCase.contains("OS/2")) {
                        c18328 = new C23268("\\s*([0-9]+)\\s*(\\s+|[A-Z]+)\\s*(DIR|\\s+)\\s*(\\S+)\\s+(\\S+)\\s+(\\S.*)");
                        c18328.mo15525(c12497);
                    } else if (!upperCase.contains("OS/400") && !upperCase.contains("AS/400")) {
                        if (upperCase.contains("MVS")) {
                            c18328 = new C1394();
                        } else if (upperCase.contains("NETWARE")) {
                            c18328 = new C7039("(d|-){1}\\s+\\[([-A-Z]+)\\]\\s+(\\S+)\\s+(\\d+)\\s+(\\S+\\s+\\S+\\s+((\\d+:\\d+)|(\\d{4})))\\s+(.*)");
                            c18328.mo15525(c12497);
                        } else if (upperCase.contains("MACOS PETER")) {
                            c18328 = new C13390("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s+((folder\\s+)|((\\d+)\\s+(\\d+)\\s+))(\\d+)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3}))\\s+(\\d+(?::\\d+)?)\\s+(\\S*)(\\s*.*)");
                            c18328.mo15525(c12497);
                        } else if (upperCase.contains("TYPE: L8")) {
                            c18328 = new C18328(c12497, false);
                        } else {
                            throw new C21856("Unknown parser type: ".concat(str));
                        }
                    } else if (c12497 != null && "OS/400".equals(c12497.m31041())) {
                        c14096 = new C15507(c12497);
                    } else {
                        c12498 = c12497 != null ? new C12497(c12497) : null;
                        c14096 = new C14096(new InterfaceC23786[]{new C15507(c12497), new C18328(c12498, c12498 != null && "UNIX_LTRIM".equals(c12498.m31041()))});
                    }
                } else if (c12497 != null && "WINDOWS".equals(c12497.m31041())) {
                    c14096 = new C4216(c12497);
                } else {
                    c12498 = c12497 != null ? new C12497(c12497) : null;
                    c14096 = new C14096(new InterfaceC23786[]{new C4216(c12497), new C18328(c12498, c12498 != null && "UNIX_LTRIM".equals(c12498.m31041()))});
                }
                c18328 = c14096;
            }
        }
        if (c18328 instanceof InterfaceC10380) {
            c18328.mo15525(c12497);
        }
        return c18328;
    }
}
