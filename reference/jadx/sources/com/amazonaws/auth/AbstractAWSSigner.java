package com.amazonaws.auth;

import com.alipay.sdk.m.w.a;
import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.internal.SdkDigestInputStream;
import com.amazonaws.util.Base64;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import l.C16076;
import l.C3188;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAWSSigner implements Signer {
    public static final int BUFFER_SIZE_MULTIPLIER = 5;
    public static final int DEFAULT_BUFFER_SIZE = 1024;
    public static final int TIME_MILLISEC = 1000;
    public static final ThreadLocal SHA256_MESSAGE_DIGEST = new ThreadLocal() { // from class: com.amazonaws.auth.AbstractAWSSigner.1
        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            try {
                return MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
            } catch (NoSuchAlgorithmException e) {
                throw new AmazonClientException("Unable to get SHA256 Function" + e.getMessage(), e);
            }
        }
    };
    public static final String EMPTY_STRING_SHA256_HEX = BinaryUtils.m744(m205(""));

    public abstract void addSessionCredentials(Request request, AWSSessionCredentials aWSSessionCredentials);

    public String signAndBase64Encode(String str, String str2, SigningAlgorithm signingAlgorithm) {
        return signAndBase64Encode(str.getBytes(StringUtils.f834), str2, signingAlgorithm);
    }

    public String signAndBase64Encode(byte[] bArr, String str, SigningAlgorithm signingAlgorithm) {
        try {
            return Base64.m737(sign(bArr, str.getBytes(StringUtils.f834), signingAlgorithm));
        } catch (Exception e) {
            throw new AmazonClientException(C16076.m38224(e, new StringBuilder("Unable to calculate a request signature: ")), e);
        }
    }

    public byte[] sign(String str, byte[] bArr, SigningAlgorithm signingAlgorithm) {
        try {
            return sign(str.getBytes(StringUtils.f834), bArr, signingAlgorithm);
        } catch (Exception e) {
            throw new AmazonClientException(C16076.m38224(e, new StringBuilder("Unable to calculate a request signature: ")), e);
        }
    }

    public byte[] sign(byte[] bArr, byte[] bArr2, SigningAlgorithm signingAlgorithm) {
        try {
            Mac mac = Mac.getInstance(signingAlgorithm.toString());
            mac.init(new SecretKeySpec(bArr2, signingAlgorithm.toString()));
            return mac.doFinal(bArr);
        } catch (Exception e) {
            throw new AmazonClientException(C16076.m38224(e, new StringBuilder("Unable to calculate a request signature: ")), e);
        }
    }

    public byte[] hash(String str) {
        return m205(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m205(String str) {
        try {
            MessageDigest messageDigestM204 = m204();
            messageDigestM204.update(str.getBytes(StringUtils.f834));
            return messageDigestM204.digest();
        } catch (Exception e) {
            throw new AmazonClientException(C16076.m38224(e, new StringBuilder("Unable to compute hash while signing request: ")), e);
        }
    }

    public byte[] hash(InputStream inputStream) {
        try {
            SdkDigestInputStream sdkDigestInputStream = new SdkDigestInputStream(inputStream, m204());
            while (sdkDigestInputStream.read(new byte[1024]) > -1) {
            }
            return sdkDigestInputStream.getMessageDigest().digest();
        } catch (Exception e) {
            throw new AmazonClientException(C16076.m38224(e, new StringBuilder("Unable to compute hash while signing request: ")), e);
        }
    }

    public byte[] hash(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception e) {
            throw new AmazonClientException(C16076.m38224(e, new StringBuilder("Unable to compute hash while signing request: ")), e);
        }
    }

    public String getCanonicalizedQueryString(Map map) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : map.entrySet()) {
            treeMap.put(HttpUtils.m769((String) entry.getKey(), false), HttpUtils.m769((String) entry.getValue(), false));
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append((String) entry2.getValue());
            if (it.hasNext()) {
                sb.append(a.p);
            }
        }
        return sb.toString();
    }

    public String getCanonicalizedQueryString(Request request) {
        return HttpUtils.m771(request) ? "" : getCanonicalizedQueryString(((DefaultRequest) request).m185());
    }

    public byte[] getBinaryRequestPayload(Request request) {
        if (HttpUtils.m771(request)) {
            String strM767 = HttpUtils.m767(request);
            return strM767 == null ? new byte[0] : strM767.getBytes(StringUtils.f834);
        }
        return getBinaryRequestPayloadWithoutQueryParams(request);
    }

    public String getRequestPayload(Request request) {
        return newString(getBinaryRequestPayload(request));
    }

    public String getRequestPayloadWithoutQueryParams(Request request) {
        return newString(getBinaryRequestPayloadWithoutQueryParams(request));
    }

    public byte[] getBinaryRequestPayloadWithoutQueryParams(Request request) {
        InputStream binaryRequestPayloadStreamWithoutQueryParams = getBinaryRequestPayloadStreamWithoutQueryParams(request);
        try {
            binaryRequestPayloadStreamWithoutQueryParams.mark(-1);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[5120];
            while (true) {
                int i = binaryRequestPayloadStreamWithoutQueryParams.read(bArr);
                if (i == -1) {
                    byteArrayOutputStream.close();
                    binaryRequestPayloadStreamWithoutQueryParams.reset();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            throw new AmazonClientException(C16076.m38224(e, new StringBuilder("Unable to read request payload to sign request: ")), e);
        }
    }

    public InputStream getBinaryRequestPayloadStream(Request request) {
        if (HttpUtils.m771(request)) {
            String strM767 = HttpUtils.m767(request);
            if (strM767 == null) {
                return new ByteArrayInputStream(new byte[0]);
            }
            return new ByteArrayInputStream(strM767.getBytes(StringUtils.f834));
        }
        return getBinaryRequestPayloadStreamWithoutQueryParams(request);
    }

    public InputStream getBinaryRequestPayloadStreamWithoutQueryParams(Request request) {
        try {
            DefaultRequest defaultRequest = (DefaultRequest) request;
            InputStream inputStreamM172 = defaultRequest.m172();
            if (inputStreamM172 == null) {
                return new ByteArrayInputStream(new byte[0]);
            }
            if (inputStreamM172.markSupported()) {
                return defaultRequest.m172();
            }
            throw new AmazonClientException("Unable to read request payload to sign request.");
        } catch (Exception e) {
            throw new AmazonClientException(C16076.m38224(e, new StringBuilder("Unable to read request payload to sign request: ")), e);
        }
    }

    public String getCanonicalizedResourcePath(String str) {
        return getCanonicalizedResourcePath(str, true);
    }

    public String getCanonicalizedResourcePath(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return "/";
        }
        if (z) {
            str = HttpUtils.m769(str, true);
        }
        return str.startsWith("/") ? str : "/".concat(str);
    }

    public String getCanonicalizedEndpoint(URI uri) {
        String strM783 = StringUtils.m783(uri.getHost());
        if (!HttpUtils.m770(uri)) {
            return strM783;
        }
        StringBuilder sbM10405 = C3188.m10405(strM783, ":");
        sbM10405.append(uri.getPort());
        return sbM10405.toString();
    }

    public AWSCredentials sanitizeCredentials(AWSCredentials aWSCredentials) {
        String strMo200;
        String strMo201;
        String strMo203;
        synchronized (aWSCredentials) {
            strMo200 = aWSCredentials.mo200();
            strMo201 = aWSCredentials.mo201();
            strMo203 = aWSCredentials instanceof AWSSessionCredentials ? ((AWSSessionCredentials) aWSCredentials).mo203() : null;
        }
        if (strMo201 != null) {
            strMo201 = strMo201.trim();
        }
        if (strMo200 != null) {
            strMo200 = strMo200.trim();
        }
        if (strMo203 != null) {
            strMo203 = strMo203.trim();
        }
        if (aWSCredentials instanceof AWSSessionCredentials) {
            return new BasicSessionCredentials(strMo200, strMo201, strMo203);
        }
        return new BasicAWSCredentials(strMo200, strMo201);
    }

    public String newString(byte[] bArr) {
        return new String(bArr, StringUtils.f834);
    }

    public Date getSignatureDate(long j) {
        Date date = new Date();
        return j != 0 ? new Date(date.getTime() - (j * 1000)) : date;
    }

    public long getTimeOffset(Request request) {
        ((DefaultRequest) request).getClass();
        if (SDKGlobalConfiguration.m193() != 0) {
            return SDKGlobalConfiguration.m193();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static MessageDigest m204() {
        MessageDigest messageDigest = (MessageDigest) SHA256_MESSAGE_DIGEST.get();
        messageDigest.reset();
        return messageDigest;
    }
}
