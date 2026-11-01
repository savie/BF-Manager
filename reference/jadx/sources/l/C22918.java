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

/* JADX INFO: renamed from: l.᩺ۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G4GB */
/* JADX INFO: loaded from: classes.dex */
public final class C22918 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C10924 f74493;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f74494;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C14452 f74495;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f74496;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public OutputStream f74497;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f74498;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Charset f74499;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f74500;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f74501;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final long f74502;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] f74503;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public String f74504;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7038 f74505;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f74506;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f74507;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C22690 f74508;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1388 f74509;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f74510;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m50717() {
        this.f74499 = StandardCharsets.UTF_8;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m50701(C22690 c22690) throws IOException {
        byte[] bArrM19091;
        boolean z = c22690.f73894 || c22690.f73906;
        byte[] bArr = c22690.f73905;
        byte[] bArr2 = c22690.f73888;
        if (z) {
            byte[] bArr3 = new byte[24];
            C21506.m48151(c22690.f73890, 0, bArr3);
            C21506.m48151(c22690.f73885, 8, bArr3);
            C21506.m48151(c22690.f73901, 16, bArr3);
            bArrM19091 = C7167.m19089(1, c22690.f73902, bArr3);
        } else {
            bArrM19091 = C7167.m19091(1, c22690.f73902);
        }
        m50709(33639248);
        int i = 45;
        int i2 = (c22690.f73894 || c22690.f73906) ? 45 : 20;
        C1388 c1388 = this.f74509;
        c1388.write(i2 & 255);
        c1388.write(c22690.f73886 & 255);
        if (!c22690.f73894 && !c22690.f73906) {
            i = (c22690.f73897 == 0 && (1 & c22690.f73893) == 0) ? 10 : 20;
        }
        m50699(i);
        m50699(c22690.f73893);
        m50699(c22690.f73897);
        m50709(c22690.f73907);
        m50709(c22690.f73903);
        if (z) {
            m50700(4294967295L);
            m50700(4294967295L);
        } else {
            m50700(c22690.f73885);
            m50700(c22690.f73890);
        }
        m50699(bArr2.length);
        m50699(bArrM19091.length);
        m50699(bArr.length);
        m50699(c22690.f73898);
        m50699(c22690.f73887);
        m50709(c22690.f73904);
        if (z) {
            m50700(4294967295L);
        } else {
            m50700(c22690.f73901);
        }
        m50711(bArr2);
        m50711(bArrM19091);
        m50711(bArr);
    }

    public C22918(String str) {
        this(C5553.m15313(str, new String[0]), -1L, null);
    }

