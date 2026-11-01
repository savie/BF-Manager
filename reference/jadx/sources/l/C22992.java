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

/* JADX INFO: renamed from: l.᩺۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 075F */
/* JADX INFO: loaded from: classes.dex */
public final class C22992 implements InterfaceC15785 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15785 f74731;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18758 f74732;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74733 = new ArrayList();

    public C22992(C18758 c18758) {
        this.f74732 = c18758;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final void mo11161(InterfaceC19706 interfaceC19706) {
        ArrayList arrayList = this.f74733;
        if (arrayList.contains(interfaceC19706)) {
            return;
        }
        arrayList.add(interfaceC19706);
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) throws IOException {
        InterfaceC15785 interfaceC15785Mo4000;
        if (this.f74731 != null) {
            throw new IOException("Data source is already open");
        }
        Uri uri = c12257.f41015;
        String scheme = uri.getScheme();
        String lowerCase = scheme == null ? "" : scheme.toLowerCase(Locale.ROOT);
        boolean zEquals = lowerCase.equals(a.s);
        C18758 c18758 = this.f74732;
        if (zEquals || lowerCase.equals(b.a)) {
            interfaceC15785Mo4000 = c18758.f60813.mo4000();
        } else if (lowerCase.equals("mt_media") && uri.getAuthority() == null && c18758.f60812 != null) {
            interfaceC15785Mo4000 = c18758.f60812.mo4000();
        } else {
            throw new IOException("Unsupported media URI scheme");
        }
        this.f74731 = interfaceC15785Mo4000;
        Iterator it = this.f74733.iterator();
        while (it.hasNext()) {
            this.f74731.mo11161((InterfaceC19706) it.next());
        }
        return this.f74731.mo9272(c12257);
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC15785 interfaceC15785 = this.f74731;
        if (interfaceC15785 == null) {
            throw new IOException("Data source is not open");
        }
        return interfaceC15785.read(bArr, i, i2);
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        InterfaceC15785 interfaceC15785 = this.f74731;
        if (interfaceC15785 == null) {
            return null;
        }
        return interfaceC15785.mo9274();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final Map mo9273() {
        InterfaceC15785 interfaceC15785 = this.f74731;
        return interfaceC15785 == null ? Collections.EMPTY_MAP : interfaceC15785.mo9273();
    }

    @Override // l.InterfaceC15785
    public final void close() {
        InterfaceC15785 interfaceC15785 = this.f74731;
        if (interfaceC15785 != null) {
            try {
                interfaceC15785.close();
            } finally {
                this.f74731 = null;
            }
        }
    }
}
