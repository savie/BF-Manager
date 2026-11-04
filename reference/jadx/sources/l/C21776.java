package l;

import com.google.android.material.motion.MotionUtils;
import com.rosan.dhizuku.shared.DhizukuVariables;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.᩷ۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAH2 */
/* JADX INFO: loaded from: classes.dex */
public final class C21776 extends AbstractC8941 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f69428;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f69429;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f69430;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f69431;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f69432;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f69433;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f69434;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f69435;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC24760 f69436;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f69437;

    public C21776(OutputStream outputStream) {
        super(outputStream);
        this.f69434 = 0;
        this.f69428 = 0;
        ((FilterOutputStream) this).out = new C6114(new C11595(outputStream));
        int i = C18046.f59088;
        Charset.defaultCharset().name();
        this.f69436 = AbstractC16554.m39195((String) null);
        this.f69430 = new byte[512];
        this.f69433 = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49372(HashMap map, String str, C21813 c21813) {
        if (c21813 != null) {
            C0358 instant = c21813.toInstant();
            long epochSecond = instant.getEpochSecond();
            int nano = instant.getNano();
            if (nano == 0) {
                map.put(str, String.valueOf(epochSecond));
            } else {
                m49370(map, str, epochSecond, nano);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49370(HashMap map, String str, long j, int i) {
        map.put(str, BigDecimal.valueOf(j).add(BigDecimal.valueOf(i).movePointLeft(9).setScale(7, RoundingMode.DOWN)).toPlainString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49371(HashMap map, String str, long j, long j2) {
        if (j < 0 || j > j2) {
            map.put(str, String.valueOf(j));
        }
    }

    @Override // l.AbstractC8941, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            if (!m23906()) {
                finish();
            }
        } finally {
            if (!isClosed()) {
                super.close();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m49377() throws IOException {
        m23905();
        if (!this.f69429) {
            throw new IOException("No current entry to close");
        }
        ((C6114) ((FilterOutputStream) this).out).m17642();
        long j = this.f69432;
        long j2 = this.f69435;
        if (j < j2) {
            StringBuilder sb = new StringBuilder("Entry '");
            sb.append(this.f69437);
            sb.append("' closed at '");
            sb.append(this.f69432);
            sb.append("' before the '");
            throw new IOException(C2764.m9137(sb, this.f69435, "' bytes specified in the header were written"));
        }
        long j3 = (j2 / 512) + this.f69431;
        this.f69431 = j3;
        if (0 != j2 % 512) {
            this.f69431 = j3 + 1;
        }
        this.f69429 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49369(String str, long j, long j2) {
        m49368(j, j2, str, "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49368(long j, long j2, String str, String str2) {
        if (j < 0 || j > j2) {
            throw new IllegalArgumentException(str + " '" + j + "' is too big ( > " + j2 + " )." + str2);
        }
    }

    @Override // l.AbstractC8941
    public final void finish() throws IOException {
        m23905();
        if (this.f69429) {
            throw new IOException("This archive contains unclosed entries.");
        }
        byte[] bArr = this.f69430;
        Arrays.fill(bArr, (byte) 0);
        m49375(bArr);
        Arrays.fill(bArr, (byte) 0);
        m49375(bArr);
        long j = this.f69431;
        int i = this.f69433;
        long j2 = j % ((long) i);
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        if (i2 != 0) {
            while (i2 < i) {
                Arrays.fill(bArr, (byte) 0);
                m49375(bArr);
                i2++;
            }
        }
        ((FilterOutputStream) this).out.flush();
        super.finish();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m49374(C7450 c7450, String str, HashMap map, String str2, byte b, String str3) throws IOException {
        byte[] bArrMo28622 = this.f69436.mo28622(str);
        int length = bArrMo28622.length;
        if (length >= 100) {
            int i = this.f69434;
            if (i == 3) {
                map.put(str2, str);
                return true;
            }
            if (i == 2) {
                C7450 c7451 = new C7450(b, "././@LongLink");
                c7451.m20452(((long) length) + 1);
                m49373(c7450, c7451);
                m49376(c7451);
                write(bArrMo28622, 0, length);
                write(0);
                m49377();
                return false;
            }
            if (i != 1) {
                throw new IllegalArgumentException(str3 + " '" + str + "' is too long ( > 100 bytes)");
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x01be  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0228  */
    /* JADX WARN: Code duplicated, block: B:58:0x022d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0230  */
    /* JADX WARN: Code duplicated, block: B:62:0x0242  */
    /* JADX WARN: Code duplicated, block: B:63:0x0245  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49376(C7450 c7450) throws IOException {
        String str;
        HashMap map;
        boolean z;
        int length;
        StringBuilder sb;
        int i;
        String string;
        char cCharAt;
        m23905();
        boolean zM20435 = c7450.m20435();
        InterfaceC24760 interfaceC24760 = this.f69436;
        byte[] bArr = this.f69430;
        if (zM20435) {
            Map mapM20448 = c7450.m20448();
            final StringWriter stringWriter = new StringWriter();
            C11392.forEach(mapM20448, new BiConsumer() { // from class: l.ۙۗۨ
                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return C23501.$default$andThen(this, biConsumer);
                }

                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    String str2 = (String) obj;
                    String str3 = (String) obj2;
                    int length2 = str3.length() + str2.length() + 5;
                    String str4 = length2 + " " + str2 + "=" + str3 + "\n";
                    int length3 = str4.getBytes(StandardCharsets.UTF_8).length;
                    while (length2 != length3) {
                        str4 = length3 + " " + str2 + "=" + str3 + "\n";
                        int i2 = length3;
                        length3 = str4.getBytes(StandardCharsets.UTF_8).length;
                        length2 = i2;
                    }
                    stringWriter.write(str4);
                }
            });
            byte[] bytes = stringWriter.toString().getBytes(StandardCharsets.UTF_8);
            c7450.m20452(bytes.length);
            c7450.m20428(bArr, interfaceC24760, this.f69428 == 1);
            m49375(bArr);
            this.f69435 = c7450.m20439();
            this.f69432 = 0L;
            this.f69429 = true;
            write(bytes);
            m49377();
            return;
        }
        HashMap map2 = new HashMap();
        String strM20456 = c7450.m20456();
        m49374(c7450, strM20456, map2, MotionUtils.EASING_TYPE_PATH, (byte) 76, "file name");
        String strM20438 = c7450.m20438();
        if (strM20438 != null && !strM20438.isEmpty()) {
            m49374(c7450, strM20438, map2, "linkpath", (byte) 75, "link name");
        }
        int i2 = this.f69428;
        if (i2 == 2) {
            str = strM20456;
            map = map2;
            m49371(map2, "size", c7450.m20439(), 8589934591L);
            m49371(map, "gid", c7450.m20458(), 2097151L);
            C21813 c21813M20429 = c7450.m20429();
            if (c21813M20429 != null) {
                C0358 instant = c21813M20429.toInstant();
                long epochSecond = instant.getEpochSecond();
                int nano = instant.getNano();
                if (nano == 0) {
                    m49371(map, "mtime", epochSecond, 8589934591L);
                } else {
                    m49370(map, "mtime", epochSecond, nano);
                }
            }
            m49372(map, "atime", c7450.m20440());
            if (c7450.m20457() != null) {
                m49372(map, "ctime", c7450.m20457());
            } else {
                m49372(map, "ctime", c7450.m20421());
            }
            m49371(map, DhizukuVariables.PARAM_CLIENT_UID, c7450.m20444(), 2097151L);
            m49372(map, "LIBARCHIVE.creationtime", c7450.m20421());
            m49371(map, "SCHILY.devmajor", c7450.m20436(), 2097151L);
            m49371(map, "SCHILY.devminor", c7450.m20454(), 2097151L);
            m49369("mode", c7450.m20443(), 2097151L);
        } else {
            str = strM20456;
            map = map2;
            if (i2 != 1) {
                m49369("entry size", c7450.m20439(), 8589934591L);
                m49368(c7450.m20458(), 2097151L, "group id", " Use STAR or POSIX extensions to overcome this limit");
                C21813 c21813M204210 = c7450.m20429();
                int i3 = C3876.f13224;
                int i4 = C20284.f65131;
                m49369("last modification time", c21813M204210 != null ? c21813M204210.to(TimeUnit.SECONDS) : 0L, 8589934591L);
                m49369("user id", c7450.m20444(), 2097151L);
                m49369("mode", c7450.m20443(), 2097151L);
                m49369("major device number", c7450.m20436(), 2097151L);
                m49369("minor device number", c7450.m20454(), 2097151L);
            }
            map.putAll(c7450.m20448());
            if (!map.isEmpty()) {
                StringBuilder sb2 = new StringBuilder("./PaxHeaders.X/");
                length = str.length();
                sb = new StringBuilder(length);
                for (i = 0; i < length; i++) {
                    cCharAt = (char) (str.charAt(i) & 127);
                    if (cCharAt != 0 || cCharAt == '/' || cCharAt == '\\') {
                        sb.append("_");
                    } else {
                        sb.append(cCharAt);
                    }
                }
                sb2.append(sb.toString());
                string = sb2.toString();
                if (string.length() >= 100) {
                    string = string.substring(0, 99);
                }
                C7450 c7451 = new C7450((byte) 120, string);
                m49373(c7450, c7451);
                final StringWriter stringWriter2 = new StringWriter();
                C11392.forEach(map, new BiConsumer() { // from class: l.ۙۗۨ
                    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return C23501.$default$andThen(this, biConsumer);
                    }

                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        String str2 = (String) obj;
                        String str3 = (String) obj2;
                        int length2 = str3.length() + str2.length() + 5;
                        String str4 = length2 + " " + str2 + "=" + str3 + "\n";
                        int length3 = str4.getBytes(StandardCharsets.UTF_8).length;
                        while (length2 != length3) {
                            str4 = length3 + " " + str2 + "=" + str3 + "\n";
                            int i5 = length3;
                            length3 = str4.getBytes(StandardCharsets.UTF_8).length;
                            length2 = i5;
                        }
                        stringWriter2.write(str4);
                    }
                });
                byte[] bytes2 = stringWriter2.toString().getBytes(StandardCharsets.UTF_8);
                c7451.m20452(bytes2.length);
                m49376(c7451);
                write(bytes2);
                m49377();
            }
            if (this.f69428 == 1) {
                z = true;
            } else {
                z = false;
            }
            c7450.m20428(bArr, interfaceC24760, z);
            m49375(bArr);
            this.f69432 = 0L;
            if (c7450.m20450()) {
                this.f69435 = 0L;
            } else {
                this.f69435 = c7450.m20439();
            }
            this.f69437 = str;
            this.f69429 = true;
        }
        map.putAll(c7450.m20448());
        if (!map.isEmpty()) {
            StringBuilder sb3 = new StringBuilder("./PaxHeaders.X/");
            length = str.length();
            sb = new StringBuilder(length);
            while (i < length) {
                cCharAt = (char) (str.charAt(i) & 127);
                if (cCharAt != 0) {
                    sb.append("_");
                } else {
                    sb.append("_");
                }
            }
            sb3.append(sb.toString());
            string = sb3.toString();
            if (string.length() >= 100) {
                string = string.substring(0, 99);
            }
            C7450 c7452 = new C7450((byte) 120, string);
            m49373(c7450, c7452);
            final StringWriter stringWriter3 = new StringWriter();
            C11392.forEach(map, new BiConsumer() { // from class: l.ۙۗۨ
                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return C23501.$default$andThen(this, biConsumer);
                }

                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    String str2 = (String) obj;
                    String str3 = (String) obj2;
                    int length2 = str3.length() + str2.length() + 5;
                    String str4 = length2 + " " + str2 + "=" + str3 + "\n";
                    int length3 = str4.getBytes(StandardCharsets.UTF_8).length;
                    while (length2 != length3) {
                        str4 = length3 + " " + str2 + "=" + str3 + "\n";
                        int i5 = length3;
                        length3 = str4.getBytes(StandardCharsets.UTF_8).length;
                        length2 = i5;
                    }
                    stringWriter3.write(str4);
                }
            });
            byte[] bytes3 = stringWriter3.toString().getBytes(StandardCharsets.UTF_8);
            c7452.m20452(bytes3.length);
            m49376(c7452);
            write(bytes3);
            m49377();
        }
        if (this.f69428 == 1) {
            z = true;
        } else {
            z = false;
        }
        c7450.m20428(bArr, interfaceC24760, z);
        m49375(bArr);
        this.f69432 = 0L;
        if (c7450.m20450()) {
            this.f69435 = 0L;
        } else {
            this.f69435 = c7450.m20439();
        }
        this.f69437 = str;
        this.f69429 = true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m49379() {
        this.f69428 = 1;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m49378() {
        this.f69434 = 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49373(C7450 c7450, C7450 c7451) {
        C21813 c21813M20429 = c7450.m20429();
        int i = C3876.f13224;
        int i2 = C20284.f65131;
        long j = 0;
        long j2 = c21813M20429 != null ? c21813M20429.to(TimeUnit.SECONDS) : 0L;
        if (j2 >= 0 && j2 <= 8589934591L) {
            j = j2;
        }
        c7451.m20427(C21813.from(j, TimeUnit.SECONDS));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f69429) {
            throw new IllegalStateException("No current tar entry");
        }
        long j = i2;
        if (this.f69432 + j <= this.f69435) {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
            this.f69432 += j;
        } else {
            StringBuilder sbM12235 = C3769.m12235(i2, "Request to write '", "' bytes exceeds size in header of '");
            sbM12235.append(this.f69435);
            sbM12235.append("' bytes for entry '");
            throw new IOException(C8947.m23910(sbM12235, this.f69437, "'"));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m49375(byte[] bArr) throws IOException {
        if (bArr.length != 512) {
            throw new IOException(C12669.m31437(bArr.length, "' which is not the record size of '512'", new StringBuilder("Record to write has length '")));
        }
        ((FilterOutputStream) this).out.write(bArr);
        this.f69431++;
    }
}
