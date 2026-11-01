package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.᩻ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54EF */
/* JADX INFO: loaded from: classes.dex */
public final class C23745 implements Closeable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Logger f76815 = Logger.getLogger(C2576.class.getName());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C13867 f76816;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10983 f76817;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f76818;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f76819;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6043 f76820;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f76818 = true;
        this.f76817.close();
    }

    public final synchronized void flush() {
        if (this.f76818) {
            throw new IOException("closed");
        }
        this.f76817.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52275(int i, int i2, boolean z) {
        if (this.f76818) {
            throw new IOException("closed");
        }
        m52274(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f76817.writeInt(i);
        this.f76817.writeInt(i2);
        this.f76817.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52276(int i, long j) {
        if (this.f76818) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            C2576.m8029("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        m52274(i, 4, (byte) 8, (byte) 0);
        this.f76817.writeInt((int) j);
        this.f76817.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52277(int i, EnumC9365 enumC9365) {
        if (this.f76818) {
            throw new IOException("closed");
        }
        if (enumC9365.f31735 == -1) {
            throw new IllegalArgumentException();
        }
        m52274(i, 4, (byte) 3, (byte) 0);
        this.f76817.writeInt(enumC9365.f31735);
        this.f76817.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52278(int i, EnumC9365 enumC9365, byte[] bArr) {
        if (this.f76818) {
            throw new IOException("closed");
        }
        if (enumC9365.f31735 == -1) {
            C2576.m8029("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
        m52274(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f76817.writeInt(i);
        this.f76817.writeInt(enumC9365.f31735);
        if (bArr.length > 0) {
            this.f76817.write(bArr);
        }
        this.f76817.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52280(C4631 c4631) {
        if (this.f76818) {
            throw new IOException("closed");
        }
        this.f76819 = c4631.m12789(this.f76819);
        if (c4631.m12782() != -1) {
            this.f76816.m33703(c4631.m12782());
        }
        m52274(0, 0, (byte) 4, (byte) 1);
        this.f76817.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52281(boolean z, int i, C6043 c6043, int i2) {
        if (this.f76818) {
            throw new IOException("closed");
        }
        m52274(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.f76817.mo5901(c6043, i2);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52283(ArrayList arrayList, int i, boolean z) {
        if (this.f76818) {
            throw new IOException("closed");
        }
        m52279(arrayList, i, z);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52284(C4631 c4631) {
        int i;
        if (this.f76818) {
            throw new IOException("closed");
        }
        int i2 = 0;
        m52274(0, c4631.m12781() * 6, (byte) 4, (byte) 0);
        while (i2 < 10) {
            if (c4631.m12787(i2)) {
                if (i2 == 4) {
                    i = 3;
                } else {
                    i = i2 == 7 ? 4 : i2;
                }
                this.f76817.writeShort(i);
                this.f76817.writeInt(c4631.m12783(i2));
            }
            i2++;
        }
        this.f76817.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52273() {
        if (this.f76818) {
            throw new IOException("closed");
        }
        Logger logger = f76815;
        if (logger.isLoggable(Level.FINE)) {
            String strMo34946 = C2576.f10149.mo34946();
            byte[] bArr = C0140.f1168;
            Locale locale = Locale.US;
            logger.fine(">> CONNECTION " + strMo34946);
        }
        this.f76817.write(C2576.f10149.mo34947());
        this.f76817.flush();
    }

    public C23745(InterfaceC10983 interfaceC10983) {
        this.f76817 = interfaceC10983;
        C6043 c6043 = new C6043();
        this.f76820 = c6043;
        this.f76816 = new C13867(c6043);
        this.f76819 = 16384;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m52282() {
        return this.f76819;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52274(int i, int i2, byte b, byte b2) {
        Level level = Level.FINE;
        Logger logger = f76815;
        if (logger.isLoggable(level)) {
            logger.fine(C2576.m8028(false, i, i2, b, b2));
        }
        int i3 = this.f76819;
        if (i2 > i3) {
            C2576.m8029("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            C2576.m8029("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        InterfaceC10983 interfaceC10983 = this.f76817;
        interfaceC10983.writeByte((i2 >>> 16) & 255);
        interfaceC10983.writeByte((i2 >>> 8) & 255);
        interfaceC10983.writeByte(i2 & 255);
        interfaceC10983.writeByte(b & 255);
        interfaceC10983.writeByte(b2 & 255);
        interfaceC10983.writeInt(i & Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52279(ArrayList arrayList, int i, boolean z) throws IOException {
        if (this.f76818) {
            throw new IOException("closed");
        }
        this.f76816.m33705(arrayList);
        C6043 c6043 = this.f76820;
        long size = c6043.size();
        int iMin = (int) Math.min(this.f76819, size);
        long j = iMin;
        byte b = size == j ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        m52274(i, iMin, (byte) 1, b);
        InterfaceC10983 interfaceC10983 = this.f76817;
        interfaceC10983.mo5901(c6043, j);
        if (size > j) {
            long j2 = size - j;
            while (j2 > 0) {
                int iMin2 = (int) Math.min(this.f76819, j2);
                long j3 = iMin2;
                j2 -= j3;
                m52274(i, iMin2, (byte) 9, j2 == 0 ? (byte) 4 : (byte) 0);
                interfaceC10983.mo5901(c6043, j3);
            }
        }
    }
}
