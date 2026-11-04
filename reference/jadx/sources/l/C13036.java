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

/* JADX INFO: renamed from: l.۫ۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13036 extends FileSystemProvider {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ AbstractC22733 a;

    public /* synthetic */ C13036(AbstractC22733 abstractC22733) {
        this.a = abstractC22733;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        EnumC5683 enumC5683;
        AbstractC22733 abstractC22733 = this.a;
        InterfaceC24329 interfaceC24329I = C11544.i(path);
        EnumC5683[] enumC5683Arr = null;
        if (accessModeArr != null) {
            int length = accessModeArr.length;
            EnumC5683[] enumC5683Arr2 = new EnumC5683[length];
            for (int i = 0; i < length; i++) {
                AccessMode accessMode = accessModeArr[i];
                if (accessMode == null) {
                    enumC5683 = null;
                } else if (accessMode == AccessMode.READ) {
                    enumC5683 = EnumC5683.READ;
                } else {
                    enumC5683 = accessMode == AccessMode.WRITE ? EnumC5683.WRITE : EnumC5683.EXECUTE;
                }
                enumC5683Arr2[i] = enumC5683;
            }
            enumC5683Arr = enumC5683Arr2;
        }
        abstractC22733.checkAccess(interfaceC24329I, enumC5683Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        InterfaceC1954[] interfaceC1954Arr;
        AbstractC22733 abstractC22733 = this.a;
        InterfaceC24329 interfaceC24329I = C11544.i(path);
        InterfaceC24329 interfaceC24329I2 = C11544.i(path2);
        if (copyOptionArr == null) {
            interfaceC1954Arr = null;
        } else {
            int length = copyOptionArr.length;
            InterfaceC1954[] interfaceC1954Arr2 = new InterfaceC1954[length];
            for (int i = 0; i < length; i++) {
                interfaceC1954Arr2[i] = C2699.a(copyOptionArr[i]);
            }
            interfaceC1954Arr = interfaceC1954Arr2;
        }
        abstractC22733.copy(interfaceC24329I, interfaceC24329I2, interfaceC1954Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.createDirectory(C11544.i(path), AbstractC1758.I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.a(C11544.i(path), C11544.i(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.b(C11544.i(path), C11544.i(path2), AbstractC1758.I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.delete(C11544.i(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.c(C11544.i(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC22733 abstractC22733 = this.a;
        if (obj instanceof C13036) {
            obj = ((C13036) obj).a;
        }
        return abstractC22733.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        InterfaceC4659 fileAttributeView = this.a.getFileAttributeView(C11544.i(path), AbstractC1758.q(cls), AbstractC1758.F(linkOptionArr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof C21067) {
            return ((C21067) fileAttributeView).a;
        }
        if (fileAttributeView instanceof InterfaceC15845) {
            InterfaceC15845 interfaceC15845 = (InterfaceC15845) fileAttributeView;
            if (interfaceC15845 instanceof C24797) {
                return ((C24797) interfaceC15845).a;
            }
            if (!(interfaceC15845 instanceof InterfaceC7174)) {
                return interfaceC15845 instanceof C2421 ? ((C2421) interfaceC15845).a : new C17337(interfaceC15845);
            }
            InterfaceC7174 interfaceC7174 = (InterfaceC7174) interfaceC15845;
            return interfaceC7174 instanceof C20321 ? ((C20321) interfaceC7174).a : new C12116(interfaceC7174);
        }
        if (!(fileAttributeView instanceof InterfaceC18829)) {
            return fileAttributeView instanceof C13607 ? ((C13607) fileAttributeView).a : new C18083(fileAttributeView);
        }
        InterfaceC18829 interfaceC18829 = (InterfaceC18829) fileAttributeView;
        if (interfaceC18829 instanceof C0184) {
            return ((C0184) interfaceC18829).a;
        }
        if (interfaceC18829 instanceof C12862) {
            return ((C12862) interfaceC18829).a;
        }
        return interfaceC18829 instanceof C2421 ? ((C2421) interfaceC18829).a : new C7642(interfaceC18829);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        AbstractC11648 fileStore = this.a.getFileStore(C11544.i(path));
        int i = C13365.b;
        if (fileStore == null) {
            return null;
        }
        return fileStore instanceof C20078 ? ((C20078) fileStore).a : new C13365(fileStore);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return C25300.b(this.a.getFileSystem(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return C24971.i(this.a.getPath(uri));
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
        return this.a.isHidden(C11544.i(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.isSameFile(C11544.i(path), C11544.i(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        InterfaceC1954[] interfaceC1954Arr;
        AbstractC22733 abstractC22733 = this.a;
        InterfaceC24329 interfaceC24329I = C11544.i(path);
        InterfaceC24329 interfaceC24329I2 = C11544.i(path2);
        if (copyOptionArr == null) {
            interfaceC1954Arr = null;
        } else {
            int length = copyOptionArr.length;
            InterfaceC1954[] interfaceC1954Arr2 = new InterfaceC1954[length];
            for (int i = 0; i < length; i++) {
                interfaceC1954Arr2[i] = C2699.a(copyOptionArr[i]);
            }
            interfaceC1954Arr = interfaceC1954Arr2;
        }
        abstractC22733.move(interfaceC24329I, interfaceC24329I2, interfaceC1954Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        C15377 c15377E = this.a.e(C11544.i(path), AbstractC1758.u(set), executorService, AbstractC1758.I(fileAttributeArr));
        int i = AbstractC13140.a;
        if (c15377E == null) {
            return null;
        }
        return c15377E.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.newByteChannel(C11544.i(path), AbstractC1758.u(set), AbstractC1758.I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.f(C11544.i(path), AbstractC1758.u(set), AbstractC1758.I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return C25300.b(this.a.newFileSystem(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return C25300.b(this.a.newFileSystem(C11544.i(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC12394[] interfaceC12394Arr;
        AbstractC22733 abstractC22733 = this.a;
        InterfaceC24329 interfaceC24329I = C11544.i(path);
        if (openOptionArr == null) {
            interfaceC12394Arr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC12394[] interfaceC12394Arr2 = new InterfaceC12394[length];
            for (int i = 0; i < length; i++) {
                interfaceC12394Arr2[i] = C10798.a(openOptionArr[i]);
            }
            interfaceC12394Arr = interfaceC12394Arr2;
        }
        return abstractC22733.newInputStream(interfaceC24329I, interfaceC12394Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC12394[] interfaceC12394Arr;
        AbstractC22733 abstractC22733 = this.a;
        InterfaceC24329 interfaceC24329I = C11544.i(path);
        if (openOptionArr == null) {
            interfaceC12394Arr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC12394[] interfaceC12394Arr2 = new InterfaceC12394[length];
            for (int i = 0; i < length; i++) {
                interfaceC12394Arr2[i] = C10798.a(openOptionArr[i]);
            }
            interfaceC12394Arr = interfaceC12394Arr2;
        }
        return abstractC22733.g(interfaceC24329I, interfaceC12394Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C3167.a(this.a.readAttributes(C11544.i(path), AbstractC1758.r(cls), AbstractC1758.F(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return AbstractC1758.s(this.a.readAttributes(C11544.i(path), str, AbstractC1758.F(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return C24971.i(this.a.h(C11544.i(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.setAttribute(C11544.i(path), str, AbstractC1758.t(obj), AbstractC1758.F(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new C17511(this.a.newDirectoryStream(C11544.i(path), new C3249(2, filter)));
    }
}
