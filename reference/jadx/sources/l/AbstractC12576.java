package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBEP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12576 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20337 f42043;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4108 f42044;

    public AbstractC12576(C4108 c4108, C20337 c20337) {
        this.f42044 = c4108;
        this.f42043 = c20337;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16251 m31291(AbstractC22454 abstractC22454, C16251 c16251) {
        C20337 c20337;
        C11871 c11871M49949 = abstractC22454.m49949();
        ArrayList arrayListM29613 = c11871M49949.m29613();
        int iIndexOf = arrayListM29613.indexOf(abstractC22454);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("specified insn is not in this block");
        }
        if (iIndexOf != arrayListM29613.size() - 1) {
            throw new IllegalArgumentException("Adding move here not supported:" + abstractC22454.mo2376());
        }
        C4108 c4108 = this.f42044;
        C16251 c16251M38381 = C16251.m38381(c4108.m11689(), c16251.m38401());
        arrayListM29613.add(iIndexOf, AbstractC22454.m49948(new C10607(C6372.m17490(c16251M38381.getType()), C11312.f38175, c16251M38381, C0727.m3151(c16251)), c11871M49949));
        int iM38400 = c16251M38381.m38400();
        InterfaceC13303 it = c11871M49949.m29597().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c20337 = this.f42043;
            if (!zHasNext) {
                break;
            }
            c20337.m45902(iM38400, it.next());
        }
        C0727 c0727Mo17429 = abstractC22454.mo17429();
        int size = c0727Mo17429.size();
        for (int i = 0; i < size; i++) {
            c20337.m45902(iM38400, c0727Mo17429.m15275get(i).m38400());
        }
        c4108.m11692();
        return c16251M38381;
    }
}
