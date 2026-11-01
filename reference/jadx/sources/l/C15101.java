package l;

import android.content.Intent;
import android.view.MenuItem;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15101 implements InterfaceC21921, InterfaceC20439, InterfaceC17547, InterfaceC18848, InterfaceC21133, InterfaceC7728, InterfaceC18189 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49321;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49322;

    public /* synthetic */ C15101(int i, Object obj) {
        this.f49321 = i;
        this.f49322 = obj;
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(int i) {
        AbstractC17902 abstractC17902;
        switch (this.f49321) {
            case 1:
                abstractC17902 = (C4604) this.f49322;
                break;
            default:
                abstractC17902 = (C9162) this.f49322;
                break;
        }
        abstractC17902.mo21455(i);
    }

    @Override // l.InterfaceC7728
    /* JADX INFO: renamed from: ۙ */
    public void mo11010(C16195 c16195) {
        ((C23421) this.f49322).f75836.suppressLayout(false);
    }

    @Override // l.InterfaceC18189
    /* JADX INFO: renamed from: ܰ */
    public String mo948() {
        return C11718.m29283((C11718) this.f49322);
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) this.f49322;
        if (menuItem.getItemId() != R.string.MT_Protector) {
            menuItem.setChecked(!menuItem.isChecked());
            ApplicationC0716.f2992.edit().putBoolean("kasb", menuItem.isChecked()).apply();
            return true;
        }
        Intent intent = new Intent(abstractActivityC12483, (Class<?>) ActivityC20293.class);
        intent.putExtra("fromDialog", true);
        abstractActivityC12483.startActivity(intent);
        return true;
    }

    @Override // l.InterfaceC6258
    /* JADX INFO: renamed from: ۙ */
    public void mo4798(AbstractC20745 abstractC20745) {
        abstractC20745.m46697((C11018) this.f49322);
    }

    @Override // l.InterfaceC20439
    /* JADX INFO: renamed from: ܰ */
    public InterfaceC21850 mo23828(int i) {
        return ((AbstractC20745) ((ArrayList) this.f49322).get(i)).mo33966("r");
    }

    @Override // l.InterfaceC18848
    /* JADX INFO: renamed from: ܰ */
    public void mo4355(AbstractC20745 abstractC20745) {
        new ViewOnClickListenerC2937((C11545) this.f49322).m8765(abstractC20745, false);
    }
}
