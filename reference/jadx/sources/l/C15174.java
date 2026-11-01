package l;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܶۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15174 implements InterfaceC3800 {
    public static final Pattern h = Pattern.compile("/+");
    public final AbstractC3178 a;
    public final String b;
    public final List c;
    public final boolean d;
    public final String e;
    public final String f;
    public volatile byte[] g;

    public C15174(AbstractC3178 abstractC3178, String str, String str2, String str3) {
        this(abstractC3178, str.startsWith("/"), str.isEmpty() ? Collections.singletonList("") : (List) C20318.stream(h.split(str)).filter(new C22935(0)).collect(C1890.toUnmodifiableList()), str2, str3);
    }

    public C15174(AbstractC3178 abstractC3178, boolean z, List list, String str, String str2) {
        this.a = abstractC3178;
        this.d = z;
        this.c = list;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "/" : "");
        sb.append(AbstractC1726.A(list));
        this.b = sb.toString();
        this.e = str;
        this.f = str2;
    }

    @Override // l.InterfaceC3800
    public final AbstractC3178 getFileSystem() {
        return this.a;
    }

    @Override // l.InterfaceC3800
    public final InterfaceC3800 toRealPath(EnumC22146[] enumC22146Arr) {
        this.a.provider().checkAccess(this, EnumC14469.READ);
        if (Arrays.asList(enumC22146Arr).contains(EnumC22146.NOFOLLOW_LINKS)) {
            return toAbsolutePath();
        }
        return new C15174(this.a, toFile().getCanonicalPath(), this.e, this.f);
    }

    @Override // l.InterfaceC3800
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final C15174 toAbsolutePath() {
        if (this.d) {
            return this;
        }
        AbstractC3178 abstractC3178 = this.a;
        String str = this.e;
        return new C15174(abstractC3178, str, str, this.f).resolve(this);
    }

    @Override // l.InterfaceC3800
    public final InterfaceC3800 getRoot() {
        if (!this.d) {
            return null;
        }
        AbstractC3178 abstractC3178 = this.a;
        String str = this.f;
        return new C15174(abstractC3178, str, this.e, str);
    }

    @Override // l.InterfaceC3800
    public final boolean isAbsolute() {
        return this.d;
    }

    @Override // l.InterfaceC3800
    public final InterfaceC3800 getFileName() {
        if (this.c.isEmpty()) {
            if (this.d) {
                return null;
            }
            return this;
        }
        AbstractC3178 abstractC3178 = this.a;
        List list = this.c;
        return new C15174(abstractC3178, (String) list.get(list.size() - 1), this.e, this.f);
    }

    @Override // l.InterfaceC3800
    public final int getNameCount() {
        return this.c.size();
    }

    @Override // l.InterfaceC3800
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final C15174 getName(int i) {
        if (i < 0 || i >= this.c.size()) {
            throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i), this));
        }
        return new C15174(this.a, (String) this.c.get(i), this.e, this.f);
    }

    @Override // l.InterfaceC3800
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final C15174 getParent() {
        int size = this.c.size();
        if (size == 0) {
            return null;
        }
        if (size == 1 && !this.d) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (this.d) {
            sb.append("/");
        }
        sb.append(AbstractC1726.A(this.c.subList(0, size - 1)));
        return new C15174(this.a, sb.toString(), this.e, this.f);
    }

    @Override // l.InterfaceC3800
    public final InterfaceC3800 subpath(int i, int i2) {
        return new C15174(this.a, AbstractC1726.A(this.c.subList(i, i2)), this.e, this.f);
    }

    @Override // l.InterfaceC3800
    public final boolean startsWith(String str) {
        return startsWith(new C15174(this.a, str, this.e, this.f));
    }

    @Override // l.InterfaceC3800
    public final boolean startsWith(InterfaceC3800 interfaceC3800) {
        int size;
        C13638.requireNonNull(interfaceC3800);
        if (!(interfaceC3800 instanceof C15174)) {
            return false;
        }
        C15174 c15174 = (C15174) interfaceC3800;
        if (this.d != c15174.d || this.c.size() < (size = c15174.c.size())) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!getName(i).equals(c15174.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // l.InterfaceC3800
    public final boolean endsWith(String str) {
        return endsWith(new C15174(this.a, str, this.e, this.f));
    }

    @Override // l.InterfaceC3800
    public final boolean endsWith(InterfaceC3800 interfaceC3800) {
        C13638.requireNonNull(interfaceC3800);
        if (!(interfaceC3800 instanceof C15174)) {
            return false;
        }
        C15174 c15174 = (C15174) interfaceC3800;
        if (!c15174.d) {
            int size = c15174.c.size();
            if (this.c.size() < size) {
                return false;
            }
            int size2 = this.c.size();
            for (int i = size - 1; i >= 0; i--) {
                if (!getName((i - size) + size2).equals(c15174.getName(i))) {
                    return false;
                }
            }
            return true;
        }
        return equals(interfaceC3800);
    }

    @Override // l.InterfaceC3800
    public final boolean equals(Object obj) {
        return (obj instanceof C15174) && compareTo((InterfaceC3800) obj) == 0;
    }

    @Override // l.InterfaceC3800
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC3800 interfaceC3800) {
        return this.b.compareTo(((C15174) interfaceC3800).b);
    }

    @Override // l.InterfaceC3800
    public final InterfaceC3800 normalize() {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : this.c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        AbstractC3178 abstractC3178 = this.a;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "/" : "");
        sb.append(AbstractC1726.A(arrayDeque));
        return new C15174(abstractC3178, sb.toString(), this.e, this.f);
    }

    @Override // l.InterfaceC3800
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final C15174 resolve(InterfaceC3800 interfaceC3800) {
        if (interfaceC3800 instanceof C15174) {
            if (((C15174) interfaceC3800).d) {
                return (C15174) interfaceC3800;
            }
            return new C15174(this.a, this.b + "/" + interfaceC3800, this.e, this.f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", interfaceC3800, interfaceC3800.getFileSystem()));
    }

    @Override // l.InterfaceC3800
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final C15174 resolveSibling(InterfaceC3800 interfaceC3800) {
        if (!(C13638.requireNonNull(interfaceC3800) instanceof C15174)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", interfaceC3800, interfaceC3800.getFileSystem()));
        }
        C15174 parent = getParent();
        return parent == null ? (C15174) interfaceC3800 : parent.resolve(interfaceC3800);
    }

    @Override // l.InterfaceC3800
    public final InterfaceC3800 resolveSibling(String str) {
        return resolveSibling(new C15174(this.a, str, this.e, this.f));
    }

    @Override // l.InterfaceC3800
    public final InterfaceC3800 relativize(InterfaceC3800 interfaceC3800) {
        int i = 0;
        if (interfaceC3800 instanceof C15174) {
            if (this.d != ((C15174) interfaceC3800).d) {
                throw new IllegalArgumentException("'other' is different type of Path in absolute property.");
            }
            List list = ((C15174) interfaceC3800).c;
            int size = this.c.size();
            int size2 = list.size();
            while (i < size && i < size2 && ((String) this.c.get(i)).equals(list.get(i))) {
                i++;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = i; i2 < size; i2++) {
                arrayList.add("..");
            }
            while (i < size2) {
                arrayList.add((String) list.get(i));
                i++;
            }
            return new C15174(this.a, false, arrayList, this.e, this.f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", interfaceC3800, interfaceC3800.getFileSystem()));
    }

    @Override // l.InterfaceC3800
    public final File toFile() {
        return new File(this.b);
    }

    @Override // l.InterfaceC3800
    public final URI toUri() {
        char[] cArr = AbstractC21523.c;
        C15174 absolutePath = toAbsolutePath();
        if (absolutePath.g == null) {
            absolutePath.g = absolutePath.b.getBytes(AbstractC17995.a);
        }
        byte[] bArr = absolutePath.g;
        StringBuilder sb = new StringBuilder("file:///");
        for (int i = 1; i < bArr.length; i++) {
            char c = (char) (bArr[i] & 255);
            long j = AbstractC21523.a;
            long j2 = AbstractC21523.b;
            if (c >= '@' ? !(c >= 128 || ((1 << (c - '@')) & j2) == 0) : (j & (1 << c)) != 0) {
                sb.append(c);
            } else {
                sb.append('%');
                char[] cArr2 = AbstractC21523.c;
                sb.append(cArr2[(c >> 4) & 15]);
                sb.append(cArr2[c & 15]);
            }
        }
        if (sb.charAt(sb.length() - 1) != '/' && toFile().isDirectory()) {
            sb.append('/');
        }
        try {
            return new URI(sb.toString());
        } catch (URISyntaxException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC3800
    public final String toString() {
        return this.b;
    }

    @Override // l.InterfaceC3800, l.InterfaceC16750
    public final InterfaceC19324 register(InterfaceC8741 interfaceC8741, InterfaceC18618[] interfaceC18618Arr, InterfaceC8035... interfaceC8035Arr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // l.InterfaceC3800
    public final InterfaceC3800 resolve(String str) {
        return resolve(getFileSystem().getPath(str, new String[0]));
    }

    @Override // l.InterfaceC3800, l.InterfaceC16750
    public final InterfaceC19324 register(InterfaceC8741 interfaceC8741, InterfaceC18618... interfaceC18618Arr) {
        register(interfaceC8741, interfaceC18618Arr, new InterfaceC8035[0]);
        throw null;
    }

    @Override // l.InterfaceC3800, java.lang.Iterable
    public final Iterator iterator() {
        return new C1932(this);
    }
}
