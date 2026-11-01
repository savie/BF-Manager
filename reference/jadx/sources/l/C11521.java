package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۨۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11521 {
    public static final C11521 b = new C11521();
    public final Object a;

    public C11521() {
        this.a = null;
    }

    public static C11521 empty() {
        return b;
    }

    public C11521(Object obj) {
        this.a = C13638.requireNonNull(obj);
    }

    public static C11521 of(Object obj) {
        return new C11521(obj);
    }

    public static C11521 ofNullable(Object obj) {
        return obj == null ? empty() : of(obj);
    }

    public Object get() {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean isPresent() {
        return this.a != null;
    }

    public boolean isEmpty() {
        return this.a == null;
    }

    public void ifPresent(Consumer consumer) {
        Object obj = this.a;
        if (obj != null) {
            consumer.accept(obj);
        }
    }

    public C11521 map(Function function) {
        C13638.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        return ofNullable(function.apply(this.a));
    }

    public C11521 flatMap(Function function) {
        C13638.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        return (C11521) C13638.requireNonNull((C11521) function.apply(this.a));
    }

    public Object orElse(Object obj) {
        Object obj2 = this.a;
        return obj2 != null ? obj2 : obj;
    }

    public Object orElseGet(Supplier supplier) {
        Object obj = this.a;
        return obj != null ? obj : supplier.get();
    }

    public Object orElseThrow() {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public Object orElseThrow(Supplier supplier) throws Throwable {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        throw ((Throwable) supplier.get());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11521) {
            return C13638.equals(this.a, ((C11521) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hashCode(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
