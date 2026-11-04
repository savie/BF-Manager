package l;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: l.᩺ܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 57CG */
/* JADX INFO: loaded from: classes.dex */
public class ServiceC24416 extends Service {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractBinderC16210 f79282 = new BinderC6516(this);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Throwable f79283;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f79282;
    }
}
