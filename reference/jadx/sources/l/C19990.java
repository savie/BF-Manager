package l;

import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56EU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19990 implements InterfaceC11851 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumMap f64246 = new EnumMap(EnumC17315.class);

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean mo1794() {
        return false;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֡ */
    public final String mo1790() {
        return toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45969(InterfaceC6238 interfaceC6238, EnumC17315 enumC17315, String str) {
        C19990 c19990 = (C19990) interfaceC6238.mo17862(C11457.f36016);
        if (c19990 == null) {
            c19990 = new C19990();
            interfaceC6238.mo17864(c19990);
        }
        ((Set) C11392.computeIfAbsent(c19990.f64246, enumC17315, new C18980(7))).add(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m45971(final EnumC17315 enumC17315) {
        if (enumC17315 == EnumC17315.NONE || enumC17315 == EnumC17315.USER_ONLY) {
            return Collections.EMPTY_LIST;
        }
        return (List) C1170.stream(this.f64246.entrySet()).filter(new Predicate() { // from class: l.᩸ᩳۗ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((EnumC17315) ((Map.Entry) obj).getKey()).m40666(enumC17315);
            }
        }).flatMap(new C8417(5)).sorted().collect(C2025.toList());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumMap m45970() {
        return this.f64246;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2157 mo1791() {
        return C11457.f36016;
    }

    public final String toString() {
        return "JadxCommentsAttr{\n " + C4123.m13222(this.f64246.entrySet(), "\n ", new C17748(3)) + '}';
    }
}
