package l;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.Vector;

/* JADX INFO: renamed from: l.᩷֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7ZM */
/* JADX INFO: loaded from: classes.dex */
public final class C21691 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Vector f69223 = new Vector();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static InetAddress f69224;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InetAddress f69225;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f69226;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public RunnableC4537 f69227;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ServerSocket f69228;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C15723 f69229;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f69230;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f69231;

    static {
        f69224 = null;
        try {
            f69224 = InetAddress.getByName("0.0.0.0");
        } catch (UnknownHostException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21691 m49229(C15723 c15723, String str, int i, String str2, int i2) {
        Vector vector;
        C21691 c21691;
        int localPort;
        InetAddress inetAddress;
        if (str != null) {
            if (str.length() == 0 || str.equals("*")) {
                str = "0.0.0.0";
            } else if (str.equals("localhost")) {
                str = "127.0.0.1";
            }
        }
        try {
            InetAddress byName = InetAddress.getByName(str);
            synchronized (f69223) {
                int i3 = 0;
                while (true) {
                    vector = f69223;
                    if (i3 >= vector.size()) {
                        c21691 = null;
                        break;
                    }
                    c21691 = (C21691) vector.elementAt(i3);
                    if (c21691.f69229 == c15723 && c21691.f69226 == i && (((inetAddress = f69224) != null && c21691.f69225.equals(inetAddress)) || c21691.f69225.equals(byName))) {
                        break;
                    }
                    i3++;
                }
            }
            if (c21691 != null) {
                throw new C2079("PortForwardingL: local port " + str + ":" + i + " is already registered.");
            }
            C21691 c21692 = new C21691();
            c21692.f69229 = c15723;
            c21692.f69226 = i;
            c21692.f69230 = str2;
            c21692.f69231 = i2;
            try {
                c21692.f69225 = InetAddress.getByName(str);
                ServerSocket serverSocket = new ServerSocket(i, 0, c21692.f69225);
                c21692.f69228 = serverSocket;
                if (i == 0 && (localPort = serverSocket.getLocalPort()) != -1) {
                    c21692.f69226 = localPort;
                }
                vector.addElement(c21692);
                return c21692;
            } catch (Exception e) {
                throw new C2079("PortForwardingL: local port " + str + ":" + i + " cannot be bound.", e);
            }
        } catch (UnknownHostException e2) {
            throw new C2079(C14442.m34865("PortForwardingL: invalid address ", str, " specified."), e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49230(C15723 c15723) {
        Vector vector = f69223;
        synchronized (vector) {
            C21691[] c21691Arr = new C21691[vector.size()];
            int i = 0;
            int i2 = 0;
            while (true) {
                Vector vector2 = f69223;
                if (i >= vector2.size()) {
                    break;
                }
                C21691 c21691 = (C21691) vector2.elementAt(i);
                if (c21691.f69229 == c15723) {
                    c21691.f69227 = null;
                    try {
                        ServerSocket serverSocket = c21691.f69228;
                        if (serverSocket != null) {
                            serverSocket.close();
                        }
                        c21691.f69228 = null;
                    } catch (Exception unused) {
                    }
                    int i3 = i2 + 1;
                    c21691Arr[i2] = c21691;
                    i2 = i3;
                }
                i++;
            }
            for (int i4 = 0; i4 < i2; i4++) {
                f69223.removeElement(c21691Arr[i4]);
            }
        }
    }
}
