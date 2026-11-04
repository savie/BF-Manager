package l;

import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܺ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W1Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C17089 extends C15597 implements InterfaceC11868, InterfaceC16613 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient C11474 f55789;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C18383 f55790;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient C10003 f55791;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC21938 f55792;

    @Override // java.util.Map, l.InterfaceC16613
    public final void forEach(BiConsumer biConsumer) {
        C1698.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object compute(Object obj, BiFunction biFunction) {
        Object objCompute;
        Integer num = (Integer) obj;
        synchronized (this.f50698) {
            objCompute = C11392.compute(this.f55790, num, biFunction);
        }
        return objCompute;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objComputeIfAbsent;
        Integer num = (Integer) obj;
        synchronized (this.f50698) {
            objComputeIfAbsent = C11392.computeIfAbsent(this.f55790, num, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object objComputeIfPresent;
        Integer num = (Integer) obj;
        synchronized (this.f50698) {
            objComputeIfPresent = C11392.computeIfPresent(this.f55790, num, biFunction);
        }
        return objComputeIfPresent;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object objMerge;
        Integer num = (Integer) obj;
        synchronized (this.f50698) {
            objMerge = C11392.merge(this.f55790, num, obj2, biFunction);
        }
        return objMerge;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objPutIfAbsent;
        Integer num = (Integer) obj;
        synchronized (this.f50698) {
            objPutIfAbsent = C11392.putIfAbsent(this.f55790, num, obj2);
        }
        return objPutIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        Integer num = (Integer) obj;
        synchronized (this.f50698) {
            objReplace = C11392.replace(this.f55790, num, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        Integer num = (Integer) obj;
        synchronized (this.f50698) {
            zReplace = C11392.replace(this.f55790, num, obj2, obj3);
        }
        return zReplace;
    }

    public C17089(C18383 c18383) {
        super(c18383);
        this.f55790 = c18383;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f50698) {
            zContainsValue = this.f55790.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f50698) {
            this.f55790.putAll(map);
        }
    }

    @Override // l.InterfaceC11868, l.InterfaceC25207
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC7767 mo13468() {
        C10003 c10003;
        synchronized (this.f50698) {
            if (this.f55791 == null) {
                this.f55791 = C1055.m3951(this.f55790.mo13468(), this.f50698);
            }
            c10003 = this.f55791;
        }
        return c10003;
    }

    @Override // java.util.Map
    @Deprecated
    public final Set entrySet() {
        return mo13468();
    }

    @Override // l.InterfaceC11868, java.util.Map, java.util.SortedMap
    @Deprecated
    public final InterfaceC7767 entrySet() {
        return mo13468();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C11474 c11474;
        synchronized (this.f50698) {
            if (this.f55789 == null) {
                InterfaceC16695 interfaceC16695KeySet = this.f55790.keySet();
                C15597 c15597 = this.f50698;
                C1780 c1780 = C24901.f80578;
                this.f55789 = new C11474(interfaceC16695KeySet, c15597);
            }
            c11474 = this.f55789;
        }
        return c11474;
    }

    @Override // java.util.Map
    public final Collection values() {
        InterfaceC21938 interfaceC21938;
        synchronized (this.f50698) {
            if (this.f55792 == null) {
                this.f55792 = C19700.m45396(this.f55790.values(), this.f50698);
            }
            interfaceC21938 = this.f55792;
        }
        return interfaceC21938;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f50698) {
            zIsEmpty = this.f55790.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // l.C15597, java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f50698) {
            iHashCode = this.f55790.hashCode();
        }
        return iHashCode;
    }

    @Override // l.C15597, java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f50698) {
            zEquals = this.f55790.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f50698) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f50698) {
            C11392.replaceAll(this.f55790, biFunction);
        }
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj$default$getOrDefault;
        synchronized (this.f50698) {
            C18383 c18383 = this.f55790;
            c18383.getClass();
            obj$default$getOrDefault = C1698.$default$getOrDefault(c18383, obj, obj2);
        }
        return obj$default$getOrDefault;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.f50698) {
            zRemove = C11392.remove(this.f55790, obj, obj2);
        }
        return zRemove;
    }
}
