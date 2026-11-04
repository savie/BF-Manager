package l;

import android.text.Editable;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.CharBuffer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۫᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66R4 */
/* JADX INFO: loaded from: classes4.dex */
public class C13378 extends C5068 implements InterfaceC19106 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public long f42638;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f42639;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C17505 f42640;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C0371 f42641;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f42642;

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo11038(InterfaceC19459 interfaceC19459) {
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ܰۙ */
    public /* synthetic */ boolean mo11042() {
        return false;
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ܺ᩷ */
    public void mo11045() {
    }

    public C13378() {
        this("");
    }

    public C13378(CharSequence charSequence) {
        this(C17505.m41052(charSequence), charSequence);
    }

    public C13378(C17505 c17505, CharSequence charSequence) {
        super(c17505, charSequence);
        this.f42641 = new C0371(new InterfaceC18270() { // from class: l.᩸᩷ᩴ
            @Override // l.InterfaceC18270
            /* JADX INFO: renamed from: ۙ */
            public final void mo41142(int i, int i2, CharSequence charSequence2, int i3, int i4) {
                super/*l.ۙܿ᩸*/.replace(i, i2, charSequence2, i3, i4);
            }
        });
        this.f42640 = c17505;
        this.f42638 = c17505.m41115();
    }

    public C13378(C17505 c17505) {
        this(c17505, null);
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ܳ᩷ */
    public final C17505 mo11043() {
        return this.f42640;
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ܿ */
    public final long mo11046() {
        return this.f42638;
    }

    @Override // l.InterfaceC19106
    public final boolean isChanged() {
        if (m15341()) {
            return this.f42639;
        }
        try {
            return this.f42638 != this.f42640.m41115();
        } catch (C13271 e) {
            if (!m15341()) {
                throw e;
            }
            return this.f42639;
        }
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ᩶ۙ */
    public void mo11049() {
        mo11039(true);
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11051(boolean z) {
        long jM41115;
        if (m15341()) {
            return;
        }
        if (z) {
            jM41115 = -1;
        } else {
            try {
                jM41115 = this.f42640.m41115();
            } catch (C13271 e) {
                if (!m15341()) {
                    throw e;
                }
                return;
            }
        }
        this.f42638 = jM41115;
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ᩸ */
    public final void mo11052(long j) {
        if (m15341()) {
            return;
        }
        this.f42638 = j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C13378 m32981(C13378 c13378) {
        C17505 c17505M41052 = C17505.m41052("");
        try {
            C16759 c16759M41107 = c13378.f42640.m41107();
            try {
                c17505M41052.m41097(c16759M41107);
                C13378 c13379 = new C13378(c17505M41052, null);
                c13379.mo11052(c13378.f42638);
                c16759M41107.close();
                return c13379;
            } catch (Throwable th) {
                try {
                    c16759M41107.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | Error | RuntimeException e) {
            c17505M41052.m41087();
            throw e;
        }
    }

    @Override // l.InterfaceC19106
    public final void setReadOnly(boolean z) {
        this.f42641.m2156(z);
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ۗۙ */
    public final boolean mo11034() {
        return this.f42641.m2159() || m15345();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m32986() {
        return this.f42641.m2160();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32984(final int i, final long j, final RunnableC9828 runnableC9828) {
        Supplier supplier = new Supplier() { // from class: l.ᩴ᩷ᩴ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C13378.m32977(this.f64569, i, j, runnableC9828);
            }
        };
        return ((Boolean) this.f42641.m2153(Boolean.FALSE, supplier)).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Boolean m32977(C13378 c13378, int i, long j, RunnableC9828 runnableC9828) {
        if (c13378.mo15344() != i || c13378.f42638 != j) {
            return Boolean.FALSE;
        }
        runnableC9828.run();
        c13378.f42641.m2156(true);
        c13378.mo11039(false);
        return Boolean.TRUE;
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ۙ */
    public final void mo11036(int i) {
        this.f42642 = i;
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ᩵᩷ */
    public final int mo11048() {
        return this.f42642;
    }

    @Override // l.C5068, android.text.Editable
    public final Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f42642 == 0) {
            C0371 c0371 = this.f42641;
            c0371.getClass();
            c0371.m2153(null, new C21254(c0371, i, i2, charSequence, i3, i4));
        }
        return this;
    }

    @Override // l.C5068, android.text.Editable
    public final C5068 replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f42642 == 0) {
            C0371 c0371 = this.f42641;
            c0371.getClass();
            c0371.m2153(null, new C21254(c0371, i, i2, charSequence, i3, i4));
        }
        return this;
    }

    @Override // l.C5068, l.InterfaceC19106
    /* JADX INFO: renamed from: ֨ۙ */
    public final EnumC1844 mo11033() {
        C20859 c20859 = new C20859(1, this);
        return (EnumC1844) this.f42641.m2153(EnumC1844.UNAVAILABLE, c20859);
    }

    @Override // l.C5068, l.InterfaceC19106
    /* JADX INFO: renamed from: ۟ۙ */
    public final EnumC1844 mo11041() {
        C11140 c11140 = new C11140(0, this);
        return (EnumC1844) this.f42641.m2153(EnumC1844.UNAVAILABLE, c11140);
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11040(final Runnable runnable) {
        if (this.f42642 != 0) {
            return false;
        }
        return ((Boolean) this.f42641.m2153(Boolean.FALSE, new Supplier() { // from class: l.ܳ᩷ᩴ
            @Override // java.util.function.Supplier
            public final Object get() {
                this.f50737.m15354(runnable);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ۙ */
    public void mo11037(C6178 c6178) {
        c6178.writeInt(-483177132);
        C16759 c16759M41107 = this.f42640.m41107();
        try {
            c16759M41107.m39572(c6178);
            c16759M41107.close();
        } catch (Throwable th) {
            try {
                c16759M41107.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C13378 m32983(C20348 c20348, int i) {
        if (c20348.m46759() == -500019884) {
            char[] cArrM32980 = m32980(c20348, i);
            if (c20348.m46744() != i) {
                throw new IllegalArgumentException("Trailing memory text state bytes");
            }
            return new C13378(CharBuffer.wrap(cArrM32980));
        }
        if (i < c20348.m46744() + 4 || i - c20348.m46744() > c20348.available() || c20348.readInt() != -483177132) {
            throw new IllegalArgumentException("Invalid memory session state");
        }
        C17505 c17505M41052 = C17505.m41052("");
        try {
            C16759 c16759M41051 = C17505.m41051(c20348);
            try {
                if (c20348.m46744() != i) {
                    throw new IllegalArgumentException("Trailing memory session state bytes");
                }
                c17505M41052.m41097(c16759M41051);
                C13378 c13378 = new C13378(c17505M41052, null);
                c16759M41051.close();
                return c13378;
            } catch (Throwable th) {
                try {
                    c16759M41051.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            c17505M41052.m41087();
            throw new UncheckedIOException(e);
        } catch (Error e2) {
            e = e2;
            c17505M41052.m41087();
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            c17505M41052.m41087();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static char[] m32980(C20348 c20348, int i) {
        if (i < c20348.m46744() || i - c20348.m46744() < 8 || i - c20348.m46744() > c20348.available()) {
            throw new IllegalArgumentException("Truncated memory text state");
        }
        if (c20348.readInt() != -500019884) {
            throw new IllegalArgumentException("Invalid memory text magic");
        }
        int i2 = c20348.readInt();
        if (i2 < 0 || ((long) i2) * 2 > i - c20348.m46744()) {
            throw new IllegalArgumentException("Invalid memory text length");
        }
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = c20348.m46751();
        }
        return cArr;
    }

    @Override // l.C5068, java.lang.AutoCloseable
    public void close() {
        if (m15345()) {
            C21576.m49068(new RunnableC14303(1, this));
        } else {
            this.f42641.m2155(new RunnableC3073(1, this));
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void mo32985() {
        this.f42639 = isChanged();
        super.close();
        C17505 c17505 = this.f42640;
        if (c17505.m41113()) {
            return;
        }
        c17505.m41087();
    }
}
