package l;

import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۙۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C4402 extends C11023 implements InterfaceC9612, InterfaceC4464 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient C19366 f15670;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21605 f15671;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient C9903 f15672;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0624 f15673;

    @Override // java.util.Map, l.InterfaceC4464
    public final void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object compute(Object obj, BiFunction biFunction) {
        Object objCompute;
        Integer num = (Integer) obj;
        synchronized (this.f37474) {
            objCompute = C9735.compute(this.f15671, num, biFunction);
        }
        return objCompute;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objComputeIfAbsent;
        Integer num = (Integer) obj;
        synchronized (this.f37474) {
            objComputeIfAbsent = C9735.computeIfAbsent(this.f15671, num, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object objComputeIfPresent;
        Integer num = (Integer) obj;
        synchronized (this.f37474) {
            objComputeIfPresent = C9735.computeIfPresent(this.f15671, num, biFunction);
        }
        return objComputeIfPresent;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object objMerge;
        Integer num = (Integer) obj;
        synchronized (this.f37474) {
            objMerge = C9735.merge(this.f15671, num, obj2, biFunction);
        }
        return objMerge;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objPutIfAbsent;
        Integer num = (Integer) obj;
        synchronized (this.f37474) {
            objPutIfAbsent = C9735.putIfAbsent(this.f15671, num, obj2);
        }
        return objPutIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        Integer num = (Integer) obj;
        synchronized (this.f37474) {
            objReplace = C9735.replace(this.f15671, num, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        Integer num = (Integer) obj;
        synchronized (this.f37474) {
            zReplace = C9735.replace(this.f15671, num, obj2, obj3);
        }
        return zReplace;
    }

    public C4402(C21605 c21605) {
        super(c21605);
        this.f15671 = c21605;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f37474) {
            zContainsValue = this.f15671.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f37474) {
            this.f15671.putAll(map);
        }
    }

    @Override // l.InterfaceC9612, l.InterfaceC4485
    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC18660 mo8949() {
        C19366 c19366;
        synchronized (this.f37474) {
            if (this.f15670 == null) {
                this.f15670 = C8783.m22855(this.f15671.mo8949(), this.f37474);
            }
            c19366 = this.f15670;
        }
        return c19366;
    }

    @Override // java.util.Map
    @Deprecated
    public final Set entrySet() {
        return mo8949();
    }

    @Override // l.InterfaceC9612, java.util.Map
    @Deprecated
    public final InterfaceC18660 entrySet() {
        return mo8949();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C9903 c9903;
        synchronized (this.f37474) {
            if (this.f15672 == null) {
                InterfaceC4733 interfaceC4733KeySet = this.f15671.keySet();
                C11023 c11023 = this.f37474;
                C2140 c2140 = C3551.f13068;
                this.f15672 = new C9903(interfaceC4733KeySet, c11023);
            }
            c9903 = this.f15672;
        }
        return c9903;
    }

    @Override // java.util.Map
    public final Collection values() {
        InterfaceC0624 interfaceC0624;
        synchronized (this.f37474) {
            if (this.f15673 == null) {
                this.f15673 = C17558.m40828(this.f15671.values(), this.f37474);
            }
            interfaceC0624 = this.f15673;
        }
        return interfaceC0624;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f37474) {
            zIsEmpty = this.f15671.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // l.C11023, java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f37474) {
            iHashCode = this.f15671.hashCode();
        }
        return iHashCode;
    }

    @Override // l.C11023, java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f37474) {
            zEquals = this.f15671.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f37474) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f37474) {
            C9735.replaceAll(this.f15671, biFunction);
        }
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj$default$getOrDefault;
        synchronized (this.f37474) {
            C21605 c21605 = this.f15671;
            c21605.getClass();
            obj$default$getOrDefault = C1972.$default$getOrDefault(c21605, obj, obj2);
        }
        return obj$default$getOrDefault;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.f37474) {
            zRemove = C9735.remove(this.f15671, obj, obj2);
        }
        return zRemove;
    }
}
