package l;

import android.media.MediaScannerConnection;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.᩸᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AN5 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC23092 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String[] strArr;
        synchronized (C20108.class) {
            strArr = (String[]) C20108.f64608.toArray(new String[0]);
            C20108.f64608.clear();
        }
        if (strArr.length > 0) {
            MediaScannerConnection.scanFile(C21576.m49084(), strArr, null, null);
        }
    }
}
