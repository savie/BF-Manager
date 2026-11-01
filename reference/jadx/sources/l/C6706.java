package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۜۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6706 extends AbstractC17455 {
    public final String e;
    public final String f = "/";
    public volatile C22229 g;

    @Override // l.AbstractC17455
    public final String getScheme() {
        return "file";
    }

    public C6706(String str) {
        this.e = str;
    }

    @Override // l.AbstractC17455
    public final AbstractC3178 newFileSystem(URI uri, Map map) {
        i(uri);
        throw new FileSystemAlreadyExistsException();
    }

    @Override // l.AbstractC17455
    public final AbstractC3178 getFileSystem(URI uri) {
        C22229 c22229;
        i(uri);
        C22229 c222210 = this.g;
        if (c222210 != null) {
            return c222210;
        }
        synchronized (this) {
            c22229 = this.g;
            if (c22229 == null) {
                c22229 = new C22229(this, this.e, this.f);
                this.g = c22229;
            }
        }
        return c22229;
    }

    @Override // l.AbstractC17455
    public final InterfaceC3800 getPath(URI uri) {
        byte bA;
        C22229 c22229 = this.g;
        String str = this.e;
        String str2 = this.f;
        char[] cArr = AbstractC21523.c;
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("URI is not absolute");
        }
        if (uri.isOpaque()) {
            throw new IllegalArgumentException("URI is not hierarchical");
        }
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI scheme is not \"file\"");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("URI has an authority component");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("URI has a fragment component");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("URI has a query component");
        }
        String rawPath = uri.getRawPath();
        int length = rawPath.length();
        if (length == 0) {
            throw new IllegalArgumentException("URI path component is empty");
        }
        if (rawPath.endsWith("/") && length > 1) {
            length--;
        }
        byte[] bArrCopyOf = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = rawPath.charAt(i);
            if (cCharAt == '%') {
                int i4 = i + 2;
                i += 3;
                bA = (byte) ((AbstractC21523.a(rawPath.charAt(i3)) << 4) | AbstractC21523.a(rawPath.charAt(i4)));
                if (bA == 0) {
                    throw new IllegalArgumentException("Nul character not allowed");
                }
            } else {
                if (cCharAt == 0 || cCharAt >= 128) {
                    throw new IllegalArgumentException("Bad escape");
                }
                bA = (byte) cCharAt;
                i = i3;
            }
            bArrCopyOf[i2] = bA;
            i2++;
        }
        if (i2 != length) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
        }
        return new C15174(c22229, new String(bArrCopyOf, AbstractC17995.a), str, str2);
    }

    @Override // l.AbstractC17455
    public final DirectoryStream newDirectoryStream(InterfaceC3800 interfaceC3800, DirectoryStream.Filter filter) {
        filter.getClass();
        C13057 c13057 = new C13057();
        c13057.a = new C3883(this, interfaceC3800, filter);
        return c13057;
    }

    @Override // l.AbstractC17455
    public final void createDirectory(InterfaceC3800 interfaceC3800, InterfaceC20030... interfaceC20030Arr) throws NoSuchFileException, FileAlreadyExistsException {
        if (interfaceC3800.getParent() != null && !C5212.exists(interfaceC3800.getParent(), new EnumC22146[0])) {
            throw new NoSuchFileException(interfaceC3800.toString());
        }
        if (!interfaceC3800.toFile().mkdirs()) {
            throw new FileAlreadyExistsException(interfaceC3800.toString());
        }
    }

    @Override // l.AbstractC17455
    public final void delete(InterfaceC3800 interfaceC3800) throws NoSuchFileException {
        try {
            checkAccess(interfaceC3800, new EnumC14469[0]);
            c(interfaceC3800);
        } catch (IOException unused) {
            throw new NoSuchFileException(interfaceC3800.toString());
        }
    }

    @Override // l.AbstractC17455
    public final boolean c(InterfaceC3800 interfaceC3800) {
        return interfaceC3800.toFile().delete();
    }

    @Override // l.AbstractC17455
    public final SeekableByteChannel newByteChannel(InterfaceC3800 interfaceC3800, Set set, InterfaceC20030... interfaceC20030Arr) {
        return f(interfaceC3800, set, interfaceC20030Arr);
    }

    @Override // l.AbstractC17455
    public final FileChannel f(InterfaceC3800 interfaceC3800, Set set, InterfaceC20030... interfaceC20030Arr) {
        if (interfaceC3800.toFile().isDirectory()) {
            throw new UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: " + interfaceC3800);
        }
        return AbstractC1726.T(interfaceC3800, set);
    }

    @Override // l.AbstractC17455
    public final C10941 e(InterfaceC3800 interfaceC3800, Set set, ExecutorService executorService, InterfaceC20030... interfaceC20030Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC17455
    public final void a(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC17455
    public final void b(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, InterfaceC20030... interfaceC20030Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC17455
    public final InterfaceC3800 h(InterfaceC3800 interfaceC3800) {
        return new C15174(this.g, interfaceC3800.toFile().getCanonicalPath(), this.e, this.f);
    }

    @Override // l.AbstractC17455
    public final void copy(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, InterfaceC1767... interfaceC1767Arr) throws IOException {
        if (!j(interfaceC1767Arr, EnumC21440.REPLACE_EXISTING) && C5212.exists(interfaceC3801, new EnumC22146[0])) {
            throw new FileAlreadyExistsException(interfaceC3801.toString());
        }
        if (j(interfaceC1767Arr, EnumC21440.ATOMIC_MOVE)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        FileInputStream fileInputStream = new FileInputStream(interfaceC3800.toFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(interfaceC3801.toFile());
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr, 0, 8192);
                    if (i >= 0) {
                        fileOutputStream.write(bArr, 0, i);
                    } else {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    try {
                        fileInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            fileInputStream.close();
            throw th4;
        }
    }

    @Override // l.AbstractC17455
    public final void move(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, InterfaceC1767... interfaceC1767Arr) throws FileAlreadyExistsException {
        if (!j(interfaceC1767Arr, EnumC21440.REPLACE_EXISTING) && C5212.exists(interfaceC3801, new EnumC22146[0])) {
            throw new FileAlreadyExistsException(interfaceC3801.toString());
        }
        if (j(interfaceC1767Arr, EnumC21440.COPY_ATTRIBUTES)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        interfaceC3800.toFile().renameTo(interfaceC3801.toFile());
    }

    public static boolean j(InterfaceC1767[] interfaceC1767Arr, EnumC21440 enumC21440) {
        for (InterfaceC1767 interfaceC1767 : interfaceC1767Arr) {
            if (interfaceC1767 == enumC21440) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC17455
    public final boolean isSameFile(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801) throws IOException {
        if (interfaceC3800.equals(interfaceC3801)) {
            return true;
        }
        checkAccess(interfaceC3800, new EnumC14469[0]);
        checkAccess(interfaceC3801, new EnumC14469[0]);
        return interfaceC3800.toFile().equals(interfaceC3801.toFile());
    }

    @Override // l.AbstractC17455
    public final boolean isHidden(InterfaceC3800 interfaceC3800) {
        return interfaceC3800.toFile().isHidden();
    }

    @Override // l.AbstractC17455
    public final AbstractC9530 getFileStore(InterfaceC3800 interfaceC3800) {
        throw new SecurityException("getFileStore");
    }

    @Override // l.AbstractC17455
    public final InterfaceC0273 getFileAttributeView(InterfaceC3800 interfaceC3800, Class cls, EnumC22146... enumC22146Arr) {
        cls.getClass();
        if (cls == InterfaceC11957.class) {
            return (InterfaceC0273) cls.cast(new C3137(interfaceC3800));
        }
        return null;
    }

    @Override // l.AbstractC17455
    public final void checkAccess(InterfaceC3800 interfaceC3800, EnumC14469... enumC14469Arr) throws IOException {
        boolean zCanRead;
        File file = interfaceC3800.toFile();
        if (!file.exists()) {
            throw new NoSuchFileException(interfaceC3800.toString());
        }
        boolean z = true;
        for (EnumC14469 enumC14469 : enumC14469Arr) {
            int i = AbstractC1061.a[enumC14469.ordinal()];
            if (i == 1) {
                zCanRead = file.canRead();
            } else if (i != 2) {
                if (i == 3) {
                    zCanRead = file.canExecute();
                }
            } else {
                zCanRead = file.canWrite();
            }
            z &= zCanRead;
        }
        if (!z) {
            throw new IOException(String.format("Unable to access file %s", interfaceC3800));
        }
    }

    @Override // l.AbstractC17455
    public final InterfaceC20735 readAttributes(InterfaceC3800 interfaceC3800, Class cls, EnumC22146... enumC22146Arr) {
        if (cls != InterfaceC20735.class) {
            throw new UnsupportedOperationException();
        }
        return (InterfaceC20735) cls.cast(((InterfaceC11957) getFileAttributeView(interfaceC3800, InterfaceC11957.class, enumC22146Arr)).readAttributes());
    }

    @Override // l.AbstractC17455
    public final Map readAttributes(InterfaceC3800 interfaceC3800, String str, EnumC22146... enumC22146Arr) {
        String[] strArrSplit;
        int iIndexOf = str.indexOf(":");
        if (iIndexOf == -1) {
            strArrSplit = str.split(",");
        } else {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            strArrSplit = str.substring(iIndexOf + 1).split(",");
        }
        C3137 c3137 = new C3137(interfaceC3800);
        Set set = C3137.b;
        C9489 c9489 = new C9489();
        c9489.a = new HashSet();
        c9489.b = new HashMap();
        for (String str2 : strArrSplit) {
            if (str2.equals("*")) {
                c9489.c = true;
            } else {
                if (!((HashSet) set).contains(str2)) {
                    throw new IllegalArgumentException("'" + str2 + "' not recognized");
                }
                ((HashSet) c9489.a).add(str2);
            }
        }
        InterfaceC20735 attributes = c3137.readAttributes();
        if (c9489.b("size")) {
            c9489.a(Long.valueOf(((C4589) attributes).size()), "size");
        }
        if (c9489.b("creationTime")) {
            c9489.a(((C4589) attributes).creationTime(), "creationTime");
        }
        if (c9489.b("lastAccessTime")) {
            c9489.a(((C4589) attributes).lastAccessTime(), "lastAccessTime");
        }
        if (c9489.b("lastModifiedTime")) {
            c9489.a(((C4589) attributes).lastModifiedTime(), "lastModifiedTime");
        }
        if (c9489.b("fileKey")) {
            c9489.a(((C4589) attributes).fileKey(), "fileKey");
        }
        if (c9489.b("isDirectory")) {
            c9489.a(Boolean.valueOf(((C4589) attributes).isDirectory()), "isDirectory");
        }
        if (c9489.b("isRegularFile")) {
            c9489.a(Boolean.valueOf(((C4589) attributes).isRegularFile()), "isRegularFile");
        }
        if (c9489.b("isSymbolicLink")) {
            c9489.a(Boolean.valueOf(((C4589) attributes).isSymbolicLink()), "isSymbolicLink");
        }
        if (c9489.b("isOther")) {
            c9489.a(Boolean.valueOf(((C4589) attributes).isOther()), "isOther");
        }
        return Collections.unmodifiableMap(c9489.b);
    }

    @Override // l.AbstractC17455
    public final void setAttribute(InterfaceC3800 interfaceC3800, String str, Object obj, EnumC22146... enumC22146Arr) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            str = str.substring(iIndexOf + 1);
        }
        C3137 c3137 = new C3137(interfaceC3800);
        if (str.equals("lastModifiedTime")) {
            c3137.a((C16502) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            c3137.a(null, (C16502) obj, null);
        } else {
            if (str.equals("creationTime")) {
                return;
            }
            throw new IllegalArgumentException("'basic:" + str + "' not recognized");
        }
    }

    public static void i(URI uri) {
        if (!uri.getScheme().equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI does not match this provider");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("Authority component present");
        }
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("Path component is undefined");
        }
        if (!path.equals("/")) {
            throw new IllegalArgumentException("Path component should be '/'");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("Query component present");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("Fragment component present");
        }
    }
}
