package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.Deflater;
import net.sf.sevenzipjbinding.SevenZip;

/* JADX INFO: renamed from: l.᩻ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4GB */
/* JADX INFO: loaded from: classes.dex */
public final class C25179 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f81371;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f81372;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C4345 f81373;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public OutputStream f81374;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f81375;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte[] f81376;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f81377;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayList f81378;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Charset f81379;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final long f81380;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f81381;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f81382;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1312 f81383;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C25157 f81384;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f81385;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13961 f81386;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public String f81387;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C2803 f81388;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m56132() {
        this.f81379 = StandardCharsets.UTF_8;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m56118(C25157 c25157) throws IOException {
        byte[] bArrM54601;
        boolean z = c25157.f81322 || c25157.f81326;
        byte[] bArr = c25157.f81330;
        byte[] bArr2 = c25157.f81332;
        if (z) {
            byte[] bArr3 = new byte[24];
            C17719.m41495(c25157.f81312, 0, bArr3);
            C17719.m41495(c25157.f81327, 8, bArr3);
            C17719.m41495(c25157.f81313, 16, bArr3);
            bArrM54601 = C24411.m54599(1, c25157.f81325, bArr3);
        } else {
            bArrM54601 = C24411.m54601(1, c25157.f81325);
        }
        m56106(33639248);
        int i = 45;
        int i2 = (c25157.f81322 || c25157.f81326) ? 45 : 20;
        C13961 c13961 = this.f81386;
        c13961.write(i2 & 255);
        c13961.write(c25157.f81323 & 255);
        if (!c25157.f81322 && !c25157.f81326) {
            i = (c25157.f81321 == 0 && (1 & c25157.f81320) == 0) ? 10 : 20;
        }
        m56116(i);
        m56116(c25157.f81320);
        m56116(c25157.f81321);
        m56106(c25157.f81333);
        m56106(c25157.f81310);
        if (z) {
            m56117(4294967295L);
            m56117(4294967295L);
        } else {
            m56117(c25157.f81327);
            m56117(c25157.f81312);
        }
        m56116(bArr2.length);
        m56116(bArrM54601.length);
        m56116(bArr.length);
        m56116(c25157.f81317);
        m56116(c25157.f81318);
        m56106(c25157.f81328);
        if (z) {
            m56117(4294967295L);
        } else {
            m56117(c25157.f81313);
        }
        m56108(bArr2);
        m56108(bArrM54601);
        m56108(bArr);
    }

    public C25179(String str) {
        this(C14584.m35193(str, new String[0]), -1L, null);
    }

