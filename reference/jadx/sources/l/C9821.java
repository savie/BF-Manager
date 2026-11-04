package l;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4ZV */
/* JADX INFO: loaded from: classes4.dex */
public final class C9821 extends AbstractViewOnLongClickListenerC5544 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C19462 f31632;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0873 f31633;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C18772 f31634;

    public C9821(Main main, View view, C0873 c0873) {
        super(main, view);
        C19462 c19462 = (C19462) view.findViewById(R.id.MT_Protector);
        this.f31632 = c19462;
        c19462.m45008(C3296.f10738);
        c19462.m45009(C3296.f10738);
        this.f31633 = c0873;
    }

    @Override // l.AbstractViewOnLongClickListenerC5544
    /* JADX INFO: renamed from: ۙ */
    public final void mo8595(Resources.Theme theme) {
        super.mo8595(theme);
        int i = C3296.f10738;
        C19462 c19462 = this.f31632;
        c19462.m45008(i);
        c19462.m45009(C3296.f10738);
    }

    @Override // l.AbstractViewOnLongClickListenerC5544
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16457() {
        C18772 c18772 = this.f31634;
        return (c18772 == null || c18772.f60973 == null) ? false : true;
    }

    @Override // l.AbstractViewOnLongClickListenerC5544
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16458(AbstractC11800 abstractC11800) {
        C9821 c9821 = (C9821) abstractC11800;
        if (!mo16457() || !c9821.mo16457()) {
            return false;
        }
        C0873.m3561(this.f31633, this, c9821);
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC5544, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C18772 c18772;
        if (this.f31633.f27860.m24482() || (c18772 = this.f31634) == null || c18772.f60973 == null) {
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
        c18452.m42994(new C22200(this));
        c18452.mo21878();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25597(final C9821 c9821, MenuItem menuItem) {
        TextView textView = c9821.f19266;
        final C0873 c0873 = c9821.f31633;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            C25291 c25291 = c9821.f31634.f60973;
            int i = C0873.f3259;
            C7585 c7585 = new C7585(c0873.f22654, c25291);
            c7585.m22945(R.string.MT_Protector);
            c7585.m22924((CharSequence) c25291.f81686);
            c7585.m22958(c25291.f81685.toString());
            c7585.m22922(C3296.f10779);
            c7585.m22930();
            c7585.m22957(6);
            c7585.m22959();
            c7585.m22955(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            int i2 = C0873.f3259;
            C2361 c2361BuildDialog = c0873.f22654.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8008(C21576.m49059(R.string.MT_Protector, textView.getText().toString()));
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ۖܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C0873.m3564(c0873, c9821);
                }
            });
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016();
            return;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                c0873.f27860.m24476();
                return;
            }
            return;
        }
        int i3 = C0873.f3259;
        C2361 c2361BuildDialog2 = c0873.f22654.buildDialog();
        c2361BuildDialog2.m8021(R.string.MT_Protector);
        c2361BuildDialog2.m8008(C21576.m49059(R.string.MT_Protector, textView.getText().toString()));
        c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿۖܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C0873.m3560(c0873, c9821);
            }
        });
        c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog2.m8016();
    }
}
