package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.SocketFactory;

/* JADX INFO: renamed from: l.ۙۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9E6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4713 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19166 f16619;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public SocketFactory f16620;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Socket f16622;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f16623;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C13835 f16624;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public BufferedOutputStream f16626;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC25186 f16621 = C16980.m40037(C4713.class);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f16625 = new ReentrantReadWriteLock();

    public C4713(SocketFactory socketFactory, int i, C19166 c19166) {
        new C0521();
        this.f16623 = i;
        this.f16620 = socketFactory;
        this.f16619 = c19166;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14605(AbstractC4625 abstractC4625) {
        InterfaceC25186 interfaceC25186 = this.f16621;
        interfaceC25186.mo13708(abstractC4625, "Acquiring write lock to send packet << {} >>");
        if (!m14606()) {
            throw new C9469(String.format("Cannot write %s as transport is disconnected", abstractC4625));
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.f16625;
        reentrantReadWriteLock.writeLock().lock();
        try {
            try {
                if (!m14606()) {
                    throw new C9469(String.format("Cannot write %s as transport got disconnected", abstractC4625));
                }
                interfaceC25186.mo13716(abstractC4625, "Writing packet {}");
                this.f16619.m44421().getClass();
                C7453 c7453 = new C7453(abstractC4625.mo3628());
                abstractC4625.mo3627(c7453);
                int iM56013 = c7453.m56013();
                this.f16626.write(0);
                this.f16626.write((byte) (iM56013 >> 16));
                this.f16626.write((byte) (iM56013 >> 8));
                this.f16626.write((byte) (iM56013 & 255));
                this.f16626.write(c7453.m56011(), c7453.m56029(), c7453.m56013());
                this.f16626.flush();
                interfaceC25186.mo13708(abstractC4625, "Packet {} sent, lock released.");
                reentrantReadWriteLock.writeLock().unlock();
            } catch (IOException e) {
                throw new C9469(e);
            }
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14604(InetSocketAddress inetSocketAddress) {
        String hostString = inetSocketAddress.getHostString();
        Socket socketCreateSocket = this.f16620.createSocket(hostString, inetSocketAddress.getPort());
        this.f16622 = socketCreateSocket;
        socketCreateSocket.setSoTimeout(this.f16623);
        this.f16626 = new BufferedOutputStream(this.f16622.getOutputStream(), OpenAuthTask.OK);
        InputStream inputStream = this.f16622.getInputStream();
        C19166 c19166 = this.f16619;
        C13835 c13835 = new C13835(hostString, inputStream, c19166.m44420(), c19166.m44422());
        this.f16624 = c13835;
        c13835.m19524();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14603() {
        if (m14606()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.f16625;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (m14606()) {
                    this.f16624.m19523();
                    if (this.f16622.getInputStream() != null) {
                        this.f16622.getInputStream().close();
                    }
                    BufferedOutputStream bufferedOutputStream = this.f16626;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                        this.f16626 = null;
                    }
                    Socket socket = this.f16622;
                    if (socket != null) {
                        socket.close();
                        this.f16622 = null;
                    }
                }
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m14606() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f16625;
        reentrantReadWriteLock.readLock().lock();
        try {
            Socket socket = this.f16622;
            return (socket == null || !socket.isConnected() || this.f16622.isClosed()) ? false : true;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }
}
