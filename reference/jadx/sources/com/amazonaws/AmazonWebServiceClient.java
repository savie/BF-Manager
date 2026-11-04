package com.amazonaws;

import com.amazonaws.auth.RegionAwareSigner;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.Classes;
import com.amazonaws.util.StringUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class AmazonWebServiceClient {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Log f69 = LogFactory.m296(AmazonWebServiceClient.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AmazonHttpClient f70;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile URI f71;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile Signer f72;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile String f73;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ClientConfiguration f74;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f75 = new CopyOnWriteArrayList();

    public AmazonWebServiceClient(ClientConfiguration clientConfiguration, UrlHttpClient urlHttpClient) {
        this.f74 = clientConfiguration;
        this.f70 = new AmazonHttpClient(clientConfiguration, urlHttpClient);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo151(String str) {
        if (!str.contains("://")) {
            str = this.f74.m169().toString() + "://" + str;
        }
        try {
            URI uri = new URI(str);
            Signer signerM145 = m145(uri, false);
            synchronized (this) {
                this.f71 = uri;
                this.f72 = signerM145;
            }
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Signer m147(URI uri) {
        return m145(uri, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Signer m145(URI uri, boolean z) {
        Signer signerM218;
        if (uri == null) {
            throw new IllegalArgumentException("Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
        }
        String strM148 = m148();
        String strM733 = AwsHostNameUtils.m733(uri.getHost(), strM148);
        String strM170 = this.f74.m170();
        if (strM170 == null) {
            signerM218 = SignerFactory.m219(strM148, strM733);
        } else {
            signerM218 = SignerFactory.m218(strM170, strM148);
        }
        Signer signer = signerM218;
        if (signer instanceof RegionAwareSigner) {
            RegionAwareSigner regionAwareSigner = (RegionAwareSigner) signer;
            if (strM733 != null && z) {
                regionAwareSigner.setRegionName(strM733);
            }
        }
        synchronized (this) {
            RegionUtils.m417(strM733);
        }
        return signer;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m149(AmazonWebServiceRequest amazonWebServiceRequest) {
        amazonWebServiceRequest.getClass();
        this.f70.getClass();
        AwsSdkMetrics.m300();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m150(AWSRequestMetrics aWSRequestMetrics, DefaultRequest defaultRequest) {
        aWSRequestMetrics.mo726(AWSRequestMetrics.Field.ClientExecuteTime);
        aWSRequestMetrics.m725().mo784();
        defaultRequest.m186().getClass();
        this.f70.getClass();
        AwsSdkMetrics.m300().getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m148() {
        if (this.f73 == null) {
            synchronized (this) {
                if (this.f73 == null) {
                    this.f73 = m146();
                    return this.f73;
                }
            }
        }
        return this.f73;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m146() {
        int i;
        String simpleName = Classes.m755(AmazonWebServiceClient.class, this).getSimpleName();
        String strM195 = ServiceNameFactory.m195(simpleName);
        if (strM195 != null) {
            return strM195;
        }
        int iIndexOf = simpleName.indexOf("JavaClient");
        if (iIndexOf == -1 && (iIndexOf = simpleName.indexOf("Client")) == -1) {
            throw new IllegalStateException("Unrecognized suffix for the AWS http client class name ".concat(simpleName));
        }
        int iIndexOf2 = simpleName.indexOf("Amazon");
        if (iIndexOf2 == -1) {
            iIndexOf2 = simpleName.indexOf("AWS");
            if (iIndexOf2 == -1) {
                throw new IllegalStateException("Unrecognized prefix for the AWS http client class name ".concat(simpleName));
            }
            i = 3;
        } else {
            i = 6;
        }
        if (iIndexOf2 >= iIndexOf) {
            throw new IllegalStateException("Unrecognized AWS http client class name ".concat(simpleName));
        }
        return StringUtils.m783(simpleName.substring(iIndexOf2 + i, iIndexOf));
    }
}
