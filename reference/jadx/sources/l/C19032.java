package l;

import com.google.android.material.motion.MotionUtils;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ᩳۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O4DO */
/* JADX INFO: loaded from: classes5.dex */
public final class C19032 implements InterfaceC11573 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1879 f61654 = new C1879();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7099 f61655;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f61656;

    public C19032(InterfaceC7099 interfaceC7099) {
        if (interfaceC7099 == null) {
            throw new NullPointerException("sink == null");
        }
        this.f61655 = interfaceC7099;
    }

    @Override // l.InterfaceC11573
    /* JADX INFO: renamed from: ֫ */
    public final C1879 mo29106() {
        return this.f61654;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۙ */
    public final void mo6066(C1879 c1879, long j) {
        if (this.f61656) {
            throw new IllegalStateException("closed");
        }
        this.f61654.mo6066(c1879, j);
        mo6431();
    }

    @Override // l.InterfaceC11573
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11573 mo6435(C16794 c16794) {
        if (this.f61656) {
            throw new IllegalStateException("closed");
        }
        this.f61654.m6441(c16794);
        mo6431();
        return this;
    }

    @Override // l.InterfaceC11573
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC11573 mo6442(String str) {
        if (this.f61656) {
            throw new IllegalStateException("closed");
        }
        C1879 c1879 = this.f61654;
        c1879.getClass();
        c1879.m6437(0, str.length(), str);
        mo6431();
        return this;
    }

    @Override // l.InterfaceC11573
    public final InterfaceC11573 write(byte[] bArr) {
        if (this.f61656) {
            throw new IllegalStateException("closed");
        }
        C1879 c1879 = this.f61654;
        c1879.getClass();
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        c1879.write(bArr, 0, bArr.length);
        mo6431();
        return this;
    }

    @Override // l.InterfaceC11573
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC11573 mo6452(int i, int i2, byte[] bArr) {
        if (this.f61656) {
            throw new IllegalStateException("closed");
        }
        this.f61654.write(bArr, i, i2);
        mo6431();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f61656) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f61654.write(byteBuffer);
        mo6431();
        return iWrite;
    }

    @Override // l.InterfaceC11573
    public final InterfaceC11573 writeByte(int i) {
        if (this.f61656) {
            throw new IllegalStateException("closed");
        }
        this.f61654.m6455writeByte(i);
        mo6431();
        return this;
    }

    @Override // l.InterfaceC11573
    public final InterfaceC11573 writeShort(int i) {
        if (this.f61656) {
            throw new IllegalStateException("closed");
        }
        this.f61654.m6457writeShort(i);
        mo6431();
        return this;
    }

    @Override // l.InterfaceC11573
    public final InterfaceC11573 writeInt(int i) {
        if (this.f61656) {
            throw new IllegalStateException("closed");
        }
        this.f61654.m6456writeInt(i);
        mo6431();
        return this;
    }

    @Override // l.InterfaceC11573
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC11573 mo6447(long j) {
        if (this.f61656) {
            throw new IllegalStateException("closed");
        }
        this.f61654.m6448(j);
        mo6431();
        return this;
    }

    @Override // l.InterfaceC11573
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC11573 mo6453(long j) {
        if (this.f61656) {
            throw new IllegalStateException("closed");
        }
        this.f61654.m6454(j);
        mo6431();
        return this;
    }

    @Override // l.InterfaceC11573
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC11573 mo6431() {
        if (this.f61656) {
            throw new IllegalStateException("closed");
        }
        C1879 c1879 = this.f61654;
        long jM6450 = c1879.m6450();
        if (jM6450 > 0) {
            this.f61655.mo6066(c1879, jM6450);
        }
        return this;
    }

    @Override // l.InterfaceC11573
    /* JADX INFO: renamed from: ۫ۤ */
    public final OutputStream mo6445() {
        return new C7845(this);
    }

    @Override // l.InterfaceC11573, l.InterfaceC7099, java.io.Flushable
    public final void flush() {
        if (this.f61656) {
            throw new IllegalStateException("closed");
        }
        C1879 c1879 = this.f61654;
        long j = c1879.f6314;
        InterfaceC7099 interfaceC7099 = this.f61655;
        if (j > 0) {
            interfaceC7099.mo6066(c1879, j);
        }
        interfaceC7099.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f61656;
    }

    @Override // l.InterfaceC7099, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        InterfaceC7099 interfaceC7099 = this.f61655;
        if (this.f61656) {
            return;
        }
        C1879 c1879 = this.f61654;
        long j = c1879.f6314;
        if (j > 0) {
            interfaceC7099.mo6066(c1879, j);
        }
        th = null;
        try {
            interfaceC7099.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f61656 = true;
        if (th == null) {
            return;
        }
        Charset charset = C11222.f35388;
        throw th;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo6067() {
        return this.f61655.mo6067();
    }

    public final String toString() {
        return "buffer(" + this.f61655 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
