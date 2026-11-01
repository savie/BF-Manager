package l;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11960 extends AbstractViewOnLongClickListenerC22543 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C4903 f40087;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC5609 f40088;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final TextView f40089;

    public C11960(AbstractActivityC12483 abstractActivityC12483, View view) {
        super(abstractActivityC12483, view);
        this.f40089 = (TextView) view.findViewById(R.id.MT_Protector);
    }

    @Override // l.AbstractViewOnLongClickListenerC22543
    /* JADX INFO: renamed from: ۙ */
    public final void mo2417(Resources.Theme theme) {
        super.mo2417(theme);
        this.f40089.setTextColor(C20368.f65988);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29773(AbstractC5609 abstractC5609, C4903 c4903) {
        this.f40088 = abstractC5609;
        this.f40087 = c4903;
    }

    @Override // l.AbstractViewOnLongClickListenerC22543
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2418() {
        C4903 c4903 = this.f40087;
        return (c4903 == null || c4903.m13628()) ? false : true;
    }

    @Override // l.AbstractViewOnLongClickListenerC22543
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2419(AbstractC12554 abstractC12554) {
        C4903 c4903;
        AbstractC5609 abstractC5609M31487;
        C4903 c4904;
        if (this.f40088 == null || (c4903 = this.f40087) == null || c4903.m13628()) {
            return false;
        }
        C12665 c12665 = this.f40088.f21343;
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        AbstractC5609 abstractC5609 = this.f40088;
        Integer numValueOf = null;
        if (abstractC12554 instanceof C11960) {
            C11960 c11960 = (C11960) abstractC12554;
            int bindingAdapterPosition2 = c11960.getBindingAdapterPosition();
            if (bindingAdapterPosition2 == -1 || (abstractC5609M31487 = c11960.f40088) == null || (c4904 = c11960.f40087) == null) {
                return false;
            }
            if (abstractC5609 == abstractC5609M31487) {
                C4757.m13193(this.f40087.f17191.f40385, c11960.f40088.f19213, c4904.m13628() ? null : Integer.valueOf(c11960.f40087.f17191.f40385));
                abstractC5609.m15484();
                ArrayList arrayList = abstractC5609.f21338;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C4903 c4905 = (C4903) arrayList.get(i);
                    if (!c4905.m13628() && c4905.f17191.f40385 == this.f40087.f17191.f40385) {
                        this.f40087 = c4905;
                        break;
                    }
                }
                c12665.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
                return true;
            }
            if (!c4904.m13628()) {
                numValueOf = Integer.valueOf(c11960.f40087.f17191.f40385);
            }
        } else {
            if (!(abstractC12554 instanceof C17603)) {
                return false;
            }
            C17603 c17603 = (C17603) abstractC12554;
            AbstractViewOnClickListenerC6314 abstractViewOnClickListenerC6314 = c17603.f55946;
            if (!(abstractViewOnClickListenerC6314 instanceof C9138)) {
                return false;
            }
            C9138 c9138 = (C9138) abstractViewOnClickListenerC6314;
            if (c17603.getBindingAdapterPosition() == -1) {
                return false;
            }
            C14077 c14077M34052 = C14077.m34052(c9138.f19213, C4757.m13207(), (this.itemView.getHeight() / 2.0f) + this.itemView.getY(), (c17603.itemView.getHeight() / 2.0f) + c17603.itemView.getY());
            abstractC5609M31487 = c12665.m31487(c14077M34052.f46232);
            if (abstractC5609M31487 == null || abstractC5609M31487 == abstractC5609) {
                return false;
            }
            if (c14077M34052.f46231) {
                Iterator it = abstractC5609M31487.f21338.iterator();
                while (it.hasNext()) {
                    C4903 c4906 = (C4903) ((AbstractViewOnClickListenerC10549) it.next());
                    if (!c4906.m13628()) {
                        numValueOf = Integer.valueOf(c4906.f17191.f40385);
                        break;
                    }
                }
            }
        }
        boolean z = abstractC5609M31487.f21341;
        C12665 c12666 = abstractC5609M31487.f21343;
        ArrayList arrayList2 = abstractC5609M31487.f21338;
        if (!z) {
            return false;
        }
        int iM31486 = (arrayList2.size() == 1 && ((C4903) arrayList2.get(0)).m13628()) ? c12666.m31486(abstractC5609M31487) + 1 : -1;
        C4757.m13193(this.f40087.f17191.f40385, abstractC5609M31487.f19213, numValueOf);
        abstractC5609.m15484();
        ArrayList arrayList3 = abstractC5609.f21338;
        abstractC5609M31487.m15484();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                i2 = -1;
                break;
            }
            C4903 c4907 = (C4903) arrayList2.get(i2);
            if (!c4907.m13628() && c4907.f17191.f40385 == this.f40087.f17191.f40385) {
                this.f40088 = abstractC5609M31487;
                this.f40087 = c4907;
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            c12665.m31485();
            return true;
        }
        C2786 c2786M8458 = C2786.m8458(bindingAdapterPosition, iM31486, c12666.m31486(abstractC5609M31487) + i2 + 1, (arrayList3.size() == 1 && ((C4903) arrayList3.get(0)).m13628()) ? abstractC5609.f21343.m31486(abstractC5609) + 1 : -1);
        boolean z2 = c2786M8458.f10619;
        if (z2) {
            c12665.m31489(this);
        }
        int i3 = c2786M8458.f10616;
        if (i3 != -1) {
            c12665.notifyItemRemoved(i3);
        }
        int i4 = c2786M8458.f10617;
        int i5 = c2786M8458.f10614;
        if (i4 != i5) {
            c12665.notifyItemMoved(i4, i5);
        } else {
            int i6 = c2786M8458.f10615;
            if (i6 != -1) {
                c12665.notifyItemChanged(i6);
            }
        }
        int i7 = c2786M8458.f10618;
        if (i7 != -1) {
            c12665.notifyItemInserted(i7);
        }
        if (z2) {
            c12665.m31496(this);
        }
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC22543, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C4903 c4903;
        AbstractC5609 abstractC5609 = this.f40088;
        if (abstractC5609 == null || abstractC5609.f21343.m31494() || (c4903 = this.f40087) == null || c4903.m13628()) {
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
        c16195.m38296(new C9372(this));
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29772(C11960 c11960, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            c11960.f40087.f17191.mo4703(c11960.f40088.f47137);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            final AbstractC5609 abstractC5609 = c11960.f40088;
            abstractC5609.getClass();
            final C4903 c4903 = c11960.f40087;
            if (c4903 == null || c4903.m13628()) {
                return;
            }
            C8067 c8067BuildDialog = abstractC5609.f47137.buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21261(C16737.m39264(R.string.MT_Protector, c11960.f73517.getText().toString()));
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫۟᩹
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2;
                    AbstractC5609 abstractC56010 = abstractC5609;
                    C4903 c4904 = c4903;
                    abstractC56010.getClass();
                    int i3 = c4904.f17191.f40385;
                    synchronized (C5717.class) {
                        Iterator it = C5717.m15769().iterator();
                        i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                                break;
                            } else if (((AbstractC12068) it.next()).f40385 == i3) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (i2 == -1) {
                        abstractC56010.f21343.m31485();
                        return;
                    }
                    C5717.m15761(i2);
                    C4757.m13186();
                    abstractC56010.m15484();
                    abstractC56010.f21343.m31485();
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c11960.f40088.f21343.m31488();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            AbstractC5609 abstractC56010 = c11960.f40088;
            C4903 c4904 = c11960.f40087;
            abstractC56010.getClass();
            AbstractC12068 abstractC12068 = c4904.f17191;
            C12628 c12628 = new C12628(abstractC56010.f47137);
            c12628.m31413(abstractC12068.getName());
            C0690 icon = abstractC12068.getIcon();
            AbstractC16214 abstractC16214 = C0690.f2885;
            c12628.m31414(new C14745(icon, 0));
            c12628.m31419("open-ns");
            c12628.m31411();
            c12628.m31412(abstractC12068.f40385);
            c12628.m31418();
        }
    }
}
