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

/* JADX INFO: renamed from: l.᩸ۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22733 {
    public static volatile List b;
    public static boolean c;
    public static final Object a = new Object();
    public static final Set d = AbstractC1758.D(new Object[]{EnumC0462.CREATE, EnumC0462.TRUNCATE_EXISTING, EnumC0462.WRITE});

    public abstract void checkAccess(InterfaceC24329 interfaceC24329, EnumC5683... enumC5683Arr);

    public abstract void copy(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, InterfaceC1954... interfaceC1954Arr);

    public abstract void createDirectory(InterfaceC24329 interfaceC24329, InterfaceC13885... interfaceC13885Arr);

    public abstract void delete(InterfaceC24329 interfaceC24329);

    public abstract InterfaceC4659 getFileAttributeView(InterfaceC24329 interfaceC24329, Class cls, EnumC20599... enumC20599Arr);

    public abstract AbstractC11648 getFileStore(InterfaceC24329 interfaceC24329);

    public abstract AbstractC25075 getFileSystem(URI uri);

    public abstract InterfaceC24329 getPath(URI uri);

    public abstract String getScheme();

    public abstract boolean isHidden(InterfaceC24329 interfaceC24329);

    public abstract boolean isSameFile(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210);

    public abstract void move(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, InterfaceC1954... interfaceC1954Arr);

    public abstract SeekableByteChannel newByteChannel(InterfaceC24329 interfaceC24329, Set set, InterfaceC13885... interfaceC13885Arr);

    public abstract DirectoryStream newDirectoryStream(InterfaceC24329 interfaceC24329, DirectoryStream.Filter filter);

    public abstract AbstractC25075 newFileSystem(URI uri, Map map);

    public abstract Map readAttributes(InterfaceC24329 interfaceC24329, String str, EnumC20599... enumC20599Arr);

    public abstract InterfaceC8665 readAttributes(InterfaceC24329 interfaceC24329, Class cls, EnumC20599... enumC20599Arr);

    public abstract void setAttribute(InterfaceC24329 interfaceC24329, String str, Object obj, EnumC20599... enumC20599Arr);

    public AbstractC22733() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    public static List d() {
        if (b == null) {
            AbstractC22733 abstractC22733Provider = C16869.getDefault().provider();
            synchronized (a) {
                if (b == null) {
                    if (c) {
                        throw new Error("Circular loading of installed providers detected");
                    }
                    c = true;
                    List list = (List) AccessController.doPrivileged(new C19749(0));
                    list.add(0, abstractC22733Provider);
                    b = Collections.unmodifiableList(list);
                }
            }
        }
        return b;
    }

    public AbstractC25075 newFileSystem(InterfaceC24329 interfaceC24329, Map map) {
        throw new UnsupportedOperationException();
    }

    public InputStream newInputStream(InterfaceC24329 interfaceC24329, InterfaceC12394... interfaceC12394Arr) {
        Set set;
        if (interfaceC12394Arr.length > 0) {
            for (InterfaceC12394 interfaceC12394 : interfaceC12394Arr) {
                if (interfaceC12394 == EnumC0462.APPEND || interfaceC12394 == EnumC0462.WRITE) {
                    throw new UnsupportedOperationException("'" + interfaceC12394 + "' not allowed");
                }
            }
        }
        Set set2 = C3445.a;
        if (interfaceC12394Arr.length == 0) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, interfaceC12394Arr);
            set = hashSet;
        }
        return Channels.newInputStream(C3445.b(interfaceC24329).newByteChannel(interfaceC24329, set, new InterfaceC13885[0]));
    }

    public OutputStream g(InterfaceC24329 interfaceC24329, InterfaceC12394... interfaceC12394Arr) {
        Set set;
        if (interfaceC12394Arr.length == 0) {
            set = d;
        } else {
            HashSet hashSet = new HashSet();
            for (InterfaceC12394 interfaceC12394 : interfaceC12394Arr) {
                if (interfaceC12394 == EnumC0462.READ) {
                    throw new IllegalArgumentException("READ not allowed");
                }
                hashSet.add(interfaceC12394);
            }
            hashSet.add(EnumC0462.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(newByteChannel(interfaceC24329, set, new InterfaceC13885[0]));
    }

    public FileChannel f(InterfaceC24329 interfaceC24329, Set set, InterfaceC13885... interfaceC13885Arr) {
        throw new UnsupportedOperationException();
    }

    public C15377 e(InterfaceC24329 interfaceC24329, Set set, ExecutorService executorService, InterfaceC13885... interfaceC13885Arr) {
        throw new UnsupportedOperationException();
    }

    public void b(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, InterfaceC13885... interfaceC13885Arr) {
        throw new UnsupportedOperationException();
    }

    public void a(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210) {
        throw new UnsupportedOperationException();
    }

    public boolean c(InterfaceC24329 interfaceC24329) {
        try {
            delete(interfaceC24329);
            return true;
        } catch (NoSuchFileException unused) {
            return false;
        }
    }

    public InterfaceC24329 h(InterfaceC24329 interfaceC24329) {
        throw new UnsupportedOperationException();
    }
}
