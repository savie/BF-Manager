package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC16006 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C8614 f51946;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f51947;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1626 f51948;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C23255 f51949;

    public ViewOnClickListenerC16006(C8614 c8614) {
        this.f51946 = c8614;
        View viewM40395 = c8614.m23233().m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        this.f51949 = c23255;
        this.f51948 = (C1626) viewM40395.findViewById(R.id.MT_Protector);
        c23255.m53899(new C17498(this));
        C2361 c2361BuildDialog = c8614.m23233().buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8012(false);
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361BuildDialog.m7999();
        this.f51947 = dialogInterfaceC8327M7999;
        C21232.m48398(dialogInterfaceC8327M7999);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38141(int i) {
        this.f51948.m5768(this.f51946.m23233().getText(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38140() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f51947;
        dialogInterfaceC8327.m22432();
        dialogInterfaceC8327.m22436().setOnClickListener(this);
        dialogInterfaceC8327.m22433().setOnClickListener(this);
        C21576.m49090(this.f51949);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean zEquals;
        String string = this.f51949.m54021().toString();
        if (string.isEmpty()) {
            return;
        }
        boolean zContains = string.contains("/");
        boolean z = view.getId() == 16908313;
        if (string.contains("\\") || string.equals("/")) {
            m38141(R.string.MT_Protector);
            return;
        }
        C8614 c8614 = this.f51946;
        if (!zContains) {
            boolean zMo20839 = c8614.m23213().mo10174().mo20839();
            for (InterfaceC2386 interfaceC2386 : c8614.m23202()) {
                String name = interfaceC2386.getName();
                if (zMo20839) {
                    zEquals = name.equalsIgnoreCase(string);
                } else {
                    zEquals = name.equals(string);
                }
                if (zEquals) {
                    if (interfaceC2386.isDirectory()) {
                        if (z) {
                            m38141(R.string.MT_Protector);
                            return;
                        } else {
                            m38141(R.string.MT_Protector);
                            return;
                        }
                    }
                    if (z) {
                        m38141(R.string.MT_Protector);
                        return;
                    } else {
                        m38141(R.string.MT_Protector);
                        return;
                    }
                }
            }
        }
        try {
            c8614.m23213().mo18798(c8614, string, z);
            this.f51947.dismiss();
        } catch (C4866 e) {
            this.f51948.m5768(e.getMessage());
        }
    }
}
