package l;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.֡ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC0567 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2346 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C23566 f2347;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C7624 f2348;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public C4647 f2349;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public final List f2350 = C5717.m15768();

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public C9186 f2351 = new C9186();

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public int f2352;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "JumpHostManager";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2347 = ViewOnClickListenerC8374.m21926(this, new C5672(1, this));
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC19619(0, this));
        C17492 c17492 = (C17492) m31016(R.id.MT_Protector);
        TextView textView = (TextView) m31016(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        C7624 c7624 = new C7624(this);
        this.f2348 = c7624;
        c7624.registerAdapterDataObserver(new C9036(this, textView));
        textView.setVisibility(this.f2350.isEmpty() ? 0 : 8);
        c17492.setAdapter(this.f2348);
        C4647 c4647 = new C4647(new C10447(this));
        this.f2349 = c4647;
        c4647.m12825(c17492);
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
        C21735.m48494(this);
        return true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23566 m2668() {
        return this.f2347;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9186 m2665() {
        return this.f2351;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m2667() {
        this.f2348.notifyItemInserted(this.f2350.size() - 1);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m2666() {
        this.f2348.notifyItemChanged(this.f2352);
    }
}
