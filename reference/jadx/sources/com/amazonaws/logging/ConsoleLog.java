package com.amazonaws.logging;

/* JADX INFO: loaded from: classes.dex */
public final class ConsoleLog implements Log {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f215;

    public ConsoleLog(String str) {
        this.f215 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m295(LogFactory.Level level, Object obj, Exception exc) {
        System.out.printf("%s/%s: %s\n", this.f215, level.name(), obj);
        if (exc != null) {
            System.out.println(exc.toString());
        }
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۙ */
    public final void mo285(String str) {
        int i = LogFactory.f216;
        m295(LogFactory.Level.ERROR, str, null);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۙ */
    public final void mo286(String str, Exception exc) {
        int i = LogFactory.f216;
        m295(LogFactory.Level.DEBUG, str, exc);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo287() {
        int i = LogFactory.f216;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۤ */
    public final void mo288(String str) {
        int i = LogFactory.f216;
        m295(LogFactory.Level.INFO, str, null);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۤ */
    public final void mo289(String str, Exception exc) {
        int i = LogFactory.f216;
        m295(LogFactory.Level.WARN, str, exc);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ᩴ */
    public final void mo290(String str) {
        int i = LogFactory.f216;
        m295(LogFactory.Level.TRACE, str, null);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ᩷ */
    public final void mo291(String str) {
        int i = LogFactory.f216;
        m295(LogFactory.Level.DEBUG, str, null);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ᩷ */
    public final void mo292(String str, Exception exc) {
        int i = LogFactory.f216;
        m295(LogFactory.Level.ERROR, str, exc);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo293() {
        int i = LogFactory.f216;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ᩸ */
    public final void mo294(String str) {
        int i = LogFactory.f216;
        m295(LogFactory.Level.WARN, str, null);
    }
}
