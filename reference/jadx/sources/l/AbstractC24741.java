package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1WK */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24741 implements Cloneable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f80119 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55250(AbstractC16535 abstractC16535) {
        if (this.f80119 == null) {
            this.f80119 = new ArrayList();
        }
        this.f80119.add(abstractC16535);
    }

    @Override // 
    /* JADX INFO: renamed from: clone */
    public AbstractC24741 mo28883clone() {
        try {
            AbstractC24741 abstractC24741 = (AbstractC24741) super.clone();
            ArrayList arrayList = this.f80119;
            if (arrayList != null) {
                abstractC24741.f80119 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    abstractC24741.f80119.add((InterfaceC11314) arrayList.get(i));
                }
            }
            return abstractC24741;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
