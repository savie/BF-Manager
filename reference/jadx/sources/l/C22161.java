package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩹۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes.dex */
public final class C22161 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C22161 f72484;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22161 f72485;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 f72486;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C10873 f72487;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C22161 f72488;

    public C22161(AbstractC23903 abstractC23903, C22161 c22161, C22161 c22162, C10873 c10873) {
        this.f72486 = abstractC23903;
        this.f72484 = c22161;
        this.f72485 = c22162;
        this.f72487 = c10873;
        if (c22162 != null) {
            c22162.f72488 = this;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22161 m49171() {
        return this.f72484;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22161 m49172(Predicate predicate) {
        AbstractC23903 abstractC23903 = this.f72484.f72486;
        if (abstractC23903 == null || predicate == null || predicate.test(abstractC23903)) {
            return this.f72484;
        }
        return this.f72484.m49172(predicate);
    }
}
