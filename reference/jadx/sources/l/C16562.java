package l;

import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ܽۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X95L */
/* JADX INFO: loaded from: classes4.dex */
public final class C16562 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f53191 = new Object();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f53192;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile Logger f53193;

    public C16562(Class cls) {
        this.f53192 = cls.getName();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Logger m38979() {
        Logger logger = this.f53193;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f53191) {
            Logger logger2 = this.f53193;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.f53192);
            this.f53193 = logger3;
            return logger3;
        }
    }
}
