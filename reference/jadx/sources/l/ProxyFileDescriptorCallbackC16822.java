package l;

import android.os.ProxyFileDescriptorCallback;
import android.system.ErrnoException;
import android.system.OsConstants;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X13G */
/* JADX INFO: loaded from: classes4.dex */
public final class ProxyFileDescriptorCallbackC16822 extends ProxyFileDescriptorCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13961 f54279;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f54280;

    public ProxyFileDescriptorCallbackC16822(long j, C13961 c13961) {
        this.f54280 = j;
        this.f54279 = c13961;
    }

    @Override // android.os.ProxyFileDescriptorCallback
    public final long onGetSize() {
        return this.f54280;
    }

    @Override // android.os.ProxyFileDescriptorCallback
    public final int onRead(long j, int i, byte[] bArr) throws ErrnoException {
        try {
            this.f54279.seek(j);
            return this.f54279.mo34032(0, i, bArr);
        } catch (IOException e) {
            throw new ErrnoException("onRead", OsConstants.EIO, e);
        }
    }

    @Override // android.os.ProxyFileDescriptorCallback
    public final void onRelease() {
        C20244.m46520(this.f54279);
    }
}
