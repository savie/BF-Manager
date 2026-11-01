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

/* JADX INFO: renamed from: l.᩷ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G135 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC20807 extends AbstractActivityC12483 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f67639 = 0;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C7401 f67641;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public TextView f67643;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public List f67640 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C17212 f67642 = new C17212();

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
    }

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "OpenMethodManager";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31016(R.string.MT_Protector);
        m31016(R.layout.MT_Protector);
        this.f41645 = (C6938) m31016(R.id.MT_Protector);
        TextView textView = (TextView) m31016(R.id.MT_Protector);
        this.f67643 = textView;
        textView.setText(R.string.MT_Protector);
        ListView listView = (ListView) m31016(android.R.id.list);
        m31004(this.f41645);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC11953(1, this));
        C7401 c7401 = new C7401(this);
        this.f67641 = c7401;
        listView.setAdapter((ListAdapter) c7401);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
        this.f67641.registerDataSetObserver(new C10224(this));
        this.f67643.setVisibility(this.f67641.getCount() == 0 ? 0 : 8);
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f67640 = C21512.m48156();
        this.f67642.m40145();
        this.f67641.notifyDataSetChanged();
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        C16195 c16195 = new C16195(this, view, 0);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38292();
        c16195.m38296(new InterfaceC21133() { // from class: l.ۡۤۚ
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC20807.m46789(this.f30310, i);
                return true;
            }
        });
        C2766.m8440(view, c16195);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46789(ActivityC20807 activityC20807, int i) {
        C21512 c21512 = (C21512) activityC20807.f67640.remove(i);
        activityC20807.f67642.m40148(i);
        C21512.m48155(c21512.m48176());
        activityC20807.f67641.notifyDataSetChanged();
    }
}
