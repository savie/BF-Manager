package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1403 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C4647 f5813;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f5814;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C17492 f5815;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3022 f5816;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f5817;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19749 f5818;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public BitSet f5819 = new BitSet();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f5820;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f5821;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f5822;

    public C1403(ActivityC19749 activityC19749, int i) {
        this.f5818 = activityC19749;
        this.f5822 = i;
        C17492 c17492 = (C17492) activityC19749.m30995(R.layout.MT_Protector);
        this.f5815 = c17492;
        C3022 c3022 = new C3022(this);
        this.f5816 = c3022;
        c17492.setAdapter(c3022);
        C17132.m40016().m44959(activityC19749, new InterfaceC10597() { // from class: l.֫ۚۚ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                this.f6504.f5816.notifyDataSetChanged();
            }
        });
        C4647 c4647 = new C4647(new C9374(this));
        this.f5813 = c4647;
        c4647.m12825(c17492);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9166 m4915() {
        return (C9166) ((ArrayList) C7754.m20409()).get(this.f5822);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m4914() {
        return m4915().m23579();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m4913(boolean z) {
        List listM4914 = m4914();
        ArrayList arrayList = new ArrayList();
        BitSet bitSet = this.f5819;
        if (z) {
            ArrayList arrayList2 = (ArrayList) listM4914;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (bitSet.get(size)) {
                        arrayList.add((C21159) arrayList2.remove(size));
                        this.f5816.notifyItemRemoved(size);
                    }
                } else {
                    Collections.reverse(arrayList);
                    return arrayList;
                }
            }
        } else {
            ArrayList arrayList3 = (ArrayList) listM4914;
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                if (bitSet.get(i)) {
                    arrayList.add((C21159) arrayList3.get(i));
                }
            }
            return arrayList;
        }
    }
}
