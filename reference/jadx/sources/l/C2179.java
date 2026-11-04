package l;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* JADX INFO: renamed from: l.֫᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2179 extends AbstractC25075 {
    public final /* synthetic */ FileSystem a;

    public /* synthetic */ C2179(FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ AbstractC25075 b(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C25300 ? ((C25300) fileSystem).a : new C2179(fileSystem);
    }

    @Override // l.AbstractC25075, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.a;
        if (obj instanceof C2179) {
            obj = ((C2179) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // l.AbstractC25075
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.getFileStores();
    }

    @Override // l.AbstractC25075
    public final /* synthetic */ InterfaceC24329 getPath(String str, String[] strArr) {
        return C11544.i(this.a.getPath(str, strArr));
    }

    @Override // l.AbstractC25075
    public final /* synthetic */ InterfaceC4191 getPathMatcher(String str) {
        PathMatcher pathMatcher = this.a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof C23062 ? ((C23062) pathMatcher).a : new C22316(pathMatcher);
    }

    @Override // l.AbstractC25075
    public final /* synthetic */ String getSeparator() {
        return this.a.getSeparator();
    }

    @Override // l.AbstractC25075
    public final /* synthetic */ AbstractC19575 getUserPrincipalLookupService() {
        UserPrincipalLookupService userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return userPrincipalLookupService instanceof C16591 ? ((C16591) userPrincipalLookupService).a : new C11370(userPrincipalLookupService);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.AbstractC25075
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // l.AbstractC25075
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.isReadOnly();
    }

    @Override // l.AbstractC25075
    public final /* synthetic */ InterfaceC1208 newWatchService() {
        return C10381.b(this.a.newWatchService());
    }

    @Override // l.AbstractC25075
    public final /* synthetic */ AbstractC22733 provider() {
        FileSystemProvider fileSystemProviderProvider = this.a.provider();
        int i = C15273.f;
        if (fileSystemProviderProvider == null) {
            return null;
        }
        return fileSystemProviderProvider instanceof C13036 ? ((C13036) fileSystemProviderProvider).a : new C15273(fileSystemProviderProvider);
    }

    @Override // l.AbstractC25075
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.supportedFileAttributeViews();
    }

    @Override // l.AbstractC25075
    public final Iterable getRootDirectories() {
        return new C16019(this.a.getRootDirectories());
    }
}
