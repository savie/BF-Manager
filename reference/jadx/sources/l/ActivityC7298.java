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

/* JADX INFO: renamed from: l.۟ۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC7298 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f24232 = 0;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C5181 f24233;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C21409 f24234;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public C19383 f24235;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "ApkSelectorActivity";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31023();
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C11532 c11532 = new C11532(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m34905(c11532);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC8182(3, this));
        this.f24234 = new C21409(this);
        this.f24233 = new C5181(this);
        TabLayout tabLayout = (TabLayout) m31016(R.id.tabLayout);
        C19383 c19383 = (C19383) m31016(R.id.MT_Protector);
        this.f24235 = c19383;
        c19383.m44420(new C13649(this));
        tabLayout.setupWithViewPager(this.f24235);
        this.f24234.f69596.m22542(null);
        final C6592 c6592 = this.f24233.f17982;
        c6592.getClass();
        C4716.f16636.execute(new Runnable() { // from class: l.᩹ۜۜ
            @Override // java.lang.Runnable
            public final void run() {
                final C6592 c6593 = c6592;
                ActivityC7298 activityC7298 = c6593.f22212;
                PackageManager packageManager = activityC7298.getPackageManager();
                ArrayList<C2358> arrayList = c6593.f22211;
                arrayList.clear();
                for (PackageInfo packageInfo : packageManager.getInstalledPackages(0)) {
                    if ((packageInfo.applicationInfo.flags & 129) == 0) {
                        arrayList.add(new C2358(packageInfo));
                    }
                }
                Collections.sort(arrayList, new C0947());
                activityC7298.runOnUiThread(new Runnable() { // from class: l.۬ۜۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c6593.notifyDataSetChanged();
                    }
                });
                SystemClock.sleep(100L);
                for (final C2358 c2358 : arrayList) {
                    final BitmapDrawable bitmapDrawableM51895 = RunnableC23541.m51895(c2358.f8322);
                    activityC7298.runOnUiThread(new Runnable() { // from class: l.ۘۜۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2358 c2359 = c2358;
                            boolean z = c2359.f8324;
                            C19122 c19122 = c2359.f8323;
                            BitmapDrawable bitmapDrawable = bitmapDrawableM51895;
                            if (!z) {
                                c19122.setDrawable(bitmapDrawable);
                                return;
                            }
                            Drawable drawable = c19122.getDrawable();
                            bitmapDrawable.setBounds(drawable.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                            c19122.setDrawable(transitionDrawable);
                            transitionDrawable.setCrossFadeEnabled(true);
                            transitionDrawable.startTransition(300);
                        }
                    });
                }
            }
        });
    }
}
