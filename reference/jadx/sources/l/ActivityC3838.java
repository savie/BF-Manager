package l;

import android.os.Bundle;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC3838 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f13072 = 0;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f13073 = new ArrayList();

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C11999 f13074;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "ToolMenuEditActivity";
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
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC12025(this, 1));
        C25227 c25227 = (C25227) m40418(R.id.MT_Protector);
        final C16516 c16516 = new C16516(this);
        c25227.setAdapter(c16516);
        C23522.m52726().m40350(this, new InterfaceC16438() { // from class: l.֫֫ᩴ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                ActivityC3838.m12378(this.f5500, c16516);
            }
        });
        C11999 c11999 = new C11999(new C24722(this));
        this.f13074 = c11999;
        c11999.m30173(c25227);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12378(ActivityC3838 activityC3838, C16516 c16516) {
        ArrayList arrayList = activityC3838.f13073;
        arrayList.clear();
        arrayList.add(new C17262(0, R.string.MT_Protector));
        for (AbstractC22484 abstractC22484 : C5330.m15982()) {
            if (abstractC22484 == C15024.f49062) {
                arrayList.add(new C17262(1, R.string.MT_Protector));
            } else if (abstractC22484 == C21738.f69343) {
                arrayList.add(new C17262(2, R.string.MT_Protector));
            } else if (!(abstractC22484 instanceof C19500) || ((C19500) abstractC22484).m45021()) {
                arrayList.add(new C3092(activityC3838, abstractC22484));
            }
        }
        c16516.notifyDataSetChanged();
    }
}
