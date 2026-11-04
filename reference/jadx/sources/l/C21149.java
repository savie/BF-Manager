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

/* JADX INFO: renamed from: l.᩶ۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21149 implements InterfaceC24329 {
    public static final Pattern h = Pattern.compile("/+");
    public final AbstractC25075 a;
    public final String b;
    public final List c;
    public final boolean d;
    public final String e;
    public final String f;
    public volatile byte[] g;

    public C21149(AbstractC25075 abstractC25075, String str, String str2, String str3) {
        this(abstractC25075, str.startsWith("/"), str.isEmpty() ? Collections.singletonList("") : (List) C13847.stream(h.split(str)).filter(new C14435(0)).collect(C2025.toUnmodifiableList()), str2, str3);
    }

    public C21149(AbstractC25075 abstractC25075, boolean z, List list, String str, String str2) {
        this.a = abstractC25075;
        this.d = z;
        this.c = list;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "/" : "");
        sb.append(AbstractC1758.A(list));
        this.b = sb.toString();
        this.e = str;
        this.f = str2;
    }

    @Override // l.InterfaceC24329
    public final AbstractC25075 getFileSystem() {
        return this.a;
    }

    @Override // l.InterfaceC24329
    public final InterfaceC24329 toRealPath(EnumC20599[] enumC20599Arr) {
        this.a.provider().checkAccess(this, EnumC5683.READ);
        if (Arrays.asList(enumC20599Arr).contains(EnumC20599.NOFOLLOW_LINKS)) {
            return toAbsolutePath();
        }
        return new C21149(this.a, toFile().getCanonicalPath(), this.e, this.f);
    }

    @Override // l.InterfaceC24329
    public final InterfaceC24329 getRoot() {
        if (!this.d) {
            return null;
        }
        AbstractC25075 abstractC25075 = this.a;
        String str = this.f;
        return new C21149(abstractC25075, str, this.e, str);
    }

    @Override // l.InterfaceC24329
    public final boolean isAbsolute() {
        return this.d;
    }

    @Override // l.InterfaceC24329
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final C21149 toAbsolutePath() {
        if (this.d) {
            return this;
        }
        AbstractC25075 abstractC25075 = this.a;
        String str = this.e;
        return new C21149(abstractC25075, str, str, this.f).resolve(this);
    }

    @Override // l.InterfaceC24329
    public final InterfaceC24329 getFileName() {
        if (this.c.isEmpty()) {
            if (this.d) {
                return null;
            }
            return this;
        }
        AbstractC25075 abstractC25075 = this.a;
        List list = this.c;
        return new C21149(abstractC25075, (String) list.get(list.size() - 1), this.e, this.f);
    }

    @Override // l.InterfaceC24329
    public final int getNameCount() {
        return this.c.size();
    }

    @Override // l.InterfaceC24329
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final C21149 getName(int i) {
        if (i < 0 || i >= this.c.size()) {
            throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i), this));
        }
        return new C21149(this.a, (String) this.c.get(i), this.e, this.f);
    }

    @Override // l.InterfaceC24329
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final C21149 getParent() {
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
        sb.append(AbstractC1758.A(this.c.subList(0, size - 1)));
        return new C21149(this.a, sb.toString(), this.e, this.f);
    }

    @Override // l.InterfaceC24329
    public final InterfaceC24329 subpath(int i, int i2) {
        return new C21149(this.a, AbstractC1758.A(this.c.subList(i, i2)), this.e, this.f);
    }

    @Override // l.InterfaceC24329
    public final boolean startsWith(String str) {
        return startsWith(new C21149(this.a, str, this.e, this.f));
    }

    @Override // l.InterfaceC24329
    public final boolean startsWith(InterfaceC24329 interfaceC24329) {
        int size;
        C17359.requireNonNull(interfaceC24329);
        if (!(interfaceC24329 instanceof C21149)) {
            return false;
        }
        C21149 c21149 = (C21149) interfaceC24329;
        if (this.d != c21149.d || this.c.size() < (size = c21149.c.size())) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!getName(i).equals(c21149.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // l.InterfaceC24329
    public final boolean endsWith(String str) {
        return endsWith(new C21149(this.a, str, this.e, this.f));
    }

    @Override // l.InterfaceC24329
    public final boolean endsWith(InterfaceC24329 interfaceC24329) {
        C17359.requireNonNull(interfaceC24329);
        if (!(interfaceC24329 instanceof C21149)) {
            return false;
        }
        C21149 c21149 = (C21149) interfaceC24329;
        if (!c21149.d) {
            int size = c21149.c.size();
            if (this.c.size() < size) {
                return false;
            }
            int size2 = this.c.size();
            for (int i = size - 1; i >= 0; i--) {
                if (!getName((i - size) + size2).equals(c21149.getName(i))) {
                    return false;
                }
            }
            return true;
        }
        return equals(interfaceC24329);
    }

    @Override // l.InterfaceC24329
    public final boolean equals(Object obj) {
        return (obj instanceof C21149) && compareTo((InterfaceC24329) obj) == 0;
    }

    @Override // l.InterfaceC24329
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC24329 interfaceC24329) {
        return this.b.compareTo(((C21149) interfaceC24329).b);
    }

    @Override // l.InterfaceC24329
    public final InterfaceC24329 normalize() {
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
        AbstractC25075 abstractC25075 = this.a;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "/" : "");
        sb.append(AbstractC1758.A(arrayDeque));
        return new C21149(abstractC25075, sb.toString(), this.e, this.f);
    }

    @Override // l.InterfaceC24329
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C21149 resolve(InterfaceC24329 interfaceC24329) {
        if (interfaceC24329 instanceof C21149) {
            if (((C21149) interfaceC24329).d) {
                return (C21149) interfaceC24329;
            }
            return new C21149(this.a, this.b + "/" + interfaceC24329, this.e, this.f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", interfaceC24329, interfaceC24329.getFileSystem()));
    }

    @Override // l.InterfaceC24329
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final C21149 resolveSibling(InterfaceC24329 interfaceC24329) {
        if (!(C17359.requireNonNull(interfaceC24329) instanceof C21149)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", interfaceC24329, interfaceC24329.getFileSystem()));
        }
        C21149 parent = getParent();
        return parent == null ? (C21149) interfaceC24329 : parent.resolve(interfaceC24329);
    }

    @Override // l.InterfaceC24329
    public final InterfaceC24329 resolveSibling(String str) {
        return resolveSibling(new C21149(this.a, str, this.e, this.f));
    }

    @Override // l.InterfaceC24329
    public final InterfaceC24329 relativize(InterfaceC24329 interfaceC24329) {
        int i = 0;
        if (interfaceC24329 instanceof C21149) {
            if (this.d != ((C21149) interfaceC24329).d) {
                throw new IllegalArgumentException("'other' is different type of Path in absolute property.");
            }
            List list = ((C21149) interfaceC24329).c;
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
            return new C21149(this.a, false, arrayList, this.e, this.f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", interfaceC24329, interfaceC24329.getFileSystem()));
    }

    @Override // l.InterfaceC24329
    public final File toFile() {
        return new File(this.b);
    }

    @Override // l.InterfaceC24329
    public final URI toUri() {
        char[] cArr = AbstractC18165.c;
        C21149 absolutePath = toAbsolutePath();
        if (absolutePath.g == null) {
            absolutePath.g = absolutePath.b.getBytes(AbstractC0266.a);
        }
        byte[] bArr = absolutePath.g;
        StringBuilder sb = new StringBuilder("file:///");
        for (int i = 1; i < bArr.length; i++) {
            char c = (char) (bArr[i] & 255);
            long j = AbstractC18165.a;
            long j2 = AbstractC18165.b;
            if (c >= '@' ? !(c >= 128 || ((1 << (c - '@')) & j2) == 0) : (j & (1 << c)) != 0) {
                sb.append(c);
            } else {
                sb.append('%');
                char[] cArr2 = AbstractC18165.c;
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

    @Override // l.InterfaceC24329
    public final String toString() {
        return this.b;
    }

    @Override // l.InterfaceC24329, l.InterfaceC21987
    public final InterfaceC10156 register(InterfaceC1208 interfaceC1208, InterfaceC7920[] interfaceC7920Arr, InterfaceC19107... interfaceC19107Arr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // l.InterfaceC24329
    public final InterfaceC24329 resolve(String str) {
        return resolve(getFileSystem().getPath(str, new String[0]));
    }

    @Override // l.InterfaceC24329, l.InterfaceC21987
    public final InterfaceC10156 register(InterfaceC1208 interfaceC1208, InterfaceC7920... interfaceC7920Arr) {
        register(interfaceC1208, interfaceC7920Arr, new InterfaceC19107[0]);
        throw null;
    }

    @Override // l.InterfaceC24329, java.lang.Iterable
    public final Iterator iterator() {
        return new C1850(this);
    }
}
