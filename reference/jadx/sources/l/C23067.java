package l;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: MANZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23067 implements InterfaceC7284 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5204 f74941;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f74942;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20690 f74943;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Bundle f74944;

    public C23067(C20690 c20690, InterfaceC17422 interfaceC17422) {
        C13465.m32966(c20690, "savedStateRegistry");
        this.f74943 = c20690;
        this.f74941 = C22138.m49098(new C6838(interfaceC17422));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private final C15306 m51038() {
        return (C15306) this.f74941.getValue();
    }

    @Override // l.InterfaceC7284
    /* JADX INFO: renamed from: ۙ */
    public final Bundle mo8703() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f74944;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : m51038().m36648().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo8703 = ((C13895) entry.getValue()).m33732().mo8703();
            if (!C13465.m32965(bundleMo8703, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleMo8703);
            }
        }
        this.f74942 = false;
        return bundle;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51040() {
        if (this.f74942) {
            return;
        }
        Bundle bundleM46522 = this.f74943.m46522("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f74944;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM46522 != null) {
            bundle.putAll(bundleM46522);
        }
        this.f74944 = bundle;
        this.f74942 = true;
        m51038();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle m51039(String str) {
        m51040();
        Bundle bundle = this.f74944;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f74944;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f74944;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f74944 = null;
        }
        return bundle2;
    }
}
