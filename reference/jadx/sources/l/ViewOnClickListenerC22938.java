package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Y9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC22938 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f74560;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f74561;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11545 f74562;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10948 f74563;

    public ViewOnClickListenerC22938(C11545 c11545) {
        this.f74562 = c11545;
        View viewM30995 = c11545.m28824().m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        C10948 c10948 = (C10948) viewM30995.findViewById(R.id.MT_Protector);
        this.f74563 = c10948;
        this.f74560 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        c10948.m16853(new C6709(this));
        C8067 c8067BuildDialog = c11545.m28824().buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21265(false);
        DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067BuildDialog.m21252();
        this.f74561 = dialogInterfaceC19356M21252;
        C8875.m23019(dialogInterfaceC19356M21252);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50779() {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f74561;
        dialogInterfaceC19356.m44362();
        dialogInterfaceC19356.m44373().setOnClickListener(this);
        dialogInterfaceC19356.m44374().setOnClickListener(this);
        C16737.m39290(this.f74563);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string = this.f74563.m17000().toString();
        if (string.isEmpty()) {
            return;
        }
        boolean zContains = string.contains("/");
        boolean z = view.getId() == 16908313;
        boolean zContains2 = string.contains("\\");
        TextView textView = this.f74560;
        if (zContains2 || string.equals("/")) {
            textView.setVisibility(0);
            textView.setText(R.string.MT_Protector);
            return;
        }
        C11545 c11545 = this.f74562;
        if (!zContains) {
            boolean zMo24615 = c11545.m28817().mo13029().mo24615();
            for (InterfaceC2557 interfaceC2557 : c11545.m28795()) {
                String name = interfaceC2557.getName();
                if (zMo24615 ? name.equalsIgnoreCase(string) : name.equals(string)) {
                    if (interfaceC2557.isDirectory()) {
                        if (z) {
                            textView.setVisibility(0);
                            textView.setText(R.string.MT_Protector);
                            return;
                        } else {
                            textView.setVisibility(0);
                            textView.setText(R.string.MT_Protector);
                            return;
                        }
                    }
                    if (z) {
                        textView.setVisibility(0);
                        textView.setText(R.string.MT_Protector);
                        return;
                    } else {
                        textView.setVisibility(0);
                        textView.setText(R.string.MT_Protector);
                        return;
                    }
                }
            }
        }
        try {
            c11545.m28817().mo23628(c11545, string, z);
            this.f74561.dismiss();
        } catch (C4987 e) {
            String message = e.getMessage();
            textView.setVisibility(0);
            textView.setText(message);
        }
    }
}
