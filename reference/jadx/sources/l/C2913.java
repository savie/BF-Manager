package l;

import android.app.Application;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import bin.mt.plus.R;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/* JADX INFO: renamed from: l.ۗ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2913 extends AbstractC15260 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f10961;

    public C2913(C17367 c17367) {
        super(6);
        this.f10961 = c17367.readInt();
    }

    @Override // l.AbstractC15260
    /* JADX INFO: renamed from: ۙ */
    public final void mo4217(AbstractActivityC12483 abstractActivityC12483) {
        if (!C1709.m5692()) {
            C15829.m37611(R.string.MT_Protector);
            new ViewOnClickListenerC19680(abstractActivityC12483);
            return;
        }
        PopupWindow popupWindow = new PopupWindow(abstractActivityC12483);
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        ViewOnClickListenerC14204 viewOnClickListenerC14204 = new ViewOnClickListenerC14204(this, abstractActivityC12483, popupWindow, 0);
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(viewOnClickListenerC14204);
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(viewOnClickListenerC14204);
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        final Window window = abstractActivityC12483.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.7f;
        window.addFlags(2);
        window.setAttributes(attributes);
        popupWindow.setWidth(-1);
        popupWindow.setHeight(-2);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setContentView(viewM30995);
        popupWindow.setAnimationStyle(R.style.MT_Protector);
        popupWindow.showAtLocation(window.getDecorView(), 81, 0, 0);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.֫֨᩺
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                Window window2 = window;
                WindowManager.LayoutParams attributes2 = window2.getAttributes();
                attributes2.alpha = 1.0f;
                window2.clearFlags(2);
                window2.setAttributes(attributes2);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8716(C2913 c2913, AbstractActivityC12483 abstractActivityC12483, PopupWindow popupWindow, View view) {
        int id = view.getId();
        int i = c2913.f10961;
        C9186 c9186 = C12792.f42615;
        C13465.m32966(abstractActivityC12483, "activity");
        C20364.f65940 = null;
        if (id == R.id.MT_Protector) {
            popupWindow.dismiss();
            C9186 c9187 = C12792.f42615;
            c9187.mo23642((Object) null);
            c9187.m44958((InterfaceC1423) abstractActivityC12483);
            c9187.m44959(abstractActivityC12483, new C9265());
            C7321 c7321 = C7321.f24318;
            new C21964(abstractActivityC12483, i).m10243();
            return;
        }
        if (id != R.id.MT_Protector) {
            throw new RuntimeException();
        }
        Application applicationM39277 = C16737.m39277();
        C9186 c9188 = C20364.f65938;
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(applicationM39277, C20364.m45945(), true);
        if (!iwxapiCreateWXAPI.isWXAppInstalled() || iwxapiCreateWXAPI.getWXAppSupportAPI() < 570425345) {
            C15829.m37613((CharSequence) "请安装最新版本的微信客户端");
            return;
        }
        popupWindow.dismiss();
        C9186 c9189 = C12792.f42615;
        c9189.mo23642((Object) null);
        c9189.m44958((InterfaceC1423) abstractActivityC12483);
        c9189.m44959(abstractActivityC12483, new C9265());
        C7321 c7322 = C7321.f24318;
        iwxapiCreateWXAPI.registerApp(C20364.m45945());
        new C0796(abstractActivityC12483, i, iwxapiCreateWXAPI).m10243();
    }
}
