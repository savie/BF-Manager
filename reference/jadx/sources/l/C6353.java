package l;

import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 246 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6353 extends C16232 implements InterfaceC12704, InterfaceC4464 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient C19366 f21413;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C3614 f21414;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient C9903 f21415;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC13535 f21416;

    @Override // java.util.Map, l.InterfaceC4464
    public final void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object compute(Object obj, BiFunction biFunction) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f52362) {
            C3614 c3614 = this.f21414;
            c3614.getClass();
            f = (Float) C1972.$default$compute(c3614, num, biFunction);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object computeIfAbsent(Object obj, Function function) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f52362) {
            C3614 c3614 = this.f21414;
            c3614.getClass();
            f = (Float) C1972.$default$computeIfAbsent(c3614, num, function);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f52362) {
            C3614 c3614 = this.f21414;
            c3614.getClass();
            f = (Float) C1972.$default$computeIfPresent(c3614, num, biFunction);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        Float f;
        Float f2 = (Float) obj2;
        synchronized (this.f52362) {
            C3614 c3614 = this.f21414;
            c3614.getClass();
            f = (Float) C1972.$default$getOrDefault(c3614, obj, f2);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Float f;
        Integer num = (Integer) obj;
        Float f2 = (Float) obj2;
        synchronized (this.f52362) {
            C3614 c3614 = this.f21414;
            c3614.getClass();
            f = (Float) C1972.$default$merge(c3614, num, f2, biFunction);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object putIfAbsent(Object obj, Object obj2) {
        Float f;
        Integer num = (Integer) obj;
        Float f2 = (Float) obj2;
        synchronized (this.f52362) {
            C3614 c3614 = this.f21414;
            c3614.getClass();
            f = (Float) C1972.$default$putIfAbsent(c3614, num, f2);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object replace(Object obj, Object obj2) {
        Float f;
        Integer num = (Integer) obj;
        Float f2 = (Float) obj2;
        synchronized (this.f52362) {
            C3614 c3614 = this.f21414;
            c3614.getClass();
            f = (Float) C1972.$default$replace(c3614, num, f2);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean z$default$replace;
        Integer num = (Integer) obj;
        Float f = (Float) obj2;
        Float f2 = (Float) obj3;
        synchronized (this.f52362) {
            C3614 c3614 = this.f21414;
            c3614.getClass();
            z$default$replace = C1972.$default$replace(c3614, num, f, f2);
        }
        return z$default$replace;
    }

    public C6353(C3614 c3614) {
        super(c3614);
        this.f21414 = c3614;
    }

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f52362) {
            zContainsValue = this.f21414.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f52362) {
            this.f21414.putAll(map);
        }
    }

    @Override // l.InterfaceC12704
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC18660 mo10715() {
        C19366 c19366;
        synchronized (this.f52362) {
            if (this.f21413 == null) {
                this.f21413 = C8783.m22855(this.f21414.mo10715(), this.f52362);
            }
            c19366 = this.f21413;
        }
        return c19366;
    }

    @Override // java.util.Map
    @Deprecated
    public final Set entrySet() {
        return mo10715();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C9903 c9903;
        synchronized (this.f52362) {
            if (this.f21415 == null) {
                InterfaceC14842 interfaceC14842KeySet = this.f21414.keySet();
                C16232 c16232 = this.f52362;
                C2140 c2140 = C3551.f13068;
                this.f21415 = new C9903(interfaceC14842KeySet, c16232);
            }
            c9903 = this.f21415;
        }
        return c9903;
    }

    @Override // java.util.Map
    public final Collection values() {
        InterfaceC13535 interfaceC13535;
        synchronized (this.f52362) {
            if (this.f21416 == null) {
                this.f21416 = C5067.m14115(this.f21414.values(), this.f52362);
            }
            interfaceC13535 = this.f21416;
        }
        return interfaceC13535;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f52362) {
            zIsEmpty = this.f21414.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // l.C16232, java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f52362) {
            iHashCode = this.f21414.hashCode();
        }
        return iHashCode;
    }

    @Override // l.C16232, java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f52362) {
            zEquals = this.f21414.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f52362) {
            objectOutputStream.defaultWriteObject();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m17459(int i) {
        float f;
        synchronized (this.f52362) {
            C3614 c3614 = this.f21414;
            if (i == 0) {
                if (!c3614.f13290) {
                    f = -1.0f;
                    break;
                }
                f = c3614.f13289[c3614.f13287];
            } else {
                int[] iArr = c3614.f13284;
                int iM25125 = C9927.m25125(i) & c3614.f13288;
                int i2 = iArr[iM25125];
                if (i2 != 0) {
                    if (i == i2) {
                        f = c3614.f13289[iM25125];
                    } else {
                        while (true) {
                            iM25125 = (iM25125 + 1) & c3614.f13288;
                            int i3 = iArr[iM25125];
                            if (i3 != 0) {
                                if (i == i3) {
                                    f = c3614.f13289[iM25125];
                                    break;
                                }
                            }
                        }
                    }
                }
                f = -1.0f;
                break;
            }
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f52362) {
            C9735.replaceAll(this.f21414, biFunction);
        }
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        boolean z$default$remove;
        synchronized (this.f52362) {
            C3614 c3614 = this.f21414;
            c3614.getClass();
            z$default$remove = C1972.$default$remove(c3614, obj, obj2);
        }
        return z$default$remove;
    }
}
