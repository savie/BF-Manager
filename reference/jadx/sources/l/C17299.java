package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67V */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17299 implements InterfaceC5417, InterfaceC17972, InterfaceC21436, InterfaceC21100, InterfaceC17544, InterfaceC18006 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56330;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56331;

    public /* synthetic */ C17299(int i, Object obj) {
        this.f56330 = i;
        this.f56331 = obj;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private final /* synthetic */ void m40624() {
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private final /* synthetic */ void m40625() {
    }

    @Override // l.InterfaceC5417
    public Object apply(Object obj) {
        C19215 c19215 = (C19215) obj;
        ((C16231) this.f56331).getClass();
        return c19215;
    }

    @Override // l.InterfaceC21436
    public boolean onMenuItemClick(MenuItem menuItem) {
        C24190.m54173((C24190) this.f56331, menuItem);
        return true;
    }

    @Override // l.InterfaceC17972
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo16589() {
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        ((InterfaceC0737) this.f56331).mo3060(i);
    }

    @Override // l.InterfaceC18006
    /* JADX INFO: renamed from: ۙ */
    public void mo1736(Object obj) {
        ((C18372) this.f56331).m42858((C21532) obj, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [int[], java.io.Serializable] */
    @Override // l.InterfaceC17972
    /* JADX INFO: renamed from: ۙ */
    public void mo16590(Bundle bundle, String str) {
        int i = this.f56330;
        Object obj = this.f56331;
        switch (i) {
            case 2:
                ActivityC5440 activityC5440 = (ActivityC5440) obj;
                int i2 = ActivityC5440.f18993;
                AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
                ApplicationC17729.f58258.edit().putString("tfdp", str).apply();
                if (!bundle.getBoolean("export")) {
                    final ?? r7 = {0};
                    C2361 c2361BuildDialog = activityC5440.buildDialog();
                    c2361BuildDialog.m8021(R.string.MT_Protector);
                    c2361BuildDialog.m8001(R.array.MT_Protector, r7[0], new DialogInterface.OnClickListener() { // from class: l.ۙ۫ᩴ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            int i4 = ActivityC5440.f18993;
                            r7[0] = i3;
                        }
                    });
                    c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC14884(activityC5440, abstractC22044M35193, r7, 1));
                    c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c2361BuildDialog.m8016();
                } else {
                    try {
                        C24832.m55352(abstractC22044M35193, bundle.getIntegerArrayList("indices"));
                        C22673.m51152(R.string.MT_Protector);
                    } catch (Exception e) {
                        activityC5440.m40401(e, (DialogInterface.OnDismissListener) null);
                        return;
                    }
                }
                break;
            default:
                ViewOnClickListenerC19404 viewOnClickListenerC19404 = (ViewOnClickListenerC19404) obj;
                viewOnClickListenerC19404.m44872(new Runnable() { // from class: l.ۤ᩺ۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC19404.m44893(viewOnClickListenerC19404, str, bundle);
                    }
                });
                break;
        }
    }

    @Override // l.InterfaceC21100
    /* JADX INFO: renamed from: ᩷ */
    public Bitmap mo6272() {
        return C8275.m22351((InterfaceC0817) this.f56331);
    }
}
