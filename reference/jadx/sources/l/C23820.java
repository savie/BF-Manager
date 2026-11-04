package l;

import java.util.logging.Level;

/* JADX INFO: renamed from: l.᩹᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 33QT */
/* JADX INFO: loaded from: classes.dex */
public final class C23820 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC3704 f77148;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC12653 f77153;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC12874 f77154;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC4099 f77155;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public EnumC4099 f77156;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC12874 f77158;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15614 f77159;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6908 f77145 = C11139.m28096(new C11885());

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15614 f77144 = new C25312();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f77150 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f77147 = -1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f77152 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f77151 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f77149 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f77157 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC6908 f77146 = f77145;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C23820 m53145() {
        return new C23820();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53148(int i) {
        int i2 = this.f77147;
        if (i2 == -1) {
            C12128.m30309(i > 0);
            this.f77147 = i;
            return;
        }
        throw new IllegalStateException(C8399.m22571("concurrency level was already set to %s", Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53149(long j) {
        long j2 = this.f77152;
        C12128.m30312(j2, "maximum size was already set to %s", j2 == -1);
        long j3 = this.f77151;
        C12128.m30312(j3, "maximum weight was already set to %s", j3 == -1);
        C12128.m30314("maximum size can not be combined with weigher", this.f77153 == null);
        C12128.m30308("maximum size must not be negative", j >= 0);
        this.f77152 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53152(long j) {
        long j2 = this.f77151;
        C12128.m30312(j2, "maximum weight was already set to %s", j2 == -1);
        long j3 = this.f77152;
        C12128.m30312(j3, "maximum size was already set to %s", j3 == -1);
        C12128.m30308("maximum weight must not be negative", j >= 0);
        this.f77151 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53150(InterfaceC12653 interfaceC12653) {
        C12128.m30315(this.f77153 == null);
        if (this.f77150) {
            long j = this.f77152;
            C12128.m30312(j, "weigher can not be combined with maximum size (%s provided)", j == -1);
        }
        interfaceC12653.getClass();
        this.f77153 = interfaceC12653;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53151() {
        EnumC4099 enumC4099 = EnumC4099.f13964;
        EnumC4099 enumC40910 = this.f77155;
        C12128.m30313(enumC40910, "Value strength was already set to %s", enumC40910 == null);
        enumC4099.getClass();
        this.f77155 = enumC4099;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6666 m53147(AbstractC20836 abstractC20836) {
        m53144();
        abstractC20836.getClass();
        return new C11556(new ConcurrentMapC5942(this, abstractC20836), 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2191 m53146() {
        m53144();
        return new C16777(this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m53144() {
        if (this.f77153 == null) {
            C12128.m30314("maximumWeight requires weigher", this.f77151 == -1);
        } else if (this.f77150) {
            C12128.m30314("weigher requires maximumWeight", this.f77151 != -1);
        } else if (this.f77151 == -1) {
            C17106.f55830.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public final String toString() {
        C3179 c3179M46714 = C20333.m46714(this);
        int i = this.f77147;
        if (i != -1) {
            c3179M46714.m10380("concurrencyLevel", i);
        }
        long j = this.f77152;
        if (j != -1) {
            c3179M46714.m10377(j, "maximumSize");
        }
        long j2 = this.f77151;
        if (j2 != -1) {
            c3179M46714.m10377(j2, "maximumWeight");
        }
        if (this.f77149 != -1) {
            c3179M46714.m10379((Object) C2764.m9137(new StringBuilder(), this.f77149, "ns"), "expireAfterWrite");
        }
        if (this.f77157 != -1) {
            c3179M46714.m10379((Object) C2764.m9137(new StringBuilder(), this.f77157, "ns"), "expireAfterAccess");
        }
        EnumC4099 enumC4099 = this.f77156;
        if (enumC4099 != null) {
            c3179M46714.m10379((Object) C7914.m21453(enumC4099.toString()), "keyStrength");
        }
        EnumC4099 enumC40910 = this.f77155;
        if (enumC40910 != null) {
            c3179M46714.m10379((Object) C7914.m21453(enumC40910.toString()), "valueStrength");
        }
        if (this.f77158 != null) {
            c3179M46714.m10378("keyEquivalence");
        }
        if (this.f77154 != null) {
            c3179M46714.m10378("valueEquivalence");
        }
        if (this.f77148 != null) {
            c3179M46714.m10378("removalListener");
        }
        return c3179M46714.toString();
    }
}
