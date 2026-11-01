package l;

import android.os.Bundle;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC23361 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f75681 = 0;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C4647 f75682;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f75683 = new ArrayList();

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "ToolMenuEditActivity";
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
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC8105(1, this));
        C17492 c17492 = (C17492) m31016(R.id.MT_Protector);
        final C20538 c20538 = new C20538(this);
        c17492.setAdapter(c20538);
        C17132.m40016().m44959(this, new InterfaceC10597() { // from class: l.ۡ֨ۚ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                ActivityC23361.m51476(this.f29570, c20538);
            }
        });
        C4647 c4647 = new C4647(new C7132(this));
        this.f75682 = c4647;
        c4647.m12825(c17492);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51476(ActivityC23361 activityC23361, C20538 c20538) {
        ArrayList arrayList = activityC23361.f75683;
        arrayList.clear();
        arrayList.add(new C15600(0, R.string.MT_Protector));
        for (AbstractC21243 abstractC21243 : C19127.m43951()) {
            if (abstractC21243 == C18421.f58739) {
                arrayList.add(new C15600(1, R.string.MT_Protector));
            } else if (abstractC21243 == C22655.f73802) {
                arrayList.add(new C15600(2, R.string.MT_Protector));
            } else if (!(abstractC21243 instanceof C17715) || ((C17715) abstractC21243).m41259()) {
                arrayList.add(new C16305(activityC23361, abstractC21243));
            }
        }
        c20538.notifyDataSetChanged();
    }
}
