package l;

import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 246 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19570 extends C7482 implements InterfaceC10619, InterfaceC16613 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient C11474 f63101;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C24046 f63102;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient C10003 f63103;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC17572 f63104;

    @Override // java.util.Map, l.InterfaceC16613
    public final void forEach(BiConsumer biConsumer) {
        C1698.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object compute(Object obj, BiFunction biFunction) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f24756) {
            C24046 c24046 = this.f63102;
            c24046.getClass();
            f = (Float) C1698.$default$compute(c24046, num, biFunction);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object computeIfAbsent(Object obj, Function function) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f24756) {
            C24046 c24046 = this.f63102;
            c24046.getClass();
            f = (Float) C1698.$default$computeIfAbsent(c24046, num, function);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f24756) {
            C24046 c24046 = this.f63102;
            c24046.getClass();
            f = (Float) C1698.$default$computeIfPresent(c24046, num, biFunction);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        Float f;
        Float f2 = (Float) obj2;
        synchronized (this.f24756) {
            C24046 c24046 = this.f63102;
            c24046.getClass();
            f = (Float) C1698.$default$getOrDefault(c24046, obj, f2);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Float f;
        Integer num = (Integer) obj;
        Float f2 = (Float) obj2;
        synchronized (this.f24756) {
            C24046 c24046 = this.f63102;
            c24046.getClass();
            f = (Float) C1698.$default$merge(c24046, num, f2, biFunction);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object putIfAbsent(Object obj, Object obj2) {
        Float f;
        Integer num = (Integer) obj;
        Float f2 = (Float) obj2;
        synchronized (this.f24756) {
            C24046 c24046 = this.f63102;
            c24046.getClass();
            f = (Float) C1698.$default$putIfAbsent(c24046, num, f2);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object replace(Object obj, Object obj2) {
        Float f;
        Integer num = (Integer) obj;
        Float f2 = (Float) obj2;
        synchronized (this.f24756) {
            C24046 c24046 = this.f63102;
            c24046.getClass();
            f = (Float) C1698.$default$replace(c24046, num, f2);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean z$default$replace;
        Integer num = (Integer) obj;
        Float f = (Float) obj2;
        Float f2 = (Float) obj3;
        synchronized (this.f24756) {
            C24046 c24046 = this.f63102;
            c24046.getClass();
            z$default$replace = C1698.$default$replace(c24046, num, f, f2);
        }
        return z$default$replace;
    }

    public C19570(C24046 c24046) {
        super(c24046);
        this.f63102 = c24046;
    }

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f24756) {
            zContainsValue = this.f63102.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f24756) {
            this.f63102.putAll(map);
        }
    }

    @Override // l.InterfaceC10619
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC7767 mo27095() {
        C10003 c10003;
        synchronized (this.f24756) {
            if (this.f63103 == null) {
                this.f63103 = C1055.m3951(this.f63102.mo27095(), this.f24756);
            }
            c10003 = this.f63103;
        }
        return c10003;
    }

    @Override // java.util.Map
    @Deprecated
    public final Set entrySet() {
        return mo27095();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C11474 c11474;
        synchronized (this.f24756) {
            if (this.f63101 == null) {
                InterfaceC5509 interfaceC5509KeySet = this.f63102.keySet();
                C7482 c7482 = this.f24756;
                C1780 c1780 = C24901.f80578;
                this.f63101 = new C11474(interfaceC5509KeySet, c7482);
            }
            c11474 = this.f63101;
        }
        return c11474;
    }

    @Override // java.util.Map
    public final Collection values() {
        InterfaceC17572 interfaceC17572;
        synchronized (this.f24756) {
            if (this.f63104 == null) {
                this.f63104 = C3402.m11140(this.f63102.values(), this.f24756);
            }
            interfaceC17572 = this.f63104;
        }
        return interfaceC17572;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f24756) {
            zIsEmpty = this.f63102.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // l.C7482, java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f24756) {
            iHashCode = this.f63102.hashCode();
        }
        return iHashCode;
    }

    @Override // l.C7482, java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f24756) {
            zEquals = this.f63102.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f24756) {
            objectOutputStream.defaultWriteObject();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m45161(int i) {
        float f;
        synchronized (this.f24756) {
            C24046 c24046 = this.f63102;
            if (i == 0) {
                if (!c24046.f77780) {
                    f = -1.0f;
                    break;
                }
                f = c24046.f77775[c24046.f77774];
            } else {
                int[] iArr = c24046.f77781;
                int iM30015 = C11972.m30015(i) & c24046.f77776;
                int i2 = iArr[iM30015];
                if (i2 != 0) {
                    if (i == i2) {
                        f = c24046.f77775[iM30015];
                    } else {
                        while (true) {
                            iM30015 = (iM30015 + 1) & c24046.f77776;
                            int i3 = iArr[iM30015];
                            if (i3 != 0) {
                                if (i == i3) {
                                    f = c24046.f77775[iM30015];
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

    @Override // java.util.Map, l.InterfaceC16613
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f24756) {
            C11392.replaceAll(this.f63102, biFunction);
        }
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        boolean z$default$remove;
        synchronized (this.f24756) {
            C24046 c24046 = this.f63102;
            c24046.getClass();
            z$default$remove = C1698.$default$remove(c24046, obj, obj2);
        }
        return z$default$remove;
    }
}
