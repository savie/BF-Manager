package l;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩵۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20561 implements Serializable {
    public static final ConcurrentMapC17249 g = new ConcurrentMapC17249(4, 0.75f, 2);
    public static final EnumC19815 h;
    public static final long serialVersionUID = -1177360819670808121L;
    public final EnumC13387 a;
    public final int b;
    public final transient C3407 c;
    public final transient C3407 d;
    public final transient C3407 e;
    public final transient C3407 f;

    static {
        new C20561(EnumC13387.MONDAY, 4);
        a(EnumC13387.SUNDAY, 1);
        h = AbstractC15339.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C20561 a(EnumC13387 enumC13387, int i) {
        String str = enumC13387.toString() + i;
        ConcurrentMapC17249 concurrentMapC17249 = g;
        C20561 c20561 = (C20561) concurrentMapC17249.get(str);
        if (c20561 != null) {
            return c20561;
        }
        concurrentMapC17249.putIfAbsent(str, new C20561(enumC13387, i));
        return (C20561) concurrentMapC17249.get(str);
    }

    public C20561(EnumC13387 enumC13387, int i) {
        EnumC10183 enumC10183 = EnumC10183.DAYS;
        EnumC10183 enumC10184 = EnumC10183.WEEKS;
        this.c = new C3407("DayOfWeek", this, enumC10183, enumC10184, C3407.f);
        this.d = new C3407("WeekOfMonth", this, enumC10184, EnumC10183.MONTHS, C3407.g);
        EnumC19815 enumC19815 = AbstractC15339.d;
        this.e = new C3407("WeekOfWeekBasedYear", this, enumC10184, enumC19815, C3407.i);
        this.f = new C3407("WeekBasedYear", this, enumC19815, EnumC10183.FOREVER, EnumC8692.YEAR.b);
        C17359.requireNonNull(enumC13387, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.a = enumC13387;
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
        return (obj instanceof C20561) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public final String toString() {
        return "WeekFields[" + this.a + "," + this.b + "]";
    }
}
