package l;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18070 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8485 f57784;

    public C18070(C8485 c8485) {
        this.f57784 = c8485;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C8485 c8485 = this.f57784;
        C12158 c12158 = c8485.f51679;
        C21329 c21329 = c8485.f51687;
        return Integer.compare(c12158.mo3477(c21329.m47837((InterfaceC18029) ((Map.Entry) obj).getKey())), c12158.mo3477(c21329.m47837((InterfaceC18029) ((Map.Entry) obj2).getKey())));
    }
}
