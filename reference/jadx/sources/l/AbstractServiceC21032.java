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

/* JADX INFO: renamed from: l.᩷ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractServiceC21032 extends Service {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f68496 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C2086 f68497;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C19622 f68498 = new C19622(this);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21445 f68499;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f68500;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HandlerC7627 f68501;

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract C17609 m47409();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract void m47411();

    public AbstractServiceC21032() {
        new C11260(this, "android.media.session.MediaController", -1, -1, null);
        this.f68500 = new ArrayList();
        this.f68499 = new C21445();
        this.f68501 = new HandlerC7627(this);
    }

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f68497 = new C5510(this);
        } else if (i >= 26) {
            this.f68497 = new C2687(this);
        } else if (i >= 23) {
            this.f68497 = new C4804(this);
        } else {
            this.f68497 = new C2086(this);
        }
        this.f68497.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f68501.m20154();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f68497.f7714.onBind(intent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47410(Message message) {
        Bundle data = message.getData();
        int i = message.what;
        C19622 c19622 = this.f68498;
        switch (i) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                C1148.m4220(bundle);
                String string = data.getString("data_package_name");
                int i2 = data.getInt("data_calling_pid");
                int i3 = data.getInt("data_calling_uid");
                C10450 c10450 = new C10450(message.replyTo);
                AbstractServiceC21032 abstractServiceC21032 = c19622.f62983;
                if (string != null) {
                    for (String str : abstractServiceC21032.getPackageManager().getPackagesForUid(i3)) {
                        if (str.equals(string)) {
                            abstractServiceC21032.f68501.m20155(new RunnableC13272(i2, i3, bundle, c19622, c10450, string));
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + string);
            case 2:
                c19622.f62983.f68501.m20155(new RunnableC4098(c19622, new C10450(message.replyTo)));
                return;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                C1148.m4220(bundle2);
                c19622.f62983.f68501.m20155(new RunnableC6921(c19622, new C10450(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2));
                return;
            case 4:
                c19622.f62983.f68501.m20155(new RunnableC23150(c19622, new C10450(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token")));
                return;
            case 5:
                String string2 = data.getString("data_media_item_id");
                C15967 c15967 = (C15967) data.getParcelable("data_result_receiver");
                C10450 c10451 = new C10450(message.replyTo);
                c19622.getClass();
                if (TextUtils.isEmpty(string2) || c15967 == null) {
                    return;
                }
                c19622.f62983.f68501.m20155(new RunnableC15389(c19622, c10451, string2, c15967));
                return;
            case 6:
                Bundle bundle3 = data.getBundle("data_root_hints");
                C1148.m4220(bundle3);
                c19622.f62983.f68501.m20155(new RunnableC21738(data.getInt("data_calling_uid"), data.getInt("data_calling_pid"), bundle3, c19622, new C10450(message.replyTo), data.getString("data_package_name")));
                return;
            case 7:
                c19622.f62983.f68501.m20155(new RunnableC18210(c19622, new C10450(message.replyTo)));
                return;
            case 8:
                Bundle bundle4 = data.getBundle("data_search_extras");
                C1148.m4220(bundle4);
                String string3 = data.getString("data_search_query");
                C15967 c15968 = (C15967) data.getParcelable("data_result_receiver");
                C10450 c10452 = new C10450(message.replyTo);
                c19622.getClass();
                if (TextUtils.isEmpty(string3) || c15968 == null) {
                    return;
                }
                c19622.f62983.f68501.m20155(new RunnableC18916(c19622, c10452, string3, bundle4, c15968));
                return;
            case 9:
                Bundle bundle5 = data.getBundle("data_custom_action_extras");
                C1148.m4220(bundle5);
                String string4 = data.getString("data_custom_action");
                C15967 c15969 = (C15967) data.getParcelable("data_result_receiver");
                C10450 c10453 = new C10450(message.replyTo);
                c19622.getClass();
                if (TextUtils.isEmpty(string4) || c15969 == null) {
                    return;
                }
                c19622.f62983.f68501.m20155(new RunnableC8333(c19622, c10453, string4, bundle5, c15969));
                return;
            default:
                message.toString();
                return;
        }
    }
}
