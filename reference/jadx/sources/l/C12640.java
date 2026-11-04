package l;

import android.net.Uri;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 075F */
/* JADX INFO: loaded from: classes4.dex */
public final class C12640 implements InterfaceC13433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC13433 f40553;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14877 f40554;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f40555 = new ArrayList();

    public C12640(C14877 c14877) {
        this.f40554 = c14877;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final void mo10894(InterfaceC4639 interfaceC4639) {
        ArrayList arrayList = this.f40555;
        if (arrayList.contains(interfaceC4639)) {
            return;
        }
        arrayList.add(interfaceC4639);
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws IOException {
        InterfaceC13433 interfaceC13433Mo3996;
        if (this.f40553 != null) {
            throw new IOException("Data source is already open");
        }
        Uri uri = c25368.f81907;
        String scheme = uri.getScheme();
        String lowerCase = scheme == null ? "" : scheme.toLowerCase(Locale.ROOT);
        boolean zEquals = lowerCase.equals(a.s);
        C14877 c14877 = this.f40554;
        if (zEquals || lowerCase.equals(b.a)) {
            interfaceC13433Mo3996 = c14877.f48613.mo3996();
        } else if (lowerCase.equals("mt_media") && uri.getAuthority() == null && c14877.f48612 != null) {
            interfaceC13433Mo3996 = c14877.f48612.mo3996();
        } else {
            throw new IOException("Unsupported media URI scheme");
        }
        this.f40553 = interfaceC13433Mo3996;
        Iterator it = this.f40555.iterator();
        while (it.hasNext()) {
            this.f40553.mo10894((InterfaceC4639) it.next());
        }
        return this.f40553.mo8326(c25368);
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC13433 interfaceC13433 = this.f40553;
        if (interfaceC13433 == null) {
            throw new IOException("Data source is not open");
        }
        return interfaceC13433.read(bArr, i, i2);
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        InterfaceC13433 interfaceC13433 = this.f40553;
        if (interfaceC13433 == null) {
            return null;
        }
        return interfaceC13433.mo8327();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final Map mo10893() {
        InterfaceC13433 interfaceC13433 = this.f40553;
        return interfaceC13433 == null ? Collections.EMPTY_MAP : interfaceC13433.mo10893();
    }

    @Override // l.InterfaceC13433
    public final void close() {
        InterfaceC13433 interfaceC13433 = this.f40553;
        if (interfaceC13433 != null) {
            try {
                interfaceC13433.close();
            } finally {
                this.f40553 = null;
            }
        }
    }
}
