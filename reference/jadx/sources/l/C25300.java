package l;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C25300 extends FileSystem {
    public final /* synthetic */ AbstractC25075 a;

    public /* synthetic */ C25300(AbstractC25075 abstractC25075) {
        this.a = abstractC25075;
    }

    public static /* synthetic */ FileSystem b(AbstractC25075 abstractC25075) {
        if (abstractC25075 == null) {
            return null;
        }
        return abstractC25075 instanceof C2179 ? ((C2179) abstractC25075).a : new C25300(abstractC25075);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC25075 abstractC25075 = this.a;
        if (obj instanceof C25300) {
            obj = ((C25300) obj).a;
        }
        return abstractC25075.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.getFileStores();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Path getPath(String str, String[] strArr) {
        return C24971.i(this.a.getPath(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        InterfaceC4191 pathMatcher = this.a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof C22316 ? ((C22316) pathMatcher).a : new C23062(pathMatcher);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.a.getSeparator();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        AbstractC19575 userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        int i = C16591.b;
        if (userPrincipalLookupService == null) {
            return null;
        }
        return userPrincipalLookupService instanceof C11370 ? ((C11370) userPrincipalLookupService).a : new C16591(userPrincipalLookupService);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.isReadOnly();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        return C9635.b(this.a.newWatchService());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        AbstractC22733 abstractC22733Provider = this.a.provider();
        int i = C13036.b;
        if (abstractC22733Provider == null) {
            return null;
        }
        return abstractC22733Provider instanceof C15273 ? ((C15273) abstractC22733Provider).e : new C13036(abstractC22733Provider);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.supportedFileAttributeViews();
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new C16019(this.a.getRootDirectories());
    }
}
