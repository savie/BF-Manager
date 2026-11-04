package l;

import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import javax.net.ssl.SSLException;

/* JADX INFO: renamed from: l.ۗ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes3.dex */
public final class C3767 implements InterfaceC20921 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final OutputStream f12887;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f12888;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f12889 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public EnumC12716 f12890;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f12891;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public RunnableC13526 f12892;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f12893;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1530 f12894;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6751 f12895;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashMap f12896;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f12897;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f12898;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f12899;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f12900;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C16445 f12901;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f12902;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C11970 f12903;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f12904;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f12905;

    public C3767(AbstractC1530 abstractC1530, C16445 c16445, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.f12894 = abstractC1530;
        this.f12901 = c16445;
        this.f12895 = new C6751(inputStream, 8192);
        this.f12887 = outputStream;
        this.f12899 = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f12896 = new HashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12208(BufferedReader bufferedReader, HashMap map, HashMap map2, HashMap map3) throws C0784 {
        String strM5420;
        try {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            String[] strArrSplit = line.split(" ", -1);
            if (strArrSplit.length != 3 || strArrSplit[0].isEmpty() || strArrSplit[1].isEmpty() || strArrSplit[2].isEmpty()) {
                throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            }
            map.put(e.s, strArrSplit[0]);
            String str = strArrSplit[1];
            int iIndexOf = str.indexOf(63);
            if (iIndexOf >= 0) {
                m12209(str.substring(iIndexOf + 1), map2);
                try {
                    strM5420 = AbstractC1530.m5420(str.substring(0, iIndexOf), false);
                } catch (IllegalArgumentException e) {
                    throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e);
                }
            } else {
                try {
                    strM5420 = AbstractC1530.m5420(str, false);
                } catch (IllegalArgumentException e2) {
                    throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e2);
                }
            }
            String str2 = strArrSplit[2];
            this.f12905 = str2;
            if (!"HTTP/1.0".equals(str2) && !"HTTP/1.1".equals(this.f12905)) {
                throw new C0784(EnumC21667.UNSUPPORTED_HTTP_VERSION, "HTTP VERSION NOT SUPPORTED: " + this.f12905);
            }
            String line2 = bufferedReader.readLine();
            while (line2 != null && !line2.trim().isEmpty()) {
                int iIndexOf2 = line2.indexOf(58);
                if (iIndexOf2 <= 0) {
                    throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Invalid header name.");
                }
                String strSubstring = line2.substring(0, iIndexOf2);
                if (!AbstractC1530.f5316.matcher(strSubstring).matches()) {
                    throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Invalid header name.");
                }
                String lowerCase = strSubstring.toLowerCase(Locale.US);
                if ("authorization".equals(lowerCase)) {
                    this.f12889.add(line2.substring(iIndexOf2 + 1));
                }
                String strTrim = line2.substring(iIndexOf2 + 1).trim();
                if ("content-length".equals(lowerCase) && map3.containsKey(lowerCase)) {
                    throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Multiple Content-Length headers.");
                }
                if (c.f.equals(lowerCase) && map3.containsKey(lowerCase)) {
                    throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Multiple Host headers.");
                }
                map3.put(lowerCase, strTrim);
                line2 = bufferedReader.readLine();
            }
            if ("HTTP/1.1".equals(this.f12905) && !map3.containsKey(c.f)) {
                throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Missing Host header.");
            }
            map.put("uri", strM5420);
        } catch (IOException e3) {
            throw new C0784(EnumC21667.INTERNAL_ERROR, C11958.m29932(e3, new StringBuilder("SERVER INTERNAL ERROR: IOException: ")), e3);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m12216(HashMap map) throws C0784 {
        String str = (String) map.get("transfer-encoding");
        if (str != null && !str.trim().isEmpty()) {
            throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Transfer-Encoding is not supported.");
        }
        String str2 = (String) map.get("content-length");
        if (str2 == null) {
            return;
        }
        if (str2.isEmpty()) {
            throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Invalid Content-Length.");
        }
        for (int i = 0; i < str2.length(); i++) {
            char cCharAt = str2.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Invalid Content-Length.");
            }
        }
        try {
            Long.parseLong(str2);
        } catch (NumberFormatException e) {
            throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Invalid Content-Length.", e);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m12215() throws C0784, IOException {
        String str = (String) this.f12896.get("expect");
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        String[] strArrSplit = str.split(",");
        int length = strArrSplit.length;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= length) {
                z = z2;
                break;
            }
            String strTrim = strArrSplit[i].trim();
            if (!strTrim.isEmpty()) {
                if (!"100-continue".equalsIgnoreCase(strTrim)) {
                    break;
                } else {
                    z2 = true;
                }
            }
            i++;
        }
        if (!z) {
            throw new C0784(EnumC21667.EXPECTATION_FAILED, "EXPECTATION FAILED: Unsupported Expect header.");
        }
        if (!"HTTP/1.1".equals(this.f12905)) {
            throw new C0784(EnumC21667.EXPECTATION_FAILED, "EXPECTATION FAILED: Expect header requires HTTP/1.1.");
        }
        if (this.f12897 > 0) {
            byte[] bytes = C8947.m23910(new StringBuilder(), this.f12905, " 100 Continue\r\n\r\n").getBytes(Charset.forName("US-ASCII"));
            OutputStream outputStream = this.f12887;
            outputStream.write(bytes);
            outputStream.flush();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12211(C6005 c6005, ByteBuffer byteBuffer, HashMap map, HashMap map2) throws Throwable {
        byte b;
        try {
            int[] iArrM12212 = m12212(byteBuffer, c6005.m17453().getBytes(Charset.forName("US-ASCII")));
            try {
                if (iArrM12212.length < 2) {
                    throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
                }
                int i = 1024;
                byte[] bArr = new byte[1024];
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = 1;
                    if (i3 >= iArrM12212.length - 1) {
                        return;
                    }
                    byteBuffer.position(iArrM12212[i3]);
                    int iRemaining = byteBuffer.remaining() < i ? byteBuffer.remaining() : 1024;
                    byteBuffer.get(bArr, i2, iRemaining);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i2, iRemaining), Charset.forName(c6005.m17458())), iRemaining);
                    String line = bufferedReader.readLine();
                    if (line == null || !line.contains(c6005.m17453())) {
                        throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
                    }
                    String strGroup = null;
                    String strTrim = null;
                    String strGroup2 = null;
                    int i6 = 2;
                    for (String line2 = bufferedReader.readLine(); line2 != null && line2.trim().length() > 0; line2 = bufferedReader.readLine()) {
                        Matcher matcher = AbstractC1530.f5319.matcher(line2);
                        if (matcher.matches()) {
                            Matcher matcher2 = AbstractC1530.f5320.matcher(matcher.group(2));
                            i4 = i4;
                            while (matcher2.find()) {
                                String strGroup3 = matcher2.group(i5);
                                String str = strGroup2;
                                if ("name".equalsIgnoreCase(strGroup3)) {
                                    strGroup = matcher2.group(2);
                                } else {
                                    if ("filename".equalsIgnoreCase(strGroup3)) {
                                        strGroup2 = matcher2.group(2);
                                        if (!strGroup2.isEmpty()) {
                                            if (i4 > 0) {
                                                strGroup = strGroup + String.valueOf(i4);
                                                i4++;
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                    i5 = 1;
                                }
                                strGroup2 = str;
                                i5 = 1;
                            }
                        }
                        Matcher matcher3 = AbstractC1530.f5317.matcher(line2);
                        if (matcher3.matches()) {
                            strTrim = matcher3.group(2).trim();
                        }
                        i6++;
                        i5 = 1;
                    }
                    int i7 = i4;
                    int i8 = 0;
                    while (true) {
                        int i9 = i6 - 1;
                        if (i6 <= 0) {
                            break;
                        }
                        do {
                            b = bArr[i8];
                            i8++;
                        } while (b != 10);
                        i6 = i9;
                    }
                    if (i8 >= iRemaining - 4) {
                        throw new C0784(EnumC21667.INTERNAL_ERROR, "Multipart header size exceeds MAX_HEADER_SIZE.");
                    }
                    int i10 = iArrM12212[i3] + i8;
                    i3++;
                    int i11 = iArrM12212[i3] - 4;
                    byteBuffer.position(i10);
                    List arrayList = (List) map.get(strGroup);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(strGroup, arrayList);
                    }
                    if (strTrim == null) {
                        byte[] bArr2 = new byte[i11 - i10];
                        byteBuffer.get(bArr2);
                        arrayList.add(new String(bArr2, c6005.m17458()));
                    } else {
                        String strM12207 = m12207(byteBuffer, i10, i11 - i10, strGroup2);
                        if (map2.containsKey(strGroup)) {
                            int i12 = 2;
                            while (true) {
                                if (!map2.containsKey(strGroup + i12)) {
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                            map2.put(strGroup + i12, strM12207);
                        } else {
                            map2.put(strGroup, strM12207);
                        }
                        arrayList.add(strGroup2);
                    }
                    i = 1024;
                    i4 = i7;
                    i2 = 0;
                }
            } catch (C0784 e) {
            } catch (Exception e2) {
                e = e2;
                throw new C0784(EnumC21667.INTERNAL_ERROR, e.toString());
            }
        } catch (C0784 e3) {
            throw e3;
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12209(String str, Map map) throws C0784 {
        String strTrim;
        String strM5430;
        if (str == null) {
            this.f12898 = "";
            return;
        }
        this.f12898 = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str, a.p);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(61);
            if (iIndexOf >= 0) {
                try {
                    strTrim = AbstractC1530.m5430(strNextToken.substring(0, iIndexOf)).trim();
                    try {
                        strM5430 = AbstractC1530.m5430(strNextToken.substring(iIndexOf + 1));
                    } catch (IllegalArgumentException e) {
                        throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e);
                    }
                } catch (IllegalArgumentException e2) {
                    throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e2);
                }
            } else {
                try {
                    strTrim = AbstractC1530.m5430(strNextToken).trim();
                    strM5430 = "";
                } catch (IllegalArgumentException e3) {
                    throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e3);
                }
            }
            List arrayList = (List) map.get(strTrim);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(strTrim, arrayList);
            }
            arrayList.add(strM5430);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12231() {
        AbstractC1530 abstractC1530 = this.f12894;
        C16445 c16445 = this.f12901;
        C6751 c6751 = this.f12895;
        OutputStream outputStream = this.f12887;
        try {
            try {
                try {
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            boolean z = false;
                            this.f12888 = 0;
                            this.f12904 = 0;
                            this.f12905 = "HTTP/1.1";
                            m12214();
                            c6751.mark(8192);
                            try {
                                int i = c6751.read(bArr, 0, 8192);
                                if (i == -1) {
                                    AbstractC1530.m5432(c6751);
                                    AbstractC1530.m5432(outputStream);
                                    throw new SocketException("NanoHttpd Shutdown");
                                }
                                while (i > 0) {
                                    int i2 = this.f12904 + i;
                                    this.f12904 = i2;
                                    int iM12206 = m12206(i2, bArr);
                                    this.f12888 = iM12206;
                                    if (iM12206 > 0) {
                                        break;
                                    }
                                    int i3 = this.f12904;
                                    i = c6751.read(bArr, i3, 8192 - i3);
                                }
                                int i4 = this.f12888;
                                if (i4 == 0) {
                                    throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Header section too large.");
                                }
                                if (i4 < this.f12904) {
                                    c6751.reset();
                                    c6751.skip(this.f12888);
                                }
                                this.f12893 = new HashMap();
                                HashMap map = this.f12896;
                                if (map == null) {
                                    this.f12896 = new HashMap();
                                } else {
                                    map.clear();
                                }
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f12904)));
                                HashMap map2 = new HashMap();
                                this.f12898 = null;
                                this.f12889.clear();
                                m12208(bufferedReader, map2, this.f12893, this.f12896);
                                m12216(this.f12896);
                                this.f12897 = m12218();
                                EnumC12716 enumC12716M31498 = EnumC12716.m31498((String) map2.get(e.s));
                                this.f12890 = enumC12716M31498;
                                if (enumC12716M31498 == null) {
                                    throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Syntax error. HTTP verb " + ((String) map2.get(e.s)) + " unhandled.");
                                }
                                this.f12891 = (String) map2.get("uri");
                                c6751.m18852();
                                String str = this.f12899;
                                if (str != null) {
                                    this.f12896.put("remote-addr", str);
                                    this.f12896.put("http-client-ip", str);
                                }
                                this.f12903 = new C11970(this.f12896);
                                String str2 = (String) this.f12896.get("connection");
                                boolean zEquals = "HTTP/1.1".equals(this.f12905);
                                boolean z2 = zEquals && (str2 == null || !str2.matches("(?i).*close.*"));
                                C18683 c18683Mo5434 = abstractC1530.mo5434(this);
                                if (c18683Mo5434 == null) {
                                    m12215();
                                    c18683Mo5434 = abstractC1530.mo5438(this);
                                }
                                if (c18683Mo5434 == null) {
                                    throw new C0784(EnumC21667.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                                }
                                if (m12213()) {
                                    c18683Mo5434.m43438();
                                }
                                String str3 = (String) this.f12896.get("accept-encoding");
                                this.f12903.m30010(c18683Mo5434);
                                c18683Mo5434.m43445(m12205());
                                c18683Mo5434.m43441(this.f12890);
                                c18683Mo5434.m43446(zEquals);
                                if (zEquals && abstractC1530.mo5435(c18683Mo5434) && m12217(str3)) {
                                    z = true;
                                }
                                c18683Mo5434.m43442(z);
                                c18683Mo5434.m43447(z2);
                                c18683Mo5434.m43439(outputStream);
                                if (!z2 || c18683Mo5434.m43443()) {
                                    throw new SocketException("NanoHttpd Shutdown");
                                }
                                m12214();
                                AbstractC1530.m5432(c18683Mo5434);
                                c16445.m39000();
                            } catch (SSLException e) {
                                throw e;
                            } catch (IOException unused) {
                                AbstractC1530.m5432(c6751);
                                AbstractC1530.m5432(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                        } catch (C0784 e2) {
                            C18683 c18683M5422 = AbstractC1530.m5422(e2.m3180(), "text/plain", e2.getMessage());
                            c18683M5422.m43445(m12205());
                            c18683M5422.m43438();
                            c18683M5422.m43439(outputStream);
                            AbstractC1530.m5432(outputStream);
                            m12214();
                            AbstractC1530.m5432((Object) null);
                            c16445.m39000();
                        }
                    } catch (SocketTimeoutException e3) {
                        throw e3;
                    }
                } catch (SSLException e4) {
                    C18683 c18683M5423 = AbstractC1530.m5422(EnumC21667.INTERNAL_ERROR, "text/plain", "SSL PROTOCOL FAILURE: " + e4.getMessage());
                    c18683M5423.m43445(m12205());
                    c18683M5423.m43439(outputStream);
                    AbstractC1530.m5432(outputStream);
                    m12214();
                    AbstractC1530.m5432((Object) null);
                    c16445.m39000();
                }
            } catch (SocketException e5) {
                throw e5;
            } catch (IOException e6) {
                C18683 c18683M5424 = AbstractC1530.m5422(EnumC21667.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e6.getMessage());
                c18683M5424.m43445(m12205());
                c18683M5424.m43439(outputStream);
                AbstractC1530.m5432(outputStream);
                m12214();
                AbstractC1530.m5432((Object) null);
                c16445.m39000();
            }
        } catch (Throwable th) {
            m12214();
            AbstractC1530.m5432((Object) null);
            c16445.m39000();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private String m12205() {
        return "HTTP/1.0".equals(this.f12905) ? "HTTP/1.0" : "HTTP/1.1";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12206(int i, byte[] bArr) {
        int i2;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i) {
                return 0;
            }
            byte b = bArr[i3];
            if (b == 13 && bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                return i3 + 4;
            }
            if (b == 10 && bArr[i4] == 10) {
                return i3 + 2;
            }
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m12212(ByteBuffer byteBuffer, byte[] bArr) {
        int length;
        int length2;
        if (bArr.length == 0 || byteBuffer.limit() < bArr.length + 2) {
            return new int[0];
        }
        ArrayList arrayList = new ArrayList();
        int iLimit = byteBuffer.limit();
        int i = 0;
        while (i <= iLimit - bArr.length) {
            boolean z = i == 2 && byteBuffer.get(0) == 45 && byteBuffer.get(1) == 45;
            boolean z2 = i >= 4 && byteBuffer.get(i + (-4)) == 13 && byteBuffer.get(i + (-3)) == 10 && byteBuffer.get(i + (-2)) == 45 && byteBuffer.get(i + (-1)) == 45;
            if ((z || z2) && (length2 = (length = bArr.length + i) + 1) < iLimit && ((byteBuffer.get(length) == 13 && byteBuffer.get(length2) == 10) || (byteBuffer.get(length) == 45 && byteBuffer.get(length2) == 45))) {
                int i2 = 0;
                while (true) {
                    if (i2 < bArr.length) {
                        if (byteBuffer.get(i + i2) != bArr[i2]) {
                            break;
                        }
                        i2++;
                    } else {
                        arrayList.add(Integer.valueOf(i));
                        break;
                    }
                }
            }
            i++;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Map m12230() {
        return this.f12896;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m12224() {
        return C4681.unmodifiableList(this.f12889);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12220() {
        RunnableC13526 runnableC13526 = this.f12892;
        if (runnableC13526 != null) {
            runnableC13526.run();
        } else {
            AbstractC1530.m5432(this.f12895);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InputStream m12227() {
        return this.f12895;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m12229() {
        return this.f12900;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m12232() {
        return this.f12902;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12221(String str) {
        this.f12902 = str;
        this.f12900 = true;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m12214() {
        this.f12902 = null;
        this.f12900 = false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC12716 m12226() {
        return this.f12890;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap m12219() {
        HashMap map = new HashMap();
        for (String str : this.f12893.keySet()) {
            map.put(str, (String) ((List) this.f12893.get(str)).get(0));
        }
        return map;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Map m12223() {
        return this.f12893;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m12225() {
        return this.f12898;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m12228() {
        return this.f12891;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12222(HashMap map) {
        RandomAccessFile randomAccessFile;
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutput dataOutputStream;
        ByteBuffer map2;
        RandomAccessFile randomAccessFile2 = null;
        try {
            long j = this.f12896.containsKey("content-length") ? Long.parseLong((String) this.f12896.get("content-length")) : 0L;
            if (j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
                try {
                    randomAccessFile = new RandomAccessFile(this.f12901.m39001().m41874(), "rw");
                    byteArrayOutputStream = null;
                    dataOutputStream = randomAccessFile;
                } catch (Exception e) {
                    throw new Error(e);
                }
            } else {
                byteArrayOutputStream = new ByteArrayOutputStream();
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                randomAccessFile = null;
            }
            try {
                byte[] bArr = new byte[512];
                while (j > 0) {
                    int i = this.f12895.read(bArr, 0, (int) Math.min(j, 512L));
                    this.f12904 = i;
                    if (i <= 0) {
                        throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Request body ended before Content-Length.");
                    }
                    j -= (long) i;
                    dataOutputStream.write(bArr, 0, i);
                }
                if (byteArrayOutputStream != null) {
                    map2 = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                } else {
                    map2 = C19853.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()).map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
                    randomAccessFile.seek(0L);
                }
                if (EnumC12716.POST.equals(this.f12890)) {
                    C6005 c6005 = new C6005((String) this.f12896.get(e.f));
                    if (c6005.m17456()) {
                        String strM17453 = c6005.m17453();
                        if (strM17453 == null || strM17453.isEmpty()) {
                            throw new C0784(EnumC21667.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                        }
                        m12211(c6005, map2, this.f12893, map);
                    } else {
                        byte[] bArr2 = new byte[map2.remaining()];
                        map2.get(bArr2);
                        String strTrim = new String(bArr2, c6005.m17458()).trim();
                        if ("application/x-www-form-urlencoded".equalsIgnoreCase(c6005.m17457())) {
                            m12209(strTrim, this.f12893);
                        } else if (strTrim.length() != 0) {
                            map.put("postData", strTrim);
                        }
                    }
                } else if (EnumC12716.PUT.equals(this.f12890)) {
                    map.put("content", m12207(map2, 0, map2.limit(), (String) null));
                }
                AbstractC1530.m5432(randomAccessFile);
            } catch (Throwable th) {
                th = th;
                randomAccessFile2 = randomAccessFile;
                AbstractC1530.m5432(randomAccessFile2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            AbstractC1530.m5432(randomAccessFile2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private long m12218() {
        String str = (String) this.f12896.get("content-length");
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m12213() {
        return this.f12897 != this.f12895.m18851();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m12217(String str) {
        double d;
        if (str == null) {
            return false;
        }
        boolean z = false;
        for (String str2 : str.split(",")) {
            String[] strArrSplit = str2.split(l.b);
            if (strArrSplit.length != 0) {
                String lowerCase = strArrSplit[0].trim().toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    continue;
                } else {
                    int i = 1;
                    while (true) {
                        if (i >= strArrSplit.length) {
                            d = 1.0d;
                            break;
                        }
                        String strTrim = strArrSplit[i].trim();
                        int iIndexOf = strTrim.indexOf(61);
                        if (iIndexOf >= 0 && "q".equalsIgnoreCase(strTrim.substring(0, iIndexOf).trim())) {
                            try {
                                d = Double.parseDouble(strTrim.substring(iIndexOf + 1).trim());
                                break;
                            } catch (NumberFormatException unused) {
                                d = 0.0d;
                                break;
                            }
                        }
                        i++;
                    }
                    if ("gzip".equals(lowerCase)) {
                        return d > 0.0d;
                    }
                    if ("*".equals(lowerCase)) {
                        z = d > 0.0d;
                    }
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m12207(ByteBuffer byteBuffer, int i, int i2, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        if (i2 <= 0) {
            return "";
        }
        try {
            try {
                C17937 c17937M39001 = this.f12901.m39001();
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                fileOutputStream = new FileOutputStream(c17937M39001.m41874());
                try {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C19853.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
                    byteBufferDuplicate.position(i).limit(i + i2);
                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.write(byteBufferDuplicate.slice());
                    String strM41874 = c17937M39001.m41874();
                    AbstractC1530.m5432(fileOutputStream);
                    return strM41874;
                } catch (Exception e) {
                    e = e;
                    throw new Error(e);
                } catch (Throwable th) {
                    th = th;
                    AbstractC1530.m5432(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m12233() {
        return this.f12899;
    }
}
