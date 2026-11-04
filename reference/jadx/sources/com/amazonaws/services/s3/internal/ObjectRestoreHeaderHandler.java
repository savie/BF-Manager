package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.DateUtils;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class ObjectRestoreHeaderHandler implements HeaderHandler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f478 = Pattern.compile("expiry-date=\"(.*?)\"");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f480 = Pattern.compile("ongoing-request=\"(.*?)\"");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Log f479 = LogFactory.m296(ObjectRestoreHeaderHandler.class);

    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ void mo457(Object obj, HttpResponse httpResponse) {
        m464((ObjectRestoreResult) obj, httpResponse);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m464(ObjectRestoreResult objectRestoreResult, HttpResponse httpResponse) {
        Date dateM763;
        String str = (String) httpResponse.m263().get("x-amz-restore");
        if (str != null) {
            Matcher matcher = f478.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                try {
                    int i = ServiceUtils.f502;
                    dateM763 = DateUtils.m763("EEE, dd MMM yyyy HH:mm:ss z", strGroup);
                } catch (Exception e) {
                    f479.mo289("Error parsing expiry-date from x-amz-restore header.", e);
                    dateM763 = null;
                }
            } else {
                dateM763 = null;
            }
            objectRestoreResult.mo466(dateM763);
            Matcher matcher2 = f480.matcher(str);
            Boolean boolValueOf = matcher2.find() ? Boolean.valueOf(Boolean.parseBoolean(matcher2.group(1))) : null;
            if (boolValueOf != null) {
                objectRestoreResult.mo465(boolValueOf.booleanValue());
            }
        }
    }
}
