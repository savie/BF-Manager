package l;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۬۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13848 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43942;

    public /* synthetic */ C13848(int i) {
        this.f43942 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f43942) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f43942) {
            case 0:
                return ((C24550) obj).f38066 == EnumC13603.f43213;
            case 1:
                return ((AtomicInteger) ((Map.Entry) obj).getValue()).get() > 1;
            case 2:
                return C8438.f27605.matcher((String) obj).matches();
            default:
                C8274 c8274 = (C8274) obj;
                EnumC0816 enumC0816 = EnumC0816.f3091;
                C14769 c14769M22332 = c8274.m22332(enumC0816);
                C18499 c18499 = new C18499();
                int i = 0;
                for (AbstractC22664 abstractC22664 : c8274.m22332(enumC0816)) {
                    int i2 = i + 1;
                    if (i == c8274.f27220) {
                        C14769 c14769M35548 = c14769M22332.m35548(c18499.m43093());
                        C14769 c14769M22333 = c8274.m22332(EnumC0816.f3094, EnumC0816.f3093);
                        c14769M35548.getClass();
                        return c14769M22333.m35549(c14769M35548).m35550();
                    }
                    c18499.m43089(abstractC22664);
                    i = i2;
                }
                C14769 c14769M35549 = c14769M22332.m35548(c18499.m43093());
                C14769 c14769M22334 = c8274.m22332(EnumC0816.f3094, EnumC0816.f3093);
                c14769M35549.getClass();
                return c14769M22334.m35549(c14769M35549).m35550();
        }
    }
}
