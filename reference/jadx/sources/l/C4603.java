package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7428 */
/* JADX INFO: loaded from: classes2.dex */
public class C4603 implements Iterable {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC8774 f16296;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object f16299;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f16298 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C4603 f16297 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4603 f16300 = null;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C10164 f16295 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8753 f16301 = null;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23195 f16294 = null;

    public C4603(AbstractC8774 abstractC8774, Object obj) {
        this.f16296 = abstractC8774;
        this.f16299 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4603 m12747(AbstractC8774 abstractC8774, Object obj) {
        C4603 c4603 = new C4603(abstractC8774, obj);
        c4603.f16297 = this;
        c4603.f16300 = this.f16300;
        c4603.f16295 = this.f16295;
        c4603.f16301 = this.f16301;
        c4603.f16294 = this.f16294;
        return c4603;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Env[");
        sb.append(this.f16299);
        if (this.f16300 != null) {
            sb.append(",outer=");
            sb.append(this.f16300);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C3047 c3047 = new C3047();
        c3047.f11427 = this;
        return c3047;
    }
}
