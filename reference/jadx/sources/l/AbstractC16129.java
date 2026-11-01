package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܺᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D9PY */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16129 extends AbstractC18079 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static ConcurrentMapC13783 f52119 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f52120 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22937 f52121 = C22937.m50766();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Object m38184();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m38186() {
        return (this.f52120 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m38185() {
        this.f52120 &= Integer.MAX_VALUE;
    }

    @Override // l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        EnumC7662 enumC7662 = EnumC7662.GET_MEMOIZED_IS_INITIALIZED;
        return (InterfaceC6271) m38184();
    }

    @Override // l.InterfaceC15445, l.InterfaceC18266
    public InterfaceC23206 getDefaultInstanceForType() {
        EnumC7662 enumC7662 = EnumC7662.GET_MEMOIZED_IS_INITIALIZED;
        return (AbstractC16129) m38184();
    }

    @Override // l.InterfaceC23206
    public InterfaceC6977 newBuilderForType() {
        EnumC7662 enumC7662 = EnumC7662.GET_MEMOIZED_IS_INITIALIZED;
        return (AbstractC8368) m38184();
    }

    public final String toString() {
        return C21794.m48551(this, super.toString());
    }

    public final int hashCode() {
        if (m38186()) {
            C14739 c14739M35321 = C14739.m35321();
            c14739M35321.getClass();
            return c14739M35321.m35322(getClass()).mo18052(this);
        }
        if (this.memoizedHashCode == 0) {
            C14739 c14739M35322 = C14739.m35321();
            c14739M35322.getClass();
            this.memoizedHashCode = c14739M35322.m35322(getClass()).mo18052(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C14739 c14739M35321 = C14739.m35321();
        c14739M35321.getClass();
        return c14739M35321.m35322(getClass()).mo18059(this, (AbstractC16129) obj);
    }

    @Override // l.InterfaceC23206
    public final AbstractC8368 toBuilder() {
        EnumC7662 enumC7662 = EnumC7662.GET_MEMOIZED_IS_INITIALIZED;
        ((AbstractC8368) m38184()).getClass();
        throw null;
    }

    @Override // l.AbstractC18079
    public final int getMemoizedSerializedSize() {
        return this.f52120 & Integer.MAX_VALUE;
    }

    @Override // l.AbstractC18079
    public final void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            throw new IllegalStateException(C8479.m22141(i, "serialized size must be non-negative, was "));
        }
        this.f52120 = (i & Integer.MAX_VALUE) | (this.f52120 & Integer.MIN_VALUE);
    }

    @Override // l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        C14739 c14739M35321 = C14739.m35321();
        c14739M35321.getClass();
        c14739M35321.m35322(getClass()).mo18057((Object) this, (InterfaceC12976) C0876.m3509(abstractC22044));
    }

    @Override // l.AbstractC18079
    public final int getSerializedSize(InterfaceC6667 interfaceC6667) {
        int iMo18053;
        int iMo18054;
        if (m38186()) {
            if (interfaceC6667 == null) {
                C14739 c14739M35321 = C14739.m35321();
                c14739M35321.getClass();
                iMo18054 = c14739M35321.m35322(getClass()).mo18053((AbstractC18079) this);
            } else {
                iMo18054 = interfaceC6667.mo18053((AbstractC18079) this);
            }
            if (iMo18054 >= 0) {
                return iMo18054;
            }
            throw new IllegalStateException(C8479.m22141(iMo18054, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (interfaceC6667 == null) {
            C14739 c14739M35322 = C14739.m35321();
            c14739M35322.getClass();
            iMo18053 = c14739M35322.m35322(getClass()).mo18053((AbstractC18079) this);
        } else {
            iMo18053 = interfaceC6667.mo18053((AbstractC18079) this);
        }
        setMemoizedSerializedSize(iMo18053);
        return iMo18053;
    }

    @Override // l.InterfaceC23206
    public final int getSerializedSize() {
        return getSerializedSize(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC16129 m38183(Class cls) {
        ConcurrentMapC13783 concurrentMapC13783 = f52119;
        AbstractC16129 abstractC16129 = (AbstractC16129) concurrentMapC13783.get(cls);
        if (abstractC16129 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC16129 = (AbstractC16129) concurrentMapC13783.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC16129 != null) {
            return abstractC16129;
        }
        AbstractC16129 abstractC161210 = (AbstractC16129) C15882.m37770(cls);
        abstractC161210.getClass();
        EnumC7662 enumC7662 = EnumC7662.GET_MEMOIZED_IS_INITIALIZED;
        AbstractC16129 abstractC161211 = (AbstractC16129) abstractC161210.m38184();
        if (abstractC161211 == null) {
            throw new IllegalStateException();
        }
        concurrentMapC13783.put(cls, abstractC161211);
        return abstractC161211;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m38182(Method method, AbstractC16129 abstractC16129, Object... objArr) {
        try {
            return method.invoke(abstractC16129, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    @Override // l.InterfaceC15445
    public final boolean isInitialized() {
        EnumC7662 enumC7662 = EnumC7662.GET_MEMOIZED_IS_INITIALIZED;
        byte bByteValue = ((Byte) m38184()).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C14739 c14739M35321 = C14739.m35321();
        c14739M35321.getClass();
        boolean zMo18060 = c14739M35321.m35322(getClass()).mo18060(this);
        m38184();
        return zMo18060;
    }
}
