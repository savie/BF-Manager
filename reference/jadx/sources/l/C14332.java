package l;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܰۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes4.dex */
public final class C14332 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ClassLoader f45208;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7312 f45209;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC8540 f45210;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Iterator f45211;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it = this.f45211;
        if (this.f45210 != null) {
            return true;
        }
        if (it.hasNext()) {
            String str = (String) it.next();
            C7312 c7312 = this.f45209;
            InterfaceC8540 interfaceC8540 = null;
            try {
                try {
                    try {
                        try {
                            Class<?> clsLoadClass = this.f45208.loadClass(str);
                            m34756(clsLoadClass);
                            interfaceC8540 = (InterfaceC8540) clsLoadClass.getConstructor(null).newInstance(null);
                        } catch (ClassCastException unused) {
                            C11040 c11040 = C22843.f74058;
                            c7312.m34525(new C11040("compiler", "proc.processor.wrong.type", str));
                        }
                    } catch (ClassNotFoundException unused2) {
                        C11040 c11041 = C22843.f74058;
                        c7312.m34525(new C11040("compiler", "proc.processor.not.found", str));
                    }
                } catch (Exception unused3) {
                    C11040 c11042 = C22843.f74058;
                    c7312.m34525(new C11040("compiler", "proc.processor.cant.instantiate", str));
                }
                if (interfaceC8540 != null) {
                    this.f45210 = interfaceC8540;
                    return true;
                }
            } catch (Throwable th) {
                throw new C11349(th);
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            InterfaceC8540 interfaceC8540 = this.f45210;
            this.f45210 = null;
            return interfaceC8540;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34756(Class cls) {
        try {
            Method method = Class.class.getMethod("getModule", null);
            Object objInvoke = method.invoke(C14332.class, null);
            Object objInvoke2 = method.invoke(cls, null);
            Class<?> returnType = method.getReturnType();
            returnType.getMethod("addReads", returnType).invoke(objInvoke, objInvoke2);
        } catch (NoSuchMethodException unused) {
        } catch (Exception e) {
            throw new C8449(e);
        }
    }
}
