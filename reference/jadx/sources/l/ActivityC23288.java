package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC23288 extends AbstractActivityC17204 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f75445 = 0;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public C15828 f75446;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public ListView f75447;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C5349 f75448;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "AXmlStringsEditor";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f75446 = (C15828) new C16196(this).m38422(C15828.class);
        C7068 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C22542 c22542 = new C22542(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m19400(c22542);
        m40415();
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        this.f56046 = (C16390) m40418(R.id.MT_Protector);
        ListView listView = (ListView) m40418(android.R.id.list);
        this.f75447 = listView;
        listView.setFastScrollEnabled(true);
        m40407(this.f56046);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC8040(1, this));
        if (C14584.m35199(this)) {
            return;
        }
        if (!this.f75446.f51486) {
            new C15082(this).m8197();
            return;
        }
        ListView listView2 = this.f75447;
        C5349 c5349 = new C5349(new C17320(this));
        this.f75448 = c5349;
        listView2.setAdapter((ListAdapter) c5349);
        this.f75447.setOnScrollListener(new C12845(this));
        this.f75448.m45065(this.f75447);
        this.f75448.m36199(true);
        this.f75448.m36200();
        this.f75447.setOnItemClickListener(this);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            new C24780(this, false).m8197();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m52410();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C5388(this, this, this.f75446.f51482).m55055();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C1659(this, this);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        String str = this.f75446.f51483;
        if (str == null) {
            new C11353(this).m8197();
            return true;
        }
        if (str.equals("Error")) {
            String strM35990 = this.f75446.f51488.m35990();
            if (!strM35990.contains(getString(R.string.MT_Protector)) && !strM35990.contains(getString(R.string.MT_Protector))) {
                C22673.m51154((CharSequence) strM35990);
                return true;
            }
            m40400(strM35990, false);
            return true;
        }
        C15828 c15828 = this.f75446;
        ActivityC4300.m13685(this, c15828.f51483, c15828.f51484, null, null);
        return true;
    }

    @Override // l.ActivityC7405
    /* JADX INFO: renamed from: ᩺ */
    public final void mo3459() {
        m52410();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public void m52410() {
        if (this.f75446.f51490) {
            int i = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(this);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8000(R.string.MT_Protector);
            c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ۘۤ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ActivityC23288.f75445;
                    new C24780(this.f69497, true).m8197();
                }
            });
            c2361.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۤۘۤ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ActivityC23288.f75445;
                    this.f33673.finish();
                }
            });
            c2361.m8016();
            return;
        }
        finish();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C16574 c16574 = new C16574(this, this);
        c16574.m22945(R.string.MT_Protector);
        c16574.m22961();
        C15828 c15828 = this.f75446;
        C12558 c12558 = c15828.f51488.f48832;
        if (c15828.f51482) {
            i = c15828.f51489[i];
        }
        c15828.f51485 = i;
        c16574.m22924((CharSequence) c12558.m15441(i));
        c16574.m22955(true);
    }
}
