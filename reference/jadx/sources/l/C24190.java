package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5KK */
/* JADX INFO: loaded from: classes.dex */
public final class C24190 extends AbstractViewOnLongClickListenerC5544 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C4052 f78335;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C6290 f78336;

    public C24190(Main main, View view, C4052 c4052) {
        super(main, view);
        this.f78335 = c4052;
    }

    @Override // l.AbstractViewOnLongClickListenerC5544
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16458(AbstractC11800 abstractC11800) {
        C17930 c17930 = C4052.f13791;
        C4052 c4052 = this.f78335;
        c4052.getClass();
        int bindingAdapterPosition = getBindingAdapterPosition();
        int bindingAdapterPosition2 = ((C24190) abstractC11800).getBindingAdapterPosition();
        C9271 c9271 = c4052.f27860;
        int iM24474 = (bindingAdapterPosition - c9271.m24474(c4052)) - 1;
        int iM24475 = (bindingAdapterPosition2 - c9271.m24474(c4052)) - 1;
        C22961.m51808().m15310(iM24474, iM24475);
        C9911.m25734(iM24474, iM24475, c4052.f27858);
        c9271.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C4052.f13791.mo40348(Object.class);
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC5544, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f78335.f27860.m24482() || this.f78336 == null) {
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
        c18452.m42994(new C17299(3, this));
        c18452.mo21878();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54173(final C24190 c24190, MenuItem menuItem) {
        final C4052 c4052 = c24190.f78335;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            C17930 c17930 = C4052.f13791;
            c4052.getClass();
            final int bindingAdapterPosition = c24190.getBindingAdapterPosition();
            C22961.m51808().m15320((bindingAdapterPosition - c4052.f27860.m24474(c4052)) - 1).m25112(c4052.f22654, new Runnable() { // from class: l.ۗۡܳ
                @Override // java.lang.Runnable
                public final void run() {
                    c4052.f27860.notifyItemChanged(bindingAdapterPosition, 1);
                    C4052.f13791.mo40348(Object.class);
                }
            });
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C17930 c17931 = C4052.f13791;
            C2361 c2361BuildDialog = c4052.f22654.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8008(C21576.m49059(R.string.MT_Protector, c24190.f19266.getText().toString()));
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹ۡܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C4052 c4053 = c4052;
                    c4053.getClass();
                    int bindingAdapterPosition2 = c24190.getBindingAdapterPosition();
                    C9271 c9271 = c4053.f27860;
                    int iM24474 = (bindingAdapterPosition2 - c9271.m24474(c4053)) - 1;
                    ArrayList arrayList = c4053.f27858;
                    arrayList.remove(iM24474);
                    C22961.m51808().m15309(iM24474);
                    if (arrayList.size() > 0) {
                        c9271.notifyItemRangeRemoved(bindingAdapterPosition2, 1);
                    } else {
                        c9271.notifyItemRangeRemoved(bindingAdapterPosition2 - 1, 2);
                    }
                    C4052.f13791.mo40348(Object.class);
                }
            });
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c4052.f27860.m24476();
        } else if (itemId == R.string.MT_Protector) {
            C17930 c17932 = C4052.f13791;
            c4052.getClass();
            C22961.m51808().m15320((c24190.getBindingAdapterPosition() - c4052.f27860.m24474(c4052)) - 1).m25111(c4052.f22654);
        }
    }
}
