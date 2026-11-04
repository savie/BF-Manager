package l;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: MANZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22164 implements InterfaceC19742 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f71383;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15266 f71384;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Bundle f71385;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC0812 f71386;

    public C22164(C15266 c15266, InterfaceC3518 interfaceC3518) {
        C15243.m36590(c15266, "savedStateRegistry");
        this.f71384 = c15266;
        this.f71386 = C9015.m24070(new C19330(interfaceC3518, 1));
    }

    @Override // l.InterfaceC19742
    /* JADX INFO: renamed from: ۙ */
    public final Bundle mo14860() {
        Bundle bundleM6304 = C1826.m6304((C21914[]) Arrays.copyOf(new C21914[0], 0));
        Bundle bundle = this.f71385;
        if (bundle != null) {
            bundleM6304.putAll(bundle);
        }
        for (Map.Entry entry : ((C10975) this.f71386.getValue()).m27822().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleM30961 = C12467.m30961(((C10471) entry.getValue()).m26893().f66283);
            if (!bundleM30961.isEmpty()) {
                C15243.m36590(str, "key");
                bundleM6304.putBundle(str, bundleM30961);
            }
        }
        this.f71383 = false;
        return bundleM6304;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50128() {
        if (this.f71383) {
            return;
        }
        Bundle bundleM36619 = this.f71384.m36619("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleM6304 = C1826.m6304((C21914[]) Arrays.copyOf(new C21914[0], 0));
        Bundle bundle = this.f71385;
        if (bundle != null) {
            bundleM6304.putAll(bundle);
        }
        if (bundleM36619 != null) {
            bundleM6304.putAll(bundleM36619);
        }
        this.f71385 = bundleM6304;
        this.f71383 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle m50127(String str) {
        m50128();
        Bundle bundle = this.f71385;
        if (bundle == null || !bundle.containsKey(str)) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            bundle2 = C1826.m6304((C21914[]) Arrays.copyOf(new C21914[0], 0));
        }
        bundle.remove(str);
        if (bundle.isEmpty()) {
            this.f71385 = null;
        }
        return bundle2;
    }
}
