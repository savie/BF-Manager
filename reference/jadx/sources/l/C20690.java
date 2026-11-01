package l;

import android.os.Bundle;
import com.umeng.analytics.pro.d;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q22N */
/* JADX INFO: loaded from: classes4.dex */
public final class C20690 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f67284;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f67285;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C19279 f67286;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Bundle f67289;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13685 f67288 = new C13685();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f67287 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46527() {
        if (!this.f67287) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C19279 c19279 = this.f67286;
        if (c19279 == null) {
            c19279 = new C19279(this);
        }
        this.f67286 = c19279;
        try {
            C12236.class.getDeclaredConstructor(null);
            C19279 c192710 = this.f67286;
            if (c192710 != null) {
                c192710.m44250(C12236.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C12236.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46525(String str, InterfaceC7284 interfaceC7284) {
        C13465.m32966(interfaceC7284, d.M);
        if (((InterfaceC7284) this.f67288.mo28103(str, interfaceC7284)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46528(Bundle bundle) {
        C13465.m32966(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f67289;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C9761 c9761M33392 = this.f67288.m33392();
        while (c9761M33392.hasNext()) {
            Map.Entry entry = (Map.Entry) c9761M33392.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC7284) entry.getValue()).mo8703());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle m46522(String str) {
        if (!this.f67284) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f67289;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f67289;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f67289;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f67289 = null;
        return bundle2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7284 m46523() {
        for (Map.Entry entry : this.f67288) {
            C13465.m32967(entry, "components");
            String str = (String) entry.getKey();
            InterfaceC7284 interfaceC7284 = (InterfaceC7284) entry.getValue();
            if (C13465.m32965((Object) str, (Object) "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return interfaceC7284;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46526(AbstractC3062 abstractC3062) {
        if (this.f67285) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        abstractC3062.mo9171(new C11275(1, this));
        this.f67285 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46521(C20690 c20690, InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        if (enumC1651 == EnumC1651.ON_START) {
            c20690.f67287 = true;
        } else if (enumC1651 == EnumC1651.ON_STOP) {
            c20690.f67287 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46524(Bundle bundle) {
        if (!this.f67285) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f67284) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f67289 = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f67284 = true;
    }
}
