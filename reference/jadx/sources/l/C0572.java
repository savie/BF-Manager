package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.Socket;

/* JADX INFO: renamed from: l.֡ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q541 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0572 extends Thread {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Socket f2364;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20329 f2365;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f2367;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f2368;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f2369;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f2370;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f2371;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f2372;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public OutputStream f2374;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f2375;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f2376;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f2377;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InputStream f2378;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Socket f2379;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String[] f2381;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f2380 = false;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public String f2366 = null;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f2373 = false;

    public C0572(Socket socket, C20329 c20329) {
        AbstractC20745 abstractC20745M47436 = C21034.m47436();
        this.f2369 = abstractC20745M47436;
        this.f2368 = abstractC20745M47436;
        this.f2379 = null;
        this.f2367 = null;
        this.f2378 = null;
        this.f2374 = null;
        this.f2370 = C21034.m47437();
        this.f2371 = -1L;
        this.f2372 = -1L;
        this.f2381 = new String[]{"Size", "Modify", "Type", "Perm"};
        this.f2377 = 0;
        this.f2376 = "SHA-1";
        this.f2364 = socket;
        this.f2365 = c20329;
        this.f2375 = true;
        try {
            socket.setSoTimeout(30000);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2704(int i, int i2, byte[] bArr) {
        OutputStream outputStream = this.f2374;
        if (outputStream == null) {
            return false;
        }
        if (i2 == 0) {
            return true;
        }
        try {
            outputStream.write(bArr, i, i2);
            this.f2365.getClass();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m2697(byte[] bArr) {
        int i;
        Socket socket = this.f2379;
        if (socket == null || !socket.isConnected()) {
            return -2;
        }
        do {
            i = 0;
            try {
                i = this.f2378.read(bArr, 0, bArr.length);
            } catch (IOException unused) {
            }
        } while (i == 0);
        return i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m2715() {
        return this.f2365.m45893();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2700(InetAddress inetAddress, int i) {
        this.f2365.m45891(inetAddress, i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InetAddress m2707() {
        return this.f2364.getLocalAddress();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m2716() {
        try {
            Socket socketM45892 = this.f2365.m45892();
            this.f2379 = socketM45892;
            if (socketM45892 == null) {
                return false;
            }
            this.f2378 = socketM45892.getInputStream();
            this.f2374 = this.f2379.getOutputStream();
            return true;
        } catch (IOException unused) {
            this.f2379 = null;
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2698() {
        InputStream inputStream = this.f2378;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            this.f2378 = null;
        }
        OutputStream outputStream = this.f2374;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused2) {
            }
            this.f2374 = null;
        }
        Socket socket = this.f2379;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused3) {
            }
        }
        this.f2379 = null;
        C20329 c20329 = this.f2365;
        if (c20329 != null) {
            c20329.m45890();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String string;
        if (this.f2375) {
            m2708("220 FTP-Server ready\r\n");
        }
        try {
            InputStream inputStream = this.f2364.getInputStream();
            while (true) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(128);
                int i = 0;
                boolean z = false;
                while (true) {
                    int i2 = inputStream.read();
                    if (i2 == -1) {
                        break;
                    }
                    if (i2 == 10) {
                        z = true;
                        break;
                    } else {
                        if (i >= 8192) {
                            throw new IOException("FTP command line too long");
                        }
                        i++;
                        if (i2 != 13) {
                            byteArrayOutputStream.write(i2);
                        }
                        z = true;
                    }
                    m2710();
                    return;
                }
                if (z || byteArrayOutputStream.size() != 0) {
                    try {
                        string = byteArrayOutputStream.toString(this.f2370);
                    } catch (UnsupportedEncodingException unused) {
                        string = byteArrayOutputStream.toString();
                    }
                } else {
                    string = null;
                }
                if (string != null) {
                    AbstractRunnableC16096.m38123(this, string);
                } else {
                    m2710();
                    return;
                }
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2710() {
        m2698();
        Socket socket = this.f2364;
        if (socket == null) {
            return;
        }
        try {
            socket.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m2708(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f2370);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        try {
            OutputStream outputStream = this.f2364.getOutputStream();
            outputStream.write(bytes);
            outputStream.flush();
            C20329 c20329 = this.f2365;
            int length = bytes.length;
            c20329.getClass();
        } catch (IOException unused2) {
            m2710();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Socket m2709() {
        return this.f2364;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m2714() {
        return this.f2380;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2713(boolean z) {
        this.f2380 = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2711(String str) {
        this.f2366 = str;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m2696() {
        return this.f2366;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m2719() {
        return !this.f2373 && C21034.m47433();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m2717() {
        return this.f2373;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2702(boolean z) {
        if (z) {
            this.f2373 = true;
            return;
        }
        int i = this.f2377 + 1;
        this.f2377 = i;
        if (i > 3) {
            m2710();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m2706() {
        return this.f2369;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2712(AbstractC20745 abstractC20745) {
        this.f2369 = abstractC20745.mo24641();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m2718() {
        return this.f2367;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2701(AbstractC20745 abstractC20745) {
        this.f2367 = abstractC20745;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String[] m2695() {
        return this.f2381;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2703(String[] strArr) {
        this.f2381 = strArr;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m2705() {
        return this.f2376;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2699(String str) {
        this.f2376 = str;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m2694() {
        AbstractC20745 abstractC20745 = this.f2368;
        return abstractC20745.mo33974() ? abstractC20745 : C21034.m47436();
    }
}
