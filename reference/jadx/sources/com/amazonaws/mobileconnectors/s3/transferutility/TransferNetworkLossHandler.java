package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import com.umeng.analytics.pro.aq;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class TransferNetworkLossHandler extends BroadcastReceiver {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static TransferNetworkLossHandler f289;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Log f290 = LogFactory.m296(TransferNetworkLossHandler.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConnectivityManager f291;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TransferStatusUpdater f292;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public TransferDBUtil f293;

    public TransferNetworkLossHandler(Context context) {
        this.f291 = (ConnectivityManager) context.getSystemService("connectivity");
        this.f293 = new TransferDBUtil(context);
        this.f292 = TransferStatusUpdater.m384(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized TransferNetworkLossHandler m373(Context context) {
        if (f289 == null) {
            f289 = new TransferNetworkLossHandler(context);
        }
        return f289;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static synchronized TransferNetworkLossHandler m375() {
        TransferNetworkLossHandler transferNetworkLossHandler;
        transferNetworkLossHandler = f289;
        if (transferNetworkLossHandler == null) {
            f290.mo285("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
            throw new TransferUtilityException("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
        }
        return transferNetworkLossHandler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            Log log = f290;
            log.mo288("Network connectivity changed detected.");
            log.mo288("Network connected: " + m376());
            new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkLossHandler.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (TransferNetworkLossHandler.this.m376()) {
                        TransferNetworkLossHandler.m374(TransferNetworkLossHandler.this);
                        return;
                    }
                    TransferNetworkLossHandler transferNetworkLossHandler = TransferNetworkLossHandler.this;
                    synchronized (transferNetworkLossHandler) {
                        for (TransferRecord transferRecord : transferNetworkLossHandler.f292.m387().values()) {
                            if (S3ClientReference.m347(Integer.valueOf(transferRecord.f322)) != null && transferRecord.m381(transferNetworkLossHandler.f292, transferNetworkLossHandler.f291)) {
                                transferNetworkLossHandler.f292.m389(transferRecord.f322, TransferState.WAITING_FOR_NETWORK);
                            }
                        }
                    }
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m376() {
        NetworkInfo activeNetworkInfo = this.f291.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m374(TransferNetworkLossHandler transferNetworkLossHandler) {
        TransferRecord transferRecordM386;
        synchronized (transferNetworkLossHandler) {
            try {
                int i = 0;
                TransferState[] transferStateArr = {TransferState.WAITING_FOR_NETWORK};
                f290.mo291("Loading transfers from database...");
                ArrayList<Integer> arrayList = new ArrayList();
                Cursor cursorM356 = null;
                try {
                    TransferDBUtil transferDBUtil = transferNetworkLossHandler.f293;
                    TransferType transferType = TransferType.ANY;
                    transferDBUtil.getClass();
                    cursorM356 = TransferDBUtil.m356(transferType, transferStateArr);
                    while (cursorM356.moveToNext()) {
                        int i2 = cursorM356.getInt(cursorM356.getColumnIndexOrThrow(aq.d));
                        if (transferNetworkLossHandler.f292.m386(i2) == null) {
                            TransferRecord transferRecord = new TransferRecord(i2);
                            transferRecord.m377(cursorM356);
                            transferNetworkLossHandler.f292.m391(transferRecord);
                            i++;
                        }
                        arrayList.add(Integer.valueOf(i2));
                    }
                    f290.mo291("Closing the cursor for resumeAllTransfers");
                    cursorM356.close();
                    try {
                        for (Integer num : arrayList) {
                            AmazonS3 amazonS3M347 = S3ClientReference.m347(num);
                            if (amazonS3M347 != null && (transferRecordM386 = transferNetworkLossHandler.f292.m386(num.intValue())) != null && !transferRecordM386.m379()) {
                                transferRecordM386.m378(amazonS3M347, transferNetworkLossHandler.f293, transferNetworkLossHandler.f292, transferNetworkLossHandler.f291);
                            }
                        }
                    } catch (Exception e) {
                        f290.mo285("Error in resuming the transfers." + e.getMessage());
                    }
                    f290.mo291(i + " transfers are loaded from database.");
                } catch (Throwable th) {
                    if (cursorM356 != null) {
                        f290.mo291("Closing the cursor for resumeAllTransfers");
                        cursorM356.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
