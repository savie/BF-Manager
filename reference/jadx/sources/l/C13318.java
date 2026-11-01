package l;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.۬᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 0A0C */
/* JADX INFO: loaded from: classes3.dex */
public final class C13318 extends Thread {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C4144 f44201;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public UnknownHostException f44202;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC19067 f44203;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC16950[] f44204;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InetAddress f44205;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f44206;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f44207;

    public C13318(C4144 c4144, String str, int i, InetAddress inetAddress, C13899 c13899) {
        super(C0252.m1693("JCIFS-QueryThread: ", str));
        this.f44204 = null;
        this.f44201 = c4144;
        this.f44207 = str;
        this.f44206 = i;
        this.f44205 = inetAddress;
        this.f44203 = c13899;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            try {
                this.f44204 = ((RunnableC6967) this.f44203.mo29450()).m18731(this.f44207, this.f44206, this.f44205);
                synchronized (this.f44201) {
                    C4144 c4144 = this.f44201;
                    c4144.f15161--;
                    c4144.notify();
                }
            } catch (UnknownHostException e) {
                this.f44202 = e;
                synchronized (this.f44201) {
                    C4144 c4145 = this.f44201;
                    c4145.f15161--;
                    c4145.notify();
                }
            } catch (Exception e2) {
                this.f44202 = new UnknownHostException(e2.getMessage());
                synchronized (this.f44201) {
                    C4144 c4146 = this.f44201;
                    c4146.f15161--;
                    c4146.notify();
                }
            }
        } catch (Throwable th) {
            synchronized (this.f44201) {
                C4144 c4147 = this.f44201;
                c4147.f15161--;
                c4147.notify();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16950[] m32832() {
        return this.f44204;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final UnknownHostException m32833() {
        return this.f44202;
    }
}
