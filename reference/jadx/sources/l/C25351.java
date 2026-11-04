package l;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩻᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4RX */
/* JADX INFO: loaded from: classes.dex */
public final class C25351 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21445 f81858;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f81859;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f81860 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f81861;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C16399 f81862;

    public C25351(AbstractC21445 abstractC21445, int i) {
        this.f81858 = abstractC21445;
        this.f81861 = i;
        boolean z = false;
        if ((abstractC21445 instanceof C23113) && ((C23113) abstractC21445).f74966) {
            C16399 c16399 = new C16399(new C5783());
            c16399.f53216 = new C16399[0];
            c16399.f53212 = false;
            c16399.f53213 = false;
            this.f81862 = c16399;
            z = true;
        }
        this.f81859 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16399 m56684(int i) {
        if (!this.f81859) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0 || i >= this.f81862.f53216.length) {
            return null;
        }
        return this.f81862.f53216[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56685(int i, C16399 c16399) {
        if (!this.f81859) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0) {
            return;
        }
        synchronized (this.f81862) {
            if (i >= this.f81862.f53216.length) {
                this.f81862.f53216 = (C16399[]) Arrays.copyOf(this.f81862.f53216, i + 1);
            }
            this.f81862.f53216[i] = c16399;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m56686() {
        return this.f81859;
    }

    public final String toString() {
        return this.f81862 == null ? "" : new C17145(this, C22191.f71497).toString();
    }
}
