package l;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.֡᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC0673 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2550 = 0;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public C11999 f2551;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public C20956 f2553;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public int f2554;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C4402 f2556;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public final List f2555 = C7606.m20795();

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public C17930 f2552 = new C17930();

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "JumpHostManager";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2553 = ViewOnClickListenerC11499.m28899(this, new C24159(this));
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC3673(4, this));
        C25227 c25227 = (C25227) m40418(R.id.MT_Protector);
        TextView textView = (TextView) m40418(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        C4402 c4402 = new C4402(this);
        this.f2556 = c4402;
        c4402.registerAdapterDataObserver(new C6640(this, textView));
        textView.setVisibility(this.f2555.isEmpty() ? 0 : 8);
        c25227.setAdapter(this.f2556);
        C11999 c11999 = new C11999(new C24540(this));
        this.f2551 = c11999;
        c11999.m30173(c25227);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(R.drawable.MT_Protector);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.MT_Protector) {
            return false;
        }
        C23794.m53072(this);
        return true;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C20956 m2917() {
        return this.f2553;
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C17930 m2915() {
        return this.f2552;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final void m2918() {
        this.f2556.notifyItemInserted(this.f2555.size() - 1);
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final void m2916() {
        this.f2556.notifyItemChanged(this.f2554);
    }
}
