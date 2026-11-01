package l;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ܰۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TX */
/* JADX INFO: loaded from: classes3.dex */
public final class C13751 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C13751 f45333;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f45334;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Executor f45335;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f45336;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f45337;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f45338;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C13751 m33494(Context context) {
        if (f45333 == null) {
            f45333 = new C13751(context);
        }
        return f45333;
    }

    public C13751(final Context context) {
        Executor executorM33379 = C13672.m33379();
        this.f45335 = executorM33379;
        this.f45337 = new CopyOnWriteArrayList();
        this.f45334 = new Object();
        this.f45336 = 0;
        executorM33379.execute(new Runnable() { // from class: l.ۛۡۙ
            @Override // java.lang.Runnable
            public final void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new C4577(this), intentFilter);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33498() {
        int i;
        synchronized (this.f45334) {
            i = this.f45336;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m33495(int i) {
        CopyOnWriteArrayList<C9477> copyOnWriteArrayList = this.f45337;
        for (C9477 c9477 : copyOnWriteArrayList) {
            if (c9477.m24291()) {
                copyOnWriteArrayList.remove(c9477);
            }
        }
        synchronized (this.f45334) {
            if (this.f45338 && this.f45336 == i) {
                return;
            }
            this.f45338 = true;
            this.f45336 = i;
            Iterator it = this.f45337.iterator();
            while (it.hasNext()) {
                ((C9477) it.next()).m24290();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33499(C10793 c10793, Executor executor) {
        boolean z;
        CopyOnWriteArrayList<C9477> copyOnWriteArrayList = this.f45337;
        for (C9477 c9477 : copyOnWriteArrayList) {
            if (c9477.m24291()) {
                copyOnWriteArrayList.remove(c9477);
            }
        }
        C9477 c9478 = new C9477(this, c10793, executor);
        synchronized (this.f45334) {
            this.f45337.add(c9478);
            z = this.f45338;
        }
        if (z) {
            c9478.m24290();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33496(Context context, C13751 c13751) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i = 1;
                } else {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i = 4;
                                break;
                            case 13:
                                i = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i = 6;
                                break;
                            case 18:
                                i = 2;
                                break;
                            case 20:
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i = 9;
                                }
                                break;
                        }
                    } else if (type == 1) {
                        i = 2;
                    } else if (type == 4 || type == 5) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i = 4;
                                break;
                            case 13:
                                i = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i = 6;
                                break;
                            case 18:
                                i = 2;
                                break;
                            case 20:
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i = 9;
                                }
                                break;
                        }
                    } else if (type != 6) {
                        i = type != 9 ? 8 : 7;
                    } else {
                        i = 5;
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && i == 5) {
            C23588.m52015(context, c13751);
        } else {
            c13751.m33495(i);
        }
    }
}
