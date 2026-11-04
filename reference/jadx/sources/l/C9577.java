package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9577 extends AbstractC7629 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C19274 f31006;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f31007;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f31008;

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ᩷ */
    public final String mo20842() {
        return "compress";
    }

    public C9577(String str) {
        this.f31008 = C14584.m35193(str, new String[0]);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20837(boolean z) {
        long jM55974;
        EnumC25110 enumC25110;
        AbstractC22044 abstractC22044 = this.f31008;
        C13961 c13961M49855 = abstractC22044.m49855("r");
        try {
            byte[] bArrM55973 = EnumC25110.m55973();
            int i = 0;
            int iMo34032 = c13961M49855.mo34032(0, bArrM55973.length, bArrM55973);
            String strM49874 = abstractC22044.m49874();
            long jMo4285 = abstractC22044.mo4285();
            long jMo4286 = abstractC22044.mo4286();
            EnumC25110[] enumC25110ArrValues = EnumC25110.values();
            int length = enumC25110ArrValues.length;
            while (true) {
                if (i >= length) {
                    jM55974 = -1;
                    enumC25110 = null;
                    break;
                }
                EnumC25110 enumC25111 = enumC25110ArrValues[i];
                if (enumC25111.m55977(bArrM55973, iMo34032)) {
                    jM55974 = enumC25111.m55974(c13961M49855);
                    enumC25110 = enumC25111;
                    break;
                }
                i++;
            }
            long j = jM55974;
            if (enumC25110 == null) {
                throw new IOException("Unknown format file: " + abstractC22044.mo4294());
            }
            this.f31006 = new C19274(strM49874, j, jMo4285, jMo4286, enumC25110);
            this.f31007 = jMo4286;
            c13961M49855.close();
        } catch (Throwable th) {
            try {
                c13961M49855.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo20829(AbstractActivityC17204 abstractActivityC17204, InterfaceC2386 interfaceC2386) throws IOException {
        InputStream inputStreamMo4290 = this.f31008.mo4290();
        try {
            return ((C19274) interfaceC2386).m44620().m55975(inputStreamMo4290);
        } catch (IOException e) {
            inputStreamMo4290.close();
            throw e;
        }
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final C23838 mo20832(InterfaceC2386 interfaceC2386) throws IOException {
        AbstractC22044 abstractC22044 = this.f31008;
        C3374 c3374 = new C3374(abstractC22044.mo4285());
        C1375 c1375 = new C1375(abstractC22044.mo4290(), c3374);
        try {
            return new C23838(((C19274) interfaceC2386).m44620().m55975(c1375), c3374, false);
        } catch (IOException e) {
            c1375.close();
            throw e;
        }
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20836(AbstractActivityC17204 abstractActivityC17204, InterfaceC2386 interfaceC2386, InterfaceC6116 interfaceC6116) throws IOException {
        C23838 c23838Mo20832 = mo20832(interfaceC2386);
        try {
            c23838Mo20832.m53163().m11078(new C5087(3, interfaceC6116));
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            do {
                int i = c23838Mo20832.read(bArr);
                if (i == -1) {
                    c23838Mo20832.close();
                    return;
                }
                interfaceC6116.mo17644(i, bArr);
            } while (!interfaceC6116.mo924());
            c23838Mo20832.close();
        } catch (Throwable th) {
            try {
                c23838Mo20832.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2386 mo20831(String str) {
        if (this.f31006 == null) {
            mo20837(false);
        }
        C19274 c19274 = this.f31006;
        if (c19274 == null || !str.equals(c19274.getPath())) {
            return null;
        }
        return this.f31006;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20833(MessageDigest messageDigest) {
        messageDigest.update("compress".getBytes());
        C15022.m36176(messageDigest, this.f31008.mo4294());
        messageDigest.update(String.valueOf(this.f31007).getBytes());
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo20830(String str, boolean z) {
        if (this.f31006 == null) {
            mo20837(false);
        }
        ArrayList arrayList = new ArrayList(2);
        if (this.f31006 != null && (str.isEmpty() || str.equals("/"))) {
            arrayList.add(this.f31006);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C19274 m25013() {
        return this.f31006;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20835(C6178 c6178) {
        c6178.m17800(this.f31008.mo4294());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m25014() {
        return this.f31008.mo4294();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m25012() {
        return this.f31008;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m25011() {
        return this.f31007 != this.f31008.mo4286();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m25015() {
        return this.f31008.mo2934();
    }
}
