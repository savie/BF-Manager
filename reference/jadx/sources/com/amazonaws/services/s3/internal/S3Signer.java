package com.amazonaws.services.s3.internal;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.AbstractAWSSigner;
import com.amazonaws.auth.SigningAlgorithm;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.HttpUtils;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class S3Signer extends AbstractAWSSigner {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Log f492 = LogFactory.m296(S3Signer.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set f493;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f494;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f495;

    public S3Signer() {
        this.f495 = null;
        this.f494 = null;
        this.f493 = null;
    }

    public S3Signer(String str, String str2) {
        if (str2 == null) {
            throw new IllegalArgumentException("Parameter resourcePath is empty");
        }
        this.f495 = str;
        this.f494 = str2;
        this.f493 = null;
    }

    @Override // com.amazonaws.auth.Signer
    public final void sign(Request request, AWSCredentials aWSCredentials) {
        String str = this.f494;
        if (str == null) {
            throw new UnsupportedOperationException("Cannot sign a request using a dummy S3Signer instance with no resource path");
        }
        String strMo201 = aWSCredentials.mo201();
        Log log = f492;
        if (strMo201 == null) {
            log.mo291("Canonical string will not be signed, as no AWS Secret Key was provided");
            return;
        }
        AWSCredentials aWSCredentialsSanitizeCredentials = sanitizeCredentials(aWSCredentials);
        if (aWSCredentialsSanitizeCredentials instanceof AWSSessionCredentials) {
            addSessionCredentials(request, (AWSSessionCredentials) aWSCredentialsSanitizeCredentials);
        }
        DefaultRequest defaultRequest = (DefaultRequest) request;
        String strM768 = HttpUtils.m768(defaultRequest.m187().getPath(), str, true);
        Date signatureDate = getSignatureDate(getTimeOffset(defaultRequest));
        int i = ServiceUtils.f502;
        defaultRequest.m177("Date", DateUtils.m761("EEE, dd MMM yyyy HH:mm:ss z", signatureDate));
        String strM467 = RestUtils.m467(this.f495, strM768, defaultRequest, this.f493);
        log.mo291("Calculated string to sign:\n\"" + strM467 + "\"");
        defaultRequest.m177("Authorization", "AWS " + aWSCredentialsSanitizeCredentials.mo200() + ":" + super.signAndBase64Encode(strM467, aWSCredentialsSanitizeCredentials.mo201(), SigningAlgorithm.HmacSHA1));
    }

    @Override // com.amazonaws.auth.AbstractAWSSigner
    public final void addSessionCredentials(Request request, AWSSessionCredentials aWSSessionCredentials) {
        ((DefaultRequest) request).m177("x-amz-security-token", aWSSessionCredentials.mo203());
    }
}
