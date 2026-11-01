package l;

import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C7705 implements InterfaceC4302 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8416 f25486;

    @Override // l.InterfaceC4302
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String mo6560() {
        return null;
    }

    @Override // l.InterfaceC4302
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ boolean mo6562() {
        return false;
    }

    @Override // l.InterfaceC4302
    /* JADX INFO: renamed from: ۙ */
    public final void mo6561(final Main main) {
        C8416 c8416 = this.f25486;
        final String strM22055 = c8416.m22055("ad_title", null);
        String strM22056 = c8416.m22055("ad_msg", null);
        String strM22057 = c8416.m22055("ad_button", null);
        String strM22058 = c8416.m22055("ad_copy_text", null);
        String strM22059 = c8416.m22055("ad_open_url", null);
        C8067 c8067BuildDialog = main.buildDialog();
        c8067BuildDialog.m21277(strM22055);
        c8067BuildDialog.m21261(strM22056);
        c8067BuildDialog.m21272(strM22057, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21278("不再显示", (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21265(false);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        C8875.m23019(dialogInterfaceC19356M21269);
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new ViewOnClickListenerC19700(strM22059, main, strM22058));
        dialogInterfaceC19356M21269.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.ۡ᩶᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8067 c8067BuildDialog2 = main.buildDialog();
                c8067BuildDialog2.m21274(R.string.MT_Protector);
                c8067BuildDialog2.m21261("是否从工具中隐藏「" + strM22055 + "」？");
                final C7705 c7705 = this.f31049;
                final DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M21269;
                c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۤ᩶᩹
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ApplicationC0716.f2992.edit().putString("show_ad_in_tools", c7705.f25486.m22055("ad_hide_obj", "")).apply();
                        dialogInterfaceC19356.dismiss();
                        C11359.m28442();
                    }
                });
                c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067BuildDialog2.m21269();
            }
        });
        dialogInterfaceC19356M21269.m44361().setTextColor(C20368.f66009);
        dialogInterfaceC19356M21269.m44361().setAlpha(0.7f);
        Window windowM44378 = dialogInterfaceC19356M21269.m44378();
        if (windowM44378 != null) {
            View viewFindViewById = windowM44378.findViewById(android.R.id.message);
            if (viewFindViewById instanceof TextView) {
                TextView textView = (TextView) viewFindViewById;
                textView.setTextIsSelectable(true);
                textView.setLineSpacing(0.0f, 1.2f);
            }
        }
    }

    public C7705(C8416 c8416) {
        this.f25486 = c8416;
    }

    @Override // l.InterfaceC4302
    public final String getName() {
        return this.f25486.m22055("ad_title", "");
    }

    @Override // l.InterfaceC4302
    /* JADX INFO: renamed from: ܰ */
    public final C14600 mo6563() {
        return C0690.f2904.f2944;
    }
}
