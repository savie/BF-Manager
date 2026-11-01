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

/* JADX INFO: renamed from: l.۟᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC7718 extends AbstractActivityC12483 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25530 = 0;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C5938 f25531;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public ListView f25532;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public C10541 f25533;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "AXmlStringsEditor";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25533 = (C10541) new C16717(this).m39205(C10541.class);
        C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C4189 c4189 = new C4189(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m34905(c4189);
        m31023();
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        this.f41645 = (C6938) m31016(R.id.MT_Protector);
        ListView listView = (ListView) m31016(android.R.id.list);
        this.f25532 = listView;
        listView.setFastScrollEnabled(true);
        m31004(this.f41645);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC18832(this, 1));
        if (C5553.m15320((AbstractActivityC12483) this)) {
            return;
        }
        if (!this.f25533.f36080) {
            new C23241(this).m10243();
            return;
        }
        ListView listView2 = this.f25532;
        C5938 c5938 = new C5938(new C9130(this));
        this.f25531 = c5938;
        listView2.setAdapter((ListAdapter) c5938);
        this.f25532.setOnScrollListener(new C15480(this));
        this.f25531.m38885(this.f25532);
        this.f25531.m30532(true);
        this.f25531.m30530();
        this.f25532.setOnItemClickListener(this);
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
            new C8424(this, false).m10243();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m20367();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C21829(this, this, this.f25533.f36086).m15185();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C18301(this, this);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        String str = this.f25533.f36083;
        if (str == null) {
            new C19007(this).m10243();
            return true;
        }
        if (str.equals("Error")) {
            String strM47114 = this.f25533.f36085.m47114();
            if (!strM47114.contains(getString(R.string.MT_Protector)) && !strM47114.contains(getString(R.string.MT_Protector))) {
                C15829.m37613((CharSequence) strM47114);
                return true;
            }
            m31000(strM47114, false);
            return true;
        }
        C10541 c10541 = this.f25533;
        ActivityC21135.m47562(this, c10541.f36083, c10541.f36082, null, null);
        return true;
    }

    @Override // l.ActivityC4866
    /* JADX INFO: renamed from: ᩴ */
    public final void mo10632() {
        m20367();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m20367() {
        if (this.f25533.f36087) {
            int i = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(this);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21253(R.string.MT_Protector);
            c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨᩷ۨ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ActivityC7718.f25530;
                    new C8424(this.f5732, true).m10243();
                }
            });
            c8067.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13363(0, this));
            c8067.m21269();
            return;
        }
        finish();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C19713 c19713 = new C19713(this, this);
        c19713.m40376(R.string.MT_Protector);
        c19713.m40369();
        C10541 c10541 = this.f25533;
        C17140 c17140 = c10541.f36085.f68265;
        if (c10541.f36086) {
            i = c10541.f36084[i];
        }
        c10541.f36081 = i;
        c19713.m40346((CharSequence) c17140.m10939(i));
        c19713.m40368(true);
    }
}
