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

/* JADX INFO: renamed from: l.ܰۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14435 implements Predicate, InterfaceC1916, Function, UnaryOperator, IntFunction, BinaryOperator, BiConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ C14435(int i) {
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
                ((C4571) obj).add((CharSequence) obj2);
                break;
        }
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
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
        return C23501.$default$andThen(this, biConsumer);
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
        return C3363.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
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
        return C24247.$default$andThen(this, function);
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
        return C24247.$default$compose(this, function);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
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

    @Override // l.InterfaceC1916
    public InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        EnumC8692 enumC8692 = EnumC8692.DAY_OF_MONTH;
        return interfaceC1235.b(interfaceC1235.k(enumC8692).d, enumC8692);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                Map map = (Map) obj;
                Set set = C2025.a;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    Object key = entry.getKey();
                    Object objRequireNonNull = C17359.requireNonNull(entry.getValue());
                    Object objPutIfAbsent = C11392.putIfAbsent(map, key, objRequireNonNull);
                    if (objPutIfAbsent != null) {
                        throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", key, objPutIfAbsent, objRequireNonNull));
                    }
                }
                return map;
            case 16:
                Collection collection = (Collection) obj;
                Set set2 = C2025.a;
                collection.addAll((Collection) obj2);
                return collection;
            case 18:
                List list = (List) obj;
                Set set3 = C2025.a;
                list.addAll((List) obj2);
                return list;
            case 21:
                Set set4 = (Set) obj;
                Set set5 = (Set) obj2;
                Set set6 = C2025.a;
                if (set4.size() < set5.size()) {
                    set5.addAll(set4);
                    return set5;
                }
                set4.addAll(set5);
                return set4;
            case 23:
                List list2 = (List) obj;
                Set set7 = C2025.a;
                list2.addAll((List) obj2);
                return list2;
            case 26:
                return ((C4571) obj).merge((C4571) obj2);
            default:
                Set set8 = (Set) obj;
                Set set9 = (Set) obj2;
                Set set10 = C2025.a;
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
                Set set = C2025.a;
                return AbstractC1758.B(((List) obj).toArray());
            case 22:
                Set set2 = C2025.a;
                return AbstractC1758.D(((Set) obj).toArray());
            case 24:
                Set set3 = C2025.a;
                return obj;
            default:
                return ((C4571) obj).toString();
        }
    }

    public Object g(InterfaceC9437 interfaceC9437) {
        switch (this.a) {
            case 1:
                return C9306.R(interfaceC9437);
            case 2:
                AbstractC22338 abstractC22338 = (AbstractC22338) interfaceC9437.P(AbstractC17577.a);
                if (abstractC22338 == null || (abstractC22338 instanceof C11149)) {
                    return null;
                }
                return abstractC22338;
            case 3:
            default:
                EnumC8692 enumC8692 = EnumC8692.NANO_OF_DAY;
                if (interfaceC9437.d(enumC8692)) {
                    return C10052.V(interfaceC9437.C(enumC8692));
                }
                return null;
            case 4:
                return (AbstractC22338) interfaceC9437.P(AbstractC17577.a);
            case 5:
                return (InterfaceC8912) interfaceC9437.P(AbstractC17577.b);
            case 6:
                return (InterfaceC2726) interfaceC9437.P(AbstractC17577.c);
            case 7:
                EnumC8692 enumC8693 = EnumC8692.OFFSET_SECONDS;
                if (interfaceC9437.d(enumC8693)) {
                    return C11149.ofTotalSeconds(interfaceC9437.i(enumC8693));
                }
                return null;
            case 8:
                AbstractC22338 abstractC22339 = (AbstractC22338) interfaceC9437.P(AbstractC17577.a);
                return abstractC22339 != null ? abstractC22339 : (AbstractC22338) interfaceC9437.P(AbstractC17577.d);
            case 9:
                EnumC8692 enumC8694 = EnumC8692.EPOCH_DAY;
                if (interfaceC9437.d(enumC8694)) {
                    return C7816.d0(interfaceC9437.C(enumC8694));
                }
                return null;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }
}
