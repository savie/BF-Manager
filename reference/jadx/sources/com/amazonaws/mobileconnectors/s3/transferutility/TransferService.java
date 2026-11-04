package com.amazonaws.mobileconnectors.s3.transferutility;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TransferService extends Service {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Log f325 = LogFactory.m296(TransferService.class);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static TransferNetworkLossHandler f326;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f327 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f329 = 3462;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f328 = true;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Can't bind to TransferService");
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log log = f325;
        log.mo288("Starting Transfer Service to listen for network connectivity changes.");
        f326 = TransferNetworkLossHandler.m373(getApplicationContext());
        synchronized (this) {
            if (this.f327) {
                try {
                    try {
                        log.mo288("Registering the network receiver");
                        registerReceiver(f326, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        this.f327 = false;
                    } catch (IllegalStateException unused) {
                        f325.mo294("Ignoring the leak in registering the receiver.");
                    }
                } catch (IllegalArgumentException unused2) {
                    f325.mo294("Ignoring the exception trying to register the receiver for connectivity change.");
                }
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            try {
                synchronized (this) {
                    Notification notification = (Notification) intent.getParcelableExtra("notification");
                    if (notification != null) {
                        this.f329 = intent.getIntExtra("ongoing-notification-id", this.f329);
                        this.f328 = intent.getBooleanExtra("remove-notification", this.f328);
                        f325.mo288("Putting the service in Foreground state.");
                        if (i3 >= 34) {
                            startForeground(this.f329, notification, 1);
                        } else {
                            startForeground(this.f329, notification);
                        }
                    } else {
                        f325.mo285("No notification is passed in the intent. Unable to transition to foreground.");
                    }
                }
            } catch (Exception e) {
                f325.mo285("Error in moving the service to foreground state: " + e);
            }
            return 1;
        }
        synchronized (this) {
            if (this.f327) {
                try {
                    f325.mo288("Registering the network receiver");
                    registerReceiver(f326, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f327 = false;
                } catch (IllegalArgumentException unused) {
                    f325.mo294("Ignoring the exception trying to register the receiver for connectivity change.");
                } catch (IllegalStateException unused2) {
                    f325.mo294("Ignoring the leak in registering the receiver.");
                }
            }
            return 1;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        try {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    f325.mo288("Moving the service out of the Foreground state.");
                    synchronized (this) {
                        stopForeground(this.f328);
                    }
                    super.onDestroy();
                }
                f325.mo288("De-registering the network receiver.");
                synchronized (this) {
                    if (!this.f327) {
                        unregisterReceiver(f326);
                        this.f327 = true;
                        f326 = null;
                    }
                    super.onDestroy();
                }
            } catch (IllegalArgumentException unused) {
                f325.mo294("Exception trying to de-register the network receiver");
            }
        } catch (Exception e) {
            f325.mo285("Error in moving the service out of the foreground state: " + e);
        }
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if ((getApplicationInfo().flags & 2) == 0) {
            return;
        }
        printWriter.printf("network status: %s\n", Boolean.valueOf(f326.m376()));
        Map mapM387 = TransferStatusUpdater.m384(this).m387();
        printWriter.printf("# of active transfers: %d\n", Integer.valueOf(mapM387.size()));
        for (TransferRecord transferRecord : mapM387.values()) {
            printWriter.printf("bucket: %s, key: %s, status: %s, total size: %d, current: %d\n", transferRecord.f301, transferRecord.f308, transferRecord.f296, Long.valueOf(transferRecord.f306), Long.valueOf(transferRecord.f320));
        }
        printWriter.flush();
    }
}
