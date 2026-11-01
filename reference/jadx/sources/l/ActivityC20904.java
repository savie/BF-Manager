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

/* JADX INFO: renamed from: l.᩷۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A91T */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC20904 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public static final C16609 f67929 = new C16609();

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C6018 f67930;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public TextView f67931;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public AbstractC14883 f67932;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public List f67933 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public C17492 f67934;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "TutorialListActivity";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC13894(2, this));
        this.f67932 = C0091.m1034((Context) this, true);
        this.f67930 = (C6018) m31016(R.id.MT_Protector);
        this.f67934 = (C17492) m31016(R.id.MT_Protector);
        TextView textView = (TextView) m31016(R.id.MT_Protector);
        this.f67931 = textView;
        textView.setText(R.string.MT_Protector);
        this.f67931.setOnClickListener(new View.OnClickListener() { // from class: l.۠۬᩺
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16609 c16609 = ActivityC20904.f67929;
                new C10321(this.f28564, true).m10243();
            }
        });
        this.f67934.setAdapter(new C7498(this));
        new C10321(this, false).m10243();
        this.f67930.m16334(new InterfaceC16602() { // from class: l.᩵۬᩺
            @Override // l.InterfaceC16602
            /* JADX INFO: renamed from: ۖ */
            public final void mo2119() {
                C16609 c16609 = ActivityC20904.f67929;
                new C10321(this.f62722, true).m10243();
            }
        });
        f67929.m39052(this, new InterfaceC0380() { // from class: l.ۡ۬᩺
            @Override // l.InterfaceC0380
            /* JADX INFO: renamed from: ۙ */
            public final void mo1825(Object obj) {
                C16609 c16609 = ActivityC20904.f67929;
                new C10321(this.f30561, true).m10243();
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
            if (!C1709.m5692()) {
                C15829.m37611(R.string.MT_Protector);
                new ViewOnClickListenerC19680(this);
                return true;
            }
            startActivity(new Intent(this, (Class<?>) ActivityC23376.class));
            return true;
        }
        if (itemId != R.string.MT_Protector) {
            return false;
        }
        if (!C1709.m5692()) {
            C15829.m37611(R.string.MT_Protector);
            new ViewOnClickListenerC19680(this);
            return true;
        }
        startActivity(new Intent(this, (Class<?>) ActivityC14555.class));
        return true;
    }
}
