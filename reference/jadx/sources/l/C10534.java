package l;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: l.ۤ᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18M5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10534 extends AbstractC21428 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f36064;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final byte[] f36065;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InetAddress f36066;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f36067;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final DatagramPacket f36068;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f36069;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Uri f36070;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public MulticastSocket f36071;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public DatagramSocket f36072;

    public C10534() {
        super(true);
        this.f36069 = 8000;
        byte[] bArr = new byte[2000];
        this.f36065 = bArr;
        this.f36068 = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) throws C9123 {
        Uri uri = c12257.f41015;
        this.f36070 = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f36070.getPort();
        m48019(c12257);
        try {
            this.f36066 = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f36066, port);
            if (this.f36066.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f36071 = multicastSocket;
                multicastSocket.joinGroup(this.f36066);
                this.f36072 = this.f36071;
            } else {
                this.f36072 = new DatagramSocket(inetSocketAddress);
            }
            this.f36072.setSoTimeout(this.f36069);
            this.f36064 = true;
            m48018(c12257);
            return -1L;
        } catch (IOException e) {
            throw new C9123(2001, e);
        } catch (SecurityException e2) {
            throw new C9123(2006, e2);
        }
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws C9123 {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f36067;
        DatagramPacket datagramPacket = this.f36068;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.f36072;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f36067 = length;
                m48017(length);
            } catch (SocketTimeoutException e) {
                throw new C9123(2002, e);
            } catch (IOException e2) {
                throw new C9123(2001, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.f36067;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f36065, length2 - i4, bArr, i, iMin);
        this.f36067 -= iMin;
        return iMin;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        return this.f36070;
    }

    @Override // l.InterfaceC15785
    public final void close() {
        this.f36070 = null;
        MulticastSocket multicastSocket = this.f36071;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f36066;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f36071 = null;
        }
        DatagramSocket datagramSocket = this.f36072;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f36072 = null;
        }
        this.f36066 = null;
        this.f36067 = 0;
        if (this.f36064) {
            this.f36064 = false;
            m48020();
        }
    }
}
