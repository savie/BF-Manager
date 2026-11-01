package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۘۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 02RL */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3759 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f13612 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract String mo10988();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m10986(AbstractC3759 abstractC3759) {
        ArrayList arrayList = abstractC3759.f13612;
        return arrayList == null ? AbstractC22433.of() : arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10987(AbstractC3759 abstractC3759, AbstractC2348 abstractC2348) {
        if (abstractC3759.f13612 == null) {
            abstractC3759.f13612 = new ArrayList(1);
        }
        abstractC3759.f13612.add(abstractC2348);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10989(AbstractC3759 abstractC3759, C15050 c15050) {
        ArrayList arrayList;
        if (abstractC3759 == this || (arrayList = this.f13612) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC2348) it.next()).f8288 = c15050;
        }
        ArrayList arrayList2 = this.f13612;
        RandomAccess randomAccessOf = abstractC3759.f13612;
        if (randomAccessOf == null) {
            randomAccessOf = AbstractC22433.of();
        }
        arrayList2.addAll(randomAccessOf);
        abstractC3759.f13612 = arrayList2;
        this.f13612 = null;
    }
}
