package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.SSEResultBase;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractSSEHandler extends AbstractHandler implements ServerSideEncryptionResult {
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract ServerSideEncryptionResult mo696();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String m695() {
        ServerSideEncryptionResult serverSideEncryptionResultMo696 = mo696();
        if (serverSideEncryptionResultMo696 == null) {
            return null;
        }
        return ((SSEResultBase) serverSideEncryptionResultMo696).m474();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ᩸ */
    public final void mo479(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultMo696 = mo696();
        if (serverSideEncryptionResultMo696 != null) {
            ((SSEResultBase) serverSideEncryptionResultMo696).mo479(str);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String m698() {
        ServerSideEncryptionResult serverSideEncryptionResultMo696 = mo696();
        if (serverSideEncryptionResultMo696 == null) {
            return null;
        }
        return ((SSEResultBase) serverSideEncryptionResultMo696).m477();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ᩷ */
    public final void mo478(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultMo696 = mo696();
        if (serverSideEncryptionResultMo696 != null) {
            ((SSEResultBase) serverSideEncryptionResultMo696).mo478(str);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String m697() {
        ServerSideEncryptionResult serverSideEncryptionResultMo696 = mo696();
        if (serverSideEncryptionResultMo696 == null) {
            return null;
        }
        return ((SSEResultBase) serverSideEncryptionResultMo696).m475();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ᩴ */
    public final void mo476(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultMo696 = mo696();
        if (serverSideEncryptionResultMo696 != null) {
            ((SSEResultBase) serverSideEncryptionResultMo696).mo476(str);
        }
    }
}
