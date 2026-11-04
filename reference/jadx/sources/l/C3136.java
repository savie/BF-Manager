package l;

import bin.mt.plus.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAOM */
/* JADX INFO: loaded from: classes3.dex */
public final class C3136 implements InterfaceC22285 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f10161;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f10162;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f10163;

    @Override // l.InterfaceC22285
    public final String getId() {
        return ":dictionary:translator";
    }

    @Override // l.InterfaceC22285
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo10246(int i, String str) {
        return -1;
    }

    @Override // l.InterfaceC22285
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10248() {
    }

    @Override // l.InterfaceC22285
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10249(int i) {
    }

    @Override // l.InterfaceC22285
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo10252() {
        return false;
    }

    public C3136() {
        m10250(C6912.m19190());
        this.f10162 = Arrays.asList(new C13576("f", C21576.m49088(R.string.MT_Protector)), new C13576("r", C21576.m49088(R.string.MT_Protector)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10250(List list) {
        List list2 = this.f10161;
        if (list2 != null && list2.equals(list)) {
            return false;
        }
        this.f10161 = list;
        this.f10163 = list.isEmpty() ? Collections.singletonList(new C13576("", "----")) : (List) C1170.stream(list).map(new C12796(1)).collect(C2025.toList());
        return true;
    }

    @Override // l.InterfaceC22285
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List mo10253() {
        return this.f10163;
    }

    @Override // l.InterfaceC22285
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List mo10251() {
        return this.f10162;
    }

    @Override // l.InterfaceC22285
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5877 mo10247(C5131 c5131, C5131 c5132) {
        return new C23274(this.f10161.isEmpty() ? null : (C18099) this.f10161.get(c5131.f17868), c5132.f17868 == 0);
    }

    public final String toString() {
        return C21576.m49088(R.string.MT_Protector);
    }
}
