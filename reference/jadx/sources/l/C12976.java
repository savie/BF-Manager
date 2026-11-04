package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B99D */
/* JADX INFO: loaded from: classes4.dex */
public final class C12976 extends Thread {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1790 f41608;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f41609 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f41607 = new StringBuilder();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f41606 = true;

    public C12976(C1790 c1790) {
        this.f41608 = c1790;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11484 m32390(long j) {
        start();
        if (j > 0) {
            try {
                join(j);
                this.f41606 = false;
            } catch (InterruptedException unused) {
            }
        }
        join();
        return new C11484(this.f41607.toString(), (String[]) this.f41609.toArray(new String[0]));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            m32388();
        } catch (IOException e) {
            m32389(e.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32388() throws IOException {
        C1790 c1790;
        loop0: while (true) {
            boolean z = this.f41606;
            c1790 = this.f41608;
            if (!z || c1790.f6110) {
                break;
            }
            if (c1790.f6115.ready()) {
                do {
                    String line = c1790.f6115.readLine();
                    if (line.equals("MT - End of command")) {
                        while (c1790.f6116.ready()) {
                            String line2 = c1790.f6116.readLine();
                            if (!line2.contains("unused DT entry")) {
                                m32389(line2);
                            }
                        }
                        break loop0;
                    }
                    this.f41609.add(line);
                } while (c1790.f6115.ready());
            } else if (c1790.f6116.ready()) {
                do {
                    String line3 = c1790.f6116.readLine();
                    if (!line3.contains("unused DT entry")) {
                        m32389(line3);
                    }
                } while (c1790.f6116.ready());
            }
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
            }
        }
        if (!this.f41606) {
            m32389("Read shell timeout.");
        }
        if (c1790.f6110) {
            m32389("Shell closed.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32389(String str) {
        String strTrim = str.trim();
        if (strTrim.length() > 0) {
            StringBuilder sb = this.f41607;
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(strTrim);
        }
    }
}
