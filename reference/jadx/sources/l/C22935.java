package l;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.᩺ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22935 implements Predicate, InterfaceC12413, Function, UnaryOperator, IntFunction, BinaryOperator, BiConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ C22935(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 15:
                ((Collection) obj).add(obj2);
                break;
            case 17:
                ((List) obj).add(obj2);
                break;
            case 20:
                ((Set) obj).add(obj2);
                break;
            default:
                ((C0231) obj).add((CharSequence) obj2);
                break;
        }
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 15:
                break;
            case 17:
                break;
            case 20:
                break;
        }
        return C2866.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 14:
                break;
            case 16:
                break;
            case 18:
                break;
            case 21:
                break;
            case 23:
                break;
            case 26:
                break;
        }
        return C5689.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        switch (this.a) {
            case 11:
                break;
            case 12:
                break;
            case 19:
                break;
            case 22:
                break;
            case 24:
                break;
        }
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 11:
                break;
            case 12:
                break;
            case 19:
                break;
            case 22:
                break;
            case 24:
                break;
        }
        return C4277.$default$compose(this, function);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "ZoneId";
            case 5:
                return "Chronology";
            case 6:
                return "Precision";
            case 7:
                return "ZoneOffset";
            case 8:
                return "Zone";
            case 9:
                return "LocalDate";
            case 10:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((String) obj).isEmpty();
    }

    @Override // l.InterfaceC12413
    public InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        EnumC18762 enumC18762 = EnumC18762.DAY_OF_MONTH;
        return interfaceC15235.c(interfaceC15235.n(enumC18762).d, enumC18762);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                Map map = (Map) obj;
                Set set = C1890.a;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    Object key = entry.getKey();
                    Object objRequireNonNull = C13638.requireNonNull(entry.getValue());
                    Object objPutIfAbsent = C9735.putIfAbsent(map, key, objRequireNonNull);
                    if (objPutIfAbsent != null) {
                        throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", key, objPutIfAbsent, objRequireNonNull));
                    }
                }
                return map;
            case 16:
                Collection collection = (Collection) obj;
                Set set2 = C1890.a;
                collection.addAll((Collection) obj2);
                return collection;
            case 18:
                List list = (List) obj;
                Set set3 = C1890.a;
                list.addAll((List) obj2);
                return list;
            case 21:
                Set set4 = (Set) obj;
                Set set5 = (Set) obj2;
                Set set6 = C1890.a;
                if (set4.size() < set5.size()) {
                    set5.addAll(set4);
                    return set5;
                }
                set4.addAll(set5);
                return set4;
            case 23:
                List list2 = (List) obj;
                Set set7 = C1890.a;
                list2.addAll((List) obj2);
                return list2;
            case 26:
                C0231 c0231 = (C0231) obj;
                C0231 c0232 = (C0231) obj2;
                c0231.getClass();
                C13638.requireNonNull(c0232);
                if (c0232.d == null) {
                    return c0231;
                }
                c0232.a();
                return c0231.add(c0232.d[0]);
            default:
                Set set8 = (Set) obj;
                Set set9 = (Set) obj2;
                Set set10 = C1890.a;
                if (set8.size() < set9.size()) {
                    set9.addAll(set8);
                    return set9;
                }
                set8.addAll(set9);
                return set8;
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 11:
            case 12:
                return obj;
            case 19:
                Set set = C1890.a;
                return AbstractC1726.B(((List) obj).toArray());
            case 22:
                Set set2 = C1890.a;
                return AbstractC1726.D(((Set) obj).toArray());
            case 24:
                Set set3 = C1890.a;
                return obj;
            default:
                return ((C0231) obj).toString();
        }
    }

    public Object h(InterfaceC21584 interfaceC21584) {
        switch (this.a) {
            case 1:
                return C8408.V(interfaceC21584);
            case 2:
                AbstractC9114 abstractC9114 = (AbstractC9114) interfaceC21584.T(AbstractC23702.a);
                if (abstractC9114 == null || (abstractC9114 instanceof C2678)) {
                    return null;
                }
                return abstractC9114;
            case 3:
            default:
                EnumC18762 enumC18762 = EnumC18762.NANO_OF_DAY;
                if (interfaceC21584.e(enumC18762)) {
                    return C3363.a0(interfaceC21584.G(enumC18762));
                }
                return null;
            case 4:
                return (AbstractC9114) interfaceC21584.T(AbstractC23702.a);
            case 5:
                return (InterfaceC21233) interfaceC21584.T(AbstractC23702.b);
            case 6:
                return (InterfaceC18056) interfaceC21584.T(AbstractC23702.c);
            case 7:
                EnumC18762 enumC18763 = EnumC18762.OFFSET_SECONDS;
                if (interfaceC21584.e(enumC18763)) {
                    return C2678.e0(interfaceC21584.l(enumC18763));
                }
                return null;
            case 8:
                AbstractC9114 abstractC9115 = (AbstractC9114) interfaceC21584.T(AbstractC23702.a);
                return abstractC9115 != null ? abstractC9115 : (AbstractC9114) interfaceC21584.T(AbstractC23702.d);
            case 9:
                EnumC18762 enumC18764 = EnumC18762.EPOCH_DAY;
                if (interfaceC21584.e(enumC18764)) {
                    return C18991.i0(interfaceC21584.G(enumC18764));
                }
                return null;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }
}
