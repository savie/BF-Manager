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

/* JADX INFO: renamed from: l.֨۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes2.dex */
public final class C1176 implements AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f4307;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ArrayList f4308;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ActivityC0848 f4309;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12362 f4310;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BaseAdapter f4311;

    public C1176(final ActivityC0848 activityC0848, C12362 c12362) {
        this.f4309 = activityC0848;
        this.f4310 = c12362;
        this.f4308 = c12362.m30840();
        C0430 c0430 = new C0430(this, activityC0848);
        this.f4311 = c0430;
        View viewM40395 = activityC0848.m40395(R.layout.MT_Protector);
        ListView listView = (ListView) viewM40395.findViewById(R.id.MT_Protector);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
        C18597.m43179(listView);
        listView.setAdapter((ListAdapter) c0430);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(activityC0848);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܰ۫ۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                final C1176 c1176 = this.f45986;
                activityC0848.m3436(new Runnable() { // from class: l.ܿ۫ۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c1176.m4339(true);
                    }
                });
            }
        });
        this.f4307 = c2361.m7999();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4347() {
        if (this.f4308.isEmpty()) {
            this.f4309.m3436(new Runnable() { // from class: l.ۛ۫ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21593.m4339(false);
                }
            });
        } else {
            DialogInterfaceC8327 dialogInterfaceC8327 = this.f4307;
            dialogInterfaceC8327.m22432();
            C5416.m16144(dialogInterfaceC8327);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m4339(boolean z) {
        C19075 c19075 = new C19075(this, this.f4309, z);
        c19075.m22924((CharSequence) ApplicationC17729.f58258.getString("dex_backup_name", "backup"));
        c19075.m22945(R.string.MT_Protector);
        c19075.m22957(6);
        c19075.m22929(R.string.MT_Protector);
        c19075.m22959();
        c19075.m22955(true);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(final AdapterView adapterView, final View view, final int i, final long j) {
        C18452 c18452 = new C18452(this.f4309, view, 0);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42994(new InterfaceC21436() { // from class: l.᩺۫ۧ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C1176.m4336(this.f78638, adapterView, view, i, j, menuItem);
                return true;
            }
        });
        c18452.mo21878();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4336(final C1176 c1176, AdapterView adapterView, View view, int i, long j, MenuItem menuItem) {
        ActivityC0848 activityC0848 = c1176.f4309;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            c1176.onItemClick(adapterView, view, i, j);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C20567 c20567 = (C20567) c1176.f4308.get(i);
            C10124 c10124 = new C10124(c1176, activityC0848, c20567);
            c10124.m22945(R.string.MT_Protector);
            c10124.m22924((CharSequence) c20567.f65866);
            c10124.m22959();
            c10124.m22955(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            final C20567 c20568 = (C20567) c1176.f4308.get(i);
            int i2 = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(activityC0848);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8008(activityC0848.getString(R.string.MT_Protector, c20568.f65866));
            c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶۫ۧ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C1176.m4338(this.f67921, c20568);
                }
            });
            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361.m8016();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m4338(C1176 c1176, C20567 c20567) {
        c20567.f65864.mo4296();
        c20567.f65865.mo4296();
        c1176.f4308.remove(c20567);
        c1176.f4311.notifyDataSetChanged();
        if (c1176.f4308.isEmpty()) {
            c1176.f4307.dismiss();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        final C20567 c20567 = (C20567) this.f4308.get(i);
        int i2 = DialogInterfaceC8327.f27315;
        ActivityC0848 activityC0848 = this.f4309;
        C2361 c2361 = new C2361(activityC0848);
        c2361.m8021(R.string.MT_Protector);
        c2361.m8008(activityC0848.getString(R.string.MT_Protector, c20567.f65866));
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘ۫ۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                C1176.m4345(this.f14121, c20567);
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m4345(C1176 c1176, C20567 c20567) {
        ActivityC0848 activityC0848 = c1176.f4309;
        try {
            c1176.f4310.m30842(c20567.f65864);
            c1176.f4307.dismiss();
            activityC0848.m3437(true);
        } catch (IOException e) {
            activityC0848.m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
