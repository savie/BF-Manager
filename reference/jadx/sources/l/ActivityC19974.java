package l;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ᩴܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC19974 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f64182 = 0;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public C15179 f64183;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C8874 f64184;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C18570 f64185;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "ApkSelectorActivity";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40415();
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        C7068 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C14840 c14840 = new C14840(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m19400(c14840);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC23960(6, this));
        this.f64184 = new C8874(this);
        this.f64185 = new C18570(this);
        TabLayout tabLayout = (TabLayout) m40418(R.id.tabLayout);
        C15179 c15179 = (C15179) m40418(R.id.MT_Protector);
        this.f64183 = c15179;
        c15179.m36514(new C4400(this));
        tabLayout.setupWithViewPager(this.f64183);
        this.f64184.f28993.m27889(null);
        final C1417 c1417 = this.f64185.f60337;
        c1417.getClass();
        C5261.f18540.execute(new Runnable() { // from class: l.֡᩶ۧ
            @Override // java.lang.Runnable
            public final void run() {
                final C1417 c1418 = c1417;
                ActivityC19974 activityC19974 = c1418.f5005;
                PackageManager packageManager = activityC19974.getPackageManager();
                ArrayList<C21554> arrayList = c1418.f5004;
                arrayList.clear();
                for (PackageInfo packageInfo : packageManager.getInstalledPackages(0)) {
                    if ((packageInfo.applicationInfo.flags & 129) == 0) {
                        arrayList.add(new C21554(packageInfo));
                    }
                }
                Collections.sort(arrayList, new C8129());
                activityC19974.runOnUiThread(new Runnable() { // from class: l.ᩳ᩶ۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c1418.notifyDataSetChanged();
                    }
                });
                SystemClock.sleep(100L);
                for (final C21554 c21554 : arrayList) {
                    final BitmapDrawable bitmapDrawableM48870 = RunnableC21479.m48870(c21554.f68839);
                    activityC19974.runOnUiThread(new Runnable() { // from class: l.ۢ᩶ۧ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C21554 c21555 = c21554;
                            boolean z = c21555.f68840;
                            C6389 c6389 = c21555.f68837;
                            BitmapDrawable bitmapDrawable = bitmapDrawableM48870;
                            if (!z) {
                                c6389.setDrawable(bitmapDrawable);
                                return;
                            }
                            Drawable drawable = c6389.getDrawable();
                            bitmapDrawable.setBounds(drawable.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                            c6389.setDrawable(transitionDrawable);
                            transitionDrawable.setCrossFadeEnabled(true);
                            transitionDrawable.startTransition(300);
                        }
                    });
                }
            }
        });
    }
}
