package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.google.android.material.datepicker.UtcDates;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import l.C12557;
import l.C9023;

/* JADX INFO: loaded from: classes.dex */
public class QueryStringSigner extends AbstractAWSSigner implements Signer {
    public Date overriddenDate;

    @Override // com.amazonaws.auth.Signer
    public void sign(Request request, AWSCredentials aWSCredentials) {
        sign(request, SignatureVersion.V2, SigningAlgorithm.HmacSHA256, aWSCredentials);
    }

    public void sign(Request request, SignatureVersion signatureVersion, SigningAlgorithm signingAlgorithm, AWSCredentials aWSCredentials) {
        String strCalculateStringToSignV2;
        AWSCredentials aWSCredentialsSanitizeCredentials = sanitizeCredentials(aWSCredentials);
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.m194("AWSAccessKeyId", aWSCredentialsSanitizeCredentials.mo206());
        defaultRequest.m194("SignatureVersion", signatureVersion.toString());
        defaultRequest.m194("Timestamp", getFormattedTimestamp(getTimeOffset(defaultRequest)));
        if (aWSCredentialsSanitizeCredentials instanceof AWSSessionCredentials) {
            addSessionCredentials(defaultRequest, (AWSSessionCredentials) aWSCredentialsSanitizeCredentials);
        }
        if (signatureVersion.equals(SignatureVersion.V1)) {
            strCalculateStringToSignV2 = calculateStringToSignV1(defaultRequest.m195());
        } else if (signatureVersion.equals(SignatureVersion.V2)) {
            defaultRequest.m194("SignatureMethod", signingAlgorithm.toString());
            strCalculateStringToSignV2 = calculateStringToSignV2(defaultRequest);
        } else {
            throw new AmazonClientException("Invalid Signature Version specified");
        }
        defaultRequest.m194("Signature", signAndBase64Encode(strCalculateStringToSignV2, aWSCredentialsSanitizeCredentials.mo207(), signingAlgorithm));
    }

    private String calculateStringToSignV1(Map map) {
        StringBuilder sb = new StringBuilder();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(map);
        for (Map.Entry entry : treeMap.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    private String calculateStringToSignV2(Request request) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        return "POST\n" + getCanonicalizedEndpoint(defaultRequest.m193()) + "\n" + getCanonicalizedResourcePath(defaultRequest) + "\n" + getCanonicalizedQueryString(defaultRequest.m195());
    }

    private String getCanonicalizedResourcePath(Request request) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        String strConcat = "";
        if (defaultRequest.m193().getPath() != null) {
            strConcat = "" + defaultRequest.m193().getPath();
        }
        if (defaultRequest.m177() != null) {
            if (strConcat.length() > 0 && !strConcat.endsWith("/") && !defaultRequest.m177().startsWith("/")) {
                strConcat = strConcat.concat("/");
            }
            StringBuilder sbM23356 = C9023.m23356(strConcat);
            sbM23356.append(defaultRequest.m177());
            strConcat = sbM23356.toString();
        } else if (!strConcat.endsWith("/")) {
            strConcat = strConcat.concat("/");
        }
        if (!strConcat.startsWith("/")) {
            strConcat = "/".concat(strConcat);
        }
        return strConcat.startsWith("//") ? strConcat.substring(1) : strConcat;
    }

    private String getFormattedTimestamp(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(C12557.getTimeZone(UtcDates.UTC));
        Date date = this.overriddenDate;
        if (date != null) {
            return simpleDateFormat.format(date);
        }
        return simpleDateFormat.format(getSignatureDate(j));
    }

    public void overrideDate(Date date) {
        this.overriddenDate = date;
    }

    @Override // com.amazonaws.auth.AbstractAWSSigner
    public void addSessionCredentials(Request request, AWSSessionCredentials aWSSessionCredentials) {
        ((DefaultRequest) request).m194("SecurityToken", aWSSessionCredentials.mo209());
    }
}
