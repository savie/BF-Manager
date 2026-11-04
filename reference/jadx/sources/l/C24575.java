package l;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 075F */
/* JADX INFO: loaded from: classes.dex */
public final class C24575 implements InterfaceC13433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f79650;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C24908 f79651;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4437 f79652;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC13433 f79653;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f79654 = new ArrayList();

    public C24575(C4437 c4437) {
        this.f79652 = c4437;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final void mo10894(InterfaceC4639 interfaceC4639) {
        ArrayList arrayList = this.f79654;
        if (arrayList.contains(interfaceC4639)) {
            return;
        }
        arrayList.add(interfaceC4639);
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws IOException {
        InterfaceC13433 c3691;
        if (this.f79653 != null || this.f79650) {
            throw new IOException("Data source is already open");
        }
        C24908 c24908M52615 = C23416.m52615(this.f79652.f15891, c25368.f81907, this.f79652.f15892, new C6675(this));
        this.f79651 = c24908M52615;
        if (this.f79650) {
            c24908M52615.close();
            throw new InterruptedIOException("HTTP media open was canceled");
        }
        String strM55490 = c24908M52615.m55490();
        if (strM55490 != null) {
            c3691 = new C3691(new C20845(this.f79652.f15891, this.f79652.f15892, new C11398(6, strM55490)));
        } else {
            c3691 = this.f79652.f15892.mo3996();
        }
        this.f79653 = c3691;
        if (this.f79650) {
            this.f79653 = null;
            c3691.close();
            c24908M52615.close();
            throw new InterruptedIOException("HTTP media open was canceled");
        }
        Iterator it = this.f79654.iterator();
        while (it.hasNext()) {
            c3691.mo10894((InterfaceC4639) it.next());
        }
        return c3691.mo8326(c25368);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m54893(C24575 c24575, C24908 c24908) {
        c24575.f79651 = c24908;
        if (c24575.f79650) {
            c24908.close();
        }
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC13433 interfaceC13433 = this.f79653;
        if (interfaceC13433 == null) {
            throw new IOException("Data source is not open");
        }
        return interfaceC13433.read(bArr, i, i2);
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        InterfaceC13433 interfaceC13433 = this.f79653;
        if (interfaceC13433 == null) {
            return null;
        }
        return interfaceC13433.mo8327();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final Map mo10893() {
        InterfaceC13433 interfaceC13433 = this.f79653;
        return interfaceC13433 == null ? Collections.EMPTY_MAP : interfaceC13433.mo10893();
    }

    @Override // l.InterfaceC13433
    public final void close() {
        this.f79650 = true;
        InterfaceC13433 interfaceC13433 = this.f79653;
        this.f79653 = null;
        if (interfaceC13433 != null) {
            try {
                interfaceC13433.close();
            } finally {
                C24908 c24908 = this.f79651;
                this.f79651 = null;
                if (c24908 != null) {
                    c24908.close();
                }
            }
        }
    }
}
