package l;

import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.w.a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: l.۬ۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R9TK */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13001 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f43358;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C3431 f43359;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Socket f43360;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        f43358 = simpleDateFormat;
        simpleDateFormat.setTimeZone(C12557.getTimeZone("GMT"));
    }

    public RunnableC13001(Socket socket, C3431 c3431) {
        this.f43360 = socket;
        this.f43359 = c3431;
        C4716.f16636.execute(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.۬ۡ֨] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.۬ۡ֨] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ?? r2;
        String str2;
        LinkedHashMap linkedHashMap;
        ?? r3;
        byte[] bArr;
        int i;
        final long j;
        boolean z;
        String str3;
        String str4;
        ?? r4 = "text/plain";
        C3431 c3431 = this.f43359;
        try {
            try {
                try {
                    InputStream inputStream = this.f43360.getInputStream();
                    if (inputStream != null && (i = inputStream.read((bArr = new byte[8192]), 0, 8192)) > 0) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, i)));
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        m32169(bufferedReader, map, map2);
                        String str5 = (String) map.get(e.s);
                        C13638.requireNonNull(str5);
                        String str6 = (String) map.get("uri");
                        C13638.requireNonNull(str6);
                        try {
                            if (!str6.startsWith("/" + c3431.f12649 + "/")) {
                                throw new C4533("404 Not Found");
                            }
                            String strSubstring = str6.substring(c3431.f12649.length() + 2);
                            if (strSubstring.isEmpty()) {
                                throw new C4533("403 Forbidden");
                            }
                            if (!str5.equalsIgnoreCase("get") && !str5.equalsIgnoreCase("head")) {
                                throw new C4533("501 Not Implemented", "Unsupported method: ".concat(str5));
                            }
                            String str7 = (String) map2.get("range");
                            if (str7 == null || !str7.startsWith("bytes=")) {
                                j = 0;
                                z = false;
                            } else {
                                String strSubstring2 = str7.substring(6);
                                int iIndexOf = strSubstring2.indexOf(45);
                                if (iIndexOf > 0) {
                                    strSubstring2 = strSubstring2.substring(0, iIndexOf);
                                }
                                try {
                                    j = Long.parseLong(strSubstring2);
                                    z = true;
                                } catch (NumberFormatException unused) {
                                    j = 0;
                                    z = false;
                                }
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap2.put("Accept-Ranges", "bytes");
                            str2 = "text/plain";
                            try {
                                try {
                                    if (strSubstring.equals(c3431.f12645)) {
                                        linkedHashMap2.put("Content-Length", "" + (c3431.f12642 - j));
                                        if (z) {
                                            try {
                                                linkedHashMap2.put("Content-Range", "bytes " + j + "-" + (c3431.f12642 - 1) + "/" + c3431.f12642);
                                                str4 = "206 Partial Content";
                                            } catch (C4533 e) {
                                                e = e;
                                                str = str2;
                                                r3 = this;
                                                linkedHashMap = null;
                                            }
                                        } else {
                                            str4 = "200 OK";
                                        }
                                        if (str5.equalsIgnoreCase("head")) {
                                            m32170(str4, c3431.f12647, linkedHashMap2, null);
                                        } else {
                                            try {
                                                if (c3431.f12643.incrementAndGet() >= 12) {
                                                    System.out.println("Too many requests");
                                                    throw new C4533("429 Too Many Requests");
                                                }
                                                m32170(str4, c3431.f12647, linkedHashMap2, new InterfaceC1005() { // from class: l.ۖۡ֨
                                                    @Override // l.InterfaceC1005
                                                    /* JADX INFO: renamed from: ۙ */
                                                    public final void mo3834(OutputStream outputStream) throws IOException {
                                                        this.f9694.f43359.m10139(outputStream, j);
                                                    }
                                                });
                                                c3431.f12643.decrementAndGet();
                                            } catch (Throwable th) {
                                                c3431.f12643.decrementAndGet();
                                                throw th;
                                            }
                                        }
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        try {
                                            sb.append(C6730.m18172(c3431.f12648));
                                            sb.append(strSubstring);
                                            final String string = sb.toString();
                                            InterfaceC2557 interfaceC2557Mo10264 = c3431.f12644.mo10264(string);
                                            if (interfaceC2557Mo10264 == null) {
                                                throw new C4533("404 Not Found");
                                            }
                                            C15404 c15404 = (C15404) interfaceC2557Mo10264;
                                            long size = c15404.getSize();
                                            linkedHashMap2.put("Content-Length", "" + (size - j));
                                            if (z) {
                                                linkedHashMap2.put("Content-Range", "bytes " + j + "-" + (size - 1) + "/" + size);
                                                str3 = "206 Partial Content";
                                            } else {
                                                str3 = "200 OK";
                                            }
                                            if (str5.equalsIgnoreCase("head")) {
                                                m32170(str3, c15404.mo7967(), linkedHashMap2, null);
                                                return;
                                            } else {
                                                m32170(str3, c15404.mo7967(), linkedHashMap2, new InterfaceC1005() { // from class: l.ۚۡ֨
                                                    @Override // l.InterfaceC1005
                                                    /* JADX INFO: renamed from: ۙ */
                                                    public final void mo3834(OutputStream outputStream) throws IOException {
                                                        InputStream inputStreamMo10262 = this.f18164.f43359.f12644.mo10262(j, string);
                                                        try {
                                                            C20010.m45296(inputStreamMo10262, outputStream, 12288);
                                                            inputStreamMo10262.close();
                                                        } catch (Throwable th2) {
                                                            if (inputStreamMo10262 != null) {
                                                                try {
                                                                    inputStreamMo10262.close();
                                                                } catch (Throwable th3) {
                                                                    th2.addSuppressed(th3);
                                                                }
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } catch (C4533 e2) {
                                            e = e2;
                                            r4 = this;
                                        } catch (Exception e3) {
                                            e = e3;
                                            r4 = this;
                                            final String strM22142 = C8479.m22142(e, new StringBuilder("SERVER INTERNAL ERROR: "));
                                            r4.m32170("500 Internal Server Error", str2, null, new InterfaceC1005() { // from class: l.᩹ۡ֨
                                                @Override // l.InterfaceC1005
                                                /* JADX INFO: renamed from: ۙ */
                                                public final void mo3834(OutputStream outputStream) throws IOException {
                                                    outputStream.write(strM22142.getBytes());
                                                }
                                            });
                                            return;
                                        }
                                    }
                                } catch (C4533 e4) {
                                    e = e4;
                                    r4 = this;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                r4 = this;
                                final String strM22143 = C8479.m22142(e, new StringBuilder("SERVER INTERNAL ERROR: "));
                                r4.m32170("500 Internal Server Error", str2, null, new InterfaceC1005() { // from class: l.᩹ۡ֨
                                    @Override // l.InterfaceC1005
                                    /* JADX INFO: renamed from: ۙ */
                                    public final void mo3834(OutputStream outputStream) throws IOException {
                                        outputStream.write(strM22143.getBytes());
                                    }
                                });
                                return;
                            }
                        } catch (C4533 e6) {
                            e = e6;
                        } catch (Exception e7) {
                            e = e7;
                        }
                        r4 = this;
                        str = str2;
                        r2 = r4;
                        linkedHashMap = null;
                        r3 = r2;
                        final String str8 = e.f16125;
                        r3.m32170(e.f16126, str, linkedHashMap, new InterfaceC1005() { // from class: l.᩹ۡ֨
                            @Override // l.InterfaceC1005
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo3834(OutputStream outputStream) throws IOException {
                                outputStream.write(str8.getBytes());
                            }
                        });
                    }
                } catch (C4533 e8) {
                    e = e8;
                    str2 = "text/plain";
                }
            } catch (Exception e9) {
                e = e9;
                str2 = "text/plain";
            }
        } catch (C4533 e10) {
            e = e10;
            str = "text/plain";
            r2 = this;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32169(BufferedReader bufferedReader, HashMap map, HashMap map2) throws C4533 {
        try {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(line);
            if (!stringTokenizer.hasMoreTokens()) {
                throw new C4533("400 Bad Request", "BAD REQUEST: Syntax error");
            }
            map.put(e.s, stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreTokens()) {
                throw new C4533("400 Bad Request", "BAD REQUEST: Missing URI");
            }
            try {
                map.put("uri", C12352.decode(stringTokenizer.nextToken(), a.D));
                if (stringTokenizer.hasMoreTokens()) {
                    String line2 = bufferedReader.readLine();
                    while (line2 != null && line2.trim().length() > 0) {
                        int iIndexOf = line2.indexOf(58);
                        if (iIndexOf >= 0) {
                            map2.put(line2.substring(0, iIndexOf).trim().toLowerCase(), line2.substring(iIndexOf + 1).trim());
                        }
                        line2 = bufferedReader.readLine();
                    }
                }
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new C4533("500 Internal Server Error", C9013.m23329(e2, new StringBuilder("SERVER INTERNAL ERROR: IOException: ")));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32170(String str, String str2, LinkedHashMap linkedHashMap, InterfaceC1005 interfaceC1005) {
        Socket socket = this.f43360;
        try {
            try {
                if (str == null) {
                    throw new Error("sendResponse(): Status can't be null.");
                }
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.print("HTTP/1.0 " + str + " \r\n");
                if (str2 != null) {
                    printWriter.print("Content-Type: " + str2 + "\r\n");
                }
                if (linkedHashMap == null || !linkedHashMap.containsKey("Date")) {
                    printWriter.print("Date: " + f43358.format(new Date()) + "\r\n");
                }
                if (linkedHashMap != null) {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        printWriter.print(((String) entry.getKey()) + ": " + ((String) entry.getValue()) + "\r\n");
                    }
                }
                printWriter.print("\r\n");
                printWriter.flush();
                if (interfaceC1005 != null) {
                    interfaceC1005.mo3834(outputStream);
                }
                outputStream.flush();
                outputStream.close();
            } catch (Throwable unused) {
            }
        } catch (IOException unused2) {
            socket.close();
        }
    }
}
