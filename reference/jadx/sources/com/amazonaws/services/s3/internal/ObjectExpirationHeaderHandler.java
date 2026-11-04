package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.DateUtils;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class ObjectExpirationHeaderHandler implements HeaderHandler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f475 = Pattern.compile("expiry-date=\"(.*?)\"");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f477 = Pattern.compile("rule-id=\"(.*?)\"");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Log f476 = LogFactory.m296(ObjectExpirationHeaderHandler.class);

    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ void mo457(Object obj, HttpResponse httpResponse) {
        m461((ObjectExpirationResult) obj, httpResponse);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m461(ObjectExpirationResult objectExpirationResult, HttpResponse httpResponse) {
        Date dateM763;
        String str = (String) httpResponse.m263().get("x-amz-expiration");
        if (str != null) {
            Matcher matcher = f475.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                try {
                    int i = ServiceUtils.f502;
                    dateM763 = DateUtils.m763("EEE, dd MMM yyyy HH:mm:ss z", strGroup);
                } catch (Exception e) {
                    f476.mo289("Error parsing expiry-date from x-amz-expiration header.", e);
                    dateM763 = null;
                }
            } else {
                dateM763 = null;
            }
            objectExpirationResult.mo462(dateM763);
            Matcher matcher2 = f477.matcher(str);
            objectExpirationResult.mo463(matcher2.find() ? matcher2.group(1) : null);
        }
    }
}
