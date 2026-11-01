package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۧܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11106 extends AbstractC17455 {
    public static final /* synthetic */ int f = 0;
    public final /* synthetic */ FileSystemProvider e;

    public /* synthetic */ C11106(FileSystemProvider fileSystemProvider) {
        this.e = fileSystemProvider;
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ void a(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801) throws IOException {
        this.e.createLink(C3343.l(interfaceC3800), C3343.l(interfaceC3801));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ void b(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, InterfaceC20030[] interfaceC20030Arr) throws IOException {
        this.e.createSymbolicLink(C3343.l(interfaceC3800), C3343.l(interfaceC3801), AbstractC1726.N(interfaceC20030Arr));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ boolean c(InterfaceC3800 interfaceC3800) {
        return this.e.deleteIfExists(C3343.l(interfaceC3800));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ void checkAccess(InterfaceC3800 interfaceC3800, EnumC14469[] enumC14469Arr) throws IOException {
        AccessMode accessMode;
        FileSystemProvider fileSystemProvider = this.e;
        Path pathL = C3343.l(interfaceC3800);
        AccessMode[] accessModeArr = null;
        if (enumC14469Arr != null) {
            int length = enumC14469Arr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                EnumC14469 enumC14469 = enumC14469Arr[i];
                if (enumC14469 == null) {
                    accessMode = null;
                } else if (enumC14469 == EnumC14469.READ) {
                    accessMode = AccessMode.READ;
                } else {
                    accessMode = enumC14469 == EnumC14469.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
                }
                accessModeArr2[i] = accessMode;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(pathL, accessModeArr);
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ void copy(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, InterfaceC1767[] interfaceC1767Arr) throws IOException {
        this.e.copy(C3343.l(interfaceC3800), C3343.l(interfaceC3801), AbstractC1726.J(interfaceC1767Arr));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ void createDirectory(InterfaceC3800 interfaceC3800, InterfaceC20030[] interfaceC20030Arr) throws IOException {
        this.e.createDirectory(C3343.l(interfaceC3800), AbstractC1726.N(interfaceC20030Arr));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ void delete(InterfaceC3800 interfaceC3800) throws IOException {
        this.e.delete(C3343.l(interfaceC3800));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ C10941 e(InterfaceC3800 interfaceC3800, Set set, ExecutorService executorService, InterfaceC20030[] interfaceC20030Arr) throws IOException {
        AsynchronousFileChannel asynchronousFileChannelNewAsynchronousFileChannel = this.e.newAsynchronousFileChannel(C3343.l(interfaceC3800), AbstractC1726.u(set), executorService, AbstractC1726.N(interfaceC20030Arr));
        if (asynchronousFileChannelNewAsynchronousFileChannel == null) {
            return null;
        }
        return new C10941(asynchronousFileChannelNewAsynchronousFileChannel);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.e;
        if (obj instanceof C11106) {
            obj = ((C11106) obj).e;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ FileChannel f(InterfaceC3800 interfaceC3800, Set set, InterfaceC20030[] interfaceC20030Arr) {
        return this.e.newFileChannel(C3343.l(interfaceC3800), AbstractC1726.u(set), AbstractC1726.N(interfaceC20030Arr));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ OutputStream g(InterfaceC3800 interfaceC3800, InterfaceC0978[] interfaceC0978Arr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.e;
        Path pathL = C3343.l(interfaceC3800);
        if (interfaceC0978Arr == null) {
            openOptionArr = null;
        } else {
            int length = interfaceC0978Arr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = C14634.a(interfaceC0978Arr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newOutputStream(pathL, openOptionArr);
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ InterfaceC0273 getFileAttributeView(InterfaceC3800 interfaceC3800, Class cls, EnumC22146[] enumC22146Arr) {
        FileAttributeView fileAttributeView = this.e.getFileAttributeView(C3343.l(interfaceC3800), AbstractC1726.q(cls), AbstractC1726.K(enumC22146Arr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof C21834) {
            return ((C21834) fileAttributeView).a;
        }
        if (fileAttributeView instanceof BasicFileAttributeView) {
            BasicFileAttributeView basicFileAttributeView = (BasicFileAttributeView) fileAttributeView;
            if (basicFileAttributeView instanceof C14074) {
                return ((C14074) basicFileAttributeView).a;
            }
            if (!(basicFileAttributeView instanceof DosFileAttributeView)) {
                return basicFileAttributeView instanceof PosixFileAttributeView ? new C7723((PosixFileAttributeView) basicFileAttributeView) : new C3095(basicFileAttributeView);
            }
            DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) basicFileAttributeView;
            return dosFileAttributeView instanceof C1372 ? ((C1372) dosFileAttributeView).a : new C22540(dosFileAttributeView);
        }
        if (!(fileAttributeView instanceof FileOwnerAttributeView)) {
            return fileAttributeView instanceof UserDefinedFileAttributeView ? new C20423((UserDefinedFileAttributeView) fileAttributeView) : new C15485(fileAttributeView);
        }
        FileOwnerAttributeView fileOwnerAttributeView = (FileOwnerAttributeView) fileAttributeView;
        if (fileOwnerAttributeView instanceof C19012) {
            return ((C19012) fileOwnerAttributeView).a;
        }
        if (fileOwnerAttributeView instanceof AclFileAttributeView) {
            return new C23558((AclFileAttributeView) fileOwnerAttributeView);
        }
        return fileOwnerAttributeView instanceof PosixFileAttributeView ? new C7723((PosixFileAttributeView) fileOwnerAttributeView) : new C18306(fileOwnerAttributeView);
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ AbstractC9530 getFileStore(InterfaceC3800 interfaceC3800) throws IOException {
        FileStore fileStore = this.e.getFileStore(C3343.l(interfaceC3800));
        if (fileStore == null) {
            return null;
        }
        return fileStore instanceof C23951 ? ((C23951) fileStore).a : new C6311(fileStore);
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ AbstractC3178 getFileSystem(URI uri) {
        return C2077.b(this.e.getFileSystem(uri));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ InterfaceC3800 getPath(URI uri) {
        return C9695.l(this.e.getPath(uri));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ String getScheme() {
        return this.e.getScheme();
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ InterfaceC3800 h(InterfaceC3800 interfaceC3800) {
        return C9695.l(this.e.readSymbolicLink(C3343.l(interfaceC3800)));
    }

    public final /* synthetic */ int hashCode() {
        return this.e.hashCode();
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ boolean isHidden(InterfaceC3800 interfaceC3800) {
        return this.e.isHidden(C3343.l(interfaceC3800));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ boolean isSameFile(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801) {
        return this.e.isSameFile(C3343.l(interfaceC3800), C3343.l(interfaceC3801));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ void move(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, InterfaceC1767[] interfaceC1767Arr) throws IOException {
        this.e.move(C3343.l(interfaceC3800), C3343.l(interfaceC3801), AbstractC1726.J(interfaceC1767Arr));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ SeekableByteChannel newByteChannel(InterfaceC3800 interfaceC3800, Set set, InterfaceC20030[] interfaceC20030Arr) {
        return this.e.newByteChannel(C3343.l(interfaceC3800), AbstractC1726.u(set), AbstractC1726.N(interfaceC20030Arr));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ AbstractC3178 newFileSystem(URI uri, Map map) {
        return C2077.b(this.e.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ AbstractC3178 newFileSystem(InterfaceC3800 interfaceC3800, Map map) {
        return C2077.b(this.e.newFileSystem(C3343.l(interfaceC3800), (Map<String, ?>) map));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ InputStream newInputStream(InterfaceC3800 interfaceC3800, InterfaceC0978[] interfaceC0978Arr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.e;
        Path pathL = C3343.l(interfaceC3800);
        if (interfaceC0978Arr == null) {
            openOptionArr = null;
        } else {
            int length = interfaceC0978Arr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = C14634.a(interfaceC0978Arr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newInputStream(pathL, openOptionArr);
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ Map readAttributes(InterfaceC3800 interfaceC3800, String str, EnumC22146[] enumC22146Arr) {
        return AbstractC1726.s(this.e.readAttributes(C3343.l(interfaceC3800), str, AbstractC1726.K(enumC22146Arr)));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ InterfaceC20735 readAttributes(InterfaceC3800 interfaceC3800, Class cls, EnumC22146[] enumC22146Arr) {
        return C2783.a(this.e.readAttributes(C3343.l(interfaceC3800), AbstractC1726.r(cls), AbstractC1726.K(enumC22146Arr)));
    }

    @Override // l.AbstractC17455
    public final /* synthetic */ void setAttribute(InterfaceC3800 interfaceC3800, String str, Object obj, EnumC22146[] enumC22146Arr) throws IOException {
        this.e.setAttribute(C3343.l(interfaceC3800), str, AbstractC1726.t(obj), AbstractC1726.K(enumC22146Arr));
    }

    @Override // l.AbstractC17455
    public final DirectoryStream newDirectoryStream(InterfaceC3800 interfaceC3800, DirectoryStream.Filter filter) {
        return new C14053(this.e.newDirectoryStream(C3343.l(interfaceC3800), new C5295(2, filter)));
    }
}
