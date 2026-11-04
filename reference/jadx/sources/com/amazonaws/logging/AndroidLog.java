package com.amazonaws.logging;

/* JADX INFO: loaded from: classes.dex */
public class AndroidLog implements Log {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f214;

    public AndroidLog(String str) {
        this.f214 = str;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo287() {
        if (!android.util.Log.isLoggable(this.f214, 3)) {
            return false;
        }
        int i = LogFactory.f216;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo293() {
        if (!android.util.Log.isLoggable(this.f214, 6)) {
            return false;
        }
        int i = LogFactory.f216;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo285(String str) {
        int i = LogFactory.f216;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo286(String str, Exception exc) {
        int i = LogFactory.f216;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo288(String str) {
        int i = LogFactory.f216;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo289(String str, Exception exc) {
        int i = LogFactory.f216;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo290(String str) {
        int i = LogFactory.f216;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo291(String str) {
        int i = LogFactory.f216;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo292(String str, Exception exc) {
        int i = LogFactory.f216;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo294(String str) {
        int i = LogFactory.f216;
        str.getClass();
    }
}
