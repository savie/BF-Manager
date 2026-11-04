package l;

import android.os.Bundle;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC4584 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f16298 = 0;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f16299 = new ArrayList();

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C11999 f16300;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "FloatingMenuEditActivity";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC15798(1, this));
        C25227 c25227 = (C25227) m40418(R.id.MT_Protector);
        final C24086 c24086 = new C24086(this);
        c25227.setAdapter(c24086);
        C23522.m52726().m40350(this, new InterfaceC16438() { // from class: l.᩵ۚᩴ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                ActivityC4584.m14378(this.f65292, c24086);
            }
        });
        C11999 c11999 = new C11999(new C6186(this));
        this.f16300 = c11999;
        c11999.m30173(c25227);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14378(ActivityC4584 activityC4584, C24086 c24086) {
        C21036.m48080();
        boolean zM48079 = C21036.m48079();
        ArrayList arrayList = activityC4584.f16299;
        arrayList.clear();
        arrayList.add(new C9167(0));
        arrayList.add(new C3948(0, R.string.MT_Protector));
        for (AbstractC22484 abstractC22484 : C3202.m10543()) {
            if (abstractC22484 == C15024.f49062) {
                arrayList.add(new C3948(1, R.string.MT_Protector));
            } else if (abstractC22484 == C21738.f69343) {
                arrayList.add(new C3948(2, R.string.MT_Protector));
            } else if (zM48079 || !abstractC22484.mo31674().equals("builtin:systemTranslate")) {
                if (!(abstractC22484 instanceof C19500) || ((C19500) abstractC22484).m45021()) {
                    arrayList.add(new C0219(activityC4584, abstractC22484));
                }
            }
        }
        c24086.notifyDataSetChanged();
    }
}
