package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۬۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes3.dex */
public final class C12980 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0219 f43291;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9762 f43292;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5218 f43293;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f43294;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f43295;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f43296 = new ArrayDeque();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f43297;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f43298;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1999 f43299;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public IOException f43300;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C3410 f43301;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f43302;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] f43303;

    public C12980(int i, int i2, C5218 c5218, C1999 c1999, C9762 c9762, C3410 c3410, C0219 c0219) {
        this.f43303 = new byte[Math.max(1, i)];
        this.f43293 = c5218;
        this.f43299 = c1999;
        this.f43292 = c9762;
        this.f43301 = c3410;
        this.f43291 = c0219;
        this.f43297 = Math.max(1, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m32106();
        int i2 = this.f43298;
        byte[] bArr = this.f43303;
        if (i2 == bArr.length) {
            m32100();
        }
        int i3 = this.f43298;
        this.f43298 = i3 + 1;
        bArr[i3] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m32106();
        C13638.checkFromIndexSize(i, i2, bArr.length);
        while (i2 > 0) {
            byte[] bArr2 = this.f43303;
            int iMin = Math.min(i2, bArr2.length - this.f43298);
            System.arraycopy(bArr, i, bArr2, this.f43298, iMin);
            int i3 = this.f43298 + iMin;
            this.f43298 = i3;
            i += iMin;
            i2 -= iMin;
            if (i3 == bArr2.length) {
                m32100();
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m32106();
        m32100();
        m32104();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f43302) {
            return;
        }
        boolean z = false;
        boolean z2 = this.f43300 != null;
        if (!z2) {
            try {
                m32100();
                m32104();
            } catch (IOException e) {
                e = e;
            }
        }
        e = null;
        try {
            this.f43299.run();
        } catch (IOException e2) {
            e = C16508.m38787(e, e2);
        }
        if (!z2 && e == null && this.f43296.isEmpty()) {
            z = true;
        }
        InterfaceC22858 interfaceC22858 = z ? this.f43292 : this.f43301;
        if (!z) {
            m32102();
        }
        try {
            interfaceC22858.run();
        } catch (IOException e3) {
            e = C16508.m38787(e, e3);
        }
        this.f43302 = true;
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m32100() throws IOException {
        int i = this.f43298;
        if (i == 0) {
            return;
        }
        try {
            byte[] bArrCopyOf = Arrays.copyOf(this.f43303, i);
            long j = this.f43294;
            ArrayDeque arrayDeque = this.f43296;
            while (arrayDeque.size() >= this.f43297) {
                m32101();
            }
            arrayDeque.addLast(m32105(j, i, bArrCopyOf));
            this.f43294 += (long) i;
            this.f43298 = 0;
        } catch (IOException e) {
            this.f43300 = e;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C0984 m32105(long j, int i, byte[] bArr) throws IOException {
        C5218 c5218 = this.f43293;
        c5218.getClass();
        try {
            C3218 c3218 = c5218.f18072.f14138;
            return new C0984(bArr, i, j, new C0279(c3218, c3218.m9644(j, i, bArr)));
        } catch (C10360 e) {
            throw new IOException(e.getMessage(), e);
        } catch (C13865 e2) {
            throw new IOException(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m32104() {
        while (!this.f43296.isEmpty()) {
            m32101();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m32101() throws IOException {
        ArrayDeque arrayDeque = this.f43296;
        C0984 c0984 = (C0984) arrayDeque.removeFirst();
        try {
            m32103(c0984);
        } catch (IOException e) {
            this.f43291.getClass();
            if (!C16508.m38807((Exception) e) || this.f43295) {
                this.f43300 = e;
                ((C0279) c0984.f4622).m1791();
                m32102();
                throw e;
            }
            this.f43295 = true;
            ArrayList<C0984> arrayList = new ArrayList();
            arrayList.add(c0984);
            arrayList.addAll(arrayDeque);
            m32102();
            arrayDeque.clear();
            try {
                this.f43297 = Math.max(1, Math.min(this.f43297, this.f43293.m14399(c0984.f4625)));
                for (C0984 c0985 : arrayList) {
                    while (arrayDeque.size() >= this.f43297) {
                        m32101();
                    }
                    byte[] bArr = c0985.f4623;
                    arrayDeque.addLast(m32105(c0985.f4625, c0985.f4624, bArr));
                }
                m32104();
            } catch (IOException e2) {
                this.f43300 = C16508.m38787(e, e2);
                m32102();
                throw this.f43300;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32103(C0984 c0984) throws IOException {
        long jM1790 = ((C0279) c0984.f4622).m1790();
        int i = c0984.f4624;
        if (jM1790 == i) {
            long unused = c0984.f4625;
        } else {
            if (jM1790 <= 0) {
                throw new IOException("SMB write returned no progress");
            }
            throw new IOException("SMB write returned partial progress: expected " + i + ", actual " + jM1790);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32102() {
        while (true) {
            ArrayDeque arrayDeque = this.f43296;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((C0279) ((C0984) arrayDeque.removeFirst()).f4622).m1791();
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m32106() throws IOException {
        if (this.f43302) {
            throw new IOException("Stream is closed");
        }
        IOException iOException = this.f43300;
        if (iOException != null) {
            throw iOException;
        }
    }
}
