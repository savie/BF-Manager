package l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A91T */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC17639 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public static final C0107 f57995 = new C0107();

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public List f57996 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public C3072 f57997;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public C25227 f57998;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC0726 f57999;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public TextView f58000;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "TutorialListActivity";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC17724(3, this));
        this.f57999 = C23302.m52413((Context) this, true);
        this.f57997 = (C3072) m40418(R.id.MT_Protector);
        this.f57998 = (C25227) m40418(R.id.MT_Protector);
        TextView textView = (TextView) m40418(R.id.MT_Protector);
        this.f58000 = textView;
        textView.setText(R.string.MT_Protector);
        this.f58000.setOnClickListener(new View.OnClickListener() { // from class: l.ۚܰ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0107 c0107 = ActivityC17639.f57995;
                new C25099(this.f19708, true).m8197();
            }
        });
        this.f57998.setAdapter(new C16893(this));
        new C25099(this, false).m8197();
        this.f57997.m10020(new InterfaceC17242() { // from class: l.֫ܰ᩻
            @Override // l.InterfaceC17242
            /* JADX INFO: renamed from: ۫ */
            public final void mo4897() {
                C0107 c0107 = ActivityC17639.f57995;
                new C25099(this.f6633, true).m8197();
            }
        });
        f57995.m1212(this, new InterfaceC18006() { // from class: l.ۧܰ᩻
            @Override // l.InterfaceC18006
            /* JADX INFO: renamed from: ۙ */
            public final void mo1736(Object obj) {
                C0107 c0107 = ActivityC17639.f57995;
                new C25099(this.f37820, true).m8197();
            }
        });
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd.setIcon(R.drawable.MT_Protector);
        menuItemAdd.setShowAsAction(2);
        MenuItem menuItemAdd2 = menu.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd2.setIcon(R.drawable.MT_Protector);
        menuItemAdd2.setShowAsAction(2);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            if (!C18978.m44079()) {
                C22673.m51152(R.string.MT_Protector);
                new ViewOnClickListenerC16544(this);
                return true;
            }
            startActivity(new Intent(this, (Class<?>) ActivityC3910.class));
            return true;
        }
        if (itemId != R.string.MT_Protector) {
            return false;
        }
        if (!C18978.m44079()) {
            C22673.m51152(R.string.MT_Protector);
            new ViewOnClickListenerC16544(this);
            return true;
        }
        startActivity(new Intent(this, (Class<?>) ActivityC21369.class));
        return true;
    }
}
