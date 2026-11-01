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

/* JADX INFO: renamed from: l.ܶ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public final class C15530 implements InterfaceC21879 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumC18351 f50546;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f50547;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public HashMap f50548;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50549 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f50550;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f50551;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C7062 f50552;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f50553;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22585 f50554;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final OutputStream f50555;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f50556;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f50557;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f50558;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f50559;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16940 f50560;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f50561;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19057 f50562;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f50563;

    public C15530(AbstractC16940 abstractC16940, C7062 c7062, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.f50560 = abstractC16940;
        this.f50552 = c7062;
        this.f50562 = new C19057(inputStream, 8192);
        this.f50555 = outputStream;
        this.f50557 = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f50550 = new HashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37119(BufferedReader bufferedReader, HashMap map, HashMap map2, HashMap map3) throws C21173 {
        String strM39637;
        try {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            String[] strArrSplit = line.split(" ", -1);
            if (strArrSplit.length != 3 || strArrSplit[0].isEmpty() || strArrSplit[1].isEmpty() || strArrSplit[2].isEmpty()) {
                throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            }
            map.put(e.s, strArrSplit[0]);
            String str = strArrSplit[1];
            int iIndexOf = str.indexOf(63);
            if (iIndexOf >= 0) {
                m37120(str.substring(iIndexOf + 1), map2);
                try {
                    strM39637 = AbstractC16940.m39637(str.substring(0, iIndexOf), false);
                } catch (IllegalArgumentException e) {
                    throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e);
                }
            } else {
                try {
                    strM39637 = AbstractC16940.m39637(str, false);
                } catch (IllegalArgumentException e2) {
                    throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e2);
                }
            }
            String str2 = strArrSplit[2];
            this.f50551 = str2;
            if (!"HTTP/1.0".equals(str2) && !"HTTP/1.1".equals(this.f50551)) {
                throw new C21173(EnumC10591.UNSUPPORTED_HTTP_VERSION, "HTTP VERSION NOT SUPPORTED: " + this.f50551);
            }
            String line2 = bufferedReader.readLine();
            while (line2 != null && !line2.trim().isEmpty()) {
                int iIndexOf2 = line2.indexOf(58);
                if (iIndexOf2 <= 0) {
                    throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Invalid header name.");
                }
                String strSubstring = line2.substring(0, iIndexOf2);
                if (!AbstractC16940.f54138.matcher(strSubstring).matches()) {
                    throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Invalid header name.");
                }
                String lowerCase = strSubstring.toLowerCase(Locale.US);
                if ("authorization".equals(lowerCase)) {
                    this.f50549.add(line2.substring(iIndexOf2 + 1));
                }
                String strTrim = line2.substring(iIndexOf2 + 1).trim();
                if ("content-length".equals(lowerCase) && map3.containsKey(lowerCase)) {
                    throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Multiple Content-Length headers.");
                }
                if (c.f.equals(lowerCase) && map3.containsKey(lowerCase)) {
                    throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Multiple Host headers.");
                }
                map3.put(lowerCase, strTrim);
                line2 = bufferedReader.readLine();
            }
            if ("HTTP/1.1".equals(this.f50551) && !map3.containsKey(c.f)) {
                throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Missing Host header.");
            }
            map.put("uri", strM39637);
        } catch (IOException e3) {
            throw new C21173(EnumC10591.INTERNAL_ERROR, C9013.m23329(e3, new StringBuilder("SERVER INTERNAL ERROR: IOException: ")), e3);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m37124(HashMap map) throws C21173 {
        String str = (String) map.get("transfer-encoding");
        if (str != null && !str.trim().isEmpty()) {
            throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Transfer-Encoding is not supported.");
        }
        String str2 = (String) map.get("content-length");
        if (str2 == null) {
            return;
        }
        if (str2.isEmpty()) {
            throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Invalid Content-Length.");
        }
        for (int i = 0; i < str2.length(); i++) {
            char cCharAt = str2.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Invalid Content-Length.");
            }
        }
        try {
            Long.parseLong(str2);
        } catch (NumberFormatException e) {
            throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Invalid Content-Length.", e);
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m37123() throws C21173, IOException {
        String str = (String) this.f50550.get("expect");
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
            throw new C21173(EnumC10591.EXPECTATION_FAILED, "EXPECTATION FAILED: Unsupported Expect header.");
        }
        if (!"HTTP/1.1".equals(this.f50551)) {
            throw new C21173(EnumC10591.EXPECTATION_FAILED, "EXPECTATION FAILED: Expect header requires HTTP/1.1.");
        }
        if (this.f50561 > 0) {
            byte[] bytes = C22697.m50267(new StringBuilder(), this.f50551, " 100 Continue\r\n\r\n").getBytes(Charset.forName("US-ASCII"));
            OutputStream outputStream = this.f50555;
            outputStream.write(bytes);
            outputStream.flush();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37121(C2828 c2828, ByteBuffer byteBuffer, HashMap map, HashMap map2) throws Throwable {
        byte b;
        try {
            int[] iArrM37122 = m37122(byteBuffer, c2828.m8580().getBytes(Charset.forName("US-ASCII")));
            try {
                if (iArrM37122.length < 2) {
                    throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
                }
                int i = 1024;
                byte[] bArr = new byte[1024];
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = 1;
                    if (i3 >= iArrM37122.length - 1) {
                        return;
                    }
                    byteBuffer.position(iArrM37122[i3]);
                    int iRemaining = byteBuffer.remaining() < i ? byteBuffer.remaining() : 1024;
                    byteBuffer.get(bArr, i2, iRemaining);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i2, iRemaining), Charset.forName(c2828.m8579())), iRemaining);
                    String line = bufferedReader.readLine();
                    if (line == null || !line.contains(c2828.m8580())) {
                        throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
                    }
                    String strGroup = null;
                    String strTrim = null;
                    String strGroup2 = null;
                    int i6 = 2;
                    for (String line2 = bufferedReader.readLine(); line2 != null && line2.trim().length() > 0; line2 = bufferedReader.readLine()) {
                        Matcher matcher = AbstractC16940.f54137.matcher(line2);
                        if (matcher.matches()) {
                            Matcher matcher2 = AbstractC16940.f54141.matcher(matcher.group(2));
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
                        Matcher matcher3 = AbstractC16940.f54140.matcher(line2);
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
                        throw new C21173(EnumC10591.INTERNAL_ERROR, "Multipart header size exceeds MAX_HEADER_SIZE.");
                    }
                    int i10 = iArrM37122[i3] + i8;
                    i3++;
                    int i11 = iArrM37122[i3] - 4;
                    byteBuffer.position(i10);
                    List arrayList = (List) map.get(strGroup);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(strGroup, arrayList);
                    }
                    if (strTrim == null) {
                        byte[] bArr2 = new byte[i11 - i10];
                        byteBuffer.get(bArr2);
                        arrayList.add(new String(bArr2, c2828.m8579()));
                    } else {
                        String strM37118 = m37118(byteBuffer, i10, i11 - i10, strGroup2);
                        if (map2.containsKey(strGroup)) {
                            int i12 = 2;
                            while (true) {
                                if (!map2.containsKey(strGroup + i12)) {
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                            map2.put(strGroup + i12, strM37118);
                        } else {
                            map2.put(strGroup, strM37118);
                        }
                        arrayList.add(strGroup2);
                    }
                    i = 1024;
                    i4 = i7;
                    i2 = 0;
                }
            } catch (C21173 e) {
            } catch (Exception e2) {
                e = e2;
                throw new C21173(EnumC10591.INTERNAL_ERROR, e.toString());
            }
        } catch (C21173 e3) {
            throw e3;
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37120(String str, Map map) throws C21173 {
        String strTrim;
        String strM39645;
        if (str == null) {
            this.f50563 = "";
            return;
        }
        this.f50563 = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str, a.p);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(61);
            if (iIndexOf >= 0) {
                try {
                    strTrim = AbstractC16940.m39645(strNextToken.substring(0, iIndexOf)).trim();
                    try {
                        strM39645 = AbstractC16940.m39645(strNextToken.substring(iIndexOf + 1));
                    } catch (IllegalArgumentException e) {
                        throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e);
                    }
                } catch (IllegalArgumentException e2) {
                    throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e2);
                }
            } else {
                try {
                    strTrim = AbstractC16940.m39645(strNextToken).trim();
                    strM39645 = "";
                } catch (IllegalArgumentException e3) {
                    throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e3);
                }
            }
            List arrayList = (List) map.get(strTrim);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(strTrim, arrayList);
            }
            arrayList.add(strM39645);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37133() {
        AbstractC16940 abstractC16940 = this.f50560;
        C7062 c7062 = this.f50552;
        C19057 c19057 = this.f50562;
        OutputStream outputStream = this.f50555;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z = false;
                        this.f50559 = 0;
                        this.f50558 = 0;
                        this.f50551 = "HTTP/1.1";
                        m37129();
                        c19057.mark(8192);
                        try {
                            int i = c19057.read(bArr, 0, 8192);
                            if (i == -1) {
                                AbstractC16940.m39647(c19057);
                                AbstractC16940.m39647(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (i > 0) {
                                int i2 = this.f50558 + i;
                                this.f50558 = i2;
                                int iM37117 = m37117(i2, bArr);
                                this.f50559 = iM37117;
                                if (iM37117 > 0) {
                                    break;
                                }
                                int i3 = this.f50558;
                                i = c19057.read(bArr, i3, 8192 - i3);
                            }
                            int i4 = this.f50559;
                            if (i4 == 0) {
                                throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Header section too large.");
                            }
                            if (i4 < this.f50558) {
                                c19057.reset();
                                c19057.skip(this.f50559);
                            }
                            this.f50548 = new HashMap();
                            HashMap map = this.f50550;
                            if (map == null) {
                                this.f50550 = new HashMap();
                            } else {
                                map.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f50558)));
                            HashMap map2 = new HashMap();
                            this.f50563 = null;
                            this.f50549.clear();
                            m37119(bufferedReader, map2, this.f50548, this.f50550);
                            m37124(this.f50550);
                            this.f50561 = m37126();
                            EnumC18351 enumC18351M42608 = EnumC18351.m42608((String) map2.get(e.s));
                            this.f50546 = enumC18351M42608;
                            if (enumC18351M42608 == null) {
                                throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Syntax error. HTTP verb " + ((String) map2.get(e.s)) + " unhandled.");
                            }
                            this.f50553 = (String) map2.get("uri");
                            m37123();
                            c19057.m43811();
                            String str = this.f50557;
                            if (str != null) {
                                this.f50550.put("remote-addr", str);
                                this.f50550.put("http-client-ip", str);
                            }
                            this.f50554 = new C22585(this.f50550);
                            String str2 = (String) this.f50550.get("connection");
                            boolean zEquals = "HTTP/1.1".equals(this.f50551);
                            boolean z2 = zEquals && (str2 == null || !str2.matches("(?i).*close.*"));
                            C7768 c7768Mo6512 = abstractC16940.mo6512(this);
                            if (c7768Mo6512 == null) {
                                throw new C21173(EnumC10591.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                            }
                            if (m37128()) {
                                c7768Mo6512.m20446();
                            }
                            String str3 = (String) this.f50550.get("accept-encoding");
                            this.f50554.m50093(c7768Mo6512);
                            c7768Mo6512.m20453(m37127());
                            c7768Mo6512.m20449(this.f50546);
                            c7768Mo6512.m20450(zEquals);
                            if (zEquals && abstractC16940.mo6513(c7768Mo6512) && m37125(str3)) {
                                z = true;
                            }
                            c7768Mo6512.m20454(z);
                            c7768Mo6512.m20452(z2);
                            c7768Mo6512.m20447(outputStream);
                            if (!z2 || c7768Mo6512.m20443()) {
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            m37129();
                            AbstractC16940.m39647(c7768Mo6512);
                            c7062.m18928();
                        } catch (SSLException e) {
                            throw e;
                        } catch (IOException unused) {
                            AbstractC16940.m39647(c19057);
                            AbstractC16940.m39647(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (C21173 e2) {
                        C7768 c7768M39639 = AbstractC16940.m39639(e2.m47632(), "text/plain", e2.getMessage());
                        c7768M39639.m20453(m37127());
                        c7768M39639.m20446();
                        c7768M39639.m20447(outputStream);
                        AbstractC16940.m39647(outputStream);
                        m37129();
                        AbstractC16940.m39647((Object) null);
                        c7062.m18928();
                    }
                } catch (SocketTimeoutException e3) {
                    throw e3;
                } catch (SSLException e4) {
                    C7768 c7768M396310 = AbstractC16940.m39639(EnumC10591.INTERNAL_ERROR, "text/plain", "SSL PROTOCOL FAILURE: " + e4.getMessage());
                    c7768M396310.m20453(m37127());
                    c7768M396310.m20447(outputStream);
                    AbstractC16940.m39647(outputStream);
                    m37129();
                    AbstractC16940.m39647((Object) null);
                    c7062.m18928();
                }
            } catch (SocketException e5) {
                throw e5;
            } catch (IOException e6) {
                C7768 c7768M396311 = AbstractC16940.m39639(EnumC10591.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e6.getMessage());
                c7768M396311.m20453(m37127());
                c7768M396311.m20447(outputStream);
                AbstractC16940.m39647(outputStream);
                m37129();
                AbstractC16940.m39647((Object) null);
                c7062.m18928();
            }
        } catch (Throwable th) {
            m37129();
            AbstractC16940.m39647((Object) null);
            c7062.m18928();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private String m37127() {
        return "HTTP/1.0".equals(this.f50551) ? "HTTP/1.0" : "HTTP/1.1";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37117(int i, byte[] bArr) {
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
    public static int[] m37122(ByteBuffer byteBuffer, byte[] bArr) {
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Map m37131() {
        return this.f50550;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m37140() {
        return C0561.unmodifiableList(this.f50549);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InputStream m37136() {
        return this.f50562;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m37141() {
        return this.f50547;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m37138() {
        return this.f50556;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37134(String str) {
        this.f50556 = str;
        this.f50547 = true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m37129() {
        this.f50556 = null;
        this.f50547 = false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC18351 m37142() {
        return this.f50546;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final HashMap m37139() {
        HashMap map = new HashMap();
        for (String str : this.f50548.keySet()) {
            map.put(str, (String) ((List) this.f50548.get(str)).get(0));
        }
        return map;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Map m37130() {
        return this.f50548;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m37132() {
        return this.f50563;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m37143() {
        return this.f50553;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37135(HashMap map) {
        RandomAccessFile randomAccessFile;
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutput dataOutputStream;
        ByteBuffer map2;
        RandomAccessFile randomAccessFile2 = null;
        try {
            long j = this.f50550.containsKey("content-length") ? Long.parseLong((String) this.f50550.get("content-length")) : 0L;
            if (j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
                try {
                    randomAccessFile = new RandomAccessFile(this.f50552.m18929().m11893(), "rw");
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
                    int i = this.f50562.read(bArr, 0, (int) Math.min(j, 512L));
                    this.f50558 = i;
                    if (i <= 0) {
                        throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Request body ended before Content-Length.");
                    }
                    j -= (long) i;
                    dataOutputStream.write(bArr, 0, i);
                }
                if (byteArrayOutputStream != null) {
                    map2 = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                } else {
                    map2 = C6001.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()).map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
                    randomAccessFile.seek(0L);
                }
                if (EnumC18351.POST.equals(this.f50546)) {
                    C2828 c2828 = new C2828((String) this.f50550.get(e.f));
                    if (c2828.m8581()) {
                        String strM8580 = c2828.m8580();
                        if (strM8580 == null || strM8580.isEmpty()) {
                            throw new C21173(EnumC10591.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                        }
                        m37121(c2828, map2, this.f50548, map);
                    } else {
                        byte[] bArr2 = new byte[map2.remaining()];
                        map2.get(bArr2);
                        String strTrim = new String(bArr2, c2828.m8579()).trim();
                        if ("application/x-www-form-urlencoded".equalsIgnoreCase(c2828.m8583())) {
                            m37120(strTrim, this.f50548);
                        } else if (strTrim.length() != 0) {
                            map.put("postData", strTrim);
                        }
                    }
                } else if (EnumC18351.PUT.equals(this.f50546)) {
                    map.put("content", m37118(map2, 0, map2.limit(), (String) null));
                }
                AbstractC16940.m39647(randomAccessFile);
            } catch (Throwable th) {
                th = th;
                randomAccessFile2 = randomAccessFile;
                AbstractC16940.m39647(randomAccessFile2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            AbstractC16940.m39647(randomAccessFile2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private long m37126() {
        String str = (String) this.f50550.get("content-length");
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private boolean m37128() {
        return this.f50561 != this.f50562.m43810();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m37125(String str) {
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
    private String m37118(ByteBuffer byteBuffer, int i, int i2, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        if (i2 <= 0) {
            return "";
        }
        try {
            try {
                C4239 c4239M18929 = this.f50552.m18929();
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                fileOutputStream = new FileOutputStream(c4239M18929.m11893());
                try {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C6001.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
                    byteBufferDuplicate.position(i).limit(i + i2);
                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.write(byteBufferDuplicate.slice());
                    String strM11893 = c4239M18929.m11893();
                    AbstractC16940.m39647(fileOutputStream);
                    return strM11893;
                } catch (Exception e) {
                    e = e;
                    throw new Error(e);
                } catch (Throwable th) {
                    th = th;
                    AbstractC16940.m39647(fileOutputStream);
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

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m37137() {
        return this.f50557;
    }
}
