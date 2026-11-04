package l;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractServiceC13191 extends Service {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f42125 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f42126;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C10953 f42127 = new C10953(this);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14307 f42128;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C12489 f42129;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HandlerC15428 f42130;

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract C17710 m32706();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void m32708();

    public AbstractServiceC13191() {
        new C23678(this, "android.media.session.MediaController", -1, -1, null);
        this.f42126 = new ArrayList();
        this.f42128 = new C14307();
        this.f42130 = new HandlerC15428(this);
    }

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f42129 = new C0557(this);
        } else if (i >= 26) {
            this.f42129 = new C18456(this);
        } else if (i >= 23) {
            this.f42129 = new C4286(this);
        } else {
            this.f42129 = new C12489(this);
        }
        this.f42129.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f42130.m36956();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f42129.f40098.onBind(intent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32707(Message message) {
        Bundle data = message.getData();
        int i = message.what;
        C10953 c10953 = this.f42127;
        switch (i) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                C13363.m32945(bundle);
                String string = data.getString("data_package_name");
                int i2 = data.getInt("data_calling_pid");
                int i3 = data.getInt("data_calling_uid");
                C19904 c19904 = new C19904(message.replyTo);
                AbstractServiceC13191 abstractServiceC13191 = c10953.f34619;
                if (string != null) {
                    for (String str : abstractServiceC13191.getPackageManager().getPackagesForUid(i3)) {
                        if (str.equals(string)) {
                            abstractServiceC13191.f42130.m36957(new RunnableC10251(i2, i3, bundle, c10953, c19904, string));
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + string);
            case 2:
                c10953.f34619.f42130.m36957(new RunnableC1303(c10953, new C19904(message.replyTo)));
                return;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                C13363.m32945(bundle2);
                c10953.f34619.f42130.m36957(new RunnableC9505(c10953, new C19904(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2));
                return;
            case 4:
                c10953.f34619.f42130.m36957(new RunnableC2794(c10953, new C19904(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token")));
                return;
            case 5:
                String string2 = data.getString("data_media_item_id");
                C14854 c14854 = (C14854) data.getParcelable("data_result_receiver");
                C19904 c19905 = new C19904(message.replyTo);
                c10953.getClass();
                if (TextUtils.isEmpty(string2) || c14854 == null) {
                    return;
                }
                c10953.f34619.f42130.m36957(new RunnableC8760(c10953, c19905, string2, c14854));
                return;
            case 6:
                Bundle bundle3 = data.getBundle("data_root_hints");
                C13363.m32945(bundle3);
                c10953.f34619.f42130.m36957(new RunnableC7269(data.getInt("data_calling_uid"), data.getInt("data_calling_pid"), bundle3, c10953, new C19904(message.replyTo), data.getString("data_package_name")));
                return;
            case 7:
                c10953.f34619.f42130.m36957(new RunnableC13980(c10953, new C19904(message.replyTo)));
                return;
            case 8:
                Bundle bundle4 = data.getBundle("data_search_extras");
                C13363.m32945(bundle4);
                String string3 = data.getString("data_search_query");
                C14854 c14855 = (C14854) data.getParcelable("data_result_receiver");
                C19904 c19906 = new C19904(message.replyTo);
                c10953.getClass();
                if (TextUtils.isEmpty(string3) || c14855 == null) {
                    return;
                }
                c10953.f34619.f42130.m36957(new RunnableC4988(c10953, c19906, string3, bundle4, c14855));
                return;
            case 9:
                Bundle bundle5 = data.getBundle("data_custom_action_extras");
                C13363.m32945(bundle5);
                String string4 = data.getString("data_custom_action");
                C14854 c14856 = (C14854) data.getParcelable("data_result_receiver");
                C19904 c19907 = new C19904(message.replyTo);
                c10953.getClass();
                if (TextUtils.isEmpty(string4) || c14856 == null) {
                    return;
                }
                c10953.f34619.f42130.m36957(new RunnableC22142(c10953, c19907, string4, bundle5, c14856));
                return;
            default:
                message.toString();
                return;
        }
    }
}
