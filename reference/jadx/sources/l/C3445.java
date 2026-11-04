package l;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3445 {
    public static final Set a = AbstractC1758.D(new Object[]{EnumC0462.CREATE_NEW, EnumC0462.WRITE});

    public static AbstractC22733 b(InterfaceC24329 interfaceC24329) {
        return interfaceC24329.getFileSystem().provider();
    }

    public static InputStream newInputStream(InterfaceC24329 interfaceC24329, InterfaceC12394... interfaceC12394Arr) {
        return b(interfaceC24329).newInputStream(interfaceC24329, interfaceC12394Arr);
    }

    public static OutputStream newOutputStream(InterfaceC24329 interfaceC24329, InterfaceC12394... interfaceC12394Arr) {
        return b(interfaceC24329).g(interfaceC24329, interfaceC12394Arr);
    }

    public static DirectoryStream newDirectoryStream(InterfaceC24329 interfaceC24329) {
        return b(interfaceC24329).newDirectoryStream(interfaceC24329, C4833.a);
    }

    public static DirectoryStream newDirectoryStream(InterfaceC24329 interfaceC24329, String str) {
        if (str.equals("*")) {
            return newDirectoryStream(interfaceC24329);
        }
        AbstractC25075 fileSystem = interfaceC24329.getFileSystem();
        return fileSystem.provider().newDirectoryStream(interfaceC24329, new C3249(1, fileSystem.getPathMatcher("glob:".concat(str))));
    }

    public static DirectoryStream newDirectoryStream(InterfaceC24329 interfaceC24329, DirectoryStream.Filter filter) {
        return b(interfaceC24329).newDirectoryStream(interfaceC24329, filter);
    }

    public static InterfaceC24329 createFile(InterfaceC24329 interfaceC24329, InterfaceC13885... interfaceC13885Arr) {
        b(interfaceC24329).newByteChannel(interfaceC24329, a, interfaceC13885Arr).close();
        return interfaceC24329;
    }

    public static InterfaceC24329 createDirectory(InterfaceC24329 interfaceC24329, InterfaceC13885... interfaceC13885Arr) {
        b(interfaceC24329).createDirectory(interfaceC24329, interfaceC13885Arr);
        return interfaceC24329;
    }

    public static InterfaceC24329 createDirectories(InterfaceC24329 interfaceC24329, InterfaceC13885... interfaceC13885Arr) {
        try {
            try {
                createDirectory(interfaceC24329, interfaceC13885Arr);
            } catch (IOException unused) {
                try {
                    interfaceC24329 = interfaceC24329.toAbsolutePath();
                    e = null;
                } catch (SecurityException e) {
                    e = e;
                }
                InterfaceC24329 parent = interfaceC24329.getParent();
                while (parent != null) {
                    try {
                        parent.getFileSystem().provider().checkAccess(parent, new EnumC5683[0]);
                        break;
                    } catch (NoSuchFileException unused2) {
                        parent = parent.getParent();
                    }
                }
                if (parent == null) {
                    if (e == null) {
                        throw new FileSystemException(interfaceC24329.toString(), null, "Unable to determine if root directory exists");
                    }
                    throw e;
                }
                Iterator it = parent.relativize(interfaceC24329).iterator();
                while (it.hasNext()) {
                    parent = parent.resolve((InterfaceC24329) it.next());
                    try {
                        createDirectory(parent, interfaceC13885Arr);
                    } catch (FileAlreadyExistsException e2) {
                        if (!isDirectory(parent, EnumC20599.NOFOLLOW_LINKS)) {
                            throw e2;
                        }
                    }
                }
                return interfaceC24329;
            }
        } catch (FileAlreadyExistsException e3) {
            try {
                if (!isDirectory(interfaceC24329, EnumC20599.NOFOLLOW_LINKS)) {
                    throw e3;
                }
            } catch (FileAlreadyExistsException e4) {
                throw e4;
            }
        }
        return interfaceC24329;
    }

    public static InterfaceC24329 createTempFile(InterfaceC24329 interfaceC24329, String str, String str2, InterfaceC13885... interfaceC13885Arr) {
        InterfaceC24329 interfaceC243210 = (InterfaceC24329) C17359.requireNonNull(interfaceC24329);
        InterfaceC24329 interfaceC243211 = AbstractC17094.a;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = ".tmp";
        }
        if (interfaceC243210 == null) {
            interfaceC243210 = interfaceC243211;
        }
        if (AbstractC17094.b && interfaceC243210.getFileSystem() == C16869.getDefault()) {
            if (interfaceC13885Arr.length != 0) {
                int i = 0;
                while (true) {
                    if (i < interfaceC13885Arr.length) {
                        if (interfaceC13885Arr[i].name().equals("posix:permissions")) {
                            break;
                        }
                        i++;
                    } else {
                        int length = interfaceC13885Arr.length;
                        InterfaceC13885[] interfaceC13885Arr2 = new InterfaceC13885[length + 1];
                        System.arraycopy(interfaceC13885Arr, 0, interfaceC13885Arr2, 0, interfaceC13885Arr.length);
                        interfaceC13885Arr2[length] = AbstractC11873.a;
                        interfaceC13885Arr = interfaceC13885Arr2;
                        break;
                    }
                }
            } else {
                interfaceC13885Arr = new InterfaceC13885[]{AbstractC11873.a};
            }
        }
        SecurityManager securityManager = System.getSecurityManager();
        while (true) {
            try {
                try {
                    return createFile(AbstractC17094.a(str, str2, interfaceC243210), interfaceC13885Arr);
                } catch (SecurityException e) {
                    if (interfaceC243210 == interfaceC243211 && securityManager != null) {
                        throw new SecurityException("Unable to create temporary file or directory");
                    }
                    throw e;
                } catch (FileAlreadyExistsException unused) {
                }
            } catch (InvalidPathException e2) {
                if (securityManager != null) {
                    throw new IllegalArgumentException("Invalid prefix or suffix");
                }
                throw e2;
            }
        }
    }

    public static void delete(InterfaceC24329 interfaceC24329) {
        b(interfaceC24329).delete(interfaceC24329);
    }

    public static boolean deleteIfExists(InterfaceC24329 interfaceC24329) {
        return b(interfaceC24329).c(interfaceC24329);
    }

    public static InterfaceC24329 move(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, InterfaceC1954... interfaceC1954Arr) throws IOException {
        AbstractC22733 abstractC22733B = b(interfaceC24329);
        if (!b(interfaceC243210).equals(abstractC22733B)) {
            int length = interfaceC1954Arr.length;
            int i = length + 2;
            InterfaceC1954[] interfaceC1954Arr2 = new InterfaceC1954[i];
            for (int i2 = 0; i2 < length; i2++) {
                InterfaceC1954 interfaceC1954 = interfaceC1954Arr[i2];
                if (interfaceC1954 == EnumC18361.ATOMIC_MOVE) {
                    throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
                }
                interfaceC1954Arr2[i2] = interfaceC1954;
            }
            interfaceC1954Arr2[length] = EnumC20599.NOFOLLOW_LINKS;
            interfaceC1954Arr2[length + 1] = EnumC18361.COPY_ATTRIBUTES;
            boolean z = true;
            boolean z2 = false;
            boolean z3 = false;
            for (int i3 = 0; i3 < i; i3++) {
                InterfaceC1954 interfaceC1955 = interfaceC1954Arr2[i3];
                if (interfaceC1955 == EnumC18361.REPLACE_EXISTING) {
                    z2 = true;
                } else if (interfaceC1955 == EnumC20599.NOFOLLOW_LINKS) {
                    z = false;
                } else {
                    if (interfaceC1955 != EnumC18361.COPY_ATTRIBUTES) {
                        interfaceC1955.getClass();
                        throw new UnsupportedOperationException("'" + interfaceC1955 + "' is not a recognized copy option");
                    }
                    z3 = true;
                }
            }
            InterfaceC8665 attributes = readAttributes(interfaceC24329, InterfaceC8665.class, z ? new EnumC20599[0] : new EnumC20599[]{EnumC20599.NOFOLLOW_LINKS});
            if (attributes.isSymbolicLink()) {
                throw new IOException("Copying of symbolic links not supported");
            }
            if (z2) {
                deleteIfExists(interfaceC243210);
            } else if (exists(interfaceC243210, new EnumC20599[0])) {
                throw new FileAlreadyExistsException(interfaceC243210.toString());
            }
            if (attributes.isDirectory()) {
                createDirectory(interfaceC243210, new InterfaceC13885[0]);
            } else {
                InputStream inputStreamNewInputStream = newInputStream(interfaceC24329, new InterfaceC12394[0]);
                try {
                    a(inputStreamNewInputStream, interfaceC243210, new InterfaceC1954[0]);
                    if (inputStreamNewInputStream != null) {
                        inputStreamNewInputStream.close();
                    }
                } catch (Throwable th) {
                    if (inputStreamNewInputStream != null) {
                        try {
                            inputStreamNewInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (z3) {
                try {
                    ((InterfaceC15845) getFileAttributeView(interfaceC243210, InterfaceC15845.class, new EnumC20599[0])).a(attributes.lastModifiedTime(), attributes.lastAccessTime(), attributes.creationTime());
                } catch (Throwable th3) {
                    try {
                        delete(interfaceC243210);
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            delete(interfaceC24329);
            return interfaceC243210;
        }
        abstractC22733B.move(interfaceC24329, interfaceC243210, interfaceC1954Arr);
        return interfaceC243210;
    }

    public static InterfaceC24329 readSymbolicLink(InterfaceC24329 interfaceC24329) {
        return b(interfaceC24329).h(interfaceC24329);
    }

    public static AbstractC11648 getFileStore(InterfaceC24329 interfaceC24329) {
        return b(interfaceC24329).getFileStore(interfaceC24329);
    }

    public static boolean isSameFile(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210) {
        return b(interfaceC24329).isSameFile(interfaceC24329, interfaceC243210);
    }

    public static InterfaceC4659 getFileAttributeView(InterfaceC24329 interfaceC24329, Class cls, EnumC20599... enumC20599Arr) {
        return b(interfaceC24329).getFileAttributeView(interfaceC24329, cls, enumC20599Arr);
    }

    public static InterfaceC8665 readAttributes(InterfaceC24329 interfaceC24329, Class cls, EnumC20599... enumC20599Arr) {
        return b(interfaceC24329).readAttributes(interfaceC24329, cls, enumC20599Arr);
    }

    public static Map readAttributes(InterfaceC24329 interfaceC24329, String str, EnumC20599... enumC20599Arr) {
        return b(interfaceC24329).readAttributes(interfaceC24329, str, enumC20599Arr);
    }

    public static Set getPosixFilePermissions(InterfaceC24329 interfaceC24329, EnumC20599... enumC20599Arr) {
        return ((InterfaceC10624) readAttributes(interfaceC24329, InterfaceC10624.class, enumC20599Arr)).permissions();
    }

    public static InterfaceC24329 setPosixFilePermissions(InterfaceC24329 interfaceC24329, Set set) throws IOException {
        C2421 c2421 = (C2421) getFileAttributeView(interfaceC24329, C2421.class, new EnumC20599[0]);
        if (c2421 == null) {
            throw new UnsupportedOperationException();
        }
        c2421.a.setPermissions(AbstractC1758.v(set));
        return interfaceC24329;
    }

    public static boolean isSymbolicLink(InterfaceC24329 interfaceC24329) {
        try {
            return readAttributes(interfaceC24329, InterfaceC8665.class, EnumC20599.NOFOLLOW_LINKS).isSymbolicLink();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean isDirectory(InterfaceC24329 interfaceC24329, EnumC20599... enumC20599Arr) {
        if (enumC20599Arr.length == 0) {
            b(interfaceC24329);
        }
        try {
            return readAttributes(interfaceC24329, InterfaceC8665.class, enumC20599Arr).isDirectory();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean isRegularFile(InterfaceC24329 interfaceC24329, EnumC20599... enumC20599Arr) {
        if (enumC20599Arr.length == 0) {
            b(interfaceC24329);
        }
        try {
            return readAttributes(interfaceC24329, InterfaceC8665.class, enumC20599Arr).isRegularFile();
        } catch (IOException unused) {
            return false;
        }
    }

    public static C21813 getLastModifiedTime(InterfaceC24329 interfaceC24329, EnumC20599... enumC20599Arr) {
        return readAttributes(interfaceC24329, InterfaceC8665.class, enumC20599Arr).lastModifiedTime();
    }

    public static long size(InterfaceC24329 interfaceC24329) {
        return readAttributes(interfaceC24329, InterfaceC8665.class, new EnumC20599[0]).size();
    }

    public static boolean exists(InterfaceC24329 interfaceC24329, EnumC20599... enumC20599Arr) {
        if (enumC20599Arr.length == 0) {
            b(interfaceC24329);
        }
        try {
            int length = enumC20599Arr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                EnumC20599 enumC20599 = enumC20599Arr[i];
                if (enumC20599 != EnumC20599.NOFOLLOW_LINKS) {
                    enumC20599.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                b(interfaceC24329).checkAccess(interfaceC24329, new EnumC5683[0]);
            } else {
                readAttributes(interfaceC24329, InterfaceC8665.class, EnumC20599.NOFOLLOW_LINKS);
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static InterfaceC24329 walkFileTree(InterfaceC24329 interfaceC24329, Set set, int i, InterfaceC23583 interfaceC23583) {
        EnumC16123 enumC16123VisitFile;
        C19332 c19332 = new C19332(set, i);
        try {
            if (c19332.e) {
                throw new IllegalStateException("Closed");
            }
            C21570 c21570E = c19332.e(interfaceC24329, false);
            do {
                int[] iArr = AbstractC7399.a;
                EnumC0687 enumC0687 = c21570E.a;
                InterfaceC8665 interfaceC8665 = c21570E.c;
                InterfaceC24329 interfaceC243210 = c21570E.b;
                int i2 = iArr[enumC0687.ordinal()];
                if (i2 == 1) {
                    IOException iOException = c21570E.d;
                    enumC16123VisitFile = iOException == null ? interfaceC23583.visitFile(interfaceC243210, interfaceC8665) : interfaceC23583.visitFileFailed(interfaceC243210, iOException);
                } else if (i2 == 2) {
                    enumC16123VisitFile = interfaceC23583.preVisitDirectory(interfaceC243210, interfaceC8665);
                    if ((enumC16123VisitFile == EnumC16123.SKIP_SUBTREE || enumC16123VisitFile == EnumC16123.SKIP_SIBLINGS) && !c19332.d.isEmpty()) {
                        try {
                            ((C4416) c19332.d.pop()).c.close();
                        } catch (IOException unused) {
                        }
                    }
                } else if (i2 == 3) {
                    enumC16123VisitFile = interfaceC23583.postVisitDirectory(interfaceC243210, c21570E.d);
                    if (enumC16123VisitFile == EnumC16123.SKIP_SIBLINGS) {
                        enumC16123VisitFile = EnumC16123.CONTINUE;
                    }
                } else {
                    throw new AssertionError("Should not get here");
                }
                if (C17359.requireNonNull(enumC16123VisitFile) != EnumC16123.CONTINUE) {
                    if (enumC16123VisitFile == EnumC16123.TERMINATE) {
                        break;
                    }
                    if (enumC16123VisitFile == EnumC16123.SKIP_SIBLINGS && !c19332.d.isEmpty()) {
                        ((C4416) c19332.d.peek()).e = true;
                    }
                    c21570E = c19332.d();
                } else {
                    c21570E = c19332.d();
                }
            } while (c21570E != null);
            c19332.close();
            return interfaceC24329;
        } catch (Throwable th) {
            try {
                c19332.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static InterfaceC24329 walkFileTree(InterfaceC24329 interfaceC24329, InterfaceC23583 interfaceC23583) {
        return walkFileTree(interfaceC24329, EnumSet.noneOf(EnumC17615.class), Integer.MAX_VALUE, interfaceC23583);
    }

    public static BufferedReader newBufferedReader(InterfaceC24329 interfaceC24329, Charset charset) {
        return new BufferedReader(new InputStreamReader(newInputStream(interfaceC24329, new InterfaceC12394[0]), charset.newDecoder()));
    }

    public static BufferedWriter newBufferedWriter(InterfaceC24329 interfaceC24329, InterfaceC12394... interfaceC12394Arr) {
        C6325 c6325 = C6325.a;
        c6325.getClass();
        return new BufferedWriter(new OutputStreamWriter(newOutputStream(interfaceC24329, interfaceC12394Arr), new C12290(c6325)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(InputStream inputStream, InterfaceC24329 interfaceC24329, InterfaceC1954... interfaceC1954Arr) throws IOException {
        C17359.requireNonNull(inputStream);
        int length = interfaceC1954Arr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            InterfaceC1954 interfaceC1954 = interfaceC1954Arr[i];
            if (interfaceC1954 != EnumC18361.REPLACE_EXISTING) {
                if (interfaceC1954 == null) {
                    throw new NullPointerException("options contains 'null'");
                }
                throw new UnsupportedOperationException(interfaceC1954 + " not supported");
            }
            i++;
            z = true;
        }
        if (z) {
            try {
                deleteIfExists(interfaceC24329);
            } catch (SecurityException e) {
                e = e;
            }
        }
        e = null;
        try {
            OutputStream outputStreamNewOutputStream = newOutputStream(interfaceC24329, EnumC0462.CREATE_NEW, EnumC0462.WRITE);
            try {
                if (inputStream instanceof InterfaceC8469) {
                    ((InterfaceC8469) inputStream).transferTo(outputStreamNewOutputStream);
                } else {
                    C9214.transferTo(inputStream, outputStreamNewOutputStream);
                }
                if (outputStreamNewOutputStream != null) {
                    outputStreamNewOutputStream.close();
                }
            } catch (Throwable th) {
                if (outputStreamNewOutputStream != null) {
                    try {
                        outputStreamNewOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileAlreadyExistsException e2) {
            if (e == null) {
                throw e2;
            }
            throw e;
        }
    }

    public static List readAllLines(InterfaceC24329 interfaceC24329, Charset charset) throws IOException {
        BufferedReader bufferedReaderNewBufferedReader = newBufferedReader(interfaceC24329, charset);
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                String line = bufferedReaderNewBufferedReader.readLine();
                if (line != null) {
                    arrayList.add(line);
                } else {
                    bufferedReaderNewBufferedReader.close();
                    return arrayList;
                }
            }
        } catch (Throwable th) {
            if (bufferedReaderNewBufferedReader != null) {
                try {
                    bufferedReaderNewBufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static List readAllLines(InterfaceC24329 interfaceC24329) {
        return readAllLines(interfaceC24329, C6325.a);
    }

    public static InterfaceC20670 list(InterfaceC24329 interfaceC24329) {
        DirectoryStream directoryStreamNewDirectoryStream = newDirectoryStream(interfaceC24329);
        try {
            return (InterfaceC20670) C12465.stream(C13629.spliteratorUnknownSize(new C2924(directoryStreamNewDirectoryStream.iterator()), 1), false).onClose(new RunnableC1433(directoryStreamNewDirectoryStream));
        } catch (Error | RuntimeException e) {
            try {
                directoryStreamNewDirectoryStream.close();
            } catch (IOException e2) {
                try {
                    e.addSuppressed(e2);
                } catch (Throwable unused) {
                }
            }
            throw e;
        }
    }

    public static InterfaceC20670 walk(InterfaceC24329 interfaceC24329, EnumC17615... enumC17615Arr) {
        C20824 c20824 = new C20824(interfaceC24329, enumC17615Arr);
        try {
            InterfaceC20670 interfaceC20670Stream = C12465.stream(C13629.spliteratorUnknownSize(c20824, 1), false);
            C17359.requireNonNull(c20824);
            return ((InterfaceC20670) interfaceC20670Stream.onClose(new RunnableC1433(c20824))).map(new C4833());
        } catch (Error | RuntimeException e) {
            c20824.close();
            throw e;
        }
    }
}
