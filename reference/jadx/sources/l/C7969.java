package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۠ۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes3.dex */
public final class C7969 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Object f26161 = new Object();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22080[] f26162 = new C22080[16];

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f26163;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17846 f26164;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f26165;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C4367 f26166;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Thread[] f26167;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6443 f26168;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f26169;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f26170;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f26171;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f26172;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8675 f26173;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C21956 f26174;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f26175;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f26176;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C1139 f26177;

    public C7969(C8675 c8675, C21956 c21956, C1139 c1139, C17846 c17846, int i, C4367 c4367, ArrayList arrayList, int i2, int i3, int i4, C6443 c6443, AtomicBoolean atomicBoolean) {
        this.f26173 = c8675;
        this.f26174 = c21956;
        this.f26177 = c1139;
        this.f26164 = c17846;
        this.f26171 = i;
        this.f26166 = c4367;
        this.f26176 = arrayList;
        this.f26169 = i2;
        this.f26163 = i2;
        this.f26165 = i3;
        this.f26168 = c6443;
        this.f26170 = atomicBoolean;
        Thread[] threadArr = new Thread[i4];
        this.f26167 = threadArr;
        int i5 = 0;
        while (i5 < i4) {
            final C19258 c19258 = new C19258(this.f26177);
            Runnable runnable = new Runnable() { // from class: l.ᩴۚ۬
                @Override // java.lang.Runnable
                public final void run() {
                    C7969.m21021(this.f59026, c19258);
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m21025() {
        do {
            synchronized (this.f26161) {
                if (this.f26163 >= this.f26165) {
                    this.f26172 = true;
                    this.f26161.notifyAll();
                    return false;
                }
            }
        } while (!C8675.m22488(this.f26164, this.f26171, m21020()));
        m21023();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21021(C7969 c7969, C19258 c19258) {
        int i;
        int i2;
        while (true) {
            synchronized (c7969.f26161) {
                while (true) {
                    if (c7969.f26175 || c7969.f26172 || (i2 = c7969.f26169) >= c7969.f26165) {
                        i = -1;
                        break;
                    }
                    if (i2 < c7969.f26163 + 16) {
                        c7969.f26169 = i2 + 1;
                        i = i2;
                        break;
                    } else {
                        Object obj = c7969.f26161;
                        try {
                            obj.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            c7969.f26175 = true;
                            obj.notifyAll();
                        }
                    }
                }
            }
            if (i < 0) {
                return;
            } else {
                c7969.m21022(c7969.f26173.m22473(c7969.f26174, c7969.f26177, c7969.f26166, c7969.f26176, c19258, i, 0, c7969.f26168, c7969.f26170));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21022(C22080 c22080) {
        boolean z;
        synchronized (this.f26161) {
            int i = c22080.f71531 % 16;
            while (true) {
                z = this.f26175;
                if (z || this.f26162[i] == null) {
                    break;
                }
                Object obj = this.f26161;
                try {
                    obj.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    this.f26175 = true;
                    obj.notifyAll();
                }
            }
            if (z) {
                return;
            }
            this.f26162[i] = c22080;
            if (c22080.f71533 != null) {
                this.f26172 = true;
            }
            this.f26161.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C22080 m21020() {
        C22080 c22080;
        synchronized (this.f26161) {
            while (true) {
                int i = this.f26163;
                int i2 = i % 16;
                C22080[] c22080Arr = this.f26162;
                c22080 = c22080Arr[i2];
                if (c22080 != null) {
                    if (c22080.f71531 != i) {
                        throw C12731.m31630("SMALI_READ_FAILED", "Smali search result window is out of order");
                    }
                    c22080Arr[i2] = null;
                    this.f26163 = i + 1;
                    this.f26161.notifyAll();
                } else {
                    if (this.f26175) {
                        throw C12731.m31630("SMALI_READ_FAILED", "Smali search worker stopped");
                    }
                    try {
                        this.f26161.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw C12731.m31630("SMALI_READ_FAILED", "Interrupted while searching smali");
                    }
                }
            }
        }
        return c22080;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m21023() {
        synchronized (this.f26161) {
            this.f26172 = true;
            this.f26161.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21024() {
        synchronized (this.f26161) {
            this.f26175 = true;
            this.f26172 = true;
            this.f26161.notifyAll();
        }
        for (Thread thread : this.f26167) {
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
