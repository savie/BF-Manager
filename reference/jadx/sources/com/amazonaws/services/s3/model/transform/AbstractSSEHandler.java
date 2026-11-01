package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.SSEResultBase;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractSSEHandler extends AbstractHandler implements ServerSideEncryptionResult {
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public abstract ServerSideEncryptionResult mo704();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String m703() {
        ServerSideEncryptionResult serverSideEncryptionResultMo704 = mo704();
        if (serverSideEncryptionResultMo704 == null) {
            return null;
        }
        return ((SSEResultBase) serverSideEncryptionResultMo704).m481();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ۖ */
    public final void mo480(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultMo704 = mo704();
        if (serverSideEncryptionResultMo704 != null) {
            ((SSEResultBase) serverSideEncryptionResultMo704).mo480(str);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String m701() {
        ServerSideEncryptionResult serverSideEncryptionResultMo704 = mo704();
        if (serverSideEncryptionResultMo704 == null) {
            return null;
        }
        return ((SSEResultBase) serverSideEncryptionResultMo704).m484();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ܰ */
    public final void mo485(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultMo704 = mo704();
        if (serverSideEncryptionResultMo704 != null) {
            ((SSEResultBase) serverSideEncryptionResultMo704).mo485(str);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String m702() {
        ServerSideEncryptionResult serverSideEncryptionResultMo704 = mo704();
        if (serverSideEncryptionResultMo704 == null) {
            return null;
        }
        return ((SSEResultBase) serverSideEncryptionResultMo704).m483();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ۚ */
    public final void mo482(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultMo704 = mo704();
        if (serverSideEncryptionResultMo704 != null) {
            ((SSEResultBase) serverSideEncryptionResultMo704).mo482(str);
        }
    }
}
