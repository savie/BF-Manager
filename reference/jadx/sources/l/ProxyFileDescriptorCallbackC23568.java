package l;

import android.os.ProxyFileDescriptorCallback;
import android.system.ErrnoException;
import android.system.OsConstants;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩻۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X13G */
/* JADX INFO: loaded from: classes.dex */
public final class ProxyFileDescriptorCallbackC23568 extends ProxyFileDescriptorCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1388 f76353;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f76354;

    public ProxyFileDescriptorCallbackC23568(long j, C1388 c1388) {
        this.f76354 = j;
        this.f76353 = c1388;
    }

    @Override // android.os.ProxyFileDescriptorCallback
    public final long onGetSize() {
        return this.f76354;
    }

    @Override // android.os.ProxyFileDescriptorCallback
    public final int onRead(long j, int i, byte[] bArr) throws ErrnoException {
        try {
            this.f76353.seek(j);
            return this.f76353.mo4867(0, i, bArr);
        } catch (IOException e) {
            throw new ErrnoException("onRead", OsConstants.EIO, e);
        }
    }

    @Override // android.os.ProxyFileDescriptorCallback
    public final void onRelease() {
        C19431.m44468(this.f76353);
    }
}
