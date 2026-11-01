package l;

import com.google.android.material.motion.MotionUtils;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܶۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O4DO */
/* JADX INFO: loaded from: classes5.dex */
public final class C14947 implements InterfaceC10983 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC8597 f48763;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6043 f48764 = new C6043();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f48765;

    public C14947(InterfaceC8597 interfaceC8597) {
        if (interfaceC8597 == null) {
            throw new NullPointerException("sink == null");
        }
        this.f48763 = interfaceC8597;
    }

    @Override // l.InterfaceC10983
    /* JADX INFO: renamed from: ۘ */
    public final C6043 mo16399() {
        return this.f48764;
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۙ */
    public final void mo5901(C6043 c6043, long j) {
        if (this.f48765) {
            throw new IllegalStateException("closed");
        }
        this.f48764.mo5901(c6043, j);
        mo16425();
    }

    @Override // l.InterfaceC10983
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC10983 mo16405(C14511 c14511) {
        if (this.f48765) {
            throw new IllegalStateException("closed");
        }
        this.f48764.m16412(c14511);
        mo16425();
        return this;
    }

    @Override // l.InterfaceC10983
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10983 mo16418(String str) {
        if (this.f48765) {
            throw new IllegalStateException("closed");
        }
        C6043 c6043 = this.f48764;
        c6043.getClass();
        c6043.m16408(0, str.length(), str);
        mo16425();
        return this;
    }

    @Override // l.InterfaceC10983
    public final InterfaceC10983 write(byte[] bArr) {
        if (this.f48765) {
            throw new IllegalStateException("closed");
        }
        C6043 c6043 = this.f48764;
        c6043.getClass();
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        c6043.write(bArr, 0, bArr.length);
        mo16425();
        return this;
    }

    @Override // l.InterfaceC10983
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC10983 mo16397(int i, int i2, byte[] bArr) {
        if (this.f48765) {
            throw new IllegalStateException("closed");
        }
        this.f48764.write(bArr, i, i2);
        mo16425();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f48765) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f48764.write(byteBuffer);
        mo16425();
        return iWrite;
    }

    @Override // l.InterfaceC10983
    public final InterfaceC10983 writeByte(int i) {
        if (this.f48765) {
            throw new IllegalStateException("closed");
        }
        this.f48764.m16434writeByte(i);
        mo16425();
        return this;
    }

    @Override // l.InterfaceC10983
    public final InterfaceC10983 writeShort(int i) {
        if (this.f48765) {
            throw new IllegalStateException("closed");
        }
        this.f48764.m16436writeShort(i);
        mo16425();
        return this;
    }

    @Override // l.InterfaceC10983
    public final InterfaceC10983 writeInt(int i) {
        if (this.f48765) {
            throw new IllegalStateException("closed");
        }
        this.f48764.m16435writeInt(i);
        mo16425();
        return this;
    }

    @Override // l.InterfaceC10983
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC10983 mo16428(long j) {
        if (this.f48765) {
            throw new IllegalStateException("closed");
        }
        this.f48764.m16429(j);
        mo16425();
        return this;
    }

    @Override // l.InterfaceC10983
    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC10983 mo16431(long j) {
        if (this.f48765) {
            throw new IllegalStateException("closed");
        }
        this.f48764.m16432(j);
        mo16425();
        return this;
    }

    @Override // l.InterfaceC10983
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC10983 mo16425() {
        if (this.f48765) {
            throw new IllegalStateException("closed");
        }
        C6043 c6043 = this.f48764;
        long jM16417 = c6043.m16417();
        if (jM16417 > 0) {
            this.f48763.mo5901(c6043, jM16417);
        }
        return this;
    }

    @Override // l.InterfaceC10983
    /* JADX INFO: renamed from: ᩹ۨ */
    public final OutputStream mo16430() {
        return new C22708(this);
    }

    @Override // l.InterfaceC10983, l.InterfaceC8597, java.io.Flushable
    public final void flush() {
        if (this.f48765) {
            throw new IllegalStateException("closed");
        }
        C6043 c6043 = this.f48764;
        long j = c6043.f20522;
        InterfaceC8597 interfaceC8597 = this.f48763;
        if (j > 0) {
            interfaceC8597.mo5901(c6043, j);
        }
        interfaceC8597.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f48765;
    }

    @Override // l.InterfaceC8597, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        InterfaceC8597 interfaceC8597 = this.f48763;
        if (this.f48765) {
            return;
        }
        C6043 c6043 = this.f48764;
        long j = c6043.f20522;
        if (j > 0) {
            interfaceC8597.mo5901(c6043, j);
        }
        th = null;
        try {
            interfaceC8597.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f48765 = true;
        if (th == null) {
            return;
        }
        Charset charset = C15653.f50852;
        throw th;
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo5902() {
        return this.f48763.mo5902();
    }

    public final String toString() {
        return "buffer(" + this.f48763 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
