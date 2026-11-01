package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۧܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4OW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11127 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12063 f37759;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC21004 f37762;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f37760 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f37758 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f37761 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo28061(C13825 c13825, C6187 c6187);

    public AbstractC11127(C12063 c12063, EnumC21004 enumC21004) {
        this.f37759 = c12063;
        this.f37762 = enumC21004;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo28058(int i) {
        ArrayList arrayList = this.f37761;
        if (arrayList.size() > 0) {
            EnumC21004 enumC21004 = this.f37762;
            int i2 = enumC21004.f68396 - 1;
            int iM23326 = (i + i2) & (~i2);
            this.f37758 = iM23326;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC9011 abstractC9011 = (AbstractC9011) arrayList.get(i3);
                int i4 = enumC21004.f68396 - 1;
                iM23326 = abstractC9011.m23326((iM23326 + i4) & (~i4), i3);
            }
            return iM23326;
        }
        this.f37758 = 0;
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m28059() {
        return this.f37761;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9011 m28060(AbstractC9011 abstractC9011) {
        HashMap map = this.f37760;
        ArrayList<AbstractC9011> arrayList = this.f37761;
        if (map == null) {
            this.f37760 = new HashMap();
            for (AbstractC9011 abstractC9012 : arrayList) {
                this.f37760.put(abstractC9012, abstractC9012);
            }
        }
        AbstractC9011 abstractC9013 = (AbstractC9011) this.f37760.get(abstractC9011);
        if (abstractC9013 != null) {
            return abstractC9013;
        }
        this.f37760.put(abstractC9011, abstractC9011);
        arrayList.add(abstractC9011);
        return abstractC9011;
    }
}
