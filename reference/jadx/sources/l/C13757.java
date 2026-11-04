package l;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.۬ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB10 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13757 implements InterfaceC2571 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ContentProviderClient f43678;

    public C13757(Context context, Uri uri) {
        this.f43678 = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // l.InterfaceC2571
    /* JADX INFO: renamed from: ۙ */
    public final Cursor mo8633(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = this.f43678;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC2571
    public final void close() throws Exception {
        ContentProviderClient contentProviderClient = this.f43678;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                C7046.m19387((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }
}
