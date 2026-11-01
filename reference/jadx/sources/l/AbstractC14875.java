package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶ֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 07KX */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14875 implements InterfaceC3800 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f48629;

    /* JADX INFO: renamed from: ۙ */
    public abstract C7113 mo19001(String str);

    public AbstractC14875(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Path cannot be null");
        }
        this.f48629 = m35571(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m35571(String str) {
        if (str.isEmpty()) {
            return "";
        }
        String strReplaceAll = str.replaceAll("/+", "/");
        return (strReplaceAll.length() <= 1 || !strReplaceAll.endsWith("/")) ? strReplaceAll : C20630.m46498(1, 0, strReplaceAll);
    }

    @Override // l.InterfaceC3800
    public boolean isAbsolute() {
        return this.f48629.startsWith("/");
    }

    @Override // l.InterfaceC3800
    public InterfaceC3800 getRoot() {
        if (isAbsolute()) {
            return mo19001("/");
        }
        return null;
    }

    @Override // l.InterfaceC3800
    public InterfaceC3800 getFileName() {
        String str = this.f48629;
        if (str.isEmpty() || str.equals("/")) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return mo19001(str);
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (strSubstring.isEmpty()) {
            return null;
        }
        return mo19001(strSubstring);
    }

    @Override // l.InterfaceC3800
    public InterfaceC3800 getParent() {
        int iLastIndexOf;
        String str = this.f48629;
        if (str.isEmpty() || str.equals("/") || (iLastIndexOf = str.lastIndexOf(47)) == -1) {
            return null;
        }
        if (iLastIndexOf == 0) {
            return mo19001("/");
        }
        return mo19001(str.substring(0, iLastIndexOf));
    }

    @Override // l.InterfaceC3800
    public int getNameCount() {
        String str = this.f48629;
        int i = 0;
        if (str.isEmpty() || str.equals("/")) {
            return 0;
        }
        int i2 = !isAbsolute() ? 1 : 0;
        while (true) {
            int iIndexOf = str.indexOf(47, i);
            if (iIndexOf == -1) {
                return i2;
            }
            i2++;
            i = iIndexOf + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC3800
    public InterfaceC3800 getName(int i) {
        int nameCount = getNameCount();
        if (i < 0 || i >= nameCount) {
            throw new IllegalArgumentException(C8479.m22141(i, "Index out of bounds: "));
        }
        int i2 = 0;
        int iIsAbsolute = isAbsolute();
        while (true) {
            String str = this.f48629;
            if (i2 >= i) {
                int iIndexOf = str.indexOf(47, iIsAbsolute);
                if (iIndexOf == -1) {
                    iIndexOf = str.length();
                }
                return mo19001(str.substring(iIsAbsolute, iIndexOf));
            }
            int iIndexOf2 = str.indexOf(47, iIsAbsolute);
            if (iIndexOf2 == -1) {
                throw new IllegalArgumentException(C8479.m22141(i, "Index out of bounds: "));
            }
            i2++;
            iIsAbsolute = iIndexOf2 + 1;
        }
    }

    @Override // l.InterfaceC3800
    public InterfaceC3800 subpath(int i, int i2) {
        int nameCount = getNameCount();
        if (i < 0 || i2 > nameCount || i >= i2) {
            throw new IllegalArgumentException("Invalid subpath indices");
        }
        boolean zIsAbsolute = isAbsolute();
        String strSubstring = this.f48629;
        if (zIsAbsolute) {
            strSubstring = strSubstring.substring(1);
        }
        int iIndexOf = 0;
        for (int i3 = 0; i3 < i; i3++) {
            iIndexOf = strSubstring.indexOf(47, iIndexOf) + 1;
        }
        int length = strSubstring.length();
        if (i2 < nameCount) {
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int iIndexOf2 = strSubstring.indexOf(47, i4);
                if (i5 == i2 - 1) {
                    length = iIndexOf2;
                    break;
                }
                i4 = iIndexOf2 + 1;
            }
        }
        return mo19001(strSubstring.substring(iIndexOf, length));
    }

    @Override // l.InterfaceC3800
    public boolean startsWith(InterfaceC3800 interfaceC3800) {
        if (interfaceC3800 == null) {
            return false;
        }
        return startsWith(interfaceC3800.toString());
    }

    @Override // l.InterfaceC3800
    public boolean startsWith(String str) {
        if (str == null) {
            return false;
        }
        String strM35571 = m35571(str);
        if (isAbsolute() != strM35571.startsWith("/")) {
            return false;
        }
        if (strM35571.equals("/") && isAbsolute()) {
            return true;
        }
        String str2 = this.f48629;
        return str2.equals(strM35571) || str2.startsWith(strM35571.concat("/"));
    }

    @Override // l.InterfaceC3800
    public boolean endsWith(InterfaceC3800 interfaceC3800) {
        if (interfaceC3800 == null) {
            return false;
        }
        return endsWith(interfaceC3800.toString());
    }

    @Override // l.InterfaceC3800
    public boolean endsWith(String str) {
        if (str == null) {
            return false;
        }
        String strM35571 = m35571(str);
        boolean zStartsWith = strM35571.startsWith("/");
        String str2 = this.f48629;
        if (zStartsWith) {
            return str2.equals(strM35571);
        }
        return str2.equals(strM35571) || str2.endsWith("/".concat(strM35571));
    }

    @Override // l.InterfaceC3800
    public InterfaceC3800 normalize() {
        String str = this.f48629;
        if (str.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            int iIndexOf = str.indexOf(47, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            if (iIndexOf > i) {
                String strSubstring = str.substring(i, iIndexOf);
                if (!strSubstring.equals(".")) {
                    if (!strSubstring.equals("..")) {
                        arrayList.add(strSubstring);
                    } else if (!arrayList.isEmpty() && !((String) C19084.m43861(arrayList, 1)).equals("..")) {
                        C19028.m43762(arrayList, 1);
                    } else if (!isAbsolute()) {
                        arrayList.add("..");
                    }
                }
            }
            i = iIndexOf + 1;
        }
        StringBuilder sb = new StringBuilder();
        if (isAbsolute()) {
            sb.append("/");
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (i2 > 0) {
                sb.append("/");
            }
            sb.append((String) arrayList.get(i2));
        }
        String string = sb.toString();
        return mo19001((!string.isEmpty() || isAbsolute()) ? string : ".");
    }

    @Override // l.InterfaceC3800
    public InterfaceC3800 resolve(InterfaceC3800 interfaceC3800) {
        if (interfaceC3800 == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        return resolve(interfaceC3800.toString());
    }

    @Override // l.InterfaceC3800
    public InterfaceC3800 resolve(String str) {
        if (str == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        String strM35571 = m35571(str);
        if (strM35571.isEmpty()) {
            return this;
        }
        if (strM35571.startsWith("/")) {
            return mo19001(strM35571);
        }
        String str2 = this.f48629;
        if (str2.isEmpty()) {
            return mo19001(strM35571);
        }
        return str2.equals("/") ? mo19001("/".concat(strM35571)) : mo19001(C1679.m5594(str2, "/", strM35571));
    }

    @Override // l.InterfaceC3800
    public InterfaceC3800 resolveSibling(InterfaceC3800 interfaceC3800) {
        if (interfaceC3800 == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        return resolveSibling(interfaceC3800.toString());
    }

    @Override // l.InterfaceC3800
    public InterfaceC3800 resolveSibling(String str) {
        if (str == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        InterfaceC3800 parent = getParent();
        if (parent == null) {
            return mo19001(m35571(str));
        }
        return ((C7113) parent).resolve(str);
    }

    @Override // l.InterfaceC3800
    public InterfaceC3800 relativize(InterfaceC3800 interfaceC3800) {
        int i;
        if (interfaceC3800 == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        if (isAbsolute() != interfaceC3800.toString().startsWith("/")) {
            throw new IllegalArgumentException("Cannot relativize absolute and relative paths");
        }
        InterfaceC3800 interfaceC3800Normalize = normalize();
        InterfaceC3800 interfaceC3800Normalize2 = interfaceC3800.normalize();
        String str = ((C7113) interfaceC3800Normalize).f48629;
        String string = interfaceC3800Normalize2.toString();
        if (str.equals(string)) {
            return mo19001("");
        }
        int iMin = Math.min(str.length(), string.length());
        int i2 = 0;
        for (int i3 = 0; i3 < iMin && str.charAt(i3) == string.charAt(i3); i3++) {
            i2++;
        }
        while (i2 > 0 && i2 < str.length() && i2 < string.length() && str.charAt(i2) != '/' && string.charAt(i2) != '/') {
            i2--;
        }
        String strSubstring = str.substring(i2);
        if (strSubstring.startsWith("/")) {
            strSubstring = strSubstring.substring(1);
        }
        if (strSubstring.isEmpty()) {
            i = 0;
        } else {
            i = 1;
            for (int i4 = 0; i4 < strSubstring.length(); i4++) {
                if (strSubstring.charAt(i4) == '/') {
                    i++;
                }
            }
        }
        String strSubstring2 = string.substring(i2);
        if (strSubstring2.startsWith("/")) {
            strSubstring2 = strSubstring2.substring(1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < i; i5++) {
            if (i5 > 0) {
                sb.append("/");
            }
            sb.append("..");
        }
        if (!strSubstring2.isEmpty()) {
            if (sb.length() > 0) {
                sb.append("/");
            }
            sb.append(strSubstring2);
        }
        return mo19001(sb.length() != 0 ? sb.toString() : "");
    }

    @Override // l.InterfaceC3800
    public InterfaceC3800 toAbsolutePath() {
        if (isAbsolute()) {
            return this;
        }
        return mo19001("/" + this.f48629);
    }

    @Override // l.InterfaceC3800, java.lang.Iterable
    public Iterator iterator() {
        return new C22636(this, getNameCount());
    }

    @Override // l.InterfaceC3800
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7113) {
            C7113 c7113 = (C7113) obj;
            if (C13638.equals(((C7113) this).getFileSystem(), c7113.getFileSystem()) && C13638.equals(this.f48629, c7113.f48629)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC3800
    public int hashCode() {
        return C13638.hash(((C7113) this).getFileSystem(), this.f48629);
    }

    @Override // java.lang.Comparable
    public int compareTo(InterfaceC3800 interfaceC3800) {
        return this.f48629.compareTo(interfaceC3800.toString());
    }
}
