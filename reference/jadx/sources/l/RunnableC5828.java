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

/* JADX INFO: renamed from: l.ۚᩳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R9TK */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5828 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f20046;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13702 f20047;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Socket f20048;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        f20046 = simpleDateFormat;
        simpleDateFormat.setTimeZone(C10646.getTimeZone("GMT"));
    }

    public RunnableC5828(Socket socket, C13702 c13702) {
        this.f20048 = socket;
        this.f20047 = c13702;
        C5261.f18540.execute(this);
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
    /* JADX WARN: Type inference failed for: r2v3, types: [l.ۚᩳ۫] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.ۚᩳ۫] */
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
        C13702 c13702 = this.f20047;
        try {
            try {
                try {
                    InputStream inputStream = this.f20048.getInputStream();
                    if (inputStream != null && (i = inputStream.read((bArr = new byte[8192]), 0, 8192)) > 0) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, i)));
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        m17009(bufferedReader, map, map2);
                        String str5 = (String) map.get(e.s);
                        C17359.requireNonNull(str5);
                        String str6 = (String) map.get("uri");
                        C17359.requireNonNull(str6);
                        try {
                            if (!str6.startsWith("/" + c13702.f43470 + "/")) {
                                throw new C5082("404 Not Found");
                            }
                            String strSubstring = str6.substring(c13702.f43470.length() + 2);
                            if (strSubstring.isEmpty()) {
                                throw new C5082("403 Forbidden");
                            }
                            if (!str5.equalsIgnoreCase("get") && !str5.equalsIgnoreCase("head")) {
                                throw new C5082("501 Not Implemented", "Unsupported method: ".concat(str5));
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
                                    if (strSubstring.equals(c13702.f43465)) {
                                        linkedHashMap2.put("Content-Length", "" + (c13702.f43468 - j));
                                        if (z) {
                                            try {
                                                linkedHashMap2.put("Content-Range", "bytes " + j + "-" + (c13702.f43468 - 1) + "/" + c13702.f43468);
                                                str4 = "206 Partial Content";
                                            } catch (C5082 e) {
                                                e = e;
                                                str = str2;
                                                r3 = this;
                                                linkedHashMap = null;
                                            }
                                        } else {
                                            str4 = "200 OK";
                                        }
                                        if (str5.equalsIgnoreCase("head")) {
                                            m17010(str4, c13702.f43463, linkedHashMap2, null);
                                        } else {
                                            try {
                                                if (c13702.f43466.incrementAndGet() >= 12) {
                                                    System.out.println("Too many requests");
                                                    throw new C5082("429 Too Many Requests");
                                                }
                                                m17010(str4, c13702.f43463, linkedHashMap2, new InterfaceC13285() { // from class: l.᩸ᩳ۫
                                                    @Override // l.InterfaceC13285
                                                    /* JADX INFO: renamed from: ۙ */
                                                    public final void mo32827(OutputStream outputStream) throws IOException {
                                                        this.f74621.f20047.m33496(outputStream, j);
                                                    }
                                                });
                                                c13702.f43466.decrementAndGet();
                                            } catch (Throwable th) {
                                                c13702.f43466.decrementAndGet();
                                                throw th;
                                            }
                                        }
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        try {
                                            sb.append(C11293.m28556(c13702.f43469));
                                            sb.append(strSubstring);
                                            final String string = sb.toString();
                                            InterfaceC2386 interfaceC2386Mo20831 = c13702.f43464.mo20831(string);
                                            if (interfaceC2386Mo20831 == null) {
                                                throw new C5082("404 Not Found");
                                            }
                                            C13352 c13352 = (C13352) interfaceC2386Mo20831;
                                            long size = c13352.getSize();
                                            linkedHashMap2.put("Content-Length", "" + (size - j));
                                            if (z) {
                                                linkedHashMap2.put("Content-Range", "bytes " + j + "-" + (size - 1) + "/" + size);
                                                str3 = "206 Partial Content";
                                            } else {
                                                str3 = "200 OK";
                                            }
                                            if (str5.equalsIgnoreCase("head")) {
                                                m17010(str3, c13352.mo8114(), linkedHashMap2, null);
                                                return;
                                            } else {
                                                m17010(str3, c13352.mo8114(), linkedHashMap2, new InterfaceC13285() { // from class: l.ᩴᩳ۫
                                                    @Override // l.InterfaceC13285
                                                    /* JADX INFO: renamed from: ۙ */
                                                    public final void mo32827(OutputStream outputStream) throws IOException {
                                                        InputStream inputStreamMo35570 = this.f64257.f20047.f43464.mo35570(j, string);
                                                        try {
                                                            C5125.m15489(inputStreamMo35570, outputStream, 12288);
                                                            inputStreamMo35570.close();
                                                        } catch (Throwable th2) {
                                                            if (inputStreamMo35570 != null) {
                                                                try {
                                                                    inputStreamMo35570.close();
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
                                        } catch (C5082 e2) {
                                            e = e2;
                                            r4 = this;
                                        } catch (Exception e3) {
                                            e = e3;
                                            r4 = this;
                                            final String strM38224 = C16076.m38224(e, new StringBuilder("SERVER INTERNAL ERROR: "));
                                            r4.m17010("500 Internal Server Error", str2, null, new InterfaceC13285() { // from class: l.ܳᩳ۫
                                                @Override // l.InterfaceC13285
                                                /* JADX INFO: renamed from: ۙ */
                                                public final void mo32827(OutputStream outputStream) throws IOException {
                                                    outputStream.write(strM38224.getBytes());
                                                }
                                            });
                                            return;
                                        }
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    r4 = this;
                                    final String strM38225 = C16076.m38224(e, new StringBuilder("SERVER INTERNAL ERROR: "));
                                    r4.m17010("500 Internal Server Error", str2, null, new InterfaceC13285() { // from class: l.ܳᩳ۫
                                        @Override // l.InterfaceC13285
                                        /* JADX INFO: renamed from: ۙ */
                                        public final void mo32827(OutputStream outputStream) throws IOException {
                                            outputStream.write(strM38225.getBytes());
                                        }
                                    });
                                    return;
                                }
                            } catch (C5082 e5) {
                                e = e5;
                                r4 = this;
                            }
                        } catch (C5082 e6) {
                            e = e6;
                        } catch (Exception e7) {
                            e = e7;
                        }
                        r4 = this;
                        str = str2;
                        r2 = r4;
                        linkedHashMap = null;
                        r3 = r2;
                        final String str8 = e.f17721;
                        r3.m17010(e.f17722, str, linkedHashMap, new InterfaceC13285() { // from class: l.ܳᩳ۫
                            @Override // l.InterfaceC13285
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo32827(OutputStream outputStream) throws IOException {
                                outputStream.write(str8.getBytes());
                            }
                        });
                    }
                } catch (C5082 e8) {
                    e = e8;
                    str2 = "text/plain";
                }
            } catch (Exception e9) {
                e = e9;
                str2 = "text/plain";
            }
        } catch (C5082 e10) {
            e = e10;
            str = "text/plain";
            r2 = this;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17009(BufferedReader bufferedReader, HashMap map, HashMap map2) throws C5082 {
        try {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(line);
            if (!stringTokenizer.hasMoreTokens()) {
                throw new C5082("400 Bad Request", "BAD REQUEST: Syntax error");
            }
            map.put(e.s, stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreTokens()) {
                throw new C5082("400 Bad Request", "BAD REQUEST: Missing URI");
            }
            try {
                map.put("uri", C10902.decode(stringTokenizer.nextToken(), a.D));
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
            throw new C5082("500 Internal Server Error", C11958.m29932(e2, new StringBuilder("SERVER INTERNAL ERROR: IOException: ")));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17010(String str, String str2, LinkedHashMap linkedHashMap, InterfaceC13285 interfaceC13285) {
        Socket socket = this.f20048;
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
                    printWriter.print("Date: " + f20046.format(new Date()) + "\r\n");
                }
                if (linkedHashMap != null) {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        printWriter.print(((String) entry.getKey()) + ": " + ((String) entry.getValue()) + "\r\n");
                    }
                }
                printWriter.print("\r\n");
                printWriter.flush();
                if (interfaceC13285 != null) {
                    interfaceC13285.mo32827(outputStream);
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
