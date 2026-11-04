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

/* JADX INFO: renamed from: l.ܿۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18080 extends AbstractC10926 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f59180;

    public C18080(C20348 c20348) {
        super(6);
        this.f59180 = c20348.readInt();
    }

    @Override // l.AbstractC10926
    /* JADX INFO: renamed from: ۙ */
    public final void mo1477(final AbstractActivityC17204 abstractActivityC17204) {
        if (!C18978.m44079()) {
            C22673.m51152(R.string.MT_Protector);
            new ViewOnClickListenerC16544(abstractActivityC17204);
            return;
        }
        final PopupWindow popupWindow = new PopupWindow(abstractActivityC17204);
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ܰۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C18080.m42112(this.f45257, abstractActivityC17204, popupWindow, view);
            }
        };
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(onClickListener);
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(onClickListener);
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        final Window window = abstractActivityC17204.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.7f;
        window.addFlags(2);
        window.setAttributes(attributes);
        popupWindow.setWidth(-1);
        popupWindow.setHeight(-2);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setContentView(viewM40395);
        popupWindow.setAnimationStyle(R.style.MT_Protector);
        popupWindow.showAtLocation(window.getDecorView(), 81, 0, 0);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.᩶ۘ᩻
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
    public static void m42112(C18080 c18080, AbstractActivityC17204 abstractActivityC17204, PopupWindow popupWindow, View view) {
        int id = view.getId();
        int i = c18080.f59180;
        C17930 c17930 = C7484.f24760;
        C15243.m36590(abstractActivityC17204, "activity");
        C3076.f9994 = null;
        int i2 = 1;
        if (id == R.id.MT_Protector) {
            popupWindow.dismiss();
            C17930 c17931 = C7484.f24760;
            c17931.mo40353((Object) null);
            c17931.m40349((InterfaceC11217) abstractActivityC17204);
            c17931.m40350(abstractActivityC17204, new C0227(i2));
            C11471 c11471 = C11471.f36082;
            new C9720(abstractActivityC17204, i).m8197();
            return;
        }
        if (id != R.id.MT_Protector) {
            throw new RuntimeException();
        }
        Application applicationM49084 = C21576.m49084();
        C17930 c17932 = C3076.f9993;
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(applicationM49084, C3076.m10032(), true);
        if (!iwxapiCreateWXAPI.isWXAppInstalled() || iwxapiCreateWXAPI.getWXAppSupportAPI() < 570425345) {
            C22673.m51154((CharSequence) "请安装最新版本的微信客户端");
            return;
        }
        popupWindow.dismiss();
        C17930 c17933 = C7484.f24760;
        c17933.mo40353((Object) null);
        c17933.m40349((InterfaceC11217) abstractActivityC17204);
        c17933.m40350(abstractActivityC17204, new C0227(i2));
        C11471 c11472 = C11471.f36082;
        iwxapiCreateWXAPI.registerApp(C3076.m10032());
        new C8975(abstractActivityC17204, i, iwxapiCreateWXAPI).m8197();
    }
}