    public C25179(AbstractC22044 abstractC22044) {
        this(abstractC22044, -1L, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C25179 m56102(AbstractC22044 abstractC22044) {
        C13961 c13961M49855 = abstractC22044.m49855("rw");
        try {
            if (c13961M49855.length() != 0) {
                throw new IOException("ZIP output file must be empty");
            }
            return new C25179(abstractC22044, c13961M49855);
        } catch (IOException | RuntimeException e) {
            try {
                c13961M49855.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public C25179(AbstractC22044 abstractC22044, C13961 c13961) {
        this.f81378 = new ArrayList();
        this.f81381 = 8;
        this.f81375 = -1;
        this.f81379 = StandardCharsets.UTF_8;
        this.f81373 = new C4345();
        this.f81376 = new byte[8192];
        this.f81372 = abstractC22044;
        this.f81386 = c13961;
        this.f81380 = -1L;
        this.f81385 = C16973.m40025(abstractC22044.getName().toLowerCase(Locale.ROOT));
    }

    public C25179(AbstractC22044 abstractC22044, long j, final C14666 c14666) throws IOException {
        this.f81378 = new ArrayList();
        this.f81381 = 8;
        this.f81375 = -1;
        this.f81379 = StandardCharsets.UTF_8;
        this.f81373 = new C4345();
        this.f81376 = new byte[8192];
        this.f81372 = abstractC22044;
        if (abstractC22044.mo2934()) {
            abstractC22044.mo4296();
        }
        if (j <= 0) {
            this.f81386 = abstractC22044.m49855("rw");
            this.f81380 = -1L;
        } else {
            if (j < 61440 || j > 4294967295L) {
                throw new IOException("Zip split segment size should between 64K and 4,294,967,295");
            }
            final C0594 c0594 = new C0594();
            final AbstractC22044 abstractC22044M49856 = abstractC22044.m49856();
            final String strM20779 = C7605.m20779(abstractC22044.getName());
            this.f81386 = C11746.m29495(C20697.m47331(abstractC22044.getName(), j, new InterfaceC3543() { // from class: l.ۚܽܺ
                @Override // l.InterfaceC3543
                /* JADX INFO: renamed from: ᩷ */
                public final InterfaceC15475 mo1860(int i) {
                    return C25179.m56100(this.f19876, abstractC22044M49856, strM20779, c0594, c14666, i);
                }
            }));
            this.f81380 = j;
            m56106(134695760);
        }
        this.f81385 = C16973.m40025(abstractC22044.getName().toLowerCase());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InterfaceC15475 m56100(C25179 c25179, AbstractC22044 abstractC22044, String str, C0594 c0594, InterfaceC0818 interfaceC0818, int i) {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(String.format(Locale.ENGLISH, "%s.z%02d", str, Integer.valueOf(i + 1)));
        InterfaceC15475 interfaceC15475Mo4276 = abstractC22044M49876.mo4276("rw");
        if (c0594.add(i)) {
            interfaceC15475Mo4276.setLength(0L);
            if (interfaceC0818 != null) {
                interfaceC0818.accept(abstractC22044M49876);
            }
            c25179.f81377 = abstractC22044M49876;
        }
        return interfaceC15475Mo4276;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m56129() {
        this.f81385 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56135(int i) {
        this.f81381 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m56133() {
        return this.f81381;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56121(int i) {
        this.f81375 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m56139(String str) {
        this.f81387 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56136(String str) {
        this.f81371 = str;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m56130() {
        this.f81385 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56128(C22941 c22941) {
        if (this.f81380 != -1) {
            throw new UnsupportedOperationException("ApkSigBlockPairsData is not supported in split mode");
        }
        this.f81382 = c22941.m51737();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56138(byte[] bArr) {
        if (this.f81380 != -1) {
            throw new UnsupportedOperationException("ApkSigBlockPairsData is not supported in split mode");
        }
        this.f81382 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56124(String str) throws IOException {
        m56114(new C25157(str, this.f81379));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56125(C8002 c8002) {
        m56114(new C25157(c8002, this.f81379));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m56114(C25157 c25157) throws IOException {
        OutputStream c4997;
        if (this.f81384 != null) {
            m56134();
        }
        long j = this.f81380;
        C13961 c13961 = this.f81386;
        if (j != -1) {
            c25157.f81317 = m56110();
            c25157.f81313 = m56109();
            c25157.f81319 = c13961.getFilePointer();
        } else {
            long filePointer = c13961.getFilePointer();
            c25157.f81319 = filePointer;
            c25157.f81313 = filePointer;
        }
        this.f81378.add(c25157);
        boolean z = c25157.f81316;
        boolean z2 = c25157.f81314;
        int i = 0;
        if (z) {
            c25157.f81321 = 0;
            if (z2) {
                c25157.f81320 = 2048;
            }
            m56111(c25157);
            c25157.f81311 = c13961.getFilePointer();
            return;
        }
        this.f81384 = c25157;
        String str = this.f81387;
        boolean z3 = (str == null || str.isEmpty()) ? false : true;
        int i2 = this.f81381;
        C1312 c1312 = new C1312(c13961);
        this.f81383 = c1312;
        OutputStream outputStream = c1312;
        if (z3) {
            C12498 c12498 = new C12498(c1312, str, 3, false);
            int i3 = C24411.f79212;
            byte[] bArr = new byte[7];
            boolean z4 = C17719.f58226;
            C6929.m19215(0, 2, bArr);
            byte[] bytes = "AE".getBytes();
            if (bytes.length + 2 > 7) {
                throw new EOFException();
            }
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            bArr[4] = (byte) 3;
            C6929.m19215(5, i2, bArr);
            if (Arrays.equals(c25157.f81331, c25157.f81325)) {
                byte[] bArrM54599 = C24411.m54599(39169, c25157.f81331, bArr);
                c25157.f81325 = bArrM54599;
                c25157.f81331 = bArrM54599;
            } else {
                c25157.f81331 = C24411.m54599(39169, c25157.f81331, bArr);
                c25157.f81325 = C24411.m54599(39169, c25157.f81325, bArr);
            }
            i2 = 99;
            i = 1;
            outputStream = c12498;
        }
        if (z2) {
            i |= 2048;
        }
        c25157.f81320 = i;
        c25157.f81321 = i2;
        m56111(c25157);
        c25157.f81311 = c13961.getFilePointer();
        int i4 = this.f81381;
        OutputStream outputStreamM56781 = outputStream;
        if (i4 != 0) {
            if (i4 != 8) {
                if (i4 == 12) {
                    c4997 = new C2515(outputStream, 9);
                } else if (i4 == 36) {
                    c4997 = new C16183(outputStream);
                } else {
                    if (i4 != 95) {
                        throw new IOException(C13645.m33382(i2, "Unsupported compression method "));
                    }
                    outputStreamM56781 = C24653.m55008(outputStream, 6);
                }
                outputStreamM56781 = c4997;
            } else if (this.f81375 == 10) {
                try {
                    SevenZip.m56789();
                    outputStreamM56781 = SevenZip.m56781(outputStream);
                } catch (Exception e) {
                    throw new IOException(e);
                }
            } else {
                c4997 = new C4997(outputStream, new Deflater(this.f81375, true));
                outputStreamM56781 = c4997;
            }
        }
        this.f81388 = new C2803(outputStreamM56781);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56137(C8002 c8002) throws IOException {
        if (this.f81384 != null) {
            m56134();
        }
        C25157 c25157 = new C25157(c8002, this.f81379);
        if (c8002.m21856()) {
            c25157.f81320 |= 1;
            if (c8002.m21835() == 0 && (c8002.m21841() & 8) == 8) {
                c25157.f81320 |= 8;
                c25157.f81315 = true;
                this.f81384 = c25157;
            } else if (c8002.m21835() == 99) {
                c25157.f81321 = 99;
            }
        }
        if (c25157.f81314) {
            c25157.f81320 |= 2048;
        }
        long j = this.f81380;
        C13961 c13961 = this.f81386;
        if (j != -1) {
            c25157.f81317 = m56110();
            c25157.f81313 = m56109();
            c25157.f81319 = c13961.getFilePointer();
        } else {
            long filePointer = c13961.getFilePointer();
            c25157.f81319 = filePointer;
            c25157.f81313 = filePointer;
        }
        c25157.f81324 = c8002.m21829();
        this.f81378.add(c25157);
        m56111(c25157);
        c25157.f81311 = c13961.getFilePointer();
        if (c8002.m21829()) {
            this.f81373.mo13846(c8002.m21811(), c25157);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56122(int i, byte[] bArr) {
        this.f81386.write(bArr, 0, i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m56131(C8002 c8002) {
        if (this.f81380 != -1) {
            throw new UnsupportedOperationException("Virtual entry is not supported in split mode");
        }
        if (!c8002.m21813()) {
            return false;
        }
        C8002 c8002M21840 = c8002.m21840();
        C25157 c25157 = (C25157) this.f81373.mo13849(c8002M21840.m21811());
        if (c25157 == null) {
            return false;
        }
        C25157 c25158 = new C25157(c8002, this.f81379);
        m56107(c25158);
        c25158.f81320 = c8002.m21841();
        long jM21842 = (c8002.m21842() - c8002M21840.m21811()) + c25157.f81311;
        c25158.f81319 = jM21842;
        c25158.f81313 = jM21842;
        c25158.f81311 = (c8002.m21811() - c8002M21840.m21811()) + c25157.f81311;
        this.f81378.add(c25158);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56126(C8002 c8002, C22941 c22941) {
        if (m56131(c8002)) {
            return;
        }
        m56137(c8002);
        if (c8002.isDirectory()) {
            return;
        }
        C10260 c10260M51748 = c22941.m51748(c8002);
        while (true) {
            byte[] bArr = this.f81376;
            int i = c10260M51748.read(bArr);
            if (i == -1) {
                return;
            } else {
                m56122(i, bArr);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56127(C8002 c8002, C22941 c22941, InterfaceC3573 interfaceC3573) throws IOException {
        if (interfaceC3573 == null) {
            m56126(c8002, c22941);
            return;
        }
        if (m56131(c8002)) {
            interfaceC3573.mo3466(c8002.m21838(), c8002.m21838(), c8002.m21838());
            return;
        }
        m56137(c8002);
        if (c8002.isDirectory()) {
            return;
        }
        long jM21838 = c8002.m21838();
        C10260 c10260M51748 = c22941.m51748(c8002);
        long j = 0;
        while (true) {
            byte[] bArr = this.f81376;
            int i = c10260M51748.read(bArr);
            if (i == -1 || interfaceC3573.mo924()) {
                return;
            }
            m56122(i, bArr);
            long j2 = i;
            long j3 = j + j2;
            interfaceC3573.mo3466(j2, j3, jM21838);
            j = j3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11752 m56120(C22941 c22941, String str) throws IOException {
        if (this.f81380 != -1) {
            throw new UnsupportedOperationException("Virtual entry is not supported in split mode");
        }
        if (str.endsWith("/") || str.endsWith("\\")) {
            throw new IOException("Invalid host entry name: ".concat(str));
        }
        int i = this.f81381;
        String str2 = this.f81387;
        this.f81381 = 0;
        this.f81387 = null;
        C25157 c25157 = new C25157(str, this.f81379);
        c25157.f81324 = true;
        m56114(c25157);
        this.f81381 = i;
        this.f81387 = str2;
        return new C11752(c22941, this);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m56111(C25157 c25157) throws IOException {
        int i;
        byte[] bArrM54601;
        m56107(c25157);
        byte[] bArr = c25157.f81332;
        m56106(67324752);
        if (c25157.f81322 || c25157.f81326) {
            i = 45;
        } else {
            i = (c25157.f81321 == 0 && (c25157.f81320 & 1) == 0) ? 10 : 20;
        }
        m56116(i);
        m56116(c25157.f81320);
        m56116(c25157.f81321);
        m56106(c25157.f81333);
        m56106(c25157.f81310);
        if (c25157.f81322) {
            m56117(4294967295L);
            m56117(4294967295L);
        } else {
            m56117(c25157.f81327);
            m56117(c25157.f81312);
        }
        m56116(bArr.length);
        if (c25157.f81322) {
            byte[] bArr2 = new byte[16];
            C17719.m41495(c25157.f81312, 0, bArr2);
            C17719.m41495(c25157.f81327, 8, bArr2);
            bArrM54601 = C24411.m54599(1, c25157.f81331, bArr2);
        } else {
            bArrM54601 = C24411.m54601(1, c25157.f81331);
        }
        if (this.f81385 && c25157.f81321 == 0) {
            int i2 = (c25157.f81324 || new String(bArr, StandardCharsets.UTF_8).endsWith(".so")) ? 16384 : 4;
            long filePointer = this.f81386.getFilePointer() + 2 + ((long) bArr.length);
            long j = i2;
            if ((((long) bArrM54601.length) + filePointer) % j != 0) {
                byte[] bArrM54600 = C24411.m54600(bArrM54601);
                int length = (int) ((filePointer + ((long) bArrM54600.length)) % j);
                bArrM54601 = Arrays.copyOf(bArrM54600, bArrM54600.length + (length != 0 ? i2 - length : 0));
            }
        }
        m56116(bArrM54601.length);
        m56108(bArr);
        m56108(bArrM54601);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m56107(C25157 c25157) {
        long j = c25157.f81312;
        if ((j >= 4026531840L && c25157.f81327 == -1) || j >= 4294967295L || c25157.f81327 >= 4294967295L) {
            c25157.f81322 = true;
        }
        if (c25157.f81313 >= 4294967295L) {
            c25157.f81326 = true;
        }
        if (j == -1) {
            c25157.f81312 = 0L;
        }
        if (c25157.f81327 == -1) {
            c25157.f81327 = 0L;
        }
    }

    public final void write(int i) throws IOException {
        this.f81388.write(i);
    }

    public final void write(byte[] bArr) throws IOException {
        this.f81388.write(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f81388.write(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56123(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return;
            } else {
                write(bArr, 0, i);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OutputStream m56119() {
        OutputStream outputStream = this.f81374;
        if (outputStream != null) {
            return outputStream;
        }
        C2058 c2058 = new C2058(this);
        this.f81374 = c2058;
        return c2058;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b9  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56134() throws IOException {
        C25157 c25157 = this.f81384;
        if (c25157 == null) {
            return;
        }
        if (c25157.f81315) {
            if ((c25157.f81320 & 8) == 8) {
                m56106(134695760);
                m56106(this.f81384.f81310);
                C25157 c25158 = this.f81384;
                if (c25158.f81322) {
                    m56113(c25158.f81312);
                    m56113(this.f81384.f81327);
                } else {
                    m56117(c25158.f81327);
                    m56117(this.f81384.f81312);
                }
            }
            this.f81384 = null;
            return;
        }
        this.f81388.close();
        this.f81384.f81310 = this.f81388.m9272();
        this.f81384.f81327 = this.f81383.m4788();
        this.f81384.f81312 = this.f81388.m9271();
        C13961 c13961 = this.f81386;
        long filePointer = c13961.getFilePointer();
        c13961.seek(this.f81384.f81319 + 14);
        m56106(this.f81384.f81310);
        C25157 c25159 = this.f81384;
        if (!c25159.f81322) {
            long j = c25159.f81327;
            if (j >= 4294967295L || c25159.f81312 >= 4294967295L) {
                throw new IOException("Zip entry size needs zip64: name=" + new String(this.f81384.f81332) + ", compressedSize=" + this.f81384.f81327 + ", size=" + this.f81384.f81312);
            }
            m56117(j);
            m56117(this.f81384.f81312);
        } else if (c25159.f81312 < 4294967295L) {
            long j2 = c25159.f81327;
            if (j2 < 4294967295L) {
                c25159.f81322 = false;
                m56117(j2);
                m56117(this.f81384.f81312);
                c13961.skipBytes(this.f81384.f81332.length + 4);
                m56116(0);
                m56116(16);
                m56113(0L);
                m56113(0L);
            } else {
                m56117(4294967295L);
                m56117(4294967295L);
                c13961.skipBytes(this.f81384.f81332.length + 4);
                c13961.skipBytes(4);
                m56113(this.f81384.f81312);
                m56113(this.f81384.f81327);
            }
        } else {
            m56117(4294967295L);
            m56117(4294967295L);
            c13961.skipBytes(this.f81384.f81332.length + 4);
            c13961.skipBytes(4);
            m56113(this.f81384.f81312);
            m56113(this.f81384.f81327);
        }
        c13961.seek(filePointer);
        this.f81388 = null;
        this.f81383 = null;
        this.f81384 = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j;
        byte[] bArr;
        ArrayList arrayList = this.f81378;
        C13961 c13961 = this.f81386;
        if (c13961.isClosed()) {
            return;
        }
        if (this.f81384 != null) {
            m56134();
        }
        byte[] bArr2 = this.f81382;
        if (bArr2 != null) {
            int filePointer = (int) (c13961.getFilePointer() % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
            if (filePointer != 0) {
                m56108(new byte[4096 - filePointer]);
            }
            int length = bArr2.length + 32;
            int i = length % 4096;
            if (i != 0) {
                int i2 = 4096 - i;
                if (i2 < 12) {
                    i2 = 8192 - i;
                }
                bArr = new byte[i2];
                C6929.m19211(i2 - 8, 0, bArr);
                C6929.m19210(8, 1114793335, bArr);
                length += i2;
            } else {
                bArr = null;
            }
            long j2 = ((long) length) - 8;
            m56113(j2);
            m56108(bArr2);
            if (bArr != null) {
                m56108(bArr);
            }
            m56113(j2);
            m56113(2334950737559900225L);
            m56113(3617552046287187010L);
        }
        try {
            Collections.sort(arrayList);
            long j3 = this.f81380;
            if (j3 == -1) {
                long filePointer2 = c13961.getFilePointer();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m56118((C25157) it.next());
                }
                m56103(0L, 0L, c13961.getFilePointer() - filePointer2, filePointer2);
                c13961.close();
                return;
            }
            long jM56109 = m56109();
            long jM56110 = m56110();
            long filePointer3 = c13961.getFilePointer();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                m56118((C25157) it2.next());
            }
            long filePointer4 = c13961.getFilePointer() - filePointer3;
            long j4 = 1 + jM56110;
            int i3 = ((j4 >= 65535 || jM56110 >= 65535 || arrayList.size() >= 65535 || filePointer4 > 4294967295L || jM56109 > 4294967295L) ? 76 : 0) + 22;
            String str = this.f81371;
            if (m56109() + ((long) (i3 + (str == null ? C9498.f30777 : str.getBytes(this.f81379)).length)) > j3) {
                c13961.flush();
                ((C20697) c13961.mo34028()).m47337();
                j = j4;
            } else {
                j = jM56110;
            }
            m56103(j, jM56110, filePointer4, jM56109);
            c13961.close();
            AbstractC22044 abstractC22044 = this.f81377;
            C17359.requireNonNull(abstractC22044);
            abstractC22044.mo4301(this.f81372);
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56103(long j, long j2, long j3, long j4) throws IOException {
        boolean z;
        ArrayList arrayList = this.f81378;
        boolean z2 = j >= 65535 || j2 >= 65535 || arrayList.size() >= 65535 || j3 > 4294967295L || j4 > 4294967295L;
        if (z2) {
            m56106(101075792);
            z = z2;
            m56113(44L);
            m56116(20);
            m56116(20);
            m56117(j);
            m56117(j2);
            m56113(arrayList.size());
            m56113(arrayList.size());
            m56113(j3);
            m56113(j4);
            m56106(117853008);
            if (this.f81380 == -1) {
                m56106(0);
                m56113(j3 + j4);
                m56106(1);
            } else {
                boolean z3 = j != j2;
                m56106((int) j);
                m56113(z3 ? 0L : m56109() - 64);
                m56106((int) (1 + j));
            }
        } else {
            z = z2;
        }
        String str = this.f81371;
        byte[] bytes = str == null ? C9498.f30777 : str.getBytes(this.f81379);
        m56106(101010256);
        m56116((int) j);
        m56116((int) j2);
        if (z) {
            m56116(65535);
            m56116(65535);
            m56117(4294967295L);
            m56117(4294967295L);
        } else {
            m56116(arrayList.size());
            m56116(arrayList.size());
            m56117(j3);
            m56117(j4);
        }
        m56116(bytes.length);
        m56108(bytes);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m56110() {
        long j = this.f81380;
        if (j == -1) {
            throw new IllegalStateException();
        }
        long filePointer = this.f81386.getFilePointer() / j;
        int i = (int) filePointer;
        if (filePointer == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private long m56109() {
        long j = this.f81380;
        if (j == -1) {
            throw new IllegalStateException();
        }
        return this.f81386.getFilePointer() % j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m56108(byte[] bArr) {
        if (bArr.length > 0) {
            C13961 c13961 = this.f81386;
            c13961.getClass();
            c13961.write(bArr, 0, bArr.length);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m56116(int i) {
        C13961 c13961 = this.f81386;
        c13961.write(i & 255);
        c13961.write((i >>> 8) & 255);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m56106(int i) {
        C13961 c13961 = this.f81386;
        c13961.write(i & 255);
        c13961.write((i >>> 8) & 255);
        c13961.write((i >>> 16) & 255);
        c13961.write((i >>> 24) & 255);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m56113(long j) {
        C13961 c13961 = this.f81386;
        c13961.write((int) (j & 255));
        c13961.write((int) ((j >>> 8) & 255));
        c13961.write((int) ((j >>> 16) & 255));
        c13961.write((int) ((j >>> 24) & 255));
        c13961.write((int) ((j >>> 32) & 255));
        c13961.write((int) ((j >>> 40) & 255));
        c13961.write((int) ((j >>> 48) & 255));
        c13961.write((int) ((j >>> 56) & 255));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m56117(long j) throws IOException {
        if (j < 0 || j > 4294967295L) {
            throw new IOException("Value out of unsigned int.");
        }
        C13961 c13961 = this.f81386;
        c13961.write((int) (j & 255));
        c13961.write((int) ((j >>> 8) & 255));
        c13961.write((int) ((j >>> 16) & 255));
        c13961.write((int) ((j >>> 24) & 255));
    }
}
