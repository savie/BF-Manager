package l;

import android.content.Intent;
import android.view.MenuItem;
import com.alipay.sdk.m.t.e;

/* JADX INFO: renamed from: l.᩷ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22200 implements InterfaceC12281, InterfaceC21436, InterfaceC16025, InterfaceC18006, InterfaceC5026, InterfaceC14852 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71528;

    public /* synthetic */ C22200(Object obj) {
        this.f71528 = obj;
    }

    @Override // l.InterfaceC21436
    public boolean onMenuItemClick(MenuItem menuItem) {
        C9821.m25597((C9821) this.f71528, menuItem);
        return true;
    }

    @Override // l.InterfaceC12281
    /* JADX INFO: renamed from: ۙ */
    public void mo17031(int i) {
        ViewOnClickListenerC2063.m7121((ViewOnClickListenerC2063) this.f71528, i);
    }

    @Override // l.InterfaceC5026
    /* JADX INFO: renamed from: ۙ */
    public void mo15250(Integer num, Integer num2) {
        C22180.m50171((C22180) this.f71528);
    }

    @Override // l.InterfaceC18006
    /* JADX INFO: renamed from: ۙ */
    public void mo1736(Object obj) {
        ViewOnClickListenerC20698.m47344((ViewOnClickListenerC20698) this.f71528, (Integer) obj);
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۙ */
    public void mo11629(AbstractC11781 abstractC11781) {
        ((C19881) this.f71528).m45757((C2920) abstractC11781);
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۤ */
    public /* synthetic */ boolean mo11630() {
        return false;
    }

    @Override // l.InterfaceC16025
    /* JADX INFO: renamed from: ۙ */
    public void mo8384(Intent intent, int i) {
        ActivityC3698 activityC3698 = (ActivityC3698) this.f71528;
        int i2 = ActivityC3698.f12705;
        if (i != -1) {
            activityC3698.finish();
            return;
        }
        Intent intent2 = new Intent(activityC3698, (Class<?>) ServiceC10702.class);
        intent2.putExtra(e.m, intent);
        C7508.m20562(activityC3698, intent2);
        C21576.m49069(new RunnableC20330(5, activityC3698), 100L);
    }
}
