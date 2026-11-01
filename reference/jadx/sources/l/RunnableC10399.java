package l;

import android.app.Activity;
import android.os.Bundle;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import org.json.JSONException;

/* JADX INFO: renamed from: l.ۤܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10399 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f35574;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15796 f35575;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f35576;

    public RunnableC10399(C15796 c15796, Activity activity, Bundle bundle) {
        this.f35575 = c15796;
        this.f35576 = activity;
        this.f35574 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C16044.m38037(this.f35575, this.f35576, this.f35574);
        } catch (MalformedURLException | SocketTimeoutException | IOException | C7576 | C20982 | JSONException | Exception unused) {
        }
    }
}
