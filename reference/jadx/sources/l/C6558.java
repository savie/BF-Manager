package l;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۛܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9WI */
/* JADX INFO: loaded from: classes3.dex */
public final class C6558 implements AutoCloseable {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f22017 = C16980.m40037(C6558.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f22018;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f22019;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f22020;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f22021;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte[] f22022;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f22023;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C19457 f22024;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f22025;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f22026;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5878 f22027;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f22028;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f22029;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final synchronized void m18470() {
        long jDecrementAndGet = this.f22021.decrementAndGet();
        if (jDecrementAndGet == 0) {
            m18472();
        } else {
            InterfaceC25186 interfaceC25186 = f22017;
            if (interfaceC25186.mo13713()) {
                interfaceC25186.mo13717(String.format("Release %s (%d)", this, Long.valueOf(jDecrementAndGet)));
            }
        }
    }

    public C6558(InterfaceC5878 interfaceC5878, byte[] bArr, C19457 c19457, String str, int i, int i2, long j) {
        this.f22025 = true;
        this.f22021 = new AtomicLong(1L);
        this.f22027 = interfaceC5878;
        this.f22022 = bArr;
        this.f22018 = 0;
        this.f22023 = str;
        this.f22028 = i;
        this.f22026 = i2;
        this.f22029 = 0;
        this.f22019 = 0;
        c19457.m44972();
        this.f22024 = c19457;
        this.f22020 = c19457.m44969();
        interfaceC5878.getClass();
    }

    public C6558(InterfaceC5878 interfaceC5878, int i, C19457 c19457, String str, int i2, int i3, int i4, int i5, long j) {
        this.f22025 = true;
        this.f22021 = new AtomicLong(1L);
        this.f22027 = interfaceC5878;
        this.f22018 = i;
        this.f22022 = null;
        this.f22023 = str;
        this.f22028 = i2;
        this.f22026 = i3;
        this.f22029 = i4;
        this.f22019 = i5;
        c19457.m44972();
        this.f22024 = c19457;
        this.f22020 = c19457.m44969();
        interfaceC5878.getClass();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m18467() throws C20728 {
        if (!m18466()) {
            throw new C20728("Descriptor is no longer valid");
        }
        return this.f22018;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m18469() throws C20728 {
        if (!m18466()) {
            throw new C20728("Descriptor is no longer valid");
        }
        return this.f22022;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C19457 m18468() {
        C19457 c19457 = this.f22024;
        c19457.m44972();
        return c19457;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m18466() {
        if (this.f22025) {
            return this.f22020 == this.f22024.m44969() && this.f22024.m44970();
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18472() {
        C19457 c19457 = this.f22024;
        if (c19457 != null) {
            try {
                if (m18466()) {
                    InterfaceC25186 interfaceC25186 = f22017;
                    if (interfaceC25186.mo13707()) {
                        interfaceC25186.mo13721("Closing file handle " + this);
                    }
                    boolean zM44978 = c19457.m44978();
                    InterfaceC5878 interfaceC5878 = this.f22027;
                    if (zM44978) {
                        c19457.m44971(new C21059(interfaceC5878, this.f22022), null, EnumC13269.NO_RETRY);
                    } else {
                        c19457.m44971(new C0242(interfaceC5878, this.f22018), new C18141(interfaceC5878), EnumC13269.NO_RETRY);
                    }
                }
            } finally {
                this.f22025 = false;
                c19457.m44983();
                this.f22024 = null;
            }
        }
        this.f22025 = false;
        if (c19457 != null) {
            c19457.m44983();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m18470();
    }

    public final void finalize() {
        if (this.f22021.get() == 0 || !this.f22025) {
            return;
        }
        f22017.mo13729("File handle was not properly closed: " + this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18465() {
        long jIncrementAndGet = this.f22021.incrementAndGet();
        InterfaceC25186 interfaceC25186 = f22017;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717(String.format("Acquire %s (%d)", this, Long.valueOf(jIncrementAndGet)));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18471() {
        this.f22025 = false;
    }

    public final String toString() {
        Object objValueOf;
        byte[] bArr = this.f22022;
        if (bArr != null) {
            objValueOf = C6033.m17504(bArr, 0, bArr.length);
        } else {
            objValueOf = Integer.valueOf(this.f22018);
        }
        return String.format("FileHandle %s [fid=%s,tree=%d,flags=%x,access=%x,attrs=%x,options=%x]", this.f22023, objValueOf, Long.valueOf(this.f22020), Integer.valueOf(this.f22028), Integer.valueOf(this.f22026), Integer.valueOf(this.f22029), Integer.valueOf(this.f22019));
    }

    public final int hashCode() {
        int iHashCode;
        long j = this.f22020;
        byte[] bArr = this.f22022;
        if (bArr != null) {
            iHashCode = Arrays.hashCode(bArr);
        } else {
            iHashCode = this.f22018;
        }
        return (int) ((j * 3) + ((long) iHashCode));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6558)) {
            return false;
        }
        C6558 c6558 = (C6558) obj;
        long j = c6558.f22020;
        long j2 = this.f22020;
        byte[] bArr = this.f22022;
        if (bArr != null) {
            return Arrays.equals(bArr, c6558.f22022) && j2 == j;
        }
        return this.f22018 == c6558.f22018 && j2 == j;
    }
}
