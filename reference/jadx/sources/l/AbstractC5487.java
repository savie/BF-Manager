package l;

import android.os.StrictMode;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.spi.FileSystemProvider;

/* JADX INFO: renamed from: l.ۚۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5487 {
    public static final AbstractC22733 a;

    static {
        AbstractC22733 c15273;
        if (AbstractC12944.b) {
            FileSystemProvider fileSystemProviderProvider = FileSystems.getDefault().provider();
            int i = C15273.f;
            if (fileSystemProviderProvider == null) {
                c15273 = null;
            } else {
                c15273 = fileSystemProviderProvider instanceof C13036 ? ((C13036) fileSystemProviderProvider).a : new C15273(fileSystemProviderProvider);
            }
        } else {
            if (AbstractC12944.c) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().build());
            }
            c15273 = AbstractC17419.a;
        }
        a = c15273;
        c15273.getFileSystem(URI.create("file:///"));
    }
}
