package l;

import android.os.StrictMode;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.spi.FileSystemProvider;

/* JADX INFO: renamed from: l.ܳۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14428 {
    public static final AbstractC17455 a;

    static {
        AbstractC17455 c11106;
        if (AbstractC23600.b) {
            FileSystemProvider fileSystemProviderProvider = FileSystems.getDefault().provider();
            int i = C11106.f;
            if (fileSystemProviderProvider == null) {
                c11106 = null;
            } else {
                c11106 = fileSystemProviderProvider instanceof C23806 ? ((C23806) fileSystemProviderProvider).a : new C11106(fileSystemProviderProvider);
            }
        } else {
            if (AbstractC23600.c) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().build());
            }
            c11106 = AbstractC13763.a;
        }
        a = c11106;
        c11106.getFileSystem(URI.create("file:///"));
    }
}
