package l;

import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۙۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: XSY */
/* JADX INFO: loaded from: classes3.dex */
public final class C4423 extends C10732 implements InterfaceC9321, InterfaceC4464 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient C19366 f15733;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16376 f15734;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient C9633 f15735;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0624 f15736;

    @Override // java.util.Map, l.InterfaceC4464
    public final void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object compute(Object obj, BiFunction biFunction) {
        Object objCompute;
        Character ch = (Character) obj;
        synchronized (this.f36579) {
            objCompute = C9735.compute(this.f15734, ch, biFunction);
        }
        return objCompute;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objComputeIfAbsent;
        Character ch = (Character) obj;
        synchronized (this.f36579) {
            objComputeIfAbsent = C9735.computeIfAbsent(this.f15734, ch, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object objComputeIfPresent;
        Character ch = (Character) obj;
        synchronized (this.f36579) {
            objComputeIfPresent = C9735.computeIfPresent(this.f15734, ch, biFunction);
        }
        return objComputeIfPresent;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object objMerge;
        Character ch = (Character) obj;
        synchronized (this.f36579) {
            objMerge = C9735.merge(this.f15734, ch, obj2, biFunction);
        }
        return objMerge;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objPutIfAbsent;
        Character ch = (Character) obj;
        synchronized (this.f36579) {
            objPutIfAbsent = C9735.putIfAbsent(this.f15734, ch, obj2);
        }
        return objPutIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        Character ch = (Character) obj;
        synchronized (this.f36579) {
            objReplace = C9735.replace(this.f15734, ch, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        Character ch = (Character) obj;
        synchronized (this.f36579) {
            zReplace = C9735.replace(this.f15734, ch, obj2, obj3);
        }
        return zReplace;
    }

    public C4423(C16376 c16376) {
        super(c16376);
        this.f15734 = c16376;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f36579) {
            zContainsValue = this.f15734.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f36579) {
            this.f15734.putAll(map);
        }
    }

    @Override // l.InterfaceC9321
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC18660 mo8794() {
        C19366 c19366;
        synchronized (this.f36579) {
            if (this.f15733 == null) {
                this.f15733 = C8783.m22855(this.f15734.mo8794(), this.f36579);
            }
            c19366 = this.f15733;
        }
        return c19366;
    }

    @Override // java.util.Map
    @Deprecated
    public final Set entrySet() {
        return mo8794();
    }

    @Override // l.InterfaceC9321, java.util.Map
    @Deprecated
    public final InterfaceC18660 entrySet() {
        return mo8794();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C9633 c9633;
        synchronized (this.f36579) {
            if (this.f15735 == null) {
                InterfaceC4630 interfaceC4630KeySet = this.f15734.keySet();
                C10732 c10732 = this.f36579;
                C1870 c1870 = C3281.f12166;
                this.f15735 = new C9633(interfaceC4630KeySet, c10732);
            }
            c9633 = this.f15735;
        }
        return c9633;
    }

    @Override // java.util.Map
    public final Collection values() {
        InterfaceC0624 interfaceC0624;
        synchronized (this.f36579) {
            if (this.f15736 == null) {
                this.f15736 = C17558.m40828(this.f15734.values(), this.f36579);
            }
            interfaceC0624 = this.f15736;
        }
        return interfaceC0624;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f36579) {
            zIsEmpty = this.f15734.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // l.C10732, java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f36579) {
            iHashCode = this.f15734.hashCode();
        }
        return iHashCode;
    }

    @Override // l.C10732, java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f36579) {
            zEquals = this.f15734.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f36579) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f36579) {
            C9735.replaceAll(this.f15734, biFunction);
        }
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj$default$getOrDefault;
        synchronized (this.f36579) {
            C16376 c16376 = this.f15734;
            c16376.getClass();
            obj$default$getOrDefault = C1972.$default$getOrDefault(c16376, obj, obj2);
        }
        return obj$default$getOrDefault;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.f36579) {
            zRemove = C9735.remove(this.f15734, obj, obj2);
        }
        return zRemove;
    }
}
