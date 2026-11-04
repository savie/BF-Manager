package l;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G135 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC15090 extends AbstractActivityC17204 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f49247 = 0;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public TextView f49249;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C19566 f49251;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public List f49248 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C2375 f49250 = new C2375();

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
    }

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "OpenMethodManager";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40418(R.string.MT_Protector);
        m40418(R.layout.MT_Protector);
        this.f56046 = (C16390) m40418(R.id.MT_Protector);
        TextView textView = (TextView) m40418(R.id.MT_Protector);
        this.f49249 = textView;
        textView.setText(R.string.MT_Protector);
        ListView listView = (ListView) m40418(android.R.id.list);
        m40407(this.f56046);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC2162(1, this));
        C19566 c19566 = new C19566(this);
        this.f49251 = c19566;
        listView.setAdapter((ListAdapter) c19566);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
        this.f49251.registerDataSetObserver(new C22550(this));
        this.f49249.setVisibility(this.f49251.getCount() == 0 ? 0 : 8);
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f49248 = C8969.m23948();
        C2375 c2375 = this.f49250;
        int i = c2375.f7644;
        Object[] objArr = c2375.f7642;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        c2375.f7644 = 0;
        c2375.f7643 = false;
        this.f49251.notifyDataSetChanged();
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        C18452 c18452 = new C18452(this, view, 0);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42997();
        c18452.m42994(new InterfaceC21436() { // from class: l.ۤۘᩴ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC15090.m36348(this.f33699, i);
                return true;
            }
        });
        C22744.m51282(view, c18452);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36348(ActivityC15090 activityC15090, int i) {
        C8969 c8969 = (C8969) activityC15090.f49248.remove(i);
        C2375 c2375 = activityC15090.f49250;
        c2375.getClass();
        C8341.m22448(c2375, i);
        C8969.m23967(c8969.m23974());
        activityC15090.f49251.notifyDataSetChanged();
    }
}
