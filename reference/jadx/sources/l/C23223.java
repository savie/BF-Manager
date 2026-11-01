package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩺᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes.dex */
public class C23223 extends AbstractC8281 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f75341;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14072 f75342;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7826 f75343;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC18864 f75344;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final EnumC10523 f75345;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f75346;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC14072 f75347;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC2635 f75348;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f75349;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f75350;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC10523 f75351;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1224 f75352;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC17703 f75353;

    public C23223(ConcurrentMapC21937 concurrentMapC21937) {
        EnumC10523 enumC10523 = concurrentMapC21937.f71159;
        EnumC10523 enumC10524 = concurrentMapC21937.f71145;
        AbstractC14072 abstractC14072 = concurrentMapC21937.f71154;
        AbstractC14072 abstractC14073 = concurrentMapC21937.f71164;
        long j = concurrentMapC21937.f71162;
        long j2 = concurrentMapC21937.f71156;
        long j3 = concurrentMapC21937.f71146;
        InterfaceC7826 interfaceC7826 = concurrentMapC21937.f71149;
        int i = concurrentMapC21937.f71160;
        InterfaceC17703 interfaceC17703 = concurrentMapC21937.f71148;
        AbstractC2635 abstractC2635 = concurrentMapC21937.f71151;
        AbstractC18864 abstractC18864 = concurrentMapC21937.f71163;
        this.f75351 = enumC10523;
        this.f75345 = enumC10524;
        this.f75347 = abstractC14072;
        this.f75342 = abstractC14073;
        this.f75350 = j;
        this.f75341 = j2;
        this.f75346 = j3;
        this.f75343 = interfaceC7826;
        this.f75349 = i;
        this.f75353 = interfaceC17703;
        this.f75348 = (abstractC2635 == AbstractC2635.m8122() || abstractC2635 == C21686.f70338) ? null : abstractC2635;
        this.f75344 = abstractC18864;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C21686 m51231() {
        char c;
        char c2;
        C21686 c21686M48428 = C21686.m48428();
        EnumC10523 enumC10523 = c21686M48428.f70344;
        C18304.m42521(enumC10523, "Key strength was already set to %s", enumC10523 == null);
        EnumC10523 enumC10524 = this.f75351;
        enumC10524.getClass();
        c21686M48428.f70344 = enumC10524;
        EnumC10523 enumC10525 = c21686M48428.f70351;
        C18304.m42521(enumC10525, "Value strength was already set to %s", enumC10525 == null);
        EnumC10523 enumC10526 = this.f75345;
        enumC10526.getClass();
        c21686M48428.f70351 = enumC10526;
        AbstractC14072 abstractC14072 = c21686M48428.f70341;
        C18304.m42521(abstractC14072, "key equivalence was already set to %s", abstractC14072 == null);
        AbstractC14072 abstractC14073 = this.f75347;
        abstractC14073.getClass();
        c21686M48428.f70341 = abstractC14073;
        AbstractC14072 abstractC14074 = c21686M48428.f70349;
        C18304.m42521(abstractC14074, "value equivalence was already set to %s", abstractC14074 == null);
        AbstractC14072 abstractC14075 = this.f75342;
        abstractC14075.getClass();
        c21686M48428.f70349 = abstractC14075;
        c21686M48428.m48432(this.f75349);
        C18304.m42523(c21686M48428.f70347 == null);
        InterfaceC17703 interfaceC17703 = this.f75353;
        interfaceC17703.getClass();
        c21686M48428.f70347 = interfaceC17703;
        c21686M48428.f70345 = false;
        long j = this.f75350;
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j2 = c21686M48428.f70346;
            c = 1;
            c2 = 0;
            C18304.m42520(j2, "expireAfterWrite was already set to %s ns", j2 == -1);
            if (!(j >= 0)) {
                throw new IllegalArgumentException(C11249.m28221("duration cannot be negative: %s %s", Long.valueOf(j), timeUnit));
            }
            c21686M48428.f70346 = timeUnit.toNanos(j);
        } else {
            c = 1;
            c2 = 0;
        }
        long j3 = this.f75341;
        if (j3 > 0) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            long j4 = c21686M48428.f70348;
            C18304.m42520(j4, "expireAfterAccess was already set to %s ns", j4 == -1);
            if (!(j3 >= 0)) {
                Object[] objArr = new Object[2];
                objArr[c2] = Long.valueOf(j3);
                objArr[c] = timeUnit2;
                throw new IllegalArgumentException(C11249.m28221("duration cannot be negative: %s %s", objArr));
            }
            c21686M48428.f70348 = timeUnit2.toNanos(j3);
        }
        EnumC15337 enumC15337 = EnumC15337.INSTANCE;
        long j5 = this.f75346;
        InterfaceC7826 interfaceC7826 = this.f75343;
        if (interfaceC7826 != enumC15337) {
            c21686M48428.m48434(interfaceC7826);
            if (j5 != -1) {
                c21686M48428.m48436(j5);
            }
        } else if (j5 != -1) {
            c21686M48428.m48433(j5);
        }
        AbstractC2635 abstractC2635 = this.f75348;
        if (abstractC2635 != null) {
            C18304.m42523(c21686M48428.f70353 == null);
            c21686M48428.f70353 = abstractC2635;
        }
        return c21686M48428;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f75352 = m51231().m48430();
    }

    private Object readResolve() {
        return this.f75352;
    }

    @Override // l.AbstractC16644
    /* JADX INFO: renamed from: ۚ */
    public final Object mo2173() {
        return this.f75352;
    }
}
