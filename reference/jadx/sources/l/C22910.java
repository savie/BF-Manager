package l;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: l.᩸ܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6EA */
/* JADX INFO: loaded from: classes.dex */
public final class C22910 extends C16942 implements InterfaceC11721 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Application f74449;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2027 f74450;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C15266 f74451;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Bundle f74452;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC8585 f74453;

    public C22910(Application application, InterfaceC1843 interfaceC1843, Bundle bundle) {
        C2027 c2027;
        this.f74451 = interfaceC1843.getSavedStateRegistry();
        this.f74453 = interfaceC1843.getLifecycle();
        this.f74452 = bundle;
        this.f74449 = application;
        if (application == null) {
            c2027 = new C2027();
        } else {
            if (C2027.f6752 == null) {
                C2027.f6752 = new C2027(application);
            }
            c2027 = C2027.f6752;
            C15243.m36586(c2027);
        }
        this.f74450 = c2027;
    }

    @Override // l.InterfaceC11721
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC13213 mo9823(C13512 c13512, C4264 c4264) {
        return mo7001(C4560.m14318(c13512), c4264);
    }

    @Override // l.InterfaceC11721
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC13213 mo7001(Class cls, C4264 c4264) {
        String str = (String) c4264.m54576().get(C16196.f52576);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (c4264.m54576().get(C5010.f17389) == null || c4264.m54576().get(C5010.f17388) == null) {
            if (this.f74453 != null) {
                return m51661(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) c4264.m54576().get(C2027.f6751);
        boolean zIsAssignableFrom = C17535.class.isAssignableFrom(cls);
        Constructor constructorM45850 = (!zIsAssignableFrom || application == null) ? C19926.m45850(cls, C19926.f64089) : C19926.m45850(cls, C19926.f64088);
        if (constructorM45850 == null) {
            return this.f74450.mo7001(cls, c4264);
        }
        return (!zIsAssignableFrom || application == null) ? C19926.m45852(cls, constructorM45850, C5010.m15236(c4264)) : C19926.m45852(cls, constructorM45850, application, C5010.m15236(c4264));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13213 m51661(Class cls, String str) {
        AbstractC8585 abstractC8585 = this.f74453;
        if (abstractC8585 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = C17535.class.isAssignableFrom(cls);
        Application application = this.f74449;
        Constructor constructorM45850 = (!zIsAssignableFrom || application == null) ? C19926.m45850(cls, C19926.f64089) : C19926.m45850(cls, C19926.f64088);
        if (constructorM45850 == null) {
            if (application == null) {
                if (C25148.f81284 == null) {
                    C25148.f81284 = new C25148();
                }
                C15243.m36586(C25148.f81284);
                return C12295.m30687(cls);
            }
            return this.f74450.mo7000(cls);
        }
        C15266 c15266 = this.f74451;
        C15243.m36586(c15266);
        C9725 c9725M21363 = C7840.m21363(c15266, abstractC8585, str, this.f74452);
        AbstractC13213 abstractC13213M45852 = (!zIsAssignableFrom || application == null) ? C19926.m45852(cls, constructorM45850, c9725M21363.m25315()) : C19926.m45852(cls, constructorM45850, application, c9725M21363.m25315());
        abstractC13213M45852.m32723(c9725M21363);
        return abstractC13213M45852;
    }

    @Override // l.InterfaceC11721
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC13213 mo7000(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return m51661(cls, canonicalName);
    }

    @Override // l.C16942
    /* JADX INFO: renamed from: ۙ */
    public final void mo39918(AbstractC13213 abstractC13213) {
        AbstractC8585 abstractC8585 = this.f74453;
        if (abstractC8585 != null) {
            C15266 c15266 = this.f74451;
            C15243.m36586(c15266);
            C7840.m21365(abstractC13213, c15266, abstractC8585);
        }
    }
}
