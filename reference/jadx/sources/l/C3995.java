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

/* JADX INFO: renamed from: l.ۘۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3995 extends AbstractC22733 {
    public final String e;
    public final String f = "/";
    public volatile C20403 g;

    @Override // l.AbstractC22733
    public final String getScheme() {
        return "file";
    }

    public C3995(String str) {
        this.e = str;
    }

    @Override // l.AbstractC22733
    public final AbstractC25075 newFileSystem(URI uri, Map map) {
        i(uri);
        throw new FileSystemAlreadyExistsException();
    }

    @Override // l.AbstractC22733
    public final AbstractC25075 getFileSystem(URI uri) {
        C20403 c20403;
        i(uri);
        C20403 c20404 = this.g;
        if (c20404 != null) {
            return c20404;
        }
        synchronized (this) {
            c20403 = this.g;
            if (c20403 == null) {
                c20403 = new C20403(this, this.e, this.f);
                this.g = c20403;
            }
        }
        return c20403;
    }

    @Override // l.AbstractC22733
    public final InterfaceC24329 getPath(URI uri) {
        byte bA;
        C20403 c20403 = this.g;
        String str = this.e;
        String str2 = this.f;
        char[] cArr = AbstractC18165.c;
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
                bA = (byte) ((AbstractC18165.a(rawPath.charAt(i3)) << 4) | AbstractC18165.a(rawPath.charAt(i4)));
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
        return new C21149(c20403, new String(bArrCopyOf, AbstractC0266.a), str, str2);
    }

    @Override // l.AbstractC22733
    public final DirectoryStream newDirectoryStream(InterfaceC24329 interfaceC24329, DirectoryStream.Filter filter) {
        filter.getClass();
        C6233 c6233 = new C6233();
        c6233.a = new C24133(this, interfaceC24329, filter);
        return c6233;
    }

    @Override // l.AbstractC22733
    public final void createDirectory(InterfaceC24329 interfaceC24329, InterfaceC13885... interfaceC13885Arr) throws NoSuchFileException, FileAlreadyExistsException {
        if (interfaceC24329.getParent() != null && !C3445.exists(interfaceC24329.getParent(), new EnumC20599[0])) {
            throw new NoSuchFileException(interfaceC24329.toString());
        }
        if (!interfaceC24329.toFile().mkdirs()) {
            throw new FileAlreadyExistsException(interfaceC24329.toString());
        }
    }

    @Override // l.AbstractC22733
    public final void delete(InterfaceC24329 interfaceC24329) throws NoSuchFileException {
        try {
            checkAccess(interfaceC24329, new EnumC5683[0]);
            c(interfaceC24329);
        } catch (IOException unused) {
            throw new NoSuchFileException(interfaceC24329.toString());
        }
    }

    @Override // l.AbstractC22733
    public final boolean c(InterfaceC24329 interfaceC24329) {
        return interfaceC24329.toFile().delete();
    }

    @Override // l.AbstractC22733
    public final SeekableByteChannel newByteChannel(InterfaceC24329 interfaceC24329, Set set, InterfaceC13885... interfaceC13885Arr) {
        return f(interfaceC24329, set, interfaceC13885Arr);
    }

    @Override // l.AbstractC22733
    public final FileChannel f(InterfaceC24329 interfaceC24329, Set set, InterfaceC13885... interfaceC13885Arr) {
        if (interfaceC24329.toFile().isDirectory()) {
            throw new UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: " + interfaceC24329);
        }
        return AbstractC1758.T(interfaceC24329, set);
    }

    @Override // l.AbstractC22733
    public final C15377 e(InterfaceC24329 interfaceC24329, Set set, ExecutorService executorService, InterfaceC13885... interfaceC13885Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22733
    public final void a(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22733
    public final void b(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, InterfaceC13885... interfaceC13885Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22733
    public final InterfaceC24329 h(InterfaceC24329 interfaceC24329) {
        return new C21149(this.g, interfaceC24329.toFile().getCanonicalPath(), this.e, this.f);
    }

    @Override // l.AbstractC22733
    public final void copy(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, InterfaceC1954... interfaceC1954Arr) throws IOException {
        if (!j(interfaceC1954Arr, EnumC18361.REPLACE_EXISTING) && C3445.exists(interfaceC243210, new EnumC20599[0])) {
            throw new FileAlreadyExistsException(interfaceC243210.toString());
        }
        if (j(interfaceC1954Arr, EnumC18361.ATOMIC_MOVE)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        FileInputStream fileInputStream = new FileInputStream(interfaceC24329.toFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(interfaceC243210.toFile());
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

    @Override // l.AbstractC22733
    public final void move(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, InterfaceC1954... interfaceC1954Arr) throws FileAlreadyExistsException {
        if (!j(interfaceC1954Arr, EnumC18361.REPLACE_EXISTING) && C3445.exists(interfaceC243210, new EnumC20599[0])) {
            throw new FileAlreadyExistsException(interfaceC243210.toString());
        }
        if (j(interfaceC1954Arr, EnumC18361.COPY_ATTRIBUTES)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        interfaceC24329.toFile().renameTo(interfaceC243210.toFile());
    }

    public static boolean j(InterfaceC1954[] interfaceC1954Arr, EnumC18361 enumC18361) {
        for (InterfaceC1954 interfaceC1954 : interfaceC1954Arr) {
            if (interfaceC1954 == enumC18361) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC22733
    public final boolean isSameFile(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210) throws IOException {
        if (interfaceC24329.equals(interfaceC243210)) {
            return true;
        }
        checkAccess(interfaceC24329, new EnumC5683[0]);
        checkAccess(interfaceC243210, new EnumC5683[0]);
        return interfaceC24329.toFile().equals(interfaceC243210.toFile());
    }

    @Override // l.AbstractC22733
    public final boolean isHidden(InterfaceC24329 interfaceC24329) {
        return interfaceC24329.toFile().isHidden();
    }

    @Override // l.AbstractC22733
    public final AbstractC11648 getFileStore(InterfaceC24329 interfaceC24329) {
        throw new SecurityException("getFileStore");
    }

    @Override // l.AbstractC22733
    public final InterfaceC4659 getFileAttributeView(InterfaceC24329 interfaceC24329, Class cls, EnumC20599... enumC20599Arr) {
        cls.getClass();
        if (cls == InterfaceC15845.class) {
            return (InterfaceC4659) cls.cast(new C24879(interfaceC24329));
        }
        return null;
    }

    @Override // l.AbstractC22733
    public final void checkAccess(InterfaceC24329 interfaceC24329, EnumC5683... enumC5683Arr) throws IOException {
        boolean zCanRead;
        File file = interfaceC24329.toFile();
        if (!file.exists()) {
            throw new NoSuchFileException(interfaceC24329.toString());
        }
        boolean z = true;
        for (EnumC5683 enumC5683 : enumC5683Arr) {
            int i = AbstractC12198.a[enumC5683.ordinal()];
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
            throw new IOException(String.format("Unable to access file %s", interfaceC24329));
        }
    }

    @Override // l.AbstractC22733
    public final InterfaceC8665 readAttributes(InterfaceC24329 interfaceC24329, Class cls, EnumC20599... enumC20599Arr) {
        if (cls != InterfaceC8665.class) {
            throw new UnsupportedOperationException();
        }
        return (InterfaceC8665) cls.cast(((InterfaceC15845) getFileAttributeView(interfaceC24329, InterfaceC15845.class, enumC20599Arr)).readAttributes());
    }

    @Override // l.AbstractC22733
    public final Map readAttributes(InterfaceC24329 interfaceC24329, String str, EnumC20599... enumC20599Arr) {
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
        C24879 c24879 = new C24879(interfaceC24329);
        Set set = C24879.b;
        C11452 c11452 = new C11452();
        c11452.a = new HashSet();
        c11452.b = new HashMap();
        for (String str2 : strArrSplit) {
            if (str2.equals("*")) {
                c11452.c = true;
            } else {
                if (!((HashSet) set).contains(str2)) {
                    throw new IllegalArgumentException("'" + str2 + "' not recognized");
                }
                ((HashSet) c11452.a).add(str2);
            }
        }
        InterfaceC8665 attributes = c24879.readAttributes();
        if (c11452.b("size")) {
            c11452.a(Long.valueOf(((C16673) attributes).size()), "size");
        }
        if (c11452.b("creationTime")) {
            c11452.a(((C16673) attributes).creationTime(), "creationTime");
        }
        if (c11452.b("lastAccessTime")) {
            c11452.a(((C16673) attributes).lastAccessTime(), "lastAccessTime");
        }
        if (c11452.b("lastModifiedTime")) {
            c11452.a(((C16673) attributes).lastModifiedTime(), "lastModifiedTime");
        }
        if (c11452.b("fileKey")) {
            c11452.a(((C16673) attributes).fileKey(), "fileKey");
        }
        if (c11452.b("isDirectory")) {
            c11452.a(Boolean.valueOf(((C16673) attributes).isDirectory()), "isDirectory");
        }
        if (c11452.b("isRegularFile")) {
            c11452.a(Boolean.valueOf(((C16673) attributes).isRegularFile()), "isRegularFile");
        }
        if (c11452.b("isSymbolicLink")) {
            c11452.a(Boolean.valueOf(((C16673) attributes).isSymbolicLink()), "isSymbolicLink");
        }
        if (c11452.b("isOther")) {
            c11452.a(Boolean.valueOf(((C16673) attributes).isOther()), "isOther");
        }
        return Collections.unmodifiableMap(c11452.b);
    }

    @Override // l.AbstractC22733
    public final void setAttribute(InterfaceC24329 interfaceC24329, String str, Object obj, EnumC20599... enumC20599Arr) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            str = str.substring(iIndexOf + 1);
        }
        C24879 c24879 = new C24879(interfaceC24329);
        if (str.equals("lastModifiedTime")) {
            c24879.a((C21813) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            c24879.a(null, (C21813) obj, null);
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
