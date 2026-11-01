package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B99D */
/* JADX INFO: loaded from: classes4.dex */
public final class C16534 extends Thread {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17239 f53114;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f53117 = new ArrayList();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f53115 = new StringBuilder();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f53116 = true;

    public C16534(C17239 c17239) {
        this.f53114 = c17239;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5950 m38911(long j) {
        start();
        if (j > 0) {
            try {
                join(j);
                this.f53116 = false;
            } catch (InterruptedException unused) {
            }
        }
        join();
        return new C5950(this.f53115.toString(), (String[]) this.f53117.toArray(new String[0]));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            m38909();
        } catch (IOException e) {
            m38910(e.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38909() throws IOException {
        C17239 c17239;
        loop0: while (true) {
            boolean z = this.f53116;
            c17239 = this.f53114;
            if (!z || c17239.f54920) {
                break;
            }
            if (c17239.f54921.ready()) {
                do {
                    String line = c17239.f54921.readLine();
                    if (line.equals("MT - End of command")) {
                        while (c17239.f54924.ready()) {
                            String line2 = c17239.f54924.readLine();
                            if (!line2.contains("unused DT entry")) {
                                m38910(line2);
                            }
                        }
                        break loop0;
                    }
                    this.f53117.add(line);
                } while (c17239.f54921.ready());
            } else if (c17239.f54924.ready()) {
                do {
                    String line3 = c17239.f54924.readLine();
                    if (!line3.contains("unused DT entry")) {
                        m38910(line3);
                    }
                } while (c17239.f54924.ready());
            }
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
            }
        }
        if (!this.f53116) {
            m38910("Read shell timeout.");
        }
        if (c17239.f54920) {
            m38910("Shell closed.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38910(String str) {
        String strTrim = str.trim();
        if (strTrim.length() > 0) {
            StringBuilder sb = this.f53115;
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(strTrim);
        }
    }
}
