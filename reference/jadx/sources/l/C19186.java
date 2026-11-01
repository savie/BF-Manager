package l;

import android.text.Editable;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.CharBuffer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩵ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66R4 */
/* JADX INFO: loaded from: classes5.dex */
public class C19186 extends C11092 implements InterfaceC2916 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C4681 f61960;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public long f61961;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C1254 f61962;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f61963;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f61964;

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo8721(InterfaceC3453 interfaceC3453) {
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ܶܰ */
    public void mo8730() {
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ܺۙ */
    public /* synthetic */ boolean mo8731() {
        return false;
    }

    public C19186() {
        this("");
    }

    public C19186(CharSequence charSequence) {
        this(C1254.m4494(charSequence), charSequence);
    }

    public C19186(C1254 c1254, CharSequence charSequence) {
        super(c1254, charSequence);
        this.f61960 = new C4681(new InterfaceC3001() { // from class: l.ᩳۗۖ
            @Override // l.InterfaceC3001
            /* JADX INFO: renamed from: ۙ */
            public final void mo8962(int i, int i2, CharSequence charSequence2, int i3, int i4) {
                super/*l.ۧܺۖ*/.replace(i, i2, charSequence2, i3, i4);
            }
        });
        this.f61962 = c1254;
        this.f61961 = c1254.m4560();
    }

    public C19186(C1254 c1254) {
        this(c1254, null);
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ᩹ܰ */
    public final C1254 mo8735() {
        return this.f61962;
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ֡ */
    public final long mo8718() {
        return this.f61961;
    }

    @Override // l.InterfaceC2916
    public final boolean isChanged() {
        if (m27995()) {
            return this.f61963;
        }
        try {
            return this.f61961 != this.f61962.m4560();
        } catch (C4865 e) {
            if (!m27995()) {
                throw e;
            }
            return this.f61963;
        }
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ᩶ۙ */
    public void mo8734() {
        mo8723(true);
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ܰ */
    public final void mo8728(boolean z) {
        long jM4560;
        if (m27995()) {
            return;
        }
        if (z) {
            jM4560 = -1;
        } else {
            try {
                jM4560 = this.f61962.m4560();
            } catch (C4865 e) {
                if (!m27995()) {
                    throw e;
                }
                return;
            }
        }
        this.f61961 = jM4560;
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ۖ */
    public final void mo8719(long j) {
        if (m27995()) {
            return;
        }
        this.f61961 = j;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C19186 m44043(C19186 c19186) {
        C1254 c1254M4494 = C1254.m4494("");
        try {
            C22422 c22422M4522 = c19186.f61962.m4522();
            try {
                c1254M4494.m4540(c22422M4522);
                C19186 c19187 = new C19186(c1254M4494, null);
                c19187.mo8719(c19186.f61961);
                c22422M4522.close();
                return c19187;
            } catch (Throwable th) {
                try {
                    c22422M4522.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | Error | RuntimeException e) {
            c1254M4494.m4530();
            throw e;
        }
    }

    @Override // l.InterfaceC2916
    public final void setReadOnly(boolean z) {
        this.f61960.m12983(z);
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ۠ۙ */
    public final boolean mo8725() {
        return this.f61960.m12986() || m27990();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m44048() {
        return this.f61960.m12979();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44046(final int i, final long j, final RunnableC22610 runnableC22610) {
        Supplier supplier = new Supplier() { // from class: l.ᩴۗۖ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C19186.m44039(this.f58894, i, j, runnableC22610);
            }
        };
        return ((Boolean) this.f61960.m12980(Boolean.FALSE, supplier)).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Boolean m44039(C19186 c19186, int i, long j, RunnableC22610 runnableC22610) {
        if (c19186.mo2395() != i || c19186.f61961 != j) {
            return Boolean.FALSE;
        }
        runnableC22610.run();
        c19186.f61960.m12983(true);
        c19186.mo8723(false);
        return Boolean.TRUE;
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ۙ */
    public final void mo8720(int i) {
        this.f61964 = i;
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ᩵ܰ */
    public final int mo8733() {
        return this.f61964;
    }

    @Override // l.C11092, android.text.Editable
    public final Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f61964 == 0) {
            C4681 c4681 = this.f61960;
            c4681.getClass();
            c4681.m12980(null, new C9353(c4681, i, i2, charSequence, i3, i4));
        }
        return this;
    }

    @Override // l.C11092, android.text.Editable
    public final C11092 replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f61964 == 0) {
            C4681 c4681 = this.f61960;
            c4681.getClass();
            c4681.m12980(null, new C9353(c4681, i, i2, charSequence, i3, i4));
        }
        return this;
    }

    @Override // l.C11092, l.InterfaceC2916
    /* JADX INFO: renamed from: ۧۙ */
    public final EnumC11839 mo8726() {
        C14953 c14953 = new C14953(0, this);
        return (EnumC11839) this.f61960.m12980(EnumC11839.UNAVAILABLE, c14953);
    }

    @Override // l.C11092, l.InterfaceC2916
    /* JADX INFO: renamed from: ۫ۙ */
    public final EnumC11839 mo8727() {
        Supplier supplier = new Supplier() { // from class: l.᩸ۗۖ
            @Override // java.util.function.Supplier
            public final Object get() {
                return super/*l.ۧܺۖ*/.mo8727();
            }
        };
        return (EnumC11839) this.f61960.m12980(EnumC11839.UNAVAILABLE, supplier);
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8724(final Runnable runnable) {
        if (this.f61964 != 0) {
            return false;
        }
        return ((Boolean) this.f61960.m12980(Boolean.FALSE, new Supplier() { // from class: l.۠ۗۖ
            @Override // java.util.function.Supplier
            public final Object get() {
                this.f25959.m27998(runnable);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ۙ */
    public void mo8722(C11018 c11018) {
        c11018.writeInt(-483177132);
        C22422 c22422M4522 = this.f61962.m4522();
        try {
            c22422M4522.m49747(c11018);
            c22422M4522.close();
        } catch (Throwable th) {
            try {
                c22422M4522.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C19186 m44045(C17367 c17367, int i) {
        if (c17367.m40449() == -500019884) {
            char[] cArrM44042 = m44042(c17367, i);
            if (c17367.m40445() != i) {
                throw new IllegalArgumentException("Trailing memory text state bytes");
            }
            return new C19186(CharBuffer.wrap(cArrM44042));
        }
        if (i < c17367.m40445() + 4 || i - c17367.m40445() > c17367.available() || c17367.readInt() != -483177132) {
            throw new IllegalArgumentException("Invalid memory session state");
        }
        C1254 c1254M4494 = C1254.m4494("");
        try {
            C22422 c22422M4498 = C1254.m4498(c17367);
            try {
                if (c17367.m40445() != i) {
                    throw new IllegalArgumentException("Trailing memory session state bytes");
                }
                c1254M4494.m4540(c22422M4498);
                C19186 c19186 = new C19186(c1254M4494, null);
                c22422M4498.close();
                return c19186;
            } catch (Throwable th) {
                try {
                    c22422M4498.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            c1254M4494.m4530();
            throw new UncheckedIOException(e);
        } catch (Error e2) {
            e = e2;
            c1254M4494.m4530();
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            c1254M4494.m4530();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static char[] m44042(C17367 c17367, int i) {
        if (i < c17367.m40445() || i - c17367.m40445() < 8 || i - c17367.m40445() > c17367.available()) {
            throw new IllegalArgumentException("Truncated memory text state");
        }
        if (c17367.readInt() != -500019884) {
            throw new IllegalArgumentException("Invalid memory text magic");
        }
        int i2 = c17367.readInt();
        if (i2 < 0 || ((long) i2) * 2 > i - c17367.m40445()) {
            throw new IllegalArgumentException("Invalid memory text length");
        }
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = c17367.m40443();
        }
        return cArr;
    }

    @Override // l.C11092, java.lang.AutoCloseable
    public void close() {
        if (m27990()) {
            C16737.m39273(new RunnableC3185(3, this));
        } else {
            this.f61960.m12982(new RunnableC4970(1, this));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo44047() {
        this.f61963 = isChanged();
        super.close();
        C1254 c1254 = this.f61962;
        if (c1254.m4521()) {
            return;
        }
        c1254.m4530();
    }
}
