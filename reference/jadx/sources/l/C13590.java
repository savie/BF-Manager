package l;

import java.io.IOException;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: l.۬ۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes4.dex */
public final class C13590 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SoftReference f43164;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6680 f43165;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9861 f43166;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile int f43167;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f43168;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m33313() {
        byte[] bArrM11965;
        int i = this.f43167 - 1;
        this.f43167 = i;
        if (i == 0 && (bArrM11965 = this.f43165.m55813().m11965()) != null) {
            this.f43165.m55813().m11966((byte[]) null);
            if (this.f43164.get() == null) {
                this.f43164 = new SoftReference(bArrM11965);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m33312() {
        this.f43167++;
        try {
            if (this.f43165.m55813().m11965() == null) {
                byte[] bArrM49865 = (byte[]) this.f43164.get();
                if (bArrM49865 == null) {
                    bArrM49865 = this.f43168.m49865();
                }
                if (bArrM49865 == null) {
                    throw new IOException("Failed to load dex buffer: " + this.f43168.mo4294());
                }
                this.f43165.m55813().m11966(bArrM49865);
            }
        } catch (Throwable th) {
            this.f43167--;
            throw th;
        }
    }

    public C13590(C6680 c6680, AbstractC22044 abstractC22044, int i, int i2, long j, int i3) {
        this.f43165 = c6680;
        this.f43168 = abstractC22044;
        this.f43166 = new C9861(i, i2, j, i3, new C6879(this));
        c6680.m55788(this);
        byte[] bArrM11965 = c6680.m55813().m11965();
        c6680.m55813().m11966((byte[]) null);
        this.f43164 = new SoftReference(bArrM11965);
    }
}
