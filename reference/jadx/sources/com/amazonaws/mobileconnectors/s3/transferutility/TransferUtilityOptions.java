package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class TransferUtilityOptions implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Log f369 = LogFactory.m296(TransferUtilityOptions.class);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f370 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public TransferNetworkConnectionType f371;

    public TransferUtilityOptions() {
        Runtime.getRuntime().availableProcessors();
        this.f371 = TransferNetworkConnectionType.f288;
    }
}
