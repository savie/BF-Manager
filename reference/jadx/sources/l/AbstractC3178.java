package l;

import java.io.Closeable;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3178 implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract Iterable getFileStores();

    public abstract InterfaceC3800 getPath(String str, String... strArr);

    public abstract InterfaceC6623 getPathMatcher(String str);

    public abstract Iterable getRootDirectories();

    public abstract String getSeparator();

    public abstract AbstractC5918 getUserPrincipalLookupService();

    public abstract boolean isOpen();

    public abstract boolean isReadOnly();

    public abstract InterfaceC8741 newWatchService();

    public abstract AbstractC17455 provider();

    public abstract Set supportedFileAttributeViews();
}
