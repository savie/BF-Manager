package l;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩻۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H4RX */
/* JADX INFO: loaded from: classes.dex */
public final class C23724 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile C9613 f76772;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12789 f76773;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f76774 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f76775;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f76776;

    public C23724(AbstractC12789 abstractC12789, int i) {
        this.f76773 = abstractC12789;
        this.f76776 = i;
        boolean z = false;
        if ((abstractC12789 instanceof C20196) && ((C20196) abstractC12789).f65545) {
            C9613 c9613 = new C9613(new C17643());
            c9613.f32386 = new C9613[0];
            c9613.f32384 = false;
            c9613.f32380 = false;
            this.f76772 = c9613;
            z = true;
        }
        this.f76775 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9613 m52252(int i) {
        if (!this.f76775) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0 || i >= this.f76772.f32386.length) {
            return null;
        }
        return this.f76772.f32386[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52253(int i, C9613 c9613) {
        if (!this.f76775) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0) {
            return;
        }
        synchronized (this.f76772) {
            if (i >= this.f76772.f32386.length) {
                this.f76772.f32386 = (C9613[]) Arrays.copyOf(this.f76772.f32386, i + 1);
            }
            this.f76772.f32386[i] = c9613;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52254() {
        return this.f76775;
    }

    public final String toString() {
        return this.f76772 == null ? "" : new C14552(this, C21171.f68947).toString();
    }
}
