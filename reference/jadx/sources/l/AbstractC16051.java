package l;

import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R5YB */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16051 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C13810 f51935;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f51936;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C11545 f51937;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f51938;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f51939;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo17179();

    public AbstractC16051(C11545 c11545, C13810 c13810, ArrayList arrayList, boolean z, String str) {
        this.f51937 = c11545;
        this.f51935 = c13810;
        this.f51939 = arrayList;
        this.f51936 = z;
        this.f51938 = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38046() {
        C13810 c13810 = this.f51935;
        AbstractC20745 abstractC20745M15313 = C5553.m15313(c13810.m33624(), new String[0]);
        boolean zMo8447 = abstractC20745M15313.mo8447();
        C11545 c11545 = this.f51937;
        if (zMo8447) {
            AbstractC20745 abstractC20745M46689 = abstractC20745M15313.m46689();
            C13638.requireNonNull(abstractC20745M46689);
            if (!abstractC20745M46689.mo8447()) {
                if (!C6696.m18084()) {
                    c11545.m28824().m31000(C16737.m39264(R.string.MT_Protector, c13810.m33624()), false);
                    return;
                }
            }
        } else if (!C6696.m18084()) {
            c11545.m28824().m31000(C16737.m39264(R.string.MT_Protector, c13810.m33624()), false);
            return;
        }
        if (this.f51936) {
            C11005.m27761(new C8995(this), c11545.m28824(), this.f51938);
        } else {
            new C20989(this, null, false).m10243();
        }
    }
}
