package l;

import java.io.Closeable;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25075 implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract Iterable getFileStores();

    public abstract InterfaceC24329 getPath(String str, String... strArr);

    public abstract InterfaceC4191 getPathMatcher(String str);

    public abstract Iterable getRootDirectories();

    public abstract String getSeparator();

    public abstract AbstractC19575 getUserPrincipalLookupService();

    public abstract boolean isOpen();

    public abstract boolean isReadOnly();

    public abstract InterfaceC1208 newWatchService();

    public abstract AbstractC22733 provider();

    public abstract Set supportedFileAttributeViews();
}
