package l;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: l.᩶ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57CG */
/* JADX INFO: loaded from: classes4.dex */
public class ServiceC20243 extends Service {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractBinderC19537 f65679 = new BinderC16010(this);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Throwable f65680;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f65679;
    }
}
