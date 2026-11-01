package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.ۙۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4CY */
/* JADX INFO: loaded from: classes3.dex */
public final class C4362 implements InterfaceC10008 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C13536 f15598;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23683 f15599;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Inflater f15602;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f15601 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final CRC32 f15600 = new CRC32();

    public C4362(InterfaceC10008 interfaceC10008) {
        if (interfaceC10008 == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f15602 = inflater;
        int i = C0834.f3466;
        C17768 c17768 = new C17768(interfaceC10008);
        this.f15599 = c17768;
        this.f15598 = new C13536(c17768, inflater);
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ܰ */
    public final long mo2293(C6043 c6043, long j) throws IOException {
        short s;
        C17768 c17768;
        short s2;
        long j2;
        int i = this.f15601;
        CRC32 crc32 = this.f15600;
        InterfaceC23683 interfaceC23683 = this.f15599;
        if (i == 0) {
            C17768 c17769 = (C17768) interfaceC23683;
            c17769.mo16413(10L);
            C6043 c6044 = c17769.f56358;
            byte bM16423 = c6044.m16423(3L);
            boolean z = ((bM16423 >> 1) & 1) == 1;
            if (z) {
                m12207(c17769.f56358, 0L, 10L);
            }
            m12206(8075, c17769.readShort(), "ID1ID2");
            c17769.skip(8L);
            if (((bM16423 >> 2) & 1) == 1) {
                c17769.mo16413(2L);
                if (z) {
                    s2 = 65280;
                    m12207(c17769.f56358, 0L, 2L);
                } else {
                    s2 = 65280;
                }
                short s3 = c6044.readShort();
                Charset charset = C15653.f50852;
                long j3 = (short) (((s3 & 255) << 8) | ((s3 & s2) >>> 8));
                c17769.mo16413(j3);
                if (z) {
                    m12207(c17769.f56358, 0L, j3);
                    j2 = j3;
                } else {
                    j2 = j3;
                }
                c17769.skip(j2);
                s = s2;
            } else {
                s = 65280;
            }
            if (((bM16423 >> 3) & 1) == 1) {
                c17768 = c17769;
                long jM41334 = c17769.m41334((byte) 0, 0L, C17492.FOREVER_NS);
                if (jM41334 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m12207(c17768.f56358, 0L, jM41334 + 1);
                }
                c17768.skip(jM41334 + 1);
            } else {
                c17768 = c17769;
            }
            if (((bM16423 >> 4) & 1) == 1) {
                long jM41335 = c17768.m41334((byte) 0, 0L, C17492.FOREVER_NS);
                if (jM41335 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m12207(c17768.f56358, 0L, jM41335 + 1);
                }
                c17768.skip(jM41335 + 1);
            }
            if (z) {
                c17768.mo16413(2L);
                short s4 = c6044.readShort();
                Charset charset2 = C15653.f50852;
                m12206((short) (((s4 & 255) << 8) | ((s4 & s) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f15601 = 1;
        } else {
            s = 65280;
        }
        if (this.f15601 == 1) {
            long j4 = c6043.f20522;
            long jMo2293 = this.f15598.mo2293(c6043, 8192L);
            if (jMo2293 != -1) {
                m12207(c6043, j4, jMo2293);
                return jMo2293;
            }
            this.f15601 = 2;
        }
        if (this.f15601 != 2) {
            return -1L;
        }
        C17768 c177610 = (C17768) interfaceC23683;
        c177610.mo16413(4L);
        C6043 c6045 = c177610.f56358;
        int i2 = c6045.readInt();
        Charset charset3 = C15653.f50852;
        m12206(((i2 & 255) << 24) | ((i2 & (-16777216)) >>> 24) | ((i2 & 16711680) >>> 8) | ((i2 & s) << 8), (int) crc32.getValue(), "CRC");
        c177610.mo16413(4L);
        int i3 = c6045.readInt();
        m12206(((i3 & 255) << 24) | ((i3 & (-16777216)) >>> 24) | ((i3 & 16711680) >>> 8) | ((i3 & s) << 8), (int) this.f15602.getBytesWritten(), "ISIZE");
        this.f15601 = 3;
        if (c177610.mo16415()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo2292() {
        return ((C17768) this.f15599).f56357.mo2292();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15598.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12207(C6043 c6043, long j, long j2) {
        C18474 c18474 = c6043.f20521;
        while (true) {
            int i = c18474.f58877;
            int i2 = c18474.f58875;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c18474 = c18474.f58876;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c18474.f58875) + j);
            int iMin = (int) Math.min(c18474.f58877 - i3, j2);
            this.f15600.update(c18474.f58874, i3, iMin);
            j2 -= (long) iMin;
            c18474 = c18474.f58876;
            j = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12206(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
