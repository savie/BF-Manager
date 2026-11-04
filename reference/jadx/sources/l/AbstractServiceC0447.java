package l;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88LY */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractServiceC0447 extends Service {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final HashMap f2027 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18346 f2028;

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract C20584 m2269();

    @Override // android.app.Service
    public final void onCreate() {
        C18346 c18346 = (C18346) f2027.get(getClass());
        if (c18346 == null) {
            m2269();
            throw null;
        }
        this.f2028 = c18346;
        c18346.m42801(this);
        throw null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action;
        String stringExtra;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            if (!intent.getBooleanExtra("foreground", false)) {
                "androidx.media3.exoplayer.downloadService.action.RESTART".equals(action);
            }
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        switch (action) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (!intent.hasExtra("stop_reason")) {
                    C1896.m6515("Ignored SET_STOP_REASON: Missing stop_reason extra");
                    throw null;
                }
                intent.getIntExtra("stop_reason", 0);
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra == null) {
                    C1896.m6515("Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    throw null;
                }
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                if (((C21330) intent.getParcelableExtra("download_request")) == null) {
                    C1896.m6515("Ignored ADD_DOWNLOAD: Missing download_request extra");
                    throw null;
                }
                intent.getIntExtra("stop_reason", 0);
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                if (((C1193) intent.getParcelableExtra("requirements")) == null) {
                    C1896.m6515("Ignored SET_REQUIREMENTS: Missing requirements extra");
                    throw null;
                }
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                throw null;
            default:
                C1896.m6515("Ignored unrecognized action: ".concat(action));
                throw null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f2028.m42802(this);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
