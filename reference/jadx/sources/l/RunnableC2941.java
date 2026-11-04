package l;

import android.app.Activity;
import android.os.Bundle;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import org.json.JSONException;

/* JADX INFO: renamed from: l.ۖ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2941 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13878 f9622;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f9623;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f9624;

    public RunnableC2941(C13878 c13878, Activity activity, Bundle bundle) {
        this.f9622 = c13878;
        this.f9624 = activity;
        this.f9623 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C14127.m34337(this.f9622, this.f9624, this.f9623);
        } catch (MalformedURLException | SocketTimeoutException | IOException | C7416 | C8907 | JSONException | Exception unused) {
        }
    }
}
