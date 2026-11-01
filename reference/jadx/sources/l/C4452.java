package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes2.dex */
public final class C4452 implements AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0549 f15846;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f15847;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ActivityC5677 f15848;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f15849;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BaseAdapter f15850;

    public C4452(final ActivityC5677 activityC5677, C0549 c0549) {
        this.f15848 = activityC5677;
        this.f15846 = c0549;
        this.f15847 = c0549.m2562();
        C14662 c14662 = new C14662(this, activityC5677);
        this.f15850 = c14662;
        View viewM30995 = activityC5677.m30995(R.layout.MT_Protector);
        ListView listView = (ListView) viewM30995.findViewById(R.id.MT_Protector);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
        C16754.m39314(listView);
        listView.setAdapter((ListAdapter) c14662);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(activityC5677);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛܿۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                final C4452 c4452 = this.f21072;
                activityC5677.m15669(new Runnable() { // from class: l.᩻ܿۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c4452.m12416(true);
                    }
                });
            }
        });
        this.f15849 = c8067.m21252();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12422() {
        if (this.f15847.isEmpty()) {
            this.f15848.m15669(new Runnable() { // from class: l.ܽܿۘ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53707.m12416(false);
                }
            });
        } else {
            DialogInterfaceC19356 dialogInterfaceC19356 = this.f15849;
            dialogInterfaceC19356.m44362();
            C23250.m51309(dialogInterfaceC19356);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m12416(boolean z) {
        C9723 c9723 = new C9723(this, this.f15848, z);
        c9723.m40346((CharSequence) ApplicationC0716.f2992.getString("dex_backup_name", "backup"));
        c9723.m40376(R.string.MT_Protector);
        c9723.m40336(6);
        c9723.m40363(R.string.MT_Protector);
        c9723.m40355();
        c9723.m40368(true);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(final AdapterView adapterView, final View view, final int i, final long j) {
        C16195 c16195 = new C16195(this.f15848, view, 0);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38296(new InterfaceC21133() { // from class: l.۫ܿۘ
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C4452.m12413(this.f41994, adapterView, view, i, j, menuItem);
                return true;
            }
        });
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12413(final C4452 c4452, AdapterView adapterView, View view, int i, long j, MenuItem menuItem) {
        ActivityC5677 activityC5677 = c4452.f15848;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            c4452.onItemClick(adapterView, view, i, j);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C20306 c20306 = (C20306) c4452.f15847.get(i);
            C3371 c3371 = new C3371(c4452, activityC5677, c20306);
            c3371.m40376(R.string.MT_Protector);
            c3371.m40346((CharSequence) c20306.f65781);
            c3371.m40355();
            c3371.m40368(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            final C20306 c20307 = (C20306) c4452.f15847.get(i);
            int i2 = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(activityC5677);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21261(activityC5677.getString(R.string.MT_Protector, c20307.f65781));
            c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۧܿۘ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C4452.m12415(this.f37783, c20307);
                }
            });
            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067.m21269();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12415(C4452 c4452, C20306 c20306) {
        c20306.f65779.mo24647();
        c20306.f65778.mo24647();
        c4452.f15847.remove(c20306);
        c4452.f15850.notifyDataSetChanged();
        if (c4452.f15847.isEmpty()) {
            c4452.f15849.dismiss();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        final C20306 c20306 = (C20306) this.f15847.get(i);
        int i2 = DialogInterfaceC19356.f62401;
        ActivityC5677 activityC5677 = this.f15848;
        C8067 c8067 = new C8067(activityC5677);
        c8067.m21274(R.string.MT_Protector);
        c8067.m21261(activityC5677.getString(R.string.MT_Protector, c20306.f65781));
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿܿۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                C4452.m12420(this.f55620, c20306);
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m12420(C4452 c4452, C20306 c20306) {
        ActivityC5677 activityC5677 = c4452.f15848;
        try {
            c4452.f15846.m2564(c20306.f65779);
            c4452.f15849.dismiss();
            activityC5677.m15675(true);
        } catch (IOException e) {
            activityC5677.m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
