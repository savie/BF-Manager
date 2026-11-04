package l;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۛܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC6450 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21366 f21692;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f21693;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18382 f21694;

    public /* synthetic */ CallableC6450(C21366 c21366, C18382 c18382, Bundle bundle) {
        this.f21692 = c21366;
        this.f21694 = c18382;
        this.f21693 = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C7941 c7941 = this.f21692.f68053;
        C17636 c17636 = c7941.f26392;
        Bundle bundle = c7941.f23990;
        C18382 c18382 = this.f21694;
        if (c17636 == c18382.f59887) {
            bundle.clear();
            bundle.putAll(this.f21693);
            c7941.f26376 = null;
            c18382.f59887.f57984.m18751(bundle);
            c7941.m19928();
        }
        return null;
    }
}
