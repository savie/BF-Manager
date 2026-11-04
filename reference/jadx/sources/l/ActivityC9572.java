package l;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26HN */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityC9572 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f30971 = 0;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public MenuItem f30973;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public C5817 f30976;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public MenuItem f30979;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public int f30980;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public boolean f30981;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public boolean f30984;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public boolean f30986;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public final C10801 f30983 = C10801.m27518();

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public final Handler f30972 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public final C19269 f30985 = new C19269(this);

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public List f30978 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f30977 = new C21507(this);

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public long f30974 = -1;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public long f30982 = -1;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public final RunnableC4886 f30987 = new RunnableC4886(1, this);

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public final Runnable f30975 = new RunnableC18523(this);

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "McpLogActivity";
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24991(ActivityC9572 activityC9572) {
        boolean z;
        activityC9572.f30981 = false;
        if (activityC9572.f30986) {
            boolean zCanScrollVertically = activityC9572.f30976.canScrollVertically(-1);
            C0067 layoutManager = activityC9572.f30976.getLayoutManager();
            int iFindFirstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();
            long j = (iFindFirstVisibleItemPosition < 0 || iFindFirstVisibleItemPosition >= activityC9572.f30978.size()) ? -1L : ((C14113) activityC9572.f30978.get(iFindFirstVisibleItemPosition)).f44634;
            View viewFindViewByPosition = layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            int top = viewFindViewByPosition == null ? 0 : viewFindViewByPosition.getTop() - activityC9572.f30976.getPaddingTop();
            long j2 = activityC9572.f30982;
            boolean z2 = j2 != -1;
            if (z2) {
                top = activityC9572.f30980;
                activityC9572.f30982 = -1L;
                j = j2;
            }
            ArrayList arrayListM27531 = activityC9572.f30983.m27531();
            activityC9572.f30978 = arrayListM27531;
            MenuItem menuItem = activityC9572.f30979;
            if (menuItem != null) {
                menuItem.setEnabled(!arrayListM27531.isEmpty());
            }
            activityC9572.f30985.notifyDataSetChanged();
            if (!z2 && !zCanScrollVertically && iFindFirstVisibleItemPosition != -1) {
                activityC9572.f30976.scrollToPosition(0);
                return;
            }
            int i = 0;
            while (true) {
                if (i >= activityC9572.f30978.size()) {
                    z = false;
                    break;
                } else {
                    if (((C14113) activityC9572.f30978.get(i)).f44634 == j) {
                        layoutManager.scrollToPositionWithOffset(i, top);
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            if (!z2 || z) {
                return;
            }
            layoutManager.scrollToPositionWithOffset(Math.max(0, activityC9572.f30978.size() - 1), 0);
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        m40393();
        getOnBackPressedDispatcher().m19403(this, new C0624(this));
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC6591(0, this));
        C10801 c10801 = this.f30983;
        if (bundle != null && c10801.m27529().equals(bundle.getString("log_instance"))) {
            this.f30974 = bundle.getLong("expanded", -1L);
            this.f30982 = bundle.getLong("anchor_id", -1L);
            this.f30980 = bundle.getInt("anchor_offset");
        }
        this.f30976 = (C5817) m40418(R.id.MT_Protector);
        TextView textView = (TextView) m40418(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        this.f30976.m16965((View) textView);
        this.f30976.setItemAnimator(null);
        C19269 c19269 = this.f30985;
        c19269.setHasStableIds(true);
        this.f30976.setAdapter(c19269);
        c10801.m27528().m40350(this, new C24491(0, this));
    }

    @Override // l.AbstractActivityC17204, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle == null || !this.f30983.m27529().equals(bundle.getString("log_instance"))) {
            this.f30976.scrollToPosition(0);
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("bin.mt.mcp.ACTION_STARTED");
        intentFilter.addAction("bin.mt.mcp.ACTION_STOPPED");
        intentFilter.addAction("bin.mt.mcp.ACTION_FAILED_TO_START");
        C21576.m49064(this.f30977, intentFilter);
        this.f30984 = false;
        m24998();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onStop() {
        C21576.m49063(this.f30977);
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public void m24998() {
        boolean zM18242 = ServiceC6459.m18242();
        this.f56046.setSubtitle(zM18242 ? R.string.MT_Protector : R.string.MT_Protector);
        MenuItem menuItem = this.f30973;
        if (menuItem != null) {
            menuItem.setTitle(zM18242 ? R.string.MT_Protector : R.string.MT_Protector);
            this.f30973.setIcon(zM18242 ? R.drawable.MT_Protector : R.drawable.MT_Protector);
            this.f30973.setEnabled(!this.f30984);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        this.f30973 = menuItemAdd;
        menuItemAdd.setShowAsAction(2);
        m24998();
        MenuItem menuItemAdd2 = menu.add(0, R.string.MT_Protector, 1, R.string.MT_Protector);
        this.f30979 = menuItemAdd2;
        menuItemAdd2.setIcon(R.drawable.MT_Protector);
        this.f30979.setShowAsAction(2);
        this.f30979.setEnabled(!this.f30978.isEmpty());
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            if (this.f30984) {
                return true;
            }
            boolean zM18242 = ServiceC6459.m18242();
            this.f30984 = true;
            m24998();
            try {
                if (zM18242) {
                    Application applicationM49084 = C21576.m49084();
                    applicationM49084.stopService(new Intent(applicationM49084, (Class<?>) ServiceC6459.class));
                    return true;
                }
                ServiceC6459.m18252();
                return true;
            } catch (RuntimeException e) {
                this.f30984 = false;
                m24998();
                C22673.m51154((CharSequence) (e.getMessage() == null ? getString(R.string.MT_Protector) : e.getMessage()));
                return true;
            }
        }
        if (menuItem.getItemId() == R.string.MT_Protector) {
            C2361 c2361BuildDialog = buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8000(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC4353(0, this));
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m24997(ActivityC9572 activityC9572) {
        activityC9572.f30983.m27530();
        activityC9572.f30982 = -1L;
        Handler handler = activityC9572.f30972;
        RunnableC4886 runnableC4886 = activityC9572.f30987;
        handler.removeCallbacks(runnableC4886);
        runnableC4886.run();
        Iterator it = activityC9572.f30978.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((C14113) it.next()).f44634 == activityC9572.f30974) {
                z = true;
            }
        }
        if (!z) {
            activityC9572.f30974 = -1L;
        }
        activityC9572.f30976.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24988(ActivityC9572 activityC9572) {
        if (!activityC9572.f30986 || activityC9572.f30981) {
            return;
        }
        activityC9572.f30981 = true;
        activityC9572.f30972.postDelayed(activityC9572.f30987, 50L);
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f30986 = true;
        this.f30987.run();
        this.f30972.post(this.f30975);
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onPause() {
        this.f30986 = false;
        RunnableC4886 runnableC4886 = this.f30987;
        Handler handler = this.f30972;
        handler.removeCallbacks(runnableC4886);
        handler.removeCallbacks(this.f30975);
        this.f30981 = false;
        super.onPause();
    }

    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("log_instance", this.f30983.m27529());
        bundle.putLong("expanded", this.f30974);
        C0067 layoutManager = this.f30976.getLayoutManager();
        int iFindFirstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();
        View viewFindViewByPosition = layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition != null && iFindFirstVisibleItemPosition >= 0 && iFindFirstVisibleItemPosition < this.f30978.size() && this.f30976.canScrollVertically(-1)) {
            bundle.putLong("anchor_id", ((C14113) this.f30978.get(iFindFirstVisibleItemPosition)).f44634);
            bundle.putInt("anchor_offset", viewFindViewByPosition.getTop() - this.f30976.getPaddingTop());
        } else {
            long j = this.f30982;
            if (j != -1) {
                bundle.putLong("anchor_id", j);
                bundle.putInt("anchor_offset", this.f30980);
            }
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m24996(ActivityC9572 activityC9572, long j) {
        return j < 1000 ? activityC9572.getString(R.string.MT_Protector, Long.valueOf(j)) : activityC9572.getString(R.string.MT_Protector, Double.valueOf(j / 1000.0d));
    }
}
