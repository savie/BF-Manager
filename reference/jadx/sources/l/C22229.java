package l;

import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.᩹ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C22229 extends AbstractC3178 {
    public final String a;
    public final String b;
    public final C6706 c;

    @Override // l.AbstractC3178
    public final String getSeparator() {
        return "/";
    }

    @Override // l.AbstractC3178
    public final boolean isOpen() {
        return true;
    }

    @Override // l.AbstractC3178
    public final boolean isReadOnly() {
        return false;
    }

    @Override // l.AbstractC3178
    public final Set supportedFileAttributeViews() {
        return AbstractC1726.D(new Object[]{"basic"});
    }

    public C22229(C6706 c6706, String str, String str2) {
        this.c = c6706;
        this.a = str;
        this.b = str2;
    }

    @Override // l.AbstractC3178
    public final AbstractC17455 provider() {
        return this.c;
    }

    @Override // l.AbstractC3178, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3178
    public final Iterable getRootDirectories() {
        return AbstractC1726.B(new Object[]{new C15174(this, "/", this.a, this.b)});
    }

    @Override // l.AbstractC3178
    public final Iterable getFileStores() {
        throw new UnsupportedOperationException("");
    }

    @Override // l.AbstractC3178
    public final InterfaceC3800 getPath(String str, String[] strArr) {
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (String str2 : strArr) {
                if (!str2.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append('/');
                    }
                    sb.append(str2);
                }
            }
            str = sb.toString();
        }
        return new C15174(this, str, this.a, this.b);
    }

    @Override // l.AbstractC3178
    public final InterfaceC6623 getPathMatcher(String str) {
        int i;
        int i2;
        int iIndexOf = str.indexOf(58);
        int i3 = 0;
        if (iIndexOf <= 0 || iIndexOf == str.length()) {
            throw new IllegalArgumentException(String.format("Requested <syntax>:<pattern> spliterator(':') position(%d) is out of bound in %s", Integer.valueOf(iIndexOf), str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring.equalsIgnoreCase("glob")) {
            StringBuilder sb = new StringBuilder("^");
            int i4 = 0;
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    if (i4 >= strSubstring2.length()) {
                        if (z) {
                            throw new PatternSyntaxException("Missing '}", strSubstring2, i4 - 1);
                        }
                        sb.append('$');
                        strSubstring2 = sb.toString();
                        break loop0;
                    }
                    i = i4 + 1;
                    char cCharAt = strSubstring2.charAt(i4);
                    if (cCharAt != '*') {
                        if (cCharAt != ',') {
                            char c = '/';
                            if (cCharAt == '/') {
                                sb.append(cCharAt);
                            } else if (cCharAt == '?') {
                                sb.append("[^/]");
                            } else if (cCharAt != '{') {
                                if (cCharAt != '}') {
                                    if (cCharAt == '[') {
                                        sb.append("[[^/]&&[");
                                        if (AbstractC1726.S(strSubstring2, i) == '^') {
                                            sb.append("\\^");
                                            i2 = i4 + 2;
                                        } else {
                                            if (AbstractC1726.S(strSubstring2, i) == '!') {
                                                sb.append('^');
                                                i = i4 + 2;
                                            }
                                            if (AbstractC1726.S(strSubstring2, i) == '-') {
                                                sb.append('-');
                                                i2 = i + 1;
                                            } else {
                                                i2 = i;
                                            }
                                        }
                                        boolean z2 = false;
                                        char c2 = 0;
                                        while (true) {
                                            if (i2 < strSubstring2.length()) {
                                                int i5 = i2 + 1;
                                                char cCharAt2 = strSubstring2.charAt(i2);
                                                if (cCharAt2 == ']') {
                                                    i2 = i5;
                                                    cCharAt = cCharAt2;
                                                } else {
                                                    if (cCharAt2 == c) {
                                                        throw new PatternSyntaxException("Explicit 'name separator' in class", strSubstring2, i2);
                                                    }
                                                    if (cCharAt2 == '\\' || cCharAt2 == '[' || (cCharAt2 == '&' && AbstractC1726.S(strSubstring2, i5) == '&')) {
                                                        sb.append('\\');
                                                    }
                                                    sb.append(cCharAt2);
                                                    if (cCharAt2 != '-') {
                                                        i2 = i5;
                                                        cCharAt = cCharAt2;
                                                        c2 = cCharAt;
                                                        z2 = true;
                                                    } else {
                                                        if (!z2) {
                                                            throw new PatternSyntaxException("Invalid range", strSubstring2, i2);
                                                        }
                                                        i = i2 + 2;
                                                        cCharAt = AbstractC1726.S(strSubstring2, i5);
                                                        if (cCharAt == 0 || cCharAt == ']') {
                                                            break;
                                                        }
                                                        if (cCharAt < c2) {
                                                            throw new PatternSyntaxException("Invalid range", strSubstring2, i2 - 1);
                                                        }
                                                        sb.append(cCharAt);
                                                        i2 = i;
                                                        z2 = false;
                                                    }
                                                    c = '/';
                                                }
                                            }
                                            i = i2;
                                            break;
                                        }
                                        if (cCharAt != ']') {
                                            throw new PatternSyntaxException("Missing ']", strSubstring2, i - 1);
                                        }
                                        sb.append("]]");
                                    } else if (cCharAt != '\\') {
                                        if (".^$+{[]|()".indexOf(cCharAt) != -1) {
                                            sb.append('\\');
                                        }
                                        sb.append(cCharAt);
                                    } else {
                                        if (i == strSubstring2.length()) {
                                            throw new PatternSyntaxException("No character to escape", strSubstring2, i4);
                                        }
                                        i4 += 2;
                                        char cCharAt3 = strSubstring2.charAt(i);
                                        if ("\\*?[{".indexOf(cCharAt3) != -1 || ".^$+{[]|()".indexOf(cCharAt3) != -1) {
                                            sb.append('\\');
                                        }
                                        sb.append(cCharAt3);
                                    }
                                } else {
                                    if (z) {
                                        break;
                                    }
                                    sb.append('}');
                                }
                            } else {
                                if (z) {
                                    throw new PatternSyntaxException("Cannot nest groups", strSubstring2, i4);
                                }
                                sb.append("(?:(?:");
                                i4 = i;
                                z = true;
                            }
                        } else if (z) {
                            sb.append(")|(?:");
                        } else {
                            sb.append(',');
                        }
                        i4 = i;
                    } else if (AbstractC1726.S(strSubstring2, i) == '*') {
                        sb.append(".*");
                        i4 += 2;
                    } else {
                        sb.append("[^/]*");
                        i4 = i;
                    }
                }
                sb.append("))");
                i4 = i;
            }
        } else if (!strSubstring.equalsIgnoreCase("regex")) {
            throw new UnsupportedOperationException("Syntax '" + strSubstring + "' not recognized");
        }
        return new C5295(i3, Pattern.compile(strSubstring2));
    }

    @Override // l.AbstractC3178
    public final AbstractC5918 getUserPrincipalLookupService() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3178
    public final InterfaceC8741 newWatchService() {
        throw new UnsupportedOperationException();
    }
}
