package com.amazonaws.mobileconnectors.s3.transferutility;

import android.database.Cursor;
import android.net.ConnectivityManager;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.util.json.JsonUtils;
import com.umeng.analytics.pro.aq;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Future;
import l.C22003;
import l.C22697;
import l.C3221;
import l.C6044;
import l.C7975;
import l.C9573;

/* JADX INFO: loaded from: classes.dex */
public class TransferRecord {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Log f305 = LogFactory.m302(TransferRecord.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f306;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f307;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f308;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f309;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f310;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f311;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public TransferType f312;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f313;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f314;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f315;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f316;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f317;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Map f318;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f319;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Future f320;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C6044 f321 = new C6044();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f322;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f323;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f324;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TransferState f325;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TransferUtilityOptions f326;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f327;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f328;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f329;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f330;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f331;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f332;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f333;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f334;

    public TransferRecord(int i) {
        this.f328 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m383(Cursor cursor) {
        this.f328 = cursor.getInt(cursor.getColumnIndexOrThrow(aq.d));
        this.f317 = cursor.getInt(cursor.getColumnIndexOrThrow("main_upload_id"));
        this.f312 = TransferType.m402(cursor.getString(cursor.getColumnIndexOrThrow("type")));
        this.f325 = TransferState.m388(cursor.getString(cursor.getColumnIndexOrThrow("state")));
        this.f310 = cursor.getString(cursor.getColumnIndexOrThrow("bucket_name"));
        this.f316 = cursor.getString(cursor.getColumnIndexOrThrow("key"));
        cursor.getString(cursor.getColumnIndexOrThrow("version_id"));
        this.f319 = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_total"));
        this.f322 = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_current"));
        cursor.getLong(cursor.getColumnIndexOrThrow("speed"));
        cursor.getInt(cursor.getColumnIndexOrThrow("is_requester_pays"));
        this.f329 = cursor.getInt(cursor.getColumnIndexOrThrow("is_multipart"));
        this.f315 = cursor.getInt(cursor.getColumnIndexOrThrow("is_last_part"));
        cursor.getInt(cursor.getColumnIndexOrThrow("is_encrypted"));
        this.f324 = cursor.getInt(cursor.getColumnIndexOrThrow("part_num"));
        this.f311 = cursor.getString(cursor.getColumnIndexOrThrow("etag"));
        this.f333 = cursor.getString(cursor.getColumnIndexOrThrow("file"));
        this.f331 = cursor.getString(cursor.getColumnIndexOrThrow("multipart_id"));
        cursor.getLong(cursor.getColumnIndexOrThrow("range_start"));
        cursor.getLong(cursor.getColumnIndexOrThrow("range_last"));
        this.f307 = cursor.getLong(cursor.getColumnIndexOrThrow("file_offset"));
        this.f323 = cursor.getString(cursor.getColumnIndexOrThrow("header_content_type"));
        cursor.getString(cursor.getColumnIndexOrThrow("header_content_language"));
        this.f313 = cursor.getString(cursor.getColumnIndexOrThrow("header_content_disposition"));
        this.f334 = cursor.getString(cursor.getColumnIndexOrThrow("header_content_encoding"));
        this.f309 = cursor.getString(cursor.getColumnIndexOrThrow("header_cache_control"));
        cursor.getString(cursor.getColumnIndexOrThrow("header_expire"));
        this.f318 = JsonUtils.m811(cursor.getString(cursor.getColumnIndexOrThrow("user_metadata")));
        cursor.getString(cursor.getColumnIndexOrThrow("expiration_time_rule_id"));
        this.f327 = cursor.getString(cursor.getColumnIndexOrThrow("http_expires_date"));
        this.f330 = cursor.getString(cursor.getColumnIndexOrThrow("sse_algorithm"));
        this.f306 = cursor.getString(cursor.getColumnIndexOrThrow("kms_key"));
        this.f314 = cursor.getString(cursor.getColumnIndexOrThrow("content_md5"));
        this.f308 = cursor.getString(cursor.getColumnIndexOrThrow("canned_acl"));
        this.f332 = cursor.getString(cursor.getColumnIndexOrThrow("header_storage_class"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("transfer_utility_options"));
        try {
            this.f326 = (TransferUtilityOptions) this.f321.m16438(string);
        } catch (C22003 e) {
            f305.mo299("Failed to deserialize: " + string + ", setting to default", e);
            this.f326 = new TransferUtilityOptions();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m384(AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        if (m385() || this.f324 != 0 || TransferState.COMPLETED.equals(this.f325) || !m386(transferStatusUpdater, connectivityManager)) {
            return;
        }
        if (this.f312.equals(TransferType.DOWNLOAD)) {
            this.f320 = TransferThreadPool.m401(new DownloadTask(this, amazonS3, transferStatusUpdater));
        } else {
            this.f320 = TransferThreadPool.m401(new UploadTask(this, amazonS3, transferDBUtil, transferStatusUpdater));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m387(TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        if (m386(transferStatusUpdater, connectivityManager)) {
            return false;
        }
        TransferState transferState = this.f325;
        if (TransferState.COMPLETED.equals(transferState) || TransferState.FAILED.equals(transferState) || TransferState.CANCELED.equals(transferState)) {
            return false;
        }
        if (m385()) {
            this.f320.cancel(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m385() {
        Future future = this.f320;
        return (future == null || future.isDone()) ? false : true;
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("[id:");
        sb.append(this.f328);
        sb.append(",bucketName:");
        sb.append(this.f310);
        sb.append(",key:");
        sb.append(this.f316);
        sb.append(",file:");
        sb.append(this.f333);
        sb.append(",type:");
        sb.append(this.f312);
        sb.append(",bytesTotal:");
        sb.append(this.f319);
        sb.append(",bytesCurrent:");
        sb.append(this.f322);
        sb.append(",fileOffset:");
        sb.append(this.f307);
        sb.append(",state:");
        sb.append(this.f325);
        sb.append(",cannedAcl:");
        sb.append(this.f308);
        sb.append(",mainUploadId:");
        sb.append(this.f317);
        sb.append(",isMultipart:");
        sb.append(this.f329);
        sb.append(",isLastPart:");
        sb.append(this.f315);
        sb.append(",partNumber:");
        sb.append(this.f324);
        sb.append(",multipartId:");
        sb.append(this.f331);
        sb.append(",eTag:");
        sb.append(this.f311);
        sb.append(",storageClass:");
        sb.append(this.f332);
        sb.append(",userMetadata:");
        sb.append(this.f318.toString());
        sb.append(",transferUtilityOptions:");
        TransferUtilityOptions transferUtilityOptions = this.f326;
        C6044 c6044 = this.f321;
        c6044.getClass();
        if (transferUtilityOptions == null) {
            C3221 c3221 = C3221.f12023;
            StringBuilder sb2 = new StringBuilder();
            try {
                c6044.m16443(c3221, c6044.m16439(C7975.m21040(sb2)));
                string = sb2.toString();
            } catch (IOException e) {
                throw new C9573(e);
            }
        } else {
            Class<?> cls = transferUtilityOptions.getClass();
            StringBuilder sb3 = new StringBuilder();
            try {
                c6044.m16442(transferUtilityOptions, cls, c6044.m16439(C7975.m21040(sb3)));
                string = sb3.toString();
            } catch (IOException e2) {
                throw new C9573(e2);
            }
        }
        return C22697.m50267(sb, string, "]");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m386(TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        TransferUtilityOptions transferUtilityOptions;
        TransferNetworkConnectionType transferNetworkConnectionType;
        if (connectivityManager == null || (transferUtilityOptions = this.f326) == null || (transferNetworkConnectionType = transferUtilityOptions.f381) == null || transferNetworkConnectionType.m377(connectivityManager)) {
            return true;
        }
        f305.mo296("Network Connection " + this.f326.f381 + " is not available.");
        transferStatusUpdater.m395(this.f328, TransferState.WAITING_FOR_NETWORK);
        return false;
    }
}
