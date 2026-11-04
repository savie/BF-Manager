package l;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC13815 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43800;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43801;

    public /* synthetic */ RunnableC13815(int i, Object obj) {
        this.f43800 = i;
        this.f43801 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        int i = this.f43800;
        Object obj = this.f43801;
        switch (i) {
            case 0:
                Exception exc = null;
                for (InterfaceC20670 interfaceC20670 : (InterfaceC20670[]) obj) {
                    try {
                        interfaceC20670.close();
                    } catch (Exception e) {
                        if (exc == null) {
                            exc = e;
                        } else {
                            exc.addSuppressed(e);
                        }
                    }
                }
                if (exc != null) {
                    throw exc;
                }
                return;
            case 1:
                ((C1299) obj).mo4704();
                return;
            case 2:
                int i2 = C2012.f6695;
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : (ArrayList) obj) {
                    sb.append((String) entry.getKey());
                    sb.append(": ");
                    sb.append(entry.getValue() == null ? "" : (String) entry.getValue());
                    sb.append('\n');
                }
                C21576.m49067((CharSequence) sb.toString());
                return;
            case 3:
                ((C9271) obj).m24476();
                return;
            case 4:
                RunnableC1848.m6368(((ActivityC5863) obj).f20112);
                return;
            default:
                Context context = (Context) obj;
                try {
                    Intent intent = new Intent();
                    intent.setFlags(268435456);
                    intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity"));
                    if (C9034.m24089() == 3.1d) {
                        context.startActivity(intent);
                    } else {
                        intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.notificationmanager.ui.NotificationManagmentActivity"));
                        context.startActivity(intent);
                    }
                    return;
                } catch (ActivityNotFoundException unused) {
                    Intent intent2 = new Intent();
                    intent2.setFlags(268435456);
                    intent2.setComponent(new ComponentName("com.Android.settings", "com.android.settings.permission.TabItem"));
                    context.startActivity(intent2);
                    return;
                } catch (SecurityException unused2) {
                    Intent intent3 = new Intent();
                    intent3.setFlags(268435456);
                    intent3.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
                    context.startActivity(intent3);
                    return;
                } catch (Exception unused3) {
                    throw new RuntimeException("intent is not available!");
                }
        }
    }
}
