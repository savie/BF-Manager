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
import l.C19300;
import l.C24522;
import l.C24853;
import l.C7367;
import l.C8113;
import l.C8947;

/* JADX INFO: loaded from: classes.dex */
public class TransferRecord {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Log f295 = LogFactory.m296(TransferRecord.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TransferState f296;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Map f297;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f298;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f299;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f300;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f301;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C24522 f302 = new C24522();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f303;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Future f304;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public TransferType f305;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f306;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f307;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f308;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f309;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f310;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f311;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f312;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f313;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f314;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f315;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public TransferUtilityOptions f316;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f317;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f318;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f319;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f320;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f321;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f322;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f323;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f324;

    public TransferRecord(int i) {
        this.f322 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m377(Cursor cursor) {
        this.f322 = cursor.getInt(cursor.getColumnIndexOrThrow(aq.d));
        this.f303 = cursor.getInt(cursor.getColumnIndexOrThrow("main_upload_id"));
        this.f305 = TransferType.m396(cursor.getString(cursor.getColumnIndexOrThrow("type")));
        this.f296 = TransferState.m382(cursor.getString(cursor.getColumnIndexOrThrow("state")));
        this.f301 = cursor.getString(cursor.getColumnIndexOrThrow("bucket_name"));
        this.f308 = cursor.getString(cursor.getColumnIndexOrThrow("key"));
        cursor.getString(cursor.getColumnIndexOrThrow("version_id"));
        this.f306 = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_total"));
        this.f320 = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_current"));
        cursor.getLong(cursor.getColumnIndexOrThrow("speed"));
        cursor.getInt(cursor.getColumnIndexOrThrow("is_requester_pays"));
        this.f318 = cursor.getInt(cursor.getColumnIndexOrThrow("is_multipart"));
        this.f299 = cursor.getInt(cursor.getColumnIndexOrThrow("is_last_part"));
        cursor.getInt(cursor.getColumnIndexOrThrow("is_encrypted"));
        this.f310 = cursor.getInt(cursor.getColumnIndexOrThrow("part_num"));
        this.f317 = cursor.getString(cursor.getColumnIndexOrThrow("etag"));
        this.f311 = cursor.getString(cursor.getColumnIndexOrThrow("file"));
        this.f300 = cursor.getString(cursor.getColumnIndexOrThrow("multipart_id"));
        cursor.getLong(cursor.getColumnIndexOrThrow("range_start"));
        cursor.getLong(cursor.getColumnIndexOrThrow("range_last"));
        this.f309 = cursor.getLong(cursor.getColumnIndexOrThrow("file_offset"));
        this.f313 = cursor.getString(cursor.getColumnIndexOrThrow("header_content_type"));
        cursor.getString(cursor.getColumnIndexOrThrow("header_content_language"));
        this.f307 = cursor.getString(cursor.getColumnIndexOrThrow("header_content_disposition"));
        this.f324 = cursor.getString(cursor.getColumnIndexOrThrow("header_content_encoding"));
        this.f298 = cursor.getString(cursor.getColumnIndexOrThrow("header_cache_control"));
        cursor.getString(cursor.getColumnIndexOrThrow("header_expire"));
        this.f297 = JsonUtils.m805(cursor.getString(cursor.getColumnIndexOrThrow("user_metadata")));
        cursor.getString(cursor.getColumnIndexOrThrow("expiration_time_rule_id"));
        this.f312 = cursor.getString(cursor.getColumnIndexOrThrow("http_expires_date"));
        this.f319 = cursor.getString(cursor.getColumnIndexOrThrow("sse_algorithm"));
        this.f315 = cursor.getString(cursor.getColumnIndexOrThrow("kms_key"));
        this.f323 = cursor.getString(cursor.getColumnIndexOrThrow("content_md5"));
        this.f321 = cursor.getString(cursor.getColumnIndexOrThrow("canned_acl"));
        this.f314 = cursor.getString(cursor.getColumnIndexOrThrow("header_storage_class"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("transfer_utility_options"));
        try {
            this.f316 = (TransferUtilityOptions) this.f302.m54784(string);
        } catch (C7367 e) {
            f295.mo292("Failed to deserialize: " + string + ", setting to default", e);
            this.f316 = new TransferUtilityOptions();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m378(AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        if (m379() || this.f310 != 0 || TransferState.COMPLETED.equals(this.f296) || !m380(transferStatusUpdater, connectivityManager)) {
            return;
        }
        if (this.f305.equals(TransferType.DOWNLOAD)) {
            this.f304 = TransferThreadPool.m395(new DownloadTask(this, amazonS3, transferStatusUpdater));
        } else {
            this.f304 = TransferThreadPool.m395(new UploadTask(this, amazonS3, transferDBUtil, transferStatusUpdater));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m381(TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        if (m380(transferStatusUpdater, connectivityManager)) {
            return false;
        }
        TransferState transferState = this.f296;
        if (TransferState.COMPLETED.equals(transferState) || TransferState.FAILED.equals(transferState) || TransferState.CANCELED.equals(transferState)) {
            return false;
        }
        if (m379()) {
            this.f304.cancel(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m379() {
        Future future = this.f304;
        return (future == null || future.isDone()) ? false : true;
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("[id:");
        sb.append(this.f322);
        sb.append(",bucketName:");
        sb.append(this.f301);
        sb.append(",key:");
        sb.append(this.f308);
        sb.append(",file:");
        sb.append(this.f311);
        sb.append(",type:");
        sb.append(this.f305);
        sb.append(",bytesTotal:");
        sb.append(this.f306);
        sb.append(",bytesCurrent:");
        sb.append(this.f320);
        sb.append(",fileOffset:");
        sb.append(this.f309);
        sb.append(",state:");
        sb.append(this.f296);
        sb.append(",cannedAcl:");
        sb.append(this.f321);
        sb.append(",mainUploadId:");
        sb.append(this.f303);
        sb.append(",isMultipart:");
        sb.append(this.f318);
        sb.append(",isLastPart:");
        sb.append(this.f299);
        sb.append(",partNumber:");
        sb.append(this.f310);
        sb.append(",multipartId:");
        sb.append(this.f300);
        sb.append(",eTag:");
        sb.append(this.f317);
        sb.append(",storageClass:");
        sb.append(this.f314);
        sb.append(",userMetadata:");
        sb.append(this.f297.toString());
        sb.append(",transferUtilityOptions:");
        TransferUtilityOptions transferUtilityOptions = this.f316;
        C24522 c24522 = this.f302;
        c24522.getClass();
        if (transferUtilityOptions == null) {
            C19300 c19300 = C19300.f62377;
            StringBuilder sb2 = new StringBuilder();
            try {
                c24522.m54789(c19300, c24522.m54787(C24853.m55381(sb2)));
                string = sb2.toString();
            } catch (IOException e) {
                throw new C8113(e);
            }
        } else {
            Class<?> cls = transferUtilityOptions.getClass();
            StringBuilder sb3 = new StringBuilder();
            try {
                c24522.m54788(transferUtilityOptions, cls, c24522.m54787(C24853.m55381(sb3)));
                string = sb3.toString();
            } catch (IOException e2) {
                throw new C8113(e2);
            }
        }
        return C8947.m23910(sb, string, "]");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m380(TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        TransferUtilityOptions transferUtilityOptions;
        TransferNetworkConnectionType transferNetworkConnectionType;
        if (connectivityManager == null || (transferUtilityOptions = this.f316) == null || (transferNetworkConnectionType = transferUtilityOptions.f371) == null || transferNetworkConnectionType.m371(connectivityManager)) {
            return true;
        }
        f295.mo288("Network Connection " + this.f316.f371 + " is not available.");
        transferStatusUpdater.m389(this.f322, TransferState.WAITING_FOR_NETWORK);
        return false;
    }
}
