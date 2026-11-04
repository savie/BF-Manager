package l;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.֫ܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 195U */
/* JADX INFO: loaded from: classes3.dex */
public final class C2027 extends C25148 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C5756 f6751 = new C5756();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C2027 f6752;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Application f6753;

    public C2027(Application application, int i) {
        this.f6753 = application;
    }

    public C2027() {
        this(null, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2027(Application application) {
        this(application, 0);
        C15243.m36590(application, "application");
    }

    @Override // l.C25148, l.InterfaceC11721
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13213 mo7001(Class cls, C4264 c4264) {
        if (this.f6753 != null) {
            return mo7000(cls);
        }
        Application application = (Application) c4264.m54576().get(f6751);
        if (application != null) {
            return m6998(cls, application);
        }
        if (!C17535.class.isAssignableFrom(cls)) {
            return C12295.m30687(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    @Override // l.C25148, l.InterfaceC11721
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13213 mo7000(Class cls) {
        Application application = this.f6753;
        if (application == null) {
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
        return m6998(cls, application);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final AbstractC13213 m6998(Class cls, Application application) {
        if (!C17535.class.isAssignableFrom(cls)) {
            return C12295.m30687(cls);
        }
        try {
            AbstractC13213 abstractC13213 = (AbstractC13213) cls.getConstructor(Application.class).newInstance(application);
            C15243.m36586(abstractC13213);
            return abstractC13213;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(C24966.m55772(cls, "Cannot create an instance of "), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(C24966.m55772(cls, "Cannot create an instance of "), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(C24966.m55772(cls, "Cannot create an instance of "), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(C24966.m55772(cls, "Cannot create an instance of "), e4);
        }
    }
}
