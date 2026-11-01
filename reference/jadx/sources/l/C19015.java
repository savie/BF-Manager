package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: L5KK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19015 extends AbstractViewOnLongClickListenerC22543 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8432 f61526;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C18309 f61527;

    public C19015(Main main, View view, C8432 c8432) {
        super(main, view);
        this.f61526 = c8432;
    }

    @Override // l.AbstractViewOnLongClickListenerC22543
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2419(AbstractC12554 abstractC12554) {
        C9186 c9186 = C8432.f29282;
        C8432 c8432 = this.f61526;
        c8432.getClass();
        int bindingAdapterPosition = getBindingAdapterPosition();
        int bindingAdapterPosition2 = ((C19015) abstractC12554).getBindingAdapterPosition();
        C12665 c12665 = c8432.f21343;
        int iM31486 = (bindingAdapterPosition - c12665.m31486(c8432)) - 1;
        int iM31487 = (bindingAdapterPosition2 - c12665.m31486(c8432)) - 1;
        C23186.m51202().m32803(iM31486, iM31487);
        C23520.m51798(iM31486, iM31487, c8432.f21338);
        c12665.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C8432.f29282.mo23641(Object.class);
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC22543, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f61526.f21343.m31494() || this.f61527 == null) {
            return false;
        }
        AbstractActivityC12483 abstractActivityC12483 = this.f73515;
        View view2 = this.f73513;
        C16195 c16195 = new C16195(abstractActivityC12483, view2, 8388611);
        C2995.m8960(view2);
        c16195.m38292();
        C12418 c12418M38298 = c16195.m38298();
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38296((InterfaceC21133) new C23648(3, this));
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43732(C19015 c19015, MenuItem menuItem) {
        final C8432 c8432 = c19015.f61526;
        int itemId = menuItem.getItemId();
        int i = 1;
        if (itemId == R.string.MT_Protector) {
            C9186 c9186 = C8432.f29282;
            c8432.getClass();
            final int bindingAdapterPosition = c19015.getBindingAdapterPosition();
            C23186.m51202().m32811((bindingAdapterPosition - c8432.f21343.m31486(c8432)) - 1).m29670(c8432.f47137, new Runnable() { // from class: l.᩺᩷᩹
                @Override // java.lang.Runnable
                public final void run() {
                    c8432.f21343.notifyItemChanged(bindingAdapterPosition, 1);
                    C8432.f29282.mo23641(Object.class);
                }
            });
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C9186 c9187 = C8432.f29282;
            C8067 c8067BuildDialog = c8432.f47137.buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21261(C16737.m39264(R.string.MT_Protector, c19015.f73517.getText().toString()));
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3077(i, c8432, c19015));
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c8432.f21343.m31488();
        } else if (itemId == R.string.MT_Protector) {
            C9186 c9188 = C8432.f29282;
            c8432.getClass();
            C23186.m51202().m32811((c19015.getBindingAdapterPosition() - c8432.f21343.m31486(c8432)) - 1).m29669(c8432.f47137);
        }
    }
}
