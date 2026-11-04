package l;

import android.net.LocalServerSocket;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.֨ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: F99O */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1336 implements InterfaceC23405 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f4778;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo4909(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo4910(String str, boolean z);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract boolean mo4911();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4906(LocalServerSocket localServerSocket) {
        if (localServerSocket == null) {
            return;
        }
        try {
            localServerSocket.close();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15945 m4908(final boolean z) throws IOException {
        Thread thread;
        boolean z2;
        final ServerSocket serverSocket;
        final C10284 c10284 = new C10284();
        LocalServerSocket localServerSocket = null;
        if (z || (!f4778 && mo4911())) {
            final LocalServerSocket localServerSocket2 = new LocalServerSocket(C18929.m43957());
            thread = new Thread(new Runnable() { // from class: l.֡ܿᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1336.m4907(localServerSocket2, c10284, z);
                }
            });
            thread.start();
            try {
                mo4910(localServerSocket2.getLocalSocketAddress().getName(), z);
                z2 = true;
                serverSocket = null;
                localServerSocket = localServerSocket2;
            } catch (IOException e) {
                c10284.m26514();
                m4906(localServerSocket2);
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
            thread = new Thread(new Runnable() { // from class: l.۟ܿᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z3;
                    ServerSocket serverSocket2 = serverSocket;
                    C10284 c10285 = c10284;
                    try {
                        try {
                            try {
                                try {
                                    C18489 c18489 = new C18489(serverSocket2.accept());
                                    synchronized (c10285) {
                                        if (c10285.f32850) {
                                            z3 = false;
                                        } else {
                                            c10285.f32846 = c18489;
                                            z3 = true;
                                        }
                                    }
                                    if (!z3) {
                                        C20244.m46520(c18489);
                                        C20244.m46520(serverSocket2);
                                        return;
                                    }
                                    int i = C4013.f13710;
                                    try {
                                        c10285.m26518(new C15945(c18489, false));
                                        C20244.m46520(serverSocket2);
                                    } catch (IOException e2) {
                                        C20244.m46520(c18489);
                                        throw e2;
                                    } catch (Error e3) {
                                        e = e3;
                                        C20244.m46520(c18489);
                                        throw e;
                                    } catch (RuntimeException e4) {
                                        e = e4;
                                        C20244.m46520(c18489);
                                        throw e;
                                    }
                                } catch (RuntimeException e5) {
                                    c10285.m26517(e5);
                                    C20244.m46520(serverSocket2);
                                }
                            } catch (IOException e6) {
                                c10285.m26515(e6);
                                C20244.m46520(serverSocket2);
                            }
                        } catch (Error e7) {
                            c10285.m26516(e7);
                            C20244.m46520(serverSocket2);
                        }
                    } catch (Throwable th) {
                        C20244.m46520(serverSocket2);
                        throw th;
                    }
                }
            });
            thread.start();
            if (C22415.m50555()) {
                try {
                    C5261.f18540.submit(new Callable() { // from class: l.ᩳܿᩴ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            AbstractC1336 abstractC1336 = this.f62224;
                            abstractC1336.getClass();
                            abstractC1336.mo4909(serverSocket.getLocalPort());
                            return null;
                        }
                    }).get();
                } catch (Throwable th) {
                    c10284.m26514();
                    C20244.m46520(serverSocket);
                    thread.interrupt();
                    try {
                        thread.join(100L);
                    } catch (InterruptedException unused2) {
                    }
                    C4013.m12976(th);
                    throw null;
                }
            } else {
                try {
                    mo4909(serverSocket.getLocalPort());
                } catch (IOException e2) {
                    c10284.m26514();
                    C20244.m46520(serverSocket);
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
        if (c10284.f32847 != null) {
            return c10284.f32847;
        }
        if (c10284.f32851 != null) {
            IOException iOException = c10284.f32851;
            C22327.m50389(iOException);
            throw iOException;
        }
        if (c10284.f32849 != null) {
            RuntimeException runtimeException = c10284.f32849;
            C22327.m50389(runtimeException);
            throw runtimeException;
        }
        if (c10284.f32848 != null) {
            Error error = c10284.f32848;
            C22327.m50389(error);
            throw error;
        }
        c10284.m26514();
        if (z || !mo29539() || !z2) {
            m4906(localServerSocket);
            C20244.m46520(serverSocket);
            thread.interrupt();
            try {
                thread.join(100L);
            } catch (InterruptedException unused5) {
            }
            throw new IOException("Accept timeout");
        }
        if (!f4778) {
            f4778 = true;
        }
        m4906(localServerSocket);
        thread.interrupt();
        try {
            thread.join(100L);
        } catch (InterruptedException unused6) {
        }
        C20653.m47266("switch the root connection to ServerSocket");
        return m4908(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4907(LocalServerSocket localServerSocket, C10284 c10284, boolean z) {
        boolean z2;
        try {
            try {
                C18929 c18929 = new C18929(localServerSocket.accept());
                synchronized (c10284) {
                    if (c10284.f32850) {
                        z2 = false;
                    } else {
                        c10284.f32846 = c18929;
                        z2 = true;
                    }
                }
                if (!z2) {
                    C20244.m46520(c18929);
                    m4906(localServerSocket);
                    return;
                }
                int i = C4013.f13710;
                try {
                    c10284.m26518(new C15945(c18929, z));
                    m4906(localServerSocket);
                } catch (IOException e) {
                    C20244.m46520(c18929);
                    throw e;
                } catch (Error e2) {
                    e = e2;
                    C20244.m46520(c18929);
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    C20244.m46520(c18929);
                    throw e;
                }
            } catch (IOException e4) {
                c10284.m26515(e4);
                m4906(localServerSocket);
            } catch (Error e5) {
                c10284.m26516(e5);
                m4906(localServerSocket);
            } catch (RuntimeException e6) {
                c10284.m26517(e6);
                m4906(localServerSocket);
            }
        } catch (Throwable th) {
            m4906(localServerSocket);
            throw th;
        }
    }
}
