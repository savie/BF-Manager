package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class AWSCredentialsProviderChain implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Log f114 = LogFactory.m296(AWSCredentialsProviderChain.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedList f115 = new LinkedList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f116 = true;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AWSCredentialsProvider f117;

    public AWSCredentialsProviderChain(AWSCredentialsProvider... aWSCredentialsProviderArr) {
        if (aWSCredentialsProviderArr.length == 0) {
            throw new IllegalArgumentException("No credential providers specified");
        }
        for (AWSCredentialsProvider aWSCredentialsProvider : aWSCredentialsProviderArr) {
            this.f115.add(aWSCredentialsProvider);
        }
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    /* JADX INFO: renamed from: ۙ */
    public final AWSCredentials mo202() {
        AWSCredentialsProvider aWSCredentialsProvider;
        Log log = f114;
        if (this.f116 && (aWSCredentialsProvider = this.f117) != null) {
            return aWSCredentialsProvider.mo202();
        }
        for (AWSCredentialsProvider aWSCredentialsProvider2 : this.f115) {
            try {
                AWSCredentials aWSCredentialsMo202 = aWSCredentialsProvider2.mo202();
                if (aWSCredentialsMo202.mo200() != null && aWSCredentialsMo202.mo201() != null) {
                    log.mo291("Loading credentials from " + aWSCredentialsProvider2.toString());
                    this.f117 = aWSCredentialsProvider2;
                    return aWSCredentialsMo202;
                }
            } catch (Exception e) {
                log.mo291("Unable to load credentials from " + aWSCredentialsProvider2.toString() + ": " + e.getMessage());
            }
        }
        throw new AmazonClientException("Unable to load AWS credentials from any provider in the chain");
    }
}
