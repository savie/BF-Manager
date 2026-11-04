package l;

import java.nio.charset.CoderResult;
import java.nio.file.DirectoryStream;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: l.ۗۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3249 implements InterfaceC4191, DirectoryStream.Filter, InterfaceC13885, BiPredicate, IntPredicate, LongPredicate, Predicate, Function, BinaryOperator, DoubleFunction, LongFunction, Consumer, BooleanSupplier {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C3249(int i) {
        this.a = i;
    }

    public /* synthetic */ C3249(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 14:
                ((InterfaceC15143) this.b).accept(obj);
                break;
            default:
                ((List) this.b).add(obj);
                break;
        }
    }

    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return C20517.$default$and(this, biPredicate);
    }

    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C14549.$default$and(this, intPredicate);
    }

    public /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
        return C0380.$default$and(this, longPredicate);
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return C3363.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 14:
                break;
        }
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }

    @Override // l.InterfaceC13885
    public String name() {
        switch (this.a) {
        }
        return "posix:permissions";
    }

    public /* synthetic */ BiPredicate negate() {
        return C20517.$default$negate(this);
    }

    /* JADX INFO: renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ IntPredicate m10609negate() {
        return C14549.$default$negate(this);
    }

    /* JADX INFO: renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ LongPredicate m10610negate() {
        return C0380.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        return C19025.$default$negate(this);
    }

    public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return C20517.$default$or(this, biPredicate);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return C14549.$default$or(this, intPredicate);
    }

    public /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
        return C0380.$default$or(this, longPredicate);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* JADX INFO: renamed from: accept, reason: collision with other method in class */
    public boolean mo10607accept(Object obj) {
        switch (this.a) {
            case 1:
                return ((InterfaceC4191) this.b).matches(((InterfaceC24329) obj).getFileName());
            default:
                return ((DirectoryStream.Filter) this.b).mo10607accept(AbstractC1758.p(obj));
        }
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    @Override // java.util.function.IntPredicate
    public boolean test(int i) {
        return !((IntPredicate) this.b).test(i);
    }

    @Override // java.util.function.LongPredicate
    public boolean test(long j) {
        return !((LongPredicate) this.b).test(j);
    }

    @Override // java.util.function.BiPredicate
    public boolean test(Object obj, Object obj2) {
        return !((BiPredicate) this.b).test(obj, obj2);
    }

    public C3249() {
        this.a = 5;
        this.b = CoderResult.UNDERFLOW;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object objApply = ((DoubleFunction) this.b).apply(d);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC20648) {
            return C15426.b((InterfaceC20648) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return C1301.b((DoubleStream) objApply);
        }
        C16041.a(objApply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // l.InterfaceC4191
    public boolean matches(InterfaceC24329 interfaceC24329) {
        return ((Pattern) this.b).matcher(interfaceC24329.toString()).matches();
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object objApply = ((LongFunction) this.b).apply(j);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC16194) {
            return C23018.b((InterfaceC16194) objApply);
        }
        if (objApply instanceof LongStream) {
            return C18785.b((LongStream) objApply);
        }
        C16041.a(objApply.getClass(), "java.util.stream.LongStream");
        throw null;
    }

    @Override // l.InterfaceC13885
    public Object value() {
        switch (this.a) {
            case 3:
                return Collections.unmodifiableSet(AbstractC1758.v((Set) ((FileAttribute) this.b).value()));
            default:
                return Collections.unmodifiableSet((Set) this.b);
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 17:
                C5449 c5449 = (C5449) this.b;
                return c5449.d.tryAdvance(c5449.e);
            case 18:
                C9176 c9176 = (C9176) this.b;
                return c9176.d.tryAdvance(c9176.e);
            case 19:
                C12685 c12685 = (C12685) this.b;
                return c12685.d.tryAdvance(c12685.e);
            default:
                C13563 c13563 = (C13563) this.b;
                return c13563.d.tryAdvance(c13563.e);
        }
    }

    public void a(EnumC17138 enumC17138) {
        ((EnumMap) ((Map) this.b)).put(enumC17138, 1);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        BinaryOperator binaryOperator = (BinaryOperator) this.b;
        Map map = (Map) obj;
        Set set = C2025.a;
        for (Map.Entry entry : ((Map) obj2).entrySet()) {
            C11392.merge(map, entry.getKey(), entry.getValue(), binaryOperator);
        }
        return map;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Supplier supplier = (Supplier) this.b;
        Set set = C2025.a;
        return supplier.get();
    }
}
