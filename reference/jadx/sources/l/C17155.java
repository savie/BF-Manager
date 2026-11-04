package l;

import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܺ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XSY */
/* JADX INFO: loaded from: classes5.dex */
public final class C17155 extends C15663 implements InterfaceC11934, InterfaceC16613 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient C11846 f55927;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C22377 f55928;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient C10003 f55929;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC21938 f55930;

    @Override // java.util.Map, l.InterfaceC16613
    public final void forEach(BiConsumer biConsumer) {
        C1698.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object compute(Object obj, BiFunction biFunction) {
        Object objCompute;
        Character ch = (Character) obj;
        synchronized (this.f50929) {
            objCompute = C11392.compute(this.f55928, ch, biFunction);
        }
        return objCompute;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objComputeIfAbsent;
        Character ch = (Character) obj;
        synchronized (this.f50929) {
            objComputeIfAbsent = C11392.computeIfAbsent(this.f55928, ch, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object objComputeIfPresent;
        Character ch = (Character) obj;
        synchronized (this.f50929) {
            objComputeIfPresent = C11392.computeIfPresent(this.f55928, ch, biFunction);
        }
        return objComputeIfPresent;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object objMerge;
        Character ch = (Character) obj;
        synchronized (this.f50929) {
            objMerge = C11392.merge(this.f55928, ch, obj2, biFunction);
        }
        return objMerge;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objPutIfAbsent;
        Character ch = (Character) obj;
        synchronized (this.f50929) {
            objPutIfAbsent = C11392.putIfAbsent(this.f55928, ch, obj2);
        }
        return objPutIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        Character ch = (Character) obj;
        synchronized (this.f50929) {
            objReplace = C11392.replace(this.f55928, ch, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        Character ch = (Character) obj;
        synchronized (this.f50929) {
            zReplace = C11392.replace(this.f55928, ch, obj2, obj3);
        }
        return zReplace;
    }

    public C17155(C22377 c22377) {
        super(c22377);
        this.f55928 = c22377;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f50929) {
            zContainsValue = this.f55928.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f50929) {
            this.f55928.putAll(map);
        }
    }

    @Override // l.InterfaceC11934, l.InterfaceC10442
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC7767 mo19859() {
        C10003 c10003;
        synchronized (this.f50929) {
            if (this.f55929 == null) {
                this.f55929 = C1055.m3951(this.f55928.mo19859(), this.f50929);
            }
            c10003 = this.f55929;
        }
        return c10003;
    }

    @Override // java.util.Map
    @Deprecated
    public final Set entrySet() {
        return mo19859();
    }

    @Override // l.InterfaceC11934, java.util.Map
    @Deprecated
    public final InterfaceC7767 entrySet() {
        return mo19859();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C11846 c11846;
        synchronized (this.f50929) {
            if (this.f55927 == null) {
                InterfaceC17067 interfaceC17067KeySet = this.f55928.keySet();
                C15663 c15663 = this.f50929;
                C2152 c2152 = C25273.f81633;
                this.f55927 = new C11846(interfaceC17067KeySet, c15663);
            }
            c11846 = this.f55927;
        }
        return c11846;
    }

    @Override // java.util.Map
    public final Collection values() {
        InterfaceC21938 interfaceC21938;
        synchronized (this.f50929) {
            if (this.f55930 == null) {
                this.f55930 = C19700.m45396(this.f55928.values(), this.f50929);
            }
            interfaceC21938 = this.f55930;
        }
        return interfaceC21938;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f50929) {
            zIsEmpty = this.f55928.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // l.C15663, java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f50929) {
            iHashCode = this.f55928.hashCode();
        }
        return iHashCode;
    }

    @Override // l.C15663, java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f50929) {
            zEquals = this.f55928.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f50929) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f50929) {
            C11392.replaceAll(this.f55928, biFunction);
        }
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj$default$getOrDefault;
        synchronized (this.f50929) {
            C22377 c22377 = this.f55928;
            c22377.getClass();
            obj$default$getOrDefault = C1698.$default$getOrDefault(c22377, obj, obj2);
        }
        return obj$default$getOrDefault;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.f50929) {
            zRemove = C11392.remove(this.f55928, obj, obj2);
        }
        return zRemove;
    }
}
