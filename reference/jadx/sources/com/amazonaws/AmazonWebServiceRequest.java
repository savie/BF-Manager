package com.amazonaws;

import com.amazonaws.event.ProgressListener;
import com.amazonaws.services.s3.model.PutObjectRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class AmazonWebServiceRequest implements Cloneable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ProgressListener f76;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final RequestClientOptions f77 = new RequestClientOptions();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final RequestClientOptions m155() {
        return this.f77;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo153(ProgressListener progressListener) {
        this.f76 = progressListener;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ProgressListener mo152() {
        return this.f76;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m154(PutObjectRequest putObjectRequest) {
        putObjectRequest.f76 = this.f76;
    }

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AmazonWebServiceRequest mo156clone() {
        try {
            AmazonWebServiceRequest amazonWebServiceRequest = (AmazonWebServiceRequest) super.clone();
            amazonWebServiceRequest.getClass();
            return amazonWebServiceRequest;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
        }
    }
}
