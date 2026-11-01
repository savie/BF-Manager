package l;

import android.os.Bundle;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC6426 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21765 = 0;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C4647 f21766;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f21767 = new ArrayList();

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "FloatingMenuEditActivity";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC14141(1, this));
        C17492 c17492 = (C17492) m31016(R.id.MT_Protector);
        final C11282 c11282 = new C11282(this);
        c17492.setAdapter(c11282);
        C17132.m40016().m44959(this, new InterfaceC10597() { // from class: l.۫᩹ۚ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                ActivityC6426.m17607(this.f42367, c11282);
            }
        });
        C4647 c4647 = new C4647(new C6342(this));
        this.f21766 = c4647;
        c4647.m12825(c17492);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17607(ActivityC6426 activityC6426, C11282 c11282) {
        C22466.m49970();
        boolean zM49974 = C22466.m49974();
        ArrayList arrayList = activityC6426.f21767;
        arrayList.clear();
        arrayList.add(new C5015(0));
        arrayList.add(new C23982(0, R.string.MT_Protector));
        for (AbstractC21243 abstractC21243 : C16926.m39621()) {
            if (abstractC21243 == C18421.f58739) {
                arrayList.add(new C23982(1, R.string.MT_Protector));
            } else if (abstractC21243 == C22655.f73802) {
                arrayList.add(new C23982(2, R.string.MT_Protector));
            } else if (zM49974 || !abstractC21243.mo20676().equals("builtin:systemTranslate")) {
                if (!(abstractC21243 instanceof C17715) || ((C17715) abstractC21243).m41259()) {
                    arrayList.add(new C3519(activityC6426, abstractC21243));
                }
            }
        }
        c11282.notifyDataSetChanged();
    }
}
