package l;

import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C7759 implements InterfaceC12936 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20327 f25543;

    @Override // l.InterfaceC12936
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String mo16304() {
        return null;
    }

    @Override // l.InterfaceC12936
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ boolean mo16306() {
        return false;
    }

    @Override // l.InterfaceC12936
    /* JADX INFO: renamed from: ۙ */
    public final void mo16305(final Main main) {
        C20327 c20327 = this.f25543;
        final String strM46703 = c20327.m46703("ad_title", null);
        String strM46704 = c20327.m46703("ad_msg", null);
        String strM46705 = c20327.m46703("ad_button", null);
        String strM46706 = c20327.m46703("ad_copy_text", null);
        String strM46707 = c20327.m46703("ad_open_url", null);
        C2361 c2361BuildDialog = main.buildDialog();
        c2361BuildDialog.m8024(strM46703);
        c2361BuildDialog.m8008(strM46704);
        c2361BuildDialog.m8019(strM46705, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8025("不再显示", (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8012(false);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        C21232.m48398(dialogInterfaceC8327M8016);
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new ViewOnClickListenerC6657(strM46707, main, strM46706));
        dialogInterfaceC8327M8016.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ܿ۠ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2361 c2361BuildDialog2 = main.buildDialog();
                c2361BuildDialog2.m8021(R.string.MT_Protector);
                c2361BuildDialog2.m8008("是否从工具中隐藏「" + strM46703 + "」？");
                final C7759 c7759 = this.f59443;
                final DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M8016;
                c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡۠ܳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ApplicationC17729.f58258.edit().putString("show_ad_in_tools", c7759.f25543.m46703("ad_hide_obj", "")).apply();
                        dialogInterfaceC8327.dismiss();
                        C1750.m6151();
                    }
                });
                c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361BuildDialog2.m8016();
            }
        });
        dialogInterfaceC8327M8016.m22440().setTextColor(C3296.f10779);
        dialogInterfaceC8327M8016.m22440().setAlpha(0.7f);
        Window windowM22435 = dialogInterfaceC8327M8016.m22435();
        if (windowM22435 != null) {
            View viewFindViewById = windowM22435.findViewById(android.R.id.message);
            if (viewFindViewById instanceof TextView) {
                TextView textView = (TextView) viewFindViewById;
                textView.setTextIsSelectable(true);
                textView.setLineSpacing(0.0f, 1.2f);
            }
        }
    }

    public C7759(C20327 c20327) {
        this.f25543 = c20327;
    }

    @Override // l.InterfaceC12936
    public final String getName() {
        return this.f25543.m46703("ad_title", "");
    }

    @Override // l.InterfaceC12936
    /* JADX INFO: renamed from: ᩷ */
    public final C11983 mo16307() {
        return C20613.f66105.f66117;
    }
}
