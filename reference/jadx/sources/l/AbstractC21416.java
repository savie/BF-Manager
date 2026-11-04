package l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.᩶ܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC21416 extends CountedCompleter {
    public final InterfaceC13409 a;
    public final int b;

    public abstract void a();

    public abstract AbstractC21416 b(int i, int i2);

    public AbstractC21416(InterfaceC13409 interfaceC13409) {
        this.a = interfaceC13409;
        this.b = 0;
    }

    public AbstractC21416(AbstractC21416 abstractC21416, InterfaceC13409 interfaceC13409, int i) {
        super(abstractC21416);
        this.a = interfaceC13409;
        this.b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC21416 abstractC21416B = this;
        while (abstractC21416B.a.o() != 0) {
            abstractC21416B.setPendingCount(abstractC21416B.a.o() - 1);
            int i = 0;
            int iCount = 0;
            while (i < abstractC21416B.a.o() - 1) {
                AbstractC21416 abstractC21416B2 = abstractC21416B.b(i, abstractC21416B.b + iCount);
                iCount = (int) (abstractC21416B2.a.count() + ((long) iCount));
                abstractC21416B2.fork();
                i++;
            }
            abstractC21416B = abstractC21416B.b(i, abstractC21416B.b + iCount);
        }
        abstractC21416B.a();
        abstractC21416B.propagateCompletion();
    }
}
