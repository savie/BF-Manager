package l;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* JADX INFO: renamed from: l.֫᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2077 extends AbstractC3178 {
    public final /* synthetic */ FileSystem a;

    public /* synthetic */ C2077(FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ AbstractC3178 b(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C3488 ? ((C3488) fileSystem).a : new C2077(fileSystem);
    }

    @Override // l.AbstractC3178, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.a;
        if (obj instanceof C2077) {
            obj = ((C2077) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // l.AbstractC3178
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.getFileStores();
    }

    @Override // l.AbstractC3178
    public final /* synthetic */ InterfaceC3800 getPath(String str, String[] strArr) {
        return C9695.l(this.a.getPath(str, strArr));
    }

    @Override // l.AbstractC3178
    public final /* synthetic */ InterfaceC6623 getPathMatcher(String str) {
        PathMatcher pathMatcher = this.a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof C17600 ? ((C17600) pathMatcher).a : new C16895(pathMatcher);
    }

    @Override // l.AbstractC3178
    public final /* synthetic */ String getSeparator() {
        return this.a.getSeparator();
    }

    @Override // l.AbstractC3178
    public final /* synthetic */ AbstractC5918 getUserPrincipalLookupService() {
        UserPrincipalLookupService userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return userPrincipalLookupService instanceof C4900 ? ((C4900) userPrincipalLookupService).a : new C9447(userPrincipalLookupService);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.AbstractC3178
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // l.AbstractC3178
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.isReadOnly();
    }

    @Override // l.AbstractC3178
    public final /* synthetic */ InterfaceC8741 newWatchService() {
        return C19572.b(this.a.newWatchService());
    }

    @Override // l.AbstractC3178
    public final /* synthetic */ AbstractC17455 provider() {
        FileSystemProvider fileSystemProviderProvider = this.a.provider();
        int i = C11106.f;
        if (fileSystemProviderProvider == null) {
            return null;
        }
        return fileSystemProviderProvider instanceof C23806 ? ((C23806) fileSystemProviderProvider).a : new C11106(fileSystemProviderProvider);
    }

    @Override // l.AbstractC3178
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.supportedFileAttributeViews();
    }

    @Override // l.AbstractC3178
    public final Iterable getRootDirectories() {
        return new C11936(this.a.getRootDirectories());
    }
}
