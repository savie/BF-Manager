package l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.᩸᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21868 extends CountedCompleter {
    public final InterfaceC8616 a;
    public final int b;

    public abstract void a();

    public abstract AbstractC21868 b(int i, int i2);

    public AbstractC21868(InterfaceC8616 interfaceC8616) {
        this.a = interfaceC8616;
        this.b = 0;
    }

    public AbstractC21868(AbstractC21868 abstractC21868, InterfaceC8616 interfaceC8616, int i) {
        super(abstractC21868);
        this.a = interfaceC8616;
        this.b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC21868 abstractC21868B = this;
        while (abstractC21868B.a.o() != 0) {
            abstractC21868B.setPendingCount(abstractC21868B.a.o() - 1);
            int i = 0;
            int iCount = 0;
            while (i < abstractC21868B.a.o() - 1) {
                AbstractC21868 abstractC21868B2 = abstractC21868B.b(i, abstractC21868B.b + iCount);
                iCount = (int) (abstractC21868B2.a.count() + ((long) iCount));
                abstractC21868B2.fork();
                i++;
            }
            abstractC21868B = abstractC21868B.b(i, abstractC21868B.b + iCount);
        }
        abstractC21868B.a();
        abstractC21868B.propagateCompletion();
    }
}
