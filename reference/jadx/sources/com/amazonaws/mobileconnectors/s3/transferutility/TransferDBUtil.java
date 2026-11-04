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
import l.C14442;
import l.C24522;

/* JADX INFO: loaded from: classes.dex */
public class TransferDBUtil {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static TransferDBBase f279;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Log f280 = LogFactory.m296(TransferDBUtil.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f278 = new Object();

    public TransferDBUtil(Context context) {
        new C24522();
        synchronized (f278) {
            if (f279 == null) {
                f279 = new TransferDBBase(context);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m355(TransferRecord transferRecord) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(aq.d, Integer.valueOf(transferRecord.f322));
        contentValues.put("state", transferRecord.f296.toString());
        contentValues.put("bytes_total", Long.valueOf(transferRecord.f306));
        contentValues.put("bytes_current", Long.valueOf(transferRecord.f320));
        return f279.m351(m360(transferRecord.f322), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m359(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("bytes_current", Long.valueOf(j));
        f279.m351(m360(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m354(int i, TransferState transferState) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", transferState.toString());
        if (TransferState.FAILED.equals(transferState)) {
            return f279.m351(m360(i), contentValues, "state not in (?,?,?,?,?) ", new String[]{TransferState.COMPLETED.toString(), TransferState.PENDING_NETWORK_DISCONNECT.toString(), TransferState.PAUSED.toString(), TransferState.CANCELED.toString(), TransferState.WAITING_FOR_NETWORK.toString()});
        }
        return f279.m351(m360(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m361(int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("multipart_id", str);
        f279.m351(m360(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m365(int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("etag", str);
        f279.m351(m360(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Cursor m356(TransferType transferType, TransferState[] transferStateArr) {
        String string;
        String strM34865;
        String[] strArr;
        int length = transferStateArr.length;
        if (length <= 0) {
            f280.mo285("Cannot create a string of 0 or less placeholders.");
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
            strM34865 = C14442.m34865("state in (", string, MotionUtils.EASING_TYPE_FORMAT_END);
            strArr = new String[length];
            while (i2 < length) {
                strArr[i2] = transferStateArr[i2].toString();
                i2++;
            }
        } else {
            String strM34866 = C14442.m34865("state in (", string, ") and type=?");
            String[] strArr2 = new String[length + 1];
            while (i2 < length) {
                strArr2[i2] = transferStateArr[i2].toString();
                i2++;
            }
            strArr2[i2] = transferType.toString();
            strM34865 = strM34866;
            strArr = strArr2;
        }
        TransferDBBase transferDBBase = f279;
        return transferDBBase.m352(transferDBBase.m353(), strM34865, strArr);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static TransferRecord m366(int i) throws Throwable {
        Cursor cursor = null;
        TransferRecord transferRecord = null;
        try {
            Cursor cursorM352 = f279.m352(m360(i), null, null);
            try {
                if (cursorM352.moveToFirst()) {
                    transferRecord = new TransferRecord(i);
                    transferRecord.m377(cursorM352);
                }
                cursorM352.close();
                return transferRecord;
            } catch (Throwable th) {
                th = th;
                cursor = cursorM352;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static long m363(int i) {
        Cursor cursorM352 = null;
        try {
            cursorM352 = f279.m352(m364(i), null, null);
            long j = 0;
            while (cursorM352.moveToNext()) {
                if (TransferState.PART_COMPLETED.equals(TransferState.m382(cursorM352.getString(cursorM352.getColumnIndexOrThrow("state"))))) {
                    j += cursorM352.getLong(cursorM352.getColumnIndexOrThrow("bytes_total"));
                }
            }
            cursorM352.close();
            return j;
        } catch (Throwable th) {
            if (cursorM352 != null) {
                cursorM352.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m358(int i) {
        f279.m350(m360(i));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m362(int i) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorM352 = null;
        try {
            cursorM352 = f279.m352(m364(i), null, null);
            while (cursorM352.moveToNext()) {
                arrayList.add(new PartETag(cursorM352.getInt(cursorM352.getColumnIndexOrThrow("part_num")), cursorM352.getString(cursorM352.getColumnIndexOrThrow("etag"))));
            }
            cursorM352.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorM352 != null) {
                cursorM352.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m357(int i, String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorM352 = null;
        try {
            cursorM352 = f279.m352(m364(i), null, null);
            while (cursorM352.moveToNext()) {
                if (!TransferState.PART_COMPLETED.equals(TransferState.m382(cursorM352.getString(cursorM352.getColumnIndexOrThrow("state"))))) {
                    UploadPartRequest uploadPartRequest = new UploadPartRequest();
                    uploadPartRequest.m670(cursorM352.getInt(cursorM352.getColumnIndexOrThrow(aq.d)));
                    cursorM352.getInt(cursorM352.getColumnIndexOrThrow("main_upload_id"));
                    uploadPartRequest.m674(cursorM352.getString(cursorM352.getColumnIndexOrThrow("bucket_name")));
                    uploadPartRequest.m684(cursorM352.getString(cursorM352.getColumnIndexOrThrow("key")));
                    uploadPartRequest.m678(str);
                    uploadPartRequest.m672(new File(cursorM352.getString(cursorM352.getColumnIndexOrThrow("file"))));
                    uploadPartRequest.m671(cursorM352.getLong(cursorM352.getColumnIndexOrThrow("file_offset")));
                    uploadPartRequest.m677(cursorM352.getInt(cursorM352.getColumnIndexOrThrow("part_num")));
                    uploadPartRequest.m683(cursorM352.getLong(cursorM352.getColumnIndexOrThrow("bytes_total")));
                    cursorM352.getInt(cursorM352.getColumnIndexOrThrow("is_last_part"));
                    arrayList.add(uploadPartRequest);
                }
            }
            cursorM352.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorM352 != null) {
                cursorM352.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Uri m360(int i) {
        return Uri.parse(f279.m353() + "/" + i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Uri m364(int i) {
        return Uri.parse(f279.m353() + "/part/" + i);
    }
}
