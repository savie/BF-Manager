package l;

import android.net.LocalServerSocket;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.֫ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F99O */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1921 implements InterfaceC19106 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f7271;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo6250();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo6252(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo6253(String str, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6248(LocalServerSocket localServerSocket) {
        if (localServerSocket == null) {
            return;
        }
        try {
            localServerSocket.close();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7817 m6251(final boolean z) {
        Thread thread;
        boolean z2;
        final ServerSocket serverSocket;
        final C14623 c14623 = new C14623();
        LocalServerSocket localServerSocket = null;
        if (z || (!f7271 && mo6250())) {
            final LocalServerSocket localServerSocket2 = new LocalServerSocket(C16989.m39777());
            thread = new Thread(new Runnable() { // from class: l.ۛܺۚ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1921.m6249(localServerSocket2, c14623, z);
                }
            });
            thread.start();
            try {
                mo6253(localServerSocket2.getLocalSocketAddress().getName(), z);
                z2 = true;
                serverSocket = null;
                localServerSocket = localServerSocket2;
            } catch (IOException e) {
                c14623.m35133();
                m6248(localServerSocket2);
                thread.interrupt();
                try {
                    thread.join(100L);
                } catch (InterruptedException unused) {
                }
                throw e;
            }
        } else {
            serverSocket = new ServerSocket(0);
            serverSocket.setSoTimeout(600);
            thread = new Thread(new Runnable() { // from class: l.ۧܺۚ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z3;
                    ServerSocket serverSocket2 = serverSocket;
                    C14623 c14624 = c14623;
                    try {
                        try {
                            try {
                                try {
                                    C17444 c17444 = new C17444(serverSocket2.accept());
                                    synchronized (c14624) {
                                        if (c14624.f47853) {
                                            z3 = false;
                                        } else {
                                            c14624.f47850 = c17444;
                                            z3 = true;
                                        }
                                    }
                                    if (!z3) {
                                        C19431.m44468(c17444);
                                        C19431.m44468(serverSocket2);
                                        return;
                                    }
                                    int i = C19812.f63596;
                                    try {
                                        c14624.m35137(new C7817(c17444, false));
                                        C19431.m44468(serverSocket2);
                                    } catch (IOException e2) {
                                        C19431.m44468(c17444);
                                        throw e2;
                                    } catch (Error e3) {
                                        e = e3;
                                        C19431.m44468(c17444);
                                        throw e;
                                    } catch (RuntimeException e4) {
                                        e = e4;
                                        C19431.m44468(c17444);
                                        throw e;
                                    }
                                } catch (RuntimeException e5) {
                                    c14624.m35136(e5);
                                    C19431.m44468(serverSocket2);
                                }
                            } catch (IOException e6) {
                                c14624.m35134(e6);
                                C19431.m44468(serverSocket2);
                            }
                        } catch (Error e7) {
                            c14624.m35135(e7);
                            C19431.m44468(serverSocket2);
                        }
                    } catch (Throwable th) {
                        C19431.m44468(serverSocket2);
                        throw th;
                    }
                }
            });
            thread.start();
            if (C13890.m33726()) {
                try {
                    C4716.f16636.submit(new Callable() { // from class: l.᩻ܺۚ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            AbstractC1921 abstractC1921 = this.f76925;
                            abstractC1921.getClass();
                            abstractC1921.mo6252(serverSocket.getLocalPort());
                            return null;
                        }
                    }).get();
                } catch (Throwable th) {
                    c14623.m35133();
                    C19431.m44468(serverSocket);
                    thread.interrupt();
                    try {
                        thread.join(100L);
                    } catch (InterruptedException unused2) {
                    }
                    C19812.m45046(th);
                    throw null;
                }
            } else {
                try {
                    mo6252(serverSocket.getLocalPort());
                } catch (IOException e2) {
                    c14623.m35133();
                    C19431.m44468(serverSocket);
                    thread.interrupt();
                    try {
                        thread.join(100L);
                    } catch (InterruptedException unused3) {
                    }
                    throw e2;
                }
            }
            z2 = false;
        }
        try {
            thread.join(600L);
        } catch (InterruptedException unused4) {
        }
        if (c14623.f47852 != null) {
            return c14623.f47852;
        }
        if (c14623.f47849 != null) {
            throw c14623.f47849;
        }
        if (c14623.f47851 != null) {
            throw c14623.f47851;
        }
        if (c14623.f47854 != null) {
            throw c14623.f47854;
        }
        c14623.m35133();
        if (z || !mo43871() || !z2) {
            m6248(localServerSocket);
            C19431.m44468(serverSocket);
            thread.interrupt();
            try {
                thread.join(100L);
            } catch (InterruptedException unused5) {
            }
            throw new IOException("Accept timeout");
        }
        if (!f7271) {
            f7271 = true;
        }
        m6248(localServerSocket);
        thread.interrupt();
        try {
            thread.join(100L);
        } catch (InterruptedException unused6) {
        }
        C0577.m2741("switch the root connection to ServerSocket");
        return m6251(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6249(LocalServerSocket localServerSocket, C14623 c14623, boolean z) {
        boolean z2;
        try {
            try {
                C16989 c16989 = new C16989(localServerSocket.accept());
                synchronized (c14623) {
                    if (c14623.f47853) {
                        z2 = false;
                    } else {
                        c14623.f47850 = c16989;
                        z2 = true;
                    }
                }
                if (!z2) {
                    C19431.m44468(c16989);
                    m6248(localServerSocket);
                    return;
                }
                int i = C19812.f63596;
                try {
                    c14623.m35137(new C7817(c16989, z));
                    m6248(localServerSocket);
                } catch (IOException e) {
                    C19431.m44468(c16989);
                    throw e;
                } catch (Error e2) {
                    e = e2;
                    C19431.m44468(c16989);
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    C19431.m44468(c16989);
                    throw e;
                }
            } catch (IOException e4) {
                c14623.m35134(e4);
                m6248(localServerSocket);
            } catch (Error e5) {
                c14623.m35135(e5);
                m6248(localServerSocket);
            } catch (RuntimeException e6) {
                c14623.m35136(e6);
                m6248(localServerSocket);
            }
        } catch (Throwable th) {
            m6248(localServerSocket);
            throw th;
        }
    }
}
