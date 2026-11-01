package l;

import java.nio.charset.CoderResult;
import java.nio.file.DirectoryStream;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ۚۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5295 implements InterfaceC6623, DirectoryStream.Filter, InterfaceC20030, BiPredicate, IntPredicate, LongPredicate, Predicate, DoubleFunction, Function, LongFunction, Consumer, BooleanSupplier {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C5295(int i) {
        this.a = i;
    }

    public /* synthetic */ C5295(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 13:
                ((InterfaceC19171) this.b).accept(obj);
                break;
            default:
                ((List) this.b).add(obj);
                break;
        }
    }

    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return C22623.$default$and(this, biPredicate);
    }

    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C23329.$default$and(this, intPredicate);
    }

    public /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
        return C18389.$default$and(this, longPredicate);
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 13:
                break;
        }
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }

    @Override // l.InterfaceC20030
    public String name() {
        switch (this.a) {
        }
        return "posix:permissions";
    }

    public /* synthetic */ BiPredicate negate() {
        return C22623.$default$negate(this);
    }

    /* JADX INFO: renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ IntPredicate m14670negate() {
        return C23329.$default$negate(this);
    }

    /* JADX INFO: renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ LongPredicate m14671negate() {
        return C18389.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        return C8512.$default$negate(this);
    }

    public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return C22623.$default$or(this, biPredicate);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return C23329.$default$or(this, intPredicate);
    }

    public /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
        return C18389.$default$or(this, longPredicate);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* JADX INFO: renamed from: accept, reason: collision with other method in class */
    public boolean mo14669accept(Object obj) {
        switch (this.a) {
            case 1:
                return ((InterfaceC6623) this.b).matches(((InterfaceC3800) obj).getFileName());
            default:
                return ((DirectoryStream.Filter) this.b).mo14669accept(AbstractC1726.p(obj));
        }
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC5046) {
            return C2223.convert((InterfaceC5046) objApply);
        }
        if (objApply instanceof Stream) {
            return C4381.b((Stream) objApply);
        }
        if (objApply instanceof InterfaceC13514) {
            return C4340.convert((InterfaceC13514) objApply);
        }
        if (objApply instanceof IntStream) {
            return C3301.convert((IntStream) objApply);
        }
        if (objApply instanceof InterfaceC19386) {
            return C22208.b((InterfaceC19386) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return C10692.b((DoubleStream) objApply);
        }
        if (objApply instanceof InterfaceC18796) {
            return C2567.b((InterfaceC18796) objApply);
        }
        if (objApply instanceof LongStream) {
            return C17116.b((LongStream) objApply);
        }
        C12040.a(objApply.getClass(), "java.util.stream.*Stream");
        throw null;
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

    public C5295() {
        this.a = 5;
        this.b = CoderResult.UNDERFLOW;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object objApply = ((DoubleFunction) this.b).apply(d);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC19386) {
            return C22208.b((InterfaceC19386) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return C10692.b((DoubleStream) objApply);
        }
        C12040.a(objApply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // l.InterfaceC6623
    public boolean matches(InterfaceC3800 interfaceC3800) {
        return ((Pattern) this.b).matcher(interfaceC3800.toString()).matches();
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object objApply = ((LongFunction) this.b).apply(j);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC18796) {
            return C2567.b((InterfaceC18796) objApply);
        }
        if (objApply instanceof LongStream) {
            return C17116.b((LongStream) objApply);
        }
        C12040.a(objApply.getClass(), "java.util.stream.LongStream");
        throw null;
    }

    @Override // l.InterfaceC20030
    public Object value() {
        switch (this.a) {
            case 3:
                return Collections.unmodifiableSet(AbstractC1726.v((Set) ((FileAttribute) this.b).value()));
            default:
                return Collections.unmodifiableSet((Set) this.b);
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 16:
                C9999 c9999 = (C9999) this.b;
                return c9999.d.tryAdvance(c9999.e);
            case 17:
                C0908 c0908 = (C0908) this.b;
                return c0908.d.tryAdvance(c0908.e);
            case 18:
                C10788 c10788 = (C10788) this.b;
                return c10788.d.tryAdvance(c10788.e);
            default:
                C23030 c23030 = (C23030) this.b;
                return c23030.d.tryAdvance(c23030.e);
        }
    }

    public void a(EnumC19905 enumC19905) {
        ((EnumMap) ((Map) this.b)).put(enumC19905, 1);
    }
}
