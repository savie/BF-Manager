package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.᩷۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4GC */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC22060 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f71136;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo1658();

    public AbstractRunnableC22060(String str, Object... objArr) {
        byte[] bArr = C19822.f63715;
        this.f71136 = String.format(Locale.US, str, objArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f71136);
        try {
            mo1658();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
