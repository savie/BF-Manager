package l;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܰۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X564 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14404 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f45396 = Pattern.compile("(\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*\\.)+\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15896 m34836(C11421 c11421) {
        return m34834(c11421.m28769(), c11421);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15896 m34835(String str) {
        if (str == null) {
            throw new C2472("Parser key cannot be null");
        }
        return m34834(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC15896 m34834(String str, C11421 c11421) {
        AbstractC3964 c8438;
        C11421 c11422;
        InterfaceC15896 c24102;
        if (f45396.matcher(str).matches()) {
            try {
                Class<?> cls = Class.forName(str);
                try {
                    c8438 = (InterfaceC15896) cls.getConstructor(null).newInstance(null);
                } catch (ClassCastException e) {
                    throw new C2472(cls.getName() + " does not implement the interface " + InterfaceC15896.class.getCanonicalName(), e);
                } catch (Exception e2) {
                    e = e2;
                    throw new C2472("Error initializing parser", e);
                } catch (LinkageError e3) {
                    e = e3;
                    throw new C2472("Error initializing parser", e);
                }
            } catch (ClassNotFoundException unused) {
                c8438 = 0;
            }
        } else {
            c8438 = 0;
        }
        if (c8438 == 0) {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            if (upperCase.contains("UNIX_LTRIM")) {
                c8438 = new C8438(c11421, true);
            } else if (upperCase.contains("UNIX")) {
                c8438 = new C8438(c11421, false);
            } else if (upperCase.contains("VMS")) {
                c8438 = new C13658("(.*?;[0-9]+)\\s*(\\d+)(?:/\\d+)?\\s*(\\S+)\\s+(\\S+)\\s+\\[(([0-9$A-Za-z_]+)|([0-9$A-Za-z_]+),([0-9$a-zA-Z_]+))\\]?\\s*\\([a-zA-Z]*,([a-zA-Z]*),([a-zA-Z]*),([a-zA-Z]*)\\)");
                c8438.mo6095((C11421) null);
                c8438.mo6095(c11421);
            } else {
                if (!upperCase.contains("WINDOWS")) {
                    if (upperCase.contains("OS/2")) {
                        c8438 = new C0981("\\s*([0-9]+)\\s*(\\s+|[A-Z]+)\\s*(DIR|\\s+)\\s*(\\S+)\\s+(\\S+)\\s+(\\S.*)");
                        c8438.mo6095(c11421);
                    } else if (!upperCase.contains("OS/400") && !upperCase.contains("AS/400")) {
                        if (upperCase.contains("MVS")) {
                            c8438 = new C0235();
                        } else if (upperCase.contains("NETWARE")) {
                            c8438 = new C9929("(d|-){1}\\s+\\[([-A-Z]+)\\]\\s+(\\S+)\\s+(\\d+)\\s+(\\S+\\s+\\S+\\s+((\\d+:\\d+)|(\\d{4})))\\s+(.*)");
                            c8438.mo6095(c11421);
                        } else if (upperCase.contains("MACOS PETER")) {
                            c8438 = new C7693("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s+((folder\\s+)|((\\d+)\\s+(\\d+)\\s+))(\\d+)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3}))\\s+(\\d+(?::\\d+)?)\\s+(\\S*)(\\s*.*)");
                            c8438.mo6095(c11421);
                        } else if (upperCase.contains("TYPE: L8")) {
                            c8438 = new C8438(c11421, false);
                        } else {
                            throw new C2472("Unknown parser type: ".concat(str));
                        }
                    } else if (c11421 != null && "OS/400".equals(c11421.m28769())) {
                        c24102 = new C9183(c11421);
                    } else {
                        c11422 = c11421 != null ? new C11421(c11421) : null;
                        c24102 = new C24102(new InterfaceC15896[]{new C9183(c11421), new C8438(c11422, c11422 != null && "UNIX_LTRIM".equals(c11422.m28769()))});
                    }
                } else if (c11421 != null && "WINDOWS".equals(c11421.m28769())) {
                    c24102 = new C18880(c11421);
                } else {
                    c11422 = c11421 != null ? new C11421(c11421) : null;
                    c24102 = new C24102(new InterfaceC15896[]{new C18880(c11421), new C8438(c11422, c11422 != null && "UNIX_LTRIM".equals(c11422.m28769()))});
                }
                c8438 = c24102;
            }
        }
        if (c8438 instanceof InterfaceC22610) {
            c8438.mo6095(c11421);
        }
        return c8438;
    }
}