    public C22918(AbstractC20745 abstractC20745) {
        this(abstractC20745, -1L, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22918 m50704(AbstractC20745 abstractC20745) {
        C1388 c1388M46710 = abstractC20745.m46710("rw");
        try {
            if (c1388M46710.length() != 0) {
                throw new IOException("ZIP output file must be empty");
            }
            return new C22918(abstractC20745, c1388M46710);
        } catch (IOException | RuntimeException e) {
            try {
                c1388M46710.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public C22918(AbstractC20745 abstractC20745, C1388 c1388) {
        this.f74510 = new ArrayList();
        this.f74496 = 8;
        this.f74500 = -1;
        this.f74499 = StandardCharsets.UTF_8;
        this.f74505 = new C7038();
        this.f74503 = new byte[8192];
        this.f74501 = abstractC20745;
        this.f74509 = c1388;
        this.f74502 = -1L;
        this.f74498 = C15157.m36342(abstractC20745.getName().toLowerCase(Locale.ROOT));
    }

    public C22918(AbstractC20745 abstractC20745, long j, final C16711 c16711) throws IOException {
        this.f74510 = new ArrayList();
        this.f74496 = 8;
        this.f74500 = -1;
        this.f74499 = StandardCharsets.UTF_8;
        this.f74505 = new C7038();
        this.f74503 = new byte[8192];
        this.f74501 = abstractC20745;
        if (abstractC20745.mo33975()) {
            abstractC20745.mo24647();
        }
        if (j <= 0) {
            this.f74509 = abstractC20745.m46710("rw");
            this.f74502 = -1L;
        } else {
            if (j < 61440 || j > 4294967295L) {
                throw new IOException("Zip split segment size should between 64K and 4,294,967,295");
            }
            final C18597 c18597 = new C18597();
            final AbstractC20745 abstractC20745M46711 = abstractC20745.m46711();
            final String strM47957 = C21420.m47957(abstractC20745.getName());
            this.f74509 = C19734.m44887(C0682.m3046(abstractC20745.getName(), j, new InterfaceC20439() { // from class: l.۬ۢ᩺
                @Override // l.InterfaceC20439
                /* JADX INFO: renamed from: ܰ */
                public final InterfaceC21850 mo23828(int i) {
                    return C22918.m50702(this.f43484, abstractC20745M46711, strM47957, c18597, c16711, i);
                }
            }));
            this.f74502 = j;
            m50709(134695760);
        }
        this.f74498 = C15157.m36342(abstractC20745.getName().toLowerCase());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InterfaceC21850 m50702(C22918 c22918, AbstractC20745 abstractC20745, String str, C18597 c18597, InterfaceC17295 interfaceC17295, int i) {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(String.format(Locale.ENGLISH, "%s.z%02d", str, Integer.valueOf(i + 1)));
        InterfaceC21850 interfaceC21850Mo33966 = abstractC20745M46690.mo33966("rw");
        if (c18597.add(i)) {
            interfaceC21850Mo33966.setLength(0L);
            if (interfaceC17295 != null) {
                interfaceC17295.accept(abstractC20745M46690);
            }
            c22918.f74494 = abstractC20745M46690;
        }
        return interfaceC21850Mo33966;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m50732() {
        this.f74498 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50733(int i) {
        this.f74496 = i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m50737() {
        return this.f74496;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50722(int i) {
        this.f74500 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m50719(String str) {
        this.f74504 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50734(String str) {
        this.f74507 = str;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m50718() {
        this.f74498 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50726(C2455 c2455) {
        if (this.f74502 != -1) {
            throw new UnsupportedOperationException("ApkSigBlockPairsData is not supported in split mode");
        }
        this.f74506 = c2455.m7490();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50736(byte[] bArr) {
        if (this.f74502 != -1) {
            throw new UnsupportedOperationException("ApkSigBlockPairsData is not supported in split mode");
        }
        this.f74506 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50725(String str) {
        m50714(new C22690(str, this.f74499));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50727(C12107 c12107) {
        m50714(new C22690(c12107, this.f74499));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m50714(C22690 c22690) throws IOException {
        OutputStream c4385;
        if (this.f74508 != null) {
            m50730();
        }
        long j = this.f74502;
        C1388 c1388 = this.f74509;
        if (j != -1) {
            c22690.f73898 = m50716();
            c22690.f73901 = m50715();
            c22690.f73908 = c1388.getFilePointer();
        } else {
            long filePointer = c1388.getFilePointer();
            c22690.f73908 = filePointer;
            c22690.f73901 = filePointer;
        }
        this.f74510.add(c22690);
        boolean z = c22690.f73895;
        boolean z2 = c22690.f73891;
        int i = 0;
        if (z) {
            c22690.f73897 = 0;
            if (z2) {
                c22690.f73893 = 2048;
            }
            m50707(c22690);
            c22690.f73896 = c1388.getFilePointer();
            return;
        }
        this.f74508 = c22690;
        String str = this.f74504;
        boolean z3 = (str == null || str.isEmpty()) ? false : true;
        int i2 = this.f74496;
        C10924 c10924 = new C10924(c1388);
        this.f74493 = c10924;
        OutputStream outputStream = c10924;
        if (z3) {
            C8807 c8807 = new C8807(c10924, str, 3, false);
            int i3 = C7167.f23950;
            byte[] bArr = new byte[7];
            boolean z4 = C21506.f69876;
            C15157.m36353(0, 2, bArr);
            byte[] bytes = "AE".getBytes();
            if (bytes.length + 2 > 7) {
                throw new EOFException();
            }
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            bArr[4] = (byte) 3;
            C15157.m36353(5, i2, bArr);
            if (Arrays.equals(c22690.f73900, c22690.f73902)) {
                byte[] bArrM19089 = C7167.m19089(39169, c22690.f73900, bArr);
                c22690.f73902 = bArrM19089;
                c22690.f73900 = bArrM19089;
            } else {
                c22690.f73900 = C7167.m19089(39169, c22690.f73900, bArr);
                c22690.f73902 = C7167.m19089(39169, c22690.f73902, bArr);
            }
            i2 = 99;
            i = 1;
            outputStream = c8807;
        }
        if (z2) {
            i |= 2048;
        }
        c22690.f73893 = i;
        c22690.f73897 = i2;
        m50707(c22690);
        c22690.f73896 = c1388.getFilePointer();
        int i4 = this.f74496;
        OutputStream outputStreamM52884 = outputStream;
        if (i4 != 0) {
            if (i4 != 8) {
                if (i4 == 12) {
                    c4385 = new C15092(outputStream, 9);
                } else if (i4 == 36) {
                    c4385 = new C17791(outputStream);
                } else {
                    if (i4 != 95) {
                        throw new IOException(C8479.m22141(i2, "Unsupported compression method "));
                    }
                    outputStreamM52884 = C10362.m26261(outputStream, 6);
                }
                outputStreamM52884 = c4385;
            } else if (this.f74500 == 10) {
                try {
                    SevenZip.m52892();
                    outputStreamM52884 = SevenZip.m52884(outputStream);
                } catch (Exception e) {
                    throw new IOException(e);
                }
            } else {
                c4385 = new C4385(outputStream, new Deflater(this.f74500, true));
                outputStreamM52884 = c4385;
            }
        }
        this.f74495 = new C14452(outputStreamM52884);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50735(C12107 c12107) throws IOException {
        if (this.f74508 != null) {
            m50730();
        }
        C22690 c22690 = new C22690(c12107, this.f74499);
        if (c12107.m30133()) {
            c22690.f73893 |= 1;
            if (c12107.m30114() == 0 && (c12107.m30131() & 8) == 8) {
                c22690.f73893 |= 8;
                c22690.f73899 = true;
                this.f74508 = c22690;
            } else if (c12107.m30114() == 99) {
                c22690.f73897 = 99;
            }
        }
        if (c22690.f73891) {
            c22690.f73893 |= 2048;
        }
        long j = this.f74502;
        C1388 c1388 = this.f74509;
        if (j != -1) {
            c22690.f73898 = m50716();
            c22690.f73901 = m50715();
            c22690.f73908 = c1388.getFilePointer();
        } else {
            long filePointer = c1388.getFilePointer();
            c22690.f73908 = filePointer;
            c22690.f73901 = filePointer;
        }
        c22690.f73889 = c12107.m30141();
        this.f74510.add(c22690);
        m50707(c22690);
        c22690.f73896 = c1388.getFilePointer();
        if (c12107.m30141()) {
            this.f74505.mo18876(c12107.m30099(), c22690);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50723(int i, byte[] bArr) {
        this.f74509.write(bArr, 0, i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m50731(C12107 c12107) {
        if (this.f74502 != -1) {
            throw new UnsupportedOperationException("Virtual entry is not supported in split mode");
        }
        if (!c12107.m30130()) {
            return false;
        }
        C12107 c12107M30132 = c12107.m30132();
        C22690 c22690 = (C22690) this.f74505.mo18880(c12107M30132.m30099());
        if (c22690 == null) {
            return false;
        }
        C22690 c22691 = new C22690(c12107, this.f74499);
        m50710(c22691);
        c22691.f73893 = c12107.m30131();
        long jM30137 = (c12107.m30137() - c12107M30132.m30099()) + c22690.f73896;
        c22691.f73908 = jM30137;
        c22691.f73901 = jM30137;
        c22691.f73896 = (c12107.m30099() - c12107M30132.m30099()) + c22690.f73896;
        this.f74510.add(c22691);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50728(C12107 c12107, C2455 c2455) {
        if (m50731(c12107)) {
            return;
        }
        m50735(c12107);
        if (c12107.isDirectory()) {
            return;
        }
        C5984 c5984M7469 = c2455.m7469(c12107);
        while (true) {
            byte[] bArr = this.f74503;
            int i = c5984M7469.read(bArr);
            if (i == -1) {
                return;
            } else {
                m50723(i, bArr);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50729(C12107 c12107, C2455 c2455, InterfaceC10389 interfaceC10389) throws IOException {
        if (interfaceC10389 == null) {
            m50728(c12107, c2455);
            return;
        }
        if (m50731(c12107)) {
            interfaceC10389.mo2886(c12107.m30138(), c12107.m30138(), c12107.m30138());
            return;
        }
        m50735(c12107);
        if (c12107.isDirectory()) {
            return;
        }
        long jM30138 = c12107.m30138();
        C5984 c5984M7469 = c2455.m7469(c12107);
        long j = 0;
        while (true) {
            byte[] bArr = this.f74503;
            int i = c5984M7469.read(bArr);
            if (i == -1 || interfaceC10389.mo2357()) {
                return;
            }
            m50723(i, bArr);
            long j2 = i;
            long j3 = j + j2;
            interfaceC10389.mo2886(j2, j3, jM30138);
            j = j3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6689 m50721(C2455 c2455, String str) throws IOException {
        if (this.f74502 != -1) {
            throw new UnsupportedOperationException("Virtual entry is not supported in split mode");
        }
        if (str.endsWith("/") || str.endsWith("\\")) {
            throw new IOException("Invalid host entry name: ".concat(str));
        }
        int i = this.f74496;
        String str2 = this.f74504;
        this.f74496 = 0;
        this.f74504 = null;
        C22690 c22690 = new C22690(str, this.f74499);
        c22690.f73889 = true;
        m50714(c22690);
        this.f74496 = i;
        this.f74504 = str2;
        return new C6689(c2455, this);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m50707(C22690 c22690) throws IOException {
        int i;
        byte[] bArrM19091;
        m50710(c22690);
        byte[] bArr = c22690.f73888;
        m50709(67324752);
        if (c22690.f73894 || c22690.f73906) {
            i = 45;
        } else {
            i = (c22690.f73897 == 0 && (c22690.f73893 & 1) == 0) ? 10 : 20;
        }
        m50699(i);
        m50699(c22690.f73893);
        m50699(c22690.f73897);
        m50709(c22690.f73907);
        m50709(c22690.f73903);
        if (c22690.f73894) {
            m50700(4294967295L);
            m50700(4294967295L);
        } else {
            m50700(c22690.f73885);
            m50700(c22690.f73890);
        }
        m50699(bArr.length);
        if (c22690.f73894) {
            byte[] bArr2 = new byte[16];
            C21506.m48151(c22690.f73890, 0, bArr2);
            C21506.m48151(c22690.f73885, 8, bArr2);
            bArrM19091 = C7167.m19089(1, c22690.f73900, bArr2);
        } else {
            bArrM19091 = C7167.m19091(1, c22690.f73900);
        }
        if (this.f74498 && c22690.f73897 == 0) {
            int i2 = (c22690.f73889 || new String(bArr, StandardCharsets.UTF_8).endsWith(".so")) ? 16384 : 4;
            long filePointer = this.f74509.getFilePointer() + 2 + ((long) bArr.length);
            long j = i2;
            if ((((long) bArrM19091.length) + filePointer) % j != 0) {
                byte[] bArrM19090 = C7167.m19090(bArrM19091);
                int length = (int) ((filePointer + ((long) bArrM19090.length)) % j);
                bArrM19091 = Arrays.copyOf(bArrM19090, bArrM19090.length + (length != 0 ? i2 - length : 0));
            }
        }
        m50699(bArrM19091.length);
        m50711(bArr);
        m50711(bArrM19091);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m50710(C22690 c22690) {
        long j = c22690.f73890;
        if ((j >= 4026531840L && c22690.f73885 == -1) || j >= 4294967295L || c22690.f73885 >= 4294967295L) {
            c22690.f73894 = true;
        }
        if (c22690.f73901 >= 4294967295L) {
            c22690.f73906 = true;
        }
        if (j == -1) {
            c22690.f73890 = 0L;
        }
        if (c22690.f73885 == -1) {
            c22690.f73885 = 0L;
        }
    }

    public final void write(int i) throws IOException {
        this.f74495.write(i);
    }

    public final void write(byte[] bArr) throws IOException {
        this.f74495.write(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f74495.write(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50724(InputStream inputStream) throws IOException {
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
    public final OutputStream m50720() {
        OutputStream outputStream = this.f74497;
        if (outputStream != null) {
            return outputStream;
        }
        C3866 c3866 = new C3866(this);
        this.f74497 = c3866;
        return c3866;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b9  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m50730() throws IOException {
        C22690 c22690 = this.f74508;
        if (c22690 == null) {
            return;
        }
        if (c22690.f73899) {
            if ((c22690.f73893 & 8) == 8) {
                m50709(134695760);
                m50709(this.f74508.f73903);
                C22690 c22691 = this.f74508;
                if (c22691.f73894) {
                    m50713(c22691.f73890);
                    m50713(this.f74508.f73885);
                } else {
                    m50700(c22691.f73885);
                    m50700(this.f74508.f73890);
                }
            }
            this.f74508 = null;
            return;
        }
        this.f74495.close();
        this.f74508.f73903 = this.f74495.m34851();
        this.f74508.f73885 = this.f74493.m27403();
        this.f74508.f73890 = this.f74495.m34850();
        C1388 c1388 = this.f74509;
        long filePointer = c1388.getFilePointer();
        c1388.seek(this.f74508.f73908 + 14);
        m50709(this.f74508.f73903);
        C22690 c22692 = this.f74508;
        if (!c22692.f73894) {
            long j = c22692.f73885;
            if (j >= 4294967295L || c22692.f73890 >= 4294967295L) {
                throw new IOException("Zip entry size needs zip64: name=" + new String(this.f74508.f73888) + ", compressedSize=" + this.f74508.f73885 + ", size=" + this.f74508.f73890);
            }
            m50700(j);
            m50700(this.f74508.f73890);
        } else if (c22692.f73890 < 4294967295L) {
            long j2 = c22692.f73885;
            if (j2 < 4294967295L) {
                c22692.f73894 = false;
                m50700(j2);
                m50700(this.f74508.f73890);
                c1388.skipBytes(this.f74508.f73888.length + 4);
                m50699(0);
                m50699(16);
                m50713(0L);
                m50713(0L);
            } else {
                m50700(4294967295L);
                m50700(4294967295L);
                c1388.skipBytes(this.f74508.f73888.length + 4);
                c1388.skipBytes(4);
                m50713(this.f74508.f73890);
                m50713(this.f74508.f73885);
            }
        } else {
            m50700(4294967295L);
            m50700(4294967295L);
            c1388.skipBytes(this.f74508.f73888.length + 4);
            c1388.skipBytes(4);
            m50713(this.f74508.f73890);
            m50713(this.f74508.f73885);
        }
        c1388.seek(filePointer);
        this.f74495 = null;
        this.f74493 = null;
        this.f74508 = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j;
        byte[] bArr;
        ArrayList arrayList = this.f74510;
        C1388 c1388 = this.f74509;
        if (c1388.isClosed()) {
            return;
        }
        if (this.f74508 != null) {
            m50730();
        }
        byte[] bArr2 = this.f74506;
        if (bArr2 != null) {
            int filePointer = (int) (c1388.getFilePointer() % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
            if (filePointer != 0) {
                m50711(new byte[4096 - filePointer]);
            }
            int length = bArr2.length + 32;
            int i = length % 4096;
            if (i != 0) {
                int i2 = 4096 - i;
                if (i2 < 12) {
                    i2 = 8192 - i;
                }
                bArr = new byte[i2];
                C15157.m36340(i2 - 8, 0, bArr);
                C15157.m36338(8, 1114793335, bArr);
                length += i2;
            } else {
                bArr = null;
            }
            long j2 = ((long) length) - 8;
            m50713(j2);
            m50711(bArr2);
            if (bArr != null) {
                m50711(bArr);
            }
            m50713(j2);
            m50713(2334950737559900225L);
            m50713(3617552046287187010L);
        }
        try {
            Collections.sort(arrayList);
            long j3 = this.f74502;
            if (j3 == -1) {
                long filePointer2 = c1388.getFilePointer();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m50701((C22690) it.next());
                }
                m50705(0L, 0L, c1388.getFilePointer() - filePointer2, filePointer2);
                c1388.close();
                return;
            }
            long jM50715 = m50715();
            long jM50716 = m50716();
            long filePointer3 = c1388.getFilePointer();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                m50701((C22690) it2.next());
            }
            long filePointer4 = c1388.getFilePointer() - filePointer3;
            long j4 = 1 + jM50716;
            int i3 = ((j4 >= 65535 || jM50716 >= 65535 || arrayList.size() >= 65535 || filePointer4 > 4294967295L || jM50715 > 4294967295L) ? 76 : 0) + 22;
            String str = this.f74507;
            if (m50715() + ((long) (i3 + (str == null ? C8574.f29651 : str.getBytes(this.f74499)).length)) > j3) {
                c1388.flush();
                ((C0682) c1388.mo4866()).m3053();
                j = j4;
            } else {
                j = jM50716;
            }
            m50705(j, jM50716, filePointer4, jM50715);
            c1388.close();
            AbstractC20745 abstractC20745 = this.f74494;
            C13638.requireNonNull(abstractC20745);
            abstractC20745.mo24646(this.f74501);
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50705(long j, long j2, long j3, long j4) throws IOException {
        boolean z;
        ArrayList arrayList = this.f74510;
        boolean z2 = j >= 65535 || j2 >= 65535 || arrayList.size() >= 65535 || j3 > 4294967295L || j4 > 4294967295L;
        if (z2) {
            m50709(101075792);
            z = z2;
            m50713(44L);
            m50699(20);
            m50699(20);
            m50700(j);
            m50700(j2);
            m50713(arrayList.size());
            m50713(arrayList.size());
            m50713(j3);
            m50713(j4);
            m50709(117853008);
            if (this.f74502 == -1) {
                m50709(0);
                m50713(j3 + j4);
                m50709(1);
            } else {
                boolean z3 = j != j2;
                m50709((int) j);
                m50713(z3 ? 0L : m50715() - 64);
                m50709((int) (1 + j));
            }
        } else {
            z = z2;
        }
        String str = this.f74507;
        byte[] bytes = str == null ? C8574.f29651 : str.getBytes(this.f74499);
        m50709(101010256);
        m50699((int) j);
        m50699((int) j2);
        if (z) {
            m50699(65535);
            m50699(65535);
            m50700(4294967295L);
            m50700(4294967295L);
        } else {
            m50699(arrayList.size());
            m50699(arrayList.size());
            m50700(j3);
            m50700(j4);
        }
        m50699(bytes.length);
        m50711(bytes);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m50716() {
        long j = this.f74502;
        if (j == -1) {
            throw new IllegalStateException();
        }
        long filePointer = this.f74509.getFilePointer() / j;
        int i = (int) filePointer;
        if (filePointer == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private long m50715() {
        long j = this.f74502;
        if (j == -1) {
            throw new IllegalStateException();
        }
        return this.f74509.getFilePointer() % j;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m50711(byte[] bArr) {
        if (bArr.length > 0) {
            C1388 c1388 = this.f74509;
            c1388.getClass();
            c1388.write(bArr, 0, bArr.length);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m50699(int i) {
        C1388 c1388 = this.f74509;
        c1388.write(i & 255);
        c1388.write((i >>> 8) & 255);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m50709(int i) {
        C1388 c1388 = this.f74509;
        c1388.write(i & 255);
        c1388.write((i >>> 8) & 255);
        c1388.write((i >>> 16) & 255);
        c1388.write((i >>> 24) & 255);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m50713(long j) {
        C1388 c1388 = this.f74509;
        c1388.write((int) (j & 255));
        c1388.write((int) ((j >>> 8) & 255));
        c1388.write((int) ((j >>> 16) & 255));
        c1388.write((int) ((j >>> 24) & 255));
        c1388.write((int) ((j >>> 32) & 255));
        c1388.write((int) ((j >>> 40) & 255));
        c1388.write((int) ((j >>> 48) & 255));
        c1388.write((int) ((j >>> 56) & 255));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m50700(long j) throws IOException {
        if (j < 0 || j > 4294967295L) {
            throw new IOException("Value out of unsigned int.");
        }
        C1388 c1388 = this.f74509;
        c1388.write((int) (j & 255));
        c1388.write((int) ((j >>> 8) & 255));
        c1388.write((int) ((j >>> 16) & 255));
        c1388.write((int) ((j >>> 24) & 255));
    }
}
