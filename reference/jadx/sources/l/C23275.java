package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;

/* JADX INFO: renamed from: l.᩹ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8A16 */
/* JADX INFO: loaded from: classes.dex */
public final class C23275 extends Thread {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f75427 = C16980.m40038(C23275.class.getName());

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14168 f75428;

    public C23275(C14168 c14168) {
        super("SocketListener(" + c14168.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        setDaemon(true);
        this.f75428 = c14168;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        InetAddress address;
        InterfaceC25186 interfaceC25186 = f75427;
        C14168 c14168 = this.f75428;
        try {
            DatagramPacket datagramPacket = new DatagramPacket(new byte[8972], 8972);
            while (!c14168.m34457() && !c14168.m34438()) {
                datagramPacket.setLength(8972);
                c14168.m34409().receive(datagramPacket);
                if (c14168.m34457() || c14168.m34438() || c14168.m34458() || c14168.isClosed()) {
                    break;
                }
                try {
                    InetAddress inetAddress = c14168.m34408().f69055;
                    boolean z = false;
                    if (inetAddress != null && (address = datagramPacket.getAddress()) != null) {
                        if ((inetAddress.isLinkLocalAddress() || inetAddress.isMCLinkLocal()) && !address.isLinkLocalAddress()) {
                            z = true;
                        }
                        if (address.isLoopbackAddress() && !inetAddress.isLoopbackAddress()) {
                            z = true;
                        }
                    }
                    if (!z) {
                        C0525 c0525 = new C0525(datagramPacket);
                        if (c0525.m44432()) {
                            if (interfaceC25186.mo13713()) {
                                interfaceC25186.mo13723("{}.run() JmDNS in:{}", getName(), c0525.m2491());
                            }
                            if (c0525.m44428()) {
                                int port = datagramPacket.getPort();
                                int i = C3137.f10166;
                                if (port != i) {
                                    c14168.m34453(c0525, datagramPacket.getAddress(), datagramPacket.getPort());
                                }
                                c14168.m34453(c0525, c14168.m34439(), i);
                            } else {
                                c14168.m34420(c0525);
                            }
                        } else if (interfaceC25186.mo13707()) {
                            interfaceC25186.mo13701("{}.run() JmDNS in message with error code: {}", getName(), c0525.m2491());
                        }
                    }
                } catch (IOException e) {
                    interfaceC25186.mo13702(getName() + ".run() exception ", (Throwable) e);
                }
            }
        } catch (IOException e2) {
            if (!c14168.m34457() && !c14168.m34438() && !c14168.m34458() && !c14168.isClosed()) {
                interfaceC25186.mo13702(getName() + ".run() exception ", (Throwable) e2);
                c14168.m34441();
            }
        }
        interfaceC25186.mo13708(getName(), "{}.run() exiting.");
    }
}
