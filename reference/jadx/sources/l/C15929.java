package l;

import android.content.DialogInterface;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes4.dex */
public final class C15929 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3120 f51611;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f51612;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f51613;

    public C15929(AbstractActivityC12483 abstractActivityC12483, ArrayList arrayList, C3120 c3120) {
        this.f51613 = abstractActivityC12483;
        this.f51612 = arrayList;
        this.f51611 = c3120;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f51613, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C4987 {
        ArrayList arrayList = this.f51612;
        boolean z = ((C20162) arrayList.get(0)).f65476;
        boolean z2 = ((C20162) arrayList.get(1)).f65476;
        boolean z3 = ((C20162) arrayList.get(2)).f65476;
        boolean z4 = ((C20162) arrayList.get(3)).f65476;
        boolean z5 = ((C20162) arrayList.get(4)).f65476;
        boolean z6 = ((C20162) C19084.m43861(arrayList, 1)).f65476;
        C3120 c3120 = this.f51611;
        if (c3120 != null) {
            C14804.m35472(c3120.m9393(), z, z2, z3, z4, z5, z6);
            return;
        }
        if (z) {
            C2724 c2724M8305 = C2724.m8305(4132);
            c2724M8305.m8315(2);
            C1313 c1313M8321 = c2724M8305.m8321();
            if (!c1313M8321.m4686()) {
                throw new C4987(C4820.m13401(c1313M8321, R.string.MT_Protector));
            }
            if (c1313M8321.m4671()) {
                C3513.m10339(new JSONObject(c1313M8321.m4685()));
            }
        }
        if (z2) {
            C2724 c2724M8306 = C2724.m8305(4132);
            c2724M8306.m8315(0);
            C1313 c1313M8322 = c2724M8306.m8321();
            if (!c1313M8322.m4686()) {
                throw new C4987(C4820.m13401(c1313M8322, R.string.MT_Protector));
            }
            if (c1313M8322.m4671()) {
                C3513.m10338(new JSONArray(c1313M8322.m4685()), z6);
            }
        }
        if (z3) {
            C2724 c2724M8307 = C2724.m8305(4132);
            c2724M8307.m8315(1);
            C1313 c1313M8323 = c2724M8307.m8321();
            if (!c1313M8323.m4686()) {
                throw new C4987(C4820.m13401(c1313M8323, R.string.MT_Protector));
            }
            if (c1313M8323.m4671()) {
                C3513.m10341(new JSONArray(c1313M8323.m4685()), z6);
            }
        }
        if (z4) {
            C2724 c2724M8308 = C2724.m8305(4132);
            c2724M8308.m8315(3);
            C1313 c1313M8324 = c2724M8308.m8321();
            if (!c1313M8324.m4686()) {
                throw new C4987(C4820.m13401(c1313M8324, R.string.MT_Protector));
            }
            if (c1313M8324.m4671()) {
                JSONArray jSONArray = new JSONArray(c1313M8324.m4685());
                ArrayList arrayList2 = new ArrayList(jSONArray.size());
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(C21512.m48159(jSONArray.getJSONObject(i)));
                }
                if (z6) {
                    C21512.m48168(arrayList2);
                } else {
                    C21512.m48173(arrayList2);
                }
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C15829.m37611(R.string.MT_Protector);
        if (((C20162) this.f51612.get(0)).f65476) {
            this.f51613.recreate();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f51613.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
