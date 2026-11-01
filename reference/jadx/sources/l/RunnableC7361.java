package l;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7361 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24434;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24435;

    public /* synthetic */ RunnableC7361(int i, Object obj) {
        this.f24434 = i;
        this.f24435 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f24434;
        Object obj = this.f24435;
        switch (i) {
            case 0:
                C15829.m37615((C15829) obj);
                return;
            case 1:
                InterfaceC3800 interfaceC3800 = (InterfaceC3800) obj;
                try {
                    EnumC22146 enumC22146 = EnumC22146.NOFOLLOW_LINKS;
                    if (C5212.isDirectory(interfaceC3800, enumC22146)) {
                        if (C5212.exists(interfaceC3800.resolve("session.lock"), enumC22146)) {
                            C1254.m4508(interfaceC3800);
                            return;
                        }
                        InterfaceC5046 list = C5212.list(interfaceC3800);
                        try {
                            if (list.findAny().isPresent()) {
                                list.close();
                                return;
                            }
                            list.close();
                            C5212.deleteIfExists(interfaceC3800);
                            InterfaceC1959.f7372.mo6327(interfaceC3800.getParent());
                            return;
                        } catch (Throwable th) {
                            if (list != null) {
                                try {
                                    list.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                break;
                            }
                            throw th;
                        }
                    }
                    return;
                } catch (IOException e) {
                    throw new C17013(e);
                }
            case 2:
                ((TextView) obj).setText(R.string.MT_Protector);
                return;
            case 3:
                C19729.m44855((C19729) obj);
                return;
            case 4:
                ((ServiceC23236) obj).m51278();
                return;
            case 5:
                TextureViewSurfaceTextureListenerC20034.m45370((TextureViewSurfaceTextureListenerC20034) obj);
                return;
            default:
                Context context = (Context) obj;
                try {
                    Intent intent = new Intent();
                    intent.setFlags(268435456);
                    intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity"));
                    if (C12597.m31374() == 3.1d) {
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
