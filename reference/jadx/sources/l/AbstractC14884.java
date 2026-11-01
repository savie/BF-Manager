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

/* JADX INFO: renamed from: l.ܶ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC14884 {
    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public InterfaceC20693 trySplit() {
        return null;
    }

    public static Optional n(C11521 c11521) {
        if (c11521 == null) {
            return null;
        }
        if (c11521.isPresent()) {
            return Optional.of(c11521.get());
        }
        return Optional.empty();
    }

    public static C11521 j(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return C11521.of(optional.get());
        }
        return C11521.empty();
    }

    public static C16460 k(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (!optionalDouble.isPresent()) {
            return C16460.c;
        }
        return new C16460(optionalDouble.getAsDouble());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.۟᩻ᩴ] */
    public static C7806 a(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        C13638.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: l.۟᩻ᩴ
            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return AbstractC14884.a(this, doubleConsumer3);
            }

            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }
        };
    }

    public static C5876 m(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (!optionalLong.isPresent()) {
            return C5876.c;
        }
        return new C5876(optionalLong.getAsLong());
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

    public static C2347 l(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (!optionalInt.isPresent()) {
            return C2347.c;
        }
        return new C2347(optionalInt.getAsInt());
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

    public static OptionalDouble o(C16460 c16460) {
        if (c16460 == null) {
            return null;
        }
        boolean z = c16460.a;
        if (!z) {
            return OptionalDouble.empty();
        }
        if (z) {
            return OptionalDouble.of(c16460.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalInt p(C2347 c2347) {
        if (c2347 == null) {
            return null;
        }
        boolean z = c2347.a;
        if (!z) {
            return OptionalInt.empty();
        }
        if (z) {
            return OptionalInt.of(c2347.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalLong q(C5876 c5876) {
        if (c5876 == null) {
            return null;
        }
        boolean z = c5876.a;
        if (!z) {
            return OptionalLong.empty();
        }
        if (z) {
            return OptionalLong.of(c5876.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static boolean e(InterfaceC17705 interfaceC17705, InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return interfaceC11002 == EnumC18762.ERA;
        }
        return interfaceC11002 != null && interfaceC11002.l(interfaceC17705);
    }

    public static InterfaceC21233 r(InterfaceC21584 interfaceC21584) {
        C13638.requireNonNull(interfaceC21584, "temporal");
        return (InterfaceC21233) C13638.requireNonNullElse((InterfaceC21233) interfaceC21584.T(AbstractC23702.b), C7122.c);
    }

    public static int c(InterfaceC17705 interfaceC17705, InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 == EnumC18762.ERA) {
            return interfaceC17705.getValue();
        }
        return AbstractC23702.a(interfaceC17705, interfaceC11002);
    }

    public static long d(InterfaceC17705 interfaceC17705, InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 == EnumC18762.ERA) {
            return interfaceC17705.getValue();
        }
        if (interfaceC11002 instanceof EnumC18762) {
            throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
        return interfaceC11002.C(interfaceC17705);
    }

    public static InterfaceC21233 t(String str) {
        ConcurrentMapC13783 concurrentMapC13783 = AbstractC16874.a;
        C13638.requireNonNull(str, "id");
        while (true) {
            ConcurrentMapC13783 concurrentMapC13784 = AbstractC16874.a;
            InterfaceC21233 interfaceC21233 = (InterfaceC21233) concurrentMapC13784.get(str);
            if (interfaceC21233 == null) {
                interfaceC21233 = (InterfaceC21233) AbstractC16874.b.get(str);
            }
            if (interfaceC21233 != null) {
                return interfaceC21233;
            }
            if (concurrentMapC13784.get("ISO") != null) {
                for (InterfaceC21233 interfaceC21234 : ServiceLoader.load(InterfaceC21233.class)) {
                    if (str.equals(interfaceC21234.k()) || str.equals(interfaceC21234.o())) {
                        return interfaceC21234;
                    }
                }
                throw new C15464("Unknown chronology: " + str);
            }
            C7828 c7828 = C7828.f77962l;
            c7828.getClass();
            AbstractC16874.n(c7828, "Hijrah-umalqura");
            C19823 c19823 = C19823.c;
            c19823.getClass();
            AbstractC16874.n(c19823, "Japanese");
            C12641 c12641 = C12641.c;
            c12641.getClass();
            AbstractC16874.n(c12641, "Minguo");
            C2182 c2182 = C2182.c;
            c2182.getClass();
            AbstractC16874.n(c2182, "ThaiBuddhist");
            try {
                for (AbstractC16874 abstractC16874 : Arrays.asList(new AbstractC16874[0])) {
                    if (!abstractC16874.k().equals("ISO")) {
                        AbstractC16874.n(abstractC16874, abstractC16874.k());
                    }
                }
                C7122 c7122 = C7122.c;
                c7122.getClass();
                AbstractC16874.n(c7122, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static Object f(InterfaceC17705 interfaceC17705, C22935 c22935) {
        if (c22935 == AbstractC23702.c) {
            return EnumC22996.ERAS;
        }
        return AbstractC23702.c(interfaceC17705, c22935);
    }

    public static boolean g(InterfaceC7535 interfaceC7535, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return interfaceC7535.tryAdvance((DoubleConsumer) consumer);
        }
        if (AbstractC15297.a) {
            AbstractC15297.a(interfaceC7535.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        C13638.requireNonNull(consumer);
        return interfaceC7535.tryAdvance((DoubleConsumer) new C14344(consumer, 0));
    }

    public static void b(InterfaceC7535 interfaceC7535, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC7535.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (AbstractC15297.a) {
                AbstractC15297.a(interfaceC7535.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            C13638.requireNonNull(consumer);
            interfaceC7535.forEachRemaining((DoubleConsumer) new C14344(consumer, 0));
        }
    }

    public boolean tryAdvance(Object obj) {
        C13638.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        C13638.requireNonNull(obj);
    }
}
