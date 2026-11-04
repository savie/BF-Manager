package l;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: l.᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: MB1I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC21898 extends Service {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractBinderC6017 f70740 = new BinderC4744(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void m49588();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f70740;
    }
}
