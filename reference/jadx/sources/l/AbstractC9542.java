package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ۢۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: MAWV */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9542 extends AbstractC8504 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32235 = AtomicReferenceFieldUpdater.newUpdater(AbstractC9542.class, Object.class, "_consensus");
    public volatile /* synthetic */ Object _consensus = C1779.f6931;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo5037(Object obj, Object obj2);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract C21203 mo24391(Object obj);

    @Override // l.AbstractC8504
    /* JADX INFO: renamed from: ۙ */
    public final Object mo22233(Object obj) {
        Object obj2 = this._consensus;
        C21203 c21203 = C1779.f6931;
        if (obj2 == c21203) {
            C21203 c21203Mo24391 = mo24391(obj);
            obj2 = this._consensus;
            if (obj2 == c21203) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32235;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c21203, c21203Mo24391)) {
                    if (atomicReferenceFieldUpdater.get(this) != c21203) {
                        obj2 = this._consensus;
                    }
                }
                obj2 = c21203Mo24391;
            }
        }
        mo5037(obj, obj2);
        return obj2;
    }
}
