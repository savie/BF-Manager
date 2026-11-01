package l;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3239 implements Serializable {
    public static final ConcurrentMapC13783 g = new ConcurrentMapC13783(4, 0.75f, 2);
    public static final EnumC15941 h;
    public static final long serialVersionUID = -1177360819670808121L;
    public final EnumC16169 a;
    public final int b;
    public final transient C9591 c;
    public final transient C9591 d;
    public final transient C9591 e;
    public final transient C9591 f;

    static {
        new C3239(EnumC16169.MONDAY, 4);
        a(EnumC16169.SUNDAY, 1);
        h = AbstractC20174.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C3239 a(EnumC16169 enumC16169, int i) {
        String str = enumC16169.toString() + i;
        ConcurrentMapC13783 concurrentMapC13783 = g;
        C3239 c3239 = (C3239) concurrentMapC13783.get(str);
        if (c3239 != null) {
            return c3239;
        }
        concurrentMapC13783.putIfAbsent(str, new C3239(enumC16169, i));
        return (C3239) concurrentMapC13783.get(str);
    }

    public C3239(EnumC16169 enumC16169, int i) {
        EnumC22996 enumC22996 = EnumC22996.DAYS;
        EnumC22996 enumC22997 = EnumC22996.WEEKS;
        this.c = new C9591("DayOfWeek", this, enumC22996, enumC22997, C9591.f);
        this.d = new C9591("WeekOfMonth", this, enumC22997, EnumC22996.MONTHS, C9591.g);
        EnumC15941 enumC15941 = AbstractC20174.d;
        this.e = new C9591("WeekOfWeekBasedYear", this, enumC22997, enumC15941, C9591.i);
        this.f = new C9591("WeekBasedYear", this, enumC15941, EnumC22996.FOREVER, EnumC18762.YEAR.b);
        C13638.requireNonNull(enumC16169, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.a = enumC16169;
        this.b = i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.b;
        if (i < 1 || i > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.a, this.b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3239) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public final String toString() {
        return "WeekFields[" + this.a + "," + this.b + "]";
    }
}
