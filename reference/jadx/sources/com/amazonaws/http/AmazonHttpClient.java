package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Response;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.handlers.CredentialsRequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.s3.internal.S3ExecutionContext;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.DateUtils;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AmazonHttpClient {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ClientConfiguration f170;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HttpRequestFactory f171 = new HttpRequestFactory();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final UrlHttpClient f172;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Log f169 = LogFactory.m297("com.amazonaws.request");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Log f168 = LogFactory.m296(AmazonHttpClient.class);

    public AmazonHttpClient(ClientConfiguration clientConfiguration, UrlHttpClient urlHttpClient) {
        this.f170 = clientConfiguration;
        this.f172 = urlHttpClient;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Response m246(DefaultRequest defaultRequest, HttpResponseHandler httpResponseHandler, HttpResponseHandler httpResponseHandler2, S3ExecutionContext s3ExecutionContext) {
        List<RequestHandler2> listM250 = s3ExecutionContext.m250();
        if (listM250 == null) {
            listM250 = Collections.EMPTY_LIST;
        } else {
            for (RequestHandler2 requestHandler2 : listM250) {
                if (requestHandler2 instanceof CredentialsRequestHandler) {
                    ((CredentialsRequestHandler) requestHandler2).m228(s3ExecutionContext.m251());
                }
                requestHandler2.mo235(defaultRequest);
            }
        }
        AWSRequestMetrics aWSRequestMetricsM248 = s3ExecutionContext.m248();
        try {
            Response responseM247 = m247(defaultRequest, httpResponseHandler, httpResponseHandler2, s3ExecutionContext);
            aWSRequestMetricsM248.m725().mo784();
            Iterator it = listM250.iterator();
            while (it.hasNext()) {
                ((RequestHandler2) it.next()).mo237(defaultRequest, responseM247);
            }
            return responseM247;
        } catch (AmazonClientException e) {
            Iterator it2 = listM250.iterator();
            while (it2.hasNext()) {
                ((RequestHandler2) it2.next()).mo236(defaultRequest, e);
            }
            throw e;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12691. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final com.amazonaws.Response m247(com.amazonaws.DefaultRequest r29, com.amazonaws.http.HttpResponseHandler r30, com.amazonaws.http.HttpResponseHandler r31, com.amazonaws.services.s3.internal.S3ExecutionContext r32) {
        /*
            Method dump skipped, instruction units count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.http.AmazonHttpClient.m247(com.amazonaws.DefaultRequest, com.amazonaws.http.HttpResponseHandler, com.amazonaws.http.HttpResponseHandler, com.amazonaws.services.s3.internal.S3ExecutionContext):com.amazonaws.Response");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m243(DefaultRequest defaultRequest, Exception exc) {
        if (defaultRequest.m172() == null) {
            return;
        }
        if (!defaultRequest.m172().markSupported()) {
            throw new AmazonClientException("Encountered an exception and stream is not resettable", exc);
        }
        try {
            defaultRequest.m172().reset();
        } catch (IOException unused) {
            throw new AmazonClientException("Encountered an exception and couldn't reset the stream to retry", exc);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m242(String str, String str2) {
        if (str.contains(str2)) {
            return str;
        }
        return str.trim() + " " + str2.trim();
    }

    public final void finalize() throws Throwable {
        this.f172.getClass();
        super.finalize();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m244(AmazonWebServiceRequest amazonWebServiceRequest, InputStream inputStream, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) {
        int i2 = i - 1;
        this.f170.getClass();
        if (i2 < retryPolicy.m425()) {
            if (inputStream != null && !inputStream.markSupported()) {
                Log log = f168;
                if (log.mo287()) {
                    log.mo291("Content not repeatable");
                }
            } else {
                return retryPolicy.m424().mo422(amazonClientException, i2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m245(HttpResponse httpResponse) {
        int iM264 = httpResponse.m264();
        String str = (String) httpResponse.m263().get("Location");
        return (iM264 != 307 || str == null || str.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m241(HttpResponseHandler httpResponseHandler, HttpResponse httpResponse, S3ExecutionContext s3ExecutionContext) throws IOException {
        try {
            AWSRequestMetrics aWSRequestMetricsM248 = s3ExecutionContext.m248();
            AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ResponseProcessingTime;
            aWSRequestMetricsM248.mo729(field);
            try {
                AmazonWebServiceResponse amazonWebServiceResponse = (AmazonWebServiceResponse) httpResponseHandler.mo270(httpResponse);
                aWSRequestMetricsM248.mo726(field);
                if (amazonWebServiceResponse == null) {
                    throw new RuntimeException("Unable to unmarshall response metadata. Response Code: " + httpResponse.m264() + ", Response Text: " + httpResponse.m262());
                }
                Log log = f169;
                if (log.mo287()) {
                    log.mo291("Received successful response: " + httpResponse.m264() + ", AWS Request ID: " + amazonWebServiceResponse.m157());
                }
                aWSRequestMetricsM248.mo728(AWSRequestMetrics.Field.AWSRequestID, amazonWebServiceResponse.m157());
                return amazonWebServiceResponse.m160();
            } catch (Throwable th) {
                aWSRequestMetricsM248.mo726(AWSRequestMetrics.Field.ResponseProcessingTime);
                throw th;
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new AmazonClientException("Unable to unmarshall response (" + e2.getMessage() + "). Response Code: " + httpResponse.m264() + ", Response Text: " + httpResponse.m262(), e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AmazonServiceException m240(DefaultRequest defaultRequest, HttpResponseHandler httpResponseHandler, HttpResponse httpResponse) throws IOException {
        AmazonServiceException amazonServiceException;
        int iM264 = httpResponse.m264();
        try {
            amazonServiceException = (AmazonServiceException) httpResponseHandler.mo270(httpResponse);
            f169.mo291("Received error response: " + amazonServiceException.toString());
        } catch (Exception e) {
            if (iM264 == 413) {
                amazonServiceException = new AmazonServiceException("Request entity too large");
                amazonServiceException.m144(defaultRequest.m181());
                amazonServiceException.m137(413);
                AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
                amazonServiceException.m138("Request entity too large");
            } else if (iM264 == 503 && "Service Unavailable".equalsIgnoreCase(httpResponse.m262())) {
                amazonServiceException = new AmazonServiceException("Service unavailable");
                amazonServiceException.m144(defaultRequest.m181());
                amazonServiceException.m137(503);
                AmazonServiceException.ErrorType errorType2 = AmazonServiceException.ErrorType.Client;
                amazonServiceException.m138("Service unavailable");
            } else {
                if (e instanceof IOException) {
                    throw ((IOException) e);
                }
                throw new AmazonClientException("Unable to unmarshall error response (" + e.getMessage() + "). Response Code: " + iM264 + ", Response Text: " + httpResponse.m262() + ", Response Headers: " + httpResponse.m263(), e);
            }
        }
        amazonServiceException.m137(iM264);
        amazonServiceException.m144(defaultRequest.m181());
        amazonServiceException.fillInStackTrace();
        return amazonServiceException;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m238(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) {
        int i2 = i - 2;
        long jMo421 = retryPolicy.m423().mo421(i2);
        Log log = f168;
        if (log.mo287()) {
            log.mo291("Retriable error detected, will retry in " + jMo421 + "ms, attempt number: " + i2);
        }
        try {
            Thread.sleep(jMo421);
            return jMo421;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AmazonClientException(e.getMessage(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[Catch: RuntimeException -> 0x005c, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x005c, blocks: (B:4:0x0014, B:11:0x0024, B:13:0x0036, B:15:0x0041, B:14:0x003b), top: B:26:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0036 A[Catch: RuntimeException -> 0x005c, TryCatch #1 {RuntimeException -> 0x005c, blocks: (B:4:0x0014, B:11:0x0024, B:13:0x0036, B:15:0x0041, B:14:0x003b), top: B:26:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003b A[Catch: RuntimeException -> 0x005c, TryCatch #1 {RuntimeException -> 0x005c, blocks: (B:4:0x0014, B:11:0x0024, B:13:0x0036, B:15:0x0041, B:14:0x003b), top: B:26:0x0014 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.StringBuilder] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m239(HttpResponse httpResponse, AmazonServiceException amazonServiceException) {
        Date dateM763;
        String message;
        int iIndexOf;
        Date date = new Date();
        ?? r4 = (String) httpResponse.m263().get("Date");
        ?? r1 = 0;
        try {
            if (r4 != 0) {
                try {
                    if (!r4.isEmpty()) {
                        dateM763 = DateUtils.m763("EEE, dd MMM yyyy HH:mm:ss z", (String) r4);
                    } else {
                        message = amazonServiceException.getMessage();
                        int iIndexOf2 = message.indexOf(MotionUtils.EASING_TYPE_FORMAT_START);
                        if (message.contains(" + 15")) {
                            iIndexOf = message.indexOf(" + 15");
                        } else {
                            iIndexOf = message.indexOf(" - 15");
                        }
                        dateM763 = DateUtils.m763(AWS4Signer.TIME_PATTERN, message.substring(iIndexOf2 + 1, iIndexOf));
                    }
                } catch (RuntimeException e) {
                    e = e;
                    f168.mo289("Unable to parse clock skew offset from response: " + r1, e);
                    return 0L;
                }
            } else {
                message = amazonServiceException.getMessage();
                int iIndexOf3 = message.indexOf(MotionUtils.EASING_TYPE_FORMAT_START);
                if (message.contains(" + 15")) {
                    iIndexOf = message.indexOf(" + 15");
                } else {
                    iIndexOf = message.indexOf(" - 15");
                }
                dateM763 = DateUtils.m763(AWS4Signer.TIME_PATTERN, message.substring(iIndexOf3 + 1, iIndexOf));
            }
            long time = date.getTime() - dateM763.getTime();
            r4 = 1000;
            return time / 1000;
        } catch (RuntimeException e2) {
            e = e2;
            r1 = r4;
        }
    }
}
