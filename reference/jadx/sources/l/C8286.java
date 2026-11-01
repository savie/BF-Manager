package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes4.dex */
public final class C8286 extends AbstractViewOnLongClickListenerC22543 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18869 f28778;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C19575 f28779;

    @Override // l.AbstractViewOnLongClickListenerC22543
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2418() {
        return true;
    }

    public C8286(Main main, View view, C19575 c19575) {
        super(main, view);
        this.f28779 = c19575;
    }

    @Override // l.AbstractViewOnLongClickListenerC22543
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2419(AbstractC12554 abstractC12554) {
        C19575.m44679(this.f28779, this, (C8286) abstractC12554);
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC22543, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f28779.f21343.m31494() || this.f28778 == null) {
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
        c16195.m38296(new C12388(1, this));
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21704(final C8286 c8286, MenuItem menuItem) {
        final C19575 c19575 = c8286.f28779;
        int i = 0;
        AbstractC20745 abstractC20745M15313 = C5553.m15313(c8286.f28778.f61104, new String[0]);
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            AbstractC20745 abstractC20745 = C19575.f62891;
            C18163 c18163 = new C18163(c19575, c19575.f47137, abstractC20745M15313);
            c18163.m40376(R.string.MT_Protector);
            c18163.m40346((CharSequence) abstractC20745M15313.getName());
            c18163.m40340();
            c18163.m40336(6);
            c18163.m40355();
            c18163.m40368(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            String strMo33986 = abstractC20745M15313.mo33986();
            AbstractC20745 abstractC20746 = C19575.f62891;
            Main main = c19575.f47137;
            main.m134();
            if (main.m125() != null) {
                main.m125().m18646().m28803(strMo33986);
                return;
            }
            return;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                c19575.f21343.m31488();
                return;
            }
            return;
        }
        AbstractC20745 abstractC20747 = C19575.f62891;
        C8067 c8067BuildDialog = c19575.f47137.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(C16737.m39264(R.string.MT_Protector, c8286.f73517.getText().toString()));
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC1253(c19575, abstractC20745M15313, c8286, 2));
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23103(i, c19575, c8286));
        c8067BuildDialog.m21256(new DialogInterface.OnCancelListener() { // from class: l.ܶܺ᩹
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                c19575.f21343.notifyItemChanged(c8286.getBindingAdapterPosition());
            }
        });
        c8067BuildDialog.m21269();
    }
}
