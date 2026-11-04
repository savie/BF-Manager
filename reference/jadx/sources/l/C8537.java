package l;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB10 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8537 implements InterfaceC2571 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ContentProviderClient f27890;

    public C8537(Context context, Uri uri) {
        this.f27890 = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // l.InterfaceC2571
    /* JADX INFO: renamed from: ۙ */
    public final Cursor mo8633(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = this.f27890;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // l.InterfaceC2571
    public final void close() {
        ContentProviderClient contentProviderClient = this.f27890;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }
}
