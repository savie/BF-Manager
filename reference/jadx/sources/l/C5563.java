package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.Socket;

/* JADX INFO: renamed from: l.ۚۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q541 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5563 extends Thread {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InputStream f19313;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f19314;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f19315;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f19316;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f19317;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public OutputStream f19318;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C13020 f19319;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String[] f19320;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f19321;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f19323;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f19324;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Socket f19325;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Socket f19326;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f19327;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f19329;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f19328 = false;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f19330 = null;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f19322 = false;

    public C5563(Socket socket, C13020 c13020) {
        AbstractC22044 abstractC22044M45436 = C19733.m45436();
        this.f19327 = abstractC22044M45436;
        this.f19316 = abstractC22044M45436;
        this.f19326 = null;
        this.f19323 = null;
        this.f19313 = null;
        this.f19318 = null;
        this.f19321 = C19733.m45440();
        this.f19317 = -1L;
        this.f19314 = -1L;
        this.f19320 = new String[]{"Size", "Modify", "Type", "Perm"};
        this.f19324 = 0;
        this.f19315 = "SHA-1";
        this.f19325 = socket;
        this.f19319 = c13020;
        this.f19329 = true;
        try {
            socket.setSoTimeout(30000);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16483(int i, int i2, byte[] bArr) {
        OutputStream outputStream = this.f19318;
        if (outputStream == null) {
            return false;
        }
        if (i2 == 0) {
            return true;
        }
        try {
            outputStream.write(bArr, i, i2);
            this.f19319.getClass();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m16476(byte[] bArr) {
        int i;
        Socket socket = this.f19326;
        if (socket == null || !socket.isConnected()) {
            return -2;
        }
        do {
            i = 0;
            try {
                i = this.f19313.read(bArr, 0, bArr.length);
            } catch (IOException unused) {
            }
        } while (i == 0);
        return i;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m16490() {
        return this.f19319.m32449();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16479(InetAddress inetAddress, int i) {
        this.f19319.m32447(inetAddress, i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InetAddress m16485() {
        return this.f19325.getLocalAddress();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m16499() {
        try {
            Socket socketM32448 = this.f19319.m32448();
            this.f19326 = socketM32448;
            if (socketM32448 == null) {
                return false;
            }
            this.f19313 = socketM32448.getInputStream();
            this.f19318 = this.f19326.getOutputStream();
            return true;
        } catch (IOException unused) {
            this.f19326 = null;
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16477() {
        InputStream inputStream = this.f19313;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            this.f19313 = null;
        }
        OutputStream outputStream = this.f19318;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused2) {
            }
            this.f19318 = null;
        }
        Socket socket = this.f19326;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused3) {
            }
        }
        this.f19326 = null;
        C13020 c13020 = this.f19319;
        if (c13020 != null) {
            c13020.m32446();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String string;
        if (this.f19329) {
            m16486("220 FTP-Server ready\r\n");
        }
        try {
            InputStream inputStream = this.f19325.getInputStream();
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
                    m16494();
                    return;
                }
                if (z || byteArrayOutputStream.size() != 0) {
                    try {
                        string = byteArrayOutputStream.toString(this.f19321);
                    } catch (UnsupportedEncodingException unused) {
                        string = byteArrayOutputStream.toString();
                    }
                } else {
                    string = null;
                }
                if (string != null) {
                    AbstractRunnableC15257.m36604(this, string);
                } else {
                    m16494();
                    return;
                }
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16494() {
        m16477();
        Socket socket = this.f19325;
        if (socket == null) {
            return;
        }
        try {
            socket.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m16486(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f19321);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        try {
            OutputStream outputStream = this.f19325.getOutputStream();
            outputStream.write(bytes);
            outputStream.flush();
            C13020 c13020 = this.f19319;
            int length = bytes.length;
            c13020.getClass();
        } catch (IOException unused2) {
            m16494();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Socket m16484() {
        return this.f19325;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m16491() {
        return this.f19328;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16497(boolean z) {
        this.f19328 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16495(String str) {
        this.f19330 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m16475() {
        return this.f19330;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m16500() {
        return !this.f19322 && C19733.m45434();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m16492() {
        return this.f19322;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16481(boolean z) {
        if (z) {
            this.f19322 = true;
            return;
        }
        int i = this.f19324 + 1;
        this.f19324 = i;
        if (i > 3) {
            m16494();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m16487() {
        return this.f19327;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16496(AbstractC22044 abstractC22044) {
        this.f19327 = abstractC22044.mo4284();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m16489() {
        return this.f19323;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16480(AbstractC22044 abstractC22044) {
        this.f19323 = abstractC22044;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String[] m16498() {
        return this.f19320;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16482(String[] strArr) {
        this.f19320 = strArr;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m16493() {
        return this.f19315;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16478(String str) {
        this.f19315 = str;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m16488() {
        AbstractC22044 abstractC22044 = this.f19316;
        return abstractC22044.mo4281() ? abstractC22044 : C19733.m45436();
    }
}
