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

/* JADX INFO: renamed from: l.ۚ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5212 {
    public static final Set a = AbstractC1726.D(new Object[]{EnumC17912.CREATE_NEW, EnumC17912.WRITE});

    public static AbstractC17455 b(InterfaceC3800 interfaceC3800) {
        return interfaceC3800.getFileSystem().provider();
    }

    public static InputStream newInputStream(InterfaceC3800 interfaceC3800, InterfaceC0978... interfaceC0978Arr) {
        return b(interfaceC3800).newInputStream(interfaceC3800, interfaceC0978Arr);
    }

    public static OutputStream newOutputStream(InterfaceC3800 interfaceC3800, InterfaceC0978... interfaceC0978Arr) {
        return b(interfaceC3800).g(interfaceC3800, interfaceC0978Arr);
    }

    public static DirectoryStream newDirectoryStream(InterfaceC3800 interfaceC3800) {
        return b(interfaceC3800).newDirectoryStream(interfaceC3800, C0521.a);
    }

    public static DirectoryStream newDirectoryStream(InterfaceC3800 interfaceC3800, String str) {
        if (str.equals("*")) {
            return newDirectoryStream(interfaceC3800);
        }
        AbstractC3178 fileSystem = interfaceC3800.getFileSystem();
        return fileSystem.provider().newDirectoryStream(interfaceC3800, new C5295(1, fileSystem.getPathMatcher("glob:".concat(str))));
    }

    public static DirectoryStream newDirectoryStream(InterfaceC3800 interfaceC3800, DirectoryStream.Filter filter) {
        return b(interfaceC3800).newDirectoryStream(interfaceC3800, filter);
    }

    public static InterfaceC3800 createFile(InterfaceC3800 interfaceC3800, InterfaceC20030... interfaceC20030Arr) {
        b(interfaceC3800).newByteChannel(interfaceC3800, a, interfaceC20030Arr).close();
        return interfaceC3800;
    }

    public static InterfaceC3800 createDirectory(InterfaceC3800 interfaceC3800, InterfaceC20030... interfaceC20030Arr) {
        b(interfaceC3800).createDirectory(interfaceC3800, interfaceC20030Arr);
        return interfaceC3800;
    }

    public static InterfaceC3800 createDirectories(InterfaceC3800 interfaceC3800, InterfaceC20030... interfaceC20030Arr) {
        try {
            try {
                createDirectory(interfaceC3800, interfaceC20030Arr);
            } catch (IOException unused) {
                try {
                    interfaceC3800 = interfaceC3800.toAbsolutePath();
                    e = null;
                } catch (SecurityException e) {
                    e = e;
                }
                InterfaceC3800 parent = interfaceC3800.getParent();
                while (parent != null) {
                    try {
                        parent.getFileSystem().provider().checkAccess(parent, new EnumC14469[0]);
                        break;
                    } catch (NoSuchFileException unused2) {
                        parent = parent.getParent();
                    }
                }
                if (parent == null) {
                    if (e == null) {
                        throw new FileSystemException(interfaceC3800.toString(), null, "Unable to determine if root directory exists");
                    }
                    throw e;
                }
                Iterator it = parent.relativize(interfaceC3800).iterator();
                while (it.hasNext()) {
                    parent = parent.resolve((InterfaceC3800) it.next());
                    try {
                        createDirectory(parent, interfaceC20030Arr);
                    } catch (FileAlreadyExistsException e2) {
                        if (!isDirectory(parent, EnumC22146.NOFOLLOW_LINKS)) {
                            throw e2;
                        }
                    }
                }
                return interfaceC3800;
            }
        } catch (FileAlreadyExistsException e3) {
            try {
                if (!isDirectory(interfaceC3800, EnumC22146.NOFOLLOW_LINKS)) {
                    throw e3;
                }
            } catch (FileAlreadyExistsException e4) {
                throw e4;
            }
        }
        return interfaceC3800;
    }

    public static InterfaceC3800 createTempFile(InterfaceC3800 interfaceC3800, String str, String str2, InterfaceC20030... interfaceC20030Arr) {
        InterfaceC3800 interfaceC3801 = (InterfaceC3800) C13638.requireNonNull(interfaceC3800);
        InterfaceC3800 interfaceC3802 = AbstractC4754.a;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = ".tmp";
        }
        if (interfaceC3801 == null) {
            interfaceC3801 = interfaceC3802;
        }
        if (AbstractC4754.b && interfaceC3801.getFileSystem() == C4506.getDefault()) {
            if (interfaceC20030Arr.length != 0) {
                int i = 0;
                while (true) {
                    if (i < interfaceC20030Arr.length) {
                        if (interfaceC20030Arr[i].name().equals("posix:permissions")) {
                            break;
                        }
                        i++;
                    } else {
                        int length = interfaceC20030Arr.length;
                        InterfaceC20030[] interfaceC20030Arr2 = new InterfaceC20030[length + 1];
                        System.arraycopy(interfaceC20030Arr, 0, interfaceC20030Arr2, 0, interfaceC20030Arr.length);
                        interfaceC20030Arr2[length] = AbstractC9840.a;
                        interfaceC20030Arr = interfaceC20030Arr2;
                        break;
                    }
                }
            } else {
                interfaceC20030Arr = new InterfaceC20030[]{AbstractC9840.a};
            }
        }
        SecurityManager securityManager = System.getSecurityManager();
        while (true) {
            try {
                try {
                    return createFile(AbstractC4754.a(str, str2, interfaceC3801), interfaceC20030Arr);
                } catch (SecurityException e) {
                    if (interfaceC3801 == interfaceC3802 && securityManager != null) {
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

    public static void delete(InterfaceC3800 interfaceC3800) {
        b(interfaceC3800).delete(interfaceC3800);
    }

    public static boolean deleteIfExists(InterfaceC3800 interfaceC3800) {
        return b(interfaceC3800).c(interfaceC3800);
    }

    public static InterfaceC3800 move(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, InterfaceC1767... interfaceC1767Arr) throws IOException {
        AbstractC17455 abstractC17455B = b(interfaceC3800);
        if (!b(interfaceC3801).equals(abstractC17455B)) {
            int length = interfaceC1767Arr.length;
            int i = length + 2;
            InterfaceC1767[] interfaceC1767Arr2 = new InterfaceC1767[i];
            for (int i2 = 0; i2 < length; i2++) {
                InterfaceC1767 interfaceC1767 = interfaceC1767Arr[i2];
                if (interfaceC1767 == EnumC21440.ATOMIC_MOVE) {
                    throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
                }
                interfaceC1767Arr2[i2] = interfaceC1767;
            }
            interfaceC1767Arr2[length] = EnumC22146.NOFOLLOW_LINKS;
            interfaceC1767Arr2[length + 1] = EnumC21440.COPY_ATTRIBUTES;
            boolean z = true;
            boolean z2 = false;
            boolean z3 = false;
            for (int i3 = 0; i3 < i; i3++) {
                InterfaceC1767 interfaceC1768 = interfaceC1767Arr2[i3];
                if (interfaceC1768 == EnumC21440.REPLACE_EXISTING) {
                    z2 = true;
                } else if (interfaceC1768 == EnumC22146.NOFOLLOW_LINKS) {
                    z = false;
                } else {
                    if (interfaceC1768 != EnumC21440.COPY_ATTRIBUTES) {
                        interfaceC1768.getClass();
                        throw new UnsupportedOperationException("'" + interfaceC1768 + "' is not a recognized copy option");
                    }
                    z3 = true;
                }
            }
            InterfaceC20735 attributes = readAttributes(interfaceC3800, InterfaceC20735.class, z ? new EnumC22146[0] : new EnumC22146[]{EnumC22146.NOFOLLOW_LINKS});
            if (attributes.isSymbolicLink()) {
                throw new IOException("Copying of symbolic links not supported");
            }
            if (z2) {
                deleteIfExists(interfaceC3801);
            } else if (exists(interfaceC3801, new EnumC22146[0])) {
                throw new FileAlreadyExistsException(interfaceC3801.toString());
            }
            if (attributes.isDirectory()) {
                createDirectory(interfaceC3801, new InterfaceC20030[0]);
            } else {
                InputStream inputStreamNewInputStream = newInputStream(interfaceC3800, new InterfaceC0978[0]);
                try {
                    a(inputStreamNewInputStream, interfaceC3801, new InterfaceC1767[0]);
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
                    ((InterfaceC11957) getFileAttributeView(interfaceC3801, InterfaceC11957.class, new EnumC22146[0])).a(attributes.lastModifiedTime(), attributes.lastAccessTime(), attributes.creationTime());
                } catch (Throwable th3) {
                    try {
                        delete(interfaceC3801);
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            delete(interfaceC3800);
            return interfaceC3801;
        }
        abstractC17455B.move(interfaceC3800, interfaceC3801, interfaceC1767Arr);
        return interfaceC3801;
    }

    public static InterfaceC3800 readSymbolicLink(InterfaceC3800 interfaceC3800) {
        return b(interfaceC3800).h(interfaceC3800);
    }

    public static AbstractC9530 getFileStore(InterfaceC3800 interfaceC3800) {
        return b(interfaceC3800).getFileStore(interfaceC3800);
    }

    public static boolean isSameFile(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801) {
        return b(interfaceC3800).isSameFile(interfaceC3800, interfaceC3801);
    }

    public static InterfaceC0273 getFileAttributeView(InterfaceC3800 interfaceC3800, Class cls, EnumC22146... enumC22146Arr) {
        return b(interfaceC3800).getFileAttributeView(interfaceC3800, cls, enumC22146Arr);
    }

    public static InterfaceC20735 readAttributes(InterfaceC3800 interfaceC3800, Class cls, EnumC22146... enumC22146Arr) {
        return b(interfaceC3800).readAttributes(interfaceC3800, cls, enumC22146Arr);
    }

    public static Map readAttributes(InterfaceC3800 interfaceC3800, String str, EnumC22146... enumC22146Arr) {
        return b(interfaceC3800).readAttributes(interfaceC3800, str, enumC22146Arr);
    }

    public static Set getPosixFilePermissions(InterfaceC3800 interfaceC3800, EnumC22146... enumC22146Arr) {
        return ((InterfaceC12269) readAttributes(interfaceC3800, InterfaceC12269.class, enumC22146Arr)).permissions();
    }

    public static InterfaceC3800 setPosixFilePermissions(InterfaceC3800 interfaceC3800, Set set) {
        C7723 c7723 = (C7723) getFileAttributeView(interfaceC3800, C7723.class, new EnumC22146[0]);
        if (c7723 == null) {
            throw new UnsupportedOperationException();
        }
        c7723.a.setPermissions(AbstractC1726.v(set));
        return interfaceC3800;
    }

    public static boolean isSymbolicLink(InterfaceC3800 interfaceC3800) {
        try {
            return readAttributes(interfaceC3800, InterfaceC20735.class, EnumC22146.NOFOLLOW_LINKS).isSymbolicLink();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean isDirectory(InterfaceC3800 interfaceC3800, EnumC22146... enumC22146Arr) {
        if (enumC22146Arr.length == 0) {
            b(interfaceC3800);
        }
        try {
            return readAttributes(interfaceC3800, InterfaceC20735.class, enumC22146Arr).isDirectory();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean isRegularFile(InterfaceC3800 interfaceC3800, EnumC22146... enumC22146Arr) {
        if (enumC22146Arr.length == 0) {
            b(interfaceC3800);
        }
        try {
            return readAttributes(interfaceC3800, InterfaceC20735.class, enumC22146Arr).isRegularFile();
        } catch (IOException unused) {
            return false;
        }
    }

    public static C16502 getLastModifiedTime(InterfaceC3800 interfaceC3800, EnumC22146... enumC22146Arr) {
        return readAttributes(interfaceC3800, InterfaceC20735.class, enumC22146Arr).lastModifiedTime();
    }

    public static long size(InterfaceC3800 interfaceC3800) {
        return readAttributes(interfaceC3800, InterfaceC20735.class, new EnumC22146[0]).size();
    }

    public static boolean exists(InterfaceC3800 interfaceC3800, EnumC22146... enumC22146Arr) {
        if (enumC22146Arr.length == 0) {
            b(interfaceC3800);
        }
        try {
            int length = enumC22146Arr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                EnumC22146 enumC22146 = enumC22146Arr[i];
                if (enumC22146 != EnumC22146.NOFOLLOW_LINKS) {
                    enumC22146.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                b(interfaceC3800).checkAccess(interfaceC3800, new EnumC14469[0]);
            } else {
                readAttributes(interfaceC3800, InterfaceC20735.class, EnumC22146.NOFOLLOW_LINKS);
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static InterfaceC3800 walkFileTree(InterfaceC3800 interfaceC3800, Set set, int i, InterfaceC2389 interfaceC2389) {
        EnumC11563 enumC11563VisitFile;
        C8283 c8283 = new C8283(set, i);
        try {
            if (c8283.e) {
                throw new IllegalStateException("Closed");
            }
            C15339 c15339E = c8283.e(interfaceC3800, false);
            do {
                int[] iArr = AbstractC16045.a;
                EnumC18160 enumC18160 = c15339E.a;
                InterfaceC20735 interfaceC20735 = c15339E.c;
                InterfaceC3800 interfaceC3801 = c15339E.b;
                int i2 = iArr[enumC18160.ordinal()];
                if (i2 == 1) {
                    IOException iOException = c15339E.d;
                    enumC11563VisitFile = iOException == null ? interfaceC2389.visitFile(interfaceC3801, interfaceC20735) : interfaceC2389.visitFileFailed(interfaceC3801, iOException);
                } else if (i2 == 2) {
                    enumC11563VisitFile = interfaceC2389.preVisitDirectory(interfaceC3801, interfaceC20735);
                    if ((enumC11563VisitFile == EnumC11563.SKIP_SUBTREE || enumC11563VisitFile == EnumC11563.SKIP_SIBLINGS) && !c8283.d.isEmpty()) {
                        try {
                            ((C6871) c8283.d.pop()).c.close();
                        } catch (IOException unused) {
                        }
                    }
                } else if (i2 == 3) {
                    enumC11563VisitFile = interfaceC2389.postVisitDirectory(interfaceC3801, c15339E.d);
                    if (enumC11563VisitFile == EnumC11563.SKIP_SIBLINGS) {
                        enumC11563VisitFile = EnumC11563.CONTINUE;
                    }
                } else {
                    throw new AssertionError("Should not get here");
                }
                if (C13638.requireNonNull(enumC11563VisitFile) != EnumC11563.CONTINUE) {
                    if (enumC11563VisitFile == EnumC11563.TERMINATE) {
                        break;
                    }
                    if (enumC11563VisitFile == EnumC11563.SKIP_SIBLINGS && !c8283.d.isEmpty()) {
                        ((C6871) c8283.d.peek()).e = true;
                    }
                    c15339E = c8283.d();
                } else {
                    c15339E = c8283.d();
                }
            } while (c15339E != null);
            c8283.close();
            return interfaceC3800;
        } catch (Throwable th) {
            try {
                c8283.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static InterfaceC3800 walkFileTree(InterfaceC3800 interfaceC3800, InterfaceC2389 interfaceC2389) {
        return walkFileTree(interfaceC3800, EnumSet.noneOf(EnumC13680.class), Integer.MAX_VALUE, interfaceC2389);
    }

    public static BufferedReader newBufferedReader(InterfaceC3800 interfaceC3800, Charset charset) {
        return new BufferedReader(new InputStreamReader(newInputStream(interfaceC3800, new InterfaceC0978[0]), charset.newDecoder()));
    }

    public static BufferedWriter newBufferedWriter(InterfaceC3800 interfaceC3800, InterfaceC0978... interfaceC0978Arr) {
        C13347 c13347 = C13347.a;
        c13347.getClass();
        return new BufferedWriter(new OutputStreamWriter(newOutputStream(interfaceC3800, interfaceC0978Arr), new C1351(c13347)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(InputStream inputStream, InterfaceC3800 interfaceC3800, InterfaceC1767... interfaceC1767Arr) throws IOException {
        C13638.requireNonNull(inputStream);
        int length = interfaceC1767Arr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            InterfaceC1767 interfaceC1767 = interfaceC1767Arr[i];
            if (interfaceC1767 != EnumC21440.REPLACE_EXISTING) {
                if (interfaceC1767 == null) {
                    throw new NullPointerException("options contains 'null'");
                }
                throw new UnsupportedOperationException(interfaceC1767 + " not supported");
            }
            i++;
            z = true;
        }
        if (z) {
            try {
                deleteIfExists(interfaceC3800);
            } catch (SecurityException e) {
                e = e;
            }
        }
        e = null;
        try {
            OutputStream outputStreamNewOutputStream = newOutputStream(interfaceC3800, EnumC17912.CREATE_NEW, EnumC17912.WRITE);
            try {
                if (inputStream instanceof InterfaceC20818) {
                    ((InterfaceC20818) inputStream).transferTo(outputStreamNewOutputStream);
                } else {
                    C10235.transferTo(inputStream, outputStreamNewOutputStream);
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

    public static List readAllLines(InterfaceC3800 interfaceC3800, Charset charset) throws IOException {
        BufferedReader bufferedReaderNewBufferedReader = newBufferedReader(interfaceC3800, charset);
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

    public static List readAllLines(InterfaceC3800 interfaceC3800) {
        return readAllLines(interfaceC3800, C13347.a);
    }

    public static InterfaceC5046 list(InterfaceC3800 interfaceC3800) {
        DirectoryStream directoryStreamNewDirectoryStream = newDirectoryStream(interfaceC3800);
        try {
            return (InterfaceC5046) C21980.stream(C19988.b(new C7577(directoryStreamNewDirectoryStream.iterator()), 1), false).onClose(new RunnableC8989(directoryStreamNewDirectoryStream));
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

    public static InterfaceC5046 walk(InterfaceC3800 interfaceC3800, EnumC13680... enumC13680Arr) {
        C22394 c22394 = new C22394(interfaceC3800, enumC13680Arr);
        try {
            InterfaceC5046 interfaceC5046Stream = C21980.stream(C19988.b(c22394, 1), false);
            C13638.requireNonNull(c22394);
            return ((InterfaceC5046) interfaceC5046Stream.onClose(new RunnableC8989(c22394))).map(new C0521());
        } catch (Error | RuntimeException e) {
            c22394.close();
            throw e;
        }
    }
}
