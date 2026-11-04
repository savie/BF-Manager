package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۠۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8640 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C25227 f28226;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0437 f28227;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f28228;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public BitSet f28229 = new BitSet();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5440 f28230;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C11999 f28231;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f28232;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f28233;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f28234;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f28235;

    public C8640(ActivityC5440 activityC5440, int i) {
        this.f28230 = activityC5440;
        this.f28232 = i;
        C25227 c25227 = (C25227) activityC5440.m40395(R.layout.MT_Protector);
        this.f28226 = c25227;
        C0437 c0437 = new C0437(this);
        this.f28227 = c0437;
        c25227.setAdapter(c0437);
        C23522.m52726().m40350(activityC5440, new InterfaceC16438() { // from class: l.᩶۫ᩴ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                this.f67930.f28227.notifyDataSetChanged();
            }
        });
        C11999 c11999 = new C11999(new C18336(this));
        this.f28231 = c11999;
        c11999.m30173(c25227);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1711 m23287() {
        return (C1711) ((ArrayList) C24832.m55353()).get(this.f28232);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m23286() {
        return m23287().m6080();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m23285(boolean z) {
        List listM23286 = m23286();
        ArrayList arrayList = new ArrayList();
        BitSet bitSet = this.f28229;
        if (z) {
            ArrayList arrayList2 = (ArrayList) listM23286;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (bitSet.get(size)) {
                        arrayList.add((C16626) arrayList2.remove(size));
                        this.f28227.notifyItemRemoved(size);
                    }
                } else {
                    Collections.reverse(arrayList);
                    return arrayList;
                }
            }
        } else {
            ArrayList arrayList3 = (ArrayList) listM23286;
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                if (bitSet.get(i)) {
                    arrayList.add((C16626) arrayList3.get(i));
                }
            }
            return arrayList;
        }
    }
}
