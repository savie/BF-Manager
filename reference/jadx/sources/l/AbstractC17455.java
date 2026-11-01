package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.NoSuchFileException;
import java.security.AccessController;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ܿܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17455 {
    public static volatile List b;
    public static boolean c;
    public static final Object a = new Object();
    public static final Set d = AbstractC1726.D(new Object[]{EnumC17912.CREATE, EnumC17912.TRUNCATE_EXISTING, EnumC17912.WRITE});

    public abstract void checkAccess(InterfaceC3800 interfaceC3800, EnumC14469... enumC14469Arr);

    public abstract void copy(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, InterfaceC1767... interfaceC1767Arr);

    public abstract void createDirectory(InterfaceC3800 interfaceC3800, InterfaceC20030... interfaceC20030Arr);

    public abstract void delete(InterfaceC3800 interfaceC3800);

    public abstract InterfaceC0273 getFileAttributeView(InterfaceC3800 interfaceC3800, Class cls, EnumC22146... enumC22146Arr);

    public abstract AbstractC9530 getFileStore(InterfaceC3800 interfaceC3800);

    public abstract AbstractC3178 getFileSystem(URI uri);

    public abstract InterfaceC3800 getPath(URI uri);

    public abstract String getScheme();

    public abstract boolean isHidden(InterfaceC3800 interfaceC3800);

    public abstract boolean isSameFile(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801);

    public abstract void move(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, InterfaceC1767... interfaceC1767Arr);

    public abstract SeekableByteChannel newByteChannel(InterfaceC3800 interfaceC3800, Set set, InterfaceC20030... interfaceC20030Arr);

    public abstract DirectoryStream newDirectoryStream(InterfaceC3800 interfaceC3800, DirectoryStream.Filter filter);

    public abstract AbstractC3178 newFileSystem(URI uri, Map map);

    public abstract Map readAttributes(InterfaceC3800 interfaceC3800, String str, EnumC22146... enumC22146Arr);

    public abstract InterfaceC20735 readAttributes(InterfaceC3800 interfaceC3800, Class cls, EnumC22146... enumC22146Arr);

    public abstract void setAttribute(InterfaceC3800 interfaceC3800, String str, Object obj, EnumC22146... enumC22146Arr);

    public AbstractC17455() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    public static List d() {
        if (b == null) {
            AbstractC17455 abstractC17455Provider = C4506.getDefault().provider();
            synchronized (a) {
                if (b == null) {
                    if (c) {
                        throw new Error("Circular loading of installed providers detected");
                    }
                    c = true;
                    List list = (List) AccessController.doPrivileged(new C6166(0));
                    list.add(0, abstractC17455Provider);
                    b = Collections.unmodifiableList(list);
                }
            }
        }
        return b;
    }

    public AbstractC3178 newFileSystem(InterfaceC3800 interfaceC3800, Map map) {
        throw new UnsupportedOperationException();
    }

    public InputStream newInputStream(InterfaceC3800 interfaceC3800, InterfaceC0978... interfaceC0978Arr) {
        Set set;
        if (interfaceC0978Arr.length > 0) {
            for (InterfaceC0978 interfaceC0978 : interfaceC0978Arr) {
                if (interfaceC0978 == EnumC17912.APPEND || interfaceC0978 == EnumC17912.WRITE) {
                    throw new UnsupportedOperationException("'" + interfaceC0978 + "' not allowed");
                }
            }
        }
        Set set2 = C5212.a;
        if (interfaceC0978Arr.length == 0) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, interfaceC0978Arr);
            set = hashSet;
        }
        return Channels.newInputStream(C5212.b(interfaceC3800).newByteChannel(interfaceC3800, set, new InterfaceC20030[0]));
    }

    public OutputStream g(InterfaceC3800 interfaceC3800, InterfaceC0978... interfaceC0978Arr) {
        Set set;
        if (interfaceC0978Arr.length == 0) {
            set = d;
        } else {
            HashSet hashSet = new HashSet();
            for (InterfaceC0978 interfaceC0978 : interfaceC0978Arr) {
                if (interfaceC0978 == EnumC17912.READ) {
                    throw new IllegalArgumentException("READ not allowed");
                }
                hashSet.add(interfaceC0978);
            }
            hashSet.add(EnumC17912.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(newByteChannel(interfaceC3800, set, new InterfaceC20030[0]));
    }

    public FileChannel f(InterfaceC3800 interfaceC3800, Set set, InterfaceC20030... interfaceC20030Arr) {
        throw new UnsupportedOperationException();
    }

    public C10941 e(InterfaceC3800 interfaceC3800, Set set, ExecutorService executorService, InterfaceC20030... interfaceC20030Arr) {
        throw new UnsupportedOperationException();
    }

    public void b(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, InterfaceC20030... interfaceC20030Arr) {
        throw new UnsupportedOperationException();
    }

    public void a(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801) {
        throw new UnsupportedOperationException();
    }

    public boolean c(InterfaceC3800 interfaceC3800) {
        try {
            delete(interfaceC3800);
            return true;
        } catch (NoSuchFileException unused) {
            return false;
        }
    }

    public InterfaceC3800 h(InterfaceC3800 interfaceC3800) {
        throw new UnsupportedOperationException();
    }
}
