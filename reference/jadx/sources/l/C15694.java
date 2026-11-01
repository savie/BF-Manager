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

/* JADX INFO: renamed from: l.ܺۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: RAH2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15694 extends AbstractC19221 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f50941;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1581 f50942;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f50943;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f50944;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f50945;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f50946;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f50947;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50948;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f50949;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f50950;

    public C15694(OutputStream outputStream) {
        super(outputStream);
        this.f50950 = 0;
        this.f50948 = 0;
        ((FilterOutputStream) this).out = new C22126(new C3552(outputStream));
        int i = C22832.f74282;
        Charset.defaultCharset().name();
        this.f50942 = AbstractC9344.m23995((String) null);
        this.f50947 = new byte[512];
        this.f50941 = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37387(HashMap map, String str, C16502 c16502) {
        if (c16502 != null) {
            C18285 instant = c16502.toInstant();
            long epochSecond = instant.getEpochSecond();
            int nano = instant.getNano();
            if (nano == 0) {
                map.put(str, String.valueOf(epochSecond));
            } else {
                m37385(map, str, epochSecond, nano);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37385(HashMap map, String str, long j, int i) {
        map.put(str, BigDecimal.valueOf(j).add(BigDecimal.valueOf(i).movePointLeft(9).setScale(7, RoundingMode.DOWN)).toPlainString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37386(HashMap map, String str, long j, long j2) {
        if (j < 0 || j > j2) {
            map.put(str, String.valueOf(j));
        }
    }

    @Override // l.AbstractC19221, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            if (!m44139()) {
                finish();
            }
        } finally {
            if (!isClosed()) {
                super.close();
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m37392() throws IOException {
        m44138();
        if (!this.f50945) {
            throw new IOException("No current entry to close");
        }
        ((C22126) ((FilterOutputStream) this).out).m49086();
        long j = this.f50946;
        long j2 = this.f50943;
        if (j < j2) {
            StringBuilder sb = new StringBuilder("Entry '");
            sb.append(this.f50949);
            sb.append("' closed at '");
            sb.append(this.f50946);
            sb.append("' before the '");
            throw new IOException(C15037.m36023(sb, this.f50943, "' bytes specified in the header were written"));
        }
        long j3 = (j2 / 512) + this.f50944;
        this.f50944 = j3;
        if (0 != j2 % 512) {
            this.f50944 = j3 + 1;
        }
        this.f50945 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37384(String str, long j, long j2) {
        m37383(j, j2, str, "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37383(long j, long j2, String str, String str2) {
        if (j < 0 || j > j2) {
            throw new IllegalArgumentException(str + " '" + j + "' is too big ( > " + j2 + " )." + str2);
        }
    }

    @Override // l.AbstractC19221
    public final void finish() throws IOException {
        m44138();
        if (this.f50945) {
            throw new IOException("This archive contains unclosed entries.");
        }
        byte[] bArr = this.f50947;
        Arrays.fill(bArr, (byte) 0);
        m37390(bArr);
        Arrays.fill(bArr, (byte) 0);
        m37390(bArr);
        long j = this.f50944;
        int i = this.f50941;
        long j2 = j % ((long) i);
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        if (i2 != 0) {
            while (i2 < i) {
                Arrays.fill(bArr, (byte) 0);
                m37390(bArr);
                i2++;
            }
        }
        ((FilterOutputStream) this).out.flush();
        super.finish();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m37389(C10049 c10049, String str, HashMap map, String str2, byte b, String str3) throws IOException {
        byte[] bArrMo5389 = this.f50942.mo5389(str);
        int length = bArrMo5389.length;
        if (length >= 100) {
            int i = this.f50950;
            if (i == 3) {
                map.put(str2, str);
                return true;
            }
            if (i == 2) {
                C10049 c100410 = new C10049(b, "././@LongLink");
                c100410.m25426(((long) length) + 1);
                m37388(c10049, c100410);
                m37393(c100410);
                write(bArrMo5389, 0, length);
                write(0);
                m37392();
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
    public final void m37393(C10049 c10049) throws IOException {
        String str;
        HashMap map;
        boolean z;
        int length;
        StringBuilder sb;
        int i;
        String string;
        char cCharAt;
        m44138();
        boolean zM25432 = c10049.m25432();
        InterfaceC1581 interfaceC1581 = this.f50942;
        byte[] bArr = this.f50947;
        if (zM25432) {
            Map mapM25413 = c10049.m25413();
            final StringWriter stringWriter = new StringWriter();
            C9735.forEach(mapM25413, new BiConsumer() { // from class: l.᩷ۘ᩵
                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return C2866.$default$andThen(this, biConsumer);
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
            c10049.m25426(bytes.length);
            c10049.m25412(bArr, interfaceC1581, this.f50948 == 1);
            m37390(bArr);
            this.f50943 = c10049.m25435();
            this.f50946 = 0L;
            this.f50945 = true;
            write(bytes);
            m37392();
            return;
        }
        HashMap map2 = new HashMap();
        String strM25433 = c10049.m25433();
        m37389(c10049, strM25433, map2, MotionUtils.EASING_TYPE_PATH, (byte) 76, "file name");
        String strM25404 = c10049.m25404();
        if (strM25404 != null && !strM25404.isEmpty()) {
            m37389(c10049, strM25404, map2, "linkpath", (byte) 75, "link name");
        }
        int i2 = this.f50948;
        if (i2 == 2) {
            str = strM25433;
            map = map2;
            m37386(map2, "size", c10049.m25435(), 8589934591L);
            m37386(map, "gid", c10049.m25415(), 2097151L);
            C16502 c16502M25424 = c10049.m25424();
            if (c16502M25424 != null) {
                C18285 instant = c16502M25424.toInstant();
                long epochSecond = instant.getEpochSecond();
                int nano = instant.getNano();
                if (nano == 0) {
                    m37386(map, "mtime", epochSecond, 8589934591L);
                } else {
                    m37385(map, "mtime", epochSecond, nano);
                }
            }
            m37387(map, "atime", c10049.m25400());
            if (c10049.m25419() != null) {
                m37387(map, "ctime", c10049.m25419());
            } else {
                m37387(map, "ctime", c10049.m25405());
            }
            m37386(map, DhizukuVariables.PARAM_CLIENT_UID, c10049.m25440(), 2097151L);
            m37387(map, "LIBARCHIVE.creationtime", c10049.m25405());
            m37386(map, "SCHILY.devmajor", c10049.m25421(), 2097151L);
            m37386(map, "SCHILY.devminor", c10049.m25402(), 2097151L);
            m37384("mode", c10049.m25438(), 2097151L);
        } else {
            str = strM25433;
            map = map2;
            if (i2 != 1) {
                m37384("entry size", c10049.m25435(), 8589934591L);
                m37383(c10049.m25415(), 2097151L, "group id", " Use STAR or POSIX extensions to overcome this limit");
                C16502 c16502M25425 = c10049.m25424();
                int i3 = C12954.f43065;
                int i4 = C2369.f8373;
                m37384("last modification time", c16502M25425 != null ? c16502M25425.to(TimeUnit.SECONDS) : 0L, 8589934591L);
                m37384("user id", c10049.m25440(), 2097151L);
                m37384("mode", c10049.m25438(), 2097151L);
                m37384("major device number", c10049.m25421(), 2097151L);
                m37384("minor device number", c10049.m25402(), 2097151L);
            }
            map.putAll(c10049.m25413());
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
                C10049 c100410 = new C10049((byte) 120, string);
                m37388(c10049, c100410);
                final StringWriter stringWriter2 = new StringWriter();
                C9735.forEach(map, new BiConsumer() { // from class: l.᩷ۘ᩵
                    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return C2866.$default$andThen(this, biConsumer);
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
                c100410.m25426(bytes2.length);
                m37393(c100410);
                write(bytes2);
                m37392();
            }
            if (this.f50948 == 1) {
                z = true;
            } else {
                z = false;
            }
            c10049.m25412(bArr, interfaceC1581, z);
            m37390(bArr);
            this.f50946 = 0L;
            if (c10049.m25430()) {
                this.f50943 = 0L;
            } else {
                this.f50943 = c10049.m25435();
            }
            this.f50949 = str;
            this.f50945 = true;
        }
        map.putAll(c10049.m25413());
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
            C10049 c100411 = new C10049((byte) 120, string);
            m37388(c10049, c100411);
            final StringWriter stringWriter3 = new StringWriter();
            C9735.forEach(map, new BiConsumer() { // from class: l.᩷ۘ᩵
                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return C2866.$default$andThen(this, biConsumer);
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
            c100411.m25426(bytes3.length);
            m37393(c100411);
            write(bytes3);
            m37392();
        }
        if (this.f50948 == 1) {
            z = true;
        } else {
            z = false;
        }
        c10049.m25412(bArr, interfaceC1581, z);
        m37390(bArr);
        this.f50946 = 0L;
        if (c10049.m25430()) {
            this.f50943 = 0L;
        } else {
            this.f50943 = c10049.m25435();
        }
        this.f50949 = str;
        this.f50945 = true;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m37394() {
        this.f50948 = 1;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m37391() {
        this.f50950 = 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37388(C10049 c10049, C10049 c100410) {
        C16502 c16502M25424 = c10049.m25424();
        int i = C12954.f43065;
        int i2 = C2369.f8373;
        long j = 0;
        long j2 = c16502M25424 != null ? c16502M25424.to(TimeUnit.SECONDS) : 0L;
        if (j2 >= 0 && j2 <= 8589934591L) {
            j = j2;
        }
        c100410.m25411(C16502.from(j, TimeUnit.SECONDS));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f50945) {
            throw new IllegalStateException("No current tar entry");
        }
        long j = i2;
        if (this.f50946 + j <= this.f50943) {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
            this.f50946 += j;
        } else {
            StringBuilder sbM40153 = C17214.m40153(i2, "Request to write '", "' bytes exceeds size in header of '");
            sbM40153.append(this.f50943);
            sbM40153.append("' bytes for entry '");
            throw new IOException(C22697.m50267(sbM40153, this.f50949, "'"));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m37390(byte[] bArr) throws IOException {
        if (bArr.length != 512) {
            throw new IOException(C12441.m30911(bArr.length, "' which is not the record size of '512'", new StringBuilder("Record to write has length '")));
        }
        ((FilterOutputStream) this).out.write(bArr);
        this.f50944++;
    }
}
