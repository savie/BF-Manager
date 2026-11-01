package l;

import java.util.logging.Level;

/* JADX INFO: renamed from: l.᩸ܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 33QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C21686 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC14072 f70341;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public EnumC10523 f70344;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC17703 f70347;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public AbstractC14072 f70349;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC7826 f70350;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC10523 f70351;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC2635 f70353;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC23949 f70339 = C4752.m13182(new C13220());

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final AbstractC2635 f70338 = new C4046();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f70345 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f70343 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f70352 = -1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f70340 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f70346 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f70348 = -1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC23949 f70342 = f70339;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C21686 m48428() {
        return new C21686();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48432(int i) {
        int i2 = this.f70343;
        if (i2 == -1) {
            C18304.m42517(i > 0);
            this.f70343 = i;
            return;
        }
        throw new IllegalStateException(C11249.m28221("concurrency level was already set to %s", Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48433(long j) {
        long j2 = this.f70352;
        C18304.m42520(j2, "maximum size was already set to %s", j2 == -1);
        long j3 = this.f70340;
        C18304.m42520(j3, "maximum weight was already set to %s", j3 == -1);
        C18304.m42522("maximum size can not be combined with weigher", this.f70350 == null);
        C18304.m42516("maximum size must not be negative", j >= 0);
        this.f70352 = j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48436(long j) {
        long j2 = this.f70340;
        C18304.m42520(j2, "maximum weight was already set to %s", j2 == -1);
        long j3 = this.f70352;
        C18304.m42520(j3, "maximum size was already set to %s", j3 == -1);
        C18304.m42516("maximum weight must not be negative", j >= 0);
        this.f70340 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48434(InterfaceC7826 interfaceC7826) {
        C18304.m42523(this.f70350 == null);
        if (this.f70345) {
            long j = this.f70352;
            C18304.m42520(j, "weigher can not be combined with maximum size (%s provided)", j == -1);
        }
        interfaceC7826.getClass();
        this.f70350 = interfaceC7826;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48435() {
        EnumC10523 enumC10523 = EnumC10523.f36022;
        EnumC10523 enumC10524 = this.f70351;
        C18304.m42521(enumC10524, "Value strength was already set to %s", enumC10524 == null);
        enumC10523.getClass();
        this.f70351 = enumC10523;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19570 m48431(AbstractC18864 abstractC18864) {
        m48429();
        abstractC18864.getClass();
        return new C13345(new ConcurrentMapC21937(this, abstractC18864), 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1224 m48430() {
        m48429();
        return new C6994(this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m48429() {
        if (this.f70350 == null) {
            C18304.m42522("maximumWeight requires weigher", this.f70340 == -1);
        } else if (this.f70345) {
            C18304.m42522("weigher requires maximumWeight", this.f70340 != -1);
        } else if (this.f70340 == -1) {
            C6869.f23160.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public final String toString() {
        C23244 c23244M37072 = C15483.m37072(this);
        int i = this.f70343;
        if (i != -1) {
            c23244M37072.m51285("concurrencyLevel", i);
        }
        long j = this.f70352;
        if (j != -1) {
            c23244M37072.m51282(j, "maximumSize");
        }
        long j2 = this.f70340;
        if (j2 != -1) {
            c23244M37072.m51282(j2, "maximumWeight");
        }
        if (this.f70346 != -1) {
            c23244M37072.m51284((Object) C15037.m36023(new StringBuilder(), this.f70346, "ns"), "expireAfterWrite");
        }
        if (this.f70348 != -1) {
            c23244M37072.m51284((Object) C15037.m36023(new StringBuilder(), this.f70348, "ns"), "expireAfterAccess");
        }
        EnumC10523 enumC10523 = this.f70344;
        if (enumC10523 != null) {
            c23244M37072.m51284((Object) C20733.m46672(enumC10523.toString()), "keyStrength");
        }
        EnumC10523 enumC10524 = this.f70351;
        if (enumC10524 != null) {
            c23244M37072.m51284((Object) C20733.m46672(enumC10524.toString()), "valueStrength");
        }
        if (this.f70341 != null) {
            c23244M37072.m51283("keyEquivalence");
        }
        if (this.f70349 != null) {
            c23244M37072.m51283("valueEquivalence");
        }
        if (this.f70347 != null) {
            c23244M37072.m51283("removalListener");
        }
        return c23244M37072.toString();
    }
}
