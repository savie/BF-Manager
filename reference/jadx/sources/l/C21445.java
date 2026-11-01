package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J5WP */
/* JADX INFO: loaded from: classes5.dex */
public class C21445 extends C12274 implements Map, InterfaceC4464 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15096 f69720;

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C1972.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C1972.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C1972.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C1972.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1972.$default$replaceAll(this, biFunction);
    }

    public C21445() {
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f69720 == null) {
            this.f69720 = new C15096(this);
        }
        C15096 c15096 = this.f69720;
        if (c15096.f53024 == null) {
            c15096.f53024 = new C20740(c15096);
        }
        return c15096.f53024;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f69720 == null) {
            this.f69720 = new C15096(this);
        }
        C15096 c15096 = this.f69720;
        if (c15096.f53026 == null) {
            c15096.f53026 = new C15802(c15096);
        }
        return c15096.f53026;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f69720 == null) {
            this.f69720 = new C15096(this);
        }
        C15096 c15096 = this.f69720;
        if (c15096.f53025 == null) {
            c15096.f53025 = new C0278(c15096);
        }
        return c15096.f53025;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m30512(map.size() + this.f41044);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48073(Collection collection) {
        AbstractC16507.m38780((Map) this, collection);
    }

    public C21445(C21445 c21445) {
        if (c21445 != null) {
            int i = c21445.f41044;
            m30512(this.f41044 + i);
            if (this.f41044 != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(c21445.m30510(i2), c21445.m30513(i2));
                }
            } else if (i > 0) {
                System.arraycopy(c21445.f41046, 0, this.f41046, 0, i);
                System.arraycopy(c21445.f41045, 0, this.f41045, 0, i << 1);
                this.f41044 = i;
            }
        }
    }
}
