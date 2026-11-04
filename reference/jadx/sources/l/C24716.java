package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.᩻֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54EF */
/* JADX INFO: loaded from: classes.dex */
public final class C24716 implements Closeable {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Logger f79993 = Logger.getLogger(C6180.class.getName());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f79994;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC11573 f79995;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f79996;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20350 f79997;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1879 f79998;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f79996 = true;
        this.f79995.close();
    }

    public final synchronized void flush() {
        if (this.f79996) {
            throw new IOException("closed");
        }
        this.f79995.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m55184(int i, int i2, boolean z) {
        if (this.f79996) {
            throw new IOException("closed");
        }
        m55183(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f79995.writeInt(i);
        this.f79995.writeInt(i2);
        this.f79995.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m55185(int i, long j) {
        if (this.f79996) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            C6180.m17814("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        m55183(i, 4, (byte) 8, (byte) 0);
        this.f79995.writeInt((int) j);
        this.f79995.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m55186(int i, EnumC15874 enumC15874) {
        if (this.f79996) {
            throw new IOException("closed");
        }
        if (enumC15874.f51614 == -1) {
            throw new IllegalArgumentException();
        }
        m55183(i, 4, (byte) 3, (byte) 0);
        this.f79995.writeInt(enumC15874.f51614);
        this.f79995.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m55187(int i, EnumC15874 enumC15874, byte[] bArr) {
        if (this.f79996) {
            throw new IOException("closed");
        }
        if (enumC15874.f51614 == -1) {
            C6180.m17814("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
        m55183(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f79995.writeInt(i);
        this.f79995.writeInt(enumC15874.f51614);
        if (bArr.length > 0) {
            this.f79995.write(bArr);
        }
        this.f79995.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m55189(C3086 c3086) {
        if (this.f79996) {
            throw new IOException("closed");
        }
        this.f79994 = c3086.m10061(this.f79994);
        if (c3086.m10054() != -1) {
            this.f79997.m46764(c3086.m10054());
        }
        m55183(0, 0, (byte) 4, (byte) 1);
        this.f79995.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m55190(boolean z, int i, C1879 c1879, int i2) {
        if (this.f79996) {
            throw new IOException("closed");
        }
        m55183(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.f79995.mo6066(c1879, i2);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m55192(ArrayList arrayList, int i, boolean z) {
        if (this.f79996) {
            throw new IOException("closed");
        }
        m55188(arrayList, i, z);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m55193(C3086 c3086) {
        int i;
        if (this.f79996) {
            throw new IOException("closed");
        }
        int i2 = 0;
        m55183(0, c3086.m10062() * 6, (byte) 4, (byte) 0);
        while (i2 < 10) {
            if (c3086.m10059(i2)) {
                if (i2 == 4) {
                    i = 3;
                } else {
                    i = i2 == 7 ? 4 : i2;
                }
                this.f79995.writeShort(i);
                this.f79995.writeInt(c3086.m10055(i2));
            }
            i2++;
        }
        this.f79995.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m55182() {
        if (this.f79996) {
            throw new IOException("closed");
        }
        Logger logger = f79993;
        if (logger.isLoggable(Level.FINE)) {
            String strMo23091 = C6180.f21052.mo23091();
            byte[] bArr = C19822.f63715;
            Locale locale = Locale.US;
            logger.fine(">> CONNECTION " + strMo23091);
        }
        this.f79995.write(C6180.f21052.mo23089());
        this.f79995.flush();
    }

    public C24716(InterfaceC11573 interfaceC11573) {
        this.f79995 = interfaceC11573;
        C1879 c1879 = new C1879();
        this.f79998 = c1879;
        this.f79997 = new C20350(c1879);
        this.f79994 = 16384;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m55191() {
        return this.f79994;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55183(int i, int i2, byte b, byte b2) {
        Level level = Level.FINE;
        Logger logger = f79993;
        if (logger.isLoggable(level)) {
            logger.fine(C6180.m17813(false, i, i2, b, b2));
        }
        int i3 = this.f79994;
        if (i2 > i3) {
            C6180.m17814("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            C6180.m17814("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        InterfaceC11573 interfaceC11573 = this.f79995;
        interfaceC11573.writeByte((i2 >>> 16) & 255);
        interfaceC11573.writeByte((i2 >>> 8) & 255);
        interfaceC11573.writeByte(i2 & 255);
        interfaceC11573.writeByte(b & 255);
        interfaceC11573.writeByte(b2 & 255);
        interfaceC11573.writeInt(i & Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55188(ArrayList arrayList, int i, boolean z) throws IOException {
        if (this.f79996) {
            throw new IOException("closed");
        }
        this.f79997.m46766(arrayList);
        C1879 c1879 = this.f79998;
        long size = c1879.size();
        int iMin = (int) Math.min(this.f79994, size);
        long j = iMin;
        byte b = size == j ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        m55183(i, iMin, (byte) 1, b);
        InterfaceC11573 interfaceC11573 = this.f79995;
        interfaceC11573.mo6066(c1879, j);
        if (size > j) {
            long j2 = size - j;
            while (j2 > 0) {
                int iMin2 = (int) Math.min(this.f79994, j2);
                long j3 = iMin2;
                j2 -= j3;
                m55183(i, iMin2, (byte) 9, j2 == 0 ? (byte) 4 : (byte) 0);
                interfaceC11573.mo6066(c1879, j3);
            }
        }
    }
}
