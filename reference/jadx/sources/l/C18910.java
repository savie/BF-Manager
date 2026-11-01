package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D4TJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18910 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC10444 abstractC10444 = (AbstractC10444) obj;
        AbstractC10444 abstractC10445 = (AbstractC10444) obj2;
        if (abstractC10444.m26387() != abstractC10445.m26387()) {
            return abstractC10444.m26387() ? -1 : 1;
        }
        if (abstractC10444.m26387()) {
            return abstractC10444.m26393().compareTo(abstractC10445.m26393());
        }
        if (abstractC10444.m26389() != abstractC10445.m26389()) {
            return !abstractC10444.m26389() ? -1 : 1;
        }
        if (!abstractC10444.m26389()) {
            return abstractC10444.m26393().compareTo(abstractC10445.m26393());
        }
        if (abstractC10444.m26388() != abstractC10445.m26388()) {
            return !abstractC10444.m26388() ? -1 : 1;
        }
        return abstractC10444.m26393().compareTo(abstractC10445.m26393());
    }
}
