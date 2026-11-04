package l;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۗ۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A21P */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3290 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14307 f10713;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14307 f10714;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14307 f10715;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo10843();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo10844(Parcelable parcelable);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo10845(CharSequence charSequence);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo10846(String str);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo10847(boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo10848(int i);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract String mo10851();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract void mo10852(int i);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo10855();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public abstract Parcelable mo10856();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract int mo10857();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public abstract CharSequence mo10858();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract AbstractC3290 mo10859();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo10860(int i);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo10867(byte[] bArr);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract byte[] mo10868();

    public AbstractC3290(C14307 c14307, C14307 c14308, C14307 c14309) {
        this.f10715 = c14307;
        this.f10714 = c14308;
        this.f10713 = c14309;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10864(int i, boolean z) {
        mo10860(i);
        mo10847(z);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m10854(byte[] bArr) {
        mo10860(2);
        mo10867(bArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10862(int i, CharSequence charSequence) {
        mo10860(i);
        mo10845(charSequence);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10861(int i, int i2) {
        mo10860(i2);
        mo10852(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10863(int i, String str) {
        mo10860(i);
        mo10846(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10865(Parcelable parcelable, int i) {
        mo10860(i);
        mo10844(parcelable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10849(int i, boolean z) {
        return !mo10848(i) ? z : mo10855();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10838(int i, int i2) {
        return !mo10848(i2) ? i : mo10857();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m10841(int i, String str) {
        return !mo10848(i) ? str : mo10851();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m10850(byte[] bArr) {
        return !mo10848(2) ? bArr : mo10868();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Parcelable m10839(Parcelable parcelable, int i) {
        return !mo10848(i) ? parcelable : mo10856();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m10840(int i, CharSequence charSequence) {
        return !mo10848(i) ? charSequence : mo10858();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10866(InterfaceC12239 interfaceC12239) {
        mo10860(1);
        m10853(interfaceC12239);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m10853(InterfaceC12239 interfaceC12239) {
        if (interfaceC12239 == null) {
            mo10846((String) null);
            return;
        }
        try {
            mo10846(m10834(interfaceC12239.getClass()).getName());
            AbstractC3290 abstractC3290Mo10859 = mo10859();
            try {
                m10835(interfaceC12239.getClass()).invoke(null, interfaceC12239, abstractC3290Mo10859);
                abstractC3290Mo10859.mo10843();
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
            throw new RuntimeException(interfaceC12239.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12239 m10842(InterfaceC12239 interfaceC12239) {
        return !mo10848(1) ? interfaceC12239 : m10837();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12239 m10837() {
        String strMo10851 = mo10851();
        if (strMo10851 == null) {
            return null;
        }
        try {
            return (InterfaceC12239) m10836(strMo10851).invoke(null, mo10859());
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Method m10836(String str) throws NoSuchMethodException {
        C14307 c14307 = this.f10715;
        Method method = (Method) c14307.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC3290.class.getClassLoader()).getDeclaredMethod("read", AbstractC3290.class);
        c14307.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Method m10835(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C14307 c14307 = this.f10714;
        Method method = (Method) c14307.get(name);
        if (method != null) {
            return method;
        }
        Class clsM10834 = m10834(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM10834.getDeclaredMethod("write", cls, AbstractC3290.class);
        c14307.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Class m10834(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C14307 c14307 = this.f10713;
        Class cls2 = (Class) c14307.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c14307.put(cls.getName(), cls3);
        return cls3;
    }
}
