package l;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3488 extends FileSystem {
    public final /* synthetic */ AbstractC3178 a;

    public /* synthetic */ C3488(AbstractC3178 abstractC3178) {
        this.a = abstractC3178;
    }

    public static /* synthetic */ FileSystem b(AbstractC3178 abstractC3178) {
        if (abstractC3178 == null) {
            return null;
        }
        return abstractC3178 instanceof C2077 ? ((C2077) abstractC3178).a : new C3488(abstractC3178);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC3178 abstractC3178 = this.a;
        if (obj instanceof C3488) {
            obj = ((C3488) obj).a;
        }
        return abstractC3178.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.getFileStores();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Path getPath(String str, String[] strArr) {
        return C3343.l(this.a.getPath(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        InterfaceC6623 pathMatcher = this.a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof C16895 ? ((C16895) pathMatcher).a : new C17600(pathMatcher);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.a.getSeparator();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        AbstractC5918 userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        int i = C4900.b;
        if (userPrincipalLookupService == null) {
            return null;
        }
        return userPrincipalLookupService instanceof C9447 ? ((C9447) userPrincipalLookupService).a : new C4900(userPrincipalLookupService);
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
        return C10400.b(this.a.newWatchService());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        AbstractC17455 abstractC17455Provider = this.a.provider();
        int i = C23806.b;
        if (abstractC17455Provider == null) {
            return null;
        }
        return abstractC17455Provider instanceof C11106 ? ((C11106) abstractC17455Provider).e : new C23806(abstractC17455Provider);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.supportedFileAttributeViews();
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new C11936(this.a.getRootDirectories());
    }
}
