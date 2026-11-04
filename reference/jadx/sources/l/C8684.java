package l;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.۠ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0A0C */
/* JADX INFO: loaded from: classes3.dex */
public final class C8684 extends Thread {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InetAddress f28340;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC23032 f28341;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public UnknownHostException f28342;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC16318[] f28343;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7193 f28344;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f28345;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f28346;

    public C8684(C7193 c7193, String str, int i, InetAddress inetAddress, C0657 c0657) {
        super(C25272.m56409("JCIFS-QueryThread: ", str));
        this.f28343 = null;
        this.f28344 = c7193;
        this.f28346 = str;
        this.f28345 = i;
        this.f28340 = inetAddress;
        this.f28341 = c0657;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            try {
                this.f28343 = ((RunnableC13904) this.f28341.mo2872()).m33885(this.f28346, this.f28345, this.f28340);
                synchronized (this.f28344) {
                    C7193 c7193 = this.f28344;
                    c7193.f23747--;
                    c7193.notify();
                }
            } catch (UnknownHostException e) {
                this.f28342 = e;
                synchronized (this.f28344) {
                    C7193 c7194 = this.f28344;
                    c7194.f23747--;
                    c7194.notify();
                }
            } catch (Exception e2) {
                this.f28342 = new UnknownHostException(e2.getMessage());
                synchronized (this.f28344) {
                    C7193 c7195 = this.f28344;
                    c7195.f23747--;
                    c7195.notify();
                }
            }
        } catch (Throwable th) {
            synchronized (this.f28344) {
                C7193 c7196 = this.f28344;
                c7196.f23747--;
                c7196.notify();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16318[] m23375() {
        return this.f28343;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final UnknownHostException m23376() {
        return this.f28342;
    }
}
