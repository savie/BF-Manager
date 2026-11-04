package l;

import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ۘܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X95L */
/* JADX INFO: loaded from: classes2.dex */
public final class C4296 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f15576 = new Object();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f15577;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile Logger f15578;

    public C4296(Class cls) {
        this.f15577 = cls.getName();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Logger m13672() {
        Logger logger = this.f15578;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f15576) {
            Logger logger2 = this.f15578;
            if (logger2 != null) {
                return logger2;
            }
            this.f15578 = Logger.getLogger(this.f15577);
            return this.f15578;
        }
    }
}
