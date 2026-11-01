package l;

import bin.mt.plus.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۢᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAOM */
/* JADX INFO: loaded from: classes3.dex */
public final class C9745 implements InterfaceC7649 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f32791;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f32792;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f32793;

    @Override // l.InterfaceC7649
    public final String getId() {
        return ":dictionary:translator";
    }

    @Override // l.InterfaceC7649
    /* JADX INFO: renamed from: ۙ */
    public final int mo13405(int i, String str) {
        return -1;
    }

    @Override // l.InterfaceC7649
    /* JADX INFO: renamed from: ۙ */
    public final void mo13407() {
    }

    @Override // l.InterfaceC7649
    /* JADX INFO: renamed from: ۙ */
    public final void mo13408(int i) {
    }

    @Override // l.InterfaceC7649
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13411() {
        return false;
    }

    public C9745() {
        m24726(C4678.m12968());
        this.f32792 = Arrays.asList(new C9061("f", C16737.m39288(R.string.MT_Protector)), new C9061("r", C16737.m39288(R.string.MT_Protector)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24726(List list) {
        List list2 = this.f32791;
        if (list2 != null && list2.equals(list)) {
            return false;
        }
        this.f32791 = list;
        this.f32793 = list.isEmpty() ? Collections.singletonList(new C9061("", "----")) : (List) C9030.stream(list).map(new C16025(1)).collect(C1890.toList());
        return true;
    }

    @Override // l.InterfaceC7649
    /* JADX INFO: renamed from: ۖ */
    public final List mo13404() {
        return this.f32793;
    }

    @Override // l.InterfaceC7649
    /* JADX INFO: renamed from: ۨ */
    public final List mo13410() {
        return this.f32792;
    }

    @Override // l.InterfaceC7649
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC17526 mo13406(C10472 c10472, C10472 c10473) {
        return new C1982(this.f32791.isEmpty() ? null : (C0176) this.f32791.get(c10472.f35823), c10473.f35823 == 0);
    }

    public final String toString() {
        return C16737.m39288(R.string.MT_Protector);
    }
}
