package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩸ۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9PY */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC22701 extends AbstractC9427 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static ConcurrentMapC17249 f73689 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f73690 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18906 f73691 = C18906.m43884();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Object m51177();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m51179() {
        return (this.f73690 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m51178() {
        this.f73690 &= Integer.MAX_VALUE;
    }

    @Override // l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        EnumC21955 enumC21955 = EnumC21955.GET_MEMOIZED_IS_INITIALIZED;
        return (InterfaceC11490) m51177();
    }

    @Override // l.InterfaceC9824
    public InterfaceC18775 getDefaultInstanceForType() {
        EnumC21955 enumC21955 = EnumC21955.GET_MEMOIZED_IS_INITIALIZED;
        return (AbstractC22701) m51177();
    }

    @Override // l.InterfaceC18775
    public InterfaceC7588 newBuilderForType() {
        EnumC21955 enumC21955 = EnumC21955.GET_MEMOIZED_IS_INITIALIZED;
        return (AbstractC8290) m51177();
    }

    public final String toString() {
        return C0876.m3567(this, super.toString());
    }

    public final int hashCode() {
        if (m51179()) {
            C17457 c17457M40958 = C17457.m40958();
            c17457M40958.getClass();
            return c17457M40958.m40959(getClass()).mo21138(this);
        }
        if (this.memoizedHashCode == 0) {
            C17457 c17457M40959 = C17457.m40958();
            c17457M40959.getClass();
            this.memoizedHashCode = c17457M40959.m40959(getClass()).mo21138(this);
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
        C17457 c17457M40958 = C17457.m40958();
        c17457M40958.getClass();
        return c17457M40958.m40959(getClass()).mo21144(this, (AbstractC22701) obj);
    }

    @Override // l.InterfaceC18775
    public final AbstractC8290 toBuilder() {
        EnumC21955 enumC21955 = EnumC21955.GET_MEMOIZED_IS_INITIALIZED;
        ((AbstractC8290) m51177()).getClass();
        throw null;
    }

    @Override // l.AbstractC9427
    public final int getMemoizedSerializedSize() {
        return this.f73690 & Integer.MAX_VALUE;
    }

    @Override // l.AbstractC9427
    public final void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            throw new IllegalStateException(C13645.m33382(i, "serialized size must be non-negative, was "));
        }
        this.f73690 = (i & Integer.MAX_VALUE) | (this.f73690 & Integer.MIN_VALUE);
    }

    @Override // l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        C17457 c17457M40958 = C17457.m40958();
        c17457M40958.getClass();
        c17457M40958.m40959(getClass()).mo21143((Object) this, (InterfaceC18356) C21560.m48988(abstractC14846));
    }

    @Override // l.AbstractC9427
    public final int getSerializedSize(InterfaceC7762 interfaceC7762) {
        int iMo21137;
        int iMo21138;
        if (m51179()) {
            if (interfaceC7762 == null) {
                C17457 c17457M40958 = C17457.m40958();
                c17457M40958.getClass();
                iMo21138 = c17457M40958.m40959(getClass()).mo21137((AbstractC9427) this);
            } else {
                iMo21138 = interfaceC7762.mo21137((AbstractC9427) this);
            }
            if (iMo21138 >= 0) {
                return iMo21138;
            }
            throw new IllegalStateException(C13645.m33382(iMo21138, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (interfaceC7762 == null) {
            C17457 c17457M40959 = C17457.m40958();
            c17457M40959.getClass();
            iMo21137 = c17457M40959.m40959(getClass()).mo21137((AbstractC9427) this);
        } else {
            iMo21137 = interfaceC7762.mo21137((AbstractC9427) this);
        }
        setMemoizedSerializedSize(iMo21137);
        return iMo21137;
    }

    @Override // l.InterfaceC18775
    public final int getSerializedSize() {
        return getSerializedSize(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22701 m51176(Class cls) {
        ConcurrentMapC17249 concurrentMapC17249 = f73689;
        AbstractC22701 abstractC22701 = (AbstractC22701) concurrentMapC17249.get(cls);
        if (abstractC22701 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC22701 = (AbstractC22701) concurrentMapC17249.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC22701 != null) {
            return abstractC22701;
        }
        AbstractC22701 abstractC22702 = (AbstractC22701) C22832.m51501(cls);
        abstractC22702.getClass();
        EnumC21955 enumC21955 = EnumC21955.GET_MEMOIZED_IS_INITIALIZED;
        AbstractC22701 abstractC22703 = (AbstractC22701) abstractC22702.m51177();
        if (abstractC22703 == null) {
            throw new IllegalStateException();
        }
        concurrentMapC17249.put(cls, abstractC22703);
        return abstractC22703;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m51175(Method method, AbstractC22701 abstractC22701, Object... objArr) {
        try {
            return method.invoke(abstractC22701, objArr);
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

    @Override // l.InterfaceC9824
    public final boolean isInitialized() {
        EnumC21955 enumC21955 = EnumC21955.GET_MEMOIZED_IS_INITIALIZED;
        byte bByteValue = ((Byte) m51177()).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C17457 c17457M40958 = C17457.m40958();
        c17457M40958.getClass();
        boolean zMo21145 = c17457M40958.m40959(getClass()).mo21145(this);
        m51177();
        return zMo21145;
    }
}
