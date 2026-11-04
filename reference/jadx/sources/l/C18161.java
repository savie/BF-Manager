package l;

import bin.mt.plus.R;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ܿۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6626 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18161 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f59368;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C1442 f59369;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C19143 f59370;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC19341 f59371;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f59372;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f59373;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f59374;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f59375;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f59376;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C16028 f59377;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f59378;

    public C18161(ViewOnClickListenerC19341 viewOnClickListenerC19341, String str, boolean z, boolean z2) {
        this.f59371 = viewOnClickListenerC19341;
        this.f59368 = viewOnClickListenerC19341.f62495;
        this.f59373 = str;
        this.f59374 = z;
        this.f59375 = z2;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        boolean z = this.f59375;
        int i = R.string.MT_Protector;
        ViewOnClickListenerC19341 viewOnClickListenerC19341 = this.f59371;
        if (z) {
            try {
                m8191(viewOnClickListenerC19341, R.string.MT_Protector);
            } catch (RuntimeException unused) {
            }
        } else {
            if (!this.f59374) {
                i = R.string.MT_Protector;
            }
            m8191(viewOnClickListenerC19341, i);
            this.f7780.m33188((Runnable) null);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo8198() {
        return this.f59375;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [l.᩶ۜᩴ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.᩶ۜᩴ] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        AbstractC22044 abstractC22044 = this.f59368;
        if (C1008.m3907(abstractC22044.mo4294(), new BooleanSupplier() { // from class: l.ܰۜᩴ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return this.f45437.m42338();
            }
        })) {
            boolean z = this.f59374;
            String str = this.f59373;
            if (!z) {
                C16028.m38155(str);
            }
            if (str != null) {
                ViewOnClickListenerC19341 viewOnClickListenerC19341 = this.f59371;
                C16028 c16028M38153 = null;
                try {
                    c16028M38153 = C16028.m38153(str, (C21145) new InterfaceC7509() { // from class: l.᩶ۜᩴ
                        @Override // l.InterfaceC7509
                        /* JADX INFO: renamed from: ۫ */
                        public final boolean mo924() {
                            return this.f67531.m42338();
                        }
                    });
                    C1950 c1950M29265 = C11644.m29265(c16028M38153, abstractC22044, (C21145) new InterfaceC7509() { // from class: l.᩶ۜᩴ
                        @Override // l.InterfaceC7509
                        /* JADX INFO: renamed from: ۫ */
                        public final boolean mo924() {
                            return this.f67531.m42338();
                        }
                    });
                    this.f59377 = c16028M38153;
                    C19143 c19143 = c1950M29265.f6548;
                    this.f59370 = c19143;
                    c19143.m44364(viewOnClickListenerC19341.getCacheDir());
                    this.f59369 = c1950M29265.f6549;
                    this.f59372 = c1950M29265.f6546;
                    this.f59376 = c1950M29265.f6547;
                    return;
                } catch (Exception e) {
                    if (this.f59375 && !(e instanceof C9446) && viewOnClickListenerC19341.m44760()) {
                        this.f59378 = true;
                    } else if (c16028M38153 != null && !viewOnClickListenerC19341.m44751(c16028M38153)) {
                        try {
                            c16028M38153.m38188();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    } else if (c16028M38153 == null) {
                        C16028.m38156(str, e);
                    }
                    if (this.f59378) {
                        return;
                    }
                }
            }
            if (m42338()) {
                return;
            }
            if (!abstractC22044.m49833() && (!abstractC22044.mo4297() || !abstractC22044.mo4304())) {
                throw new IOException("File can not be read");
            }
            try {
                m42337();
            } catch (C9446 unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m42337() throws Throwable {
        Throwable th;
        C13111 c13111M32574;
        if (m42338()) {
            return;
        }
        C1442 c1442M5187 = C1442.m5187(this.f59368);
        this.f59369 = c1442M5187;
        AbstractC22044 abstractC22044M5193 = c1442M5187.m5193();
        boolean z = false;
        boolean z2 = abstractC22044M5193.mo4295() && !abstractC22044M5193.m49833();
        this.f59372 = z2;
        try {
            if (z2) {
                c13111M32574 = C13111.m32576(abstractC22044M5193.mo4275());
                try {
                    if (!this.f59369.m5194().equals(c13111M32574.m32577())) {
                        throw new C12893();
                    }
                    this.f59376 = c13111M32574.m32577().m18524() > ((long) c13111M32574.length());
                } catch (Throwable th2) {
                    th = th2;
                    if (c13111M32574 != null) {
                        c13111M32574.close();
                    }
                    throw th;
                }
            } else {
                C16028 c16028M38166 = C16028.m38166();
                this.f59377 = c16028M38166;
                C1161 c1161M38189 = c16028M38166.m38189();
                BufferedInputStream bufferedInputStreamM49875 = abstractC22044M5193.m49875();
                try {
                    BufferedOutputStream bufferedOutputStreamM49869 = c1161M38189.m49869();
                    try {
                        byte[] bArr = new byte[262144];
                        long j = 0;
                        while (true) {
                            if (!m42338()) {
                                int i = bufferedInputStreamM49875.read(bArr, 0, j < 2147483647L ? (int) Math.min(262144, 2147483647L - j) : 1);
                                if (i < 0) {
                                    break;
                                }
                                if (i != 0) {
                                    long j2 = i;
                                    if (j2 > 2147483647L - j) {
                                        z = true;
                                        break;
                                    } else {
                                        bufferedOutputStreamM49869.write(bArr, 0, i);
                                        j += j2;
                                    }
                                }
                            } else {
                                throw new C9446();
                            }
                            try {
                                bufferedInputStreamM49875.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                            throw th;
                        }
                        bufferedOutputStreamM49869.close();
                        bufferedInputStreamM49875.close();
                        this.f59376 = z;
                        if (m42338()) {
                            return;
                        }
                        this.f59369.m5191();
                        c13111M32574 = C13111.m32574(c1161M38189);
                    } catch (Throwable th4) {
                        try {
                            bufferedOutputStreamM49869.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    bufferedInputStreamM49875.close();
                    throw th6;
                }
            }
            if (!m42338()) {
                this.f59370 = new C19143(c13111M32574, this.f59371.getCacheDir());
            } else {
                c13111M32574.close();
            }
        } catch (Throwable th7) {
            th = th7;
            c13111M32574 = null;
            if (c13111M32574 != null) {
                c13111M32574.close();
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C19143 c19143;
        boolean z = this.f59378;
        ViewOnClickListenerC19341 viewOnClickListenerC19341 = this.f59371;
        if (z) {
            viewOnClickListenerC19341.m44757();
            return;
        }
        if (m42338() || (c19143 = this.f59370) == null) {
            m42336();
            if (viewOnClickListenerC19341.m44753()) {
                return;
            }
            viewOnClickListenerC19341.finish();
            return;
        }
        this.f59371.m44749(c19143, this.f59377, this.f59369, this.f59372, this.f59376);
        this.f59370 = null;
        this.f59377 = null;
        if (viewOnClickListenerC19341.isFinishing() || viewOnClickListenerC19341.isDestroyed() || viewOnClickListenerC19341.mo44756() || C18978.m44078()) {
            return;
        }
        C22673.m51159(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        m42336();
        ViewOnClickListenerC19341 viewOnClickListenerC19341 = this.f59371;
        if (viewOnClickListenerC19341.isFinishing() || viewOnClickListenerC19341.isDestroyed()) {
            return;
        }
        viewOnClickListenerC19341.m40402((Throwable) exc, true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42336() {
        C19143 c19143 = this.f59370;
        if (c19143 != null) {
            try {
                c19143.close();
            } catch (IOException unused) {
            }
            this.f59370 = null;
        }
        C16028 c16028 = this.f59377;
        if (c16028 == null || this.f59371.m44751(c16028)) {
            return;
        }
        try {
            this.f59377.m38188();
        } catch (IOException unused2) {
        }
        this.f59377 = null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m42338() {
        if (this.f59371.m44754()) {
            return true;
        }
        C13511 c13511 = this.f7780;
        return c13511 != null && c13511.m33196();
    }
}
