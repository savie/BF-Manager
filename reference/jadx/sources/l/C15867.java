package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܶۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15867 {
    public static final C15867 b = new C15867();
    public final Object a;

    public C15867() {
        this.a = null;
    }

    public static C15867 empty() {
        return b;
    }

    public C15867(Object obj) {
        this.a = C17359.requireNonNull(obj);
    }

    public static C15867 of(Object obj) {
        return new C15867(obj);
    }

    public static C15867 ofNullable(Object obj) {
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

    public C15867 map(Function function) {
        C17359.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        return ofNullable(function.apply(this.a));
    }

    public C15867 flatMap(Function function) {
        C17359.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        return (C15867) C17359.requireNonNull((C15867) function.apply(this.a));
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
        if (obj instanceof C15867) {
            return C17359.equals(this.a, ((C15867) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hashCode(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
