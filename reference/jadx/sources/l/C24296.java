package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 24MP */
/* JADX INFO: loaded from: classes2.dex */
public final class C24296 extends AbstractC20105 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C8632 f78633;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7887[] f78634;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC21094 f78635;

    public C24296(AbstractC22044 abstractC22044) {
        this(abstractC22044.m49865());
    }

    public C24296(InputStream inputStream) {
        this(new C3194(C20244.m46522(inputStream, 0)));
    }

    public C24296(byte[] bArr) {
        this(new C3194(bArr));
    }

    public C24296(AbstractC21094 abstractC21094) throws Exception {
        int i;
        this.f78635 = abstractC21094;
        try {
            C16618 c16618M48157 = abstractC21094.m48157(C9311.m24535(abstractC21094.m48157(0)).f30252);
            while (c16618M48157.m39305() >= 8) {
                C9311 c9311M24535 = C9311.m24535(c16618M48157);
                int i2 = c9311M24535.f30250;
                if (c9311M24535.f30253 == 1) {
                    c16618M48157.m39317(-8);
                    break;
                }
                int i3 = c9311M24535.f30252;
                if (i3 < 8 || i2 < i3 || (i = i2 - 8) > c16618M48157.m39305()) {
                    throw new IOException("Invalid chunk size before string pool at offset " + c9311M24535.f30251);
                }
                c16618M48157.m39317(i);
            }
            this.f78633 = new C8632(c16618M48157);
            this.f64598 = C10057.m25988(abstractC21094, c16618M48157.m39314());
            int iMo10513 = abstractC21094.mo10513(8);
            iMo10513 = iMo10513 < 0 ? 10 : iMo10513;
            ArrayList arrayList = new ArrayList(iMo10513);
            for (int i4 = 0; i4 < iMo10513; i4++) {
                try {
                    arrayList.add(new C7887(this, c16618M48157));
                } catch (C24824 e) {
                    throw e;
                } catch (Exception e2) {
                    if (i4 == 0) {
                        throw e2;
                    }
                    if (c16618M48157.m39305() <= 0) {
                        this.f78634 = (C7887[]) arrayList.toArray(new C7887[0]);
                    }
                }
            }
            this.f78634 = (C7887[]) arrayList.toArray(new C7887[0]);
        } catch (C24824 e3) {
            throw e3.getCause();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54312(OutputStream outputStream) throws IOException {
        this.f78635.mo10512(outputStream);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m54313() {
        this.f78633.m23268();
        for (C7887 c7887 : this.f78634) {
            c7887.f26231.m23268();
        }
    }

    @Override // l.InterfaceC7206
    /* JADX INFO: renamed from: ۫᩷ */
    public final InterfaceC3412 mo15675() {
        return this.f78633;
    }

    @Override // l.InterfaceC7206
    /* JADX INFO: renamed from: ۫᩷ */
    public final C8632 mo15675() {
        return this.f78633;
    }

    @Override // l.InterfaceC7206
    /* JADX INFO: renamed from: ۨ */
    public final int mo15674() {
        return this.f78634.length;
    }

    @Override // l.InterfaceC7206
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC10869 mo15673(int i) {
        return this.f78634[i];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m54314() {
        C23001 c23001M51886 = C23001.m51886();
        for (C7887 c7887 : this.f78634) {
            c23001M51886.m51891(c7887.mo27607(), c7887.getPackageName());
        }
    }
}
