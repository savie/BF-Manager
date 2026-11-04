package l;

/* JADX INFO: renamed from: l.ۤۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6YU */
/* JADX INFO: loaded from: classes4.dex */
public final class C10629 extends C16121 {
    @Override // l.AbstractC24327
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo27117() {
        if (!super.mo27117() || !C11972.m30031("MULTI_PROCESS")) {
            return false;
        }
        int i = C11646.f37671;
        if (C19580.f63140.mo27117()) {
            return C12867.f41194.getStatics().isMultiProcessEnabled();
        }
        throw C19580.m45180();
    }
}
