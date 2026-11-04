package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۘܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4214 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4214 f15398;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2175 f15399;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC11781 f15400;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C4214 f15401;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C4214 f15402;

    public C4214(AbstractC11781 abstractC11781, C4214 c4214, C4214 c4215, C2175 c2175) {
        this.f15400 = abstractC11781;
        this.f15402 = c4214;
        this.f15398 = c4215;
        this.f15399 = c2175;
        if (c4215 != null) {
            c4215.f15401 = this;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4214 m13478() {
        return this.f15402;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4214 m13479(Predicate predicate) {
        AbstractC11781 abstractC11781 = this.f15402.f15400;
        if (abstractC11781 == null || predicate == null || predicate.test(abstractC11781)) {
            return this.f15402;
        }
        return this.f15402.m13479(predicate);
    }
}
