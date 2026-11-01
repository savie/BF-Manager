package l;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: l.᩺᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1KJ */
/* JADX INFO: loaded from: classes.dex */
public class ServiceC23297 extends Service implements InterfaceC1423 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C8250 f75547 = new C8250(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C13465.m32966(intent, "intent");
        this.f75547.m21644();
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.f75547.m21643();
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f75547.m21642();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f75547.m21640();
        super.onDestroy();
    }

    @Override // l.InterfaceC1423
    public final AbstractC3062 getLifecycle() {
        return this.f75547.m21641();
    }
}
