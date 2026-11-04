package l;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡܶۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9463 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8850 f30676;

    public C9463(C8850 c8850) {
        this.f30676 = c8850;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C8850 c8850 = this.f30676;
        C5365 c5365 = c8850.f74922;
        C1481 c1481 = c8850.f74926;
        return Integer.compare(c5365.mo16027(c1481.m5272((InterfaceC2338) ((Map.Entry) obj).getKey())), c5365.mo16027(c1481.m5272((InterfaceC2338) ((Map.Entry) obj2).getKey())));
    }
}
