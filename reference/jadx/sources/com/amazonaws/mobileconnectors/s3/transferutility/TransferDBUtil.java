package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.aq;
import java.io.File;
import java.util.ArrayList;
import l.C16523;
import l.C6044;

/* JADX INFO: loaded from: classes.dex */
public class TransferDBUtil {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static TransferDBBase f289;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Log f290 = LogFactory.m302(TransferDBUtil.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f288 = new Object();

    public TransferDBUtil(Context context) {
        new C6044();
        synchronized (f288) {
            if (f289 == null) {
                f289 = new TransferDBBase(context);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m362(TransferRecord transferRecord) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(aq.d, Integer.valueOf(transferRecord.f328));
        contentValues.put("state", transferRecord.f325.toString());
        contentValues.put("bytes_total", Long.valueOf(transferRecord.f319));
        contentValues.put("bytes_current", Long.valueOf(transferRecord.f322));
        return f289.m357(m368(transferRecord.f328), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m366(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("bytes_current", Long.valueOf(j));
        f289.m357(m368(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m361(int i, TransferState transferState) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", transferState.toString());
        if (TransferState.FAILED.equals(transferState)) {
            return f289.m357(m368(i), contentValues, "state not in (?,?,?,?,?) ", new String[]{TransferState.COMPLETED.toString(), TransferState.PENDING_NETWORK_DISCONNECT.toString(), TransferState.PAUSED.toString(), TransferState.CANCELED.toString(), TransferState.WAITING_FOR_NETWORK.toString()});
        }
        return f289.m357(m368(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m369(int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("multipart_id", str);
        f289.m357(m368(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m371(int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("etag", str);
        f289.m357(m368(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Cursor m363(TransferType transferType, TransferState[] transferStateArr) {
        String string;
        String strM38890;
        String[] strArr;
        int length = transferStateArr.length;
        if (length <= 0) {
            f290.mo292("Cannot create a string of 0 or less placeholders.");
            string = null;
        } else {
            StringBuilder sb = new StringBuilder((length * 2) - 1);
            sb.append("?");
            for (int i = 1; i < length; i++) {
                sb.append(",?");
            }
            string = sb.toString();
        }
        int i2 = 0;
        if (transferType == TransferType.ANY) {
            strM38890 = C16523.m38890("state in (", string, MotionUtils.EASING_TYPE_FORMAT_END);
            strArr = new String[length];
            while (i2 < length) {
                strArr[i2] = transferStateArr[i2].toString();
                i2++;
            }
        } else {
            String strM38891 = C16523.m38890("state in (", string, ") and type=?");
            String[] strArr2 = new String[length + 1];
            while (i2 < length) {
                strArr2[i2] = transferStateArr[i2].toString();
                i2++;
            }
            strArr2[i2] = transferType.toString();
            strM38890 = strM38891;
            strArr = strArr2;
        }
        TransferDBBase transferDBBase = f289;
        return transferDBBase.m358(transferDBBase.m359(), strM38890, strArr);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static TransferRecord m360(int i) throws Throwable {
        Cursor cursor = null;
        TransferRecord transferRecord = null;
        try {
            Cursor cursorM358 = f289.m358(m368(i), null, null);
            try {
                if (cursorM358.moveToFirst()) {
                    transferRecord = new TransferRecord(i);
                    transferRecord.m383(cursorM358);
                }
                cursorM358.close();
                return transferRecord;
            } catch (Throwable th) {
                th = th;
                cursor = cursorM358;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static long m367(int i) {
        Cursor cursorM358 = null;
        try {
            cursorM358 = f289.m358(m370(i), null, null);
            long j = 0;
            while (cursorM358.moveToNext()) {
                if (TransferState.PART_COMPLETED.equals(TransferState.m388(cursorM358.getString(cursorM358.getColumnIndexOrThrow("state"))))) {
                    j += cursorM358.getLong(cursorM358.getColumnIndexOrThrow("bytes_total"));
                }
            }
            cursorM358.close();
            return j;
        } catch (Throwable th) {
            if (cursorM358 != null) {
                cursorM358.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m365(int i) {
        f289.m356(m368(i));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static ArrayList m372(int i) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorM358 = null;
        try {
            cursorM358 = f289.m358(m370(i), null, null);
            while (cursorM358.moveToNext()) {
                arrayList.add(new PartETag(cursorM358.getInt(cursorM358.getColumnIndexOrThrow("part_num")), cursorM358.getString(cursorM358.getColumnIndexOrThrow("etag"))));
            }
            cursorM358.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorM358 != null) {
                cursorM358.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m364(int i, String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorM358 = null;
        try {
            cursorM358 = f289.m358(m370(i), null, null);
            while (cursorM358.moveToNext()) {
                if (!TransferState.PART_COMPLETED.equals(TransferState.m388(cursorM358.getString(cursorM358.getColumnIndexOrThrow("state"))))) {
                    UploadPartRequest uploadPartRequest = new UploadPartRequest();
                    uploadPartRequest.m676(cursorM358.getInt(cursorM358.getColumnIndexOrThrow(aq.d)));
                    cursorM358.getInt(cursorM358.getColumnIndexOrThrow("main_upload_id"));
                    uploadPartRequest.m680(cursorM358.getString(cursorM358.getColumnIndexOrThrow("bucket_name")));
                    uploadPartRequest.m687(cursorM358.getString(cursorM358.getColumnIndexOrThrow("key")));
                    uploadPartRequest.m684(str);
                    uploadPartRequest.m678(new File(cursorM358.getString(cursorM358.getColumnIndexOrThrow("file"))));
                    uploadPartRequest.m677(cursorM358.getLong(cursorM358.getColumnIndexOrThrow("file_offset")));
                    uploadPartRequest.m683(cursorM358.getInt(cursorM358.getColumnIndexOrThrow("part_num")));
                    uploadPartRequest.m686(cursorM358.getLong(cursorM358.getColumnIndexOrThrow("bytes_total")));
                    cursorM358.getInt(cursorM358.getColumnIndexOrThrow("is_last_part"));
                    arrayList.add(uploadPartRequest);
                }
            }
            cursorM358.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorM358 != null) {
                cursorM358.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Uri m368(int i) {
        return Uri.parse(f289.m359() + "/" + i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Uri m370(int i) {
        return Uri.parse(f289.m359() + "/part/" + i);
    }
}
