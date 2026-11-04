package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07KX */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14484 implements InterfaceC24329 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f45594;

    /* JADX INFO: renamed from: ۙ */
    public abstract C1061 mo3995(String str);

    public AbstractC14484(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Path cannot be null");
        }
        this.f45594 = m34977(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m34977(String str) {
        if (str.isEmpty()) {
            return "";
        }
        String strReplaceAll = str.replaceAll("/+", "/");
        return (strReplaceAll.length() <= 1 || !strReplaceAll.endsWith("/")) ? strReplaceAll : C1402.m5124(1, 0, strReplaceAll);
    }

    @Override // l.InterfaceC24329
    public boolean isAbsolute() {
        return this.f45594.startsWith("/");
    }

    @Override // l.InterfaceC24329
    public InterfaceC24329 getRoot() {
        if (isAbsolute()) {
            return mo3995("/");
        }
        return null;
    }

    @Override // l.InterfaceC24329
    public InterfaceC24329 getFileName() {
        String str = this.f45594;
        if (str.isEmpty() || str.equals("/")) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return mo3995(str);
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (strSubstring.isEmpty()) {
            return null;
        }
        return mo3995(strSubstring);
    }

    @Override // l.InterfaceC24329
    public InterfaceC24329 getParent() {
        int iLastIndexOf;
        String str = this.f45594;
        if (str.isEmpty() || str.equals("/") || (iLastIndexOf = str.lastIndexOf(47)) == -1) {
            return null;
        }
        if (iLastIndexOf == 0) {
            return mo3995("/");
        }
        return mo3995(str.substring(0, iLastIndexOf));
    }

    @Override // l.InterfaceC24329
    public int getNameCount() {
        String str = this.f45594;
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
    @Override // l.InterfaceC24329
    public InterfaceC24329 getName(int i) {
        int nameCount = getNameCount();
        if (i < 0 || i >= nameCount) {
            throw new IllegalArgumentException(C13645.m33382(i, "Index out of bounds: "));
        }
        int i2 = 0;
        int iIsAbsolute = isAbsolute();
        while (true) {
            String str = this.f45594;
            if (i2 >= i) {
                int iIndexOf = str.indexOf(47, iIsAbsolute);
                if (iIndexOf == -1) {
                    iIndexOf = str.length();
                }
                return mo3995(str.substring(iIsAbsolute, iIndexOf));
            }
            int iIndexOf2 = str.indexOf(47, iIsAbsolute);
            if (iIndexOf2 == -1) {
                throw new IllegalArgumentException(C13645.m33382(i, "Index out of bounds: "));
            }
            i2++;
            iIsAbsolute = iIndexOf2 + 1;
        }
    }

    @Override // l.InterfaceC24329
    public InterfaceC24329 subpath(int i, int i2) {
        int nameCount = getNameCount();
        if (i < 0 || i2 > nameCount || i >= i2) {
            throw new IllegalArgumentException("Invalid subpath indices");
        }
        boolean zIsAbsolute = isAbsolute();
        String strSubstring = this.f45594;
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
        return mo3995(strSubstring.substring(iIndexOf, length));
    }

    @Override // l.InterfaceC24329
    public boolean startsWith(InterfaceC24329 interfaceC24329) {
        if (interfaceC24329 == null) {
            return false;
        }
        return startsWith(interfaceC24329.toString());
    }

    @Override // l.InterfaceC24329
    public boolean startsWith(String str) {
        if (str == null) {
            return false;
        }
        String strM34977 = m34977(str);
        if (isAbsolute() != strM34977.startsWith("/")) {
            return false;
        }
        if (strM34977.equals("/") && isAbsolute()) {
            return true;
        }
        String str2 = this.f45594;
        return str2.equals(strM34977) || str2.startsWith(strM34977.concat("/"));
    }

    @Override // l.InterfaceC24329
    public boolean endsWith(InterfaceC24329 interfaceC24329) {
        if (interfaceC24329 == null) {
            return false;
        }
        return endsWith(interfaceC24329.toString());
    }

    @Override // l.InterfaceC24329
    public boolean endsWith(String str) {
        if (str == null) {
            return false;
        }
        String strM34977 = m34977(str);
        boolean zStartsWith = strM34977.startsWith("/");
        String str2 = this.f45594;
        if (zStartsWith) {
            return str2.equals(strM34977);
        }
        return str2.equals(strM34977) || str2.endsWith("/".concat(strM34977));
    }

    @Override // l.InterfaceC24329
    public InterfaceC24329 normalize() {
        String str = this.f45594;
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
                    } else if (!arrayList.isEmpty() && !((String) j$$ExternalSyntheticOutline0.m(arrayList, 1)).equals("..")) {
                        C2764.m9138(arrayList, 1);
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
        return mo3995((!string.isEmpty() || isAbsolute()) ? string : ".");
    }

    @Override // l.InterfaceC24329
    public InterfaceC24329 resolve(InterfaceC24329 interfaceC24329) {
        if (interfaceC24329 == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        return resolve(interfaceC24329.toString());
    }

    @Override // l.InterfaceC24329
    public InterfaceC24329 resolve(String str) {
        if (str == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        String strM34977 = m34977(str);
        if (strM34977.isEmpty()) {
            return this;
        }
        if (strM34977.startsWith("/")) {
            return mo3995(strM34977);
        }
        String str2 = this.f45594;
        if (str2.isEmpty()) {
            return mo3995(strM34977);
        }
        return str2.equals("/") ? mo3995("/".concat(strM34977)) : mo3995(C20196.m46451(str2, "/", strM34977));
    }

    @Override // l.InterfaceC24329
    public InterfaceC24329 resolveSibling(InterfaceC24329 interfaceC24329) {
        if (interfaceC24329 == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        return resolveSibling(interfaceC24329.toString());
    }

    @Override // l.InterfaceC24329
    public InterfaceC24329 resolveSibling(String str) {
        if (str == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        InterfaceC24329 parent = getParent();
        if (parent == null) {
            return mo3995(m34977(str));
        }
        return ((C1061) parent).resolve(str);
    }

    @Override // l.InterfaceC24329
    public InterfaceC24329 relativize(InterfaceC24329 interfaceC24329) {
        int i;
        if (interfaceC24329 == null) {
            throw new NullPointerException("Other path cannot be null");
        }
        if (isAbsolute() != interfaceC24329.toString().startsWith("/")) {
            throw new IllegalArgumentException("Cannot relativize absolute and relative paths");
        }
        InterfaceC24329 interfaceC24329Normalize = normalize();
        InterfaceC24329 interfaceC24329Normalize2 = interfaceC24329.normalize();
        String str = ((C1061) interfaceC24329Normalize).f45594;
        String string = interfaceC24329Normalize2.toString();
        if (str.equals(string)) {
            return mo3995("");
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
        return mo3995(sb.length() != 0 ? sb.toString() : "");
    }

    @Override // l.InterfaceC24329
    public InterfaceC24329 toAbsolutePath() {
        if (isAbsolute()) {
            return this;
        }
        return mo3995("/" + this.f45594);
    }

    @Override // l.InterfaceC24329, java.lang.Iterable
    public Iterator iterator() {
        return new C4044(this, getNameCount());
    }

    @Override // l.InterfaceC24329
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1061) {
            C1061 c1061 = (C1061) obj;
            if (C17359.equals(((C1061) this).getFileSystem(), c1061.getFileSystem()) && C17359.equals(this.f45594, c1061.f45594)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC24329
    public int hashCode() {
        return C17359.hash(((C1061) this).getFileSystem(), this.f45594);
    }

    @Override // java.lang.Comparable
    public int compareTo(InterfaceC24329 interfaceC24329) {
        return this.f45594.compareTo(interfaceC24329.toString());
    }
}
