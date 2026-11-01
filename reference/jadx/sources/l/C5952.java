package l;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۛۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9WI */
/* JADX INFO: loaded from: classes2.dex */
public final class C5952 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f20242 = C13488.m32997(C5952.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC10601 f20243;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f20244;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f20245;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f20246;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f20247;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] f20248;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f20249;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f20250;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f20251;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f20252;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f20253;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C17987 f20254;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16227() {
        long jDecrementAndGet = this.f20246.decrementAndGet();
        if (jDecrementAndGet == 0) {
            m16225();
        } else {
            InterfaceC4314 interfaceC4314 = f20242;
            if (interfaceC4314.mo12133()) {
                interfaceC4314.mo12127(String.format("Release %s (%d)", this, Long.valueOf(jDecrementAndGet)));
            }
        }
    }

    public C5952(InterfaceC10601 interfaceC10601, byte[] bArr, C17987 c17987, String str, int i, int i2, long j) {
        this.f20245 = true;
        this.f20246 = new AtomicLong(1L);
        this.f20243 = interfaceC10601;
        this.f20248 = bArr;
        this.f20251 = 0;
        this.f20244 = str;
        this.f20252 = i;
        this.f20250 = i2;
        this.f20253 = 0;
        this.f20247 = 0;
        c17987.m41869();
        this.f20254 = c17987;
        this.f20249 = c17987.m41872();
        interfaceC10601.getClass();
    }

    public C5952(InterfaceC10601 interfaceC10601, int i, C17987 c17987, String str, int i2, int i3, int i4, int i5, long j) {
        this.f20245 = true;
        this.f20246 = new AtomicLong(1L);
        this.f20243 = interfaceC10601;
        this.f20251 = i;
        this.f20248 = null;
        this.f20244 = str;
        this.f20252 = i2;
        this.f20250 = i3;
        this.f20253 = i4;
        this.f20247 = i5;
        c17987.m41869();
        this.f20254 = c17987;
        this.f20249 = c17987.m41872();
        interfaceC10601.getClass();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m16223() throws C12303 {
        if (!m16226()) {
            throw new C12303("Descriptor is no longer valid");
        }
        return this.f20251;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] m16229() throws C12303 {
        if (!m16226()) {
            throw new C12303("Descriptor is no longer valid");
        }
        return this.f20248;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C17987 m16222() {
        C17987 c17987 = this.f20254;
        c17987.m41869();
        return c17987;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m16226() {
        if (this.f20245) {
            return this.f20249 == this.f20254.m41872() && this.f20254.m41880();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m16225() {
        C17987 c17987 = this.f20254;
        if (c17987 != null) {
            try {
                if (m16226()) {
                    InterfaceC4314 interfaceC4314 = f20242;
                    if (interfaceC4314.mo12125()) {
                        interfaceC4314.mo12135("Closing file handle " + this);
                    }
                    boolean zM41875 = c17987.m41875();
                    InterfaceC10601 interfaceC10601 = this.f20243;
                    if (zM41875) {
                        c17987.m41868(new C9769(interfaceC10601, this.f20248), null, EnumC19358.NO_RETRY);
                    } else {
                        c17987.m41868(new C4808(interfaceC10601, this.f20251), new C3501(interfaceC10601), EnumC19358.NO_RETRY);
                    }
                }
            } finally {
                this.f20245 = false;
                c17987.m41879();
                this.f20254 = null;
            }
        }
        this.f20245 = false;
        if (c17987 != null) {
            c17987.m41879();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m16227();
    }

    public final void finalize() {
        if (this.f20246.get() == 0 || !this.f20245) {
            return;
        }
        f20242.mo12116("File handle was not properly closed: " + this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16224() {
        long jIncrementAndGet = this.f20246.incrementAndGet();
        InterfaceC4314 interfaceC4314 = f20242;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127(String.format("Acquire %s (%d)", this, Long.valueOf(jIncrementAndGet)));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m16228() {
        this.f20245 = false;
    }

    public final String toString() {
        Object objValueOf;
        byte[] bArr = this.f20248;
        if (bArr != null) {
            objValueOf = C5993.m16281(bArr, 0, bArr.length);
        } else {
            objValueOf = Integer.valueOf(this.f20251);
        }
        return String.format("FileHandle %s [fid=%s,tree=%d,flags=%x,access=%x,attrs=%x,options=%x]", this.f20244, objValueOf, Long.valueOf(this.f20249), Integer.valueOf(this.f20252), Integer.valueOf(this.f20250), Integer.valueOf(this.f20253), Integer.valueOf(this.f20247));
    }

    public final int hashCode() {
        int iHashCode;
        long j = this.f20249;
        byte[] bArr = this.f20248;
        if (bArr != null) {
            iHashCode = Arrays.hashCode(bArr);
        } else {
            iHashCode = this.f20251;
        }
        return (int) ((j * 3) + ((long) iHashCode));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5952)) {
            return false;
        }
        C5952 c5952 = (C5952) obj;
        long j = c5952.f20249;
        long j2 = this.f20249;
        byte[] bArr = this.f20248;
        if (bArr != null) {
            return Arrays.equals(bArr, c5952.f20248) && j2 == j;
        }
        return this.f20251 == c5952.f20251 && j2 == j;
    }
}
