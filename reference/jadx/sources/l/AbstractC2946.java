package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.datepicker.UtcDates;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.TimeZone;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۖ᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2946 {
    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public InterfaceC8409 trySplit() {
        return null;
    }

    public static Optional n(C15867 c15867) {
        if (c15867 == null) {
            return null;
        }
        if (c15867.isPresent()) {
            return Optional.of(c15867.get());
        }
        return Optional.empty();
    }

    public static C15867 j(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return C15867.of(optional.get());
        }
        return C15867.empty();
    }

    public static C21725 k(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (!optionalDouble.isPresent()) {
            return C21725.c;
        }
        return new C21725(optionalDouble.getAsDouble());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۖۧۗ] */
    public static C2617 a(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        C17359.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: l.ۖۧۗ
            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return AbstractC2946.a(this, doubleConsumer3);
            }

            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }
        };
    }

    public static C19487 m(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (!optionalLong.isPresent()) {
            return C19487.c;
        }
        return new C19487(optionalLong.getAsLong());
    }

    public static String i(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone(UtcDates.UTC);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static C23327 l(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (!optionalInt.isPresent()) {
            return C23327.c;
        }
        return new C23327(optionalInt.getAsInt());
    }

    public static String s(Object obj, Object obj2) {
        String string;
        String string2;
        String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = a.h;
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static String h(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone(UtcDates.UTC);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static OptionalDouble o(C21725 c21725) {
        if (c21725 == null) {
            return null;
        }
        boolean z = c21725.a;
        if (!z) {
            return OptionalDouble.empty();
        }
        if (z) {
            return OptionalDouble.of(c21725.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalInt p(C23327 c23327) {
        if (c23327 == null) {
            return null;
        }
        if (c23327.a) {
            return OptionalInt.of(c23327.getAsInt());
        }
        return OptionalInt.empty();
    }

    public static OptionalLong q(C19487 c19487) {
        if (c19487 == null) {
            return null;
        }
        boolean z = c19487.a;
        if (!z) {
            return OptionalLong.empty();
        }
        if (z) {
            return OptionalLong.of(c19487.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static boolean e(InterfaceC7421 interfaceC7421, InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return interfaceC16831 == EnumC8692.ERA;
        }
        return interfaceC16831 != null && interfaceC16831.i(interfaceC7421);
    }

    public static InterfaceC8912 r(InterfaceC9437 interfaceC9437) {
        C17359.requireNonNull(interfaceC9437, "temporal");
        return (InterfaceC8912) C17359.requireNonNullElse((InterfaceC8912) interfaceC9437.P(AbstractC17577.b), C20012.c);
    }

    public static int c(InterfaceC7421 interfaceC7421, InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 == EnumC8692.ERA) {
            return interfaceC7421.getValue();
        }
        return AbstractC17577.a(interfaceC7421, interfaceC16831);
    }

    public static long d(InterfaceC7421 interfaceC7421, InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 == EnumC8692.ERA) {
            return interfaceC7421.getValue();
        }
        if (interfaceC16831 instanceof EnumC8692) {
            throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
        return interfaceC16831.z(interfaceC7421);
    }

    public static InterfaceC8912 t(String str) {
        ConcurrentMapC17249 concurrentMapC17249 = AbstractC11895.a;
        C17359.requireNonNull(str, "id");
        while (true) {
            ConcurrentMapC17249 concurrentMapC172410 = AbstractC11895.a;
            InterfaceC8912 interfaceC8912 = (InterfaceC8912) concurrentMapC172410.get(str);
            if (interfaceC8912 == null) {
                interfaceC8912 = (InterfaceC8912) AbstractC11895.b.get(str);
            }
            if (interfaceC8912 != null) {
                return interfaceC8912;
            }
            if (concurrentMapC172410.get("ISO") != null) {
                for (InterfaceC8912 interfaceC8913 : ServiceLoader.load(InterfaceC8912.class)) {
                    if (str.equals(interfaceC8913.getId()) || str.equals(interfaceC8913.l())) {
                        return interfaceC8913;
                    }
                }
                throw new C21241("Unknown chronology: " + str);
            }
            C5096 c5096 = C5096.f82076l;
            c5096.getClass();
            AbstractC11895.k(c5096, "Hijrah-umalqura");
            C5842 c5842 = C5842.c;
            c5842.getClass();
            AbstractC11895.k(c5842, "Japanese");
            C25322 c25322 = C25322.c;
            c25322.getClass();
            AbstractC11895.k(c25322, "Minguo");
            C21592 c21592 = C21592.c;
            c21592.getClass();
            AbstractC11895.k(c21592, "ThaiBuddhist");
            try {
                for (AbstractC11895 abstractC11895 : Arrays.asList(new AbstractC11895[0])) {
                    if (!abstractC11895.getId().equals("ISO")) {
                        AbstractC11895.k(abstractC11895, abstractC11895.getId());
                    }
                }
                C20012 c20012 = C20012.c;
                c20012.getClass();
                AbstractC11895.k(c20012, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static Object f(InterfaceC7421 interfaceC7421, C14435 c14435) {
        if (c14435 == AbstractC17577.c) {
            return EnumC10183.ERAS;
        }
        return AbstractC17577.c(interfaceC7421, c14435);
    }

    public static boolean g(InterfaceC3012 interfaceC3012, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return interfaceC3012.tryAdvance((DoubleConsumer) consumer);
        }
        if (AbstractC21658.a) {
            AbstractC21658.a(interfaceC3012.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        C17359.requireNonNull(consumer);
        return interfaceC3012.tryAdvance((DoubleConsumer) new C5317(consumer, 0));
    }

    public static void b(InterfaceC3012 interfaceC3012, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC3012.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (AbstractC21658.a) {
                AbstractC21658.a(interfaceC3012.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            C17359.requireNonNull(consumer);
            interfaceC3012.forEachRemaining((DoubleConsumer) new C5317(consumer, 0));
        }
    }

    public boolean tryAdvance(Object obj) {
        C17359.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        C17359.requireNonNull(obj);
    }
}
