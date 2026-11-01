package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛۚܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8NF */
/* JADX INFO: loaded from: classes3.dex */
public final class C5853 implements InterfaceC15732 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f19824;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f19825;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f19828 = true;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f19823 = 65536;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f19826 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7264[] f19827 = new C7264[100];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16059() {
        if (this.f19828) {
            m16061(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C7264 m16060() {
        C7264 c7264;
        int i = this.f19824 + 1;
        this.f19824 = i;
        int i2 = this.f19826;
        if (i2 > 0) {
            C7264[] c7264Arr = this.f19827;
            int i3 = i2 - 1;
            this.f19826 = i3;
            c7264 = c7264Arr[i3];
            c7264.getClass();
            this.f19827[this.f19826] = null;
        } else {
            C7264 c7265 = new C7264(new byte[this.f19823], 0);
            C7264[] c7264Arr2 = this.f19827;
            if (i > c7264Arr2.length) {
                this.f19827 = (C7264[]) Arrays.copyOf(c7264Arr2, c7264Arr2.length * 2);
            }
            c7264 = c7265;
        }
        return c7264;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16061(int i) {
        boolean z = i < this.f19825;
        this.f19825 = i;
        if (z) {
            m16064();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16064() {
        int iMax = Math.max(0, C17983.m41812(this.f19825, this.f19823) - this.f19824);
        int i = this.f19826;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f19827, iMax, i, (Object) null);
        this.f19826 = iMax;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized int m16065() {
        return this.f19824 * this.f19823;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16062(C7264 c7264) {
        C7264[] c7264Arr = this.f19827;
        int i = this.f19826;
        this.f19826 = i + 1;
        c7264Arr[i] = c7264;
        this.f19824--;
        notifyAll();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16063(InterfaceC20670 interfaceC20670) {
        while (interfaceC20670 != null) {
            C7264[] c7264Arr = this.f19827;
            int i = this.f19826;
            this.f19826 = i + 1;
            c7264Arr[i] = interfaceC20670.mo32313();
            this.f19824--;
            interfaceC20670 = interfaceC20670.next();
        }
        notifyAll();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m16066() {
        return this.f19823;
    }
}
