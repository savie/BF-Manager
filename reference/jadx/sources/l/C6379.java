package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۛۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9E4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6379 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f21541 = C16980.m40037(C6379.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EnumC20549 f21542;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f21543;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C4272 f21545;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f21546;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f21548;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f21549;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f21550;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f21551;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f21552;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f21553;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C3395 f21554;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f21555;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f21547 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f21544 = new ArrayDeque();

    @Override // java.io.InputStream
    public final int available() {
        return 0;
    }

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C6379(C3395 c3395, int i, long j, long j2, long j3, int i2) {
        this.f21549 = 0L;
        this.f21548 = 0L;
        this.f21554 = c3395;
        this.f21553 = i;
        this.f21546 = j;
        this.f21549 = j2;
        this.f21548 = j2;
        this.f21551 = j3;
        boolean z = j3 >= 0;
        this.f21552 = z;
        long j4 = C25227.FOREVER_NS;
        if (z && C25227.FOREVER_NS - j2 >= j3) {
            j4 = j2 + j3;
        }
        this.f21555 = j4;
        this.f21543 = Math.max(1, i2);
    }

    @Override // java.io.InputStream
    public final int read() {
        C4272 c4272 = this.f21545;
        if (c4272 == null || this.f21547 >= c4272.m13613()) {
            m18121();
        }
        if (this.f21550) {
            return -1;
        }
        C4272 c4273 = this.f21545;
        int i = this.f21547;
        this.f21547 = i + 1;
        return c4273.m13614(i) & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        C4272 c4272 = this.f21545;
        if (c4272 == null || this.f21547 >= c4272.m13613()) {
            m18121();
        }
        if (this.f21550) {
            return -1;
        }
        int iMin = Math.min(this.f21545.m13613() - this.f21547, i2);
        this.f21545.m13615(this.f21547, bArr, i, iMin);
        this.f21547 += iMin;
        return iMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        EnumC20549 enumC20549;
        boolean zIsEmpty = this.f21544.isEmpty();
        m18120();
        if (this.f21542 == null) {
            C4272 c4272 = this.f21545;
            boolean z = c4272 == null || this.f21547 >= c4272.m13613();
            if (this.f21550 || (this.f21552 && this.f21551 == 0 && z && zIsEmpty)) {
                enumC20549 = EnumC20549.NORMAL_FINISHED;
            } else {
                enumC20549 = !zIsEmpty ? EnumC20549.EARLY_CLOSE_WITH_PENDING : EnumC20549.EARLY_CLOSE;
            }
            this.f21542 = enumC20549;
        }
        this.f21550 = true;
        this.f21554 = null;
        this.f21545 = null;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        C4272 c4272 = this.f21545;
        if (c4272 != null) {
            int iM13613 = c4272.m13613();
            int i = this.f21547;
            if (j < iM13613 - i) {
                this.f21547 = i + ((int) j);
                return j;
            }
        }
        C4272 c4273 = this.f21545;
        long jM13613 = c4273 == null ? this.f21548 : (this.f21548 - ((long) c4273.m13613())) + ((long) this.f21547);
        long j2 = C25227.FOREVER_NS;
        if (C25227.FOREVER_NS - jM13613 >= j) {
            j2 = jM13613 + j;
        }
        this.f21545 = null;
        this.f21547 = 0;
        m18120();
        this.f21549 = j2;
        this.f21548 = j2;
        if (this.f21552) {
            this.f21551 = Math.max(0L, this.f21555 - j2);
        }
        return j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m18121() {
        if (this.f21550) {
            return;
        }
        m18122();
        ArrayDeque arrayDeque = this.f21544;
        if (arrayDeque.isEmpty()) {
            this.f21550 = true;
            this.f21542 = EnumC20549.NORMAL_FINISHED;
            return;
        }
        C12344 c12344 = (C12344) arrayDeque.removeFirst();
        Future future = c12344.f39646;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC6488 interfaceC6488 = C9469.f30684;
        C4272 c4272 = (C4272) C24388.m54498(this.f21546, future);
        long jM43472 = ((C18684) c4272.mo3632()).m43472();
        EnumC20243 enumC20243 = EnumC20243.STATUS_SUCCESS;
        if (jM43472 == enumC20243.getValue()) {
            this.f21545 = c4272;
            this.f21547 = 0;
            this.f21548 += (long) c4272.m13613();
        }
        if (((C18684) c4272.mo3632()).m43472() == EnumC20243.STATUS_END_OF_FILE.getValue() || c4272.m13613() == 0) {
            f21541.mo13716(Long.valueOf(this.f21548), "EOF, {} bytes read");
            this.f21550 = true;
            this.f21542 = EnumC20549.NORMAL_FINISHED;
            this.f21545 = null;
            this.f21547 = 0;
            m18120();
            return;
        }
        if (((C18684) c4272.mo3632()).m43472() != enumC20243.getValue()) {
            throw new C22172((C18684) c4272.mo3632(), "Read failed for " + this);
        }
        if (this.f21552 && c4272.m13613() < c12344.f39647) {
            m18120();
            this.f21551 = 0L;
        }
        m18122();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m18122() {
        while (!this.f21550 && this.f21554 != null) {
            ArrayDeque arrayDeque = this.f21544;
            if (arrayDeque.size() >= this.f21543) {
                return;
            }
            boolean z = this.f21552;
            if (z && this.f21551 <= 0) {
                return;
            }
            int iMin = this.f21553;
            if (z) {
                iMin = (int) Math.min(iMin, this.f21551);
            }
            C3395 c3395 = this.f21554;
            arrayDeque.addLast(new C12344(c3395.f19479.m4271(c3395.f19480, this.f21549, iMin), iMin));
            long j = iMin;
            this.f21549 += j;
            if (z) {
                this.f21551 -= j;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18120() {
        while (true) {
            ArrayDeque arrayDeque = this.f21544;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                try {
                    ((C12344) arrayDeque.removeFirst()).f39646.cancel(true);
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
