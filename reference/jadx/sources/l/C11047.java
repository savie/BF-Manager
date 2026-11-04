package l;

import android.app.Service;
import android.net.Uri;
import com.alipay.sdk.m.n.a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.ServerSocket;

/* JADX INFO: renamed from: l.ۤᩳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: L9TE */
/* JADX INFO: loaded from: classes3.dex */
public final class C11047 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13702 f34866;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final WeakReference f34867;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ServerSocket f34868;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m27935() {
        ServerSocket serverSocket = this.f34868;
        if (serverSocket != null) {
            this.f34868 = null;
            C5261.f18538.execute(new RunnableC0284(1, serverSocket));
        }
    }

    public C11047(ServiceC2099 serviceC2099) {
        this.f34867 = new WeakReference(serviceC2099);
        setDaemon(true);
        start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Uri m27933(C13702 c13702) {
        String str = c13702.f43470;
        C13702 c13703 = this.f34866;
        if (c13703 == null || !c13703.f43470.equals(str)) {
            final C13702 c13704 = this.f34866;
            if (c13704 != null) {
                C5261.f18538.execute(new Runnable() { // from class: l.᩷ᩳ۫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20244.m46520(c13704);
                    }
                });
            }
            this.f34866 = c13702;
        }
        return new Uri.Builder().scheme(a.s).encodedAuthority("127.0.0.1:" + this.f34868.getLocalPort()).path(str + "/" + c13702.f43465).build();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Service service;
        WeakReference weakReference = this.f34867;
        try {
            this.f34868 = new ServerSocket(0);
            while (!isInterrupted()) {
                new RunnableC5828(this.f34868.accept(), this.f34866);
            }
            C20244.m46520(this.f34866);
            try {
                ServerSocket serverSocket = this.f34868;
                if (serverSocket != null) {
                    serverSocket.close();
                    this.f34868 = null;
                }
            } catch (IOException unused) {
            }
            service = (Service) weakReference.get();
            if (service == null) {
                return;
            }
        } catch (Exception unused2) {
            C20244.m46520(this.f34866);
            try {
                ServerSocket serverSocket2 = this.f34868;
                if (serverSocket2 != null) {
                    serverSocket2.close();
                    this.f34868 = null;
                }
            } catch (IOException unused3) {
            }
            service = (Service) weakReference.get();
            if (service == null) {
                return;
            }
        } catch (Throwable th) {
            C20244.m46520(this.f34866);
            try {
                ServerSocket serverSocket3 = this.f34868;
                if (serverSocket3 != null) {
                    serverSocket3.close();
                    this.f34868 = null;
                }
            } catch (IOException unused4) {
            }
            Service service2 = (Service) weakReference.get();
            if (service2 != null) {
                service2.stopSelf();
                throw th;
            }
            throw th;
        }
        service.stopSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27934() {
        return this.f34868 != null;
    }
}
