package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6094 extends AbstractViewOnLongClickListenerC5544 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C12059 f20822;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C23994 f20823;

    @Override // l.AbstractViewOnLongClickListenerC5544
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16457() {
        return true;
    }

    public C6094(Main main, View view, C23994 c23994) {
        super(main, view);
        this.f20823 = c23994;
    }

    @Override // l.AbstractViewOnLongClickListenerC5544
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16458(AbstractC11800 abstractC11800) {
        C23994.m53550(this.f20823, this, (C6094) abstractC11800);
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC5544, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f20823.f27860.m24482() || this.f20822 == null) {
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
        c18452.m42994(new C5256(1, this));
        c18452.mo21878();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17595(final C6094 c6094, MenuItem menuItem) {
        final C23994 c23994 = c6094.f20823;
        AbstractC22044 abstractC22044M35193 = C14584.m35193(c6094.f20822.f38841, new String[0]);
        int itemId = menuItem.getItemId();
        int i = 1;
        if (itemId == R.string.MT_Protector) {
            AbstractC22044 abstractC22044 = C23994.f77638;
            C20264 c20264 = new C20264(c23994, c23994.f22654, abstractC22044M35193);
            c20264.m22945(R.string.MT_Protector);
            c20264.m22924((CharSequence) abstractC22044M35193.getName());
            c20264.m22918();
            c20264.m22957(6);
            c20264.m22959();
            c20264.m22955(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            String strMo4294 = abstractC22044M35193.mo4294();
            AbstractC22044 abstractC22045 = C23994.f77638;
            Main main = c23994.f22654;
            main.m127();
            if (main.m117() != null) {
                main.m117().m46155().m23198(strMo4294);
                return;
            }
            return;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                c23994.f27860.m24476();
                return;
            }
            return;
        }
        AbstractC22044 abstractC22046 = C23994.f77638;
        C2361 c2361BuildDialog = c23994.f22654.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(C21576.m49059(R.string.MT_Protector, c6094.f19266.getText().toString()));
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC0983(c23994, abstractC22044M35193, c6094, 3));
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6179(i, c23994, c6094));
        c2361BuildDialog.m8003(new DialogInterface.OnCancelListener() { // from class: l.᩹ۖܳ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                c23994.f27860.notifyItemChanged(c6094.getBindingAdapterPosition());
            }
        });
        c2361BuildDialog.m8016();
    }
}
