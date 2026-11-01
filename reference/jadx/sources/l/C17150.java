package l;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.ܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB10 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17150 implements InterfaceC12212 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ContentProviderClient f54704;

    public C17150(Context context, Uri uri) {
        this.f54704 = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // l.InterfaceC12212
    /* JADX INFO: renamed from: ۙ */
    public final Cursor mo27096(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = this.f54704;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // l.InterfaceC12212
    public final void close() {
        ContentProviderClient contentProviderClient = this.f54704;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }
}
