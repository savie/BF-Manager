package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1WK */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1704 implements Cloneable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f6732 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5665(AbstractC9467 abstractC9467) {
        if (this.f6732 == null) {
            this.f6732 = new ArrayList();
        }
        this.f6732.add(abstractC9467);
    }

    @Override // 
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public AbstractC1704 mo5666clone() {
        try {
            AbstractC1704 abstractC1704 = (AbstractC1704) super.clone();
            ArrayList arrayList = this.f6732;
            if (arrayList != null) {
                abstractC1704.f6732 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    abstractC1704.f6732.add((InterfaceC14406) arrayList.get(i));
                }
            }
            return abstractC1704;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
