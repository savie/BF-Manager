package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.᩷ۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R4GC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC20602 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f67119;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4299();

    public AbstractRunnableC20602(String str, Object... objArr) {
        byte[] bArr = C0140.f1168;
        this.f67119 = String.format(Locale.US, str, objArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f67119);
        try {
            mo4299();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
