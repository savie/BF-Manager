package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩷ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0IX0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22001 extends AbstractC11902 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicReference f70983;

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo27545();

    public AbstractC22001(AbstractC1118 abstractC1118) {
        super(2);
        this.f70983 = new AtomicReference(abstractC1118);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m49735() {
        mo27545();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1118 m49734() {
        return (AbstractC1118) this.f70983.get();
    }
}
