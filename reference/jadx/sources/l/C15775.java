package l;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.Vector;

/* JADX INFO: renamed from: l.ܺۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7ZM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15775 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static Vector f51087 = new Vector();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static InetAddress f51088;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public RunnableC20713 f51089;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f51090;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InetAddress f51091;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C3073 f51092;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f51093;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f51094;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ServerSocket f51095;

    static {
        f51088 = null;
        try {
            f51088 = InetAddress.getByName("0.0.0.0");
        } catch (UnknownHostException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15775 m37517(C3073 c3073, String str, int i, String str2, int i2) {
        Vector vector;
        C15775 c15775;
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
            synchronized (f51087) {
                int i3 = 0;
                while (true) {
                    vector = f51087;
                    if (i3 >= vector.size()) {
                        c15775 = null;
                        break;
                    }
                    c15775 = (C15775) vector.elementAt(i3);
                    if (c15775.f51092 == c3073 && c15775.f51093 == i && (((inetAddress = f51088) != null && c15775.f51091.equals(inetAddress)) || c15775.f51091.equals(byName))) {
                        break;
                    }
                    i3++;
                }
            }
            if (c15775 != null) {
                throw new C5813("PortForwardingL: local port " + str + ":" + i + " is already registered.");
            }
            C15775 c15776 = new C15775();
            c15776.f51092 = c3073;
            c15776.f51093 = i;
            c15776.f51094 = str2;
            c15776.f51090 = i2;
            try {
                c15776.f51091 = InetAddress.getByName(str);
                ServerSocket serverSocket = new ServerSocket(i, 0, c15776.f51091);
                c15776.f51095 = serverSocket;
                if (i == 0 && (localPort = serverSocket.getLocalPort()) != -1) {
                    c15776.f51093 = localPort;
                }
                vector.addElement(c15776);
                return c15776;
            } catch (Exception e) {
                throw new C5813("PortForwardingL: local port " + str + ":" + i + " cannot be bound.", e);
            }
        } catch (UnknownHostException e2) {
            throw new C5813(C16523.m38890("PortForwardingL: invalid address ", str, " specified."), e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37518(C3073 c3073) {
        Vector vector = f51087;
        synchronized (vector) {
            C15775[] c15775Arr = new C15775[vector.size()];
            int i = 0;
            int i2 = 0;
            while (true) {
                Vector vector2 = f51087;
                if (i >= vector2.size()) {
                    break;
                }
                C15775 c15775 = (C15775) vector2.elementAt(i);
                if (c15775.f51092 == c3073) {
                    c15775.f51089 = null;
                    try {
                        ServerSocket serverSocket = c15775.f51095;
                        if (serverSocket != null) {
                            serverSocket.close();
                        }
                        c15775.f51095 = null;
                    } catch (Exception unused) {
                    }
                    int i3 = i2 + 1;
                    c15775Arr[i2] = c15775;
                    i2 = i3;
                }
                i++;
            }
            for (int i4 = 0; i4 < i2; i4++) {
                f51087.removeElement(c15775Arr[i4]);
            }
        }
    }
}
