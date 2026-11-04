package l;

import android.content.DialogInterface;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩵ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20632 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f66162;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1079 f66163;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f66164;

    public C20632(AbstractActivityC17204 abstractActivityC17204, ArrayList arrayList, C1079 c1079) {
        this.f66164 = abstractActivityC17204;
        this.f66162 = arrayList;
        this.f66163 = c1079;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f66164, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException, C4866 {
        ArrayList arrayList = this.f66162;
        boolean z = ((C12427) arrayList.get(0)).f39959;
        boolean z2 = ((C12427) arrayList.get(1)).f39959;
        boolean z3 = ((C12427) arrayList.get(2)).f39959;
        boolean z4 = ((C12427) arrayList.get(3)).f39959;
        boolean z5 = ((C12427) arrayList.get(4)).f39959;
        boolean z6 = ((C12427) j$$ExternalSyntheticOutline0.m(arrayList, 1)).f39959;
        C1079 c1079 = this.f66163;
        if (c1079 != null) {
            C0618.m2741(c1079.m4044(), z, z2, z3, z4, z5, z6);
            return;
        }
        if (z) {
            ReentrantLock reentrantLock = C11650.f37690;
            C2592 c2592M8672 = C2592.m8672(4132);
            c2592M8672.m8674(2);
            C13778 c13778M8684 = c2592M8672.m8684();
            if (!c13778M8684.m33676()) {
                throw new C4866(C1364.m5010(c13778M8684, R.string.MT_Protector));
            }
            if (c13778M8684.m33675()) {
                C10312.m26581(new JSONObject(c13778M8684.m33679()));
            }
        }
        if (z2) {
            ReentrantLock reentrantLock2 = C11650.f37690;
            C2592 c2592M8673 = C2592.m8672(4132);
            c2592M8673.m8674(0);
            C13778 c13778M8685 = c2592M8673.m8684();
            if (!c13778M8685.m33676()) {
                throw new C4866(C1364.m5010(c13778M8685, R.string.MT_Protector));
            }
            if (c13778M8685.m33675()) {
                C10312.m26580(new JSONArray(c13778M8685.m33679()), z6);
            }
        }
        if (z3) {
            ReentrantLock reentrantLock3 = C11650.f37690;
            C2592 c2592M8674 = C2592.m8672(4132);
            c2592M8674.m8674(1);
            C13778 c13778M8686 = c2592M8674.m8684();
            if (!c13778M8686.m33676()) {
                throw new C4866(C1364.m5010(c13778M8686, R.string.MT_Protector));
            }
            if (c13778M8686.m33675()) {
                C10312.m26583(new JSONArray(c13778M8686.m33679()), z6);
            }
        }
        if (z4) {
            ReentrantLock reentrantLock4 = C11650.f37690;
            C2592 c2592M8675 = C2592.m8672(4132);
            c2592M8675.m8674(3);
            C13778 c13778M8687 = c2592M8675.m8684();
            if (!c13778M8687.m33676()) {
                throw new C4866(C1364.m5010(c13778M8687, R.string.MT_Protector));
            }
            if (c13778M8687.m33675()) {
                JSONArray jSONArray = new JSONArray(c13778M8687.m33679());
                ArrayList arrayList2 = new ArrayList(jSONArray.size());
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(C8969.m23951(jSONArray.getJSONObject(i)));
                }
                if (z6) {
                    C8969.m23960(arrayList2);
                } else {
                    C8969.m23966(arrayList2);
                }
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C22673.m51152(R.string.MT_Protector);
        if (((C12427) this.f66162.get(0)).f39959) {
            this.f66164.recreate();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f66164.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
