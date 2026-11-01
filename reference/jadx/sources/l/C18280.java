package l;

import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plugin.api.ui.PluginProgressBar;
import bin.mt.plugin.api.util.Consumer;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18280 implements InterfaceC21921, InterfaceC8395, InterfaceC10014, InterfaceC7150, InterfaceC11754, Consumer, InterfaceC7794, InterfaceC21133, InterfaceC13320 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58328;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f58329;

    public /* synthetic */ C18280(int i, Object obj) {
        this.f58328 = i;
        this.f58329 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept, reason: collision with other method in class */
    public void mo42471accept(Object obj) {
        ((PluginProgressBar) this.f58329).setSecondaryProgress(((Integer) obj).intValue());
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        ActivityC11220.m28176((ActivityC11220) this.f58329, menuItem);
        return true;
    }

    @Override // l.InterfaceC7150
    /* JADX INFO: renamed from: ۙ */
    public View mo8441() {
        return ((View) this.f58329).findViewById(R.id.MT_Protector);
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(int i) {
        AbstractC17902 abstractC17902;
        switch (this.f58328) {
            case 1:
                abstractC17902 = (C9442) this.f58329;
                break;
            default:
                abstractC17902 = (C9801) this.f58329;
                break;
        }
        abstractC17902.mo21455(i);
    }

    @Override // l.InterfaceC10014
    /* JADX INFO: renamed from: ۙ */
    public void mo13621(int i, int i2, int i3, int i4) {
        C3040.m9061((C3040) this.f58329, i2, i3, i4);
    }

    @Override // l.InterfaceC8395
    /* JADX INFO: renamed from: ۙ */
    public void mo1796(Intent intent, int i) {
        switch (this.f58328) {
            case 0:
                ActivityC3588.m10610((ActivityC3588) this.f58329, i, intent);
                break;
            default:
                AbstractActivityC12483.m30992((AbstractActivityC12483) this.f58329, i);
                break;
        }
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ */
    public void mo1179(AbstractC23903 abstractC23903) {
        C0576.m2729((C0576) this.f58329, abstractC23903);
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ */
    public /* synthetic */ boolean mo1180() {
        return false;
    }

    @Override // l.InterfaceC7150
    /* JADX INFO: renamed from: ܰ */
    public /* synthetic */ InterfaceC21615 mo8442() {
        return null;
    }

    @Override // l.InterfaceC11754
    public C15844 onApplyWindowInsets(View view, C15844 c15844) {
        ViewGroup viewGroup = (ViewGroup) this.f58329;
        int i = ViewOnClickListenerC19497.f62728;
        C13954 c13954M37673 = c15844.m37673(1);
        C13954 c13954M37674 = c15844.m37673(2);
        C13954 c13954M37675 = c15844.m37673(8);
        viewGroup.setPadding(0, c13954M37673.f45912, 0, 0);
        view.setPadding(0, 0, 0, Math.max(c13954M37674.f45913, c13954M37675.f45913));
        return c15844;
    }

    @Override // l.InterfaceC7794
    public List accept(Object obj) {
        C21199 c21199 = (C21199) this.f58329;
        try {
            String strMo25238 = ((InterfaceC9974) obj).mo25238();
            if (strMo25238 == null) {
                return null;
            }
            C6222 c6222 = c21199.get();
            c6222.m17276reset((CharSequence) strMo25238);
            if (!C23709.m52203(c6222)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            do {
                C8500 c8500 = new C8500(0);
                c8500.f29470 = c6222.start();
                int iEnd = c6222.end();
                c8500.f29473 = iEnd;
                c8500.m22225(c8500.f29470, iEnd, (CharSequence) strMo25238);
                arrayList.add(c8500);
                if (!C23709.m52203(c6222)) {
                    break;
                }
            } while (arrayList.size() < 2000);
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }
}
