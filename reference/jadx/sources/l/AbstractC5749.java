package l;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۛ֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A21P */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5749 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21445 f19545;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21445 f19546;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21445 f19547;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public abstract Parcelable mo15814();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public abstract byte[] mo15815();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo15822();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo15823(Parcelable parcelable);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo15824(CharSequence charSequence);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo15825(String str);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo15826(boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo15827(int i);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract CharSequence mo15830();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract void mo15831(int i);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo15834();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public abstract String mo15835();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC5749 mo15836();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract void mo15837(int i);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract void mo15844(byte[] bArr);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public abstract int mo15845();

    public AbstractC5749(C21445 c21445, C21445 c21446, C21445 c21447) {
        this.f19547 = c21445;
        this.f19546 = c21446;
        this.f19545 = c21447;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15841(int i, boolean z) {
        mo15837(i);
        mo15826(z);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m15833(byte[] bArr) {
        mo15837(2);
        mo15844(bArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15839(int i, CharSequence charSequence) {
        mo15837(i);
        mo15824(charSequence);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15838(int i, int i2) {
        mo15837(i2);
        mo15831(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private Method m15813(String str) throws NoSuchMethodException {
        C21445 c21445 = this.f19547;
        Method method = (Method) c21445.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC5749.class.getClassLoader()).getDeclaredMethod("read", AbstractC5749.class);
        c21445.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15840(int i, String str) {
        mo15837(i);
        mo15825(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15842(Parcelable parcelable, int i) {
        mo15837(i);
        mo15823(parcelable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15828(int i, boolean z) {
        return !mo15827(i) ? z : mo15834();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15817(int i, int i2) {
        return !mo15827(i2) ? i : mo15845();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m15820(int i, String str) {
        return !mo15827(i) ? str : mo15835();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m15829(byte[] bArr) {
        return !mo15827(2) ? bArr : mo15815();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Parcelable m15818(Parcelable parcelable, int i) {
        return !mo15827(i) ? parcelable : mo15814();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m15819(int i, CharSequence charSequence) {
        return !mo15827(i) ? charSequence : mo15830();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15843(InterfaceC23389 interfaceC23389) {
        mo15837(1);
        m15832(interfaceC23389);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m15832(InterfaceC23389 interfaceC23389) {
        if (interfaceC23389 == null) {
            mo15825((String) null);
            return;
        }
        try {
            mo15825(m15811(interfaceC23389.getClass()).getName());
            AbstractC5749 abstractC5749Mo15836 = mo15836();
            try {
                m15812(interfaceC23389.getClass()).invoke(null, interfaceC23389, abstractC5749Mo15836);
                abstractC5749Mo15836.mo15822();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC23389.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23389 m15821(InterfaceC23389 interfaceC23389) {
        return !mo15827(1) ? interfaceC23389 : m15816();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23389 m15816() {
        String strMo15835 = mo15835();
        if (strMo15835 == null) {
            return null;
        }
        try {
            return (InterfaceC23389) m15813(strMo15835).invoke(null, mo15836());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private Method m15812(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C21445 c21445 = this.f19546;
        Method method = (Method) c21445.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsM15811 = m15811(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM15811.getDeclaredMethod("write", cls, AbstractC5749.class);
        c21445.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Class m15811(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C21445 c21445 = this.f19545;
        Class cls2 = (Class) c21445.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c21445.put(cls.getName(), cls3);
        return cls3;
    }
}
