package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.SocketFactory;

/* JADX INFO: renamed from: l.ۤۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9E6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10006 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Socket f34179;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public BufferedOutputStream f34180;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16104 f34181;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C8595 f34182;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public SocketFactory f34184;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f34186;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4314 f34183 = C13488.m32997(C10006.class);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f34185 = new ReentrantReadWriteLock();

    public C10006(SocketFactory socketFactory, int i, C16104 c16104) {
        new C3677();
        this.f34186 = i;
        this.f34184 = socketFactory;
        this.f34181 = c16104;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25283(AbstractC10068 abstractC10068) {
        InterfaceC4314 interfaceC4314 = this.f34183;
        interfaceC4314.mo12129(abstractC10068, "Acquiring write lock to send packet << {} >>");
        if (!m25284()) {
            throw new C21317(String.format("Cannot write %s as transport is disconnected", abstractC10068));
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.f34185;
        reentrantReadWriteLock.writeLock().lock();
        try {
            try {
                if (!m25284()) {
                    throw new C21317(String.format("Cannot write %s as transport got disconnected", abstractC10068));
                }
                interfaceC4314.mo12126(abstractC10068, "Writing packet {}");
                this.f34181.m38139().getClass();
                C19240 c19240 = new C19240(abstractC10068.mo25477());
                abstractC10068.mo29404(c19240);
                int iM27391 = c19240.m27391();
                this.f34180.write(0);
                this.f34180.write((byte) (iM27391 >> 16));
                this.f34180.write((byte) (iM27391 >> 8));
                this.f34180.write((byte) (iM27391 & 255));
                this.f34180.write(c19240.m27387(), c19240.m27402(), c19240.m27391());
                this.f34180.flush();
                interfaceC4314.mo12129(abstractC10068, "Packet {} sent, lock released.");
                reentrantReadWriteLock.writeLock().unlock();
            } catch (IOException e) {
                throw new C21317(e);
            }
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25282(InetSocketAddress inetSocketAddress) {
        String hostString = inetSocketAddress.getHostString();
        Socket socketCreateSocket = this.f34184.createSocket(hostString, inetSocketAddress.getPort());
        this.f34179 = socketCreateSocket;
        socketCreateSocket.setSoTimeout(this.f34186);
        this.f34180 = new BufferedOutputStream(this.f34179.getOutputStream(), OpenAuthTask.OK);
        InputStream inputStream = this.f34179.getInputStream();
        C16104 c16104 = this.f34181;
        C8595 c8595 = new C8595(hostString, inputStream, c16104.m38138(), c16104.m38140());
        this.f34182 = c8595;
        c8595.m44032();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25281() {
        if (m25284()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.f34185;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (m25284()) {
                    this.f34182.m44031();
                    if (this.f34179.getInputStream() != null) {
                        this.f34179.getInputStream().close();
                    }
                    BufferedOutputStream bufferedOutputStream = this.f34180;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                        this.f34180 = null;
                    }
                    Socket socket = this.f34179;
                    if (socket != null) {
                        socket.close();
                        this.f34179 = null;
                    }
                }
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m25284() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f34185;
        reentrantReadWriteLock.readLock().lock();
        try {
            Socket socket = this.f34179;
            return (socket == null || !socket.isConnected() || this.f34179.isClosed()) ? false : true;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }
}
