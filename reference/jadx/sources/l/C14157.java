package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۬᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes4.dex */
public final class C14157 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f44752;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Thread[] f44753;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8937 f44754;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f44755;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3938 f44756;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17536 f44757;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f44759;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f44760;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f44761;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f44762;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f44763;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C14069 f44764;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f44765;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21772 f44767;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C10671 f44768;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Object f44758 = new Object();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18633[] f44766 = new C18633[16];

    public C14157(C21772 c21772, C14069 c14069, C10671 c10671, C8937 c8937, int i, C17536 c17536, ArrayList arrayList, int i2, int i3, int i4, C3938 c3938, AtomicBoolean atomicBoolean) {
        this.f44767 = c21772;
        this.f44764 = c14069;
        this.f44768 = c10671;
        this.f44754 = c8937;
        this.f44761 = i;
        this.f44757 = c17536;
        this.f44759 = arrayList;
        this.f44755 = i2;
        this.f44752 = i2;
        this.f44763 = i3;
        this.f44756 = c3938;
        this.f44765 = atomicBoolean;
        Thread[] threadArr = new Thread[i4];
        this.f44753 = threadArr;
        int i5 = 0;
        while (i5 < i4) {
            final C4618 c4618 = new C4618(this.f44768);
            Runnable runnable = new Runnable() { // from class: l.ۜ᩹ۚ
                @Override // java.lang.Runnable
                public final void run() {
                    C14157.m34380(this.f24502, c4618);
                }
            };
            StringBuilder sb = new StringBuilder("MT MCP Smali Search #");
            int i6 = i5 + 1;
            sb.append(i6);
            Thread thread = new Thread(runnable, sb.toString());
            threadArr[i5] = thread;
            thread.start();
            i5 = i6;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m34385() {
        do {
            synchronized (this.f44758) {
                if (this.f44752 >= this.f44763) {
                    this.f44760 = true;
                    this.f44758.notifyAll();
                    return false;
                }
            }
        } while (!C21772.m49365(this.f44754, this.f44761, m34383()));
        m34382();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34380(C14157 c14157, C4618 c4618) {
        int i;
        int i2;
        while (true) {
            synchronized (c14157.f44758) {
                while (true) {
                    if (c14157.f44762 || c14157.f44760 || (i2 = c14157.f44755) >= c14157.f44763) {
                        i = -1;
                        break;
                    }
                    if (i2 < c14157.f44752 + 16) {
                        c14157.f44755 = i2 + 1;
                        i = i2;
                        break;
                    } else {
                        Object obj = c14157.f44758;
                        try {
                            obj.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            c14157.f44762 = true;
                            obj.notifyAll();
                        }
                    }
                }
            }
            if (i < 0) {
                return;
            } else {
                c14157.m34381(c14157.f44767.m49347(c14157.f44764, c14157.f44768, c14157.f44757, c14157.f44759, c4618, i, 0, c14157.f44756, c14157.f44765));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34381(C18633 c18633) {
        boolean z;
        synchronized (this.f44758) {
            int i = c18633.f60589 % 16;
            while (true) {
                z = this.f44762;
                if (z || this.f44766[i] == null) {
                    break;
                }
                Object obj = this.f44758;
                try {
                    obj.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    this.f44762 = true;
                    obj.notifyAll();
                }
            }
            if (z) {
                return;
            }
            this.f44766[i] = c18633;
            if (c18633.f60591 != null) {
                this.f44760 = true;
            }
            this.f44758.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C18633 m34383() {
        C18633 c18633;
        synchronized (this.f44758) {
            while (true) {
                int i = this.f44752;
                int i2 = i % 16;
                C18633[] c18633Arr = this.f44766;
                c18633 = c18633Arr[i2];
                if (c18633 != null) {
                    if (c18633.f60589 != i) {
                        throw C10186.m26305("SMALI_READ_FAILED", "Smali search result window is out of order");
                    }
                    c18633Arr[i2] = null;
                    this.f44752 = i + 1;
                    this.f44758.notifyAll();
                } else {
                    if (this.f44762) {
                        throw C10186.m26305("SMALI_READ_FAILED", "Smali search worker stopped");
                    }
                    try {
                        this.f44758.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw C10186.m26305("SMALI_READ_FAILED", "Interrupted while searching smali");
                    }
                }
            }
        }
        return c18633;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m34382() {
        synchronized (this.f44758) {
            this.f44760 = true;
            this.f44758.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34384() {
        synchronized (this.f44758) {
            this.f44762 = true;
            this.f44760 = true;
            this.f44758.notifyAll();
        }
        for (Thread thread : this.f44753) {
            if (thread != null) {
                boolean z = false;
                while (true) {
                    try {
                        thread.join();
                        break;
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
