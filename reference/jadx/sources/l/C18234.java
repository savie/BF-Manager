package l;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ᩳᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes4.dex */
public final class C18234 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC16036 f58212;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C20414 f58213;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ClassLoader f58214;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Iterator f58215;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it = this.f58215;
        if (this.f58212 != null) {
            return true;
        }
        if (it.hasNext()) {
            String str = (String) it.next();
            C20414 c20414 = this.f58213;
            InterfaceC16036 interfaceC16036 = null;
            try {
                try {
                    try {
                        try {
                            Class<?> clsLoadClass = this.f58214.loadClass(str);
                            m42381(clsLoadClass);
                            interfaceC16036 = (InterfaceC16036) clsLoadClass.getConstructor(null).newInstance(null);
                        } catch (ClassCastException unused) {
                            C5909 c5909 = C23879.f77204;
                            c20414.m48197(new C5909("compiler", "proc.processor.wrong.type", str));
                        }
                    } catch (ClassNotFoundException unused2) {
                        C5909 c59010 = C23879.f77204;
                        c20414.m48197(new C5909("compiler", "proc.processor.not.found", str));
                    }
                } catch (Exception unused3) {
                    C5909 c59011 = C23879.f77204;
                    c20414.m48197(new C5909("compiler", "proc.processor.cant.instantiate", str));
                }
                if (interfaceC16036 != null) {
                    this.f58212 = interfaceC16036;
                    return true;
                }
            } catch (Throwable th) {
                throw new C14002(th);
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            InterfaceC16036 interfaceC16036 = this.f58212;
            this.f58212 = null;
            return interfaceC16036;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42381(Class cls) {
        try {
            Method method = Class.class.getMethod("getModule", null);
            Object objInvoke = method.invoke(C18234.class, null);
            Object objInvoke2 = method.invoke(cls, null);
            Class<?> returnType = method.getReturnType();
            returnType.getMethod("addReads", returnType).invoke(objInvoke, objInvoke2);
        } catch (NoSuchMethodException unused) {
        } catch (Exception e) {
            throw new C7738(e);
        }
    }
}
