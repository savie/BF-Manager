package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.᩻ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23806 extends FileSystemProvider {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ AbstractC17455 a;

    public /* synthetic */ C23806(AbstractC17455 abstractC17455) {
        this.a = abstractC17455;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        EnumC14469 enumC14469;
        AbstractC17455 abstractC17455 = this.a;
        InterfaceC3800 interfaceC3800L = C9695.l(path);
        EnumC14469[] enumC14469Arr = null;
        if (accessModeArr != null) {
            int length = accessModeArr.length;
            EnumC14469[] enumC14469Arr2 = new EnumC14469[length];
            for (int i = 0; i < length; i++) {
                AccessMode accessMode = accessModeArr[i];
                if (accessMode == null) {
                    enumC14469 = null;
                } else if (accessMode == AccessMode.READ) {
                    enumC14469 = EnumC14469.READ;
                } else {
                    enumC14469 = accessMode == AccessMode.WRITE ? EnumC14469.WRITE : EnumC14469.EXECUTE;
                }
                enumC14469Arr2[i] = enumC14469;
            }
            enumC14469Arr = enumC14469Arr2;
        }
        abstractC17455.checkAccess(interfaceC3800L, enumC14469Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        InterfaceC1767[] interfaceC1767Arr;
        AbstractC17455 abstractC17455 = this.a;
        InterfaceC3800 interfaceC3800L = C9695.l(path);
        InterfaceC3800 interfaceC3800L2 = C9695.l(path2);
        if (copyOptionArr == null) {
            interfaceC1767Arr = null;
        } else {
            int length = copyOptionArr.length;
            InterfaceC1767[] interfaceC1767Arr2 = new InterfaceC1767[length];
            for (int i = 0; i < length; i++) {
                interfaceC1767Arr2[i] = C7329.a(copyOptionArr[i]);
            }
            interfaceC1767Arr = interfaceC1767Arr2;
        }
        abstractC17455.copy(interfaceC3800L, interfaceC3800L2, interfaceC1767Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.createDirectory(C9695.l(path), AbstractC1726.I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.a(C9695.l(path), C9695.l(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.b(C9695.l(path), C9695.l(path2), AbstractC1726.I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.delete(C9695.l(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.c(C9695.l(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC17455 abstractC17455 = this.a;
        if (obj instanceof C23806) {
            obj = ((C23806) obj).a;
        }
        return abstractC17455.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        InterfaceC0273 fileAttributeView = this.a.getFileAttributeView(C9695.l(path), AbstractC1726.q(cls), AbstractC1726.F(linkOptionArr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof C15485) {
            return ((C15485) fileAttributeView).a;
        }
        if (fileAttributeView instanceof InterfaceC11957) {
            InterfaceC11957 interfaceC11957 = (InterfaceC11957) fileAttributeView;
            if (interfaceC11957 instanceof C3095) {
                return ((C3095) interfaceC11957).a;
            }
            if (!(interfaceC11957 instanceof InterfaceC15797)) {
                return interfaceC11957 instanceof C7723 ? ((C7723) interfaceC11957).a : new C14074(interfaceC11957);
            }
            InterfaceC15797 interfaceC15797 = (InterfaceC15797) interfaceC11957;
            return interfaceC15797 instanceof C22540 ? ((C22540) interfaceC15797).a : new C1372(interfaceC15797);
        }
        if (!(fileAttributeView instanceof InterfaceC8429)) {
            return fileAttributeView instanceof C20423 ? ((C20423) fileAttributeView).a : new C21834(fileAttributeView);
        }
        InterfaceC8429 interfaceC8429 = (InterfaceC8429) fileAttributeView;
        if (interfaceC8429 instanceof C18306) {
            return ((C18306) interfaceC8429).a;
        }
        if (interfaceC8429 instanceof C23558) {
            return ((C23558) interfaceC8429).a;
        }
        return interfaceC8429 instanceof C7723 ? ((C7723) interfaceC8429).a : new C19012(interfaceC8429);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        AbstractC9530 fileStore = this.a.getFileStore(C9695.l(path));
        int i = C23951.b;
        if (fileStore == null) {
            return null;
        }
        return fileStore instanceof C6311 ? ((C6311) fileStore).a : new C23951(fileStore);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return C3488.b(this.a.getFileSystem(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return C3343.l(this.a.getPath(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.a.getScheme();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.a.isHidden(C9695.l(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.isSameFile(C9695.l(path), C9695.l(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        InterfaceC1767[] interfaceC1767Arr;
        AbstractC17455 abstractC17455 = this.a;
        InterfaceC3800 interfaceC3800L = C9695.l(path);
        InterfaceC3800 interfaceC3800L2 = C9695.l(path2);
        if (copyOptionArr == null) {
            interfaceC1767Arr = null;
        } else {
            int length = copyOptionArr.length;
            InterfaceC1767[] interfaceC1767Arr2 = new InterfaceC1767[length];
            for (int i = 0; i < length; i++) {
                interfaceC1767Arr2[i] = C7329.a(copyOptionArr[i]);
            }
            interfaceC1767Arr = interfaceC1767Arr2;
        }
        abstractC17455.move(interfaceC3800L, interfaceC3800L2, interfaceC1767Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        C10941 c10941E = this.a.e(C9695.l(path), AbstractC1726.u(set), executorService, AbstractC1726.I(fileAttributeArr));
        int i = AbstractC23641.a;
        if (c10941E == null) {
            return null;
        }
        return c10941E.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.newByteChannel(C9695.l(path), AbstractC1726.u(set), AbstractC1726.I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.f(C9695.l(path), AbstractC1726.u(set), AbstractC1726.I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return C3488.b(this.a.newFileSystem(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return C3488.b(this.a.newFileSystem(C9695.l(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC0978[] interfaceC0978Arr;
        AbstractC17455 abstractC17455 = this.a;
        InterfaceC3800 interfaceC3800L = C9695.l(path);
        if (openOptionArr == null) {
            interfaceC0978Arr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC0978[] interfaceC0978Arr2 = new InterfaceC0978[length];
            for (int i = 0; i < length; i++) {
                interfaceC0978Arr2[i] = C12517.a(openOptionArr[i]);
            }
            interfaceC0978Arr = interfaceC0978Arr2;
        }
        return abstractC17455.newInputStream(interfaceC3800L, interfaceC0978Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC0978[] interfaceC0978Arr;
        AbstractC17455 abstractC17455 = this.a;
        InterfaceC3800 interfaceC3800L = C9695.l(path);
        if (openOptionArr == null) {
            interfaceC0978Arr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC0978[] interfaceC0978Arr2 = new InterfaceC0978[length];
            for (int i = 0; i < length; i++) {
                interfaceC0978Arr2[i] = C12517.a(openOptionArr[i]);
            }
            interfaceC0978Arr = interfaceC0978Arr2;
        }
        return abstractC17455.g(interfaceC3800L, interfaceC0978Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C5606.a(this.a.readAttributes(C9695.l(path), AbstractC1726.r(cls), AbstractC1726.F(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return AbstractC1726.s(this.a.readAttributes(C9695.l(path), str, AbstractC1726.F(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return C3343.l(this.a.h(C9695.l(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.setAttribute(C9695.l(path), str, AbstractC1726.t(obj), AbstractC1726.F(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new C14053(this.a.newDirectoryStream(C9695.l(path), new C5295(2, filter)));
    }
}
