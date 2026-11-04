package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8NF */
/* JADX INFO: loaded from: classes5.dex */
public final class C17789 implements InterfaceC13314 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f58380;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f58383;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f58382 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f58385 = 65536;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f58381 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C20027[] f58384 = new C20027[100];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C20027 m41629() {
        C20027 c20027;
        int i = this.f58380 + 1;
        this.f58380 = i;
        int i2 = this.f58381;
        if (i2 > 0) {
            C20027[] c20027Arr = this.f58384;
            int i3 = i2 - 1;
            this.f58381 = i3;
            c20027 = c20027Arr[i3];
            c20027.getClass();
            this.f58384[this.f58381] = null;
        } else {
            C20027 c20028 = new C20027(new byte[this.f58385], 0);
            C20027[] c20027Arr2 = this.f58384;
            if (i > c20027Arr2.length) {
                this.f58384 = (C20027[]) Arrays.copyOf(c20027Arr2, c20027Arr2.length * 2);
            }
            c20027 = c20028;
        }
        return c20027;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41630(int i) {
        boolean z = i < this.f58383;
        this.f58383 = i;
        if (z) {
            m41634();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized int m41633() {
        return this.f58380 * this.f58385;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41634() {
        int iMax = Math.max(0, C7116.m19459(this.f58383, this.f58385) - this.f58380);
        int i = this.f58381;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f58384, iMax, i, (Object) null);
        this.f58381 = iMax;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized void m41636() {
        if (this.f58382) {
            m41630(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41632(C20027 c20027) {
        C20027[] c20027Arr = this.f58384;
        int i = this.f58381;
        this.f58381 = i + 1;
        c20027Arr[i] = c20027;
        this.f58380--;
        notifyAll();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41631(InterfaceC15551 interfaceC15551) {
        while (interfaceC15551 != null) {
            C20027[] c20027Arr = this.f58384;
            int i = this.f58381;
            this.f58381 = i + 1;
            c20027Arr[i] = interfaceC15551.mo26711();
            this.f58380--;
            interfaceC15551 = interfaceC15551.next();
        }
        notifyAll();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m41635() {
        return this.f58385;
    }
}
