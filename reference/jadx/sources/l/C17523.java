package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܽۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes5.dex */
public class C17523 extends AbstractC12631 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f56956;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f56957;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC15614 f56958;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC4099 f56959;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC12874 f56960;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC12874 f56961;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3704 f56962;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC20836 f56963;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC12653 f56964;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f56965;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f56966;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC4099 f56967;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC2191 f56968;

    public C17523(ConcurrentMapC5942 concurrentMapC5942) {
        EnumC4099 enumC4099 = concurrentMapC5942.f20338;
        EnumC4099 enumC40910 = concurrentMapC5942.f20347;
        AbstractC12874 abstractC12874 = concurrentMapC5942.f20336;
        AbstractC12874 abstractC12875 = concurrentMapC5942.f20350;
        long j = concurrentMapC5942.f20352;
        long j2 = concurrentMapC5942.f20342;
        long j3 = concurrentMapC5942.f20343;
        InterfaceC12653 interfaceC12653 = concurrentMapC5942.f20337;
        int i = concurrentMapC5942.f20349;
        InterfaceC3704 interfaceC3704 = concurrentMapC5942.f20348;
        AbstractC15614 abstractC15614 = concurrentMapC5942.f20353;
        AbstractC20836 abstractC20836 = concurrentMapC5942.f20354;
        this.f56967 = enumC4099;
        this.f56959 = enumC40910;
        this.f56960 = abstractC12874;
        this.f56961 = abstractC12875;
        this.f56956 = j;
        this.f56966 = j2;
        this.f56957 = j3;
        this.f56964 = interfaceC12653;
        this.f56965 = i;
        this.f56962 = interfaceC3704;
        this.f56958 = (abstractC15614 == AbstractC15614.m37346() || abstractC15614 == C23820.f77144) ? null : abstractC15614;
        this.f56963 = abstractC20836;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C23820 m41141() {
        char c;
        char c2;
        C23820 c23820M53145 = C23820.m53145();
        EnumC4099 enumC4099 = c23820M53145.f77156;
        C12128.m30313(enumC4099, "Key strength was already set to %s", enumC4099 == null);
        EnumC4099 enumC40910 = this.f56967;
        enumC40910.getClass();
        c23820M53145.f77156 = enumC40910;
        EnumC4099 enumC40911 = c23820M53145.f77155;
        C12128.m30313(enumC40911, "Value strength was already set to %s", enumC40911 == null);
        EnumC4099 enumC40912 = this.f56959;
        enumC40912.getClass();
        c23820M53145.f77155 = enumC40912;
        AbstractC12874 abstractC12874 = c23820M53145.f77158;
        C12128.m30313(abstractC12874, "key equivalence was already set to %s", abstractC12874 == null);
        AbstractC12874 abstractC12875 = this.f56960;
        abstractC12875.getClass();
        c23820M53145.f77158 = abstractC12875;
        AbstractC12874 abstractC12876 = c23820M53145.f77154;
        C12128.m30313(abstractC12876, "value equivalence was already set to %s", abstractC12876 == null);
        AbstractC12874 abstractC12877 = this.f56961;
        abstractC12877.getClass();
        c23820M53145.f77154 = abstractC12877;
        c23820M53145.m53148(this.f56965);
        C12128.m30315(c23820M53145.f77148 == null);
        InterfaceC3704 interfaceC3704 = this.f56962;
        interfaceC3704.getClass();
        c23820M53145.f77148 = interfaceC3704;
        c23820M53145.f77150 = false;
        long j = this.f56956;
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j2 = c23820M53145.f77149;
            c = 1;
            c2 = 0;
            C12128.m30312(j2, "expireAfterWrite was already set to %s ns", j2 == -1);
            if (!(j >= 0)) {
                throw new IllegalArgumentException(C8399.m22571("duration cannot be negative: %s %s", Long.valueOf(j), timeUnit));
            }
            c23820M53145.f77149 = timeUnit.toNanos(j);
        } else {
            c = 1;
            c2 = 0;
        }
        long j3 = this.f56966;
        if (j3 > 0) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            long j4 = c23820M53145.f77157;
            C12128.m30312(j4, "expireAfterAccess was already set to %s ns", j4 == -1);
            if (!(j3 >= 0)) {
                Object[] objArr = new Object[2];
                objArr[c2] = Long.valueOf(j3);
                objArr[c] = timeUnit2;
                throw new IllegalArgumentException(C8399.m22571("duration cannot be negative: %s %s", objArr));
            }
            c23820M53145.f77157 = timeUnit2.toNanos(j3);
        }
        EnumC16360 enumC16360 = EnumC16360.INSTANCE;
        long j5 = this.f56957;
        InterfaceC12653 interfaceC12653 = this.f56964;
        if (interfaceC12653 != enumC16360) {
            c23820M53145.m53150(interfaceC12653);
            if (j5 != -1) {
                c23820M53145.m53152(j5);
            }
        } else if (j5 != -1) {
            c23820M53145.m53149(j5);
        }
        AbstractC15614 abstractC15614 = this.f56958;
        if (abstractC15614 != null) {
            C12128.m30315(c23820M53145.f77159 == null);
            c23820M53145.f77159 = abstractC15614;
        }
        return c23820M53145;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f56968 = m41141().m53146();
    }

    private Object readResolve() {
        return this.f56968;
    }

    @Override // l.AbstractC10195
    /* JADX INFO: renamed from: ᩴ */
    public final Object mo26313() {
        return this.f56968;
    }
}
