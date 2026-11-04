package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X32D */
/* JADX INFO: loaded from: classes3.dex */
public final class C7247 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Object f23893 = new Object();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C7247 f23894;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Handler f23896;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Context f23898;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f23897 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f23895 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f23899 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7247 m19877(ContextWrapper contextWrapper) {
        C7247 c7247;
        synchronized (f23893) {
            if (f23894 == null) {
                f23894 = new C7247(contextWrapper.getApplicationContext());
            }
            c7247 = f23894;
        }
        return c7247;
    }

    public C7247(Context context) {
        this.f23898 = context;
        this.f23896 = new HandlerC9483(this, context.getMainLooper());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19880(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f23897) {
            C8738 c8738 = new C8738(broadcastReceiver, intentFilter);
            ArrayList arrayList = (ArrayList) this.f23897.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f23897.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c8738);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f23895.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f23895.put(action, arrayList2);
                }
                arrayList2.add(c8738);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19879(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f23897) {
            ArrayList arrayList = (ArrayList) this.f23897.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C8738 c8738 = (C8738) arrayList.get(size);
                c8738.f28418 = true;
                for (int i = 0; i < c8738.f28417.countActions(); i++) {
                    String action = c8738.f28417.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f23895.get(action);
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            C8738 c8739 = (C8738) arrayList2.get(size2);
                            if (c8739.f28419 == broadcastReceiver) {
                                c8739.f28418 = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            this.f23895.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19881(Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.f23897) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f23898.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                intent.toString();
            }
            ArrayList arrayList3 = (ArrayList) this.f23895.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    arrayList3.toString();
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    C8738 c8738 = (C8738) arrayList3.get(i2);
                    if (z) {
                        C17359.toString(c8738.f28417);
                    }
                    if (c8738.f28416) {
                        str = action;
                        i = i2;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                    } else {
                        String str2 = action;
                        i = i2;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        int iMatch = c8738.f28417.match(str2, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z) {
                                Integer.toHexString(iMatch);
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(c8738);
                            c8738.f28416 = true;
                        }
                        i2 = i + 1;
                        action = str;
                        arrayList3 = arrayList2;
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    action = str;
                    arrayList3 = arrayList2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((C8738) arrayList5.get(i3)).f28416 = false;
                    }
                    this.f23899.add(new C2772(intent, arrayList5));
                    if (!this.f23896.hasMessages(1)) {
                        this.f23896.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19882(Intent intent) {
        if (m19881(intent)) {
            m19878();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19878() {
        int size;
        C2772[] c2772Arr;
        while (true) {
            synchronized (this.f23897) {
                size = this.f23899.size();
                if (size <= 0) {
                    return;
                }
                c2772Arr = new C2772[size];
                this.f23899.toArray(c2772Arr);
                this.f23899.clear();
            }
            for (int i = 0; i < size; i++) {
                C2772 c2772 = c2772Arr[i];
                int size2 = c2772.f9147.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C8738 c8738 = (C8738) c2772.f9147.get(i2);
                    if (!c8738.f28418) {
                        c8738.f28419.onReceive(this.f23898, c2772.f9146);
                    }
                }
            }
        }
    }
}
