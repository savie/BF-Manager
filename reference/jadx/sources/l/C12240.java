package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;

/* JADX INFO: renamed from: l.۫ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 8A16 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12240 extends Thread {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f40972 = C13488.m32998(C12240.class.getName());

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22823 f40973;

    public C12240(C22823 c22823) {
        super("SocketListener(" + c22823.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        setDaemon(true);
        this.f40973 = c22823;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        InetAddress address;
        InterfaceC4314 interfaceC4314 = f40972;
        C22823 c22823 = this.f40973;
        try {
            DatagramPacket datagramPacket = new DatagramPacket(new byte[8972], 8972);
            while (!c22823.m50560() && !c22823.m50533()) {
                datagramPacket.setLength(8972);
                c22823.m50551().receive(datagramPacket);
                if (c22823.m50560() || c22823.m50533() || c22823.m50532() || c22823.isClosed()) {
                    break;
                }
                try {
                    InetAddress inetAddress = c22823.m50562().f11192;
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
                        C13568 c13568 = new C13568(datagramPacket);
                        if (c13568.m6985()) {
                            if (interfaceC4314.mo12133()) {
                                interfaceC4314.mo12137("{}.run() JmDNS in:{}", getName(), c13568.m33164());
                            }
                            if (c13568.m6979()) {
                                int port = datagramPacket.getPort();
                                int i = C17178.f54759;
                                if (port != i) {
                                    c22823.m50557(c13568, datagramPacket.getAddress(), datagramPacket.getPort());
                                }
                                c22823.m50557(c13568, c22823.m50561(), i);
                            } else {
                                c22823.m50544(c13568);
                            }
                        } else if (interfaceC4314.mo12125()) {
                            interfaceC4314.mo12121("{}.run() JmDNS in message with error code: {}", getName(), c13568.m33164());
                        }
                    }
                } catch (IOException e) {
                    interfaceC4314.mo12122(getName() + ".run() exception ", (Throwable) e);
                }
            }
        } catch (IOException e2) {
            if (!c22823.m50560() && !c22823.m50533() && !c22823.m50532() && !c22823.isClosed()) {
                interfaceC4314.mo12122(getName() + ".run() exception ", (Throwable) e2);
                c22823.m50567();
            }
        }
        interfaceC4314.mo12129(getName(), "{}.run() exiting.");
    }
}
