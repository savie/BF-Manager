package l;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.app.H5PayActivity$$ExternalSyntheticLambda0;

/* JADX INFO: renamed from: l.֡ܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4ZV */
/* JADX INFO: loaded from: classes3.dex */
public final class C0524 extends AbstractViewOnLongClickListenerC22543 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21901 f2213;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16753 f2214;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C20281 f2215;

    public C0524(Main main, View view, C16753 c16753) {
        super(main, view);
        C21901 c21901 = (C21901) view.findViewById(R.id.MT_Protector);
        this.f2213 = c21901;
        c21901.m48701(C20368.f65970);
        c21901.m48702(C20368.f65970);
        this.f2214 = c16753;
    }

    @Override // l.AbstractViewOnLongClickListenerC22543
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2417(Resources.Theme theme) {
        super.mo2417(theme);
        int i = C20368.f65970;
        C21901 c21901 = this.f2213;
        c21901.m48701(i);
        c21901.m48702(C20368.f65970);
    }

    @Override // l.AbstractViewOnLongClickListenerC22543
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2418() {
        C20281 c20281 = this.f2215;
        return (c20281 == null || c20281.f65727 == null) ? false : true;
    }

    @Override // l.AbstractViewOnLongClickListenerC22543
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2419(AbstractC12554 abstractC12554) {
        C0524 c0524 = (C0524) abstractC12554;
        if (!mo2418() || !c0524.mo2418()) {
            return false;
        }
        C16753.m39307(this.f2214, this, c0524);
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC22543, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C20281 c20281;
        if (this.f2214.f21343.m31494() || (c20281 = this.f2215) == null || c20281.f65727 == null) {
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
        c16195.m38296(new H5PayActivity$$ExternalSyntheticLambda0(this));
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2415(final C0524 c0524, MenuItem menuItem) {
        TextView textView = c0524.f73517;
        final C16753 c16753 = c0524.f2214;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            C18295 c18295 = c0524.f2215.f65727;
            int i = C16753.f53636;
            C16048 c16048 = new C16048(c16753.f47137, c18295);
            c16048.m40376(R.string.MT_Protector);
            c16048.m40346((CharSequence) c18295.f58377);
            c16048.m40360(c18295.f58380.toString());
            c16048.m40344(C20368.f66009);
            c16048.m40354();
            c16048.m40336(6);
            c16048.m40355();
            c16048.m40368(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            int i2 = C16753.f53636;
            C8067 c8067BuildDialog = c16753.f47137.buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21261(C16737.m39264(R.string.MT_Protector, textView.getText().toString()));
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ܺ᩹
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C16753.m39310(c16753, c0524);
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269();
            return;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                c16753.f21343.m31488();
                return;
            }
            return;
        }
        int i3 = C16753.f53636;
        C8067 c8067BuildDialog2 = c16753.f47137.buildDialog();
        c8067BuildDialog2.m21274(R.string.MT_Protector);
        c8067BuildDialog2.m21261(C16737.m39264(R.string.MT_Protector, textView.getText().toString()));
        c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20418(3, c16753, c0524));
        c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog2.m21269();
    }
}
