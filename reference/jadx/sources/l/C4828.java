package l;

import java.util.ServiceLoader;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A7L5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4828 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23858 m13412(String str) {
        int iIndexOf = str.indexOf(":");
        final String strSubstring = iIndexOf != -1 ? str.substring(0, iIndexOf) : str;
        return (InterfaceC23858) C21980.stream(C0356.spliterator(ServiceLoader.load(InterfaceC1984.class, C15539.class.getClassLoader())), false).filter(new Predicate() { // from class: l.ۢᩳ۟
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C4828.m13413(strSubstring, (InterfaceC1984) obj);
            }
        }).findFirst().flatMap(new C1443(strSubstring, iIndexOf != -1 ? str.substring(iIndexOf + 1) : "")).orElse(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m13413(final String str, InterfaceC1984 interfaceC1984) {
        InterfaceC5046 interfaceC5046Stream = C21980.stream(C0356.spliterator(interfaceC1984.m6396()), false);
        C13638.requireNonNull(str);
        return interfaceC5046Stream.anyMatch(new Predicate() { // from class: l.ۗᩳ۟
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals((String) obj);
            }
        });
    }
}
