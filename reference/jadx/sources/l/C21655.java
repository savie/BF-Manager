package l;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: l.᩸ܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1GC */
/* JADX INFO: loaded from: classes5.dex */
public final class C21655 extends C0488 implements InterfaceC20950 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC3062 f70200;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Application f70201;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C20690 f70202;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7544 f70203;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Bundle f70204;

    public C21655(Application application, InterfaceC19985 interfaceC19985, Bundle bundle) {
        C7544 c7544;
        this.f70202 = interfaceC19985.getSavedStateRegistry();
        this.f70200 = interfaceC19985.getLifecycle();
        this.f70204 = bundle;
        this.f70201 = application;
        if (application == null) {
            c7544 = new C7544();
        } else {
            if (C7544.f25043 == null) {
                C7544.f25043 = new C7544(application);
            }
            c7544 = C7544.f25043;
            C13465.m32962(c7544);
        }
        this.f70203 = c7544;
    }

    @Override // l.InterfaceC20950
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC8956 mo4843(Class cls, C11966 c11966) {
        int i = C20245.f65683;
        String str = (String) c11966.m9814().get(C16012.f51830);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (c11966.m9814().get(C4015.f14871) == null || c11966.m9814().get(C4015.f14870) == null) {
            if (this.f70200 != null) {
                return m48361(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        InterfaceC9662 interfaceC9662 = C7544.f25042;
        Application application = (Application) c11966.m9814().get(C10367.f35527);
        boolean zIsAssignableFrom = C18585.class.isAssignableFrom(cls);
        Constructor constructorM42192 = (!zIsAssignableFrom || application == null) ? C18127.m42192(cls, C18127.f57954) : C18127.m42192(cls, C18127.f57953);
        if (constructorM42192 == null) {
            return this.f70203.mo4843(cls, c11966);
        }
        return (!zIsAssignableFrom || application == null) ? C18127.m42194(cls, constructorM42192, C4015.m11524(c11966)) : C18127.m42194(cls, constructorM42192, application, C4015.m11524(c11966));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8956 m48361(Class cls, String str) {
        AbstractC3062 abstractC3062 = this.f70200;
        if (abstractC3062 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = C18585.class.isAssignableFrom(cls);
        Application application = this.f70201;
        Constructor constructorM42192 = (!zIsAssignableFrom || application == null) ? C18127.m42192(cls, C18127.f57954) : C18127.m42192(cls, C18127.f57953);
        if (constructorM42192 != null) {
            C20690 c20690 = this.f70202;
            C13465.m32962(c20690);
            C2604 c2604M16102 = C5885.m16102(c20690, abstractC3062, str, this.f70204);
            AbstractC8956 abstractC8956M42194 = (!zIsAssignableFrom || application == null) ? C18127.m42194(cls, constructorM42192, c2604M16102.m8078()) : C18127.m42194(cls, constructorM42192, application, c2604M16102.m8078());
            abstractC8956M42194.m23252(c2604M16102);
            return abstractC8956M42194;
        }
        if (application != null) {
            return this.f70203.mo4842(cls);
        }
        if (C20245.f65684 == null) {
            C20245.f65684 = new C20245();
        }
        C20245 c20245 = C20245.f65684;
        C13465.m32962(c20245);
        return c20245.mo4842(cls);
    }

    @Override // l.InterfaceC20950
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC8956 mo4842(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return m48361(cls, canonicalName);
    }

    @Override // l.C0488
    /* JADX INFO: renamed from: ۙ */
    public final void mo2365(AbstractC8956 abstractC8956) {
        AbstractC3062 abstractC3062 = this.f70200;
        if (abstractC3062 != null) {
            C20690 c20690 = this.f70202;
            C13465.m32962(c20690);
            C5885.m16104(abstractC8956, c20690, abstractC3062);
        }
    }
}
