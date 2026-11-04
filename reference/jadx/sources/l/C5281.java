package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚ֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes2.dex */
public final class C5281 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public IOException f18595;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f18596 = new ArrayDeque();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f18597;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f18598;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f18599;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C7297 f18600;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final byte[] f18601;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f18602;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C19451 f18603;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8788 f18604;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13921 f18605;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14008 f18606;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f18607;

    public C5281(int i, int i2, C19451 c19451, C8788 c8788, C7297 c7297, C14008 c14008, C13921 c13921) {
        this.f18601 = new byte[Math.max(1, i)];
        this.f18603 = c19451;
        this.f18604 = c8788;
        this.f18600 = c7297;
        this.f18606 = c14008;
        this.f18605 = c13921;
        this.f18599 = Math.max(1, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m15877();
        int i2 = this.f18597;
        byte[] bArr = this.f18601;
        if (i2 == bArr.length) {
            m15876();
        }
        int i3 = this.f18597;
        this.f18597 = i3 + 1;
        bArr[i3] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m15877();
        C17359.checkFromIndexSize(i, i2, bArr.length);
        while (i2 > 0) {
            byte[] bArr2 = this.f18601;
            int iMin = Math.min(i2, bArr2.length - this.f18597);
            System.arraycopy(bArr, i, bArr2, this.f18597, iMin);
            int i3 = this.f18597 + iMin;
            this.f18597 = i3;
            i += iMin;
            i2 -= iMin;
            if (i3 == bArr2.length) {
                m15876();
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m15877();
        m15876();
        m15879();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f18607) {
            return;
        }
        boolean z = false;
        boolean z2 = this.f18595 != null;
        if (!z2) {
            try {
                m15876();
                m15879();
            } catch (IOException e) {
                e = e;
            }
        }
        e = null;
        try {
            this.f18604.run();
        } catch (IOException e2) {
            e = C0060.m980(e, e2);
        }
        if (!z2 && e == null && this.f18596.isEmpty()) {
            z = true;
        }
        InterfaceC24673 interfaceC24673 = z ? this.f18600 : this.f18606;
        if (!z) {
            m15873();
        }
        try {
            interfaceC24673.run();
        } catch (IOException e3) {
            e = C0060.m980(e, e3);
        }
        this.f18607 = true;
        if (e != null) {
            throw e;
        }
    }

    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m15876() throws IOException {
        int i = this.f18597;
        if (i == 0) {
            return;
        }
        try {
            byte[] bArrCopyOf = Arrays.copyOf(this.f18601, i);
            long j = this.f18602;
            ArrayDeque arrayDeque = this.f18596;
            while (arrayDeque.size() >= this.f18599) {
                m15875();
            }
            arrayDeque.addLast(m15878(j, i, bArrCopyOf));
            this.f18602 += (long) i;
            this.f18597 = 0;
        } catch (IOException e) {
            this.f18595 = e;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C12738 m15878(long j, int i, byte[] bArr) throws IOException {
        C19451 c19451 = this.f18603;
        c19451.getClass();
        try {
            C3395 c3395 = c19451.f62824.f5357;
            return new C12738(bArr, i, j, new C17959(c3395, c3395.m11113(j, i, bArr)));
        } catch (C22172 e) {
            throw new IOException(e.getMessage(), e);
        } catch (C12082 e2) {
            throw new IOException(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m15879() {
        while (!this.f18596.isEmpty()) {
            m15875();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m15875() throws IOException {
        ArrayDeque arrayDeque = this.f18596;
        C12738 c12738 = (C12738) arrayDeque.removeFirst();
        try {
            m15874(c12738);
        } catch (IOException e) {
            this.f18605.getClass();
            if (!C0060.m1000((Exception) e) || this.f18598) {
                this.f18595 = e;
                ((C17959) c12738.f40774).m41913();
                m15873();
                throw e;
            }
            this.f18598 = true;
            ArrayList<C12738> arrayList = new ArrayList();
            arrayList.add(c12738);
            arrayList.addAll(arrayDeque);
            m15873();
            arrayDeque.clear();
            try {
                this.f18599 = Math.max(1, Math.min(this.f18599, this.f18603.m44938(c12738.f40773)));
                for (C12738 c12739 : arrayList) {
                    while (arrayDeque.size() >= this.f18599) {
                        m15875();
                    }
                    byte[] bArr = c12739.f40771;
                    arrayDeque.addLast(m15878(c12739.f40773, c12739.f40772, bArr));
                }
                m15879();
            } catch (IOException e2) {
                this.f18595 = C0060.m980(e, e2);
                m15873();
                throw this.f18595;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15874(C12738 c12738) throws IOException {
        long jM41912 = ((C17959) c12738.f40774).m41912();
        int i = c12738.f40772;
        if (jM41912 == i) {
            long unused = c12738.f40773;
        } else {
            if (jM41912 <= 0) {
                throw new IOException("SMB write returned no progress");
            }
            throw new IOException("SMB write returned partial progress: expected " + i + ", actual " + jM41912);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15873() {
        while (true) {
            ArrayDeque arrayDeque = this.f18596;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((C17959) ((C12738) arrayDeque.removeFirst()).f40774).m41913();
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m15877() throws IOException {
        if (this.f18607) {
            throw new IOException("Stream is closed");
        }
        IOException iOException = this.f18595;
        if (iOException != null) {
            throw iOException;
        }
    }
}
