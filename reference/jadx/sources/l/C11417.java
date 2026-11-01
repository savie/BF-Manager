package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۨۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9E4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11417 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f38445 = C13488.m32997(C11417.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f38446;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f38447;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f38448;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C2225 f38449;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f38450;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f38451;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f38452;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f38453 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f38454 = new ArrayDeque();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f38455;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC4360 f38456;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3218 f38457;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f38458;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f38459;

    @Override // java.io.InputStream
    public final int available() {
        return 0;
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C11417(C3218 c3218, int i, long j, long j2, long j3, int i2) {
        this.f38459 = 0L;
        this.f38447 = 0L;
        this.f38457 = c3218;
        this.f38446 = i;
        this.f38451 = j;
        this.f38459 = j2;
        this.f38447 = j2;
        this.f38448 = j3;
        boolean z = j3 >= 0;
        this.f38455 = z;
        long j4 = C17492.FOREVER_NS;
        if (z && C17492.FOREVER_NS - j2 >= j3) {
            j4 = j2 + j3;
        }
        this.f38458 = j4;
        this.f38452 = Math.max(1, i2);
    }

    @Override // java.io.InputStream
    public final int read() {
        C2225 c2225 = this.f38449;
        if (c2225 == null || this.f38453 >= c2225.m6845()) {
            m28520();
        }
        if (this.f38450) {
            return -1;
        }
        C2225 c2226 = this.f38449;
        int i = this.f38453;
        this.f38453 = i + 1;
        return c2226.m6846(i) & 255;
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
        C2225 c2225 = this.f38449;
        if (c2225 == null || this.f38453 >= c2225.m6845()) {
            m28520();
        }
        if (this.f38450) {
            return -1;
        }
        int iMin = Math.min(this.f38449.m6845() - this.f38453, i2);
        this.f38449.m6847(this.f38453, bArr, i, iMin);
        this.f38453 += iMin;
        return iMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        EnumC4360 enumC4360;
        boolean zIsEmpty = this.f38454.isEmpty();
        m28521();
        if (this.f38456 == null) {
            C2225 c2225 = this.f38449;
            boolean z = c2225 == null || this.f38453 >= c2225.m6845();
            if (this.f38450 || (this.f38455 && this.f38448 == 0 && z && zIsEmpty)) {
                enumC4360 = EnumC4360.NORMAL_FINISHED;
            } else {
                enumC4360 = !zIsEmpty ? EnumC4360.EARLY_CLOSE_WITH_PENDING : EnumC4360.EARLY_CLOSE;
            }
            this.f38456 = enumC4360;
        }
        this.f38450 = true;
        this.f38457 = null;
        this.f38449 = null;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        C2225 c2225 = this.f38449;
        if (c2225 != null) {
            int iM6845 = c2225.m6845();
            int i = this.f38453;
            if (j < iM6845 - i) {
                this.f38453 = i + ((int) j);
                return j;
            }
        }
        C2225 c2226 = this.f38449;
        long jM6845 = c2226 == null ? this.f38447 : (this.f38447 - ((long) c2226.m6845())) + ((long) this.f38453);
        long j2 = C17492.FOREVER_NS;
        if (C17492.FOREVER_NS - jM6845 >= j) {
            j2 = jM6845 + j;
        }
        this.f38449 = null;
        this.f38453 = 0;
        m28521();
        this.f38459 = j2;
        this.f38447 = j2;
        if (this.f38455) {
            this.f38448 = Math.max(0L, this.f38458 - j2);
        }
        return j;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m28520() {
        if (this.f38450) {
            return;
        }
        m28522();
        ArrayDeque arrayDeque = this.f38454;
        if (arrayDeque.isEmpty()) {
            this.f38450 = true;
            this.f38456 = EnumC4360.NORMAL_FINISHED;
            return;
        }
        C13534 c13534 = (C13534) arrayDeque.removeFirst();
        Future future = c13534.f44691;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC11440 interfaceC11440 = C21317.f69360;
        C2225 c2225 = (C2225) C2266.m6947(this.f38451, future);
        long jM4349 = ((C1186) c2225.mo25478()).m4349();
        EnumC3055 enumC3055 = EnumC3055.STATUS_SUCCESS;
        if (jM4349 == enumC3055.getValue()) {
            this.f38449 = c2225;
            this.f38453 = 0;
            this.f38447 += (long) c2225.m6845();
        }
        if (((C1186) c2225.mo25478()).m4349() == EnumC3055.STATUS_END_OF_FILE.getValue() || c2225.m6845() == 0) {
            f38445.mo12126(Long.valueOf(this.f38447), "EOF, {} bytes read");
            this.f38450 = true;
            this.f38456 = EnumC4360.NORMAL_FINISHED;
            this.f38449 = null;
            this.f38453 = 0;
            m28521();
            return;
        }
        if (((C1186) c2225.mo25478()).m4349() != enumC3055.getValue()) {
            throw new C10360((C1186) c2225.mo25478(), "Read failed for " + this);
        }
        if (this.f38455 && c2225.m6845() < c13534.f44692) {
            m28521();
            this.f38448 = 0L;
        }
        m28522();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m28522() {
        while (!this.f38450 && this.f38457 != null) {
            ArrayDeque arrayDeque = this.f38454;
            if (arrayDeque.size() >= this.f38452) {
                return;
            }
            boolean z = this.f38455;
            if (z && this.f38448 <= 0) {
                return;
            }
            int iMin = this.f38446;
            if (z) {
                iMin = (int) Math.min(iMin, this.f38448);
            }
            C3218 c3218 = this.f38457;
            arrayDeque.addLast(new C13534(c3218.f41413.m47753(c3218.f41412, this.f38459, iMin), iMin));
            long j = iMin;
            this.f38459 += j;
            if (z) {
                this.f38448 -= j;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28521() {
        while (true) {
            ArrayDeque arrayDeque = this.f38454;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                try {
                    ((C13534) arrayDeque.removeFirst()).f44691.cancel(true);
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
