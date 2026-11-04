package l;

import android.app.Application;
import android.content.Intent;
import android.view.View;

/* JADX INFO: renamed from: l.۬ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC13784 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (ServiceC6459.m18242()) {
            Application applicationM49084 = C21576.m49084();
            applicationM49084.stopService(new Intent(applicationM49084, (Class<?>) ServiceC6459.class));
        } else {
            ServiceC6459.m18252();
        }
    }
}
