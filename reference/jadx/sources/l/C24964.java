package l;

import android.os.Bundle;
import com.umeng.analytics.pro.d;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 16CX */
/* JADX INFO: loaded from: classes.dex */
public final class C24964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f80841;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Bundle f80842;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f80843;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1843 f80844;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C13029 f80845;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C12295 f80846 = new C12295();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f80848 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f80847 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55759(String str, InterfaceC19742 interfaceC19742) {
        C15243.m36590(interfaceC19742, d.M);
        synchronized (this.f80846) {
            if (this.f80848.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.f80848.put(str, interfaceC19742);
            C11471 c11471 = C11471.f36082;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55761(Bundle bundle) {
        C15243.m36590(bundle, "outBundle");
        Bundle bundleM6304 = C1826.m6304((C21914[]) Arrays.copyOf(new C21914[0], 0));
        Bundle bundle2 = this.f80842;
        if (bundle2 != null) {
            bundleM6304.putAll(bundle2);
        }
        synchronized (this.f80846) {
            for (Map.Entry entry : this.f80848.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleMo14860 = ((InterfaceC19742) entry.getValue()).mo14860();
                C15243.m36590(str, "key");
                bundleM6304.putBundle(str, bundleMo14860);
            }
            C11471 c11471 = C11471.f36082;
        }
        if (bundleM6304.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM6304);
    }

    public C24964(InterfaceC1843 interfaceC1843, C13029 c13029) {
        this.f80844 = interfaceC1843;
        this.f80845 = c13029;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m55762() {
        return this.f80847;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle m55756(String str) {
        if (!this.f80843) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.f80842;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM27503 = bundle.containsKey(str) ? C10791.m27503(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            this.f80842 = null;
        }
        return bundleM27503;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19742 m55757() {
        InterfaceC19742 interfaceC19742;
        synchronized (this.f80846) {
            Iterator it = this.f80848.entrySet().iterator();
            do {
                interfaceC19742 = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                InterfaceC19742 interfaceC19743 = (InterfaceC19742) entry.getValue();
                if (C15243.m36589((Object) str, (Object) "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    interfaceC19742 = interfaceC19743;
                }
            } while (interfaceC19742 == null);
        }
        return interfaceC19742;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m55760() {
        InterfaceC1843 interfaceC1843 = this.f80844;
        if (interfaceC1843.getLifecycle().mo23076() != EnumC2619.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f80841) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f80845.mo4064();
        interfaceC1843.getLifecycle().mo23077(new InterfaceC5252() { // from class: l.ۧۢ᩷
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                C24964.m55755(this.f36288, interfaceC11217, enumC9330);
            }
        });
        this.f80841 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55755(C24964 c24964, InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_START) {
            c24964.f80847 = true;
        } else if (enumC9330 == EnumC9330.ON_STOP) {
            c24964.f80847 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55758(Bundle bundle) {
        if (!this.f80841) {
            m55760();
        }
        InterfaceC1843 interfaceC1843 = this.f80844;
        if (interfaceC1843.getLifecycle().mo23076().m8762(EnumC2619.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + interfaceC1843.getLifecycle().mo23076()).toString());
        }
        if (this.f80843) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleM27503 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleM27503 = C10791.m27503(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        this.f80842 = bundleM27503;
        this.f80843 = true;
    }
}
