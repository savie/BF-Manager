package l;

import java.util.Queue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۢᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 93Z4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10294 extends AbstractC1346 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Predicate f32870;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C18499 f32871 = new C18499();

    public C10294(C7312 c7312, Predicate predicate) {
        this.f32870 = predicate;
        this.f4810 = c7312.f24069;
        c7312.f24069 = this;
    }

    @Override // l.AbstractC1346
    /* JADX INFO: renamed from: ۙ */
    public final void mo4974(C17007 c17007) {
        Predicate predicate;
        if (c17007.m40083(EnumC6984.NON_DEFERRABLE) || ((predicate = this.f32870) != null && !predicate.test(c17007))) {
            this.f4810.mo4974(c17007);
        } else {
            this.f32871.m43089(c17007);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Queue m26550() {
        return this.f32871;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26551(Predicate predicate) {
        while (true) {
            C17007 c17007 = (C17007) this.f32871.m43092();
            if (c17007 != null) {
                if (predicate.test(c17007)) {
                    this.f4810.mo4974(c17007);
                }
            } else {
                this.f32871 = null;
                return;
            }
        }
    }
}
