package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7428 */
/* JADX INFO: loaded from: classes2.dex */
public class C3168 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f10272;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC8036 f10273;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f10276 = false;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C3168 f10274 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C3168 f10278 = null;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C19113 f10275 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C7926 f10279 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6633 f10277 = null;

    public C3168(AbstractC8036 abstractC8036, Object obj) {
        this.f10273 = abstractC8036;
        this.f10272 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3168 m10350(AbstractC8036 abstractC8036, Object obj) {
        C3168 c3168 = new C3168(abstractC8036, obj);
        c3168.f10274 = this;
        c3168.f10278 = this.f10278;
        c3168.f10275 = this.f10275;
        c3168.f10279 = this.f10279;
        c3168.f10277 = this.f10277;
        return c3168;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Env[");
        sb.append(this.f10272);
        if (this.f10278 != null) {
            sb.append(",outer=");
            sb.append(this.f10278);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C23306 c23306 = new C23306();
        c23306.f75471 = this;
        return c23306;
    }
}
