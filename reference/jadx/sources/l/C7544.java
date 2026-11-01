package l;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.۟ܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V627 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7544 extends C20245 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC9662 f25042 = C10367.f35527;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C7544 f25043;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Application f25044;

    public C7544(Application application, int i) {
        this.f25044 = application;
    }

    public C7544() {
        this(null, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7544(Application application) {
        this(application, 0);
        C13465.m32966(application, "application");
    }

    @Override // l.C20245, l.InterfaceC20950
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC8956 mo4843(Class cls, C11966 c11966) {
        if (this.f25044 != null) {
            return mo4842(cls);
        }
        Application application = (Application) c11966.m9814().get(C10367.f35527);
        if (application != null) {
            return m20062(cls, application);
        }
        if (C18585.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.mo4842(cls);
    }

    @Override // l.C20245, l.InterfaceC20950
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC8956 mo4842(Class cls) {
        Application application = this.f25044;
        if (application == null) {
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
        return m20062(cls, application);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final AbstractC8956 m20062(Class cls, Application application) {
        if (C18585.class.isAssignableFrom(cls)) {
            try {
                AbstractC8956 abstractC8956 = (AbstractC8956) cls.getConstructor(Application.class).newInstance(application);
                C13465.m32967(abstractC8956, "{\n                try {\n…          }\n            }");
                return abstractC8956;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
        return super.mo4842(cls);
    }
}
