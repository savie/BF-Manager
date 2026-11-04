package l;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۬֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L73O */
/* JADX INFO: loaded from: classes4.dex */
public final class C13501 implements InterfaceC13433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f42926;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C25368 f42927;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC13433 f42930;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4792 f42931;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f42929 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f42928 = -1;

    public C13501(C4792 c4792) {
        this.f42931 = c4792;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final void mo10894(InterfaceC4639 interfaceC4639) {
        ArrayList arrayList = this.f42929;
        if (arrayList.contains(interfaceC4639)) {
            return;
        }
        arrayList.add(interfaceC4639);
        InterfaceC13433 interfaceC13433 = this.f42930;
        if (interfaceC13433 != null) {
            interfaceC13433.mo10894(interfaceC4639);
        }
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws IOException {
        if (this.f42930 != null) {
            throw new IOException("Data source is already open");
        }
        C4792 c4792 = this.f42931;
        long jM55226 = c4792.f16790.m55226();
        InterfaceC13433 interfaceC13433Mo3996 = (jM55226 >= 0 ? c4792.f16789 : c4792.f16791).mo3996();
        this.f42930 = interfaceC13433Mo3996;
        this.f42927 = c25368;
        this.f42926 = 0L;
        this.f42928 = jM55226;
        Iterator it = this.f42929.iterator();
        while (it.hasNext()) {
            interfaceC13433Mo3996.mo10894((InterfaceC4639) it.next());
        }
        return (jM55226 < 0 || c4792.f16790.m55228(jM55226)) ? interfaceC13433Mo3996.mo8326(c25368) : m33172();
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        InterfaceC13433 interfaceC13433 = this.f42930;
        if (interfaceC13433 == null) {
            throw new IOException("Data source is not open");
        }
        if (this.f42928 >= 0 && !this.f42931.f16790.m55228(this.f42928)) {
            C25368 c25368 = this.f42927;
            if (c25368 != null) {
                long j = c25368.f81910;
                if (j != -1 && this.f42926 >= j) {
                    return -1;
                }
            }
            m33172();
            interfaceC13433 = this.f42930;
        }
        int i3 = interfaceC13433.read(bArr, i, i2);
        if (i3 > 0) {
            this.f42926 += (long) i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private long m33172() throws IOException {
        C25368 c25368 = this.f42927;
        if (c25368 == null) {
            throw new IOException("HLS media data spec is missing");
        }
        InterfaceC13433 interfaceC13433 = this.f42930;
        if (interfaceC13433 != null) {
            try {
                interfaceC13433.close();
            } catch (IOException | RuntimeException unused) {
            }
        }
        InterfaceC13433 interfaceC13433Mo3996 = this.f42931.f16791.mo3996();
        this.f42930 = interfaceC13433Mo3996;
        this.f42928 = -1L;
        Iterator it = this.f42929.iterator();
        while (it.hasNext()) {
            interfaceC13433Mo3996.mo10894((InterfaceC4639) it.next());
        }
        long j = this.f42926;
        long j2 = c25368.f81910;
        return interfaceC13433Mo3996.mo8326(c25368.m56735(j, j2 != -1 ? j2 - j : -1L));
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        InterfaceC13433 interfaceC13433 = this.f42930;
        if (interfaceC13433 == null) {
            return null;
        }
        return interfaceC13433.mo8327();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final Map mo10893() {
        InterfaceC13433 interfaceC13433 = this.f42930;
        return interfaceC13433 == null ? Collections.EMPTY_MAP : interfaceC13433.mo10893();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC13433
    public final void close() {
        InterfaceC13433 interfaceC13433 = this.f42930;
        if (interfaceC13433 != null) {
            try {
                interfaceC13433.close();
            } finally {
                this.f42930 = null;
                this.f42927 = null;
                this.f42926 = 0L;
                this.f42928 = -1L;
            }
        }
    }
}
