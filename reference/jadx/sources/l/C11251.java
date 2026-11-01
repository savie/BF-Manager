package l;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۧ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11251 implements InterfaceC18618, BiConsumer, BiFunction, Consumer, InterfaceC3647 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C11251(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 1:
                break;
        }
        return C2866.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return C5689.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 4:
                break;
            case 5:
                break;
            case 7:
                break;
        }
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.c).apply(((BiFunction) this.b).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                ConcurrentMap concurrentMap = (ConcurrentMap) this.b;
                BiFunction biFunction = (BiFunction) this.c;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                break;
            default:
                BiConsumer biConsumer = (BiConsumer) this.b;
                BiConsumer biConsumer2 = (BiConsumer) this.c;
                biConsumer.accept(obj, obj2);
                biConsumer2.accept(obj, obj2);
                break;
        }
    }

    @Override // l.InterfaceC18618
    public String name() {
        return (String) this.b;
    }

    @Override // l.InterfaceC18618
    public Class type() {
        return (Class) this.c;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    public C11251(EnumC22761 enumC22761, EnumC0120 enumC0120, Supplier supplier) {
        this.a = 6;
        this.b = enumC0120;
        this.c = supplier;
    }

    @Override // l.InterfaceC3647
    public int j() {
        return EnumC2970.u | EnumC2970.r;
    }

    @Override // l.InterfaceC3647
    public Object b(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        AbstractC21287 abstractC21287 = (AbstractC21287) ((Supplier) this.c).get();
        abstractC5752.f0(interfaceC20693, abstractC21287);
        return Boolean.valueOf(abstractC21287.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC3647
    public Object e(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693) {
        return (Boolean) new C4436(this, (AbstractC5752) abstractC22686, interfaceC20693).invoke();
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                Consumer consumer = (Consumer) this.b;
                Consumer consumer2 = (Consumer) this.c;
                consumer.accept(obj);
                consumer2.accept(obj);
                break;
            case 5:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                ConcurrentMapC13783 concurrentMapC13783 = (ConcurrentMapC13783) this.c;
                if (obj != null) {
                    concurrentMapC13783.putIfAbsent(obj, Boolean.TRUE);
                } else {
                    atomicBoolean.set(true);
                }
                break;
            case 6:
            default:
                C14502 c14502 = (C14502) this.b;
                Consumer consumer3 = (Consumer) this.c;
                if (c14502.b.putIfAbsent(obj != null ? obj : C14502.d, Boolean.TRUE) == null) {
                    consumer3.accept(obj);
                }
                break;
            case 7:
                ((BiConsumer) this.b).accept(this.c, obj);
                break;
        }
    }
}
