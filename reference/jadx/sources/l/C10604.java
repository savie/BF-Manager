package l;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: l.ۤۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18M5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10604 extends AbstractC8433 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f33662;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final DatagramPacket f33663;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f33664;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f33665;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public MulticastSocket f33666;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f33667;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Uri f33668;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InetAddress f33669;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public DatagramSocket f33670;

    public C10604() {
        super(true);
        this.f33667 = 8000;
        byte[] bArr = new byte[2000];
        this.f33662 = bArr;
        this.f33663 = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws C21793 {
        Uri uri = c25368.f81907;
        this.f33668 = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f33668.getPort();
        m22621(c25368);
        try {
            this.f33669 = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f33669, port);
            if (this.f33669.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f33666 = multicastSocket;
                multicastSocket.joinGroup(this.f33669);
                this.f33670 = this.f33666;
            } else {
                this.f33670 = new DatagramSocket(inetSocketAddress);
            }
            this.f33670.setSoTimeout(this.f33667);
            this.f33665 = true;
            m22619(c25368);
            return -1L;
        } catch (IOException e) {
            throw new C21793(2001, e);
        } catch (SecurityException e2) {
            throw new C21793(2006, e2);
        }
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws C21793 {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f33664;
        DatagramPacket datagramPacket = this.f33663;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.f33670;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f33664 = length;
                m22622(length);
            } catch (SocketTimeoutException e) {
                throw new C21793(2002, e);
            } catch (IOException e2) {
                throw new C21793(2001, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.f33664;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f33662, length2 - i4, bArr, i, iMin);
        this.f33664 -= iMin;
        return iMin;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        return this.f33668;
    }

    @Override // l.InterfaceC13433
    public final void close() {
        this.f33668 = null;
        MulticastSocket multicastSocket = this.f33666;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f33669;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f33666 = null;
        }
        DatagramSocket datagramSocket = this.f33670;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f33670 = null;
        }
        this.f33669 = null;
        this.f33664 = 0;
        if (this.f33665) {
            this.f33665 = false;
            m22620();
        }
    }
}
