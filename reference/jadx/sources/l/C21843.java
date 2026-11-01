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

/* JADX INFO: renamed from: l.᩸᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X32D */
/* JADX INFO: loaded from: classes4.dex */
public final class C21843 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Object f70905 = new Object();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C21843 f70906;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Handler f70910;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Context f70911;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f70909 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f70908 = new HashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f70907 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21843 m48614(ContextWrapper contextWrapper) {
        C21843 c21843;
        synchronized (f70905) {
            if (f70906 == null) {
                f70906 = new C21843(contextWrapper.getApplicationContext());
            }
            c21843 = f70906;
        }
        return c21843;
    }

    public C21843(Context context) {
        this.f70911 = context;
        this.f70910 = new HandlerC7026(this, context.getMainLooper());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48617(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f70909) {
            C15494 c15494 = new C15494(broadcastReceiver, intentFilter);
            ArrayList arrayList = (ArrayList) this.f70909.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f70909.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c15494);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f70908.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f70908.put(action, arrayList2);
                }
                arrayList2.add(c15494);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48616(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f70909) {
            ArrayList arrayList = (ArrayList) this.f70909.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C15494 c15494 = (C15494) arrayList.get(size);
                c15494.f50477 = true;
                for (int i = 0; i < c15494.f50476.countActions(); i++) {
                    String action = c15494.f50476.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f70908.get(action);
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            C15494 c15495 = (C15494) arrayList2.get(size2);
                            if (c15495.f50474 == broadcastReceiver) {
                                c15495.f50477 = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            this.f70908.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48618(Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.f70909) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f70911.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                intent.toString();
            }
            ArrayList arrayList3 = (ArrayList) this.f70908.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    arrayList3.toString();
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    C15494 c15494 = (C15494) arrayList3.get(i2);
                    if (z) {
                        C13638.toString(c15494.f50476);
                    }
                    if (c15494.f50475) {
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
                        int iMatch = c15494.f50476.match(str2, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z) {
                                Integer.toHexString(iMatch);
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(c15494);
                            c15494.f50475 = true;
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
                        ((C15494) arrayList5.get(i3)).f50475 = false;
                    }
                    this.f70907.add(new C23255(intent, arrayList5));
                    if (!this.f70910.hasMessages(1)) {
                        this.f70910.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48619(Intent intent) {
        if (m48618(intent)) {
            m48615();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48615() {
        int size;
        C23255[] c23255Arr;
        while (true) {
            synchronized (this.f70909) {
                size = this.f70907.size();
                if (size <= 0) {
                    return;
                }
                c23255Arr = new C23255[size];
                this.f70907.toArray(c23255Arr);
                this.f70907.clear();
            }
            for (int i = 0; i < size; i++) {
                C23255 c23255 = c23255Arr[i];
                int size2 = c23255.f75439.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C15494 c15494 = (C15494) c23255.f75439.get(i2);
                    if (!c15494.f50477) {
                        c15494.f50474.onReceive(this.f70911, c23255.f75438);
                    }
                }
            }
        }
    }
}
