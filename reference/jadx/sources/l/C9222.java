package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.k;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۡ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6BX */
/* JADX INFO: loaded from: classes4.dex */
public final class C9222 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5823 f30045;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f30046;

    public C9222(C5823 c5823, String str) {
        this.f30045 = c5823;
        this.f30046 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m24398(C5823 c5823) {
        int iM9136 = 0;
        Object[] objArr = {new C9222(c5823, "mt_file_transfer_create_upload"), new C9222(c5823, "mt_file_transfer_create_download"), new C9222(c5823, "mt_file_transfer_get"), new C9222(c5823, "mt_file_transfer_cancel")};
        ArrayList arrayList = new ArrayList(4);
        while (iM9136 < 4) {
            Object obj = objArr[iM9136];
            iM9136 = C2764.m9136(obj, arrayList, obj, iM9136, 1);
        }
        return C4681.unmodifiableList(arrayList);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return this.f30046;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        String str = this.f30046;
        str.getClass();
        switch (str) {
            case "mt_file_transfer_cancel":
                return "Cancel File Transfer";
            case "mt_file_transfer_create_upload":
                return "Prepare File Upload";
            case "mt_file_transfer_create_download":
                return "Prepare File Download";
            default:
                return "Get File Transfer";
        }
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        String str = this.f30046;
        str.getClass();
        switch (str) {
            case "mt_file_transfer_cancel":
                return "Cancel a file transfer or invalidate a reusable download ticket. Cancellation does not undo changes to the phone file. If the state is publishing, cancellation is no longer possible and the current state is returned. While cancelling, poll mt_file_transfer_get until the state changes. Even when cancelled, inspect non-null data.error.diagnostics before retrying; earlier failures may have changed the destination.";
            case "mt_file_transfer_create_upload":
                return "Prepare a file upload from an MCP client to the device running MT. Use an HTTP client with access to the source file and LAN access to send it as the raw PUT body to the returned url, using its headers and Content-Length equal to size. This call alone does not transfer bytes. The phone destination's parent must exist. Start within 10 minutes. After a lost HTTP response, query mt_file_transfer_get before retrying; completed PUTs do not write again. Failed uploads require a new ticket; inspect the recorded error first because the destination may have changed. No chunked uploads or resume.";
            case "mt_file_transfer_create_download":
                return "Prepare a file download from the device running MT to an MCP client. Use an HTTP client to GET the returned url with its headers and save the response on the receiving device. This call alone does not save the file on that device. Existing allowed regular files can be downloaded directly. Only content that exists solely in an APK workspace needs to be exported or built to a file first. Each GET reads the current file. Full retries are allowed until expiresAt; no Range resume. HEAD returns metadata without starting a download. After GET, use mt_file_transfer_get to check completion and compare its sha256 with the saved local file.";
            default:
                return "Query a file transfer's progress or recorded result, especially after an HTTP timeout. A successful query does not mean the transfer succeeded: inspect data.state and non-null data.error, including its diagnostics before retrying. Results are retained for 10 minutes after a terminal state; service restart invalidates all tickets.";
        }
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        JSONObject jSONObjectObject = JSON.object();
        String str = this.f30046;
        return jSONObjectObject.add("readOnlyHint", "mt_file_transfer_get".equals(str) || "mt_file_transfer_create_download".equals(str)).add("destructiveHint", "mt_file_transfer_create_upload".equals(str));
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObjectObject = JSON.object();
        if (m24399()) {
            jSONObjectObject.add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Non-empty path on the device running MT, absolute or relative to the current Home. Example: incoming/app.apk."));
        } else {
            jSONObjectObject.add("transferId", C10932.m27740("string", "Copy the transferId returned when creating the ticket."));
        }
        if ("mt_file_transfer_create_upload".equals(this.f30046)) {
            jSONObjectObject.add("overwrite", C10932.m27740(ClassTransform.BOOLEAN, "Use false to refuse an existing destination. true allows replacement when the upload finishes, even if the destination changed after this call.")).add("size", C10932.m27740("integer", "Exact source file length in bytes, 0..9007199254740991. Zero creates an empty file.")).add("sha256", C10932.m27740("string", "64 hexadecimal characters for expected content verification, or an empty string to omit the expected digest."));
        }
        return C10932.m27731(jSONObjectObject, "File transfer arguments.");
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObjectPut = m24400().put("description", "Recorded transfer error, or null if none. Independent of the tool call's ok; may remain after cancellation. Inspect diagnostics before retrying.");
        jSONObjectPut.getJSONObject("properties").getJSONObject("retrySameArguments").put("description", "Advice for retrying the failed transfer operation unchanged, not for repeating mt_file_transfer_get. false does not by itself invalidate the ticket; HTTP retries still require a valid ticket and follow the upload/download retry rules.");
        JSONObject jSONObjectAdd = JSON.object().add("transferId", C10932.m27740("string", "Opaque transfer identifier.")).add("direction", C10932.m27738("File direction relative to the device running MT: upload sends to MT; download reads from MT.", "upload", "download")).add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute path on the device running MT.")).add("state", C10932.m27738("Current transfer state. publishing: saving the upload and cannot cancel. completed: upload saved, or download fully sent; does not confirm the receiving device saved it.", "ready", "receiving", "sending", "publishing", "completed", k.j, "cancelling", "cancelled", "expired")).add("bytesTransferred", C10932.m27740("integer", "Bytes received or read for sending in the latest PUT/GET; does not confirm the receiving device saved them.")).add("size", C10932.m27740("integer", "Length in bytes: required upload size, or file length observed when creating the download ticket or starting the latest GET. HEAD does not update this value.")).add("sha256", C10932.m27740("string", "SHA-256 computed from successfully transferred bytes, or empty before success.")).add("expiresAt", C10932.m27740("integer", "Unix milliseconds when new attempts expire; active attempts are not cut off at this deadline.")).add("warnings", C10932.m27742("Warnings about saving the uploaded file.")).add(d.O, C10932.m27739(jSONObjectPut));
        if (m24399()) {
            jSONObjectAdd.put("url", C10932.m27740("string", "Direct LAN HTTP URL for this transfer."));
            jSONObjectAdd.put(e.s, C10932.m27738("HTTP method to transfer the file.", "PUT", "GET"));
            jSONObjectAdd.put("headers", C22783.m51386(JSON.object(), "string", "Temporary transfer credential; do not log or share.", "Authorization", "Headers required by the HTTP file request."));
        }
        return C10932.m27734("File transfer control result.", C10932.m27731(jSONObjectAdd, "Transfer state."), m24400(), C10932.m27733("Use the transferId with get or cancel as needed."));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static JSONObject m24400() {
        return C10932.m27741(C10932.m27731(JSON.object().add("changed", C10932.m27743(ClassTransform.BOOLEAN, "Whether the upload may have changed the phone file; null when not reported.")).add("stateKnown", C10932.m27743(ClassTransform.BOOLEAN, "Whether the final phone file state is known; null when not reported.")).add("warnings", C10932.m27742("Warnings about saving the phone file or removing temporary data after failure.")), "Details about changes to the phone file when an operation failed."));
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5823.m16992(c10186);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        String[] strArr;
        JSONObject jSONObjectM16997;
        boolean z;
        String str = this.f30046;
        if ("mt_file_transfer_create_upload".equals(str)) {
            strArr = new String[]{MotionUtils.EASING_TYPE_PATH, "overwrite", "size", "sha256"};
        } else {
            strArr = m24399() ? new String[]{MotionUtils.EASING_TYPE_PATH} : new String[]{"transferId"};
        }
        C1020 c1020 = new C1020();
        C9749.m25412(jSONObject, c1020, "Invalid file transfer argument", strArr);
        if (m24399()) {
            String strM25411 = C9749.m25411(jSONObject, MotionUtils.EASING_TYPE_PATH, "Invalid path", c1020);
            boolean zEquals = "mt_file_transfer_create_upload".equals(str);
            if (zEquals) {
                JSONValue jSONValue = jSONObject.get("overwrite");
                if (jSONValue == null || !jSONValue.isBoolean()) {
                    throw c1020.mo3210(jSONValue, "Invalid overwrite", "overwrite");
                }
                if (jSONValue.asBoolean()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            jSONObjectM16997 = this.f30045.m16998(strM25411, zEquals, z, zEquals ? C6437.m18216(jSONObject, "size", 0L, 9007199254740991L) : 0L, zEquals ? C9749.m25411(jSONObject, "sha256", "Invalid sha256", c1020) : "");
        } else {
            String strM25412 = C9749.m25411(jSONObject, "transferId", "Invalid transferId", c1020);
            boolean zEquals2 = "mt_file_transfer_cancel".equals(str);
            C5823 c5823 = this.f30045;
            jSONObjectM16997 = zEquals2 ? c5823.m16997(strM25412) : c5823.m17006(strM25412);
        }
        return new C1238(C15300.m36728(jSONObjectM16997, JSON.array()));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m24399() {
        String str = this.f30046;
        return "mt_file_transfer_create_upload".equals(str) || "mt_file_transfer_create_download".equals(str);
    }
}
