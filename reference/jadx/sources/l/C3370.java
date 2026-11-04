package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.ۗۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4CY */
/* JADX INFO: loaded from: classes3.dex */
public final class C3370 implements InterfaceC13810 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC25000 f10980;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20524 f10982;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Inflater f10983;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f10979 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CRC32 f10981 = new CRC32();

    public C3370(InterfaceC13810 interfaceC13810) {
        if (interfaceC13810 == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f10983 = inflater;
        int i = C14556.f45862;
        C1133 c1133 = new C1133(interfaceC13810);
        this.f10980 = c1133;
        this.f10982 = new C20524(c1133, inflater);
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷ */
    public final long mo4186(C1879 c1879, long j) throws IOException {
        short s;
        C1133 c1133;
        short s2;
        long j2;
        int i = this.f10979;
        CRC32 crc32 = this.f10981;
        InterfaceC25000 interfaceC25000 = this.f10980;
        if (i == 0) {
            C1133 c1134 = (C1133) interfaceC25000;
            c1134.mo4184(10L);
            C1879 c18710 = c1134.f4207;
            byte bM6449 = c18710.m6449(3L);
            boolean z = ((bM6449 >> 1) & 1) == 1;
            if (z) {
                m11072(c1134.f4207, 0L, 10L);
            }
            m11071(8075, c1134.readShort(), "ID1ID2");
            c1134.skip(8L);
            if (((bM6449 >> 2) & 1) == 1) {
                c1134.mo4184(2L);
                if (z) {
                    s2 = 65280;
                    m11072(c1134.f4207, 0L, 2L);
                } else {
                    s2 = 65280;
                }
                short s3 = c18710.readShort();
                Charset charset = C11222.f35388;
                long j3 = (short) (((s3 & 255) << 8) | ((s3 & s2) >>> 8));
                c1134.mo4184(j3);
                if (z) {
                    m11072(c1134.f4207, 0L, j3);
                    j2 = j3;
                } else {
                    j2 = j3;
                }
                c1134.skip(j2);
                s = s2;
            } else {
                s = 65280;
            }
            if (((bM6449 >> 3) & 1) == 1) {
                c1133 = c1134;
                long jM4174 = c1134.m4174((byte) 0, 0L, C25227.FOREVER_NS);
                if (jM4174 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m11072(c1133.f4207, 0L, jM4174 + 1);
                }
                c1133.skip(jM4174 + 1);
            } else {
                c1133 = c1134;
            }
            if (((bM6449 >> 4) & 1) == 1) {
                long jM4175 = c1133.m4174((byte) 0, 0L, C25227.FOREVER_NS);
                if (jM4175 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m11072(c1133.f4207, 0L, jM4175 + 1);
                }
                c1133.skip(jM4175 + 1);
            }
            if (z) {
                c1133.mo4184(2L);
                short s4 = c18710.readShort();
                Charset charset2 = C11222.f35388;
                m11071((short) (((s4 & 255) << 8) | ((s4 & s) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f10979 = 1;
        } else {
            s = 65280;
        }
        if (this.f10979 == 1) {
            long j4 = c1879.f6314;
            long jMo4186 = this.f10982.mo4186(c1879, 8192L);
            if (jMo4186 != -1) {
                m11072(c1879, j4, jMo4186);
                return jMo4186;
            }
            this.f10979 = 2;
        }
        if (this.f10979 != 2) {
            return -1L;
        }
        C1133 c1135 = (C1133) interfaceC25000;
        c1135.mo4184(4L);
        C1879 c18711 = c1135.f4207;
        int i2 = c18711.readInt();
        Charset charset3 = C11222.f35388;
        m11071(((i2 & 255) << 24) | ((i2 & (-16777216)) >>> 24) | ((i2 & 16711680) >>> 8) | ((i2 & s) << 8), (int) crc32.getValue(), "CRC");
        c1135.mo4184(4L);
        int i3 = c18711.readInt();
        m11071(((i3 & 255) << 24) | ((i3 & (-16777216)) >>> 24) | ((i3 & 16711680) >>> 8) | ((i3 & s) << 8), (int) this.f10983.getBytesWritten(), "ISIZE");
        this.f10979 = 3;
        if (c1135.mo4182()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo4181() {
        return ((C1133) this.f10980).f4208.mo4181();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f10982.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11072(C1879 c1879, long j, long j2) {
        C9335 c9335 = c1879.f6313;
        while (true) {
            int i = c9335.f30348;
            int i2 = c9335.f30347;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c9335 = c9335.f30344;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c9335.f30347) + j);
            int iMin = (int) Math.min(c9335.f30348 - i3, j2);
            this.f10981.update(c9335.f30343, i3, iMin);
            j2 -= (long) iMin;
            c9335 = c9335.f30344;
            j = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11071(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
