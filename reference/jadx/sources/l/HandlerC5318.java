package l;

import android.media.MediaScannerConnection;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ۚۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AN5 */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC5318 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String[] strArr;
        synchronized (C22252.class) {
            strArr = (String[]) C22252.f72743.toArray(new String[0]);
            C22252.f72743.clear();
        }
        if (strArr.length > 0) {
            MediaScannerConnection.scanFile(C16737.m39277(), strArr, null, null);
        }
    }
}
