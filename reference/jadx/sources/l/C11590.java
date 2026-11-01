package l;

import android.app.Service;
import android.net.Uri;
import com.alipay.sdk.m.n.a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.ServerSocket;

/* JADX INFO: renamed from: l.ۨۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L9TE */
/* JADX INFO: loaded from: classes3.dex */
public final class C11590 extends Thread {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final WeakReference f38954;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C3431 f38955;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ServerSocket f38956;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m28884() {
        ServerSocket serverSocket = this.f38956;
        if (serverSocket != null) {
            this.f38956 = null;
            C4716.f16635.execute(new RunnableC19285(2, serverSocket));
        }
    }

    public C11590(ServiceC6650 serviceC6650) {
        this.f38954 = new WeakReference(serviceC6650);
        setDaemon(true);
        start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Uri m28882(C3431 c3431) {
        String str = c3431.f12649;
        C3431 c3432 = this.f38955;
        if (c3432 == null || !c3432.f12649.equals(str)) {
            final C3431 c3433 = this.f38955;
            if (c3433 != null) {
                C4716.f16635.execute(new Runnable() { // from class: l.ܰۡ֨
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19431.m44468(c3433);
                    }
                });
            }
            this.f38955 = c3431;
        }
        return new Uri.Builder().scheme(a.s).encodedAuthority("127.0.0.1:" + this.f38956.getLocalPort()).path(str + "/" + c3431.f12645).build();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Service service;
        WeakReference weakReference = this.f38954;
        try {
            this.f38956 = new ServerSocket(0);
            while (!isInterrupted()) {
                new RunnableC13001(this.f38956.accept(), this.f38955);
            }
            C19431.m44468(this.f38955);
            try {
                ServerSocket serverSocket = this.f38956;
                if (serverSocket != null) {
                    serverSocket.close();
                    this.f38956 = null;
                }
            } catch (IOException unused) {
            }
            service = (Service) weakReference.get();
            if (service == null) {
                return;
            }
        } catch (Exception unused2) {
            C19431.m44468(this.f38955);
            try {
                ServerSocket serverSocket2 = this.f38956;
                if (serverSocket2 != null) {
                    serverSocket2.close();
                    this.f38956 = null;
                }
            } catch (IOException unused3) {
            }
            service = (Service) weakReference.get();
            if (service == null) {
                return;
            }
        } catch (Throwable th) {
            C19431.m44468(this.f38955);
            try {
                ServerSocket serverSocket3 = this.f38956;
                if (serverSocket3 != null) {
                    serverSocket3.close();
                    this.f38956 = null;
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
    public final boolean m28883() {
        return this.f38956 != null;
    }
}
