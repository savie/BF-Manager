package l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import bin.mt.plus.R;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.᩹᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes.dex */
public final class C23802 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7239 f77093;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f77094;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public CharSequence f77095;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11555 f77096;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15508 f77097;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f77098;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77099;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Charset f77100;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f77101;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16320 f77102;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f77103;

    public C23802(C24132 c24132, C16320 c16320, int[] iArr, ActivityC18143 activityC18143, Charset charset, int i) {
        this.f77101 = c24132;
        this.f77102 = c16320;
        this.f77094 = iArr;
        this.f77103 = activityC18143;
        this.f77100 = charset;
        this.f77099 = i;
        this.f77096 = C11555.m29069(c24132);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C13950 c13950;
        this.f77097 = this.f77101.m54021().mo15337();
        C16320 c16320 = this.f77102;
        if (c16320 != null && (c13950 = c16320.f52982) != null && c13950.m34016() > 1) {
            int[] iArr = this.f77094;
            if (iArr[0] == iArr[1]) {
                this.f77093 = c16320.f52982.m34009(c16320.f52991, this.f77097, c16320.f52985.f20454);
            }
        }
        m8190(this.f77103);
        this.f7780.m33188(new RunnableC17834(0, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m53104(C23802 c23802) {
        c23802.f77098 = true;
        c23802.m8196();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        OutputStreamWriter outputStreamWriter;
        int i;
        Charset charset = this.f77100;
        C15508 c15508 = this.f77097;
        try {
            if (this.f77098) {
                throw new CancellationException("Text statistics canceled");
            }
            c15508.m37180(new Runnable() { // from class: l.ܶ᩶᩸
                @Override // java.lang.Runnable
                public final void run() {
                    if (this.f53080.f77098) {
                        throw new CancellationException("Text statistics canceled");
                    }
                }
            });
            int[] iArr = this.f77094;
            int i2 = iArr[0];
            int length = iArr[1];
            boolean z = i2 != length;
            if (!z) {
                i2 = 0;
            }
            if (!z) {
                length = c15508.length();
            }
            int i3 = length;
            if (this.f77093 == null) {
                this.f77095 = C12613.m31330(c15508, i2, i3, this.f77100, this.f77099, new Runnable() { // from class: l.ܶ᩶᩸
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (this.f53080.f77098) {
                            throw new CancellationException("Text statistics canceled");
                        }
                    }
                }, null, null, true).m47622();
            } else {
                C20818 c20818 = new C20818(0L, 0L, 0L, 0L, 1L, 0);
                C6648 c6648 = new C6648();
                C3664 c3664 = new C3664();
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(c3664, charset);
                C20818 c20818M47623 = c20818;
                int i4 = 0;
                while (i4 < this.f77093.f23872.m34016()) {
                    try {
                        if (this.f77098) {
                            throw new CancellationException("Text statistics canceled");
                        }
                        if (i4 == this.f77093.m19853()) {
                            int i5 = i4;
                            C20818 c20819 = c20818M47623;
                            outputStreamWriter = outputStreamWriter2;
                            try {
                                C20818 c20818M31330 = C12613.m31330(c15508, 0, c15508.length(), this.f77100, this.f77099, new Runnable() { // from class: l.ܶ᩶᩸
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        if (this.f53080.f77098) {
                                            throw new CancellationException("Text statistics canceled");
                                        }
                                    }
                                }, c6648, outputStreamWriter2, true);
                                this.f77095 = c20818M31330.m47622();
                                c20818M47623 = c20819.m47623(c20818M31330);
                                i = i5;
                            } catch (Throwable th) {
                                th = th;
                            }
                        } else {
                            C20818 c208110 = c20818M47623;
                            outputStreamWriter = outputStreamWriter2;
                            i = i4;
                            C15508 c15508M19854 = this.f77093.m19854(i);
                            try {
                                c15508M19854.m37180(new Runnable() { // from class: l.ܶ᩶᩸
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        if (this.f53080.f77098) {
                                            throw new CancellationException("Text statistics canceled");
                                        }
                                    }
                                });
                                C20818 c20818M47624 = c208110.m47623(C12613.m31330(c15508M19854, 0, c15508M19854.length(), this.f77100, this.f77099, new Runnable() { // from class: l.ܶ᩶᩸
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        if (this.f53080.f77098) {
                                            throw new CancellationException("Text statistics canceled");
                                        }
                                    }
                                }, c6648, outputStreamWriter, false));
                                c15508M19854.close();
                                c20818M47623 = c20818M47624;
                            } catch (Throwable th2) {
                                try {
                                    c15508M19854.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                        i4 = i + 1;
                        outputStreamWriter2 = outputStreamWriter;
                    } catch (Throwable th4) {
                        th = th4;
                        outputStreamWriter = outputStreamWriter2;
                    }
                    Throwable th5 = th;
                    try {
                        outputStreamWriter.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
                C20818 c208111 = c20818M47623;
                outputStreamWriter2.close();
                C20818 c208112 = new C20818(((c208111.f66661 - 1) * ((long) (this.f77099 - "\n".getBytes(charset).length))) + c3664.f12539, c208111.f66660, c6648.m18587(), c208111.f66658, c208111.f66661, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String strM49088 = C21576.m49088(R.string.MT_Protector);
                StyleSpan styleSpan = new StyleSpan(1);
                RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(1.05f);
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) strM49088);
                spannableStringBuilder.setSpan(styleSpan, length2, spannableStringBuilder.length(), 17);
                spannableStringBuilder.setSpan(relativeSizeSpan, length2, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append((CharSequence) "\n").append(this.f77095);
                AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(4, true);
                int length3 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) "\n \n");
                spannableStringBuilder.setSpan(absoluteSizeSpan, length3, spannableStringBuilder.length(), 17);
                String strM49089 = C21576.m49088(R.string.MT_Protector);
                StyleSpan styleSpan2 = new StyleSpan(1);
                RelativeSizeSpan relativeSizeSpan2 = new RelativeSizeSpan(1.05f);
                int length4 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) strM49089);
                spannableStringBuilder.setSpan(styleSpan2, length4, spannableStringBuilder.length(), 17);
                spannableStringBuilder.setSpan(relativeSizeSpan2, length4, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) c208112.m47622());
                this.f77095 = spannableStringBuilder;
            }
            c15508.close();
        } catch (Throwable th7) {
            if (c15508 == null) {
                throw th7;
            }
            try {
                c15508.close();
                throw th7;
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
                throw th7;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f77098 || !this.f77096.m29071()) {
            return;
        }
        C2361 c2361BuildDialog = this.f77103.buildDialog();
        int[] iArr = this.f77094;
        c2361BuildDialog.m8021(iArr[0] != iArr[1] ? R.string.MT_Protector : R.string.MT_Protector);
        c2361BuildDialog.m8008(this.f77095);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        C5416.m16141(c2361BuildDialog.m8016());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f77098 || !this.f77096.m29071()) {
            return;
        }
        this.f77103.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C15508 c15508 = this.f77097;
        if (c15508 != null) {
            c15508.close();
        }
        C7239 c7239 = this.f77093;
        if (c7239 != null) {
            c7239.close();
        }
        m8196();
    }
}
