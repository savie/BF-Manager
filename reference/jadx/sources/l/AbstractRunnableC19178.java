package l;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩵ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9HB */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC19178 implements Runnable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Thread f61944;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC22729 f61945;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BufferedInputStream f61947;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC4314 f61943 = C13488.m32997(getClass());

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AtomicBoolean f61946 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC8805 mo22378();

    public AbstractRunnableC19178(String str, InputStream inputStream, InterfaceC22729 interfaceC22729) {
        if (inputStream instanceof BufferedInputStream) {
            this.f61947 = (BufferedInputStream) inputStream;
        } else {
            this.f61947 = new BufferedInputStream(inputStream);
        }
        this.f61945 = interfaceC22729;
        StringBuilder sbM30914 = C12441.m30914("Packet Reader for ", str, ", Original Thread name: ");
        sbM30914.append(Thread.currentThread().getName());
        Thread thread = new Thread(this, sbM30914.toString());
        this.f61944 = thread;
        thread.setDaemon(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4314 interfaceC4314;
        AtomicBoolean atomicBoolean;
        InterfaceC22729 interfaceC22729 = this.f61945;
        while (true) {
            boolean zIsInterrupted = Thread.currentThread().isInterrupted();
            interfaceC4314 = this.f61943;
            atomicBoolean = this.f61946;
            if (zIsInterrupted || atomicBoolean.get()) {
                break;
            }
            try {
                InterfaceC8805 interfaceC8805Mo22378 = mo22378();
                interfaceC4314.mo12126(interfaceC8805Mo22378, "Received packet {}");
                ((C1163) interfaceC22729).m4286(interfaceC8805Mo22378);
            } catch (C21317 e) {
                if (!atomicBoolean.get()) {
                    interfaceC4314.mo12136("PacketReader error, got exception.", (Exception) e);
                    ((C1163) interfaceC22729).m4287(e);
                    return;
                }
            }
        }
        if (atomicBoolean.get()) {
            interfaceC4314.mo12134(this.f61944, "{} stopped.");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m44031() {
        this.f61943.mo12135("Stopping PacketReader...");
        this.f61946.set(true);
        this.f61944.interrupt();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44032() {
        Thread thread = this.f61944;
        this.f61943.mo12126(thread.getName(), "Starting PacketReader on thread: {}");
        thread.start();
    }
}
