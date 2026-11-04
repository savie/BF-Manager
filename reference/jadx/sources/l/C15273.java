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

/* JADX INFO: renamed from: l.ܳۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15273 extends AbstractC22733 {
    public static final /* synthetic */ int f = 0;
    public final /* synthetic */ FileSystemProvider e;

    public /* synthetic */ C15273(FileSystemProvider fileSystemProvider) {
        this.e = fileSystemProvider;
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ void a(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210) throws IOException {
        this.e.createLink(C24971.i(interfaceC24329), C24971.i(interfaceC243210));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ void b(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, InterfaceC13885[] interfaceC13885Arr) throws IOException {
        this.e.createSymbolicLink(C24971.i(interfaceC24329), C24971.i(interfaceC243210), AbstractC1758.N(interfaceC13885Arr));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ boolean c(InterfaceC24329 interfaceC24329) {
        return this.e.deleteIfExists(C24971.i(interfaceC24329));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ void checkAccess(InterfaceC24329 interfaceC24329, EnumC5683[] enumC5683Arr) throws IOException {
        AccessMode accessMode;
        FileSystemProvider fileSystemProvider = this.e;
        Path pathI = C24971.i(interfaceC24329);
        AccessMode[] accessModeArr = null;
        if (enumC5683Arr != null) {
            int length = enumC5683Arr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                EnumC5683 enumC5683 = enumC5683Arr[i];
                if (enumC5683 == null) {
                    accessMode = null;
                } else if (enumC5683 == EnumC5683.READ) {
                    accessMode = AccessMode.READ;
                } else {
                    accessMode = enumC5683 == EnumC5683.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
                }
                accessModeArr2[i] = accessMode;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(pathI, accessModeArr);
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ void copy(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, InterfaceC1954[] interfaceC1954Arr) throws IOException {
        this.e.copy(C24971.i(interfaceC24329), C24971.i(interfaceC243210), AbstractC1758.J(interfaceC1954Arr));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ void createDirectory(InterfaceC24329 interfaceC24329, InterfaceC13885[] interfaceC13885Arr) throws IOException {
        this.e.createDirectory(C24971.i(interfaceC24329), AbstractC1758.N(interfaceC13885Arr));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ void delete(InterfaceC24329 interfaceC24329) throws IOException {
        this.e.delete(C24971.i(interfaceC24329));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ C15377 e(InterfaceC24329 interfaceC24329, Set set, ExecutorService executorService, InterfaceC13885[] interfaceC13885Arr) throws IOException {
        AsynchronousFileChannel asynchronousFileChannelNewAsynchronousFileChannel = this.e.newAsynchronousFileChannel(C24971.i(interfaceC24329), AbstractC1758.u(set), executorService, AbstractC1758.N(interfaceC13885Arr));
        if (asynchronousFileChannelNewAsynchronousFileChannel == null) {
            return null;
        }
        return new C15377(asynchronousFileChannelNewAsynchronousFileChannel);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.e;
        if (obj instanceof C15273) {
            obj = ((C15273) obj).e;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ FileChannel f(InterfaceC24329 interfaceC24329, Set set, InterfaceC13885[] interfaceC13885Arr) {
        return this.e.newFileChannel(C24971.i(interfaceC24329), AbstractC1758.u(set), AbstractC1758.N(interfaceC13885Arr));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ OutputStream g(InterfaceC24329 interfaceC24329, InterfaceC12394[] interfaceC12394Arr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.e;
        Path pathI = C24971.i(interfaceC24329);
        if (interfaceC12394Arr == null) {
            openOptionArr = null;
        } else {
            int length = interfaceC12394Arr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = C5579.a(interfaceC12394Arr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newOutputStream(pathI, openOptionArr);
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ InterfaceC4659 getFileAttributeView(InterfaceC24329 interfaceC24329, Class cls, EnumC20599[] enumC20599Arr) {
        FileAttributeView fileAttributeView = this.e.getFileAttributeView(C24971.i(interfaceC24329), AbstractC1758.q(cls), AbstractC1758.K(enumC20599Arr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof C18083) {
            return ((C18083) fileAttributeView).a;
        }
        if (fileAttributeView instanceof BasicFileAttributeView) {
            BasicFileAttributeView basicFileAttributeView = (BasicFileAttributeView) fileAttributeView;
            if (basicFileAttributeView instanceof C17337) {
                return ((C17337) basicFileAttributeView).a;
            }
            if (!(basicFileAttributeView instanceof DosFileAttributeView)) {
                return basicFileAttributeView instanceof PosixFileAttributeView ? new C2421((PosixFileAttributeView) basicFileAttributeView) : new C24797(basicFileAttributeView);
            }
            DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) basicFileAttributeView;
            return dosFileAttributeView instanceof C12116 ? ((C12116) dosFileAttributeView).a : new C20321(dosFileAttributeView);
        }
        if (!(fileAttributeView instanceof FileOwnerAttributeView)) {
            return fileAttributeView instanceof UserDefinedFileAttributeView ? new C13607((UserDefinedFileAttributeView) fileAttributeView) : new C21067(fileAttributeView);
        }
        FileOwnerAttributeView fileOwnerAttributeView = (FileOwnerAttributeView) fileAttributeView;
        if (fileOwnerAttributeView instanceof C7642) {
            return ((C7642) fileOwnerAttributeView).a;
        }
        if (fileOwnerAttributeView instanceof AclFileAttributeView) {
            return new C12862((AclFileAttributeView) fileOwnerAttributeView);
        }
        return fileOwnerAttributeView instanceof PosixFileAttributeView ? new C2421((PosixFileAttributeView) fileOwnerAttributeView) : new C0184(fileOwnerAttributeView);
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ AbstractC11648 getFileStore(InterfaceC24329 interfaceC24329) throws IOException {
        FileStore fileStore = this.e.getFileStore(C24971.i(interfaceC24329));
        if (fileStore == null) {
            return null;
        }
        return fileStore instanceof C13365 ? ((C13365) fileStore).a : new C20078(fileStore);
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ AbstractC25075 getFileSystem(URI uri) {
        return C2179.b(this.e.getFileSystem(uri));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ InterfaceC24329 getPath(URI uri) {
        return C11544.i(this.e.getPath(uri));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ String getScheme() {
        return this.e.getScheme();
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ InterfaceC24329 h(InterfaceC24329 interfaceC24329) {
        return C11544.i(this.e.readSymbolicLink(C24971.i(interfaceC24329)));
    }

    public final /* synthetic */ int hashCode() {
        return this.e.hashCode();
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ boolean isHidden(InterfaceC24329 interfaceC24329) {
        return this.e.isHidden(C24971.i(interfaceC24329));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ boolean isSameFile(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210) {
        return this.e.isSameFile(C24971.i(interfaceC24329), C24971.i(interfaceC243210));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ void move(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, InterfaceC1954[] interfaceC1954Arr) throws IOException {
        this.e.move(C24971.i(interfaceC24329), C24971.i(interfaceC243210), AbstractC1758.J(interfaceC1954Arr));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ SeekableByteChannel newByteChannel(InterfaceC24329 interfaceC24329, Set set, InterfaceC13885[] interfaceC13885Arr) {
        return this.e.newByteChannel(C24971.i(interfaceC24329), AbstractC1758.u(set), AbstractC1758.N(interfaceC13885Arr));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ AbstractC25075 newFileSystem(URI uri, Map map) {
        return C2179.b(this.e.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ AbstractC25075 newFileSystem(InterfaceC24329 interfaceC24329, Map map) {
        return C2179.b(this.e.newFileSystem(C24971.i(interfaceC24329), (Map<String, ?>) map));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ InputStream newInputStream(InterfaceC24329 interfaceC24329, InterfaceC12394[] interfaceC12394Arr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.e;
        Path pathI = C24971.i(interfaceC24329);
        if (interfaceC12394Arr == null) {
            openOptionArr = null;
        } else {
            int length = interfaceC12394Arr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = C5579.a(interfaceC12394Arr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newInputStream(pathI, openOptionArr);
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ Map readAttributes(InterfaceC24329 interfaceC24329, String str, EnumC20599[] enumC20599Arr) {
        return AbstractC1758.s(this.e.readAttributes(C24971.i(interfaceC24329), str, AbstractC1758.K(enumC20599Arr)));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ InterfaceC8665 readAttributes(InterfaceC24329 interfaceC24329, Class cls, EnumC20599[] enumC20599Arr) {
        return C23305.a(this.e.readAttributes(C24971.i(interfaceC24329), AbstractC1758.r(cls), AbstractC1758.K(enumC20599Arr)));
    }

    @Override // l.AbstractC22733
    public final /* synthetic */ void setAttribute(InterfaceC24329 interfaceC24329, String str, Object obj, EnumC20599[] enumC20599Arr) throws IOException {
        this.e.setAttribute(C24971.i(interfaceC24329), str, AbstractC1758.t(obj), AbstractC1758.K(enumC20599Arr));
    }

    @Override // l.AbstractC22733
    public final DirectoryStream newDirectoryStream(InterfaceC24329 interfaceC24329, DirectoryStream.Filter filter) {
        return new C17511(this.e.newDirectoryStream(C24971.i(interfaceC24329), new C3249(2, filter)));
    }
}
