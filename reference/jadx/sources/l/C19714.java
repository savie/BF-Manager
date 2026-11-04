package l;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19714 extends AbstractViewOnLongClickListenerC5544 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C10763 f63451;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC13001 f63452;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final TextView f63453;

    public C19714(AbstractActivityC17204 abstractActivityC17204, View view) {
        super(abstractActivityC17204, view);
        this.f63453 = (TextView) view.findViewById(R.id.MT_Protector);
    }

    @Override // l.AbstractViewOnLongClickListenerC5544
    /* JADX INFO: renamed from: ۙ */
    public final void mo8595(Resources.Theme theme) {
        super.mo8595(theme);
        this.f63453.setTextColor(C3296.f10741);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45407(AbstractC13001 abstractC13001, C10763 c10763) {
        this.f63452 = abstractC13001;
        this.f63451 = c10763;
    }

    @Override // l.AbstractViewOnLongClickListenerC5544
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16457() {
        C10763 c10763 = this.f63451;
        return (c10763 == null || c10763.m27432()) ? false : true;
    }

    @Override // l.AbstractViewOnLongClickListenerC5544
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16458(AbstractC11800 abstractC11800) {
        C10763 c10763;
        AbstractC13001 abstractC13001M24475;
        C10763 c10764;
        if (this.f63452 == null || (c10763 = this.f63451) == null || c10763.m27432()) {
            return false;
        }
        C9271 c9271 = this.f63452.f27860;
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        AbstractC13001 abstractC13001 = this.f63452;
        Integer numValueOf = null;
        if (abstractC11800 instanceof C19714) {
            C19714 c19714 = (C19714) abstractC11800;
            int bindingAdapterPosition2 = c19714.getBindingAdapterPosition();
            if (bindingAdapterPosition2 == -1 || (abstractC13001M24475 = c19714.f63452) == null || (c10764 = c19714.f63451) == null) {
                return false;
            }
            if (abstractC13001 == abstractC13001M24475) {
                C19518.m45041(this.f63451.f34168.f1127, c19714.f63452.f41656, c10764.m27432() ? null : Integer.valueOf(c19714.f63451.f34168.f1127));
                abstractC13001.m32418();
                ArrayList arrayList = abstractC13001.f27858;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C10763 c10765 = (C10763) arrayList.get(i);
                    if (!c10765.m27432() && c10765.f34168.f1127 == this.f63451.f34168.f1127) {
                        this.f63451 = c10765;
                        break;
                    }
                }
                c9271.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
                return true;
            }
            if (!c10764.m27432()) {
                numValueOf = Integer.valueOf(c19714.f63451.f34168.f1127);
            }
        } else {
            if (!(abstractC11800 instanceof C2560)) {
                return false;
            }
            C2560 c2560 = (C2560) abstractC11800;
            AbstractViewOnClickListenerC8526 abstractViewOnClickListenerC8526 = c2560.f8229;
            if (!(abstractViewOnClickListenerC8526 instanceof C14492)) {
                return false;
            }
            C14492 c14492 = (C14492) abstractViewOnClickListenerC8526;
            if (c2560.getBindingAdapterPosition() == -1) {
                return false;
            }
            C22698 c22698M51173 = C22698.m51173(c14492.f41656, C19518.m45054(), (this.itemView.getHeight() / 2.0f) + this.itemView.getY(), (c2560.itemView.getHeight() / 2.0f) + c2560.itemView.getY());
            abstractC13001M24475 = c9271.m24475(c22698M51173.f73687);
            if (abstractC13001M24475 == null || abstractC13001M24475 == abstractC13001) {
                return false;
            }
            if (c22698M51173.f73686) {
                Iterator it = abstractC13001M24475.f27858.iterator();
                while (it.hasNext()) {
                    C10763 c10766 = (C10763) ((AbstractViewOnClickListenerC21206) it.next());
                    if (!c10766.m27432()) {
                        numValueOf = Integer.valueOf(c10766.f34168.f1127);
                        break;
                    }
                }
            }
        }
        boolean z = abstractC13001M24475.f27855;
        C9271 c9272 = abstractC13001M24475.f27860;
        ArrayList arrayList2 = abstractC13001M24475.f27858;
        if (!z) {
            return false;
        }
        int iM24474 = (arrayList2.size() == 1 && ((C10763) arrayList2.get(0)).m27432()) ? c9272.m24474(abstractC13001M24475) + 1 : -1;
        C19518.m45041(this.f63451.f34168.f1127, abstractC13001M24475.f41656, numValueOf);
        abstractC13001.m32418();
        ArrayList arrayList3 = abstractC13001.f27858;
        abstractC13001M24475.m32418();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                i2 = -1;
                break;
            }
            C10763 c10767 = (C10763) arrayList2.get(i2);
            if (!c10767.m27432() && c10767.f34168.f1127 == this.f63451.f34168.f1127) {
                this.f63452 = abstractC13001M24475;
                this.f63451 = c10767;
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            c9271.m24487();
            return true;
        }
        C15238 c15238M36580 = C15238.m36580(bindingAdapterPosition, iM24474, c9272.m24474(abstractC13001M24475) + i2 + 1, (arrayList3.size() == 1 && ((C10763) arrayList3.get(0)).m27432()) ? abstractC13001.f27860.m24474(abstractC13001) + 1 : -1);
        boolean z2 = c15238M36580.f49718;
        if (z2) {
            c9271.m24479(this);
        }
        int i3 = c15238M36580.f49719;
        if (i3 != -1) {
            c9271.notifyItemRemoved(i3);
        }
        int i4 = c15238M36580.f49717;
        int i5 = c15238M36580.f49721;
        if (i4 != i5) {
            c9271.notifyItemMoved(i4, i5);
        } else {
            int i6 = c15238M36580.f49716;
            if (i6 != -1) {
                c9271.notifyItemChanged(i6);
            }
        }
        int i7 = c15238M36580.f49720;
        if (i7 != -1) {
            c9271.notifyItemInserted(i7);
        }
        if (z2) {
            c9271.m24485(this);
        }
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC5544, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C10763 c10763;
        AbstractC13001 abstractC13001 = this.f63452;
        if (abstractC13001 == null || abstractC13001.f27860.m24482() || (c10763 = this.f63451) == null || c10763.m27432()) {
            return false;
        }
        AbstractActivityC17204 abstractActivityC17204 = this.f19264;
        View view2 = this.f19263;
        C18452 c18452 = new C18452(abstractActivityC17204, view2, 8388611);
        C10378.m26694(view2);
        c18452.m42997();
        C9898 c9898M42995 = c18452.m42995();
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42994(new C19411(2, this));
        c18452.mo21878();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45406(C19714 c19714, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            c19714.f63451.f34168.mo1328(c19714.f63452.f22654);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            final AbstractC13001 abstractC13001 = c19714.f63452;
            abstractC13001.getClass();
            final C10763 c10763 = c19714.f63451;
            if (c10763 == null || c10763.m27432()) {
                return;
            }
            C2361 c2361BuildDialog = abstractC13001.f22654.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8008(C21576.m49059(R.string.MT_Protector, c19714.f19266.getText().toString()));
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬֨ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2;
                    AbstractC13001 abstractC13002 = abstractC13001;
                    C10763 c10764 = c10763;
                    abstractC13002.getClass();
                    int i3 = c10764.f34168.f1127;
                    synchronized (C7606.class) {
                        Iterator it = C7606.m20791().iterator();
                        i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                                break;
                            } else if (((AbstractC0148) it.next()).f1127 == i3) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (i2 == -1) {
                        abstractC13002.f27860.m24487();
                        return;
                    }
                    C7606.m20784(i2);
                    C19518.m45055();
                    abstractC13002.m32418();
                    abstractC13002.f27860.m24487();
                }
            });
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c19714.f63452.f27860.m24476();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            AbstractC13001 abstractC13002 = c19714.f63452;
            C10763 c10764 = c19714.f63451;
            abstractC13002.getClass();
            AbstractC0148 abstractC0148 = c10764.f34168;
            C0364 c0364 = new C0364(abstractC13002.f22654);
            c0364.m2131(abstractC0148.getName());
            C20613 icon = abstractC0148.getIcon();
            AbstractC23597 abstractC23597 = C20613.f66104;
            c0364.m2132(new C9312(icon, 0));
            c0364.m2137("open-ns");
            c0364.m2129();
            c0364.m2130(abstractC0148.f1127);
            c0364.m2136();
        }
    }
}
