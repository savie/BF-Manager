package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܿ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17222 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f54881;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f54882;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22161 f54883;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC10167 f54884;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10873 f54885;

    public C17222(C10873 c10873, EnumC10167 enumC10167, Predicate predicate) {
        this.f54884 = enumC10167;
        this.f54882 = predicate;
        this.f54885 = c10873;
        this.f54883 = c10873.f36970;
        this.f54881 = c10873.f36966;
        m40162();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C22161 c22161;
        if (this.f54881 != this.f54885.f36966 && (c22161 = this.f54883) != null && !c22161.f72487.mo9331(c22161.f72486)) {
            C22161 c22162 = this.f54883;
            if (c22162 != null) {
                this.f54883 = c22162.f72485;
            }
            m40162();
            this.f54881 = this.f54885.f36966;
        }
        return this.f54883 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C22161 c22161 = this.f54883;
        AbstractC23903 abstractC23903 = c22161 == null ? null : c22161.f72486;
        if (c22161 != null) {
            this.f54883 = c22161.f72485;
        }
        m40162();
        return abstractC23903;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40162() {
        Predicate predicate;
        C10873 c10873;
        while (true) {
            C22161 c22161 = this.f54883;
            predicate = this.f54882;
            if (c22161 == null || predicate == null || predicate.test(c22161.f72486)) {
                break;
            } else {
                this.f54883 = this.f54883.f72485;
            }
        }
        if (this.f54884 == EnumC10167.RECURSIVE) {
            while (this.f54883 == null && (c10873 = this.f54885.f36972) != null) {
                this.f54885 = c10873;
                this.f54883 = c10873.f36970;
                this.f54881 = c10873.f36966;
                while (true) {
                    C22161 c22162 = this.f54883;
                    if (c22162 == null || predicate == null || predicate.test(c22162.f72486)) {
                        break;
                    } else {
                        this.f54883 = this.f54883.f72485;
                    }
                }
            }
        }
    }
}
