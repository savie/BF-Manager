package l;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۜۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9HB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC7124 implements Runnable {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Thread f23481;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC10215 f23482;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BufferedInputStream f23484;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC25186 f23483 = C16980.m40037(getClass());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AtomicBoolean f23480 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC13988 mo19522();

    public AbstractRunnableC7124(String str, InputStream inputStream, InterfaceC10215 interfaceC10215) {
        if (inputStream instanceof BufferedInputStream) {
            this.f23484 = (BufferedInputStream) inputStream;
        } else {
            this.f23484 = new BufferedInputStream(inputStream);
        }
        this.f23482 = interfaceC10215;
        StringBuilder sbM51387 = C22783.m51387("Packet Reader for ", str, ", Original Thread name: ");
        sbM51387.append(Thread.currentThread().getName());
        Thread thread = new Thread(this, sbM51387.toString());
        this.f23481 = thread;
        thread.setDaemon(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC25186 interfaceC25186;
        AtomicBoolean atomicBoolean;
        InterfaceC10215 interfaceC10215 = this.f23482;
        while (true) {
            boolean zIsInterrupted = Thread.currentThread().isInterrupted();
            interfaceC25186 = this.f23483;
            atomicBoolean = this.f23480;
            if (zIsInterrupted || atomicBoolean.get()) {
                break;
            }
            try {
                InterfaceC13988 interfaceC13988Mo19522 = mo19522();
                interfaceC25186.mo13716(interfaceC13988Mo19522, "Received packet {}");
                ((C21033) interfaceC10215).m48063(interfaceC13988Mo19522);
            } catch (C9469 e) {
                if (!atomicBoolean.get()) {
                    interfaceC25186.mo13700("PacketReader error, got exception.", (Exception) e);
                    ((C21033) interfaceC10215).m48062(e);
                    return;
                }
            }
        }
        if (atomicBoolean.get()) {
            interfaceC25186.mo13720(this.f23481, "{} stopped.");
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m19523() {
        this.f23483.mo13721("Stopping PacketReader...");
        this.f23480.set(true);
        this.f23481.interrupt();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19524() {
        Thread thread = this.f23481;
        this.f23483.mo13716(thread.getName(), "Starting PacketReader on thread: {}");
        thread.start();
    }
}
