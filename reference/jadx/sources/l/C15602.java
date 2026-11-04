package l;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܳ᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15602 implements InterfaceC7920, BiConsumer, BiFunction, Consumer, InterfaceC8605 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C15602(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 1:
                break;
        }
        return C23501.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return C3363.$default$andThen(this, function);
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
        return C12312.$default$andThen(this, consumer);
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

    @Override // l.InterfaceC7920
    public String name() {
        return (String) this.b;
    }

    @Override // l.InterfaceC7920
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

    public C15602(EnumC14154 enumC14154, EnumC17381 enumC17381, Supplier supplier) {
        this.a = 6;
        this.b = enumC17381;
        this.c = supplier;
    }

    @Override // l.InterfaceC8605
    public int j() {
        return EnumC21614.u | EnumC21614.r;
    }

    @Override // l.InterfaceC8605
    public Object b(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409) {
        AbstractC21857 abstractC21857 = (AbstractC21857) ((Supplier) this.c).get();
        abstractC15470.f0(interfaceC8409, abstractC21857);
        return Boolean.valueOf(abstractC21857.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC8605
    public Object e(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409) {
        return (Boolean) new C18127(this, (AbstractC15470) abstractC13956, interfaceC8409).invoke();
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
                ConcurrentMapC17249 concurrentMapC17249 = (ConcurrentMapC17249) this.c;
                if (obj != null) {
                    concurrentMapC17249.putIfAbsent(obj, Boolean.TRUE);
                } else {
                    atomicBoolean.set(true);
                }
                break;
            case 6:
            default:
                C24269 c24269 = (C24269) this.b;
                Consumer consumer3 = (Consumer) this.c;
                if (c24269.b.putIfAbsent(obj != null ? obj : C24269.d, Boolean.TRUE) == null) {
                    consumer3.accept(obj);
                }
                break;
            case 7:
                ((BiConsumer) this.b).accept(this.c, obj);
                break;
        }
    }
}
